package com.techfar.service.duetbooklet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ContentPostgraduateRulesAndRegulationsDoctorActivity extends AppCompatActivity {
    TextView txt,topicHead;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_postgraduate_rules_and_regulations_doctor);


        topicHead=findViewById(R.id.topicTitle);
        txt=findViewById(R.id.RulesContent);
        final String[] DoctorRules = getResources().getStringArray(R.array.PostgraduateRulesAndRegulationsDoctor);
        final String[] DoctorRulesDetails = getResources().getStringArray(R.array.PostgraduateRulesAndRegulationsDoctorDetails);

        try {
            Intent intent=getIntent();
            Bundle bundle=intent.getExtras();
            if(bundle!=null) {
                String i = (String) bundle.get("index"); //index use as "key" for retrieve index value

                //Toast.makeText(ContentUndergraduateRulesAndRegulationsActivity.this, i, Toast.LENGTH_SHORT).show();
                String valueDoctorRules = DoctorRules[Integer.parseInt(i)];  //Retrieve title from array by index
                String valueDoctorRulesDetails = DoctorRulesDetails[Integer.parseInt(i)]; //retrieve details from array by index


                topicHead.setText(valueDoctorRules);
                txt.setText(valueDoctorRulesDetails);


            }

        }catch (Exception ex)
        {
            Toast.makeText(ContentPostgraduateRulesAndRegulationsDoctorActivity.this, (CharSequence) ex, Toast.LENGTH_SHORT).show();
        }




    }
}

package com.techfar.service.duetbooklet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ContentPostgraduateRulesAndRegulationsActivity extends AppCompatActivity {
    TextView txt,topicHead;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_postgraduate_rules_and_regulations);


        topicHead=findViewById(R.id.topicTitle);
        txt=findViewById(R.id.RulesContent);

        final String[] PGRules = getResources().getStringArray(R.array.PostgraduateRulesAndRegulations);
        final String[] PGRulesDetails = getResources().getStringArray(R.array.PostgraduateRulesAndRegulationsDetails);


        try {
            Intent intent=getIntent();
            Bundle bundle=intent.getExtras();
            if(bundle!=null) {
                String i = (String) bundle.get("index"); //index use as "key" for retrieve index value

                //Toast.makeText(ContentUndergraduateRulesAndRegulationsActivity.this, i, Toast.LENGTH_SHORT).show();
                String valuePGRules = PGRules[Integer.parseInt(i)];  //Retrieve title from array by index
                String valuePGRulesDetails = PGRulesDetails[Integer.parseInt(i)]; //retrieve details from array by index


                topicHead.setText(valuePGRules);
                txt.setText(valuePGRulesDetails);


            }

        }catch (Exception ex)
        {
            Toast.makeText(ContentPostgraduateRulesAndRegulationsActivity.this, (CharSequence) ex, Toast.LENGTH_SHORT).show();
        }
    }
}

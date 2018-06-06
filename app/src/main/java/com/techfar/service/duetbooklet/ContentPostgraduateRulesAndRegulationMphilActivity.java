package com.techfar.service.duetbooklet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ContentPostgraduateRulesAndRegulationMphilActivity extends AppCompatActivity {
    TextView txt,topicHead;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_postgraduate_rules_and_regulation_mphil);



        topicHead=findViewById(R.id.topicTitle);
        txt=findViewById(R.id.RulesContent);

        final String[] MphilRules = getResources().getStringArray(R.array.PostgraduateRulesAndRegulationsMphil);
        final String[] MphilRulesDetails = getResources().getStringArray(R.array.PostgraduateRulesAndRegulationsMphilDetails);
        try {
            Intent intent=getIntent();
            Bundle bundle=intent.getExtras();
            if(bundle!=null) {
                String i = (String) bundle.get("index"); //index use as "key" for retrieve index value

                //Toast.makeText(ContentUndergraduateRulesAndRegulationsActivity.this, i, Toast.LENGTH_SHORT).show();
                String valueMphilRules = MphilRules[Integer.parseInt(i)];  //Retrieve title from array by index
                String valueMphilRulesDetails = MphilRulesDetails[Integer.parseInt(i)]; //retrieve details from array by index


                topicHead.setText(valueMphilRules);
                txt.setText(valueMphilRulesDetails);


            }

        }catch (Exception ex)
        {
            Toast.makeText(ContentPostgraduateRulesAndRegulationMphilActivity.this, (CharSequence) ex, Toast.LENGTH_SHORT).show();
        }

    }
}

package com.techfar.service.duetbooklet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ContentPostgraduateRulesAndRegulationMscActivity extends AppCompatActivity {
    TextView txt,topicHead;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_postgraduate_rules_and_regulation_msc);


        topicHead=findViewById(R.id.topicTitle);
        txt=findViewById(R.id.RulesContent);

        final String[] MscRules = getResources().getStringArray(R.array.PostgraduateRulesAndRegulationsMsc);
        final String[] MscRulesDetails = getResources().getStringArray(R.array.PostgraduateRulesAndRegulationsMscDetails);

        try {
            Intent intent=getIntent();
            Bundle bundle=intent.getExtras();
            if(bundle!=null) {
                String i = (String) bundle.get("index"); //index use as "key" for retrieve index value

                //Toast.makeText(ContentUndergraduateRulesAndRegulationsActivity.this, i, Toast.LENGTH_SHORT).show();
                String valueMscRules = MscRules[Integer.parseInt(i)];  //Retrieve title from array by index
                String valueMscRulesDetails = MscRulesDetails[Integer.parseInt(i)]; //retrieve details from array by index


                topicHead.setText(valueMscRules);
                txt.setText(valueMscRulesDetails);


            }

        }catch (Exception ex)
        {
            Toast.makeText(ContentPostgraduateRulesAndRegulationMscActivity.this, (CharSequence) ex, Toast.LENGTH_SHORT).show();
        }

    }
}

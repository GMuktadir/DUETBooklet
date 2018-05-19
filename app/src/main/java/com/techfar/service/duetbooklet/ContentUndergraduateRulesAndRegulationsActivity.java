package com.techfar.service.duetbooklet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ContentUndergraduateRulesAndRegulationsActivity extends AppCompatActivity {
    TextView txt,topicHead;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_undergraduate_rules_and_regulations);
        topicHead=findViewById(R.id.topicTitle);
        txt=findViewById(R.id.RulesContent);

       final String[] UGRules = getResources().getStringArray(R.array.UndergraduateRulesAndRegulations);
       final String[] UGRulesDetails = getResources().getStringArray(R.array.UndergraduateRulesAndRegulationsDetails);



        try {
            Intent intent=getIntent();
            Bundle bundle=intent.getExtras();
            if(bundle!=null) {
                String i = (String) bundle.get("index"); //index use as "key" for retrieve index value

                //Toast.makeText(ContentUndergraduateRulesAndRegulationsActivity.this, i, Toast.LENGTH_SHORT).show();
                //String valueUGRules = UGRules[Integer.parseInt(i)];  //Retrieve title from array by index
                String valueUGRules = UGRules[Integer.parseInt(i)];  //Retrieve title from array by index
                String valueUGRulesDetails = UGRulesDetails[Integer.parseInt(i)]; //retrieve details from array by index


                topicHead.setText(valueUGRules);
                txt.setText(valueUGRulesDetails);


            }

        }catch (Exception ex)
        {
            Toast.makeText(ContentUndergraduateRulesAndRegulationsActivity.this, (CharSequence) ex, Toast.LENGTH_SHORT).show();
        }


    }
}

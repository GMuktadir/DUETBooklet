package com.techfar.service.duetbooklet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ContentUndergraduateRulesAndRegulationsActivity extends AppCompatActivity {
    TextView txt,topicHead;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_undergraduate_rules_and_regulations);
        txt=findViewById(R.id.RulesContent);
        topicHead=findViewById(R.id.topicTitle);
        str="1. Definitions";
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        //ContentUndergraduateRulesAndRegulationsActivity.setTitle("Definition");
        if(bundle!=null)
        {
            String st= (String) bundle.get(str);
            txt.setText(st);
            topicHead.setText(str);
        }

    }
}

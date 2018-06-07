package com.techfar.service.duetbooklet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ContentSyllabusMscDetails extends AppCompatActivity {
    PDFView pv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_syllabus_msc_details);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            String st = (String) bundle.get("post");
            if (st.equals("msc")) {
                pv = (PDFView) findViewById(R.id.SyllabusMscDetails);
                pv.fromAsset("csemscdetails.pdf").load();
            }
        }



    }
}

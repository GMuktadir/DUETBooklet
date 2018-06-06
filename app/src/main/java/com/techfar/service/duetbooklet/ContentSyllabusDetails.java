package com.techfar.service.duetbooklet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ContentSyllabusDetails extends AppCompatActivity {
    PDFView pv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_syllabus_details);

        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        if(bundle!=null) {
            String st = (String) bundle.get("year");

            if(st.equals("onetwo"))
            {
                pv=(PDFView) findViewById(R.id.SyllabusDetails);
                pv.fromAsset("csefirstyearsecondsem.pdf").load();
            }
            else if(st.equals("twoone"))
            {
                pv=(PDFView) findViewById(R.id.SyllabusDetails);
                pv.fromAsset("csesecondyearfirstsem.pdf").load();
            }
            else if(st.equals("twotwo"))
            {
                pv=(PDFView) findViewById(R.id.SyllabusDetails);
                pv.fromAsset("csesecondyearsecondsem.pdf").load();
            }
            else if(st.equals("threeone"))
            {
                pv=(PDFView) findViewById(R.id.SyllabusDetails);
                pv.fromAsset("csethirdyearfirstsem.pdf").load();
            }
            else if(st.equals("threetwo"))
            {
                pv=(PDFView) findViewById(R.id.SyllabusDetails);
                pv.fromAsset("csethirdyearsecondsem.pdf").load();
            }
            else if(st.equals("fourone"))
            {
                pv=(PDFView) findViewById(R.id.SyllabusDetails);
                pv.fromAsset("csefourthyearfirstsem.pdf").load();
            }
            else if(st.equals("fourtwo"))
            {
                pv=(PDFView) findViewById(R.id.SyllabusDetails);
                pv.fromAsset("csefourthyearsecondsem.pdf").load();
            }
        }
    }
}

package com.techfar.service.duetbooklet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ActActivity extends AppCompatActivity {
    PDFView act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act);

        act=(PDFView) findViewById(R.id.pdfact);
        act.fromAsset("duetact.pdf").load();
    }
}

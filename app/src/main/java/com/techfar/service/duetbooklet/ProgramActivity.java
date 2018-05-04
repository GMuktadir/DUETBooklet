package com.techfar.service.duetbooklet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ProgramActivity extends AppCompatActivity {
    private ListView lview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program);

       lview=findViewById(R.id.listviewpro);
        final String[] program = getResources().getStringArray(R.array.programme);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ProgramActivity.this, R.layout.sampleview,R.id.lview, program);
        lview.setAdapter(adapter);

        lview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String value = program[i];

                if (value.equals("Under Graduate Programme")) {
                    Intent in = new Intent(ProgramActivity.this, YearActivity.class);
                    startActivity(in);
                } else if (value.equals("Post Graduate Programme")) {
                    Intent in = new Intent(ProgramActivity.this, YearActivity.class);
                    startActivity(in);
                }


            }
        });



    }
}

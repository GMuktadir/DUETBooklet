package com.techfar.service.duetbooklet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MeProgramActivity extends AppCompatActivity {
    private ListView lview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me_program);

        lview= findViewById(R.id.listviewpro);
        final String[] program = getResources().getStringArray(R.array.programme);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MeProgramActivity.this, R.layout.sampleview,R.id.lview,program);
        lview.setAdapter(adapter);


        lview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String value = program[i];

                if (value.equals("Under Graduate Programme")) {
                    Intent in = new Intent(MeProgramActivity.this, MeYearActivity.class);
                    startActivity(in);
                }
                else if(value.equals("Post Graduate Programme"))
                {

                }


            }
        });



    }
}

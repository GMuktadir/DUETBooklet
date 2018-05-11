package com.techfar.service.duetbooklet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EeeYearActivity extends AppCompatActivity {
    private ListView lview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eee_year);

        lview=findViewById(R.id.listviewyear);
        final String[] year = getResources().getStringArray(R.array.year);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(EeeYearActivity.this, R.layout.sampleview,R.id.lview,year);
        lview.setAdapter(adapter);

        lview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                String value=year[i];
                if (value.equals("First Year Second Semester")) {
                    Intent in = new Intent(EeeYearActivity.this, EeeFirstYearSecondSemester.class);
                    startActivity(in);
                } else if (value.equals("Second Year First Semester")) {
                    Intent in = new Intent(EeeYearActivity.this, EeeSecondYearFirstSemester.class);
                    startActivity(in);
                }
            }
        });
    }
}

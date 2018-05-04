package com.techfar.service.duetbooklet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class YearActivity extends AppCompatActivity {
    private ListView lview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year);

        lview=findViewById(R.id.listviewyear);
        final String[] year = getResources().getStringArray(R.array.year);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(YearActivity.this, R.layout.sampleview,R.id.lview,year);
        lview.setAdapter(adapter);

        lview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                String value=year[i];
                if (value.equals("First Year Second Semester")) {
                    Intent in = new Intent(YearActivity.this, FirstYearSecondSemester.class);
                    startActivity(in);
                } else if (value.equals("Second Year First Semester")) {
                    Intent in = new Intent(YearActivity.this, CseActivity.class);
                    startActivity(in);
                }
            }
        });

    }
}

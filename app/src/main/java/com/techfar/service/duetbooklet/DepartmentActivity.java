package com.techfar.service.duetbooklet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DepartmentActivity extends AppCompatActivity {
    private ListView lview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);

        lview=findViewById(R.id.listView);
        final String[] Programme=getResources().getStringArray(R.array.programme);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(DepartmentActivity.this,R.layout.sampleview,Programme);
        lview.setAdapter(adapter);

        lview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String programme=Programme[i];
                Intent in = new Intent(DepartmentActivity.this,YearActivity.class);
                in.putExtra("programme",Programme[i]);
                startActivity(in);


            }
        });

    }

}

package com.techfar.service.duetbooklet;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class CseThirdYearFirstSemester extends AppCompatActivity {
    Button threeone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_third_year_first_semester);

        threeone=findViewById(R.id.DetailsThreeOne);
        threeone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(CseThirdYearFirstSemester.this,ContentSyllabusDetails.class);
                in.putExtra("year","threeone");
                startActivity(in);

            }
        });
    }
    //Menu items
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.curriculum_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==R.id.Landscape)
        {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            return  true;
        }
        if(item.getItemId()==R.id.Portrait)
        {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            return  true;
        }
        return super.onOptionsItemSelected(item);
    }
}

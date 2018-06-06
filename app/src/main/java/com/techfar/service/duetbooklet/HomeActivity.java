package com.techfar.service.duetbooklet;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    private GridView grid;

    String[] menu;
    int[] menuicon={
            R.drawable.booklet,
            R.drawable.act,
            R.drawable.rules,
            R.drawable.profile
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
try {
    menu = getResources().getStringArray(R.array.menu);
    grid = findViewById(R.id.gvid);
    CustomAdapter adapter = new CustomAdapter(HomeActivity.this, menu, menuicon);
    grid.setAdapter(adapter);

    //Intent

    grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            String value = menu[i];
                /*Toast.makeText(HomeActivity.this,value+" index "+i,Toast.LENGTH_SHORT).show();*/

            if (value.equals("Curriculum")) {
                Intent intentDepart = new Intent(HomeActivity.this, DepartmentActivity.class);
                startActivity(intentDepart);
            } else if (value.equals("Act")) {
                Intent intentAct = new Intent(HomeActivity.this, ActActivity.class);
                startActivity(intentAct);
            } else if (value.equals("Rules")) {
                Intent intentRules = new Intent(HomeActivity.this, RulesActivity.class);
                startActivity(intentRules);
            } else if (value.equals("About")) {
                Intent intentAbout = new Intent(HomeActivity.this, AboutActivity.class);
                startActivity(intentAbout);
            } else {
                Toast.makeText(HomeActivity.this, "Not selected Activity", Toast.LENGTH_SHORT).show();
            }


        }
    });
}
catch (Exception ex)
{

    Toast.makeText(HomeActivity.this,"something problem", Toast.LENGTH_SHORT).show();
}

    }
    //Menu items
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==R.id.share)
        {
            Intent in=new Intent(Intent.ACTION_SEND);
            in.setType("text/plain");
            String title="Download Source and APk from here";
            String body="https://github.com/GMuktadir";
            in.putExtra(Intent.EXTRA_SUBJECT,title);
            in.putExtra(Intent.EXTRA_TEXT,body);
            startActivity(Intent.createChooser(in,"Share this app using "));
        }

        return super.onOptionsItemSelected(item);
    }
}

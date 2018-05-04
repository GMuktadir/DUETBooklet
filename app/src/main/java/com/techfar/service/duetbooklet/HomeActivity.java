package com.techfar.service.duetbooklet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    private GridView grid;

    String[] menu;
    int[] menuicon={
            R.drawable.microchip,
            R.drawable.mortarboard,
            R.drawable.devices,
            R.drawable.bell,
            R.drawable.blackboard
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

            if (value.equals("Departments")) {
                Intent intentDepart = new Intent(HomeActivity.this, MainActivity.class);
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
}

package com.techfar.service.duetbooklet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class DepartmentActivity extends AppCompatActivity {
    private ListView lview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);

        try {

            lview = (ListView) findViewById(R.id.listView);
            final String[] department = getResources().getStringArray(R.array.departments);

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(DepartmentActivity.this, R.layout.sampleview, R.id.lview, department);
            lview.setAdapter(adapter);

            //For item
            lview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    String value = department[i];
                    //Toast.makeText(DepartmentActivity.this, i + "." + value, Toast.LENGTH_SHORT).show();

//                in.putExtra("name",DepartmentActivity[i]);

                    try
                    {
                        if (value.equals("Department of Computer Science and Engineering")) {
                            Intent in = new Intent(DepartmentActivity.this, CseProgramActivity.class);
                            startActivity(in);
                        } else if (value.equals("Department of Electrical and Electronic Engineering")) {
                            Intent in = new Intent(DepartmentActivity.this, EeeProgramActivity.class);
                            startActivity(in);
                        } else if (value.equals("Department of Mechanical Engineering")) {
                           /* Intent in = new Intent(DepartmentActivity.this, MeProgramActivity.class);
                            startActivity(in);*/
                        } else if (value.equals("Department of Textile Engineering")) {
                            Intent in = new Intent(DepartmentActivity.this, TeActivity.class);
                            startActivity(in);
                        } else if (value.equals("Department of Architecture")) {
                            Intent in = new Intent(DepartmentActivity.this, ArchActivity.class);
                            startActivity(in);
                        } else if (value.equals("Department of Industrial and Production Engineering")) {
                            Intent in = new Intent(DepartmentActivity.this, IpeActivity.class);
                            startActivity(in);
                        } else if (value.equals("Department of Civil Engineering")) {
                            Intent in = new Intent(DepartmentActivity.this, CeActivity.class);
                            startActivity(in);
                        } else if (value.equals("Department of Food Engineering")) {
                            Intent in = new Intent(DepartmentActivity.this, FeActivity.class);
                            startActivity(in);
                        } else {
                            Toast.makeText(DepartmentActivity.this, "Not select any Department", Toast.LENGTH_SHORT).show();
                        }
                    }catch (Exception ex)
                    {
                        Toast.makeText(DepartmentActivity.this, (CharSequence) ex, Toast.LENGTH_SHORT).show();
                    }

                }
            });


        }
        catch (Exception ex)
        {
            Toast.makeText(DepartmentActivity.this,"ex", Toast.LENGTH_SHORT).show();
        }

    }

}

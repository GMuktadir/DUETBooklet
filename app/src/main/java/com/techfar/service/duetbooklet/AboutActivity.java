package com.techfar.service.duetbooklet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class AboutActivity extends AppCompatActivity {
    ImageButton github;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        github=findViewById(R.id.imgbuttongithub);
        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               // Toast.makeText(AboutActivity.this,"click",Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(AboutActivity.this, WebviewGithub.class);
                    startActivity(intent);


            }
        });

    }
}

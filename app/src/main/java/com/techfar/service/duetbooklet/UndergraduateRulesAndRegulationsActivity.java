package com.techfar.service.duetbooklet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class UndergraduateRulesAndRegulationsActivity extends AppCompatActivity {
    private ListView lview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_undergraduate_rules_and_regulations);

        lview=findViewById(R.id.listviewpro);
        final String[] UGRules = getResources().getStringArray(R.array.UndergraduateRulesAndRegulations);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(UndergraduateRulesAndRegulationsActivity.this, R.layout.sampleview,R.id.lview, UGRules);
        lview.setAdapter(adapter);
        lview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String value = UGRules[i];

                if (value.equals("1. Definitions")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("1. Definitions","1.1 University; means the Dhaka University of Engineering and Technology, Gazipur abbreviated as DUET, Gazipur.\n" +
                            "1.2    ‘Syndicate’ means the Syndicate of the University,\n" +
                            "1.3    ‘Academic Council’ means the Academic Council of the University.\n" +
                            "1.4    ‘Chancellor’ means the Chancellor of the University.\n" +
                            "1.5    ‘Vice-Chancellor’ means the Vice-Chancellor of the University.\n" +
                            "1.6    ‘Dean’ means the Dean of a faculty of the University.\n" +
                            "1.7    ‘Head of the Department’ means the Head of a department of the University.\n" +
                            "1.8    ‘Registrar’ means the Registrar of the University.\n" +
                            "1.9    ‘Academic Committee’ means the Academic Committee for Undergraduate Studies (ACUG) of a degree awarding department of the University.\n" +
                            "1.10    ‘Degree’ means the degree of Bachelor of Science in a particular discipline of Engineering offered by the University.\n" +
                            "1.11    ‘Departmental Monitoring Committee’ means the Committee for upgrading/changing the Undergraduate Curriculum and the Course system and monitoring the teacher-student activities.\n" +
                            "1.12    ‘Degree Equivalence Committee’ means the committee for equivalencing different degrees obtained from home and/or abroad.\n" +
                            "1.13    ‘Teacher’ means Professor, Associate Professor, Assistant Professor, Lecturer and any other person approved as a teacher by the University.\n" +
                            "1.14   ‘Student’ means Student who has been admitted into the regular academic curriculum of the University.\n");
                    startActivity(in);
                }



            }
        });
    }
}

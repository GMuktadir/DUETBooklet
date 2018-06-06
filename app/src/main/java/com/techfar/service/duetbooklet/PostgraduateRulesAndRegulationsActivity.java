package com.techfar.service.duetbooklet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PostgraduateRulesAndRegulationsActivity extends AppCompatActivity {
    private ListView lviewPost,lviewMsc,lviewMphil,lviewDoctor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postgraduate_rules_and_regulations);
        //start listview

        lviewPost=findViewById(R.id.listviewPostgraduate);
        final String[] PGRules = getResources().getStringArray(R.array.PostgraduateRulesAndRegulations);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(PostgraduateRulesAndRegulationsActivity.this, R.layout.sampleview,R.id.lview, PGRules);
        lviewPost.setAdapter(adapter);

        lviewPost.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String valueRules = PGRules[i];
                String index = String.valueOf(i);

                if (valueRules.equals("1. Definitions")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("2. Committee")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("3. Postgraduate Course Co-ordinator")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }

            }
        });
        //end listview

        //start lviewMsc
        lviewMsc=findViewById(R.id.listviewMsc);
        final String[] MscRules = getResources().getStringArray(R.array.PostgraduateRulesAndRegulationsMsc);
        ArrayAdapter<String> adapterMsc = new ArrayAdapter<String>(PostgraduateRulesAndRegulationsActivity.this, R.layout.sampleview,R.id.lview, MscRules);
        lviewMsc.setAdapter(adapterMsc);

        lviewMsc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String valueRules = MscRules[i];
                String index = String.valueOf(i);

                if (valueRules.equals("1. Degrees Offered")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationMscActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("2. Eligibility for the Applicant")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationMscActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("3. Admission and Registration Procedures")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationMscActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("4. Academic Requirements and Regulations")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationMscActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("5. Grading System")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, PostGraduateRulesGradingSystem.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("6. Thesis")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationMscActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("7. Academic Calendar")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationMscActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("8. Project")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationMscActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("9. Cancellation of Admission")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationMscActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("10. Academic Fees")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationMscActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("11. Extension of Time for Completion of Degree")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationMscActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }

            }
        });
        //end lviewMsc

        //start lviewMphil

        lviewMphil=findViewById(R.id.listviewMPhil);
        final String[] MphilRules = getResources().getStringArray(R.array.PostgraduateRulesAndRegulationsMphil);
        ArrayAdapter<String> adapterMphil = new ArrayAdapter<String>(PostgraduateRulesAndRegulationsActivity.this, R.layout.sampleview,R.id.lview, MphilRules);
        lviewMphil.setAdapter(adapterMphil);
        lviewMphil.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String valueRules = MphilRules[i];
                String index = String.valueOf(i);

                if (valueRules.equals("1. Degrees Offered")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationMphilActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("2. Eligibility for the Applicant")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationMphilActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("3. Admission and Registration Procedures")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationMphilActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("4. Academic Requirements and Regulations")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationMphilActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("5. Grading System")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, PostGraduateRulesMphilGradingSystem.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("6. Conduct of Examination")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationMphilActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("7. Thesis")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationMphilActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("8. Project")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationMphilActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("9. Cancellation of Admission")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationMphilActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("10. Academic Fees")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationMphilActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("11. Extension of Time for Completion of Degree")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationMphilActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }


            }
        });
        //End lviewMphil
        //Start lviewDoctor
        lviewDoctor=findViewById(R.id.listviewDoctor);
        final String[] DoctorRules = getResources().getStringArray(R.array.PostgraduateRulesAndRegulationsDoctor);
        ArrayAdapter<String> adapterDoctor = new ArrayAdapter<String>(PostgraduateRulesAndRegulationsActivity.this, R.layout.sampleview,R.id.lview, DoctorRules);
        lviewDoctor.setAdapter(adapterDoctor);

        lviewDoctor.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String valueRules = DoctorRules[i];
                String index = String.valueOf(i);
                if (valueRules.equals("1. Degrees Offered")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationsDoctorActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("2. Eligibility for the Applicant")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationsDoctorActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("3. Admission and Registration Procedure")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationsDoctorActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("4. Appointment of a Supervisor")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationsDoctorActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("5. Final Registration")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationsDoctorActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("6. Academic Requirements for the Degree")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationsDoctorActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("7. Grading System")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, PostGraduateRulesDoctorGradingSystem.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("8. Doctoral Committee")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationsDoctorActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("9. Research Proposal")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationsDoctorActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("10. Conduct of Examination")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationsDoctorActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("11. Qualifying Requirements")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationsDoctorActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("12. Thesis/Dissertation")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationsDoctorActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("13. Examination Board")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationsDoctorActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("14. Cancellation of Admission")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationsDoctorActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("15. Academic Fees")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationsDoctorActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("16. Extension of Time for Completion of Degree")) {
                    Intent in = new Intent(PostgraduateRulesAndRegulationsActivity.this, ContentPostgraduateRulesAndRegulationsDoctorActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }


            }
        });
        //End lviewDoctor

    }
}
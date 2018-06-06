package com.techfar.service.duetbooklet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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

                String valueRules=UGRules[i];
                String index= String.valueOf(i);
                if (valueRules.equals("1. Definitions")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("2. Faculties")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("3. Departments")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("3.1 Degree-Awarding Departments")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("3.2 Teaching Departments")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("4. Degrees Offered")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("5. Student Admission")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, UndergraduateRulesAdmission.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("6. Method of Course Offering and Instruction")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("7. Academic Calendar")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, UndergraduateRulesAcademicCalendar.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("8. Duration of Programme and Course Structure")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, UndergraduateRulesDurationOfProgramme.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("9. Course Designation and Numbering Systems")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, UndergraduateRulesCourseDesignation.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("10. Type of Courses")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("10.1 Core Courses")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("10.2 Pre-requisite Courses")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("10.3 Optional Courses")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("10.4 Non Credit Courses")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("11. Departmental Monitoring Committee and Students’ Advise")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("11.1 Departmental Monitoring Committee")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("11.2 Students’ Adviser")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("11.3 Teacher Student Contact")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("12. Course Registration and its Procedure")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("12.1 Credit Limit in a Semester")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("12.2 Pre-condition for Registration")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("12.3 Course Adjustment Procedure")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("12.4 Withdrawal from a Semester")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("13. Striking off the Names and Readmission")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }

                else if (valueRules.equals("14. Grading System, Calculation of GPA and Cumulative GPA, and Conversion of Marks")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("14.1 Grading System")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, UndergraduateRulesGradingSystem.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }

                else if (valueRules.equals("14.2 Calculation of GPA and Cumulative GPA")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, UndergraduateRulesCalculationGpaAndCgpa.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("14.3 Conversion of Grade into Marks")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, UndergraduateRulesGradeToMarks.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("15. Distribution of Marks")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("15.1 The distribution of marks for a given course will be as follows")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, UndergraduateRulesDistributionOfMarks.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("15.2 It is desirable that weightage")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("15.3 Basis for distribution of marks in class participation and attendance will be as follows")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, UndergraduateRulesDistributionOfMarksClassParticipation.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("15.4")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("16. Class Tests, Quizzes and Spot Tests")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("17. Earned Credits")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("18. Measures for Helping Academically Weak Students")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("19. Honours, Dean’s List and University Gold Medal")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("19.1 Honours")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("19.2 Dean’s List")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("19.3 University Gold Medal")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("20. Student Classification")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, UndergraduateRulesStudentClassification.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("21. Probation and Suspension")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("22.Minimum Earned Credits and GPA Requirements for Obtaining Degree")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("23. Time Limits for Completion of B. Sc. Engineering Degree")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("24. Industrial/Professional Training Requirements")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("25. Application for Graduation and Award of Degree")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("26. Absence during Semester")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("27. Review Courses")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }
                else if (valueRules.equals("28. Special Examination")) {
                    Intent in = new Intent(UndergraduateRulesAndRegulationsActivity.this, ContentUndergraduateRulesAndRegulationsActivity.class);
                    in.putExtra("index",index);
                    startActivity(in);
                }




            }
        });
    }
}

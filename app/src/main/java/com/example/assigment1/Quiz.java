package com.example.assigment1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Quiz extends AppCompatActivity {
    private RadioGroup radioGroup;
    private RadioGroup radioGroup1;
    private RadioGroup radioGroup11;
    private RadioGroup radioGroup111;

    private Button btngrade;
    private TextView txtres;

    private int sceond = 0;

    private  int choiceone =0 ;
    private int choicetow =0;
    private int choicethree=0;
   private int choicefour =0;

    private RadioButton rad1 =null;
    private RadioButton rad2 = null;
    private RadioButton rad3 = null ;
    private RadioButton rad4 = null ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_quiz);

        Intent intent = getIntent();

        HOKS();



        run();

    }

    private void check(Bundle savedInstanceState) {

        choiceone=savedInstanceState.getInt("IDQ1");

        choicetow=savedInstanceState.getInt("IDQ2");

        choicethree=savedInstanceState.getInt("IDQ3");

        choicefour=savedInstanceState.getInt("IDQ4");

        rad1 = findViewById(choiceone);

        rad2 = findViewById(choicetow);

        rad3 = findViewById(choicethree);

        rad4 = findViewById(choicefour);

        rad1.setChecked(true);

        rad2.setChecked(true);

        rad3.setChecked(true);

        rad4.setChecked(true);
    }

    private void run() {

        Handler handler = new Handler();

        final TextView txt = findViewById(R.id.TxtTime);

        handler.post(new Runnable() {

            @Override
            public void run() {

                int h = sceond / 3600;

                int m = (sceond % 3600) / 60;

                int s = sceond % 60;

                String time = h + ":" + m + ":" + s;

                txt.setText(time);

                sceond++;

                handler.postDelayed(this, 1000);
            }
        });
    }

    private void HOKS() {
        radioGroup = findViewById(R.id.radioGroup);

        radioGroup1 = findViewById(R.id.radioGroup1);

        radioGroup11 = findViewById(R.id.radioGroup11);

        radioGroup111 = findViewById(R.id.radioGroup111);

        btngrade = findViewById(R.id.btngrade);

        txtres = findViewById(R.id.txtres);
    }

    public void btnresults(View view) {

       choiceone = radioGroup.getCheckedRadioButtonId();

       choicetow = radioGroup1.getCheckedRadioButtonId();

       choicethree = radioGroup11.getCheckedRadioButtonId();

       choicefour = radioGroup111.getCheckedRadioButtonId();




        if (choiceone == -1 || choicetow == -1 || choicethree == -1 || choicefour == -1) {

            txtres.setText("Please answer all questions and Checked");

            txtres.setVisibility(View.VISIBLE);

            return;
        }

        rad1 = findViewById(choiceone);
        rad2 = findViewById(choicetow);
        rad3 = findViewById(choicethree);
        rad4 = findViewById(choicefour);

        String Q1 = rad1.getText().toString();
        String Q2 = rad2.getText().toString();
        String Q3 = rad3.getText().toString();
        String Q4 = rad4.getText().toString();

        int score = 0;

        if (Q1.equals("27000Km")) {
            score++;
        }
        if (Q2.equals("Jerusalem")) {
            score++;
        }
        if (Q3.equals("Istanbul")) {
            score++;
        }
        if (Q4.equals("Gaza")) {
            score++;
        }

        if (score == 4) {
            txtres.setText("4/4, Congratulations");
        } else if (score == 3) {
            txtres.setText("3/4, One answer is incorrect");
        } else if (score == 2) {
            txtres.setText("2/4, Two answers are incorrect");
        } else if (score == 1) {
            txtres.setText("1/4, Three answers are incorrect");
        } else {
            txtres.setText("0/4, All answers are incorrect");
        }

        txtres.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {  //change Orintaion (cll Back Mothed )

        super.onSaveInstanceState(outState);

        outState.putInt("IDQ1",choiceone);

        outState.putInt("IDQ2",choicetow);

        outState.putInt("IDQ3",choicethree);

        outState.putInt("IDQ4",choicefour);
    }
}
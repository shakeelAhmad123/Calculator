package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button leftcolon_btn,seven7_btn,four4_btn,one1_btn,zero0_btn,
           rightcolon_btn,eight8_btn,five5_btn,two2_btn,dot_btn,
           percent_btn,nine9_btn,six6_btn,three3_btn,equal_btn,
           ac_btn,devision_btn,multiply_btn,minus_btn,plus_btn;

    EditText result_tv;

    boolean plus,minus,multiply,devision;

    float result1,result2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result_tv = findViewById(R.id.result_tv);

        leftcolon_btn = findViewById(R.id.leftcolon_btn);
        seven7_btn = findViewById(R.id.seven7_btn);
        four4_btn = findViewById(R.id.four4_btn);
        one1_btn = findViewById(R.id.one1_btn);
        zero0_btn = findViewById(R.id.zero0_btn);
        rightcolon_btn = findViewById(R.id.rightcolon_btn);
        eight8_btn = findViewById(R.id.eight8_btn);
        five5_btn = findViewById(R.id.five5_btn);
        two2_btn = findViewById(R.id.two2_btn);
        dot_btn = findViewById(R.id.dot_btn);
        percent_btn = findViewById(R.id.percent_btn);
        nine9_btn = findViewById(R.id.nine9_btn);
        six6_btn = findViewById(R.id.six6_btn);
        three3_btn = findViewById(R.id.three3_btn);
        equal_btn = findViewById(R.id.equal_btn);
        ac_btn = findViewById(R.id.ac_btn);
        devision_btn = findViewById(R.id.devision_btn);
        multiply_btn = findViewById(R.id.multiply_btn);
        minus_btn = findViewById(R.id.minus_btn);
        plus_btn = findViewById(R.id.plus_btn);


        leftcolon_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result_tv.setText(result_tv.getText()+"(");

//               result_tv.setText("(");
//
//               savetext = result_tv.getText().toString();
//               result_tv.setText(savetext);

            }
        });

        seven7_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//
//                result_tv.setText(savetext);
//
//                result_tv.setText("7");

                result_tv.setText(result_tv.getText()+"7");


            }
        });

        four4_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                result_tv.setText(result_tv.getText()+"4");


            }
        });

        one1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result_tv.setText(result_tv.getText()+"1");

            }
        });

        zero0_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result_tv.setText(result_tv.getText()+"0");

            }
        });

        rightcolon_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result_tv.setText(result_tv.getText()+")");

            }
        });

        eight8_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result_tv.setText(result_tv.getText()+"8");

            }
        });

        five5_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result_tv.setText(result_tv.getText()+"5");

            }
        });

        two2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result_tv.setText(result_tv.getText()+"2");

            }
        });

        dot_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result_tv.setText(result_tv.getText()+".");

            }
        });

        percent_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        nine9_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result_tv.setText(result_tv.getText()+"9");

            }
        });

        six6_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result_tv.setText(result_tv.getText()+"6");

            }
        });

        three3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result_tv.setText(result_tv.getText()+"3");

            }
        });

        equal_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result2 = Float.parseFloat(result_tv.getText()+"");

                if (multiply==true){

                    result_tv.setText(result1*result2+"");
                    multiply=false;

                }

                if (devision==true){

                    result_tv.setText(result1/result2+"");
                    devision=false;

                }

                if (minus==true){

                    result_tv.setText(result1-result2+"");
                    minus=false;

                }

                if (plus==true){

                    result_tv.setText(result1+result2+"");
                    plus=false;

                }



            }
        });

        ac_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result_tv.setText("");

            }
        });


        multiply_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (result_tv==null){
                    result_tv.setText("");

                }
                else {
                    result1 = Float.parseFloat(result_tv.getText()+"");
                    multiply = true;
                    result_tv.setText(null);
                }

            }
        });


        devision_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (result_tv==null){
                    result_tv.setText("");

                }
                else {
                    result1 = Float.parseFloat(result_tv.getText()+"");
                   devision = true;
                    result_tv.setText(null);
                }

            }
        });

        minus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (result_tv==null){
                    result_tv.setText("");

                }
                else {
                    result1 = Float.parseFloat(result_tv.getText()+"");
                    minus = true;
                    result_tv.setText(null);
                }

            }
        });

        plus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (result_tv==null){
                    result_tv.setText("");

                }
                else {
                    result1 = Float.parseFloat(result_tv.getText()+"");
                    plus = true;
                    result_tv.setText(null);
                }

            }
        });


    }
}

package com.example.android_bootcamp_4_bmi;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context context = this;
        Button dice_roll;
        dice_roll = findViewById(R.id.dice_roll);

        final TextView dice_right;

        dice_right = findViewById(R.id.dice_right);


        dice_roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomNumGen = new Random();

                int randomNum1 = randomNumGen.nextInt(3);

                if (randomNum1 > 1) {

                    dice_right.setText("Greater than 1");


                    Toast.makeText(context, "Greater than 1 " + randomNum1, Toast.LENGTH_SHORT).show();

                } else if (randomNum1 > 0) {
                    Toast.makeText(context, "Greater than 0 " + randomNum1, Toast.LENGTH_SHORT).show();
                    dice_right.setText("Greater than 0");


                } else if (randomNum1 == 0) {
                    dice_right.setText("Equal to 0");


                    Toast.makeText(context, "Equal to 0 " + randomNum1, Toast.LENGTH_SHORT).show();

                }



            }
        });
    }
}
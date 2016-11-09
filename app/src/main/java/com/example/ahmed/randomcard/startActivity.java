package com.example.ahmed.randomcard;

/*
    Ahmed Vawda, 09 Nov 2016
    Basic code to test button functionality and image retrieval/display of playing cards
*/

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class startActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        //Setup variables to match teh visual components
        Button genCardBtn = (Button) findViewById(R.id.generateCardBtn);
        Button tglCardVisibleBtn = (Button) findViewById(R.id.toggleVisibleBtn);
        final TextView mainText = (TextView) findViewById(R.id.mainText);


        //Define what will happen when generate button is pressed
        genCardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // nextInt is normally exclusive of the top value,
                // so add 1 to make it inclusive
                int minCard = 1;
                int maxCard = 10;
                Random r = new Random();

                int cardPos = r.nextInt( (maxCard - minCard) +1 ) + minCard;
                mainText.setText("Range : "+minCard+" to "+maxCard+"\n Random : "+cardPos);
            }
        });

        //Define what will happen when toggle visibility button is pressed
        tglCardVisibleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mainText.getVisibility() == View.VISIBLE) {
                    mainText.setVisibility(View.INVISIBLE);
                } else {
                    mainText.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}

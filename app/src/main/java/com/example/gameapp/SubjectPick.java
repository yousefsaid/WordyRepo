package com.example.gameapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SubjectPick extends AppCompatActivity {

    TextView textQuestion, logoBtn, animalBtn, backBtn, flagBtn;
    ImageView logo;
    Animation smalltobig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_pick);


        Button goToLogoa = (Button) findViewById(R.id.logoBtn);
        goToLogoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SubjectPick.this, LogosLevel1.class);
                startActivity(intent);

            }
        }); Button goToAnimals = (Button) findViewById(R.id.animalBtn);
        goToAnimals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(SubjectPick.this, MainActivity.class);
                startActivity(intent1);
            }
        });

        Button goToFlag = (Button) findViewById(R.id.flagBtn);
        goToFlag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(SubjectPick.this, FlagsLevel1.class);
                startActivity(intent2);
            }
        });

        Button goBack = (Button) findViewById(R.id.backBtn);
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(SubjectPick.this, Naviagation.class);
                startActivity(intent3);
            }
        });

        smalltobig = AnimationUtils.loadAnimation(this, R.anim.smalltobig);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/FredokaOneRegular.ttf" );

        textQuestion = (TextView) findViewById(R.id.textQuestion);
        logoBtn = (TextView) findViewById(R.id.logoBtn);
        animalBtn = (TextView) findViewById(R.id.animalBtn);
        flagBtn = (TextView) findViewById(R.id.flagBtn);
        backBtn = (TextView) findViewById(R.id.backBtn);

        logo = (ImageView) findViewById(R.id.logo);
        logo.startAnimation(smalltobig);


        textQuestion.setTypeface(typeface);
        animalBtn.setTypeface(typeface);
        flagBtn.setTypeface(typeface);
        backBtn.setTypeface(typeface);
        logoBtn.setTypeface(typeface);

    }
}


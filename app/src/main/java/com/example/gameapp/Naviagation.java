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

public class Naviagation extends AppCompatActivity {

    TextView textScreen, textQuestion, startbutton, textBtn;
    ImageView logo;
    Animation smalltobig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_naviagation);

        Button advanceToMainActivity = (Button) findViewById(R.id.startbutton);
        advanceToMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Naviagation.this, SubjectPick.class);
                startActivity(intent);
            }
        });

        smalltobig = AnimationUtils.loadAnimation(this, R.anim.smalltobig);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/FredokaOneRegular.ttf" );

        textQuestion = (TextView) findViewById(R.id.textQuestion);
        textScreen = (TextView) findViewById(R.id.textScreen);
        startbutton = (TextView) findViewById(R.id.startbutton);
        textBtn = (TextView) findViewById(R.id.textBtn);

        logo = (ImageView) findViewById(R.id.logo);
        logo.startAnimation(smalltobig);


        textQuestion.setTypeface(typeface);
        textScreen.setTypeface(typeface);
        startbutton.setTypeface(typeface);
        textBtn.setTypeface(typeface);

    }
}

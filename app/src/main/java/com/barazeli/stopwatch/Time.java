package com.barazeli.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;

public class Time extends AppCompatActivity {
    private ImageView anchor;
    private Button start,stop;
    private Animation animAnchor;
    private Chronometer chronometer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        anchor=findViewById(R.id.anchor);
        start=findViewById(R.id.start);
        stop=findViewById(R.id.stop);
        chronometer=findViewById(R.id.time);


        // load animation

        animAnchor = AnimationUtils.loadAnimation(this,R.anim.anch);

        // start our application
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                anchor.startAnimation(animAnchor);
                stop.animate().alpha(1).translationY(-200).setDuration(350).start();
                start.animate().alpha(0).translationY(80).setDuration(150).start();
                chronometer.setBase(SystemClock.elapsedRealtime());
                chronometer.start();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animAnchor.cancel();
                start.animate().alpha(1).translationY(80).setDuration(300).start();
                stop.animate().alpha(0).translationY(20).setDuration(200).start();
            }
        });

    }
}

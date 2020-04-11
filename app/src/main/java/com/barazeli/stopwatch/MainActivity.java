package com.barazeli.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView happ,key_of_happ;
    Button get_start;
    Animation atg,txt1,txt2;
    ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=findViewById(R.id.img);
        happ=findViewById(R.id.happ);
        key_of_happ=findViewById(R.id.key_hap);
        get_start=findViewById(R.id.start_btn);
        // load animations
        txt1=AnimationUtils.loadAnimation(this,R.anim.txt1);
        txt2=AnimationUtils.loadAnimation(this,R.anim.txt2);
        atg= AnimationUtils.loadAnimation(this,R.anim.atg);
        // passing animations
        happ.startAnimation(txt1);
        key_of_happ.startAnimation(txt1);
        get_start.startAnimation(txt2);
        img.startAnimation(atg);




    }
}

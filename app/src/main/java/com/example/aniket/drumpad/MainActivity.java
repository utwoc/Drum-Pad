package com.example.aniket.drumpad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.AudioManager;
import android.media.SoundPool;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private SoundPool sp;
    private int sound1;
    private int sound2;
    private int sound3;
    private int sound4;
    private int sound5;
    private int sound6;
    private int sound7;
    private int sound8;
    private int sound9;
    private int sound10;
    private int sound11;
    private int sound12;
    private int sound13;
    private int sound14;
    private int sound15;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        sound1 = sp.load(getApplicationContext(), R.raw.sound1, 1);
        sound2 = sp.load(getApplicationContext(), R.raw.sound2, 1);
        sound3 = sp.load(getApplicationContext(), R.raw.sound3, 1);
        sound4 = sp.load(getApplicationContext(), R.raw.sound4, 1);
        sound5 = sp.load(getApplicationContext(), R.raw.sound5, 1);
        sound6 = sp.load(getApplicationContext(), R.raw.sound6, 1);
        sound7 = sp.load(getApplicationContext(), R.raw.sound7, 1);
        sound8 = sp.load(getApplicationContext(), R.raw.sound8, 1);
        sound9 = sp.load(getApplicationContext(), R.raw.sound9, 1);
        sound10 = sp.load(getApplicationContext(), R.raw.sound10, 1);
        sound11 = sp.load(getApplicationContext(), R.raw.sound11, 1);
        sound12 = sp.load(getApplicationContext(), R.raw.sound12, 1);
        sound13 = sp.load(getApplicationContext(), R.raw.sound13, 1);
        sound14 = sp.load(getApplicationContext(), R.raw.sound14, 1);
        sound15 = sp.load(getApplicationContext(), R.raw.sound15, 1);
    }

    public void playsound1(View v) {
        sp.play(sound1, 1.0f, 1.0f, 1, 1, 1f);
    }

    public void playsound2(View v) {
        sp.play(sound2, 1.0f, 1.0f, 1, 1, 1f);

    }

    public void playsound3(View v) {
        sp.play(sound3, 1.0f, 1.0f, 1, 1, 1f);

    }

    public void playsound4(View v) {
        sp.play(sound4, 1.0f, 1.0f, 0, 0, 1f);

    }

    public void playsound5(View v) {
        sp.play(sound5, 1.0f, 1.0f, 0, 0, 1f);

    }

    public void playsound6(View v) {
        sp.play(sound6, 1.0f, 1.0f, 0, 0, 1f);

    }

    public void playsound7(View v) {
        sp.play(sound7, 1.0f, 1.0f, 0, 0, 1f);

    }

    public void playsound8(View v) {
        sp.play(sound7, 1.0f, 1.0f, 0, 0, 1f);

    }

    public void playsound9(View v) {
        sp.play(sound9, 1.0f, 1.0f, 0, 0, 1f);
    }

    public void playsound10(View v) {
        sp.play(sound10, 1.0f, 1.0f, 0, 0, 1f);
    }

    public void playsound11(View v) {
        sp.play(sound11, 1.0f, 1.0f, 0, 0, 1f);
    }

    public void playsound12(View v) {
        sp.play(sound12, 1.0f, 1.0f, 0, 0, 1f);
    }

    public void playsound13(View v) {
        sp.play(sound13, 1.0f, 1.0f, 0, 0, 1f);
    }

    public void playsound14(View v) {
        sp.play(sound14, 1.0f, 1.0f, 0, 0, 1f);
    }

    public void playsound15(View v) {
        sp.play(sound15, 1.0f, 1.0f, 0, 0, 1f);
    }
}
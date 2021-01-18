package com.example.TimerApp;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;

public class SoundPlayer {

    private static SoundPool soundPool;
    private static int alarmSound;

    public SoundPlayer(Context context) {

        soundPool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);

        alarmSound = soundPool.load(context, R.raw.alarm, 1);
    }
    public void playalarmSound() {
        soundPool.play(alarmSound, 1.0f, 1.0f, 1, 0, 1.0f);
    }
}
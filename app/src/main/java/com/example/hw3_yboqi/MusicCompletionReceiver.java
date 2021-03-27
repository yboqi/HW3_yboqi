package com.example.hw3_yboqi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MusicCompletionReceiver extends BroadcastReceiver {
    music playmusic;

    public MusicCompletionReceiver(){
        //empty constructor
    }

    public MusicCompletionReceiver(music mainActivity) {
        this.playmusic= mainActivity;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String musicName= intent.getStringExtra(MusicService.MUSICNAME);
        playmusic.updateName(musicName);
    }
}

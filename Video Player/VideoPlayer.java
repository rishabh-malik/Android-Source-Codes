package com.example.rishabh.application;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoPlayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);

        //Reference to video view
        final VideoView myVideo=(VideoView)findViewById(R.id.videoView);
        myVideo.setVideoPath("url or path of the video to play");

        //Player controls play,puase etc
        MediaController mediaController=new MediaController(this);
        mediaController.setAnchorView(myVideo);
        myVideo.setMediaController(mediaController);
        //finally to start it
        myVideo.start();
    }

}

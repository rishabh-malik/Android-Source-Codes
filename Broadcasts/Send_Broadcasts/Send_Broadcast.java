package com.example.rishabh.sendbroadcast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Send_Broadcast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send__broadcast);
    }

    //method to send broadcast
    public void sendOutBroadcast(View view){
        Intent i=new Intent();
        i.setAction("com.example.rishabh.sendbroadcast");
        i.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        sendBroadcast(i);
    }
}

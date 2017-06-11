package com.example.rishabh.application;

import android.os.Handler;
import android.os.Message;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Android_Threads extends AppCompatActivity {

    //handler is used to change the ui which occurs in the main thread
    Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            TextView mytxt=(TextView)findViewById(R.id.textView);
            mytxt.setText("Nice Job");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android__threads);

    }

    //this code will execute for 10 sec
    public void onClickButton(View view){
        //now this will run in the background due to
        Runnable r=new Runnable() {
            @Override
            public void run() {
                //code to run in background
                long futureTime= System.currentTimeMillis()+10000;
                while (System.currentTimeMillis()<futureTime){
                    synchronized (this){
                        try{
                            wait(futureTime-System.currentTimeMillis());
                        }catch (Exception e){
                        }
                    }

                }
                //calls the handler
                handler.sendEmptyMessage(0);
            }
        };

        //creating the thread
        Thread myThread=new Thread(r);
        myThread.start();




}}

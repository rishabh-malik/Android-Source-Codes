package com.example.rishabh.boundservice;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.rishabh.boundservice.BoundService.MyLocalBinder;

public class MainActivity extends AppCompatActivity {

    BoundService myService;
    boolean isBound=false;

    public void showTime(){
        String currentTime=myService.getCurrentTime();
        TextView mytxt=(TextView)findViewById(R.id.textView);
        mytxt.setText(currentTime);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i=new Intent(this,BoundService.class);
        bindService(i,myConnection, Context.BIND_AUTO_CREATE);
    }

    private ServiceConnection myConnection=new ServiceConnection() {
        //what to happen when service is connected
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            MyLocalBinder binder=(MyLocalBinder)service;
            myService=binder.getService();
            isBound=true;
        }

        //what to happen when service is disconnected
        @Override
        public void onServiceDisconnected(ComponentName name) {
            isBound=false;
        }
    };


}

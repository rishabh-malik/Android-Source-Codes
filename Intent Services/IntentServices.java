package com.example.rishabh.application;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

//a service is a chunk of code which executes in the background without interfering with the ui
//place the below 2 lines in the oncreate method whenever you want to kick off the service
//Intent intent =new Intent(this,IntentService.class);
//startService(intent);
public class IntentServices extends IntentService {
    private static final String TAG ="haha";
    public IntentServices(String name) {
        super("IntentServices");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        /* this is what the service does */
        Log.i(TAG,"The service Started");
    }
}

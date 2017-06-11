package com.example.rishabh.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class Generic_service extends Service {

    private static final String TAG="haha";

    public Generic_service() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
       Log.i(TAG,"Service started");
        //made threads so that the app does not freezes
        Runnable r=new Runnable() {
            @Override
            public void run() {
              for(int i=0;i<5;i++){
                  long futureTime= System.currentTimeMillis()+10000;
                  while (System.currentTimeMillis()<futureTime){
                      synchronized (this){
                          try{
                              wait(futureTime-System.currentTimeMillis());
                              Log.i(TAG,"service is doing something");
                          }catch (Exception e){
                          }
                      }

                  }

              }
            }
        };
        Thread mythread=new Thread(r);
        mythread.start();
        //start sticky means to start the service again if by any reason gets destroyed
        return Service.START_STICKY;

    }

    @Override
    public void onDestroy() {
        Log.i(TAG,"Destroyed service");
    }
}

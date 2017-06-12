package com.example.rishabh.myapplication;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;

public class Notification extends AppCompatActivity {

    //creating object which is the notification itself
    NotificationCompat.Builder notification;
    //giving id no to notification
    private static final int uniqueID=4516;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        notification=new NotificationCompat.Builder(this);
        //whenever we open activity notification disappears then
        notification.setAutoCancel(true);

    }

    public void buttonClicked(View view){
        //build the notification
        notification.setSmallIcon(R.drawable.ic_launcher);
        notification.setTicker("You have new notification");
        notification.setWhen(System.currentTimeMillis());
        notification.setContentTitle("Title");
        notification.setContentText("I am the notification");

        //when the notification is clicked
        Intent i=new Intent(this,Notification.class);
        //gives the device access to intents
        PendingIntent pendingIntent=PendingIntent.getActivity(this,0,i,PendingIntent.FLAG_UPDATE_CURRENT);
        notification.setContentIntent(pendingIntent);

        //Builds notification and sends to system
        NotificationManager nm=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        nm.notify(uniqueID,notification.build());
    }
}

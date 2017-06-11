package com.example.rishabh.receive_broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ReceiveBroadcast extends BroadcastReceiver {
    public ReceiveBroadcast() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        //creating an toast
        Toast.makeText(context,"Broadcast has been received!",Toast.LENGTH_LONG).show();
    }
}

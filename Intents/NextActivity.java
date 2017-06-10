package com.example.rishabh.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        //giving access to transfer data
        Bundle data=getIntent().getExtras();
        if(data==null)
            return;

        String msg=data.getString("Message");
        final TextView txt=(TextView)findViewById(R.id.textView);
        txt.setText(msg);


    }
}

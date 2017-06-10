package com.example.rishabh.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class Intents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents);
    }

    //function to send to next activity
    public void onClick(View view){
        Intent i=new Intent(this,NextActivity.class);

        //for passing data
        final EditText input=(EditText)findViewById(R.id.editText);
        String message=input.getText().toString();
        i.putExtra("Message",message);

        startActivity(i);

    }
}

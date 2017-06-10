package com.example.rishabh.everythingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EventHandling extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_handling);

        //creating event listeners as soon as the activity is created
        //refering the button
        Button myButton=(Button)findViewById(R.id.button2);
        myButton.setOnClickListener(
                //adding the method- creating the interface
                new Button.OnClickListener(){
                    public void onClick(View v){
                        //code for method
                        //refering text view
                        TextView myText=(TextView)findViewById(R.id.textView2);
                        myText.setText("lollll");
                    }
                }

        );

        //multiple event listeners
        myButton.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    @Override
                    public boolean onLongClick(View v) {
                        TextView myText=(TextView)findViewById(R.id.textView2);
                        myText.setText("long click");
                        return true;
                    }

                }
        );
    }
}

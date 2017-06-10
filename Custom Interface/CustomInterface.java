package com.example.rishabh.everythingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.EditText;
import android.content.res.Resources;
import android.util.TypedValue;

public class CustomInterface extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // creating a custom layout using java
        // Layout
        RelativeLayout myLayout=new RelativeLayout(this);
        myLayout.setBackgroundColor(Color.GREEN);

        //Button
        Button redButton=new Button(this);
        redButton.setText("Log in");
        redButton.setId(1);

        //username input
        EditText username=new EditText(this);
        username.setId(2);

        //rules for button and username
        RelativeLayout.LayoutParams buttondetails=new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        RelativeLayout.LayoutParams usernamedetails=new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        //adding rules to position username
        usernamedetails.addRule(RelativeLayout.ABOVE,redButton.getId());
        usernamedetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        usernamedetails.setMargins(0,0,0,50);


        //adding rules to position button
        buttondetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttondetails.addRule(RelativeLayout.CENTER_VERTICAL);

        Resources r=getResources();
        //convert dip to pixels
        int px=(int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200,r.getDisplayMetrics());
        username.setWidth(px);


        //adding items to layout
        myLayout.addView(redButton,buttondetails);
        myLayout.addView(username,usernamedetails);

        //adding layout to this activity
        setContentView(myLayout);
    }
}

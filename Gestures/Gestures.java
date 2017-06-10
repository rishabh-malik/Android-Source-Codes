package com.example.rishabh.everythingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;

public class Gestures extends AppCompatActivity implements GestureDetector.OnGestureListener,
GestureDetector.OnDoubleTapListener{

    private TextView myMsg;
    private GestureDetectorCompat gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestures);

        myMsg=(TextView)findViewById(R.id.textView3);
        //creating object of class gesture detector
        this.gestureDetector=new GestureDetectorCompat(this,this);
        //detect double tap
        gestureDetector.setOnDoubleTapListener(this);

    }

    /////////////////begin gestures///////////////////////////////////
    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        myMsg.setText("single tap confirmed");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        myMsg.setText("down tap confirmed");
        return true;
    }


    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        myMsg.setText("single tap upp confirmed");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        myMsg.setText("scroll confirmed");
        return true;
    }


    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        myMsg.setText("fling confirmed");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        myMsg.setText("long press confirmed");

    }

    @Override
    public void onShowPress(MotionEvent e) {
        myMsg.setText("show press confirmed");

    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        myMsg.setText("double tap confirmed");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        myMsg.setText("double tap confirmed");
        return true;
    }
    /////////////////////End gestures////////////////////////////////


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //to detect first the special gestures
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}

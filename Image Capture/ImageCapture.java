package com.example.rishabh.application;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImageCapture extends AppCompatActivity {

    static final int REQUEST_IMAGE_CAPTURE=1;
    //reference to image view
    ImageView myImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_capture);

        //reference to button
        Button myButon=(Button)findViewById(R.id.Capture);
        myImageView=(ImageView)findViewById(R.id.imageView);

        //Disable the button if camera not present
        if(!hasCamera()){
            myButon.setEnabled(false);
        }


    }
    //Check if user has camera
    private boolean hasCamera(){
        return getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_ANY);
    }

    //Launching camera
    public void takePhoto(View view){
        Intent i=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        //Take a picture and pass results along to onActivityResult
        startActivityForResult(i,REQUEST_IMAGE_CAPTURE);
    }

    //if want to return image


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode==REQUEST_IMAGE_CAPTURE && resultCode==RESULT_OK){
            //get the photo
        Bundle extras=data.getExtras();
        Bitmap photo=(Bitmap)extras.get("data");
        myImageView.setImageBitmap(photo);
    }
}}




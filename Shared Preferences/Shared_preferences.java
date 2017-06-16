package com.example.rishabh.shared_preferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Shared_preferences extends AppCompatActivity {

    EditText usernameInput;
    EditText password;
    TextView myText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences);

        usernameInput=(EditText)findViewById(R.id.editText);
        password=(EditText)findViewById(R.id.editText2);
        myText=(TextView)findViewById(R.id.textView3);

    }

    //save users info
    public void saveData(View view){
        //accessing shared preferences
        SharedPreferences sharedPreferences=getSharedPreferences("user info", Context.MODE_PRIVATE);
        //editing shared preferences
        SharedPreferences.Editor editor=sharedPreferences.edit();
        //key and value pairs
        editor.putString("username",usernameInput.getText().toString());
        editor.putString("password",password.getText().toString());
        editor.apply();

        Toast.makeText(this,"Saved!",Toast.LENGTH_LONG).show();
    }

    //print saved data
    public void display(View view){
        SharedPreferences sharedPreferences=getSharedPreferences("user info", Context.MODE_PRIVATE);
        //second parameter is what to return if not found the key ie return nothing
        String name=sharedPreferences.getString("username","");
        String pass=sharedPreferences.getString("password","");
        myText.setText(name +" " +pass);
    }
}

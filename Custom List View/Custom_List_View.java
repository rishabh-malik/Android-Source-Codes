package com.example.rishabh.lists;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Custom_List_View extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom__list__view);
        //making basic list of text items
        String[] foods={"Bacon","Candy","Tuna","Potato","Meat"};
        //making adaptor used to convert java code into list items
        ListAdapter myAdaptor=new Custom_Adapter(this,foods);
        ListView myListView=(ListView)findViewById(R.id.myListView);
        myListView.setAdapter(myAdaptor);
        //creating onclicklistener so that when items are clicked function happens
        myListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        //converting the position value into array
                        String food=String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(Custom_List_View.this,food,Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}

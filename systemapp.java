package com.example.salomi.systemapp;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class systemapp extends AppCompatActivity {
    Button b, b2, b3, b4, b5, b6, b7;
    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_systemapp);
        b = findViewById(R.id.button); ///////// browser
        b2 = findViewById(R.id.button2); ///////// cantact
        b3 = findViewById(R.id.button3); /////////// call
        b4 = findViewById(R.id.button4); ////// dialpad
        b5 = findViewById(R.id.button5); //////// call log
        b6 = findViewById(R.id.button6);  /// gallary
        b7 = findViewById(R.id.button7);////camera
        e1 = findViewById(R.id.editText);


    }

    public void ok(View view){
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        startActivity(i);

    }


    public void show(View view){
        Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("content://contacts/people"));
        startActivity(i);

    }
    public void hello(View view){
        String s1="tel"+e1.getText().toString();
        Intent i1=new Intent(Intent.ACTION_CALL);
        i1.setData(Uri.parse(s1));
        startActivity(i1);
    }

    public void onClick(View v) {
        //String s1="tel"+ed1.getText().toString();
        Intent i2 = new Intent(Intent.ACTION_DIAL);
        i2.setData(Uri.parse("tel:" + e1.getText().toString()));
        startActivity(i2);
    }
    public void call(View view){

        Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("content://call_log/calls/"));
        startActivity(i);

    }

        public void on(View view){
        Intent i =new Intent(Intent.ACTION_VIEW,Uri.parse("content://media/external/images/media"));
        startActivity(i);
        }

    public void set(View view){
        Intent i=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(i);
    }
}




package com.example.abderrahmene.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity2);
        Intent intent = getIntent()   ;
        Book b =  (Book) intent.getSerializableExtra("book");
      //  String text = intent.getStringExtra("message");
        TextView  textView = (TextView) findViewById(R.id.textView);
        textView.setText(b.getAuteur());

    }
}

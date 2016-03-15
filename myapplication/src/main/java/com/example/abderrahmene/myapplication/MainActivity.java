package com.example.abderrahmene.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ArrayAdapter arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  AutoCompleteTextView autoCompleteTextView =  (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        ListView t = (ListView) findViewById(R.id.ListView);
       /* String[] tab= {"Samedi","Dimanche","Lundi","Mardi","Mercredi","Jeudi","Vendredi"};
      /*  ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,tab);
        autoCompleteTextView.setAdapter(arrayAdapter);
        autoCompleteTextView.setThreshold(1); */
    /* arrayAdapter  = new ArrayAdapter(this,android.R.layout.simple_list_item_1,tab);
        t.setAdapter(arrayAdapter);
        t.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "vous avez selectionné un element", Toast.LENGTH_SHORT).show();
            }
        });
        EditText editText = (EditText) findViewById(R.id.editText);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            arrayAdapter.getFilter().filter(s);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


*/
              List<Book> bookList = new ArrayList<>()   ;
             for (int i=0;i<10;i++) {
                 Book book = new Book("SQL Server 2012", R.drawable.ic_sqlpc);
                 bookList.add(book);
             }
           CustomAdapter customAdapter = new CustomAdapter(this,bookList);
           t.setAdapter(customAdapter);


    }

   /* public void  afficher(View v)
    {
        if (v.getId()==R.id.button)
        {
            Toast.makeText(this, "message", Toast.LENGTH_SHORT).show();
        }
        if (v.getId()== R.id.checkBox) {
            CheckBox c = (CheckBox) v;
            if (c.isChecked()) {
                Toast.makeText(this, "message", Toast.LENGTH_SHORT).show();
            }
        }
    }*/



}

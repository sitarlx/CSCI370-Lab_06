package com.introtoandroid.dblab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Database;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import asyncs.LabDatabase;
import entities.Person;

public class MainActivity extends AppCompatActivity {

    private ListView lv;
    private Button btnSubmit;
    private Button btnList;
    private EditText editTxt;
    private Database labDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persons);

        lv = findViewById(R.id.DBlistview);
        btnSubmit = findViewById(R.id.button1);
        btnList = findViewById(R.id.button2);
        editTxt = findViewById(R.id.editText);

        labDB = Room.databaseBuilder(this, LabDatabase.class, Lab06Database).build();

        //final Person[] dataForDB;
        //dataForDB = new Person[]{};
        //final ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, dataForDB);
        //lv.setAdapter(adapter);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, editTxt.getText().toString(), Toast.LENGTH_LONG);
                toast.show();
            }
        });

        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, "List button clicked", Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }
}

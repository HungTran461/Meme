package com.example.b514.studywme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnAdd, btnSave, btnCancle;
    EditText txtName, txtAge, txtAddress;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initial();
        addEvents();
    }

    void addEvents(){
        btnAdd.setOnClickListener(handleAdd);
        btnSave.setOnClickListener(handleSave);
        btnCancle.setOnClickListener(handleCanle);
    }

    View.OnClickListener handleSave = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "You clickd save button", Toast.LENGTH_SHORT).show();
        }
    };
    View.OnClickListener handleCanle = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "You clickd cancle button", Toast.LENGTH_SHORT).show();
        }
    };
    View.OnClickListener handleAdd = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "You clickd add button", Toast.LENGTH_SHORT).show();
        }
    };

    void reset(){
        txtName.setText("");
        txtAge.setText("");
        txtAddress.setText("");
    }

    void initial(){
        btnAdd = (Button) findViewById(R.id.btn_add);
        btnSave = (Button) findViewById(R.id.btn_save);
        btnCancle = (Button) findViewById(R.id.btn_cancle);
        txtName = (EditText) findViewById(R.id.txt_name);
        txtAge = (EditText) findViewById(R.id.txt_age);
        txtAddress = (EditText) findViewById(R.id.txt_address);
        listView = (ListView)findViewById(R.id.listView);
    }
}

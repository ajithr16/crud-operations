package com.example.Patients;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.android_miniproject.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button insertbtn, updatebtn, deletebtn, viewbtn, searchbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        insertbtn = findViewById(R.id.Insertbtn);
        insertbtn.setOnClickListener(this);
        updatebtn = findViewById(R.id.updatebtn);
        updatebtn.setOnClickListener(this);
        deletebtn = findViewById(R.id.Deletebtn);
        deletebtn.setOnClickListener(this);
        viewbtn = findViewById(R.id.viewbtn);
        viewbtn.setOnClickListener(this);
        searchbtn = findViewById(R.id.searchbtn);
        searchbtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if (view.equals(insertbtn)) {
            Intent In = new Intent(MainActivity.this, InsertActivity.class);
            startActivity(In);
        } else if (view.equals(viewbtn)) {
            Intent In = new Intent(MainActivity.this, viewActivity.class);
            startActivity(In);
        } else if (view.equals(searchbtn)) {
            Intent In = new Intent(MainActivity.this, searchActivity.class);
            startActivity(In);
        } else if (view.equals(updatebtn)) {
            Intent In = new Intent(MainActivity.this, UpdateActivity.class);
            startActivity(In);
        } else if (view.equals(deletebtn)) {
            Intent In = new Intent( MainActivity.this, deleteActivity.class);
            startActivity(In);
        }
    }
}
package com.example.sivak.check_box;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox checkBox1, checkBox2, checkBox3;
    private Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox1 = findViewById(R.id.c1);
        checkBox2 = findViewById(R.id.c2);
        checkBox3 = findViewById(R.id.c3);
        b = findViewById(R.id.btn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer result = new StringBuffer();
                result.append("Pen : ").append(checkBox1.isChecked());
                result.append("\n Pencil : ").append(checkBox2.isChecked());
                result.append("\n Scale : ").append(checkBox3.isChecked());
                Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_SHORT).show();
            }
        });

        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox)v).isChecked()){
                    Toast.makeText(MainActivity.this, "Pen is checked", Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox)v).isChecked()){
                    Toast.makeText(MainActivity.this, "Pencil is checked", Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox)v).isChecked()){
                    Toast.makeText(MainActivity.this, "Box is checked", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

package com.example.switchtoggle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {
    Button btn1;
    ToggleButton check1;
    Switch check2;
    ConstraintLayout cl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        check1 = findViewById(R.id.check1);
        check2 = findViewById(R.id.check2);
        cl = findViewById(R.id.cl);
    }

    public void asd(View view) {
        if(check1.isChecked() && !(check2.isChecked()))
            cl.setBackgroundColor(Color.GREEN);
        if(check1.isChecked() && check2.isChecked())
            cl.setBackgroundColor(Color.BLUE);
        if(!(check1.isChecked()) && check2.isChecked())
            cl.setBackgroundColor(Color.RED);
        if(!(check1.isChecked()) && !(check2.isChecked()))
            cl.setBackgroundColor(Color.rgb(245,123,251));
    }
}
package com.example.albert01;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder adb;
    AlertDialog window1;
    ConstraintLayout CL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CL = findViewById(R.id.myLayout);
        adb = new AlertDialog.Builder(this);
    }

    public void albert1(View view) {
        adb.setTitle("Albert Levy");
        adb.setMessage("This is a message");
        window1 = adb.create();
        window1.show();
    }

    public void albert2(View view) {
        adb.setTitle("Albert Levy");
        adb.setMessage("Hello my name is albery Levy");
        adb.setIcon(R.drawable.ic_launcher_background);
        window1 = adb.create();
        window1.show();
    }

    public void albert3(View view) {
        adb.setTitle("Albert Levy");
        adb.setMessage("Hello my name is albery Levy");
        adb.setIcon(R.drawable.ic_launcher_background);
        adb.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        window1 = adb.create();
        window1.show();
    }

    public void albert4(View view) {
        adb.setTitle("Albert Levy");
        adb.setMessage("Hello my name is albery Levy");
        adb.setIcon(R.drawable.ic_launcher_background);
        adb.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        adb.setPositiveButton("Random color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                int R = (int)(Math.random() + 255);
                int G = (int)(Math.random() + 255);
                int B = (int)(Math.random() + 255);
                CL.setBackgroundColor(Color.rgb(R, G, B));
            }
        });
        window1 = adb.create();
        window1.show();
    }

    public void albert5(View view) {
    }
}
package com.example.albert01;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder adb;
    AlertDialog window1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adb = new AlertDialog.Builder(this);
    }

    public void albert1(View view) {
        adb.setTitle("Albert Levy");
        adb.setMessage("Hello my name is albery Levy");
        adb.setIcon(R.drawable.albert);
        window1 = adb.create();
        window1.show();
    }

    public void albert2(View view) {
    }

    public void albert3(View view) {
    }

    public void albert4(View view) {
    }

    public void albert5(View view) {
    }
}
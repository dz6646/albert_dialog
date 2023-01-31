package com.example.albert01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * The type Main activity.
 */
public class MainActivity extends AppCompatActivity {
    /**
     * The Adb is the AlertDialogBuilder which is used to build the alert dialogs
     */
    AlertDialog.Builder adb;
    /**
     * The Window 1 is the window that pops up when the adb is toggled
     */
    AlertDialog window1;
    /**
     * The Cl is the layout of the main screen
     */
    ConstraintLayout CL;
    Intent si;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CL = findViewById(R.id.myLayout);
        adb = new AlertDialog.Builder(this);
        si = new Intent(this, credits.class);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        startActivity(si);
        return true;
    }

    /**
     * Albert 1.
     * is the function of the first button (first task of the hw)
     * @param view the view
     */
    public void albert1(View view) {
        adb.setTitle("Albert Levy");
        adb.setMessage("This is a message");
        window1 = adb.create();
        window1.show();
    }

    /**
     * Albert 2.
     * THis is the function of the second task
     * @param view the view
     */
    public void albert2(View view) {
        adb.setTitle("Albert Levy");
        adb.setMessage("Hello my name is albery Levy");
        adb.setIcon(R.drawable.ic_launcher_background);
        window1 = adb.create();
        window1.show();
    }

    /**
     * Albert 3.
     * This is the function of the third task
     * @param view the view
     */
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

    /**
     * Albert 4.
     * This is the function of the fourth task
     * @param view the view
     */
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
                int R = (int)(Math.random() * 255);
                int G = (int)(Math.random() * 255);
                int B = (int)(Math.random() * 255);
                CL.setBackgroundColor(Color.rgb(R, G, B));
            }
        });
        window1 = adb.create();
        window1.show();
    }

    /**
     * Albert 5.
     * This is the function of the fifth task
     * @param view the view
     */
    public void albert5(View view) {
        adb.setTitle("Random COlor");
        adb.setMessage("Random color");
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
                int R = (int)(Math.random() * 255);
                int G = (int)(Math.random() * 255);
                int B = (int)(Math.random() * 255);
                CL.setBackgroundColor(Color.rgb(R, G, B));
            }
        });
        adb.setNeutralButton("Return to white", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                CL.setBackgroundColor(Color.rgb(255, 255, 255));
            }
        });
        window1 = adb.create();
        window1.show();
    }
}
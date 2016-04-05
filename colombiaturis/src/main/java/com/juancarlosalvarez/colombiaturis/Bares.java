package com.juancarlosalvarez.colombiaturis;

import android.app.AlertDialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Bares extends AppCompatActivity {


    ImageButton eBar1, eBar2, eBar3;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bares);

        eBar1 = (ImageButton) findViewById(R.id.eBar1);
        eBar2 = (ImageButton) findViewById(R.id.eBar2);
        eBar3 = (ImageButton) findViewById(R.id.eBar3);


        eBar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setMessage(R.string.InfoBar1);


                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });

        eBar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setMessage(R.string.InfoBar2);


                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });

        eBar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setMessage(R.string.InfoBar3);


                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });






    }




}

package com.juancarlosalvarez.colombiaturis;

import android.app.AlertDialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SitiosTuris extends AppCompatActivity {

    ImageButton eSitios1, eSitios2, eSitios3;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitios_turis);


        eSitios1 = (ImageButton) findViewById(R.id.eSitios1);
        eSitios2 = (ImageButton) findViewById(R.id.eSitios2);
        eSitios3 = (ImageButton) findViewById(R.id.eSitios3);


        eSitios1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setMessage(R.string.InfoSitios1);


                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });

        eSitios2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setMessage(R.string.InfoSitios2);


                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });

        eSitios3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setMessage(R.string.InfoSitios3);


                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });






    }




}


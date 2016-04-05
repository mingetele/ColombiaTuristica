package com.juancarlosalvarez.colombiaturis;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.Nullable;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Hoteles extends AppCompatActivity {


    ImageButton eHotel1, eHotel2, eHotel3;
    Context context = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles);

        eHotel1 = (ImageButton) findViewById(R.id.eHotel1);
        eHotel2 = (ImageButton) findViewById(R.id.eHotel2);
        eHotel3 = (ImageButton) findViewById(R.id.eHotel3);



        eHotel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setMessage(R.string.InfoHotel1);


                                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });

        eHotel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setMessage(R.string.InfoHotel2);


                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });

        eHotel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setMessage(R.string.InfoHotel3);


                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });






    }




}

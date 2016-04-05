package com.juancarlosalvarez.colombiaturis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.eHotel){
            Intent intent = new Intent(this, Hoteles.class);
            startActivity(intent);
        }
        if (id == R.id.eBares){
            Intent intent = new Intent(this, Bares.class);
            startActivity(intent);
        }
        if (id == R.id.eSitios){
            Intent intent = new Intent(this, SitiosTuris.class);
            startActivity(intent);
        }
        if (id == R.id.eInfoDe){
            Intent intent = new Intent(this, InfoDemogra.class);
            startActivity(intent);
        }
        if (id == R.id.eAcercaDe){
            Intent intent = new Intent(this, AcercaDe.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
        }



}

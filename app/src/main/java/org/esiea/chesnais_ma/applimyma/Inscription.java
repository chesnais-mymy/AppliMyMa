package org.esiea.chesnais_ma.applimyma;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

public class Inscription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/
        Button confirm = (Button) findViewById(R.id.button3);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // if (true)
//                showDialog(0);
               // else {

                    Intent i = new Intent(getApplicationContext(), Telechargement.class);
                    startActivity(i);
           //     }

            }
        });}

    @Override
    public Dialog onCreateDialog(int id) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getApplication());
        builder.setMessage("MISSILE PRET")
                .setPositiveButton("Fire", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // FIRE ZE MISSILES!
                    }
                })
                .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User cancelled the dialog
                    }
                });
        // Create the AlertDialog object and return it
        return builder.create();
    }
    /*public Dialog onCreateDialog(int id) {
        AlertDialog dialog = null;
        if (id == 0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
            builder.setMessage(R.string.dialog_msg)
                    .setTitle(R.string.dialog_title)
                    .setItems(R.array.city_names, new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(getApplication(), "You used the " + which + " item.", Toast.LENGTH_LONG).show();
                        }
                    });

            builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    // User clicked OK button
                    Toast.makeText(getApplication(), "You confirmed", Toast.LENGTH_LONG).show();
                }
            });
            builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    // User cancelled the dialog
                    Toast.makeText(getApplicationContext(), "You canceled your choice", Toast.LENGTH_LONG).show();
                }
            });

            dialog = builder.create();
        }
        dialog.setContentView(R.layout.dialog);
        return dialog;
    }*/



}


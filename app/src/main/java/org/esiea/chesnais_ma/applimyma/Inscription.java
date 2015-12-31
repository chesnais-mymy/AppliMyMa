package org.esiea.chesnais_ma.applimyma;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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

        /* test
        Toast.makeText(getApplicationContext(),"test = "+getIntent().getStringExtra("country")+getIntent().getStringExtra("ville")+getIntent().getStringExtra("transport")+getIntent().getStringExtra("environment"),Toast.LENGTH_LONG).show();
        */
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // if (true)
//             showDialog(0);
                // else {
                EditText text = (EditText) findViewById(R.id.editText);
                Editable first_name = text.getText();
                EditText text2 = (EditText) findViewById(R.id.editText2);
                Editable last_name = text2.getText();
                EditText text3 = (EditText) findViewById(R.id.editText3);
                Editable email = text3.getText();
                EditText text4 = (EditText) findViewById(R.id.editText4);
                Editable phone = text4.getText();
                //Toast.makeText(getApplicationContext(),first_name,Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), Telechargement.class);
                i.putExtra("country", getIntent().getStringExtra("country"));
                i.putExtra("ville", getIntent().getStringExtra("ville"));
                i.putExtra("transport",getIntent().getStringExtra("transport"));
                i.putExtra("environment", getIntent().getStringExtra("environment"));

                i.putExtra("first_name",first_name.toString());
                i.putExtra("last_name",last_name.toString());
                i.putExtra("email_address",email.toString());
                i.putExtra("phone_number",phone.toString());
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

                    }
                });
        // Create the AlertDialog object and return it
        return builder.create();
    }
}


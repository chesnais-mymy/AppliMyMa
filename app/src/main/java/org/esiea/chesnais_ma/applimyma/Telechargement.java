package org.esiea.chesnais_ma.applimyma;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Telechargement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telechargement);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        new FireMissilesDialogFragment().show(getFragmentManager(), "hmm");


        Button telecharger = (Button) findViewById(R.id.button4);

        telecharger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Une notification s'est crée", Toast.LENGTH_SHORT).show();

                NotificationCompat.Builder notification = new NotificationCompat.Builder(Telechargement.this);

                notification.setSmallIcon(R.drawable.ic_launcher);
                notification.setTicker("Téléchargement en cours!!");
                notification.setWhen(System.currentTimeMillis());
                notification.setContentTitle("Récapitulatif de commande");
                notification.setContentText("Votre récapitulatif de commande est en cours de se télécharger");

                Uri sound = RingtoneManager.getDefaultUri(Notification.DEFAULT_SOUND);
                notification.setSound(sound);

                Bitmap picture = BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher);
                notification.setLargeIcon(picture);

                PendingIntent myPendingIntent;
                Intent myIntent = new Intent();
                Context myContext = getApplicationContext();

                myIntent.setClass(myContext, recapitulatif.class);
                myIntent.putExtra("ID", 1);
                myPendingIntent = PendingIntent.getActivity(myContext, 0, myIntent, 0);
                notification.setContentIntent(myPendingIntent);

                Notification notif = notification.build();
                NotificationManager notifmanager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                notifmanager.notify(1, notif);
            }
        });

        Button jsonButton = (Button) findViewById(R.id.buttonjson);
        jsonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Une notification s'est crée", Toast.LENGTH_SHORT).show();

                NotificationCompat.Builder notification = new NotificationCompat.Builder(Telechargement.this);

                notification.setSmallIcon(R.drawable.ic_launcher);
                notification.setTicker("Téléchargement en cours!!");
                notification.setWhen(System.currentTimeMillis());
                notification.setContentTitle("Téléchargement de la liste de bière");
                notification.setContentText("La liste de bière proposé pour votre trajet");

                Uri sound = RingtoneManager.getDefaultUri(Notification.DEFAULT_SOUND);
                notification.setSound(sound);

                Bitmap picture = BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher);
                notification.setLargeIcon(picture);

                PendingIntent myPendingIntent;
                Intent myIntent = new Intent();
                Context myContext = getApplicationContext();

                myIntent.setClass(myContext, SecondeActivity.class);
                myIntent.putExtra("ID", 1);
                myPendingIntent = PendingIntent.getActivity(myContext, 0, myIntent, 0);
                notification.setContentIntent(myPendingIntent);

                Notification notif = notification.build();
                NotificationManager notifmanager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                notifmanager.notify(1, notif);

               /* Intent new_intent = new Intent(getApplicationContext(),SecondeActivity.class);
                startActivity(new_intent);*/
            }
        });

    }

    /*public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
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
    }*/

}

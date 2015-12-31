package org.esiea.chesnais_ma.applimyma;

import android.app.NotificationManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class recapitulatif extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recapitulatif);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView cart = (TextView) findViewById(R.id.textView5);
        cart.setText(
                "Votre récapitulatif est :" +
                        "\n Pays choisi : " + getIntent().getStringExtra("country")
                + "\n Ville choisie : " + getIntent().getStringExtra("ville")
                        + "\n Transport choisi : " + getIntent().getStringExtra("transport")
                        + "\n Environnement choisi : " + getIntent().getStringExtra("environment")
                        + "\n\n Prénom : " + getIntent().getStringExtra("first_name")
                        + "\n Nom : " + getIntent().getStringExtra("last_name")
                        + "\n Adresse e-mail : " + getIntent().getStringExtra("email_address")
                        + "\n Numéro de téléphone : " + getIntent().getStringExtra("phone_number")

                + "\n\n\n Comme vous êtes le tout premier client, vous obtenez le droit gratuit de" +
                        " réaliser ce voyage avec n'importe quel partenaire, à n'importe quel moment !"
        );

        NotificationManager notifmanager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        int ID = getIntent().getIntExtra("ID", 8);
        notifmanager.cancel(ID);
    }

}

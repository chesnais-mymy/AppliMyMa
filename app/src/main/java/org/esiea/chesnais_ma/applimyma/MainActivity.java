package org.esiea.chesnais_ma.applimyma;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Button next = (Button) findViewById(R.id.button);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), villes.class);
                startActivity(i);

            }
        });

        Button button = (Button) findViewById(R.id.imageButton);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Vous avez choisi l'espagne ", Toast.LENGTH_SHORT).show();
            }

        });

        Button button2 = (Button) findViewById(R.id.imageButton2);
        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Vous avez choisi le maroc ", Toast.LENGTH_SHORT).show();
            }

        });

        Button button3 = (Button) findViewById(R.id.imageButton3);
        button3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Vous avez choisi la Tunisie ", Toast.LENGTH_SHORT).show();
            }

        });

        Button button4 = (Button) findViewById(R.id.imageButton4);
        button4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Vous avez choisi la Chine ", Toast.LENGTH_SHORT).show();
            }

        });

        Button button5 = (Button) findViewById(R.id.imageButton5);
        button5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Vous avez choisi l'Afrique du Sud ", Toast.LENGTH_SHORT).show();
            }

        });

        Button button6 = (Button) findViewById(R.id.imageButton6);
        button6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Vous avez choisi le Portugal ", Toast.LENGTH_SHORT).show();
            }

        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

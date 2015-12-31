package org.esiea.chesnais_ma.applimyma.testing;

import android.os.Bundle;

import org.esiea.chesnais_ma.applimyma.R;

/**
 * Created by davidma on 31/12/15.
 */
public class PreferenceActivity extends android.preference.PreferenceActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preference);
    }
}

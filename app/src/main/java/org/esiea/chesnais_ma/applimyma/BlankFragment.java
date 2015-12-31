package org.esiea.chesnais_ma.applimyma;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

//Test qui marche pas trop
public class BlankFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
            // Load the preferences from an XML resource
            addPreferencesFromResource(R.xml.preference);

    }
}

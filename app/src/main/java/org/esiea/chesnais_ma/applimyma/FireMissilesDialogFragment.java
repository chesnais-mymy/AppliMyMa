package org.esiea.chesnais_ma.applimyma;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by davidma on 31/12/15.
 */
public class FireMissilesDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setMessage(R.string.dialog_msg)
                    .setTitle(R.string.dialog_title)
                    /*.setItems(R.array.city_names, new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(getActivity(), "You used the " + which + " item.", Toast.LENGTH_LONG).show();
                        }
                    })*/;

            builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    // User clicked OK button
                    Toast.makeText(getActivity(), "You confirmed", Toast.LENGTH_LONG).show();
                }
            });
            builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    // User cancelled the dialog
                    Toast.makeText(getActivity(), "You canceled your choice", Toast.LENGTH_LONG).show();
                }
            });
        /*AlertDialog dialog = builder.create();
        dialog.setContentView(R.layout.dialog);*/
        return  builder.create();
    }
}

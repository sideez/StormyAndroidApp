package com.sideez.stormy.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

import com.sideez.stormy.R;

/**
 * Created by sideez on 2015-07-05.
 */
public class AlertDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(context.getString(R.string.error_dialog_title))
                .setMessage(context.getString(R.string.error_dialog_msg))
                .setPositiveButton(context.getString(R.string.error_dialog_button), null);

        return builder.create();
    }
}

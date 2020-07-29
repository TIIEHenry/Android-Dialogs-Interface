package tiiehenry.android.ui.dialogs.api.callback;

import androidx.annotation.NonNull;

import tiiehenry.android.ui.dialogs.api.DialogAction;
import tiiehenry.android.ui.dialogs.api.IDialog;


public interface SingleButtonCallback {

    default void onPositive(@NonNull IDialog dialog) {
        onClick(dialog, DialogAction.POSITIVE);
    }

    default void onNegative(@NonNull IDialog dialog) {
        onClick(dialog, DialogAction.NEGATIVE);
    }

    default void onNeutral(@NonNull IDialog dialog) {
        onClick(dialog, DialogAction.NEUTRAL);
    }

    void onClick(@NonNull IDialog dialog, @NonNull DialogAction which);
}
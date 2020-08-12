package tiiehenry.android.ui.dialogs.api.callback;

import androidx.annotation.NonNull;

import tiiehenry.android.ui.dialogs.api.DialogAction;
import tiiehenry.android.ui.dialogs.api.IDialog;
import tiiehenry.android.ui.dialogs.api.callback.button.OnNegativeCallback;
import tiiehenry.android.ui.dialogs.api.callback.button.OnNeutralCallback;
import tiiehenry.android.ui.dialogs.api.callback.button.OnPositiveCallback;


public interface SingleButtonCallback extends OnPositiveCallback, OnNegativeCallback, OnNeutralCallback {

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
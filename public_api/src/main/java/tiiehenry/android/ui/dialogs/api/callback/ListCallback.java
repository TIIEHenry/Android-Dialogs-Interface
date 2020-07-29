package tiiehenry.android.ui.dialogs.api.callback;

import android.view.View;

import tiiehenry.android.ui.dialogs.api.IDialog;

/**
 * A callback used for regular list dialogs.
 */
public interface ListCallback {

    void onSelection(IDialog dialog, View itemView, int position, CharSequence text);
}
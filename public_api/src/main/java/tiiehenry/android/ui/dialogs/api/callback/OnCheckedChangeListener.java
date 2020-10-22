package tiiehenry.android.ui.dialogs.api.callback;

import android.widget.CompoundButton;

public interface OnCheckedChangeListener {
    /**
     * Called when the checked state of a compound button has changed.
     *
     * @param isChecked The new checked state of buttonView.
     */
    void onCheckedChanged(boolean isChecked);
}

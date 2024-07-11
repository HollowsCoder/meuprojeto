package j4;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;

public final class c extends DialogFragment {

    /* renamed from: o  reason: collision with root package name */
    public Dialog f6538o;

    /* renamed from: p  reason: collision with root package name */
    public DialogInterface.OnCancelListener f6539p;

    public final void onCancel(@RecentlyNonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f6539p;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.f6538o == null) {
            setShowsDialog(false);
        }
        return this.f6538o;
    }

    public final void show(@RecentlyNonNull FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}

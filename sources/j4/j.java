package j4;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import androidx.fragment.app.m;
import androidx.fragment.app.y;

public class j extends m {
    public Dialog x0;
    public DialogInterface.OnCancelListener y0;

    public final Dialog X(Bundle bundle) {
        Dialog dialog = this.x0;
        if (dialog == null) {
            this.f1215o0 = false;
        }
        return dialog;
    }

    public final void a0(@RecentlyNonNull y yVar, String str) {
        super.a0(yVar, str);
    }

    public final void onCancel(@RecentlyNonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.y0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}

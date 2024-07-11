package e;

import android.app.Dialog;
import android.os.Bundle;

public class m extends androidx.fragment.app.m {
    public Dialog X(Bundle bundle) {
        return new l(k(), this.f1213m0);
    }

    public final void Z(Dialog dialog, int i10) {
        if (dialog instanceof l) {
            l lVar = (l) dialog;
            if (!(i10 == 1 || i10 == 2)) {
                if (i10 == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            lVar.a().q(1);
            return;
        }
        super.Z(dialog, i10);
    }
}

package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import e.m;

public class c extends m {
    public final void V() {
        Dialog dialog = this.f1219s0;
        if (dialog instanceof b) {
            b bVar = (b) dialog;
            if (bVar.f3310q == null) {
                bVar.c();
            }
            boolean z = bVar.f3310q.C;
        }
        W(false, false);
    }

    public Dialog X(Bundle bundle) {
        return new b(k(), this.f1213m0);
    }
}

package com.google.android.material.datepicker;

import android.view.View;

public final class p implements View.OnClickListener {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ o f3447o;

    public p(o oVar) {
        this.f3447o = oVar;
    }

    public final void onClick(View view) {
        o oVar = this.f3447o;
        oVar.N0.setEnabled(oVar.C0.C());
        oVar.L0.toggle();
        oVar.g0(oVar.L0);
        oVar.e0();
    }
}

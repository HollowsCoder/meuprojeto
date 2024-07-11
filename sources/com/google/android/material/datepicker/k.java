package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.datepicker.g;

public final class k implements View.OnClickListener {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ g f3438o;

    public k(g gVar) {
        this.f3438o = gVar;
    }

    public final void onClick(View view) {
        g gVar = this.f3438o;
        g.e eVar = gVar.f3423m0;
        g.e eVar2 = g.e.YEAR;
        if (eVar == eVar2) {
            gVar.Y(g.e.DAY);
        } else if (eVar == g.e.DAY) {
            gVar.Y(eVar2);
        }
    }
}

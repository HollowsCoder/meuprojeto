package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.datepicker.g;
import java.util.Calendar;

public final class c0 implements View.OnClickListener {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f3411o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ d0 f3412p;

    public c0(d0 d0Var, int i10) {
        this.f3412p = d0Var;
        this.f3411o = i10;
    }

    public final void onClick(View view) {
        d0 d0Var = this.f3412p;
        s g10 = s.g(this.f3411o, d0Var.d.f3422l0.f3453p);
        g<?> gVar = d0Var.d;
        a aVar = gVar.f3421k0;
        s sVar = aVar.f3384o;
        Calendar calendar = sVar.f3452o;
        Calendar calendar2 = g10.f3452o;
        if (calendar2.compareTo(calendar) < 0) {
            g10 = sVar;
        } else {
            s sVar2 = aVar.f3385p;
            if (calendar2.compareTo(sVar2.f3452o) > 0) {
                g10 = sVar2;
            }
        }
        gVar.X(g10);
        gVar.Y(g.e.DAY);
    }
}

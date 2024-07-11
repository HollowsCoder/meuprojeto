package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

public final class m implements View.OnClickListener {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ v f3441o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ g f3442p;

    public m(g gVar, v vVar) {
        this.f3442p = gVar;
        this.f3441o = vVar;
    }

    public final void onClick(View view) {
        g gVar = this.f3442p;
        int O0 = ((LinearLayoutManager) gVar.f3426p0.getLayoutManager()).O0() - 1;
        if (O0 >= 0) {
            Calendar b10 = b0.b(this.f3441o.f3466e.f3384o.f3452o);
            b10.add(2, O0);
            gVar.X(new s(b10));
        }
    }
}

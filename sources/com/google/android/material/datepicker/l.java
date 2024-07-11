package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

public final class l implements View.OnClickListener {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ v f3439o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ g f3440p;

    public l(g gVar, v vVar) {
        this.f3440p = gVar;
        this.f3439o = vVar;
    }

    public final void onClick(View view) {
        g gVar = this.f3440p;
        int N0 = ((LinearLayoutManager) gVar.f3426p0.getLayoutManager()).N0() + 1;
        if (N0 < gVar.f3426p0.getAdapter().a()) {
            Calendar b10 = b0.b(this.f3439o.f3466e.f3384o.f3452o);
            b10.add(2, N0);
            gVar.X(new s(b10));
        }
    }
}

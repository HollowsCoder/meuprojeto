package com.google.android.material.datepicker;

import android.view.View;
import com.karumi.dexter.R;
import i0.a;
import j0.b;

public final class i extends a {
    public final /* synthetic */ g d;

    public i(g gVar) {
        this.d = gVar;
    }

    public final void d(View view, b bVar) {
        int i10;
        this.f5951a.onInitializeAccessibilityNodeInfo(view, bVar.f6386a);
        g gVar = this.d;
        if (gVar.f3428r0.getVisibility() == 0) {
            i10 = R.string.mtrl_picker_toggle_to_year_selection;
        } else {
            i10 = R.string.mtrl_picker_toggle_to_day_selection;
        }
        bVar.j(gVar.s(i10));
    }
}

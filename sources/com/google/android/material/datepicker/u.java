package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.g;
import java.util.Iterator;

public final class u implements AdapterView.OnItemClickListener {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f3464o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ v f3465p;

    public u(v vVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f3465p = vVar;
        this.f3464o = materialCalendarGridView;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j8) {
        boolean z;
        MaterialCalendarGridView materialCalendarGridView = this.f3464o;
        t a10 = materialCalendarGridView.getAdapter();
        if (i10 < a10.b() || i10 > a10.d()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            g.f fVar = this.f3465p.f3468g;
            long longValue = materialCalendarGridView.getAdapter().getItem(i10).longValue();
            g gVar = g.this;
            if (gVar.f3421k0.f3386q.z(longValue)) {
                gVar.f3420j0.n();
                Iterator<w<S>> it = gVar.f3471h0.iterator();
                while (it.hasNext()) {
                    it.next().a(gVar.f3420j0.M());
                }
                gVar.f3426p0.getAdapter().f1628a.b();
                RecyclerView recyclerView = gVar.f3425o0;
                if (recyclerView != null) {
                    recyclerView.getAdapter().f1628a.b();
                }
            }
        }
    }
}

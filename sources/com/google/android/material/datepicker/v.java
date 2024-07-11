package com.google.android.material.datepicker;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.g;
import com.karumi.dexter.R;
import i0.b0;
import i0.w;
import java.util.Calendar;
import java.util.WeakHashMap;

public final class v extends RecyclerView.f<a> {
    public final Context d;

    /* renamed from: e  reason: collision with root package name */
    public final a f3466e;

    /* renamed from: f  reason: collision with root package name */
    public final d<?> f3467f;

    /* renamed from: g  reason: collision with root package name */
    public final g.f f3468g;

    /* renamed from: h  reason: collision with root package name */
    public final int f3469h;

    public static class a extends RecyclerView.c0 {
        public final TextView u;

        /* renamed from: v  reason: collision with root package name */
        public final MaterialCalendarGridView f3470v;

        public a(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.u = textView;
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            new i0.v().e(textView, Boolean.TRUE);
            this.f3470v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (!z) {
                textView.setVisibility(8);
            }
        }
    }

    public v(ContextThemeWrapper contextThemeWrapper, d dVar, a aVar, g.d dVar2) {
        int i10;
        Calendar calendar = aVar.f3384o.f3452o;
        s sVar = aVar.f3387r;
        if (calendar.compareTo(sVar.f3452o) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (sVar.f3452o.compareTo(aVar.f3385p.f3452o) <= 0) {
            int i11 = t.f3458t;
            int i12 = g.f3418s0;
            int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i11;
            if (o.c0(contextThemeWrapper)) {
                i10 = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
            } else {
                i10 = 0;
            }
            this.d = contextThemeWrapper;
            this.f3469h = dimensionPixelSize + i10;
            this.f3466e = aVar;
            this.f3467f = dVar;
            this.f3468g = dVar2;
            if (!this.f1628a.a()) {
                this.f1629b = true;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    public final int a() {
        return this.f3466e.f3389t;
    }

    public final long b(int i10) {
        Calendar b10 = b0.b(this.f3466e.f3384o.f3452o);
        b10.add(2, i10);
        return new s(b10).f3452o.getTimeInMillis();
    }

    public final void d(RecyclerView.c0 c0Var, int i10) {
        a aVar = (a) c0Var;
        a aVar2 = this.f3466e;
        Calendar b10 = b0.b(aVar2.f3384o.f3452o);
        b10.add(2, i10);
        s sVar = new s(b10);
        aVar.u.setText(sVar.l(aVar.f1609a.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar.f3470v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !sVar.equals(materialCalendarGridView.getAdapter().f3459o)) {
            t tVar = new t(sVar, this.f3467f, aVar2);
            materialCalendarGridView.setNumColumns(sVar.f3455r);
            materialCalendarGridView.setAdapter((ListAdapter) tVar);
        } else {
            materialCalendarGridView.invalidate();
            t a10 = materialCalendarGridView.getAdapter();
            for (Long longValue : a10.f3461q) {
                a10.f(materialCalendarGridView, longValue.longValue());
            }
            d<?> dVar = a10.f3460p;
            if (dVar != null) {
                for (Long longValue2 : dVar.I()) {
                    a10.f(materialCalendarGridView, longValue2.longValue());
                }
                a10.f3461q = dVar.I();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new u(this, materialCalendarGridView));
    }

    public final RecyclerView.c0 e(RecyclerView recyclerView) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, recyclerView, false);
        if (!o.c0(recyclerView.getContext())) {
            return new a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.o(-1, this.f3469h));
        return new a(linearLayout, true);
    }
}

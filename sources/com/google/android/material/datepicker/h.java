package com.google.android.material.datepicker;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import h0.b;
import java.util.Calendar;

public final class h extends RecyclerView.m {

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f3432a = b0.d((Calendar) null);

    /* renamed from: b  reason: collision with root package name */
    public final Calendar f3433b = b0.d((Calendar) null);

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f3434c;

    public h(g gVar) {
        this.f3434c = gVar;
    }

    public final void e(Canvas canvas, RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof d0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            d0 d0Var = (d0) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            for (b<Long, Long> bVar : this.f3434c.f3420j0.y()) {
                bVar.getClass();
            }
        }
    }
}

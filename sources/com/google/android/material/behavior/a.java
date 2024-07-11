package com.google.android.material.behavior;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.i;
import i0.b0;
import i0.w;
import j0.d;
import java.util.WeakHashMap;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f3253a;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f3253a = swipeDismissBehavior;
    }

    public final boolean a(View view) {
        boolean z;
        SwipeDismissBehavior swipeDismissBehavior = this.f3253a;
        boolean z10 = false;
        if (!swipeDismissBehavior.s(view)) {
            return false;
        }
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        if (w.e.d(view) == 1) {
            z = true;
        } else {
            z = false;
        }
        int i10 = swipeDismissBehavior.d;
        if ((i10 == 0 && z) || (i10 == 1 && !z)) {
            z10 = true;
        }
        int width = view.getWidth();
        if (z10) {
            width = -width;
        }
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        SwipeDismissBehavior.b bVar = swipeDismissBehavior.f3241b;
        if (bVar != null) {
            ((i) bVar).a(view);
        }
        return true;
    }
}

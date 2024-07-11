package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import i0.b0;
import i0.w;
import java.util.ArrayList;
import java.util.WeakHashMap;

@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: a  reason: collision with root package name */
    public int f3677a = 0;

    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ View f3678o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ int f3679p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ f6.a f3680q;

        public a(View view, int i10, f6.a aVar) {
            this.f3678o = view;
            this.f3679p = i10;
            this.f3680q = aVar;
        }

        public final boolean onPreDraw() {
            View view = this.f3678o;
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f3677a == this.f3679p) {
                f6.a aVar = this.f3680q;
                expandableBehavior.s((View) aVar, view, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public abstract boolean b(View view, View view2);

    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        boolean z;
        int i10;
        f6.a aVar = (f6.a) view2;
        int i11 = 2;
        if (!aVar.a() ? this.f3677a != 1 : !((i10 = this.f3677a) == 0 || i10 == 2)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        if (aVar.a()) {
            i11 = 1;
        }
        this.f3677a = i11;
        s((View) aVar, view, aVar.a(), true);
        return true;
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
        f6.a aVar;
        boolean z;
        int i11;
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        if (!w.g.c(view)) {
            ArrayList f10 = coordinatorLayout.f(view);
            int size = f10.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    aVar = null;
                    break;
                }
                View view2 = (View) f10.get(i12);
                if (b(view, view2)) {
                    aVar = (f6.a) view2;
                    break;
                }
                i12++;
            }
            if (aVar != null) {
                int i13 = 2;
                if (!aVar.a() ? this.f3677a != 1 : !((i11 = this.f3677a) == 0 || i11 == 2)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    if (aVar.a()) {
                        i13 = 1;
                    }
                    this.f3677a = i13;
                    view.getViewTreeObserver().addOnPreDrawListener(new a(view, i13, aVar));
                }
            }
        }
        return false;
    }

    public abstract void s(View view, View view2, boolean z, boolean z10);
}

package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import j0.d;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f3231a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f3232b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f3233c;
    public final /* synthetic */ int d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f3234e;

    public b(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
        this.f3234e = baseBehavior;
        this.f3231a = coordinatorLayout;
        this.f3232b = appBarLayout;
        this.f3233c = view;
        this.d = i10;
    }

    public final boolean a(View view) {
        this.f3234e.D(this.f3231a, this.f3232b, this.f3233c, this.d, new int[]{0, 0});
        return true;
    }
}

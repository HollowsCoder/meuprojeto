package com.google.android.material.appbar;

import android.view.View;
import j0.d;

public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f3235a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f3236b;

    public c(AppBarLayout appBarLayout, boolean z) {
        this.f3235a = appBarLayout;
        this.f3236b = z;
    }

    public final boolean a(View view) {
        this.f3235a.setExpanded(this.f3236b);
        return true;
    }
}

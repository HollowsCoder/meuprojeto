package com.google.android.material.snackbar;

import android.view.View;

public final class j implements View.OnClickListener {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f3568o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Snackbar f3569p;

    public j(Snackbar snackbar, View.OnClickListener onClickListener) {
        this.f3569p = snackbar;
        this.f3568o = onClickListener;
    }

    public final void onClick(View view) {
        this.f3568o.onClick(view);
        this.f3569p.b(1);
    }
}

package com.google.android.material.snackbar;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

public final class i implements SwipeDismissBehavior.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f3567a;

    public i(BaseTransientBottomBar baseTransientBottomBar) {
        this.f3567a = baseTransientBottomBar;
    }

    public final void a(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.f3567a.b(0);
    }
}

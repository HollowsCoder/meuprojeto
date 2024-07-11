package com.squareup.picasso;

import android.view.View;
import android.view.ViewTreeObserver;

public final class g implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public g() {
        throw null;
    }

    public final boolean onPreDraw() {
        throw null;
    }

    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(this);
    }

    public final void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
    }
}

package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

public final class f implements View.OnTouchListener {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ GestureDetector f3676o;

    public f(GestureDetector gestureDetector) {
        this.f3676o = gestureDetector;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f3676o.onTouchEvent(motionEvent);
        }
        return false;
    }
}

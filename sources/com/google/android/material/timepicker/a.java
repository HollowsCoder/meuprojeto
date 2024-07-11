package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

public final class a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f3672o;

    public a(ClockFaceView clockFaceView) {
        this.f3672o = clockFaceView;
    }

    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f3672o;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.H.f3664p) - clockFaceView.O;
        if (height != clockFaceView.F) {
            clockFaceView.F = height;
            clockFaceView.k();
            int i10 = clockFaceView.F;
            ClockHandView clockHandView = clockFaceView.H;
            clockHandView.f3670x = i10;
            clockHandView.invalidate();
        }
        return true;
    }
}

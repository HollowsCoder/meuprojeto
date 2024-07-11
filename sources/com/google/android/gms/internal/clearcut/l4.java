package com.google.android.gms.internal.clearcut;

import android.database.ContentObserver;
import android.os.Handler;
import com.google.android.gms.internal.measurement.m4;

public final class l4 extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2503a = 1;

    public l4() {
        super((Handler) null);
    }

    public final void onChange(boolean z) {
        switch (this.f2503a) {
            case 0:
                k4.f2480e.set(true);
                return;
            default:
                m4.f2823h.incrementAndGet();
                return;
        }
    }

    public l4(int i10) {
        super((Handler) null);
    }
}

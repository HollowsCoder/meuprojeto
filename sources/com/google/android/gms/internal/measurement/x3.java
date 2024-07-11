package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

public final class x3 extends ContentObserver {
    public x3() {
        super((Handler) null);
    }

    public final void onChange(boolean z) {
        y3.d.set(true);
    }
}

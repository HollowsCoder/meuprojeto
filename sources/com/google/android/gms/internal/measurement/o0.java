package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class o0 extends a0 implements q0 {
    public o0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver", 0);
    }

    public final void h(Bundle bundle) {
        Parcel J = J();
        c0.b(J, bundle);
        L(J, 1);
    }
}

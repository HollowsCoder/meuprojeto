package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

public abstract class p0 extends b0 implements q0 {
    public p0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    public final boolean I(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        ((j0) this).h((Bundle) c0.a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}

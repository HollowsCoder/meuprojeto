package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

public abstract class s0 extends b0 implements t0 {
    public s0() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    public final boolean I(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            o1 o1Var = (o1) this;
            o1Var.e(parcel.readLong(), (Bundle) c0.a(parcel, Bundle.CREATOR), readString, readString2);
            parcel2.writeNoException();
        } else if (i10 != 2) {
            return false;
        } else {
            int c10 = ((o1) this).c();
            parcel2.writeNoException();
            parcel2.writeInt(c10);
        }
        return true;
    }
}

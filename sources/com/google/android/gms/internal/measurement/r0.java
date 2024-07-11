package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class r0 extends a0 implements t0 {
    public r0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 0);
    }

    public final int c() {
        Parcel I = I(J(), 2);
        int readInt = I.readInt();
        I.recycle();
        return readInt;
    }

    public final void e(long j8, Bundle bundle, String str, String str2) {
        Parcel J = J();
        J.writeString(str);
        J.writeString(str2);
        c0.b(J, bundle);
        J.writeLong(j8);
        L(J, 1);
    }
}

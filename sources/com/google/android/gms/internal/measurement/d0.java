package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class d0 extends a0 implements f0 {
    public d0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 0);
    }

    public final Bundle y(Bundle bundle) {
        Parcel J = J();
        c0.b(J, bundle);
        Parcel I = I(J, 1);
        Bundle bundle2 = (Bundle) c0.a(I, Bundle.CREATOR);
        I.recycle();
        return bundle2;
    }
}

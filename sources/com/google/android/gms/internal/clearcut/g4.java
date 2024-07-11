package com.google.android.gms.internal.clearcut;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import h4.f;

public final class g4 implements f4, IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f2445a;

    public g4(IBinder iBinder) {
        this.f2445a = iBinder;
    }

    public final void D(c4 c4Var, f fVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        int i10 = i0.f2463a;
        obtain.writeStrongBinder(c4Var);
        if (fVar == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            fVar.writeToParcel(obtain, 0);
        }
        try {
            this.f2445a.transact(1, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f2445a;
    }
}

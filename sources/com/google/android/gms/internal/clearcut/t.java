package com.google.android.gms.internal.clearcut;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import h4.d;
import h4.f;

public class t extends Binder implements IInterface {
    public t() {
        attachInterface(this, "com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        boolean z;
        if (i10 > 16777215) {
            z = super.onTransact(i10, parcel, parcel2, i11);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        e4 e4Var = (e4) this;
        switch (i10) {
            case 1:
                ((c4) e4Var).f2397a.c((Status) i0.a(parcel, Status.CREATOR));
                return true;
            case 2:
                Status status = (Status) i0.a(parcel, Status.CREATOR);
                throw new UnsupportedOperationException();
            case 3:
                Status status2 = (Status) i0.a(parcel, Status.CREATOR);
                parcel.readLong();
                throw new UnsupportedOperationException();
            case 4:
                Status status3 = (Status) i0.a(parcel, Status.CREATOR);
                throw new UnsupportedOperationException();
            case 5:
                Status status4 = (Status) i0.a(parcel, Status.CREATOR);
                parcel.readLong();
                throw new UnsupportedOperationException();
            case 6:
                Status status5 = (Status) i0.a(parcel, Status.CREATOR);
                f[] fVarArr = (f[]) parcel.createTypedArray(f.CREATOR);
                throw new UnsupportedOperationException();
            case 7:
                DataHolder dataHolder = (DataHolder) i0.a(parcel, DataHolder.CREATOR);
                throw new UnsupportedOperationException();
            case 8:
                Status status6 = (Status) i0.a(parcel, Status.CREATOR);
                d dVar = (d) i0.a(parcel, d.CREATOR);
                throw new UnsupportedOperationException();
            case 9:
                Status status7 = (Status) i0.a(parcel, Status.CREATOR);
                d dVar2 = (d) i0.a(parcel, d.CREATOR);
                throw new UnsupportedOperationException();
            default:
                return false;
        }
    }
}

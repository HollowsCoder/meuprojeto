package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a0 implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f2607a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2608b;

    public /* synthetic */ a0(IBinder iBinder, String str, int i10) {
        this.f2607a = iBinder;
        this.f2608b = str;
    }

    public final Parcel I(Parcel parcel, int i10) {
        parcel = Parcel.obtain();
        try {
            this.f2607a.transact(i10, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            parcel.recycle();
        }
    }

    public final Parcel J() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f2608b);
        return obtain;
    }

    public final Parcel K(Parcel parcel, int i10) {
        parcel = Parcel.obtain();
        try {
            this.f2607a.transact(i10, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            parcel.recycle();
        }
    }

    public final void L(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f2607a.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f2607a;
    }
}

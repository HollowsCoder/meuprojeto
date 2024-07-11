package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import o4.a;
import o4.c;

public final class p4 extends a {
    public static final Parcelable.Creator<p4> CREATOR = new r4();

    /* renamed from: o  reason: collision with root package name */
    public int f3135o;

    /* renamed from: p  reason: collision with root package name */
    public int f3136p;

    /* renamed from: q  reason: collision with root package name */
    public int f3137q;

    /* renamed from: r  reason: collision with root package name */
    public long f3138r;

    /* renamed from: s  reason: collision with root package name */
    public int f3139s;

    public p4() {
    }

    public p4(int i10, int i11, int i12, long j8, int i13) {
        this.f3135o = i10;
        this.f3136p = i11;
        this.f3137q = i12;
        this.f3138r = j8;
        this.f3139s = i13;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int h10 = c.h(parcel, 20293);
        int i11 = this.f3135o;
        c.i(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.f3136p;
        c.i(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.f3137q;
        c.i(parcel, 4, 4);
        parcel.writeInt(i13);
        long j8 = this.f3138r;
        c.i(parcel, 5, 8);
        parcel.writeLong(j8);
        int i14 = this.f3139s;
        c.i(parcel, 6, 4);
        parcel.writeInt(i14);
        c.k(parcel, h10);
    }
}

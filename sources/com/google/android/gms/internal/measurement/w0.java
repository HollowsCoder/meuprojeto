package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import o4.a;
import o4.c;

public final class w0 extends a {
    public static final Parcelable.Creator<w0> CREATOR = new x0();

    /* renamed from: o  reason: collision with root package name */
    public final long f2969o;

    /* renamed from: p  reason: collision with root package name */
    public final long f2970p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f2971q;

    /* renamed from: r  reason: collision with root package name */
    public final String f2972r;

    /* renamed from: s  reason: collision with root package name */
    public final String f2973s;

    /* renamed from: t  reason: collision with root package name */
    public final String f2974t;
    public final Bundle u;

    /* renamed from: v  reason: collision with root package name */
    public final String f2975v;

    public w0(long j8, long j10, boolean z, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f2969o = j8;
        this.f2970p = j10;
        this.f2971q = z;
        this.f2972r = str;
        this.f2973s = str2;
        this.f2974t = str3;
        this.u = bundle;
        this.f2975v = str4;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int h10 = c.h(parcel, 20293);
        c.i(parcel, 1, 8);
        parcel.writeLong(this.f2969o);
        c.i(parcel, 2, 8);
        parcel.writeLong(this.f2970p);
        c.i(parcel, 3, 4);
        parcel.writeInt(this.f2971q ? 1 : 0);
        c.f(parcel, 4, this.f2972r);
        c.f(parcel, 5, this.f2973s);
        c.f(parcel, 6, this.f2974t);
        c.a(parcel, 7, this.u);
        c.f(parcel, 8, this.f2975v);
        c.k(parcel, h10);
    }
}

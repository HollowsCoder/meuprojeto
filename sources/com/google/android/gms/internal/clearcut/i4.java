package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n4.l;
import n4.m;
import o4.a;
import o4.c;

public final class i4 extends a {
    public static final Parcelable.Creator<i4> CREATOR = new j4();

    /* renamed from: o  reason: collision with root package name */
    public final String f2466o;

    /* renamed from: p  reason: collision with root package name */
    public final int f2467p;

    /* renamed from: q  reason: collision with root package name */
    public final int f2468q;

    /* renamed from: r  reason: collision with root package name */
    public final String f2469r;

    /* renamed from: s  reason: collision with root package name */
    public final String f2470s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f2471t;
    public final String u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f2472v;
    public final int w;

    public i4(String str, int i10, int i11, String str2, String str3, t3 t3Var) {
        m.h(str);
        this.f2466o = str;
        this.f2467p = i10;
        this.f2468q = i11;
        this.u = str2;
        this.f2469r = str3;
        this.f2470s = null;
        this.f2471t = true;
        this.f2472v = false;
        this.w = t3Var.zzc();
    }

    public i4(String str, int i10, int i11, String str2, String str3, boolean z, String str4, boolean z10, int i12) {
        this.f2466o = str;
        this.f2467p = i10;
        this.f2468q = i11;
        this.f2469r = str2;
        this.f2470s = str3;
        this.f2471t = z;
        this.u = str4;
        this.f2472v = z10;
        this.w = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i4) {
            i4 i4Var = (i4) obj;
            return l.a(this.f2466o, i4Var.f2466o) && this.f2467p == i4Var.f2467p && this.f2468q == i4Var.f2468q && l.a(this.u, i4Var.u) && l.a(this.f2469r, i4Var.f2469r) && l.a(this.f2470s, i4Var.f2470s) && this.f2471t == i4Var.f2471t && this.f2472v == i4Var.f2472v && this.w == i4Var.w;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2466o, Integer.valueOf(this.f2467p), Integer.valueOf(this.f2468q), this.u, this.f2469r, this.f2470s, Boolean.valueOf(this.f2471t), Boolean.valueOf(this.f2472v), Integer.valueOf(this.w)});
    }

    public final String toString() {
        return "PlayLoggerContext[package=" + this.f2466o + ",packageVersionCode=" + this.f2467p + ",logSource=" + this.f2468q + ",logSourceName=" + this.u + ",uploadAccount=" + this.f2469r + ",loggingId=" + this.f2470s + ",logAndroidId=" + this.f2471t + ",isAnonymous=" + this.f2472v + ",qosTier=" + this.w + "]";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int h10 = c.h(parcel, 20293);
        c.f(parcel, 2, this.f2466o);
        c.i(parcel, 3, 4);
        parcel.writeInt(this.f2467p);
        c.i(parcel, 4, 4);
        parcel.writeInt(this.f2468q);
        c.f(parcel, 5, this.f2469r);
        c.f(parcel, 6, this.f2470s);
        c.i(parcel, 7, 4);
        parcel.writeInt(this.f2471t ? 1 : 0);
        c.f(parcel, 8, this.u);
        c.i(parcel, 9, 4);
        parcel.writeInt(this.f2472v ? 1 : 0);
        c.i(parcel, 10, 4);
        parcel.writeInt(this.w);
        c.k(parcel, h10);
    }
}

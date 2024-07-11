package h5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import n4.m;
import o4.a;
import o4.c;

public final class i7 extends a {
    public static final Parcelable.Creator<i7> CREATOR = new j7();
    public final long A;
    public final int B;
    public final boolean C;
    public final boolean D;
    public final String E;
    public final Boolean F;
    public final long G;
    public final List<String> H;
    public final String I;
    public final String J;

    /* renamed from: o  reason: collision with root package name */
    public final String f5468o;

    /* renamed from: p  reason: collision with root package name */
    public final String f5469p;

    /* renamed from: q  reason: collision with root package name */
    public final String f5470q;

    /* renamed from: r  reason: collision with root package name */
    public final String f5471r;

    /* renamed from: s  reason: collision with root package name */
    public final long f5472s;

    /* renamed from: t  reason: collision with root package name */
    public final long f5473t;
    public final String u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f5474v;
    public final boolean w;

    /* renamed from: x  reason: collision with root package name */
    public final long f5475x;

    /* renamed from: y  reason: collision with root package name */
    public final String f5476y;
    public final long z;

    public i7(String str, String str2, String str3, long j8, String str4, long j10, long j11, String str5, boolean z10, boolean z11, String str6, long j12, long j13, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j14, List<String> list, String str8, String str9) {
        m.e(str);
        this.f5468o = str;
        this.f5469p = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.f5470q = str3;
        this.f5475x = j8;
        this.f5471r = str4;
        this.f5472s = j10;
        this.f5473t = j11;
        this.u = str5;
        this.f5474v = z10;
        this.w = z11;
        this.f5476y = str6;
        this.z = j12;
        this.A = j13;
        this.B = i10;
        this.C = z12;
        this.D = z13;
        this.E = str7;
        this.F = bool;
        this.G = j14;
        this.H = list;
        this.I = str8;
        this.J = str9;
    }

    public i7(String str, String str2, String str3, String str4, long j8, long j10, String str5, boolean z10, boolean z11, long j11, String str6, long j12, long j13, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j14, ArrayList arrayList, String str8, String str9) {
        this.f5468o = str;
        this.f5469p = str2;
        this.f5470q = str3;
        this.f5475x = j11;
        this.f5471r = str4;
        this.f5472s = j8;
        this.f5473t = j10;
        this.u = str5;
        this.f5474v = z10;
        this.w = z11;
        this.f5476y = str6;
        this.z = j12;
        this.A = j13;
        this.B = i10;
        this.C = z12;
        this.D = z13;
        this.E = str7;
        this.F = bool;
        this.G = j14;
        this.H = arrayList;
        this.I = str8;
        this.J = str9;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int h10 = c.h(parcel, 20293);
        c.f(parcel, 2, this.f5468o);
        c.f(parcel, 3, this.f5469p);
        c.f(parcel, 4, this.f5470q);
        c.f(parcel, 5, this.f5471r);
        c.i(parcel, 6, 8);
        parcel.writeLong(this.f5472s);
        c.i(parcel, 7, 8);
        parcel.writeLong(this.f5473t);
        c.f(parcel, 8, this.u);
        c.i(parcel, 9, 4);
        parcel.writeInt(this.f5474v ? 1 : 0);
        c.i(parcel, 10, 4);
        parcel.writeInt(this.w ? 1 : 0);
        c.i(parcel, 11, 8);
        parcel.writeLong(this.f5475x);
        c.f(parcel, 12, this.f5476y);
        c.i(parcel, 13, 8);
        parcel.writeLong(this.z);
        c.i(parcel, 14, 8);
        parcel.writeLong(this.A);
        c.i(parcel, 15, 4);
        parcel.writeInt(this.B);
        c.i(parcel, 16, 4);
        parcel.writeInt(this.C ? 1 : 0);
        c.i(parcel, 18, 4);
        parcel.writeInt(this.D ? 1 : 0);
        c.f(parcel, 19, this.E);
        Boolean bool = this.F;
        if (bool != null) {
            c.i(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        c.i(parcel, 22, 8);
        parcel.writeLong(this.G);
        List<String> list = this.H;
        if (list != null) {
            int h11 = c.h(parcel, 23);
            parcel.writeStringList(list);
            c.k(parcel, h11);
        }
        c.f(parcel, 24, this.I);
        c.f(parcel, 25, this.J);
        c.k(parcel, h10);
    }
}

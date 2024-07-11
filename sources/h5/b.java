package h5;

import android.os.Parcel;
import android.os.Parcelable;
import n4.m;
import o4.a;
import o4.c;

public final class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: o  reason: collision with root package name */
    public String f5275o;

    /* renamed from: p  reason: collision with root package name */
    public String f5276p;

    /* renamed from: q  reason: collision with root package name */
    public c7 f5277q;

    /* renamed from: r  reason: collision with root package name */
    public long f5278r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f5279s;

    /* renamed from: t  reason: collision with root package name */
    public String f5280t;
    public final p u;

    /* renamed from: v  reason: collision with root package name */
    public long f5281v;
    public p w;

    /* renamed from: x  reason: collision with root package name */
    public final long f5282x;

    /* renamed from: y  reason: collision with root package name */
    public final p f5283y;

    public b(b bVar) {
        m.h(bVar);
        this.f5275o = bVar.f5275o;
        this.f5276p = bVar.f5276p;
        this.f5277q = bVar.f5277q;
        this.f5278r = bVar.f5278r;
        this.f5279s = bVar.f5279s;
        this.f5280t = bVar.f5280t;
        this.u = bVar.u;
        this.f5281v = bVar.f5281v;
        this.w = bVar.w;
        this.f5282x = bVar.f5282x;
        this.f5283y = bVar.f5283y;
    }

    public b(String str, String str2, c7 c7Var, long j8, boolean z, String str3, p pVar, long j10, p pVar2, long j11, p pVar3) {
        this.f5275o = str;
        this.f5276p = str2;
        this.f5277q = c7Var;
        this.f5278r = j8;
        this.f5279s = z;
        this.f5280t = str3;
        this.u = pVar;
        this.f5281v = j10;
        this.w = pVar2;
        this.f5282x = j11;
        this.f5283y = pVar3;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int h10 = c.h(parcel, 20293);
        c.f(parcel, 2, this.f5275o);
        c.f(parcel, 3, this.f5276p);
        c.e(parcel, 4, this.f5277q, i10);
        long j8 = this.f5278r;
        c.i(parcel, 5, 8);
        parcel.writeLong(j8);
        boolean z = this.f5279s;
        c.i(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        c.f(parcel, 7, this.f5280t);
        c.e(parcel, 8, this.u, i10);
        long j10 = this.f5281v;
        c.i(parcel, 9, 8);
        parcel.writeLong(j10);
        c.e(parcel, 10, this.w, i10);
        c.i(parcel, 11, 8);
        parcel.writeLong(this.f5282x);
        c.e(parcel, 12, this.f5283y, i10);
        c.k(parcel, h10);
    }
}

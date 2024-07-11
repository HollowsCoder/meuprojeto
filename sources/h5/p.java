package h5;

import android.os.Parcel;
import android.os.Parcelable;
import b0.d;
import n4.m;
import o4.a;

public final class p extends a {
    public static final Parcelable.Creator<p> CREATOR = new q();

    /* renamed from: o  reason: collision with root package name */
    public final String f5621o;

    /* renamed from: p  reason: collision with root package name */
    public final n f5622p;

    /* renamed from: q  reason: collision with root package name */
    public final String f5623q;

    /* renamed from: r  reason: collision with root package name */
    public final long f5624r;

    public p(p pVar, long j8) {
        m.h(pVar);
        this.f5621o = pVar.f5621o;
        this.f5622p = pVar.f5622p;
        this.f5623q = pVar.f5623q;
        this.f5624r = j8;
    }

    public p(String str, n nVar, String str2, long j8) {
        this.f5621o = str;
        this.f5622p = nVar;
        this.f5623q = str2;
        this.f5624r = j8;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f5622p);
        String str = this.f5623q;
        int length = String.valueOf(str).length();
        String str2 = this.f5621o;
        StringBuilder sb = new StringBuilder(length + 21 + String.valueOf(str2).length() + valueOf.length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        return d.g(sb, ",params=", valueOf);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        q.a(this, parcel, i10);
    }
}

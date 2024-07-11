package n4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j4.d;
import o4.a;
import o4.c;

public final class a0 extends a {
    public static final Parcelable.Creator<a0> CREATOR = new z();

    /* renamed from: o  reason: collision with root package name */
    public final Bundle f7365o;

    /* renamed from: p  reason: collision with root package name */
    public final d[] f7366p;

    /* renamed from: q  reason: collision with root package name */
    public final int f7367q;

    public a0() {
    }

    public a0(Bundle bundle, d[] dVarArr, int i10) {
        this.f7365o = bundle;
        this.f7366p = dVarArr;
        this.f7367q = i10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int h10 = c.h(parcel, 20293);
        c.a(parcel, 1, this.f7365o);
        c.g(parcel, 2, this.f7366p, i10);
        c.i(parcel, 3, 4);
        parcel.writeInt(this.f7367q);
        c.k(parcel, h10);
    }
}

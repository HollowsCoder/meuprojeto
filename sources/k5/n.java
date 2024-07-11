package k5;

import android.os.Parcel;
import android.os.Parcelable;
import j4.b;
import n4.w;
import o4.a;
import o4.c;

public final class n extends a {
    public static final Parcelable.Creator<n> CREATOR = new m();

    /* renamed from: o  reason: collision with root package name */
    public final int f6706o;

    /* renamed from: p  reason: collision with root package name */
    public final b f6707p;

    /* renamed from: q  reason: collision with root package name */
    public final w f6708q;

    public n(int i10, b bVar, w wVar) {
        this.f6706o = i10;
        this.f6707p = bVar;
        this.f6708q = wVar;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int h10 = c.h(parcel, 20293);
        c.i(parcel, 1, 4);
        parcel.writeInt(this.f6706o);
        c.e(parcel, 2, this.f6707p, i10);
        c.e(parcel, 3, this.f6708q, i10);
        c.k(parcel, h10);
    }
}

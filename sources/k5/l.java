package k5;

import android.os.Parcel;
import android.os.Parcelable;
import n4.v;
import o4.a;
import o4.c;

public final class l extends a {
    public static final Parcelable.Creator<l> CREATOR = new k();

    /* renamed from: o  reason: collision with root package name */
    public final int f6704o;

    /* renamed from: p  reason: collision with root package name */
    public final v f6705p;

    public l(int i10, v vVar) {
        this.f6704o = i10;
        this.f6705p = vVar;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int h10 = c.h(parcel, 20293);
        c.i(parcel, 1, 4);
        parcel.writeInt(this.f6704o);
        c.e(parcel, 2, this.f6705p, i10);
        c.k(parcel, h10);
    }
}

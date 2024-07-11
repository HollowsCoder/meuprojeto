package q5;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import o4.a;

public final class c extends a {
    public static final Parcelable.Creator<c> CREATOR = new e();

    /* renamed from: o  reason: collision with root package name */
    public final PointF[] f8242o;

    /* renamed from: p  reason: collision with root package name */
    public final int f8243p;

    public c(PointF[] pointFArr, int i10) {
        this.f8242o = pointFArr;
        this.f8243p = i10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int h10 = o4.c.h(parcel, 20293);
        o4.c.g(parcel, 2, this.f8242o, i10);
        o4.c.i(parcel, 3, 4);
        parcel.writeInt(this.f8243p);
        o4.c.k(parcel, h10);
    }
}

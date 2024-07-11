package k5;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import k4.g;
import o4.a;

public final class c extends a implements g {
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* renamed from: o  reason: collision with root package name */
    public final int f6698o;

    /* renamed from: p  reason: collision with root package name */
    public final int f6699p;

    /* renamed from: q  reason: collision with root package name */
    public final Intent f6700q;

    public c() {
        this(2, 0, (Intent) null);
    }

    public c(int i10, int i11, Intent intent) {
        this.f6698o = i10;
        this.f6699p = i11;
        this.f6700q = intent;
    }

    public final Status J() {
        return this.f6699p == 0 ? Status.f2320t : Status.f2321v;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int h10 = o4.c.h(parcel, 20293);
        o4.c.i(parcel, 1, 4);
        parcel.writeInt(this.f6698o);
        o4.c.i(parcel, 2, 4);
        parcel.writeInt(this.f6699p);
        o4.c.e(parcel, 3, this.f6700q, i10);
        o4.c.k(parcel, h10);
    }
}

package b8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import o4.a;
import o4.c;

public final class r extends a {
    public static final Parcelable.Creator<r> CREATOR = new s();

    /* renamed from: o  reason: collision with root package name */
    public final Bundle f2044o;

    public r(Bundle bundle) {
        this.f2044o = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int h10 = c.h(parcel, 20293);
        c.a(parcel, 2, this.f2044o);
        c.k(parcel, h10);
    }
}

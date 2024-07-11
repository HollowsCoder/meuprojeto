package i4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import o4.c;

public final class a extends o4.a {
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* renamed from: o  reason: collision with root package name */
    public final Intent f6065o;

    public a(Intent intent) {
        this.f6065o = intent;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int h10 = c.h(parcel, 20293);
        c.e(parcel, 1, this.f6065o, i10);
        c.k(parcel, h10);
    }
}

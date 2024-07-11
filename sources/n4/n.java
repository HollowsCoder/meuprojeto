package n4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import o4.a;
import o4.c;

public final class n extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<n> CREATOR = new q0();

    /* renamed from: o  reason: collision with root package name */
    public final int f7451o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f7452p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f7453q;

    /* renamed from: r  reason: collision with root package name */
    public final int f7454r;

    /* renamed from: s  reason: collision with root package name */
    public final int f7455s;

    public n(@RecentlyNonNull int i10, @RecentlyNonNull boolean z, @RecentlyNonNull boolean z10, @RecentlyNonNull int i11, @RecentlyNonNull int i12) {
        this.f7451o = i10;
        this.f7452p = z;
        this.f7453q = z10;
        this.f7454r = i11;
        this.f7455s = i12;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int i10) {
        int h10 = c.h(parcel, 20293);
        c.i(parcel, 1, 4);
        parcel.writeInt(this.f7451o);
        c.i(parcel, 2, 4);
        parcel.writeInt(this.f7452p ? 1 : 0);
        c.i(parcel, 3, 4);
        parcel.writeInt(this.f7453q ? 1 : 0);
        c.i(parcel, 4, 4);
        parcel.writeInt(this.f7454r);
        c.i(parcel, 5, 4);
        parcel.writeInt(this.f7455s);
        c.k(parcel, h10);
    }
}

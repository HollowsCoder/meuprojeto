package n4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import o4.a;
import o4.c;

public final class d extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<d> CREATOR = new b0();

    /* renamed from: o  reason: collision with root package name */
    public final n f7410o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f7411p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f7412q;

    /* renamed from: r  reason: collision with root package name */
    public final int[] f7413r;

    /* renamed from: s  reason: collision with root package name */
    public final int f7414s;

    public d(n nVar, boolean z, boolean z10, int[] iArr, int i10) {
        this.f7410o = nVar;
        this.f7411p = z;
        this.f7412q = z10;
        this.f7413r = iArr;
        this.f7414s = i10;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int i10) {
        int h10 = c.h(parcel, 20293);
        c.e(parcel, 1, this.f7410o, i10);
        c.i(parcel, 2, 4);
        parcel.writeInt(this.f7411p ? 1 : 0);
        c.i(parcel, 3, 4);
        parcel.writeInt(this.f7412q ? 1 : 0);
        c.d(parcel, 4, this.f7413r);
        c.i(parcel, 5, 4);
        parcel.writeInt(this.f7414s);
        c.k(parcel, h10);
    }
}

package q5;

import android.os.Parcel;
import android.os.Parcelable;
import o4.a;
import o4.c;

public final class h extends a {
    public static final Parcelable.Creator<h> CREATOR = new g();

    /* renamed from: o  reason: collision with root package name */
    public int f8245o;

    /* renamed from: p  reason: collision with root package name */
    public int f8246p;

    /* renamed from: q  reason: collision with root package name */
    public int f8247q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f8248r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f8249s;

    /* renamed from: t  reason: collision with root package name */
    public float f8250t;

    public h() {
    }

    public h(int i10, int i11, int i12, boolean z, boolean z10, float f10) {
        this.f8245o = i10;
        this.f8246p = i11;
        this.f8247q = i12;
        this.f8248r = z;
        this.f8249s = z10;
        this.f8250t = f10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int h10 = c.h(parcel, 20293);
        int i11 = this.f8245o;
        c.i(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.f8246p;
        c.i(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.f8247q;
        c.i(parcel, 4, 4);
        parcel.writeInt(i13);
        boolean z = this.f8248r;
        c.i(parcel, 5, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z10 = this.f8249s;
        c.i(parcel, 6, 4);
        parcel.writeInt(z10 ? 1 : 0);
        float f10 = this.f8250t;
        c.i(parcel, 7, 4);
        parcel.writeFloat(f10);
        c.k(parcel, h10);
    }
}

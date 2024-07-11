package q5;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.apps.common.proguard.UsedByNative;
import o4.c;

@UsedByNative("wrapper.cc")
public final class a extends o4.a {
    @RecentlyNonNull
    public static final Parcelable.Creator<a> CREATOR = new f();
    public final float A;
    public final c[] B;
    public final float C;

    /* renamed from: o  reason: collision with root package name */
    public final int f8229o;

    /* renamed from: p  reason: collision with root package name */
    public final int f8230p;

    /* renamed from: q  reason: collision with root package name */
    public final float f8231q;

    /* renamed from: r  reason: collision with root package name */
    public final float f8232r;

    /* renamed from: s  reason: collision with root package name */
    public final float f8233s;

    /* renamed from: t  reason: collision with root package name */
    public final float f8234t;
    public final float u;

    /* renamed from: v  reason: collision with root package name */
    public final float f8235v;
    public final float w;
    @RecentlyNonNull

    /* renamed from: x  reason: collision with root package name */
    public final b[] f8236x;

    /* renamed from: y  reason: collision with root package name */
    public final float f8237y;
    public final float z;

    public a(int i10, int i11, float f10, float f11, float f12, float f13, float f14, float f15, float f16, b[] bVarArr, float f17, float f18, float f19, c[] cVarArr, float f20) {
        this.f8229o = i10;
        this.f8230p = i11;
        this.f8231q = f10;
        this.f8232r = f11;
        this.f8233s = f12;
        this.f8234t = f13;
        this.u = f14;
        this.f8235v = f15;
        this.w = f16;
        this.f8236x = bVarArr;
        this.f8237y = f17;
        this.z = f18;
        this.A = f19;
        this.B = cVarArr;
        this.C = f20;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        int h10 = c.h(parcel, 20293);
        c.i(parcel, 1, 4);
        parcel.writeInt(this.f8229o);
        c.i(parcel, 2, 4);
        parcel.writeInt(this.f8230p);
        c.i(parcel, 3, 4);
        parcel.writeFloat(this.f8231q);
        c.i(parcel, 4, 4);
        parcel.writeFloat(this.f8232r);
        c.i(parcel, 5, 4);
        parcel.writeFloat(this.f8233s);
        c.i(parcel, 6, 4);
        parcel.writeFloat(this.f8234t);
        c.i(parcel, 7, 4);
        parcel.writeFloat(this.u);
        c.i(parcel, 8, 4);
        parcel.writeFloat(this.f8235v);
        c.g(parcel, 9, this.f8236x, i10);
        c.i(parcel, 10, 4);
        parcel.writeFloat(this.f8237y);
        c.i(parcel, 11, 4);
        parcel.writeFloat(this.z);
        c.i(parcel, 12, 4);
        parcel.writeFloat(this.A);
        c.g(parcel, 13, this.B, i10);
        c.i(parcel, 14, 4);
        parcel.writeFloat(this.w);
        c.i(parcel, 15, 4);
        parcel.writeFloat(this.C);
        c.k(parcel, h10);
    }
}

package q5;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.apps.common.proguard.UsedByNative;
import o4.a;
import o4.c;

@UsedByNative("wrapper.cc")
public final class b extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<b> CREATOR = new n();

    /* renamed from: o  reason: collision with root package name */
    public final int f8238o;

    /* renamed from: p  reason: collision with root package name */
    public final float f8239p;

    /* renamed from: q  reason: collision with root package name */
    public final float f8240q;

    /* renamed from: r  reason: collision with root package name */
    public final int f8241r;

    @UsedByNative("wrapper.cc")
    public b(float f10, float f11, int i10, int i11) {
        this.f8238o = i10;
        this.f8239p = f10;
        this.f8240q = f11;
        this.f8241r = i11;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        int h10 = c.h(parcel, 20293);
        c.i(parcel, 1, 4);
        parcel.writeInt(this.f8238o);
        c.i(parcel, 2, 4);
        parcel.writeFloat(this.f8239p);
        c.i(parcel, 3, 4);
        parcel.writeFloat(this.f8240q);
        c.i(parcel, 4, 4);
        parcel.writeInt(this.f8241r);
        c.k(parcel, h10);
    }
}

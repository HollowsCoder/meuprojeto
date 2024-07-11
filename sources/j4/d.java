package j4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.Arrays;
import n4.l;
import o4.a;
import o4.c;

public final class d extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<d> CREATOR = new l();

    /* renamed from: o  reason: collision with root package name */
    public final String f6540o;
    @Deprecated

    /* renamed from: p  reason: collision with root package name */
    public final int f6541p;

    /* renamed from: q  reason: collision with root package name */
    public final long f6542q;

    public d(@RecentlyNonNull String str, @RecentlyNonNull long j8, @RecentlyNonNull int i10) {
        this.f6540o = str;
        this.f6541p = i10;
        this.f6542q = j8;
    }

    @RecentlyNonNull
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f6540o;
            if (((str == null || !str.equals(dVar.f6540o)) && (str != null || dVar.f6540o != null)) || g0() != dVar.g0()) {
                return false;
            }
            return true;
        }
        return false;
    }

    @RecentlyNonNull
    public final long g0() {
        long j8 = this.f6542q;
        return j8 == -1 ? (long) this.f6541p : j8;
    }

    @RecentlyNonNull
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6540o, Long.valueOf(g0())});
    }

    @RecentlyNonNull
    public final String toString() {
        l.a aVar = new l.a(this);
        aVar.a(this.f6540o, "name");
        aVar.a(Long.valueOf(g0()), "version");
        return aVar.toString();
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int i10) {
        int h10 = c.h(parcel, 20293);
        c.f(parcel, 1, this.f6540o);
        c.i(parcel, 2, 4);
        parcel.writeInt(this.f6541p);
        long g02 = g0();
        c.i(parcel, 3, 8);
        parcel.writeLong(g02);
        c.k(parcel, h10);
    }
}

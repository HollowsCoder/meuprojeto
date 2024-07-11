package k5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;
import k4.g;
import o4.a;
import o4.c;

public final class h extends a implements g {
    public static final Parcelable.Creator<h> CREATOR = new j();

    /* renamed from: o  reason: collision with root package name */
    public final List<String> f6701o;

    /* renamed from: p  reason: collision with root package name */
    public final String f6702p;

    public h(String str, ArrayList arrayList) {
        this.f6701o = arrayList;
        this.f6702p = str;
    }

    public final Status J() {
        return this.f6702p != null ? Status.f2320t : Status.f2321v;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int h10 = c.h(parcel, 20293);
        List<String> list = this.f6701o;
        if (list != null) {
            int h11 = c.h(parcel, 1);
            parcel.writeStringList(list);
            c.k(parcel, h11);
        }
        c.f(parcel, 2, this.f6702p);
        c.k(parcel, h10);
    }
}

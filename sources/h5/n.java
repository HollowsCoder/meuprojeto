package h5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.vision.c4;
import java.util.Iterator;
import o4.a;
import o4.c;

public final class n extends a implements Iterable<String> {
    public static final Parcelable.Creator<n> CREATOR = new o();

    /* renamed from: o  reason: collision with root package name */
    public final Bundle f5587o;

    public n(Bundle bundle) {
        this.f5587o = bundle;
    }

    public final Double g0() {
        return Double.valueOf(this.f5587o.getDouble("value"));
    }

    public final Bundle h0() {
        return new Bundle(this.f5587o);
    }

    public final Iterator<String> iterator() {
        return new c4(this);
    }

    public final String toString() {
        return this.f5587o.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int h10 = c.h(parcel, 20293);
        c.a(parcel, 2, h0());
        c.k(parcel, h10);
    }
}

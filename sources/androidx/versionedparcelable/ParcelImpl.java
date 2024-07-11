package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import e1.b;
import e1.c;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();

    /* renamed from: o  reason: collision with root package name */
    public final c f1885o;

    public static class a implements Parcelable.Creator<ParcelImpl> {
        public final Object createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        public final Object[] newArray(int i10) {
            return new ParcelImpl[i10];
        }
    }

    public ParcelImpl(Parcel parcel) {
        this.f1885o = new b(parcel).m();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        new b(parcel).v(this.f1885o);
    }
}

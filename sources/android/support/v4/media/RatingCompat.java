package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* renamed from: o  reason: collision with root package name */
    public final int f130o;

    /* renamed from: p  reason: collision with root package name */
    public final float f131p;

    public static class a implements Parcelable.Creator<RatingCompat> {
        public final Object createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        public final Object[] newArray(int i10) {
            return new RatingCompat[i10];
        }
    }

    public RatingCompat(int i10, float f10) {
        this.f130o = i10;
        this.f131p = f10;
    }

    public final int describeContents() {
        return this.f130o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f130o);
        sb.append(" rating=");
        float f10 = this.f131p;
        sb.append(f10 < 0.0f ? "unrated" : String.valueOf(f10));
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f130o);
        parcel.writeFloat(this.f131p);
    }
}

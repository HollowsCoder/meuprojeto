package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: o  reason: collision with root package name */
    public final int f136o;

    /* renamed from: p  reason: collision with root package name */
    public final int f137p;

    /* renamed from: q  reason: collision with root package name */
    public final int f138q;

    /* renamed from: r  reason: collision with root package name */
    public final int f139r;

    /* renamed from: s  reason: collision with root package name */
    public final int f140s;

    public static class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        public final Object[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f136o = parcel.readInt();
        this.f138q = parcel.readInt();
        this.f139r = parcel.readInt();
        this.f140s = parcel.readInt();
        this.f137p = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f136o);
        parcel.writeInt(this.f138q);
        parcel.writeInt(this.f139r);
        parcel.writeInt(this.f140s);
        parcel.writeInt(this.f137p);
    }
}

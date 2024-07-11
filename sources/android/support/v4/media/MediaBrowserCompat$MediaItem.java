package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a();

    /* renamed from: o  reason: collision with root package name */
    public final int f120o;

    /* renamed from: p  reason: collision with root package name */
    public final MediaDescriptionCompat f121p;

    public static class a implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
        public final Object createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        public final Object[] newArray(int i10) {
            return new MediaBrowserCompat$MediaItem[i10];
        }
    }

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f120o = parcel.readInt();
        this.f121p = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.f120o + ", mDescription=" + this.f121p + '}';
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f120o);
        this.f121p.writeToParcel(parcel, i10);
    }
}

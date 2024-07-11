package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: o  reason: collision with root package name */
    public final int f141o;

    /* renamed from: p  reason: collision with root package name */
    public final long f142p;

    /* renamed from: q  reason: collision with root package name */
    public final long f143q;

    /* renamed from: r  reason: collision with root package name */
    public final float f144r;

    /* renamed from: s  reason: collision with root package name */
    public final long f145s;

    /* renamed from: t  reason: collision with root package name */
    public final int f146t;
    public final CharSequence u;

    /* renamed from: v  reason: collision with root package name */
    public final long f147v;
    public final ArrayList w;

    /* renamed from: x  reason: collision with root package name */
    public final long f148x;

    /* renamed from: y  reason: collision with root package name */
    public final Bundle f149y;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: o  reason: collision with root package name */
        public final String f150o;

        /* renamed from: p  reason: collision with root package name */
        public final CharSequence f151p;

        /* renamed from: q  reason: collision with root package name */
        public final int f152q;

        /* renamed from: r  reason: collision with root package name */
        public final Bundle f153r;

        public static class a implements Parcelable.Creator<CustomAction> {
            public final Object createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            public final Object[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        public CustomAction(Parcel parcel) {
            this.f150o = parcel.readString();
            this.f151p = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f152q = parcel.readInt();
            this.f153r = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + this.f151p + ", mIcon=" + this.f152q + ", mExtras=" + this.f153r;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f150o);
            TextUtils.writeToParcel(this.f151p, parcel, i10);
            parcel.writeInt(this.f152q);
            parcel.writeBundle(this.f153r);
        }
    }

    public static class a implements Parcelable.Creator<PlaybackStateCompat> {
        public final Object createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        public final Object[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f141o = parcel.readInt();
        this.f142p = parcel.readLong();
        this.f144r = parcel.readFloat();
        this.f147v = parcel.readLong();
        this.f143q = parcel.readLong();
        this.f145s = parcel.readLong();
        this.u = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.w = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f148x = parcel.readLong();
        this.f149y = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f146t = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.f141o + ", position=" + this.f142p + ", buffered position=" + this.f143q + ", speed=" + this.f144r + ", updated=" + this.f147v + ", actions=" + this.f145s + ", error code=" + this.f146t + ", error message=" + this.u + ", custom actions=" + this.w + ", active item id=" + this.f148x + "}";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f141o);
        parcel.writeLong(this.f142p);
        parcel.writeFloat(this.f144r);
        parcel.writeLong(this.f147v);
        parcel.writeLong(this.f143q);
        parcel.writeLong(this.f145s);
        TextUtils.writeToParcel(this.u, parcel, i10);
        parcel.writeTypedList(this.w);
        parcel.writeLong(this.f148x);
        parcel.writeBundle(this.f149y);
        parcel.writeInt(this.f146t);
    }
}

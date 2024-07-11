package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;

public final class MediaSessionCompat {

    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();

        /* renamed from: o  reason: collision with root package name */
        public final MediaDescriptionCompat f132o;

        /* renamed from: p  reason: collision with root package name */
        public final long f133p;

        public static class a implements Parcelable.Creator<QueueItem> {
            public final Object createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            public final Object[] newArray(int i10) {
                return new QueueItem[i10];
            }
        }

        public QueueItem(Parcel parcel) {
            this.f132o = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f133p = parcel.readLong();
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "MediaSession.QueueItem {Description=" + this.f132o + ", Id=" + this.f133p + " }";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            this.f132o.writeToParcel(parcel, i10);
            parcel.writeLong(this.f133p);
        }
    }

    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();

        /* renamed from: o  reason: collision with root package name */
        public final ResultReceiver f134o;

        public static class a implements Parcelable.Creator<ResultReceiverWrapper> {
            public final Object createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            public final Object[] newArray(int i10) {
                return new ResultReceiverWrapper[i10];
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.f134o = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            this.f134o.writeToParcel(parcel, i10);
        }
    }

    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();

        /* renamed from: o  reason: collision with root package name */
        public final Object f135o;

        public static class a implements Parcelable.Creator<Token> {
            public final Object createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable((ClassLoader) null));
            }

            public final Object[] newArray(int i10) {
                return new Token[i10];
            }
        }

        public Token(Parcelable parcelable) {
            this.f135o = parcelable;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Object obj2 = this.f135o;
            Object obj3 = ((Token) obj).f135o;
            if (obj2 == null) {
                return obj3 == null;
            }
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public final int hashCode() {
            Object obj = this.f135o;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable((Parcelable) this.f135o, i10);
        }
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }
}

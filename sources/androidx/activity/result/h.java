package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* renamed from: o  reason: collision with root package name */
    public final IntentSender f210o;

    /* renamed from: p  reason: collision with root package name */
    public final Intent f211p;

    /* renamed from: q  reason: collision with root package name */
    public final int f212q;

    /* renamed from: r  reason: collision with root package name */
    public final int f213r;

    public class a implements Parcelable.Creator<h> {
        public final Object createFromParcel(Parcel parcel) {
            return new h(parcel);
        }

        public final Object[] newArray(int i10) {
            return new h[i10];
        }
    }

    public h(IntentSender intentSender, Intent intent, int i10, int i11) {
        this.f210o = intentSender;
        this.f211p = intent;
        this.f212q = i10;
        this.f213r = i11;
    }

    public h(Parcel parcel) {
        this.f210o = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f211p = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f212q = parcel.readInt();
        this.f213r = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f210o, i10);
        parcel.writeParcelable(this.f211p, i10);
        parcel.writeInt(this.f212q);
        parcel.writeInt(this.f213r);
    }
}

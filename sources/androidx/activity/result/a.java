package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0005a();

    /* renamed from: o  reason: collision with root package name */
    public final int f192o;

    /* renamed from: p  reason: collision with root package name */
    public final Intent f193p;

    /* renamed from: androidx.activity.result.a$a  reason: collision with other inner class name */
    public class C0005a implements Parcelable.Creator<a> {
        public final Object createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        public final Object[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(Intent intent, int i10) {
        this.f192o = i10;
        this.f193p = intent;
    }

    public a(Parcel parcel) {
        this.f192o = parcel.readInt();
        this.f193p = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    public final Intent a() {
        return this.f193p;
    }

    public final int b() {
        return this.f192o;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i10 = this.f192o;
        if (i10 == -1) {
            str = "RESULT_OK";
        } else if (i10 != 0) {
            str = String.valueOf(i10);
        } else {
            str = "RESULT_CANCELED";
        }
        sb.append(str);
        sb.append(", data=");
        sb.append(this.f193p);
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f192o);
        Intent intent = this.f193p;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }
}

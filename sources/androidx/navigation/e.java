package androidx.navigation;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

@SuppressLint({"BanParcelableUsage"})
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: o  reason: collision with root package name */
    public final UUID f1464o;

    /* renamed from: p  reason: collision with root package name */
    public final int f1465p;

    /* renamed from: q  reason: collision with root package name */
    public final Bundle f1466q;

    /* renamed from: r  reason: collision with root package name */
    public final Bundle f1467r;

    public class a implements Parcelable.Creator<e> {
        public final Object createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        public final Object[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e(Parcel parcel) {
        this.f1464o = UUID.fromString(parcel.readString());
        this.f1465p = parcel.readInt();
        Class<e> cls = e.class;
        this.f1466q = parcel.readBundle(cls.getClassLoader());
        this.f1467r = parcel.readBundle(cls.getClassLoader());
    }

    public e(d dVar) {
        this.f1464o = dVar.f1460t;
        this.f1465p = dVar.f1456p.f1494q;
        this.f1466q = dVar.f1457q;
        Bundle bundle = new Bundle();
        this.f1467r = bundle;
        dVar.f1459s.b(bundle);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1464o.toString());
        parcel.writeInt(this.f1465p);
        parcel.writeBundle(this.f1466q);
        parcel.writeBundle(this.f1467r);
    }
}

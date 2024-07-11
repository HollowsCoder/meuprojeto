package n0;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: p  reason: collision with root package name */
    public static final C0102a f7339p = new C0102a();

    /* renamed from: o  reason: collision with root package name */
    public final Parcelable f7340o;

    /* renamed from: n0.a$a  reason: collision with other inner class name */
    public class C0102a extends a {
    }

    public a() {
        this.f7340o = null;
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f7340o = readParcelable == null ? f7339p : readParcelable;
    }

    public a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f7340o = parcelable == f7339p ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f7340o, i10);
    }

    public class b implements Parcelable.ClassLoaderCreator<a> {
        public final Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable((ClassLoader) null) == null) {
                return a.f7339p;
            }
            throw new IllegalStateException("superState must be null");
        }

        public final Object[] newArray(int i10) {
            return new a[i10];
        }

        public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f7339p;
            }
            throw new IllegalStateException("superState must be null");
        }
    }
}

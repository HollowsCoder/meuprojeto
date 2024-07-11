package a;

import a.a;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: o  reason: collision with root package name */
    public a f5o;

    public class a implements Parcelable.Creator<b> {
        public final Object createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        public final Object[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* renamed from: a.b$b  reason: collision with other inner class name */
    public class C0002b extends a.C0000a {
        public C0002b() {
        }
    }

    public b(Parcel parcel) {
        a aVar;
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i10 = a.C0000a.f3a;
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                aVar = new a.C0000a.C0001a(readStrongBinder);
            } else {
                aVar = (a) queryLocalInterface;
            }
        }
        this.f5o = aVar;
    }

    public void a(int i10, Bundle bundle) {
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            if (this.f5o == null) {
                this.f5o = new C0002b();
            }
            parcel.writeStrongBinder(this.f5o.asBinder());
        }
    }
}

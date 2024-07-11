package b5;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f1957a = 0;

    static {
        c.class.getClassLoader();
    }

    public static <T extends Parcelable> T a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }
}

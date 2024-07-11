package j4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import o4.b;

public final class w implements Parcelable.Creator<t> {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        String str = null;
        boolean z = false;
        boolean z10 = false;
        IBinder iBinder = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            int i10 = 65535 & readInt;
            if (i10 == 1) {
                str = b.e(parcel, readInt);
            } else if (i10 == 2) {
                iBinder = b.j(parcel, readInt);
            } else if (i10 == 3) {
                z = b.h(parcel, readInt);
            } else if (i10 != 4) {
                b.n(parcel, readInt);
            } else {
                z10 = b.h(parcel, readInt);
            }
        }
        b.g(parcel, o10);
        return new t(str, iBinder, z, z10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new t[i10];
    }
}

package b8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import o4.b;

public final class s implements Parcelable.Creator<r> {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 2) {
                b.n(parcel, readInt);
            } else {
                bundle = b.a(parcel, readInt);
            }
        }
        b.g(parcel, o10);
        return new r(bundle);
    }

    public final Object[] newArray(int i10) {
        return new r[i10];
    }
}

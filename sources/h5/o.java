package h5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import o4.b;

public final class o implements Parcelable.Creator<n> {
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
        return new n(bundle);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new n[i10];
    }
}

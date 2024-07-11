package i4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import o4.b;

public final class d implements Parcelable.Creator<a> {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                b.n(parcel, readInt);
            } else {
                intent = (Intent) b.d(parcel, readInt, Intent.CREATOR);
            }
        }
        b.g(parcel, o10);
        return new a(intent);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}

package k4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import o4.b;

public final class j implements Parcelable.Creator<Scope> {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        int i10 = 0;
        String str = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            int i11 = 65535 & readInt;
            if (i11 == 1) {
                i10 = b.k(parcel, readInt);
            } else if (i11 != 2) {
                b.n(parcel, readInt);
            } else {
                str = b.e(parcel, readInt);
            }
        }
        b.g(parcel, o10);
        return new Scope(str, i10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new Scope[i10];
    }
}

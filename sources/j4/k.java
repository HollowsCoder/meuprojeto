package j4;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import o4.b;

public final class k implements Parcelable.Creator<b> {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        int i10 = 0;
        PendingIntent pendingIntent = null;
        String str = null;
        int i11 = 0;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            int i12 = 65535 & readInt;
            if (i12 == 1) {
                i10 = b.k(parcel, readInt);
            } else if (i12 == 2) {
                i11 = b.k(parcel, readInt);
            } else if (i12 == 3) {
                pendingIntent = (PendingIntent) b.d(parcel, readInt, PendingIntent.CREATOR);
            } else if (i12 != 4) {
                b.n(parcel, readInt);
            } else {
                str = b.e(parcel, readInt);
            }
        }
        b.g(parcel, o10);
        return new b(i10, i11, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}

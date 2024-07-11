package k5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import o4.b;

public final class j implements Parcelable.Creator<h> {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        String str = null;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            int i10 = 65535 & readInt;
            if (i10 == 1) {
                int m10 = b.m(parcel, readInt);
                int dataPosition = parcel.dataPosition();
                if (m10 == 0) {
                    arrayList = null;
                } else {
                    ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                    parcel.setDataPosition(dataPosition + m10);
                    arrayList = createStringArrayList;
                }
            } else if (i10 != 2) {
                b.n(parcel, readInt);
            } else {
                str = b.e(parcel, readInt);
            }
        }
        b.g(parcel, o10);
        return new h(str, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new h[i10];
    }
}

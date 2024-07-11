package i5;

import android.os.Parcel;
import android.os.Parcelable;
import o4.b;

public final class c implements Parcelable.Creator<a> {
    public final Object createFromParcel(Parcel parcel) {
        int o10 = b.o(parcel);
        String str = null;
        byte[] bArr = null;
        byte[][] bArr2 = null;
        byte[][] bArr3 = null;
        byte[][] bArr4 = null;
        byte[][] bArr5 = null;
        int[] iArr = null;
        byte[][] bArr6 = null;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = b.e(parcel, readInt);
                    break;
                case 3:
                    int m10 = b.m(parcel, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (m10 != 0) {
                        byte[] createByteArray = parcel.createByteArray();
                        parcel.setDataPosition(dataPosition + m10);
                        bArr = createByteArray;
                        break;
                    } else {
                        bArr = null;
                        break;
                    }
                case 4:
                    bArr2 = b.b(parcel, readInt);
                    break;
                case 5:
                    bArr3 = b.b(parcel, readInt);
                    break;
                case 6:
                    bArr4 = b.b(parcel, readInt);
                    break;
                case 7:
                    bArr5 = b.b(parcel, readInt);
                    break;
                case 8:
                    iArr = b.c(parcel, readInt);
                    break;
                case 9:
                    bArr6 = b.b(parcel, readInt);
                    break;
                default:
                    b.n(parcel, readInt);
                    break;
            }
        }
        b.g(parcel, o10);
        return new a(str, bArr, bArr2, bArr3, bArr4, bArr5, iArr, bArr6);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}

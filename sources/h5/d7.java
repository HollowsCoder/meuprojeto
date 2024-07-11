package h5;

import android.os.Parcel;
import android.os.Parcelable;
import o4.b;
import o4.c;

public final class d7 implements Parcelable.Creator<c7> {
    public static void a(c7 c7Var, Parcel parcel) {
        int h10 = c.h(parcel, 20293);
        int i10 = c7Var.f5317o;
        c.i(parcel, 1, 4);
        parcel.writeInt(i10);
        c.f(parcel, 2, c7Var.f5318p);
        c.i(parcel, 3, 8);
        parcel.writeLong(c7Var.f5319q);
        Long l = c7Var.f5320r;
        if (l != null) {
            c.i(parcel, 4, 8);
            parcel.writeLong(l.longValue());
        }
        c.f(parcel, 6, c7Var.f5321s);
        c.f(parcel, 7, c7Var.f5322t);
        Double d = c7Var.u;
        if (d != null) {
            c.i(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        c.k(parcel, h10);
    }

    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int o10 = b.o(parcel);
        int i10 = 0;
        Float f10 = null;
        String str = null;
        String str2 = null;
        Double d = null;
        long j8 = 0;
        String str3 = null;
        Long l = null;
        while (true) {
            String str4 = str2;
            Double d10 = d;
            Float f11 = f10;
            String str5 = str;
            Long l8 = l;
            int i11 = i10;
            String str6 = str3;
            while (parcel.dataPosition() < o10) {
                int readInt = parcel.readInt();
                switch (65535 & readInt) {
                    case 1:
                        i11 = b.k(parcel2, readInt);
                        break;
                    case 2:
                        str6 = b.e(parcel2, readInt);
                        break;
                    case 3:
                        j8 = b.l(parcel2, readInt);
                        str3 = str6;
                        i10 = i11;
                        l = l8;
                        f10 = f11;
                        str = str5;
                        str2 = str4;
                        d = d10;
                    case 4:
                        int m10 = b.m(parcel2, readInt);
                        if (m10 != 0) {
                            b.q(parcel2, m10, 8);
                            l8 = Long.valueOf(parcel.readLong());
                            break;
                        } else {
                            l8 = null;
                            break;
                        }
                    case 5:
                        int m11 = b.m(parcel2, readInt);
                        if (m11 != 0) {
                            b.q(parcel2, m11, 4);
                            f11 = Float.valueOf(parcel.readFloat());
                            break;
                        } else {
                            f11 = null;
                            break;
                        }
                    case 6:
                        str5 = b.e(parcel2, readInt);
                        break;
                    case 7:
                        str4 = b.e(parcel2, readInt);
                        break;
                    case 8:
                        int m12 = b.m(parcel2, readInt);
                        if (m12 != 0) {
                            b.q(parcel2, m12, 8);
                            d10 = Double.valueOf(parcel.readDouble());
                            break;
                        } else {
                            d10 = null;
                            break;
                        }
                    default:
                        b.n(parcel2, readInt);
                        break;
                }
            }
            b.g(parcel2, o10);
            return new c7(i11, str6, j8, l8, f11, str5, str4, d10);
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new c7[i10];
    }
}

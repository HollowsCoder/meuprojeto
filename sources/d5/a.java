package d5;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import u4.a;
import w4.d;

public class a extends Binder implements IInterface {
    public a() {
        attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        boolean z;
        boolean z10 = false;
        if (i10 > 16777215) {
            z = super.onTransact(i10, parcel, parcel2, i11);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        d dVar = (d) this;
        if (i10 == 1) {
            dVar.init(a.C0136a.J(parcel.readStrongBinder()));
            parcel2.writeNoException();
        } else if (i10 == 2) {
            String readString = parcel.readString();
            int i12 = b.f4187a;
            if (parcel.readInt() != 0) {
                z10 = true;
            }
            boolean booleanFlagValue = dVar.getBooleanFlagValue(readString, z10, parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(booleanFlagValue ? 1 : 0);
        } else if (i10 == 3) {
            int intFlagValue = dVar.getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(intFlagValue);
        } else if (i10 == 4) {
            long longFlagValue = dVar.getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeLong(longFlagValue);
        } else if (i10 != 5) {
            return false;
        } else {
            String stringFlagValue = dVar.getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeString(stringFlagValue);
        }
        return true;
    }
}

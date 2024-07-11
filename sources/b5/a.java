package b5;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a extends Binder implements IInterface {
    public a(String str) {
        attachInterface(this, str);
    }

    public boolean I(int i10, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        boolean z;
        if (i10 > 16777215) {
            z = super.onTransact(i10, parcel, parcel2, i11);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        return I(i10, parcel, parcel2);
    }
}

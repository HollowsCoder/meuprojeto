package w4;

import android.os.IBinder;
import android.os.IInterface;
import d5.a;

public abstract class d extends a implements c {
    public static c asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new e(iBinder);
    }
}

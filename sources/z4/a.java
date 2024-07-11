package z4;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import j4.b;
import k5.c;
import k5.g;
import k5.h;
import k5.n;
import l4.v;
import l4.w;

public class a extends Binder implements IInterface {
    public a() {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
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
        g gVar = (g) this;
        switch (i10) {
            case 3:
                b bVar = (b) b.a(parcel, b.CREATOR);
                c cVar = (c) b.a(parcel, c.CREATOR);
                break;
            case 4:
            case 6:
                Status status = (Status) b.a(parcel, Status.CREATOR);
                break;
            case 7:
                Status status2 = (Status) b.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) b.a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                v vVar = (v) gVar;
                vVar.f6943b.post(new w(0, vVar, (n) b.a(parcel, n.CREATOR)));
                break;
            case 9:
                h hVar = (h) b.a(parcel, h.CREATOR);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

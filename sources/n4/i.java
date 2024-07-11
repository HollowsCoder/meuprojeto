package n4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import b5.a;
import b5.c;
import n4.b;

public abstract class i extends a {
    public i() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public final boolean I(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            b.i iVar = (b.i) this;
            m.i(iVar.f7396a, "onPostInitComplete can be called only once per call to getRemoteService");
            b bVar = iVar.f7396a;
            bVar.getClass();
            b.j jVar = new b.j(parcel.readInt(), parcel.readStrongBinder(), (Bundle) c.a(parcel, Bundle.CREATOR));
            b.f fVar = bVar.f7373f;
            fVar.sendMessage(fVar.obtainMessage(1, iVar.f7397b, -1, jVar));
            iVar.f7396a = null;
        } else if (i10 == 2) {
            parcel.readInt();
            Bundle bundle = (Bundle) c.a(parcel, Bundle.CREATOR);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else if (i10 != 3) {
            return false;
        } else {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            a0 a0Var = (a0) c.a(parcel, a0.CREATOR);
            b.i iVar2 = (b.i) this;
            b bVar2 = iVar2.f7396a;
            m.i(bVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            m.h(a0Var);
            bVar2.getClass();
            Bundle bundle2 = a0Var.f7365o;
            m.i(iVar2.f7396a, "onPostInitComplete can be called only once per call to getRemoteService");
            b bVar3 = iVar2.f7396a;
            bVar3.getClass();
            b.j jVar2 = new b.j(readInt, readStrongBinder, bundle2);
            b.f fVar2 = bVar3.f7373f;
            fVar2.sendMessage(fVar2.obtainMessage(1, iVar2.f7397b, -1, jVar2));
            iVar2.f7396a = null;
        }
        parcel2.writeNoException();
        return true;
    }
}

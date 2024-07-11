package l4;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import l4.d;

public abstract class u {

    /* renamed from: a  reason: collision with root package name */
    public final int f6940a;

    public u(int i10) {
        this.f6940a = i10;
    }

    public static Status a(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void b(Status status);

    public abstract void c(RuntimeException runtimeException);

    public abstract void d(e0 e0Var, boolean z);

    public abstract void e(d.a<?> aVar);
}

package l4;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import k4.b;
import l4.d;
import m5.j;

public abstract class z<T> extends k {

    /* renamed from: b  reason: collision with root package name */
    public final j<T> f6952b;

    public z(j jVar) {
        this.f6952b = jVar;
    }

    public final void b(Status status) {
        this.f6952b.b(new b(status));
    }

    public final void c(RuntimeException runtimeException) {
        this.f6952b.b(runtimeException);
    }

    public final void e(d.a<?> aVar) {
        try {
            g(aVar);
        } catch (DeadObjectException e10) {
            b(u.a(e10));
            throw e10;
        } catch (RemoteException e11) {
            b(u.a(e11));
        } catch (RuntimeException e12) {
            c(e12);
        }
    }

    public abstract void g(d.a<?> aVar);
}

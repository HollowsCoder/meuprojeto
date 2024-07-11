package l4;

import android.util.Log;
import androidx.appcompat.widget.x0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.a;
import com.google.android.gms.internal.clearcut.z3;
import k4.g;

public final class y<A extends a<? extends g, Object>> extends u {

    /* renamed from: b  reason: collision with root package name */
    public final A f6951b;

    public y(z3 z3Var) {
        super(2);
        this.f6951b = z3Var;
    }

    public final void b(Status status) {
        try {
            this.f6951b.g(status);
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    public final void c(RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(x0.a(localizedMessage, simpleName.length() + 2));
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        try {
            this.f6951b.g(new Status(10, sb.toString()));
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    public final void d(e0 e0Var, boolean z) {
        A a10 = this.f6951b;
        e0Var.f6910a.put(a10, Boolean.valueOf(z));
        d0 d0Var = new d0(e0Var, a10);
        a10.getClass();
        synchronized (a10.f2328a) {
            if (a10.b()) {
                d0Var.a();
            } else {
                a10.f2330c.add(d0Var);
            }
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(l4.d.a<?> r5) {
        /*
            r4 = this;
            A r0 = r4.f6951b     // Catch:{ RuntimeException -> 0x0029 }
            k4.a$e r5 = r5.f6894b     // Catch:{ RuntimeException -> 0x0029 }
            r0.getClass()     // Catch:{ RuntimeException -> 0x0029 }
            r1 = 8
            r0.f(r5)     // Catch:{ DeadObjectException -> 0x001b, RemoteException -> 0x000d }
            goto L_0x001a
        L_0x000d:
            r5 = move-exception
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status     // Catch:{ RuntimeException -> 0x0029 }
            java.lang.String r5 = r5.getLocalizedMessage()     // Catch:{ RuntimeException -> 0x0029 }
            r2.<init>((int) r1, (java.lang.String) r5)     // Catch:{ RuntimeException -> 0x0029 }
            r0.g(r2)     // Catch:{ RuntimeException -> 0x0029 }
        L_0x001a:
            return
        L_0x001b:
            r5 = move-exception
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status     // Catch:{ RuntimeException -> 0x0029 }
            java.lang.String r3 = r5.getLocalizedMessage()     // Catch:{ RuntimeException -> 0x0029 }
            r2.<init>((int) r1, (java.lang.String) r3)     // Catch:{ RuntimeException -> 0x0029 }
            r0.g(r2)     // Catch:{ RuntimeException -> 0x0029 }
            throw r5     // Catch:{ RuntimeException -> 0x0029 }
        L_0x0029:
            r5 = move-exception
            r4.c(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.y.e(l4.d$a):void");
    }
}

package h5;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import j4.f;
import n4.b;
import n4.d0;
import n4.g;

public final class c3 extends b<x2> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c3(Context context, Looper looper, e6 e6Var, e6 e6Var2) {
        super(context, looper, g.f7438b, f.f6547b, 93, e6Var, e6Var2, (String) null);
        synchronized (g.f7437a) {
            if (g.f7438b == null) {
                g.f7438b = new d0(context.getApplicationContext());
            }
        }
    }

    public final int f() {
        return 12451000;
    }

    public final /* bridge */ /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof x2 ? (x2) queryLocalInterface : new v2(iBinder);
    }

    public final String v() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    public final String w() {
        return "com.google.android.gms.measurement.START";
    }
}

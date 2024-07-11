package h5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.d0;
import com.google.android.gms.internal.measurement.e0;
import com.google.android.gms.internal.measurement.f0;
import l4.g0;

public final class v3 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final String f5778a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w3 f5779b;

    public v3(w3 w3Var, String str) {
        this.f5779b = w3Var;
        this.f5778a = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        w3 w3Var = this.f5779b;
        if (iBinder != null) {
            try {
                int i10 = e0.f2683a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                if (queryLocalInterface instanceof f0) {
                    obj = (f0) queryLocalInterface;
                } else {
                    obj = new d0(iBinder);
                }
                if (obj == null) {
                    g3 g3Var = w3Var.f5792a.w;
                    i4.n(g3Var);
                    g3Var.w.a("Install Referrer Service implementation was not found");
                    return;
                }
                g3 g3Var2 = w3Var.f5792a.w;
                i4.n(g3Var2);
                g3Var2.B.a("Install Referrer Service connected");
                h4 h4Var = w3Var.f5792a.f5459x;
                i4.n(h4Var);
                h4Var.n(new g0(this, obj, this, 1));
            } catch (RuntimeException e10) {
                g3 g3Var3 = w3Var.f5792a.w;
                i4.n(g3Var3);
                g3Var3.w.b(e10, "Exception occurred while calling Install Referrer API");
            }
        } else {
            g3 g3Var4 = w3Var.f5792a.w;
            i4.n(g3Var4);
            g3Var4.w.a("Install Referrer connection returned with null binder");
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        g3 g3Var = this.f5779b.f5792a.w;
        i4.n(g3Var);
        g3Var.B.a("Install Referrer Service disconnected");
    }
}

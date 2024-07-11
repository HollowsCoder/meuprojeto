package h5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class n3 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final z6 f5591a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5592b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5593c;

    public n3(z6 z6Var) {
        this.f5591a = z6Var;
    }

    public final void a() {
        z6 z6Var = this.f5591a;
        z6Var.K();
        z6Var.f().g();
        z6Var.f().g();
        if (this.f5592b) {
            z6Var.e().B.a("Unregistering connectivity change receiver");
            this.f5592b = false;
            this.f5593c = false;
            try {
                z6Var.f5856y.f5452o.unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                z6Var.e().f5397t.b(e10, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        z6 z6Var = this.f5591a;
        z6Var.K();
        String action = intent.getAction();
        z6Var.e().B.b(action, "NetworkBroadcastReceiver received action");
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            l3 l3Var = z6Var.f5849p;
            z6.E(l3Var);
            boolean k10 = l3Var.k();
            if (this.f5593c != k10) {
                this.f5593c = k10;
                z6Var.f().n(new m3(this, k10));
                return;
            }
            return;
        }
        z6Var.e().w.b(action, "NetworkBroadcastReceiver received unknown action");
    }
}

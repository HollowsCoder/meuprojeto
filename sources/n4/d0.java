package n4;

import android.content.Context;
import b5.d;
import java.util.HashMap;
import n4.b;
import n4.g;
import q4.a;

public final class d0 extends g {

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<g.a, f0> f7415c = new HashMap<>();
    public final Context d;

    /* renamed from: e  reason: collision with root package name */
    public final d f7416e;

    /* renamed from: f  reason: collision with root package name */
    public final a f7417f;

    /* renamed from: g  reason: collision with root package name */
    public final long f7418g;

    /* renamed from: h  reason: collision with root package name */
    public final long f7419h;

    public d0(Context context) {
        this.d = context.getApplicationContext();
        this.f7416e = new d(context.getMainLooper(), new e0(this));
        this.f7417f = a.b();
        this.f7418g = 5000;
        this.f7419h = 300000;
    }

    public final boolean a(g.a aVar, b.h hVar, String str) {
        boolean z;
        synchronized (this.f7415c) {
            f0 f0Var = this.f7415c.get(aVar);
            if (f0Var == null) {
                f0Var = new f0(this, aVar);
                f0Var.f7431a.put(hVar, hVar);
                f0Var.a(str);
                this.f7415c.put(aVar, f0Var);
            } else {
                this.f7416e.removeMessages(0, aVar);
                if (!f0Var.f7431a.containsKey(hVar)) {
                    f0Var.f7431a.put(hVar, hVar);
                    int i10 = f0Var.f7432b;
                    if (i10 == 1) {
                        hVar.onServiceConnected(f0Var.f7435f, f0Var.d);
                    } else if (i10 == 2) {
                        f0Var.a(str);
                    }
                } else {
                    String valueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            z = f0Var.f7433c;
        }
        return z;
    }

    public final void b(g.a aVar, b.h hVar) {
        synchronized (this.f7415c) {
            f0 f0Var = this.f7415c.get(aVar);
            if (f0Var == null) {
                String valueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (f0Var.f7431a.containsKey(hVar)) {
                f0Var.f7431a.remove(hVar);
                if (f0Var.f7431a.isEmpty()) {
                    this.f7416e.sendMessageDelayed(this.f7416e.obtainMessage(0, aVar), this.f7418g);
                }
            } else {
                String valueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }
}

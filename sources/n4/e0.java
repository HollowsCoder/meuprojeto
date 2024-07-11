package n4;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import n4.g;

public final class e0 implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d0 f7429a;

    public e0(d0 d0Var) {
        this.f7429a = d0Var;
    }

    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            synchronized (this.f7429a.f7415c) {
                g.a aVar = (g.a) message.obj;
                f0 f0Var = this.f7429a.f7415c.get(aVar);
                if (f0Var != null && f0Var.f7431a.isEmpty()) {
                    if (f0Var.f7433c) {
                        d0 d0Var = f0Var.f7436g;
                        d0Var.f7416e.removeMessages(1, f0Var.f7434e);
                        d0Var.f7417f.c(d0Var.d, f0Var);
                        f0Var.f7433c = false;
                        f0Var.f7432b = 2;
                    }
                    this.f7429a.f7415c.remove(aVar);
                }
            }
            return true;
        } else if (i10 != 1) {
            return false;
        } else {
            synchronized (this.f7429a.f7415c) {
                g.a aVar2 = (g.a) message.obj;
                f0 f0Var2 = this.f7429a.f7415c.get(aVar2);
                if (f0Var2 != null && f0Var2.f7432b == 3) {
                    String valueOf = String.valueOf(aVar2);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = f0Var2.f7435f;
                    if (componentName == null) {
                        aVar2.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = aVar2.f7441b;
                        m.h(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    f0Var2.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
    }
}

package b8;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import b8.e;
import b8.g0;
import c1.r;
import h5.j4;
import m5.j;

public final class f0 extends Binder {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f2012b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final a f2013a;

    public interface a {
    }

    public f0(e.a aVar) {
        this.f2013a = aVar;
    }

    public final void a(g0.a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            Intent intent = aVar.f2020a;
            e eVar = e.this;
            eVar.getClass();
            j jVar = new j();
            eVar.f2003o.execute(new j4(eVar, intent, jVar, 3));
            jVar.f7089a.p(e0.f2009o, new r(9, aVar));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}

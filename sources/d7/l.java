package d7;

import android.util.Log;
import d7.b0;
import k7.d;
import m5.i;

public final class l implements b0.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f4245a;

    public l(t tVar) {
        this.f4245a = tVar;
    }

    public final void a(d dVar, Thread thread, Throwable th) {
        i<TContinuationResult> g10;
        t tVar = this.f4245a;
        synchronized (tVar) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, (Throwable) null);
            }
            long currentTimeMillis = System.currentTimeMillis();
            f fVar = tVar.d;
            n nVar = new n(tVar, currentTimeMillis, th, thread, dVar);
            synchronized (fVar.f4221c) {
                g10 = fVar.f4220b.g(fVar.f4219a, new g(nVar));
                fVar.f4220b = g10.e(fVar.f4219a, new h());
            }
            try {
                p0.a(g10);
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e10);
            }
        }
        return;
    }
}

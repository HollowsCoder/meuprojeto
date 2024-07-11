package d7;

import android.util.Log;
import i7.d;
import i7.e;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import m5.i;
import m5.l;

public final class p implements Callable<i<Void>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Boolean f4261a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f4262b;

    public p(q qVar, Boolean bool) {
        this.f4262b = qVar;
        this.f4261a = bool;
    }

    public final Object call() {
        Boolean bool = this.f4261a;
        boolean booleanValue = bool.booleanValue();
        q qVar = this.f4262b;
        if (!booleanValue) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", (Throwable) null);
            }
            t tVar = qVar.f4265p;
            for (File delete : e.d(tVar.f4275f.f6130a.listFiles(t.f4270p))) {
                delete.delete();
            }
            t tVar2 = qVar.f4265p;
            e eVar = tVar2.f4280k.f4253b.f6128b;
            d.a(e.d(eVar.f6132c.listFiles()));
            d.a(e.d(eVar.d.listFiles()));
            d.a(e.d(eVar.f6133e.listFiles()));
            tVar2.f4283o.c((Object) null);
            return l.e((Object) null);
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Sending cached crash reports...", (Throwable) null);
        }
        boolean booleanValue2 = bool.booleanValue();
        c0 c0Var = qVar.f4265p.f4272b;
        if (booleanValue2) {
            c0Var.f4211f.c((Object) null);
            Executor executor = qVar.f4265p.d.f4219a;
            return qVar.f4264o.n(executor, new o(this, executor));
        }
        c0Var.getClass();
        throw new IllegalStateException("An invalid data collection token was used.");
    }
}

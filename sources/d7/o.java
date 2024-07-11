package d7;

import android.util.Log;
import java.util.concurrent.Executor;
import l7.a;
import m5.h;
import m5.i;
import m5.l;

public final class o implements h<a, Void> {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Executor f4256o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ p f4257p;

    public o(p pVar, Executor executor) {
        this.f4257p = pVar;
        this.f4256o = executor;
    }

    public final i i(Object obj) {
        if (((a) obj) == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", (Throwable) null);
        } else {
            p pVar = this.f4257p;
            t.b(pVar.f4262b.f4265p);
            q qVar = pVar.f4262b;
            qVar.f4265p.f4280k.d(this.f4256o);
            qVar.f4265p.f4283o.c((Object) null);
        }
        return l.e((Object) null);
    }
}

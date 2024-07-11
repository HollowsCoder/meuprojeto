package d7;

import android.util.Log;
import java.util.Arrays;
import java.util.concurrent.Executor;
import l7.a;
import m5.h;
import m5.i;
import m5.l;

public final class m implements h<a, Void> {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Executor f4246o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ n f4247p;

    public m(n nVar, Executor executor) {
        this.f4247p = nVar;
        this.f4246o = executor;
    }

    public final i i(Object obj) {
        if (((a) obj) == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", (Throwable) null);
            return l.e((Object) null);
        }
        n nVar = this.f4247p;
        return l.f(Arrays.asList(new i[]{t.b(nVar.f4251e), nVar.f4251e.f4280k.d(this.f4246o)}));
    }
}

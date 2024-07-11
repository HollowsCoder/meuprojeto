package t7;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import t7.d;
import y6.d;
import y6.o;

public final class b implements d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f9027b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final v7.b<e> f9028a;

    public b(Context context) {
        o oVar = new o(new d(2, context));
        new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f9027b);
        this.f9028a = oVar;
    }

    public final d.a a(String str) {
        boolean a10;
        long currentTimeMillis = System.currentTimeMillis();
        boolean a11 = this.f9028a.get().a(str, currentTimeMillis);
        e eVar = this.f9028a.get();
        synchronized (eVar) {
            a10 = eVar.a("fire-global", currentTimeMillis);
        }
        if (a11 && a10) {
            return d.a.COMBINED;
        }
        if (a10) {
            return d.a.GLOBAL;
        }
        if (a11) {
            return d.a.SDK;
        }
        return d.a.NONE;
    }
}

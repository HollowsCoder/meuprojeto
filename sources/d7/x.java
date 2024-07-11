package d7;

import android.content.Context;
import android.util.Log;
import androidx.appcompat.widget.m;
import c7.b;
import i7.e;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import k7.d;
import m5.i;
import m5.l;
import s6.c;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4289a;

    /* renamed from: b  reason: collision with root package name */
    public final c0 f4290b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4291c = System.currentTimeMillis();
    public m d;

    /* renamed from: e  reason: collision with root package name */
    public m f4292e;

    /* renamed from: f  reason: collision with root package name */
    public t f4293f;

    /* renamed from: g  reason: collision with root package name */
    public final h0 f4294g;

    /* renamed from: h  reason: collision with root package name */
    public final e f4295h;

    /* renamed from: i  reason: collision with root package name */
    public final b f4296i;

    /* renamed from: j  reason: collision with root package name */
    public final b7.a f4297j;

    /* renamed from: k  reason: collision with root package name */
    public final ExecutorService f4298k;
    public final f l;

    /* renamed from: m  reason: collision with root package name */
    public final a7.a f4299m;

    public class a implements Callable<Boolean> {
        public a() {
        }

        public final Object call() {
            try {
                m mVar = x.this.d;
                e eVar = (e) mVar.f653q;
                eVar.getClass();
                boolean delete = new File(eVar.f6130a, (String) mVar.f652p).delete();
                if (!delete) {
                    Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", (Throwable) null);
                }
                return Boolean.valueOf(delete);
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e10);
                return Boolean.FALSE;
            }
        }
    }

    public x(c cVar, h0 h0Var, a7.b bVar, c0 c0Var, e2.a aVar, d2.b bVar2, e eVar, ExecutorService executorService) {
        this.f4290b = c0Var;
        cVar.a();
        this.f4289a = cVar.f8815a;
        this.f4294g = h0Var;
        this.f4299m = bVar;
        this.f4296i = aVar;
        this.f4297j = bVar2;
        this.f4298k = executorService;
        this.f4295h = eVar;
        this.l = new f(executorService);
    }

    public static i a(x xVar, d dVar) {
        i iVar;
        if (Boolean.TRUE.equals(xVar.l.d.get())) {
            xVar.d.b();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Initialization marker file was created.", (Throwable) null);
            }
            try {
                xVar.f4296i.e(new u(xVar));
                k7.c cVar = (k7.c) dVar;
                if (!cVar.f6718h.get().b().f6972a) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", (Throwable) null);
                    }
                    iVar = l.d(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                } else {
                    if (!xVar.f4293f.d(cVar)) {
                        Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", (Throwable) null);
                    }
                    iVar = xVar.f4293f.e(cVar.f6719i.get().f7089a);
                }
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e10);
                iVar = l.d(e10);
            } catch (Throwable th) {
                xVar.b();
                throw th;
            }
            xVar.b();
            return iVar;
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public final void b() {
        this.l.a(new a());
    }
}

package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.appcompat.widget.f1;
import androidx.emoji2.text.e;
import f0.d;
import f0.l;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class k extends e.c {
    public static final a d = new a();

    public static class a {
    }

    public static class b implements e.g {

        /* renamed from: a  reason: collision with root package name */
        public final Context f1077a;

        /* renamed from: b  reason: collision with root package name */
        public final f0.e f1078b;

        /* renamed from: c  reason: collision with root package name */
        public final a f1079c;
        public final Object d = new Object();

        /* renamed from: e  reason: collision with root package name */
        public Handler f1080e;

        /* renamed from: f  reason: collision with root package name */
        public Executor f1081f;

        /* renamed from: g  reason: collision with root package name */
        public ThreadPoolExecutor f1082g;

        /* renamed from: h  reason: collision with root package name */
        public e.h f1083h;

        public b(Context context, f0.e eVar) {
            a aVar = k.d;
            if (context != null) {
                this.f1077a = context.getApplicationContext();
                this.f1078b = eVar;
                this.f1079c = aVar;
                return;
            }
            throw new NullPointerException("Context cannot be null");
        }

        public final void a(e.h hVar) {
            synchronized (this.d) {
                this.f1083h = hVar;
            }
            c();
        }

        public final void b() {
            synchronized (this.d) {
                this.f1083h = null;
                Handler handler = this.f1080e;
                if (handler != null) {
                    handler.removeCallbacks((Runnable) null);
                }
                this.f1080e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f1082g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f1081f = null;
                this.f1082g = null;
            }
        }

        public final void c() {
            synchronized (this.d) {
                if (this.f1083h != null) {
                    if (this.f1081f == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat", 0));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        this.f1082g = threadPoolExecutor;
                        this.f1081f = threadPoolExecutor;
                    }
                    this.f1081f.execute(new f1(1, this));
                }
            }
        }

        public final l d() {
            try {
                a aVar = this.f1079c;
                Context context = this.f1077a;
                f0.e eVar = this.f1078b;
                aVar.getClass();
                f0.k a10 = d.a(context, eVar);
                int i10 = a10.f4576a;
                if (i10 == 0) {
                    l[] lVarArr = a10.f4577b;
                    if (lVarArr != null && lVarArr.length != 0) {
                        return lVarArr[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException("fetchFonts failed (" + i10 + ")");
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }
    }

    public k(Context context, f0.e eVar) {
        super(new b(context, eVar));
    }
}

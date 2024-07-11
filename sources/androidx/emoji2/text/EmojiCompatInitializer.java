package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import androidx.emoji2.text.e;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import e0.d;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class EmojiCompatInitializer implements a1.b<Boolean> {

    public static class a extends e.c {
        public a(Context context) {
            super(new b(context));
            this.f1051b = 1;
        }
    }

    public static class b implements e.g {

        /* renamed from: a  reason: collision with root package name */
        public final Context f1034a;

        public b(Context context) {
            this.f1034a = context.getApplicationContext();
        }

        public final void a(e.h hVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("EmojiCompatInitializer", 0));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new f(this, hVar, threadPoolExecutor, 0));
        }
    }

    public static class c implements Runnable {
        public final void run() {
            boolean z;
            try {
                int i10 = d.f4446a;
                Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                if (e.f1039j != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    e.a().c();
                }
                Trace.endSection();
            } catch (Throwable th) {
                int i11 = d.f4446a;
                Trace.endSection();
                throw th;
            }
        }
    }

    public final List<Class<? extends a1.b<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* renamed from: c */
    public final Boolean b(Context context) {
        a aVar = new a(context);
        if (e.f1039j == null) {
            synchronized (e.f1038i) {
                if (e.f1039j == null) {
                    e.f1039j = new e(aVar);
                }
            }
        }
        if (a1.a.d == null) {
            synchronized (a1.a.f46e) {
                if (a1.a.d == null) {
                    a1.a.d = new a1.a(context);
                }
            }
        }
        a1.a aVar2 = a1.a.d;
        aVar2.getClass();
        final o r5 = ((n) aVar2.a(ProcessLifecycleInitializer.class, new HashSet())).r();
        r5.a(new androidx.lifecycle.c() {
            public final void h() {
                Handler handler;
                EmojiCompatInitializer.this.getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = b.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new c(), 500);
                r5.b(this);
            }
        });
        return Boolean.TRUE;
    }
}

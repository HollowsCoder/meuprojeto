package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import k4.e;
import k4.f;
import k4.g;
import k4.h;
import l4.c0;
import l4.r;
import n4.m;
import z4.c;

@KeepName
public abstract class BasePendingResult<R extends g> extends e<R> {

    /* renamed from: g  reason: collision with root package name */
    public static final c0 f2327g = new c0();

    /* renamed from: a  reason: collision with root package name */
    public final Object f2328a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final CountDownLatch f2329b = new CountDownLatch(1);

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<e.a> f2330c = new ArrayList<>();
    public R d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2331e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2332f;
    @KeepName
    private b mResultGuardian;

    public static class a<R extends g> extends c {
        public a(@RecentlyNonNull Looper looper) {
            super(looper);
        }

        public final void handleMessage(@RecentlyNonNull Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                Pair pair = (Pair) message.obj;
                h hVar = (h) pair.first;
                g gVar = (g) pair.second;
                try {
                    hVar.a();
                } catch (RuntimeException e10) {
                    BasePendingResult.d(gVar);
                    throw e10;
                }
            } else if (i10 != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i10);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                BasePendingResult basePendingResult = (BasePendingResult) message.obj;
                Status status = Status.u;
                synchronized (basePendingResult.f2328a) {
                    if (!basePendingResult.b()) {
                        basePendingResult.c(basePendingResult.a(status));
                        basePendingResult.f2331e = true;
                    }
                }
            }
        }
    }

    public final class b {
        public b() {
        }

        public final void finalize() {
            BasePendingResult.d(BasePendingResult.this.d);
            super.finalize();
        }
    }

    @Deprecated
    public BasePendingResult() {
        new AtomicReference();
        this.f2332f = false;
        new a(Looper.getMainLooper());
        new WeakReference((Object) null);
    }

    public BasePendingResult(r rVar) {
        Looper looper;
        new AtomicReference();
        this.f2332f = false;
        if (rVar != null) {
            looper = rVar.f6936a.f6691e;
        } else {
            looper = Looper.getMainLooper();
        }
        new a(looper);
        new WeakReference(rVar);
    }

    public static void d(g gVar) {
        if (gVar instanceof f) {
            try {
                ((f) gVar).a();
            } catch (RuntimeException e10) {
                String valueOf = String.valueOf(gVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e10);
            }
        }
    }

    public abstract Status a(@RecentlyNonNull Status status);

    @RecentlyNonNull
    public final boolean b() {
        return this.f2329b.getCount() == 0;
    }

    public final void c(@RecentlyNonNull R r5) {
        synchronized (this.f2328a) {
            if (!this.f2331e) {
                b();
                boolean z = false;
                if (!b()) {
                    z = true;
                }
                m.j("Results have already been set", z);
                m.j("Result has already been consumed", true);
                e(r5);
                return;
            }
            d(r5);
        }
    }

    public final void e(R r5) {
        this.d = r5;
        r5.J();
        this.f2329b.countDown();
        if (this.d instanceof f) {
            this.mResultGuardian = new b();
        }
        ArrayList<e.a> arrayList = this.f2330c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            e.a aVar = arrayList.get(i10);
            i10++;
            aVar.a();
        }
        this.f2330c.clear();
    }
}

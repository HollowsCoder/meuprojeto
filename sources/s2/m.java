package s2;

import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.widget.x0;
import i3.g;
import java.io.File;
import java.util.concurrent.Executor;
import m3.g;
import n3.a;
import q2.f;
import s2.c;
import s2.j;
import s2.q;
import u2.a;
import u2.e;
import u2.h;

public final class m implements o, h.a, q.a {

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f8624h = Log.isLoggable("Engine", 2);

    /* renamed from: a  reason: collision with root package name */
    public final t f8625a;

    /* renamed from: b  reason: collision with root package name */
    public final q0.d f8626b;

    /* renamed from: c  reason: collision with root package name */
    public final h f8627c;
    public final b d;

    /* renamed from: e  reason: collision with root package name */
    public final z f8628e;

    /* renamed from: f  reason: collision with root package name */
    public final a f8629f;

    /* renamed from: g  reason: collision with root package name */
    public final c f8630g;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final j.e f8631a;

        /* renamed from: b  reason: collision with root package name */
        public final a.c f8632b = n3.a.a(150, new C0128a());

        /* renamed from: c  reason: collision with root package name */
        public int f8633c;

        /* renamed from: s2.m$a$a  reason: collision with other inner class name */
        public class C0128a implements a.b<j<?>> {
            public C0128a() {
            }

            public final Object a() {
                a aVar = a.this;
                return new j(aVar.f8631a, aVar.f8632b);
            }
        }

        public a(c cVar) {
            this.f8631a = cVar;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final v2.a f8635a;

        /* renamed from: b  reason: collision with root package name */
        public final v2.a f8636b;

        /* renamed from: c  reason: collision with root package name */
        public final v2.a f8637c;
        public final v2.a d;

        /* renamed from: e  reason: collision with root package name */
        public final o f8638e;

        /* renamed from: f  reason: collision with root package name */
        public final q.a f8639f;

        /* renamed from: g  reason: collision with root package name */
        public final a.c f8640g = n3.a.a(150, new a());

        public class a implements a.b<n<?>> {
            public a() {
            }

            public final Object a() {
                b bVar = b.this;
                return new n(bVar.f8635a, bVar.f8636b, bVar.f8637c, bVar.d, bVar.f8638e, bVar.f8639f, bVar.f8640g);
            }
        }

        public b(v2.a aVar, v2.a aVar2, v2.a aVar3, v2.a aVar4, o oVar, q.a aVar5) {
            this.f8635a = aVar;
            this.f8636b = aVar2;
            this.f8637c = aVar3;
            this.d = aVar4;
            this.f8638e = oVar;
            this.f8639f = aVar5;
        }
    }

    public static class c implements j.e {

        /* renamed from: a  reason: collision with root package name */
        public final a.C0134a f8642a;

        /* renamed from: b  reason: collision with root package name */
        public volatile u2.a f8643b;

        public c(a.C0134a aVar) {
            this.f8642a = aVar;
        }

        public final u2.a a() {
            if (this.f8643b == null) {
                synchronized (this) {
                    if (this.f8643b == null) {
                        u2.c cVar = (u2.c) this.f8642a;
                        e eVar = (e) cVar.f9066b;
                        File cacheDir = eVar.f9072a.getCacheDir();
                        u2.d dVar = null;
                        if (cacheDir == null) {
                            cacheDir = null;
                        } else {
                            String str = eVar.f9073b;
                            if (str != null) {
                                cacheDir = new File(cacheDir, str);
                            }
                        }
                        if (cacheDir != null) {
                            if (cacheDir.isDirectory() || cacheDir.mkdirs()) {
                                dVar = new u2.d(cacheDir, cVar.f9065a);
                            }
                        }
                        this.f8643b = dVar;
                    }
                    if (this.f8643b == null) {
                        this.f8643b = new n.e();
                    }
                }
            }
            return this.f8643b;
        }
    }

    public class d {

        /* renamed from: a  reason: collision with root package name */
        public final n<?> f8644a;

        /* renamed from: b  reason: collision with root package name */
        public final g f8645b;

        public d(g gVar, n<?> nVar) {
            this.f8645b = gVar;
            this.f8644a = nVar;
        }
    }

    public m(h hVar, a.C0134a aVar, v2.a aVar2, v2.a aVar3, v2.a aVar4, v2.a aVar5) {
        this.f8627c = hVar;
        c cVar = new c(aVar);
        c cVar2 = new c();
        this.f8630g = cVar2;
        synchronized (this) {
            synchronized (cVar2) {
                cVar2.d = this;
            }
        }
        this.f8626b = new q0.d(2);
        this.f8625a = new t(0, 0);
        this.d = new b(aVar2, aVar3, aVar4, aVar5, this, this);
        this.f8629f = new a(cVar);
        this.f8628e = new z();
        ((u2.g) hVar).d = this;
    }

    public static void d(String str, long j8, f fVar) {
        StringBuilder h10 = x0.h(str, " in ");
        h10.append(m3.f.a(j8));
        h10.append("ms, key: ");
        h10.append(fVar);
        Log.v("Engine", h10.toString());
    }

    public static void e(w wVar) {
        if (wVar instanceof q) {
            ((q) wVar).e();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    public final void a(f fVar, q<?> qVar) {
        c cVar = this.f8630g;
        synchronized (cVar) {
            c.a aVar = (c.a) cVar.f8564b.remove(fVar);
            if (aVar != null) {
                aVar.f8568c = null;
                aVar.clear();
            }
        }
        if (qVar.f8671o) {
            w wVar = (w) ((u2.g) this.f8627c).d(fVar, qVar);
        } else {
            this.f8628e.a(qVar, false);
        }
    }

    public final d b(com.bumptech.glide.g gVar, Object obj, f fVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.j jVar, l lVar, m3.b bVar, boolean z, boolean z10, q2.h hVar, boolean z11, boolean z12, boolean z13, boolean z14, g gVar2, Executor executor) {
        long j8;
        if (f8624h) {
            int i12 = m3.f.f7074b;
            j8 = SystemClock.elapsedRealtimeNanos();
        } else {
            j8 = 0;
        }
        long j10 = j8;
        this.f8626b.getClass();
        p pVar = new p(obj, fVar, i10, i11, bVar, cls, cls2, hVar);
        synchronized (this) {
            try {
                q<?> c10 = c(pVar, z11, j10);
                if (c10 == null) {
                    d f10 = f(gVar, obj, fVar, i10, i11, cls, cls2, jVar, lVar, bVar, z, z10, hVar, z11, z12, z13, z14, gVar2, executor, pVar, j10);
                    return f10;
                }
                ((i3.h) gVar2).o(c10, q2.a.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final q<?> c(p pVar, boolean z, long j8) {
        q<?> qVar;
        Y y10;
        q<?> qVar2;
        if (!z) {
            return null;
        }
        c cVar = this.f8630g;
        synchronized (cVar) {
            c.a aVar = (c.a) cVar.f8564b.get(pVar);
            if (aVar == null) {
                qVar = null;
            } else {
                qVar = (q) aVar.get();
                if (qVar == null) {
                    cVar.b(aVar);
                }
            }
        }
        if (qVar != null) {
            qVar.a();
        }
        if (qVar != null) {
            if (f8624h) {
                d("Loaded resource from active resources", j8, pVar);
            }
            return qVar;
        }
        u2.g gVar = (u2.g) this.f8627c;
        synchronized (gVar) {
            g.a aVar2 = (g.a) gVar.f7075a.remove(pVar);
            if (aVar2 == null) {
                y10 = null;
            } else {
                gVar.f7077c -= (long) aVar2.f7079b;
                y10 = aVar2.f7078a;
            }
        }
        w wVar = (w) y10;
        if (wVar == null) {
            qVar2 = null;
        } else if (wVar instanceof q) {
            qVar2 = (q) wVar;
        } else {
            qVar2 = new q<>(wVar, true, true, pVar, this);
        }
        if (qVar2 != null) {
            qVar2.a();
            this.f8630g.a(pVar, qVar2);
        }
        if (qVar2 == null) {
            return null;
        }
        if (f8624h) {
            d("Loaded resource from cache", j8, pVar);
        }
        return qVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final s2.m.d f(com.bumptech.glide.g r17, java.lang.Object r18, q2.f r19, int r20, int r21, java.lang.Class r22, java.lang.Class r23, com.bumptech.glide.j r24, s2.l r25, m3.b r26, boolean r27, boolean r28, q2.h r29, boolean r30, boolean r31, boolean r32, boolean r33, i3.g r34, java.util.concurrent.Executor r35, s2.p r36, long r37) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r24
            r7 = r25
            r8 = r29
            r9 = r33
            r10 = r34
            r11 = r35
            r12 = r36
            r13 = r37
            s2.t r15 = r1.f8625a
            if (r9 == 0) goto L_0x0023
            java.lang.Object r15 = r15.f8686p
            goto L_0x0025
        L_0x0023:
            java.lang.Object r15 = r15.f8685o
        L_0x0025:
            java.util.Map r15 = (java.util.Map) r15
            java.lang.Object r15 = r15.get(r12)
            s2.n r15 = (s2.n) r15
            if (r15 == 0) goto L_0x0041
            r15.a(r10, r11)
            boolean r0 = f8624h
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = "Added to existing load"
            d(r0, r13, r12)
        L_0x003b:
            s2.m$d r0 = new s2.m$d
            r0.<init>(r10, r15)
            return r0
        L_0x0041:
            s2.m$b r15 = r1.d
            n3.a$c r15 = r15.f8640g
            java.lang.Object r15 = r15.b()
            s2.n r15 = (s2.n) r15
            s6.a.n(r15)
            monitor-enter(r15)
            r15.z = r12     // Catch:{ all -> 0x0115 }
            r13 = r30
            r15.A = r13     // Catch:{ all -> 0x0115 }
            r13 = r31
            r15.B = r13     // Catch:{ all -> 0x0115 }
            r13 = r32
            r15.C = r13     // Catch:{ all -> 0x0115 }
            r15.D = r9     // Catch:{ all -> 0x0115 }
            monitor-exit(r15)
            s2.m$a r13 = r1.f8629f
            n3.a$c r14 = r13.f8632b
            java.lang.Object r14 = r14.b()
            s2.j r14 = (s2.j) r14
            s6.a.n(r14)
            int r10 = r13.f8633c
            int r11 = r10 + 1
            r13.f8633c = r11
            s2.i<R> r11 = r14.f8597o
            r11.f8583c = r0
            r11.d = r2
            r11.f8592n = r3
            r11.f8584e = r4
            r11.f8585f = r5
            r11.f8594p = r7
            r13 = r22
            r11.f8586g = r13
            s2.j$e r13 = r14.f8600r
            r11.f8587h = r13
            r13 = r23
            r11.f8590k = r13
            r11.f8593o = r6
            r11.f8588i = r8
            r13 = r26
            r11.f8589j = r13
            r13 = r27
            r11.f8595q = r13
            r13 = r28
            r11.f8596r = r13
            r14.f8603v = r0
            r14.w = r3
            r14.f8604x = r6
            r14.f8605y = r12
            r14.z = r4
            r14.A = r5
            r14.B = r7
            r14.I = r9
            r14.C = r8
            r14.D = r15
            r14.E = r10
            s2.j$g r0 = s2.j.g.INITIALIZE
            r14.G = r0
            r14.J = r2
            s2.t r0 = r1.f8625a
            r0.getClass()
            boolean r2 = r15.D
            if (r2 == 0) goto L_0x00c5
            java.lang.Object r0 = r0.f8686p
            goto L_0x00c7
        L_0x00c5:
            java.lang.Object r0 = r0.f8685o
        L_0x00c7:
            java.util.Map r0 = (java.util.Map) r0
            r0.put(r12, r15)
            r0 = r34
            r2 = r35
            r15.a(r0, r2)
            monitor-enter(r15)
            r15.K = r14     // Catch:{ all -> 0x0112 }
            s2.j$h r2 = s2.j.h.INITIALIZE     // Catch:{ all -> 0x0112 }
            s2.j$h r2 = r14.r(r2)     // Catch:{ all -> 0x0112 }
            s2.j$h r3 = s2.j.h.RESOURCE_CACHE     // Catch:{ all -> 0x0112 }
            if (r2 == r3) goto L_0x00e7
            s2.j$h r3 = s2.j.h.DATA_CACHE     // Catch:{ all -> 0x0112 }
            if (r2 != r3) goto L_0x00e5
            goto L_0x00e7
        L_0x00e5:
            r2 = 0
            goto L_0x00e8
        L_0x00e7:
            r2 = 1
        L_0x00e8:
            if (r2 == 0) goto L_0x00ed
            v2.a r2 = r15.u     // Catch:{ all -> 0x0112 }
            goto L_0x00fd
        L_0x00ed:
            boolean r2 = r15.B     // Catch:{ all -> 0x0112 }
            if (r2 == 0) goto L_0x00f4
            v2.a r2 = r15.w     // Catch:{ all -> 0x0112 }
            goto L_0x00fd
        L_0x00f4:
            boolean r2 = r15.C     // Catch:{ all -> 0x0112 }
            if (r2 == 0) goto L_0x00fb
            v2.a r2 = r15.f8654x     // Catch:{ all -> 0x0112 }
            goto L_0x00fd
        L_0x00fb:
            v2.a r2 = r15.f8653v     // Catch:{ all -> 0x0112 }
        L_0x00fd:
            r2.execute(r14)     // Catch:{ all -> 0x0112 }
            monitor-exit(r15)
            boolean r2 = f8624h
            if (r2 == 0) goto L_0x010c
            java.lang.String r2 = "Started new load"
            r3 = r37
            d(r2, r3, r12)
        L_0x010c:
            s2.m$d r2 = new s2.m$d
            r2.<init>(r0, r15)
            return r2
        L_0x0112:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        L_0x0115:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.m.f(com.bumptech.glide.g, java.lang.Object, q2.f, int, int, java.lang.Class, java.lang.Class, com.bumptech.glide.j, s2.l, m3.b, boolean, boolean, q2.h, boolean, boolean, boolean, boolean, i3.g, java.util.concurrent.Executor, s2.p, long):s2.m$d");
    }
}

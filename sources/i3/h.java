package i3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.appcompat.widget.x0;
import com.bumptech.glide.g;
import com.bumptech.glide.j;
import j3.f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import k3.a;
import k3.b;
import m3.e;
import n3.d;
import s2.l;
import s2.m;
import s2.w;
import w2.k;

public final class h<R> implements c, f, g {
    public static final boolean D = Log.isLoggable("Request", 2);
    public int A;
    public boolean B;
    public final RuntimeException C;

    /* renamed from: a  reason: collision with root package name */
    public final String f6038a;

    /* renamed from: b  reason: collision with root package name */
    public final d.a f6039b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f6040c;
    public final e<R> d;

    /* renamed from: e  reason: collision with root package name */
    public final d f6041e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f6042f;

    /* renamed from: g  reason: collision with root package name */
    public final g f6043g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f6044h;

    /* renamed from: i  reason: collision with root package name */
    public final Class<R> f6045i;

    /* renamed from: j  reason: collision with root package name */
    public final a<?> f6046j;

    /* renamed from: k  reason: collision with root package name */
    public final int f6047k;
    public final int l;

    /* renamed from: m  reason: collision with root package name */
    public final j f6048m;

    /* renamed from: n  reason: collision with root package name */
    public final j3.g<R> f6049n;

    /* renamed from: o  reason: collision with root package name */
    public final List<e<R>> f6050o;

    /* renamed from: p  reason: collision with root package name */
    public final b<? super R> f6051p;

    /* renamed from: q  reason: collision with root package name */
    public final Executor f6052q;

    /* renamed from: r  reason: collision with root package name */
    public w<R> f6053r;

    /* renamed from: s  reason: collision with root package name */
    public m.d f6054s;

    /* renamed from: t  reason: collision with root package name */
    public long f6055t;
    public volatile m u;

    /* renamed from: v  reason: collision with root package name */
    public a f6056v;
    public Drawable w;

    /* renamed from: x  reason: collision with root package name */
    public Drawable f6057x;

    /* renamed from: y  reason: collision with root package name */
    public Drawable f6058y;
    public int z;

    public enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public h(Context context, g gVar, Object obj, Object obj2, Class cls, a aVar, int i10, int i11, j jVar, j3.g gVar2, ArrayList arrayList, d dVar, m mVar, a.C0092a aVar2) {
        g gVar3 = gVar;
        e.a aVar3 = e.f7071a;
        this.f6038a = D ? String.valueOf(hashCode()) : null;
        this.f6039b = new d.a();
        this.f6040c = obj;
        this.f6042f = context;
        this.f6043g = gVar3;
        this.f6044h = obj2;
        this.f6045i = cls;
        this.f6046j = aVar;
        this.f6047k = i10;
        this.l = i11;
        this.f6048m = jVar;
        this.f6049n = gVar2;
        this.d = null;
        this.f6050o = arrayList;
        this.f6041e = dVar;
        this.u = mVar;
        this.f6051p = aVar2;
        this.f6052q = aVar3;
        this.f6056v = a.PENDING;
        if (this.C == null && gVar3.f2246h.f2249a.containsKey(com.bumptech.glide.e.class)) {
            this.C = new RuntimeException("Glide request origin trace");
        }
    }

    public final boolean a() {
        boolean z10;
        synchronized (this.f6040c) {
            z10 = this.f6056v == a.COMPLETE;
        }
        return z10;
    }

    public final void b(int i10, int i11) {
        Object obj;
        int i12;
        q2.h hVar;
        boolean z10;
        boolean z11;
        boolean z12;
        a aVar;
        String str;
        int i13 = i10;
        int i14 = i11;
        this.f6039b.a();
        Object obj2 = this.f6040c;
        synchronized (obj2) {
            try {
                boolean z13 = D;
                if (z13) {
                    l("Got onSizeReady in " + m3.f.a(this.f6055t));
                }
                if (this.f6056v == a.WAITING_FOR_SIZE) {
                    a aVar2 = a.RUNNING;
                    this.f6056v = aVar2;
                    float f10 = this.f6046j.f6025p;
                    if (i13 != Integer.MIN_VALUE) {
                        i13 = Math.round(((float) i13) * f10);
                    }
                    this.z = i13;
                    if (i14 == Integer.MIN_VALUE) {
                        i12 = i14;
                    } else {
                        i12 = Math.round(f10 * ((float) i14));
                    }
                    this.A = i12;
                    if (z13) {
                        l("finished setup for calling load in " + m3.f.a(this.f6055t));
                    }
                    m mVar = this.u;
                    g gVar = this.f6043g;
                    Object obj3 = this.f6044h;
                    a<?> aVar3 = this.f6046j;
                    q2.f fVar = aVar3.z;
                    int i15 = this.z;
                    int i16 = this.A;
                    Class<?> cls = aVar3.G;
                    Class<R> cls2 = this.f6045i;
                    j jVar = this.f6048m;
                    l lVar = aVar3.f6026q;
                    m3.b bVar = aVar3.F;
                    a aVar4 = aVar2;
                    boolean z14 = aVar3.A;
                    String str2 = "finished onSizeReady in ";
                    boolean z15 = aVar3.M;
                    Object obj4 = obj2;
                    try {
                        hVar = aVar3.E;
                        z10 = aVar3.w;
                        z11 = aVar3.K;
                        z12 = aVar3.N;
                        aVar = aVar4;
                        obj = obj4;
                        str = str2;
                    } catch (Throwable th) {
                        th = th;
                        obj = obj4;
                        while (true) {
                            try {
                                break;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        throw th;
                    }
                    try {
                        m.d b10 = mVar.b(gVar, obj3, fVar, i15, i16, cls, cls2, jVar, lVar, bVar, z14, z15, hVar, z10, z11, z12, aVar3.L, this, this.f6052q);
                        try {
                            this.f6054s = b10;
                            if (this.f6056v != aVar) {
                                this.f6054s = null;
                            }
                            if (z13) {
                                l(str + m3.f.a(this.f6055t));
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            while (true) {
                                break;
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        while (true) {
                            break;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                obj = obj2;
                while (true) {
                    break;
                }
                throw th;
            }
        }
    }

    public final boolean c(c cVar) {
        int i10;
        int i11;
        Object obj;
        Class<R> cls;
        a<?> aVar;
        j jVar;
        int i12;
        int i13;
        int i14;
        Object obj2;
        Class<R> cls2;
        a<?> aVar2;
        j jVar2;
        int i15;
        boolean z10;
        c cVar2 = cVar;
        if (!(cVar2 instanceof h)) {
            return false;
        }
        synchronized (this.f6040c) {
            i10 = this.f6047k;
            i11 = this.l;
            obj = this.f6044h;
            cls = this.f6045i;
            aVar = this.f6046j;
            jVar = this.f6048m;
            List<e<R>> list = this.f6050o;
            if (list != null) {
                i12 = list.size();
            } else {
                i12 = 0;
            }
        }
        h hVar = (h) cVar2;
        synchronized (hVar.f6040c) {
            i13 = hVar.f6047k;
            i14 = hVar.l;
            obj2 = hVar.f6044h;
            cls2 = hVar.f6045i;
            aVar2 = hVar.f6046j;
            jVar2 = hVar.f6048m;
            List<e<R>> list2 = hVar.f6050o;
            if (list2 != null) {
                i15 = list2.size();
            } else {
                i15 = 0;
            }
        }
        if (i10 == i13 && i11 == i14) {
            char[] cArr = m3.j.f7084a;
            if (obj == null) {
                if (obj2 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else if (obj instanceof k) {
                z10 = ((k) obj).a();
            } else {
                z10 = obj.equals(obj2);
            }
            if (z10 && cls.equals(cls2) && aVar.equals(aVar2) && jVar == jVar2 && i12 == i15) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        r5.u.getClass();
        s2.m.e(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f6040c
            monitor-enter(r0)
            boolean r1 = r5.B     // Catch:{ all -> 0x004f }
            if (r1 != 0) goto L_0x0047
            n3.d$a r1 = r5.f6039b     // Catch:{ all -> 0x004f }
            r1.a()     // Catch:{ all -> 0x004f }
            i3.h$a r1 = r5.f6056v     // Catch:{ all -> 0x004f }
            i3.h$a r2 = i3.h.a.CLEARED     // Catch:{ all -> 0x004f }
            if (r1 != r2) goto L_0x0014
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            return
        L_0x0014:
            r5.e()     // Catch:{ all -> 0x004f }
            s2.w<R> r1 = r5.f6053r     // Catch:{ all -> 0x004f }
            r3 = 0
            if (r1 == 0) goto L_0x001f
            r5.f6053r = r3     // Catch:{ all -> 0x004f }
            goto L_0x0020
        L_0x001f:
            r1 = r3
        L_0x0020:
            i3.d r3 = r5.f6041e     // Catch:{ all -> 0x004f }
            if (r3 == 0) goto L_0x002d
            boolean r3 = r3.j(r5)     // Catch:{ all -> 0x004f }
            if (r3 == 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r3 = 0
            goto L_0x002e
        L_0x002d:
            r3 = 1
        L_0x002e:
            if (r3 == 0) goto L_0x0039
            j3.g<R> r3 = r5.f6049n     // Catch:{ all -> 0x004f }
            android.graphics.drawable.Drawable r4 = r5.h()     // Catch:{ all -> 0x004f }
            r3.i(r4)     // Catch:{ all -> 0x004f }
        L_0x0039:
            r5.f6056v = r2     // Catch:{ all -> 0x004f }
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            if (r1 == 0) goto L_0x0046
            s2.m r0 = r5.u
            r0.getClass()
            s2.m.e(r1)
        L_0x0046:
            return
        L_0x0047:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x004f }
            java.lang.String r2 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r1.<init>(r2)     // Catch:{ all -> 0x004f }
            throw r1     // Catch:{ all -> 0x004f }
        L_0x004f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.h.clear():void");
    }

    public final boolean d() {
        boolean z10;
        synchronized (this.f6040c) {
            z10 = this.f6056v == a.CLEARED;
        }
        return z10;
    }

    public final void e() {
        if (!this.B) {
            this.f6039b.a();
            this.f6049n.e(this);
            m.d dVar = this.f6054s;
            if (dVar != null) {
                synchronized (m.this) {
                    dVar.f8644a.g(dVar.f8645b);
                }
                this.f6054s = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    public final void f() {
        synchronized (this.f6040c) {
            if (isRunning()) {
                clear();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ba, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r7 = this;
            java.lang.String r0 = "finished run method in "
            java.lang.Object r1 = r7.f6040c
            monitor-enter(r1)
            boolean r2 = r7.B     // Catch:{ all -> 0x00c3 }
            if (r2 != 0) goto L_0x00c5
            n3.d$a r2 = r7.f6039b     // Catch:{ all -> 0x00c3 }
            r2.a()     // Catch:{ all -> 0x00c3 }
            int r2 = m3.f.f7074b     // Catch:{ all -> 0x00c3 }
            long r2 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x00c3 }
            r7.f6055t = r2     // Catch:{ all -> 0x00c3 }
            java.lang.Object r2 = r7.f6044h     // Catch:{ all -> 0x00c3 }
            if (r2 != 0) goto L_0x0055
            int r0 = r7.f6047k     // Catch:{ all -> 0x00c3 }
            int r2 = r7.l     // Catch:{ all -> 0x00c3 }
            boolean r0 = m3.j.h(r0, r2)     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x002c
            int r0 = r7.f6047k     // Catch:{ all -> 0x00c3 }
            r7.z = r0     // Catch:{ all -> 0x00c3 }
            int r0 = r7.l     // Catch:{ all -> 0x00c3 }
            r7.A = r0     // Catch:{ all -> 0x00c3 }
        L_0x002c:
            android.graphics.drawable.Drawable r0 = r7.f6058y     // Catch:{ all -> 0x00c3 }
            if (r0 != 0) goto L_0x0042
            i3.a<?> r0 = r7.f6046j     // Catch:{ all -> 0x00c3 }
            android.graphics.drawable.Drawable r2 = r0.C     // Catch:{ all -> 0x00c3 }
            r7.f6058y = r2     // Catch:{ all -> 0x00c3 }
            if (r2 != 0) goto L_0x0042
            int r0 = r0.D     // Catch:{ all -> 0x00c3 }
            if (r0 <= 0) goto L_0x0042
            android.graphics.drawable.Drawable r0 = r7.j(r0)     // Catch:{ all -> 0x00c3 }
            r7.f6058y = r0     // Catch:{ all -> 0x00c3 }
        L_0x0042:
            android.graphics.drawable.Drawable r0 = r7.f6058y     // Catch:{ all -> 0x00c3 }
            if (r0 != 0) goto L_0x0048
            r0 = 5
            goto L_0x0049
        L_0x0048:
            r0 = 3
        L_0x0049:
            s2.r r2 = new s2.r     // Catch:{ all -> 0x00c3 }
            java.lang.String r3 = "Received null model"
            r2.<init>(r3)     // Catch:{ all -> 0x00c3 }
            r7.m(r2, r0)     // Catch:{ all -> 0x00c3 }
            monitor-exit(r1)     // Catch:{ all -> 0x00c3 }
            return
        L_0x0055:
            i3.h$a r2 = r7.f6056v     // Catch:{ all -> 0x00c3 }
            i3.h$a r3 = i3.h.a.RUNNING     // Catch:{ all -> 0x00c3 }
            if (r2 == r3) goto L_0x00bb
            i3.h$a r4 = i3.h.a.COMPLETE     // Catch:{ all -> 0x00c3 }
            r5 = 0
            if (r2 != r4) goto L_0x0069
            s2.w<R> r0 = r7.f6053r     // Catch:{ all -> 0x00c3 }
            q2.a r2 = q2.a.MEMORY_CACHE     // Catch:{ all -> 0x00c3 }
            r7.o(r0, r2, r5)     // Catch:{ all -> 0x00c3 }
            monitor-exit(r1)     // Catch:{ all -> 0x00c3 }
            return
        L_0x0069:
            i3.h$a r2 = i3.h.a.WAITING_FOR_SIZE     // Catch:{ all -> 0x00c3 }
            r7.f6056v = r2     // Catch:{ all -> 0x00c3 }
            int r4 = r7.f6047k     // Catch:{ all -> 0x00c3 }
            int r6 = r7.l     // Catch:{ all -> 0x00c3 }
            boolean r4 = m3.j.h(r4, r6)     // Catch:{ all -> 0x00c3 }
            if (r4 == 0) goto L_0x007f
            int r4 = r7.f6047k     // Catch:{ all -> 0x00c3 }
            int r6 = r7.l     // Catch:{ all -> 0x00c3 }
            r7.b(r4, r6)     // Catch:{ all -> 0x00c3 }
            goto L_0x0084
        L_0x007f:
            j3.g<R> r4 = r7.f6049n     // Catch:{ all -> 0x00c3 }
            r4.c(r7)     // Catch:{ all -> 0x00c3 }
        L_0x0084:
            i3.h$a r4 = r7.f6056v     // Catch:{ all -> 0x00c3 }
            if (r4 == r3) goto L_0x008a
            if (r4 != r2) goto L_0x00a0
        L_0x008a:
            i3.d r2 = r7.f6041e     // Catch:{ all -> 0x00c3 }
            if (r2 == 0) goto L_0x0094
            boolean r2 = r2.h(r7)     // Catch:{ all -> 0x00c3 }
            if (r2 == 0) goto L_0x0095
        L_0x0094:
            r5 = 1
        L_0x0095:
            if (r5 == 0) goto L_0x00a0
            j3.g<R> r2 = r7.f6049n     // Catch:{ all -> 0x00c3 }
            android.graphics.drawable.Drawable r3 = r7.h()     // Catch:{ all -> 0x00c3 }
            r2.f(r3)     // Catch:{ all -> 0x00c3 }
        L_0x00a0:
            boolean r2 = D     // Catch:{ all -> 0x00c3 }
            if (r2 == 0) goto L_0x00b9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c3 }
            r2.<init>(r0)     // Catch:{ all -> 0x00c3 }
            long r3 = r7.f6055t     // Catch:{ all -> 0x00c3 }
            double r3 = m3.f.a(r3)     // Catch:{ all -> 0x00c3 }
            r2.append(r3)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00c3 }
            r7.l(r0)     // Catch:{ all -> 0x00c3 }
        L_0x00b9:
            monitor-exit(r1)     // Catch:{ all -> 0x00c3 }
            return
        L_0x00bb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00c3 }
            java.lang.String r2 = "Cannot restart a running request"
            r0.<init>(r2)     // Catch:{ all -> 0x00c3 }
            throw r0     // Catch:{ all -> 0x00c3 }
        L_0x00c3:
            r0 = move-exception
            goto L_0x00cd
        L_0x00c5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00c3 }
            java.lang.String r2 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r0.<init>(r2)     // Catch:{ all -> 0x00c3 }
            throw r0     // Catch:{ all -> 0x00c3 }
        L_0x00cd:
            monitor-exit(r1)     // Catch:{ all -> 0x00c3 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.h.g():void");
    }

    public final Drawable h() {
        int i10;
        if (this.f6057x == null) {
            a<?> aVar = this.f6046j;
            Drawable drawable = aVar.u;
            this.f6057x = drawable;
            if (drawable == null && (i10 = aVar.f6030v) > 0) {
                this.f6057x = j(i10);
            }
        }
        return this.f6057x;
    }

    public final boolean i() {
        d dVar = this.f6041e;
        return dVar == null || !dVar.getRoot().a();
    }

    public final boolean isRunning() {
        boolean z10;
        synchronized (this.f6040c) {
            a aVar = this.f6056v;
            if (aVar != a.RUNNING) {
                if (aVar != a.WAITING_FOR_SIZE) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        return z10;
    }

    public final Drawable j(int i10) {
        Resources.Theme theme = this.f6046j.I;
        if (theme == null) {
            theme = this.f6042f.getTheme();
        }
        g gVar = this.f6043g;
        return b3.a.a(gVar, gVar, i10, theme);
    }

    public final boolean k() {
        boolean z10;
        synchronized (this.f6040c) {
            z10 = this.f6056v == a.COMPLETE;
        }
        return z10;
    }

    public final void l(String str) {
        StringBuilder h10 = x0.h(str, " this: ");
        h10.append(this.f6038a);
        Log.v("Request", h10.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0082 A[Catch:{ all -> 0x008f }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00db A[Catch:{ all -> 0x008f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(s2.r r6, int r7) {
        /*
            r5 = this;
            java.lang.String r0 = "Load failed for "
            n3.d$a r1 = r5.f6039b
            r1.a()
            java.lang.Object r1 = r5.f6040c
            monitor-enter(r1)
            r6.getClass()     // Catch:{ all -> 0x00e3 }
            com.bumptech.glide.g r2 = r5.f6043g     // Catch:{ all -> 0x00e3 }
            int r2 = r2.f2247i     // Catch:{ all -> 0x00e3 }
            if (r2 > r7) goto L_0x0045
            java.lang.String r7 = "Glide"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e3 }
            r3.<init>(r0)     // Catch:{ all -> 0x00e3 }
            java.lang.Object r0 = r5.f6044h     // Catch:{ all -> 0x00e3 }
            r3.append(r0)     // Catch:{ all -> 0x00e3 }
            java.lang.String r0 = " with size ["
            r3.append(r0)     // Catch:{ all -> 0x00e3 }
            int r0 = r5.z     // Catch:{ all -> 0x00e3 }
            r3.append(r0)     // Catch:{ all -> 0x00e3 }
            java.lang.String r0 = "x"
            r3.append(r0)     // Catch:{ all -> 0x00e3 }
            int r0 = r5.A     // Catch:{ all -> 0x00e3 }
            r3.append(r0)     // Catch:{ all -> 0x00e3 }
            java.lang.String r0 = "]"
            r3.append(r0)     // Catch:{ all -> 0x00e3 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x00e3 }
            android.util.Log.w(r7, r0, r6)     // Catch:{ all -> 0x00e3 }
            r7 = 4
            if (r2 > r7) goto L_0x0045
            r6.e()     // Catch:{ all -> 0x00e3 }
        L_0x0045:
            r6 = 0
            r5.f6054s = r6     // Catch:{ all -> 0x00e3 }
            i3.h$a r7 = i3.h.a.FAILED     // Catch:{ all -> 0x00e3 }
            r5.f6056v = r7     // Catch:{ all -> 0x00e3 }
            r7 = 1
            r5.B = r7     // Catch:{ all -> 0x00e3 }
            r0 = 0
            java.util.List<i3.e<R>> r2 = r5.f6050o     // Catch:{ all -> 0x008f }
            if (r2 == 0) goto L_0x006e
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x008f }
            r3 = r0
        L_0x0059:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x008f }
            if (r4 == 0) goto L_0x006f
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x008f }
            i3.e r4 = (i3.e) r4     // Catch:{ all -> 0x008f }
            r5.i()     // Catch:{ all -> 0x008f }
            boolean r4 = r4.b()     // Catch:{ all -> 0x008f }
            r3 = r3 | r4
            goto L_0x0059
        L_0x006e:
            r3 = r0
        L_0x006f:
            i3.e<R> r2 = r5.d     // Catch:{ all -> 0x008f }
            if (r2 == 0) goto L_0x007e
            r5.i()     // Catch:{ all -> 0x008f }
            boolean r2 = r2.b()     // Catch:{ all -> 0x008f }
            if (r2 == 0) goto L_0x007e
            r2 = r7
            goto L_0x007f
        L_0x007e:
            r2 = r0
        L_0x007f:
            r2 = r2 | r3
            if (r2 != 0) goto L_0x00d5
            i3.d r2 = r5.f6041e     // Catch:{ all -> 0x008f }
            if (r2 == 0) goto L_0x0091
            boolean r2 = r2.h(r5)     // Catch:{ all -> 0x008f }
            if (r2 == 0) goto L_0x008d
            goto L_0x0091
        L_0x008d:
            r7 = r0
            goto L_0x0091
        L_0x008f:
            r6 = move-exception
            goto L_0x00e0
        L_0x0091:
            if (r7 != 0) goto L_0x0094
            goto L_0x00d5
        L_0x0094:
            java.lang.Object r7 = r5.f6044h     // Catch:{ all -> 0x008f }
            if (r7 != 0) goto L_0x00b0
            android.graphics.drawable.Drawable r6 = r5.f6058y     // Catch:{ all -> 0x008f }
            if (r6 != 0) goto L_0x00ae
            i3.a<?> r6 = r5.f6046j     // Catch:{ all -> 0x008f }
            android.graphics.drawable.Drawable r7 = r6.C     // Catch:{ all -> 0x008f }
            r5.f6058y = r7     // Catch:{ all -> 0x008f }
            if (r7 != 0) goto L_0x00ae
            int r6 = r6.D     // Catch:{ all -> 0x008f }
            if (r6 <= 0) goto L_0x00ae
            android.graphics.drawable.Drawable r6 = r5.j(r6)     // Catch:{ all -> 0x008f }
            r5.f6058y = r6     // Catch:{ all -> 0x008f }
        L_0x00ae:
            android.graphics.drawable.Drawable r6 = r5.f6058y     // Catch:{ all -> 0x008f }
        L_0x00b0:
            if (r6 != 0) goto L_0x00ca
            android.graphics.drawable.Drawable r6 = r5.w     // Catch:{ all -> 0x008f }
            if (r6 != 0) goto L_0x00c8
            i3.a<?> r6 = r5.f6046j     // Catch:{ all -> 0x008f }
            android.graphics.drawable.Drawable r7 = r6.f6028s     // Catch:{ all -> 0x008f }
            r5.w = r7     // Catch:{ all -> 0x008f }
            if (r7 != 0) goto L_0x00c8
            int r6 = r6.f6029t     // Catch:{ all -> 0x008f }
            if (r6 <= 0) goto L_0x00c8
            android.graphics.drawable.Drawable r6 = r5.j(r6)     // Catch:{ all -> 0x008f }
            r5.w = r6     // Catch:{ all -> 0x008f }
        L_0x00c8:
            android.graphics.drawable.Drawable r6 = r5.w     // Catch:{ all -> 0x008f }
        L_0x00ca:
            if (r6 != 0) goto L_0x00d0
            android.graphics.drawable.Drawable r6 = r5.h()     // Catch:{ all -> 0x008f }
        L_0x00d0:
            j3.g<R> r7 = r5.f6049n     // Catch:{ all -> 0x008f }
            r7.d(r6)     // Catch:{ all -> 0x008f }
        L_0x00d5:
            r5.B = r0     // Catch:{ all -> 0x00e3 }
            i3.d r6 = r5.f6041e     // Catch:{ all -> 0x00e3 }
            if (r6 == 0) goto L_0x00de
            r6.b(r5)     // Catch:{ all -> 0x00e3 }
        L_0x00de:
            monitor-exit(r1)     // Catch:{ all -> 0x00e3 }
            return
        L_0x00e0:
            r5.B = r0     // Catch:{ all -> 0x00e3 }
            throw r6     // Catch:{ all -> 0x00e3 }
        L_0x00e3:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00e3 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.h.m(s2.r, int):void");
    }

    /* JADX INFO: finally extract failed */
    public final void n(w wVar, Object obj, q2.a aVar) {
        boolean z10;
        i();
        this.f6056v = a.COMPLETE;
        this.f6053r = wVar;
        if (this.f6043g.f2247i <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + aVar + " for " + this.f6044h + " with size [" + this.z + "x" + this.A + "] in " + m3.f.a(this.f6055t) + " ms");
        }
        boolean z11 = true;
        this.B = true;
        try {
            List<e<R>> list = this.f6050o;
            if (list != null) {
                z10 = false;
                for (e<R> a10 : list) {
                    z10 |= a10.a();
                }
            } else {
                z10 = false;
            }
            e<R> eVar = this.d;
            if (eVar == null || !eVar.a()) {
                z11 = false;
            }
            if (!z11 && !z10) {
                this.f6051p.getClass();
                this.f6049n.j(obj);
            }
            this.B = false;
            d dVar = this.f6041e;
            if (dVar != null) {
                dVar.e(this);
            }
        } catch (Throwable th) {
            this.B = false;
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        r7.u.getClass();
        s2.m.e(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0061, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o(s2.w<?> r8, q2.a r9, boolean r10) {
        /*
            r7 = this;
            java.lang.String r10 = "Expected to receive an object of "
            java.lang.String r0 = "Expected to receive a Resource<R> with an object of "
            n3.d$a r1 = r7.f6039b
            r1.a()
            r1 = 0
            java.lang.Object r2 = r7.f6040c     // Catch:{ all -> 0x00c2 }
            monitor-enter(r2)     // Catch:{ all -> 0x00c2 }
            r7.f6054s = r1     // Catch:{ all -> 0x00b4 }
            r3 = 5
            if (r8 != 0) goto L_0x002f
            s2.r r8 = new s2.r     // Catch:{ all -> 0x00b4 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b4 }
            r9.<init>(r0)     // Catch:{ all -> 0x00b4 }
            java.lang.Class<R> r10 = r7.f6045i     // Catch:{ all -> 0x00b4 }
            r9.append(r10)     // Catch:{ all -> 0x00b4 }
            java.lang.String r10 = " inside, but instead got null."
            r9.append(r10)     // Catch:{ all -> 0x00b4 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00b4 }
            r8.<init>(r9)     // Catch:{ all -> 0x00b4 }
            r7.m(r8, r3)     // Catch:{ all -> 0x00b4 }
            monitor-exit(r2)     // Catch:{ all -> 0x00b4 }
            return
        L_0x002f:
            java.lang.Object r0 = r8.get()     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x0067
            java.lang.Class<R> r4 = r7.f6045i     // Catch:{ all -> 0x00b4 }
            java.lang.Class r5 = r0.getClass()     // Catch:{ all -> 0x00b4 }
            boolean r4 = r4.isAssignableFrom(r5)     // Catch:{ all -> 0x00b4 }
            if (r4 != 0) goto L_0x0042
            goto L_0x0067
        L_0x0042:
            i3.d r10 = r7.f6041e     // Catch:{ all -> 0x00b4 }
            if (r10 == 0) goto L_0x004f
            boolean r10 = r10.i(r7)     // Catch:{ all -> 0x00b4 }
            if (r10 == 0) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r10 = 0
            goto L_0x0050
        L_0x004f:
            r10 = 1
        L_0x0050:
            if (r10 != 0) goto L_0x0062
            r7.f6053r = r1     // Catch:{ all -> 0x00b0 }
            i3.h$a r9 = i3.h.a.COMPLETE     // Catch:{ all -> 0x00b0 }
            r7.f6056v = r9     // Catch:{ all -> 0x00b0 }
        L_0x0058:
            monitor-exit(r2)     // Catch:{ all -> 0x00b0 }
            s2.m r9 = r7.u
            r9.getClass()
            s2.m.e(r8)
            return
        L_0x0062:
            r7.n(r8, r0, r9)     // Catch:{ all -> 0x00b4 }
            monitor-exit(r2)     // Catch:{ all -> 0x00b4 }
            return
        L_0x0067:
            r7.f6053r = r1     // Catch:{ all -> 0x00b0 }
            s2.r r9 = new s2.r     // Catch:{ all -> 0x00b0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b0 }
            r1.<init>(r10)     // Catch:{ all -> 0x00b0 }
            java.lang.Class<R> r10 = r7.f6045i     // Catch:{ all -> 0x00b0 }
            r1.append(r10)     // Catch:{ all -> 0x00b0 }
            java.lang.String r10 = " but instead got "
            r1.append(r10)     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x0081
            java.lang.Class r10 = r0.getClass()     // Catch:{ all -> 0x00b0 }
            goto L_0x0083
        L_0x0081:
            java.lang.String r10 = ""
        L_0x0083:
            r1.append(r10)     // Catch:{ all -> 0x00b0 }
            java.lang.String r10 = "{"
            r1.append(r10)     // Catch:{ all -> 0x00b0 }
            r1.append(r0)     // Catch:{ all -> 0x00b0 }
            java.lang.String r10 = "} inside Resource{"
            r1.append(r10)     // Catch:{ all -> 0x00b0 }
            r1.append(r8)     // Catch:{ all -> 0x00b0 }
            java.lang.String r10 = "}."
            r1.append(r10)     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x00a0
            java.lang.String r10 = ""
            goto L_0x00a2
        L_0x00a0:
            java.lang.String r10 = " To indicate failure return a null Resource object, rather than a Resource object containing null data."
        L_0x00a2:
            r1.append(r10)     // Catch:{ all -> 0x00b0 }
            java.lang.String r10 = r1.toString()     // Catch:{ all -> 0x00b0 }
            r9.<init>(r10)     // Catch:{ all -> 0x00b0 }
            r7.m(r9, r3)     // Catch:{ all -> 0x00b0 }
            goto L_0x0058
        L_0x00b0:
            r9 = move-exception
            r1 = r8
            r8 = r7
            goto L_0x00b9
        L_0x00b4:
            r8 = move-exception
            r9 = r7
        L_0x00b6:
            r6 = r9
            r9 = r8
            r8 = r6
        L_0x00b9:
            monitor-exit(r2)     // Catch:{ all -> 0x00bd }
            throw r9     // Catch:{ all -> 0x00bb }
        L_0x00bb:
            r9 = move-exception
            goto L_0x00c4
        L_0x00bd:
            r9 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
            goto L_0x00b6
        L_0x00c2:
            r9 = move-exception
            r8 = r7
        L_0x00c4:
            if (r1 == 0) goto L_0x00ce
            s2.m r8 = r8.u
            r8.getClass()
            s2.m.e(r1)
        L_0x00ce:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.h.o(s2.w, q2.a, boolean):void");
    }
}

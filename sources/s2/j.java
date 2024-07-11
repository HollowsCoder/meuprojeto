package s2;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.widget.x0;
import com.bumptech.glide.load.data.e;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import n3.a;
import n3.d;
import q2.k;
import s2.h;
import s2.m;
import s2.n;
import s2.q;
import z2.m;

public final class j<R> implements h.a, Runnable, Comparable<j<?>>, a.d {
    public int A;
    public l B;
    public q2.h C;
    public b<R> D;
    public int E;
    public h F;
    public g G;
    public long H;
    public boolean I;
    public Object J;
    public Thread K;
    public q2.f L;
    public q2.f M;
    public Object N;
    public q2.a O;
    public com.bumptech.glide.load.data.d<?> P;
    public volatile h Q;
    public volatile boolean R;
    public volatile boolean S;
    public boolean T;

    /* renamed from: o  reason: collision with root package name */
    public final i<R> f8597o = new i<>();

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f8598p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    public final d.a f8599q = new d.a();

    /* renamed from: r  reason: collision with root package name */
    public final e f8600r;

    /* renamed from: s  reason: collision with root package name */
    public final h0.c<j<?>> f8601s;

    /* renamed from: t  reason: collision with root package name */
    public final d<?> f8602t = new d<>();
    public final f u = new f();

    /* renamed from: v  reason: collision with root package name */
    public com.bumptech.glide.g f8603v;
    public q2.f w;

    /* renamed from: x  reason: collision with root package name */
    public com.bumptech.glide.j f8604x;

    /* renamed from: y  reason: collision with root package name */
    public p f8605y;
    public int z;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8606a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f8607b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f8608c;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0074 */
        static {
            /*
                q2.c[] r0 = q2.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8608c = r0
                r1 = 1
                q2.c r2 = q2.c.SOURCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f8608c     // Catch:{ NoSuchFieldError -> 0x001d }
                q2.c r3 = q2.c.TRANSFORMED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                s2.j$h[] r2 = s2.j.h.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f8607b = r2
                s2.j$h r3 = s2.j.h.RESOURCE_CACHE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f8607b     // Catch:{ NoSuchFieldError -> 0x0038 }
                s2.j$h r3 = s2.j.h.DATA_CACHE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                r2 = 3
                int[] r3 = f8607b     // Catch:{ NoSuchFieldError -> 0x0043 }
                s2.j$h r4 = s2.j.h.SOURCE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r3 = f8607b     // Catch:{ NoSuchFieldError -> 0x004e }
                s2.j$h r4 = s2.j.h.FINISHED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r3 = f8607b     // Catch:{ NoSuchFieldError -> 0x0059 }
                s2.j$h r4 = s2.j.h.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                s2.j$g[] r3 = s2.j.g.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f8606a = r3
                s2.j$g r4 = s2.j.g.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x006a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
            L_0x006a:
                int[] r1 = f8606a     // Catch:{ NoSuchFieldError -> 0x0074 }
                s2.j$g r3 = s2.j.g.SWITCH_TO_SOURCE_SERVICE     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                int[] r0 = f8606a     // Catch:{ NoSuchFieldError -> 0x007e }
                s2.j$g r1 = s2.j.g.DECODE_DATA     // Catch:{ NoSuchFieldError -> 0x007e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: s2.j.a.<clinit>():void");
        }
    }

    public interface b<R> {
    }

    public final class c<Z> {

        /* renamed from: a  reason: collision with root package name */
        public final q2.a f8609a;

        public c(q2.a aVar) {
            this.f8609a = aVar;
        }
    }

    public static class d<Z> {

        /* renamed from: a  reason: collision with root package name */
        public q2.f f8611a;

        /* renamed from: b  reason: collision with root package name */
        public k<Z> f8612b;

        /* renamed from: c  reason: collision with root package name */
        public v<Z> f8613c;
    }

    public interface e {
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public boolean f8614a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f8615b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f8616c;

        public final boolean a() {
            return (this.f8616c || this.f8615b) && this.f8614a;
        }
    }

    public enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    public enum h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public j(e eVar, a.c cVar) {
        this.f8600r = eVar;
        this.f8601s = cVar;
    }

    public final int compareTo(Object obj) {
        j jVar = (j) obj;
        int ordinal = this.f8604x.ordinal() - jVar.f8604x.ordinal();
        if (ordinal == 0) {
            return this.E - jVar.E;
        }
        return ordinal;
    }

    public final void g() {
        v2.a aVar;
        this.G = g.SWITCH_TO_SOURCE_SERVICE;
        n nVar = (n) this.D;
        if (nVar.B) {
            aVar = nVar.w;
        } else if (nVar.C) {
            aVar = nVar.f8654x;
        } else {
            aVar = nVar.f8653v;
        }
        aVar.execute(this);
    }

    public final void i(q2.f fVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, q2.a aVar) {
        v2.a aVar2;
        dVar.b();
        r rVar = new r("Fetching data failed", Collections.singletonList(exc));
        Class<?> a10 = dVar.a();
        rVar.f8679p = fVar;
        rVar.f8680q = aVar;
        rVar.f8681r = a10;
        this.f8598p.add(rVar);
        if (Thread.currentThread() != this.K) {
            this.G = g.SWITCH_TO_SOURCE_SERVICE;
            n nVar = (n) this.D;
            if (nVar.B) {
                aVar2 = nVar.w;
            } else if (nVar.C) {
                aVar2 = nVar.f8654x;
            } else {
                aVar2 = nVar.f8653v;
            }
            aVar2.execute(this);
            return;
        }
        v();
    }

    public final d.a k() {
        return this.f8599q;
    }

    public final void l(q2.f fVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, q2.a aVar, q2.f fVar2) {
        v2.a aVar2;
        this.L = fVar;
        this.N = obj;
        this.P = dVar;
        this.O = aVar;
        this.M = fVar2;
        boolean z10 = false;
        if (fVar != this.f8597o.a().get(0)) {
            z10 = true;
        }
        this.T = z10;
        if (Thread.currentThread() != this.K) {
            this.G = g.DECODE_DATA;
            n nVar = (n) this.D;
            if (nVar.B) {
                aVar2 = nVar.w;
            } else if (nVar.C) {
                aVar2 = nVar.f8654x;
            } else {
                aVar2 = nVar.f8653v;
            }
            aVar2.execute(this);
            return;
        }
        p();
    }

    public final <Data> w<R> n(com.bumptech.glide.load.data.d<?> dVar, Data data, q2.a aVar) {
        if (data == null) {
            dVar.b();
            return null;
        }
        try {
            int i10 = m3.f.f7074b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            w<R> o10 = o(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                s(elapsedRealtimeNanos, "Decoded result " + o10, (String) null);
            }
            return o10;
        } finally {
            dVar.b();
        }
    }

    public final <Data> w<R> o(Data data, q2.a aVar) {
        com.bumptech.glide.load.data.e b10;
        boolean z10;
        u<Data, ?, R> c10 = this.f8597o.c(data.getClass());
        q2.h hVar = this.C;
        if (Build.VERSION.SDK_INT >= 26) {
            if (aVar == q2.a.RESOURCE_DISK_CACHE || this.f8597o.f8596r) {
                z10 = true;
            } else {
                z10 = false;
            }
            q2.g gVar = m.f9829i;
            Boolean bool = (Boolean) hVar.c(gVar);
            if (bool == null || (bool.booleanValue() && !z10)) {
                hVar = new q2.h();
                hVar.f8221b.i(this.C.f8221b);
                hVar.f8221b.put(gVar, Boolean.valueOf(z10));
            }
        }
        q2.h hVar2 = hVar;
        com.bumptech.glide.load.data.f fVar = this.f8603v.f2241b.f2254e;
        synchronized (fVar) {
            e.a aVar2 = (e.a) fVar.f2273a.get(data.getClass());
            if (aVar2 == null) {
                Iterator it = fVar.f2273a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e.a aVar3 = (e.a) it.next();
                    if (aVar3.a().isAssignableFrom(data.getClass())) {
                        aVar2 = aVar3;
                        break;
                    }
                }
            }
            if (aVar2 == null) {
                aVar2 = com.bumptech.glide.load.data.f.f2272b;
            }
            b10 = aVar2.b(data);
        }
        try {
            return c10.a(this.z, this.A, hVar2, b10, new c(aVar));
        } finally {
            b10.b();
        }
    }

    public final void p() {
        w<R> wVar;
        boolean z10;
        d<?> dVar;
        boolean a10;
        Object obj;
        if (Log.isLoggable("DecodeJob", 2)) {
            s(this.H, "Retrieved data", "data: " + this.N + ", cache key: " + this.L + ", fetcher: " + this.P);
        }
        v vVar = null;
        try {
            wVar = n(this.P, this.N, this.O);
        } catch (r e10) {
            q2.f fVar = this.M;
            q2.a aVar = this.O;
            e10.f8679p = fVar;
            e10.f8680q = aVar;
            e10.f8681r = null;
            this.f8598p.add(e10);
            wVar = null;
        }
        if (wVar != null) {
            q2.a aVar2 = this.O;
            boolean z11 = this.T;
            if (wVar instanceof s) {
                ((s) wVar).a();
            }
            boolean z12 = false;
            if (this.f8602t.f8613c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                vVar = (v) v.f8690s.b();
                s6.a.n(vVar);
                vVar.f8694r = false;
                vVar.f8693q = true;
                vVar.f8692p = wVar;
                wVar = vVar;
            }
            x();
            n nVar = (n) this.D;
            synchronized (nVar) {
                nVar.E = wVar;
                nVar.F = aVar2;
                nVar.M = z11;
            }
            synchronized (nVar) {
                nVar.f8648p.a();
                if (nVar.L) {
                    nVar.E.d();
                    nVar.f();
                } else if (nVar.f8647o.f8662o.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                } else if (!nVar.G) {
                    n.c cVar = nVar.f8651s;
                    w<?> wVar2 = nVar.E;
                    boolean z13 = nVar.A;
                    q2.f fVar2 = nVar.z;
                    q.a aVar3 = nVar.f8649q;
                    cVar.getClass();
                    nVar.J = new q(wVar2, z13, true, fVar2, aVar3);
                    nVar.G = true;
                    n.e eVar = nVar.f8647o;
                    eVar.getClass();
                    ArrayList<n.d> arrayList = new ArrayList<>(eVar.f8662o);
                    nVar.d(arrayList.size() + 1);
                    q2.f fVar3 = nVar.z;
                    q<?> qVar = nVar.J;
                    m mVar = (m) nVar.f8652t;
                    synchronized (mVar) {
                        if (qVar != null) {
                            if (qVar.f8671o) {
                                mVar.f8630g.a(fVar3, qVar);
                            }
                        }
                        t tVar = mVar.f8625a;
                        tVar.getClass();
                        if (nVar.D) {
                            obj = tVar.f8686p;
                        } else {
                            obj = tVar.f8685o;
                        }
                        Map map = (Map) obj;
                        if (nVar.equals(map.get(fVar3))) {
                            map.remove(fVar3);
                        }
                    }
                    for (n.d dVar2 : arrayList) {
                        dVar2.f8661b.execute(new n.b(dVar2.f8660a));
                    }
                    nVar.c();
                } else {
                    throw new IllegalStateException("Already have resource");
                }
            }
            this.F = h.ENCODE;
            try {
                dVar = this.f8602t;
                if (dVar.f8613c != null) {
                    z12 = true;
                }
                if (z12) {
                    e eVar2 = this.f8600r;
                    q2.h hVar = this.C;
                    dVar.getClass();
                    ((m.c) eVar2).a().a(dVar.f8611a, new g(dVar.f8612b, dVar.f8613c, hVar));
                    dVar.f8613c.a();
                }
                if (vVar != null) {
                    vVar.a();
                }
                f fVar4 = this.u;
                synchronized (fVar4) {
                    fVar4.f8615b = true;
                    a10 = fVar4.a();
                }
                if (a10) {
                    u();
                }
            } catch (Throwable th) {
                if (vVar != null) {
                    vVar.a();
                }
                throw th;
            }
        } else {
            v();
        }
    }

    public final h q() {
        int i10 = a.f8607b[this.F.ordinal()];
        i<R> iVar = this.f8597o;
        if (i10 == 1) {
            return new x(iVar, this);
        }
        if (i10 == 2) {
            return new e(iVar.a(), iVar, this);
        }
        if (i10 == 3) {
            return new b0(iVar, this);
        }
        if (i10 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.F);
    }

    public final h r(h hVar) {
        int i10 = a.f8607b[hVar.ordinal()];
        if (i10 == 1) {
            return this.B.a() ? h.DATA_CACHE : r(h.DATA_CACHE);
        }
        if (i10 == 2) {
            return this.I ? h.FINISHED : h.SOURCE;
        }
        if (i10 == 3 || i10 == 4) {
            return h.FINISHED;
        }
        if (i10 == 5) {
            return this.B.b() ? h.RESOURCE_CACHE : r(h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + hVar);
    }

    public final void run() {
        com.bumptech.glide.load.data.d<?> dVar = this.P;
        try {
            if (this.S) {
                t();
                if (dVar != null) {
                    dVar.b();
                    return;
                }
                return;
            }
            w();
            if (dVar != null) {
                dVar.b();
            }
        } catch (d e10) {
            throw e10;
        } catch (Throwable th) {
            if (dVar != null) {
                dVar.b();
            }
            throw th;
        }
    }

    public final void s(long j8, String str, String str2) {
        String str3;
        StringBuilder h10 = x0.h(str, " in ");
        h10.append(m3.f.a(j8));
        h10.append(", load key: ");
        h10.append(this.f8605y);
        if (str2 != null) {
            str3 = ", ".concat(str2);
        } else {
            str3 = BuildConfig.FLAVOR;
        }
        h10.append(str3);
        h10.append(", thread: ");
        h10.append(Thread.currentThread().getName());
        Log.v("DecodeJob", h10.toString());
    }

    public final void t() {
        boolean a10;
        Object obj;
        x();
        r rVar = new r("Failed to load resource", new ArrayList(this.f8598p));
        n nVar = (n) this.D;
        synchronized (nVar) {
            nVar.H = rVar;
        }
        synchronized (nVar) {
            nVar.f8648p.a();
            if (nVar.L) {
                nVar.f();
            } else if (nVar.f8647o.f8662o.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            } else if (!nVar.I) {
                nVar.I = true;
                q2.f fVar = nVar.z;
                n.e eVar = nVar.f8647o;
                eVar.getClass();
                ArrayList<n.d> arrayList = new ArrayList<>(eVar.f8662o);
                nVar.d(arrayList.size() + 1);
                m mVar = (m) nVar.f8652t;
                synchronized (mVar) {
                    t tVar = mVar.f8625a;
                    tVar.getClass();
                    if (nVar.D) {
                        obj = tVar.f8686p;
                    } else {
                        obj = tVar.f8685o;
                    }
                    Map map = (Map) obj;
                    if (nVar.equals(map.get(fVar))) {
                        map.remove(fVar);
                    }
                }
                for (n.d dVar : arrayList) {
                    dVar.f8661b.execute(new n.a(dVar.f8660a));
                }
                nVar.c();
            } else {
                throw new IllegalStateException("Already failed once");
            }
        }
        f fVar2 = this.u;
        synchronized (fVar2) {
            fVar2.f8616c = true;
            a10 = fVar2.a();
        }
        if (a10) {
            u();
        }
    }

    public final void u() {
        f fVar = this.u;
        synchronized (fVar) {
            fVar.f8615b = false;
            fVar.f8614a = false;
            fVar.f8616c = false;
        }
        d<?> dVar = this.f8602t;
        dVar.f8611a = null;
        dVar.f8612b = null;
        dVar.f8613c = null;
        i<R> iVar = this.f8597o;
        iVar.f8583c = null;
        iVar.d = null;
        iVar.f8592n = null;
        iVar.f8586g = null;
        iVar.f8590k = null;
        iVar.f8588i = null;
        iVar.f8593o = null;
        iVar.f8589j = null;
        iVar.f8594p = null;
        iVar.f8581a.clear();
        iVar.l = false;
        iVar.f8582b.clear();
        iVar.f8591m = false;
        this.R = false;
        this.f8603v = null;
        this.w = null;
        this.C = null;
        this.f8604x = null;
        this.f8605y = null;
        this.D = null;
        this.F = null;
        this.Q = null;
        this.K = null;
        this.L = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.H = 0;
        this.S = false;
        this.J = null;
        this.f8598p.clear();
        this.f8601s.a(this);
    }

    public final void v() {
        this.K = Thread.currentThread();
        int i10 = m3.f.f7074b;
        this.H = SystemClock.elapsedRealtimeNanos();
        boolean z10 = false;
        while (!this.S && this.Q != null && !(z10 = this.Q.a())) {
            this.F = r(this.F);
            this.Q = q();
            if (this.F == h.SOURCE) {
                g();
                return;
            }
        }
        if ((this.F == h.FINISHED || this.S) && !z10) {
            t();
        }
    }

    public final void w() {
        int i10 = a.f8606a[this.G.ordinal()];
        if (i10 == 1) {
            this.F = r(h.INITIALIZE);
            this.Q = q();
            v();
        } else if (i10 == 2) {
            v();
        } else if (i10 == 3) {
            p();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.G);
        }
    }

    public final void x() {
        Throwable th;
        this.f8599q.a();
        if (this.R) {
            if (this.f8598p.isEmpty()) {
                th = null;
            } else {
                ArrayList arrayList = this.f8598p;
                th = (Throwable) arrayList.get(arrayList.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.R = true;
    }
}

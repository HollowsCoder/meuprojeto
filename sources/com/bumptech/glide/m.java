package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.util.Log;
import d3.c;
import f3.b;
import f3.d;
import f3.h;
import f3.i;
import f3.j;
import f3.n;
import f3.p;
import i3.e;
import i3.f;
import j3.g;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import s2.l;

public final class m implements ComponentCallbacks2, i {

    /* renamed from: y  reason: collision with root package name */
    public static final f f2290y;

    /* renamed from: o  reason: collision with root package name */
    public final b f2291o;

    /* renamed from: p  reason: collision with root package name */
    public final Context f2292p;

    /* renamed from: q  reason: collision with root package name */
    public final h f2293q;

    /* renamed from: r  reason: collision with root package name */
    public final n f2294r;

    /* renamed from: s  reason: collision with root package name */
    public final f3.m f2295s;

    /* renamed from: t  reason: collision with root package name */
    public final p f2296t = new p();
    public final a u;

    /* renamed from: v  reason: collision with root package name */
    public final f3.b f2297v;
    public final CopyOnWriteArrayList<e<Object>> w;

    /* renamed from: x  reason: collision with root package name */
    public f f2298x;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            m mVar = m.this;
            mVar.f2293q.b(mVar);
        }
    }

    public class b implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public final n f2300a;

        public b(n nVar) {
            this.f2300a = nVar;
        }
    }

    static {
        f fVar = (f) new f().e(Bitmap.class);
        fVar.H = true;
        f2290y = fVar;
        ((f) new f().e(c.class)).H = true;
        f fVar2 = (f) ((f) ((f) new f().h(l.f8622b)).m(j.LOW)).r();
    }

    public m(b bVar, h hVar, f3.m mVar, Context context) {
        f3.b bVar2;
        f fVar;
        String str;
        boolean z = false;
        n nVar = new n(0);
        f3.c cVar = bVar.u;
        a aVar = new a();
        this.u = aVar;
        this.f2291o = bVar;
        this.f2293q = hVar;
        this.f2295s = mVar;
        this.f2294r = nVar;
        this.f2292p = context;
        Context applicationContext = context.getApplicationContext();
        b bVar3 = new b(nVar);
        ((f3.e) cVar).getClass();
        z = y.a.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0 ? true : z;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            if (z) {
                str = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor";
            } else {
                str = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor";
            }
            Log.d("ConnectivityMonitor", str);
        }
        if (z) {
            bVar2 = new d(applicationContext, bVar3);
        } else {
            bVar2 = new j();
        }
        this.f2297v = bVar2;
        if (m3.j.g()) {
            m3.j.e().post(aVar);
        } else {
            hVar.b(this);
        }
        hVar.b(bVar2);
        this.w = new CopyOnWriteArrayList<>(bVar.f2234q.f2243e);
        g gVar = bVar.f2234q;
        synchronized (gVar) {
            if (gVar.f2248j == null) {
                ((c) gVar.d).getClass();
                f fVar2 = new f();
                fVar2.H = true;
                gVar.f2248j = fVar2;
            }
            fVar = gVar.f2248j;
        }
        synchronized (this) {
            f fVar3 = (f) fVar.clone();
            if (fVar3.H) {
                if (!fVar3.J) {
                    throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
                }
            }
            fVar3.J = true;
            fVar3.H = true;
            this.f2298x = fVar3;
        }
        synchronized (bVar.f2238v) {
            if (!bVar.f2238v.contains(this)) {
                bVar.f2238v.add(this);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    public final synchronized void a() {
        m();
        this.f2296t.a();
    }

    public final synchronized void b() {
        this.f2296t.b();
        Iterator it = m3.j.d(this.f2296t.f4630o).iterator();
        while (it.hasNext()) {
            l((g) it.next());
        }
        this.f2296t.f4630o.clear();
        n nVar = this.f2294r;
        Iterator it2 = m3.j.d((Set) nVar.f4622c).iterator();
        while (it2.hasNext()) {
            nVar.a((i3.c) it2.next());
        }
        ((List) nVar.d).clear();
        this.f2293q.a(this);
        this.f2293q.a(this.f2297v);
        m3.j.e().removeCallbacks(this.u);
        this.f2291o.c(this);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void k() {
        /*
            r1 = this;
            monitor-enter(r1)
            monitor-enter(r1)     // Catch:{ all -> 0x000f }
            f3.n r0 = r1.f2294r     // Catch:{ all -> 0x0011 }
            r0.c()     // Catch:{ all -> 0x0011 }
            monitor-exit(r1)     // Catch:{ all -> 0x000f }
            f3.p r0 = r1.f2296t     // Catch:{ all -> 0x000f }
            r0.k()     // Catch:{ all -> 0x000f }
            monitor-exit(r1)
            return
        L_0x000f:
            r0 = move-exception
            goto L_0x0014
        L_0x0011:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x000f }
            throw r0     // Catch:{ all -> 0x000f }
        L_0x0014:
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.m.k():void");
    }

    public final void l(g<?> gVar) {
        boolean z;
        if (gVar != null) {
            boolean n10 = n(gVar);
            i3.c h10 = gVar.h();
            if (!n10) {
                b bVar = this.f2291o;
                synchronized (bVar.f2238v) {
                    Iterator it = bVar.f2238v.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((m) it.next()).n(gVar)) {
                                z = true;
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                }
                if (!z && h10 != null) {
                    gVar.g((i3.c) null);
                    h10.clear();
                }
            }
        }
    }

    public final synchronized void m() {
        n nVar = this.f2294r;
        nVar.f4621b = true;
        Iterator it = m3.j.d((Set) nVar.f4622c).iterator();
        while (it.hasNext()) {
            i3.c cVar = (i3.c) it.next();
            if (cVar.isRunning()) {
                cVar.f();
                ((List) nVar.d).add(cVar);
            }
        }
    }

    public final synchronized boolean n(g<?> gVar) {
        i3.c h10 = gVar.h();
        if (h10 == null) {
            return true;
        }
        if (!this.f2294r.a(h10)) {
            return false;
        }
        this.f2296t.f4630o.remove(gVar);
        gVar.g((i3.c) null);
        return true;
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i10) {
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f2294r + ", treeNode=" + this.f2295s + "}";
    }
}

package s2;

import androidx.appcompat.widget.m;
import com.bumptech.glide.k;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import m3.i;
import n.b;
import q2.a;
import q2.f;
import q2.l;
import s2.h;
import s2.m;
import w2.n;
import w2.p;

public final class x implements h, d.a<Object> {

    /* renamed from: o  reason: collision with root package name */
    public final h.a f8695o;

    /* renamed from: p  reason: collision with root package name */
    public final i<?> f8696p;

    /* renamed from: q  reason: collision with root package name */
    public int f8697q;

    /* renamed from: r  reason: collision with root package name */
    public int f8698r = -1;

    /* renamed from: s  reason: collision with root package name */
    public f f8699s;

    /* renamed from: t  reason: collision with root package name */
    public List<n<File, ?>> f8700t;
    public int u;

    /* renamed from: v  reason: collision with root package name */
    public volatile n.a<?> f8701v;
    public File w;

    /* renamed from: x  reason: collision with root package name */
    public y f8702x;

    public x(i<?> iVar, h.a aVar) {
        this.f8696p = iVar;
        this.f8695o = aVar;
    }

    public final boolean a() {
        List list;
        boolean z;
        boolean z10;
        boolean z11;
        ArrayList d;
        ArrayList a10 = this.f8696p.a();
        if (a10.isEmpty()) {
            return false;
        }
        i<?> iVar = this.f8696p;
        k kVar = iVar.f8583c.f2241b;
        Class<?> cls = iVar.d.getClass();
        Class<?> cls2 = iVar.f8586g;
        Class<Transcode> cls3 = iVar.f8590k;
        m mVar = kVar.f2257h;
        i iVar2 = (i) ((AtomicReference) mVar.f652p).getAndSet((Object) null);
        if (iVar2 == null) {
            iVar2 = new i(cls, cls2, cls3);
        } else {
            iVar2.f7081a = cls;
            iVar2.f7082b = cls2;
            iVar2.f7083c = cls3;
        }
        synchronized (((b) mVar.f653q)) {
            list = (List) ((b) mVar.f653q).getOrDefault(iVar2, null);
        }
        ((AtomicReference) mVar.f652p).set(iVar2);
        ArrayList arrayList = list;
        if (list == null) {
            ArrayList arrayList2 = new ArrayList();
            p pVar = kVar.f2251a;
            synchronized (pVar) {
                d = pVar.f9195a.d(cls);
            }
            Iterator it = d.iterator();
            while (it.hasNext()) {
                Iterator it2 = kVar.f2253c.b((Class) it.next(), cls2).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!kVar.f2255f.a(cls4, cls3).isEmpty() && !arrayList2.contains(cls4)) {
                        arrayList2.add(cls4);
                    }
                }
            }
            m mVar2 = kVar.f2257h;
            List unmodifiableList = Collections.unmodifiableList(arrayList2);
            synchronized (((b) mVar2.f653q)) {
                ((b) mVar2.f653q).put(new i(cls, cls2, cls3), unmodifiableList);
            }
            arrayList = arrayList2;
        }
        if (!arrayList.isEmpty()) {
            while (true) {
                List<n<File, ?>> list2 = this.f8700t;
                if (list2 != null) {
                    if (this.u < list2.size()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        this.f8701v = null;
                        boolean z12 = false;
                        while (!z12) {
                            if (this.u < this.f8700t.size()) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z10) {
                                break;
                            }
                            List<n<File, ?>> list3 = this.f8700t;
                            int i10 = this.u;
                            this.u = i10 + 1;
                            File file = this.w;
                            i<?> iVar3 = this.f8696p;
                            this.f8701v = list3.get(i10).a(file, iVar3.f8584e, iVar3.f8585f, iVar3.f8588i);
                            if (this.f8701v != null) {
                                if (this.f8696p.c(this.f8701v.f9194c.a()) != null) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    this.f8701v.f9194c.f(this.f8696p.f8593o, this);
                                    z12 = true;
                                }
                            }
                        }
                        return z12;
                    }
                }
                int i11 = this.f8698r + 1;
                this.f8698r = i11;
                if (i11 >= arrayList.size()) {
                    int i12 = this.f8697q + 1;
                    this.f8697q = i12;
                    if (i12 >= a10.size()) {
                        return false;
                    }
                    this.f8698r = 0;
                }
                f fVar = (f) a10.get(this.f8697q);
                Class cls5 = (Class) arrayList.get(this.f8698r);
                l<Z> e10 = this.f8696p.e(cls5);
                i<?> iVar4 = this.f8696p;
                this.f8702x = new y(iVar4.f8583c.f2240a, fVar, iVar4.f8592n, iVar4.f8584e, iVar4.f8585f, e10, cls5, iVar4.f8588i);
                File e11 = ((m.c) iVar4.f8587h).a().e(this.f8702x);
                this.w = e11;
                if (e11 != null) {
                    this.f8699s = fVar;
                    this.f8700t = this.f8696p.f8583c.f2241b.e(e11);
                    this.u = 0;
                }
            }
        } else if (File.class.equals(this.f8696p.f8590k)) {
            return false;
        } else {
            throw new IllegalStateException("Failed to find any load path from " + this.f8696p.d.getClass() + " to " + this.f8696p.f8590k);
        }
    }

    public final void c(Exception exc) {
        this.f8695o.i(this.f8702x, exc, this.f8701v.f9194c, a.RESOURCE_DISK_CACHE);
    }

    public final void cancel() {
        n.a<?> aVar = this.f8701v;
        if (aVar != null) {
            aVar.f9194c.cancel();
        }
    }

    public final void d(Object obj) {
        this.f8695o.l(this.f8699s, obj, this.f8701v.f9194c, a.RESOURCE_DISK_CACHE, this.f8702x);
    }
}

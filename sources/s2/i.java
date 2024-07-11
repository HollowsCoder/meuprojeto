package s2;

import com.bumptech.glide.g;
import com.bumptech.glide.k;
import e3.b;
import e3.c;
import h3.a;
import h3.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import q2.d;
import q2.f;
import q2.h;
import q2.l;
import s2.j;
import s6.a;
import w2.n;

public final class i<Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f8581a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f8582b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public g f8583c;
    public Object d;

    /* renamed from: e  reason: collision with root package name */
    public int f8584e;

    /* renamed from: f  reason: collision with root package name */
    public int f8585f;

    /* renamed from: g  reason: collision with root package name */
    public Class<?> f8586g;

    /* renamed from: h  reason: collision with root package name */
    public j.e f8587h;

    /* renamed from: i  reason: collision with root package name */
    public h f8588i;

    /* renamed from: j  reason: collision with root package name */
    public Map<Class<?>, l<?>> f8589j;

    /* renamed from: k  reason: collision with root package name */
    public Class<Transcode> f8590k;
    public boolean l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f8591m;

    /* renamed from: n  reason: collision with root package name */
    public f f8592n;

    /* renamed from: o  reason: collision with root package name */
    public com.bumptech.glide.j f8593o;

    /* renamed from: p  reason: collision with root package name */
    public l f8594p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f8595q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f8596r;

    public final ArrayList a() {
        boolean z = this.f8591m;
        ArrayList arrayList = this.f8582b;
        if (!z) {
            this.f8591m = true;
            arrayList.clear();
            ArrayList b10 = b();
            int size = b10.size();
            for (int i10 = 0; i10 < size; i10++) {
                n.a aVar = (n.a) b10.get(i10);
                if (!arrayList.contains(aVar.f9192a)) {
                    arrayList.add(aVar.f9192a);
                }
                int i11 = 0;
                while (true) {
                    List<f> list = aVar.f9193b;
                    if (i11 >= list.size()) {
                        break;
                    }
                    if (!arrayList.contains(list.get(i11))) {
                        arrayList.add(list.get(i11));
                    }
                    i11++;
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z = this.l;
        ArrayList arrayList = this.f8581a;
        if (!z) {
            this.l = true;
            arrayList.clear();
            List e10 = this.f8583c.f2241b.e(this.d);
            int size = e10.size();
            for (int i10 = 0; i10 < size; i10++) {
                n.a a10 = ((n) e10.get(i10)).a(this.d, this.f8584e, this.f8585f, this.f8588i);
                if (a10 != null) {
                    arrayList.add(a10);
                }
            }
        }
        return arrayList;
    }

    public final <Data> u<Data, ?, Transcode> c(Class<Data> cls) {
        u<Data, ?, Transcode> orDefault;
        u<Data, ?, Transcode> uVar;
        u<?, ?, ?> uVar2;
        ArrayList arrayList;
        boolean z;
        b bVar;
        b bVar2;
        boolean z10;
        Class<Data> cls2 = cls;
        k kVar = this.f8583c.f2241b;
        Class<?> cls3 = this.f8586g;
        Class<Transcode> cls4 = this.f8590k;
        h3.b bVar3 = kVar.f2258i;
        m3.i andSet = bVar3.f5225b.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new m3.i();
        }
        andSet.f7081a = cls2;
        andSet.f7082b = cls3;
        andSet.f7083c = cls4;
        synchronized (bVar3.f5224a) {
            orDefault = bVar3.f5224a.getOrDefault(andSet, null);
        }
        bVar3.f5225b.set(andSet);
        kVar.f2258i.getClass();
        if (h3.b.f5223c.equals(orDefault)) {
            return null;
        }
        if (orDefault != null) {
            return orDefault;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = kVar.f2253c.b(cls2, cls3).iterator();
        while (it.hasNext()) {
            Class cls5 = (Class) it.next();
            Iterator it2 = kVar.f2255f.a(cls5, cls4).iterator();
            while (true) {
                if (it2.hasNext()) {
                    Class cls6 = (Class) it2.next();
                    c cVar = kVar.f2253c;
                    synchronized (cVar) {
                        arrayList = new ArrayList();
                        Iterator it3 = cVar.f5226a.iterator();
                        while (it3.hasNext()) {
                            List<c.a> list = (List) cVar.f5227b.get((String) it3.next());
                            if (list != null) {
                                for (c.a aVar : list) {
                                    if (!aVar.f5228a.isAssignableFrom(cls2) || !cls5.isAssignableFrom(aVar.f5229b)) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    if (z10) {
                                        arrayList.add(aVar.f5230c);
                                    }
                                }
                            }
                        }
                    }
                    e3.c cVar2 = kVar.f2255f;
                    synchronized (cVar2) {
                        if (cls6.isAssignableFrom(cls5)) {
                            bVar = a.H;
                        } else {
                            Iterator it4 = cVar2.f4472a.iterator();
                            while (it4.hasNext()) {
                                c.a aVar2 = (c.a) it4.next();
                                if (!aVar2.f4473a.isAssignableFrom(cls5) || !cls6.isAssignableFrom(aVar2.f4474b)) {
                                    z = false;
                                    continue;
                                } else {
                                    z = true;
                                    continue;
                                }
                                if (z) {
                                    bVar = aVar2.f4475c;
                                }
                            }
                            throw new IllegalArgumentException("No transcoder registered to transcode from " + cls5 + " to " + cls6);
                        }
                        bVar2 = bVar;
                    }
                    k kVar2 = r2;
                    k kVar3 = new k(cls, cls5, cls6, arrayList, bVar2, kVar.f2259j);
                    arrayList2.add(kVar2);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            uVar = null;
        } else {
            uVar = new u<>(cls, cls3, cls4, arrayList2, kVar.f2259j);
        }
        h3.b bVar4 = kVar.f2258i;
        synchronized (bVar4.f5224a) {
            n.b<m3.i, u<?, ?, ?>> bVar5 = bVar4.f5224a;
            m3.i iVar = new m3.i(cls2, cls3, cls4);
            if (uVar != null) {
                uVar2 = uVar;
            } else {
                uVar2 = h3.b.f5223c;
            }
            bVar5.put(iVar, uVar2);
        }
        return uVar;
    }

    public final <X> d<X> d(X x10) {
        d<T> dVar;
        h3.a aVar = this.f8583c.f2241b.f2252b;
        Class<?> cls = x10.getClass();
        synchronized (aVar) {
            Iterator it = aVar.f5220a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    dVar = null;
                    break;
                }
                a.C0075a aVar2 = (a.C0075a) it.next();
                if (aVar2.f5221a.isAssignableFrom(cls)) {
                    dVar = aVar2.f5222b;
                    break;
                }
            }
        }
        if (dVar != null) {
            return dVar;
        }
        throw new k.e(x10.getClass());
    }

    public final <Z> l<Z> e(Class<Z> cls) {
        l<Z> lVar = this.f8589j.get(cls);
        if (lVar == null) {
            Iterator<Map.Entry<Class<?>, l<?>>> it = this.f8589j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    lVar = (l) next.getValue();
                    break;
                }
            }
        }
        if (lVar != null) {
            return lVar;
        }
        if (!this.f8589j.isEmpty() || !this.f8595q) {
            return y2.c.f9534b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}

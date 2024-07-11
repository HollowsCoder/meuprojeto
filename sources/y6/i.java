package y6;

import android.util.Log;
import androidx.activity.result.c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import n7.a;
import s7.d;
import v7.b;

public final class i extends c implements a {

    /* renamed from: t  reason: collision with root package name */
    public static final h f9571t = new h(0);

    /* renamed from: o  reason: collision with root package name */
    public final HashMap f9572o = new HashMap();

    /* renamed from: p  reason: collision with root package name */
    public final HashMap f9573p = new HashMap();

    /* renamed from: q  reason: collision with root package name */
    public final HashMap f9574q = new HashMap();

    /* renamed from: r  reason: collision with root package name */
    public final m f9575r;

    /* renamed from: s  reason: collision with root package name */
    public final AtomicReference<Boolean> f9576s = new AtomicReference<>();

    public i(Executor executor, ArrayList arrayList, ArrayList arrayList2) {
        m mVar = new m(executor);
        this.f9575r = mVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(b.b(mVar, m.class, d.class, s7.c.class));
        arrayList3.add(b.b(this, a.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null) {
                arrayList3.add(bVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    f fVar = (f) ((b) it3.next()).get();
                    if (fVar != null) {
                        arrayList3.addAll(fVar.getComponents());
                        it3.remove();
                    }
                } catch (n e10) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            if (this.f9572o.isEmpty()) {
                j.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f9572o.keySet());
                arrayList6.addAll(arrayList3);
                j.a(arrayList6);
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                b bVar2 = (b) it4.next();
                this.f9572o.put(bVar2, new o(new g(this, bVar2)));
            }
            arrayList5.addAll(G(arrayList3));
            arrayList5.addAll(H());
            F();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = this.f9576s.get();
        if (bool != null) {
            E(this.f9572o, bool.booleanValue());
        }
    }

    public final void E(Map<b<?>, b<?>> map, boolean z) {
        ArrayDeque<s7.a> arrayDeque;
        Set<Map.Entry> set;
        boolean z10;
        Iterator<Map.Entry<b<?>, b<?>>> it = map.entrySet().iterator();
        while (true) {
            boolean z11 = true;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry next = it.next();
            b bVar = (b) next.getValue();
            int i10 = ((b) next.getKey()).f9558c;
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (i10 != 2) {
                    z11 = false;
                }
                if (z11) {
                    if (!z) {
                    }
                }
            }
            bVar.get();
        }
        m mVar = this.f9575r;
        synchronized (mVar) {
            try {
                arrayDeque = mVar.f9587b;
                if (arrayDeque != null) {
                    mVar.f9587b = null;
                } else {
                    arrayDeque = null;
                }
            } finally {
                while (true) {
                }
            }
        }
        if (arrayDeque != null) {
            for (s7.a aVar : arrayDeque) {
                aVar.getClass();
                synchronized (mVar) {
                    ArrayDeque arrayDeque2 = mVar.f9587b;
                    if (arrayDeque2 != null) {
                        arrayDeque2.add(aVar);
                    } else {
                        synchronized (mVar) {
                            Map map2 = (Map) mVar.f9586a.get((Object) null);
                            if (map2 == null) {
                                set = Collections.emptySet();
                            } else {
                                set = map2.entrySet();
                            }
                        }
                        for (Map.Entry entry : set) {
                            ((Executor) entry.getValue()).execute(new e2.c(1, entry, aVar));
                        }
                    }
                }
            }
        }
    }

    public final void F() {
        boolean z;
        Object obj;
        HashMap hashMap;
        boolean z10;
        for (b bVar : this.f9572o.keySet()) {
            Iterator<k> it = bVar.f9557b.iterator();
            while (true) {
                if (it.hasNext()) {
                    k next = it.next();
                    boolean z11 = true;
                    if (next.f9583b == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Class<?> cls = next.f9582a;
                    if (z) {
                        hashMap = this.f9574q;
                        if (!hashMap.containsKey(cls)) {
                            obj = new p(Collections.emptySet());
                            hashMap.put(cls, obj);
                        }
                    }
                    hashMap = this.f9573p;
                    if (hashMap.containsKey(cls)) {
                        continue;
                    } else {
                        int i10 = next.f9583b;
                        if (i10 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            if (i10 != 2) {
                                z11 = false;
                            }
                            if (!z11) {
                                obj = new r(r.f9594c, r.d);
                                hashMap.put(cls, obj);
                            }
                        } else {
                            throw new q(String.format("Unsatisfied dependency for component %s: %s", new Object[]{bVar, cls}));
                        }
                    }
                }
            }
        }
    }

    public final ArrayList G(ArrayList arrayList) {
        boolean z;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.d == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                b bVar2 = (b) this.f9572o.get(bVar);
                for (Class next : bVar.f9556a) {
                    HashMap hashMap = this.f9573p;
                    if (!hashMap.containsKey(next)) {
                        hashMap.put(next, bVar2);
                    } else {
                        arrayList2.add(new d2.d(2, (r) ((b) hashMap.get(next)), bVar2));
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList H() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f9572o.entrySet()) {
            b bVar = (b) entry.getKey();
            if (bVar.d == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                b bVar2 = (b) entry.getValue();
                for (Class next : bVar.f9556a) {
                    if (!hashMap.containsKey(next)) {
                        hashMap.put(next, new HashSet());
                    }
                    ((Set) hashMap.get(next)).add(bVar2);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Object key = entry2.getKey();
            HashMap hashMap2 = this.f9574q;
            if (!hashMap2.containsKey(key)) {
                hashMap2.put((Class) entry2.getKey(), new p((Set) ((Collection) entry2.getValue())));
            } else {
                p pVar = (p) hashMap2.get(entry2.getKey());
                for (b bVar3 : (Set) entry2.getValue()) {
                    arrayList.add(new e2.b(2, pVar, bVar3));
                }
            }
        }
        return arrayList;
    }

    public final synchronized <T> b<T> h(Class<T> cls) {
        return (b) this.f9573p.get(cls);
    }

    public final synchronized <T> b<Set<T>> i(Class<T> cls) {
        p pVar = (p) this.f9574q.get(cls);
        if (pVar != null) {
            return pVar;
        }
        return f9571t;
    }

    public final <T> v7.a<T> j(Class<T> cls) {
        b<T> h10 = h(cls);
        if (h10 == null) {
            return new r(r.f9594c, r.d);
        }
        if (h10 instanceof r) {
            return (r) h10;
        }
        return new r((d2.c) null, h10);
    }
}

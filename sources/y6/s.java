package y6;

import androidx.activity.result.c;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import v7.b;

public final class s extends c {

    /* renamed from: o  reason: collision with root package name */
    public final Set<Class<?>> f9597o;

    /* renamed from: p  reason: collision with root package name */
    public final Set<Class<?>> f9598p;

    /* renamed from: q  reason: collision with root package name */
    public final Set<Class<?>> f9599q;

    /* renamed from: r  reason: collision with root package name */
    public final Set<Class<?>> f9600r;

    /* renamed from: s  reason: collision with root package name */
    public final Set<Class<?>> f9601s;

    /* renamed from: t  reason: collision with root package name */
    public final c f9602t;

    public static class a implements s7.c {

        /* renamed from: a  reason: collision with root package name */
        public final s7.c f9603a;

        public a(s7.c cVar) {
            this.f9603a = cVar;
        }
    }

    public s(b bVar, i iVar) {
        boolean z;
        boolean z10;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (k next : bVar.f9557b) {
            int i10 = next.f9584c;
            boolean z11 = true;
            if (i10 == 0) {
                z = true;
            } else {
                z = false;
            }
            int i11 = next.f9583b;
            Class<?> cls = next.f9582a;
            if (z) {
                if (i11 != 2 ? false : z11) {
                    hashSet4.add(cls);
                } else {
                    hashSet.add(cls);
                }
            } else {
                if (i10 == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    hashSet3.add(cls);
                } else {
                    if (i11 != 2 ? false : z11) {
                        hashSet5.add(cls);
                    } else {
                        hashSet2.add(cls);
                    }
                }
            }
        }
        if (!bVar.f9560f.isEmpty()) {
            hashSet.add(s7.c.class);
        }
        this.f9597o = Collections.unmodifiableSet(hashSet);
        this.f9598p = Collections.unmodifiableSet(hashSet2);
        this.f9599q = Collections.unmodifiableSet(hashSet3);
        this.f9600r = Collections.unmodifiableSet(hashSet4);
        this.f9601s = Collections.unmodifiableSet(hashSet5);
        this.f9602t = iVar;
    }

    public final <T> T a(Class<T> cls) {
        if (this.f9597o.contains(cls)) {
            T a10 = this.f9602t.a(cls);
            return !cls.equals(s7.c.class) ? a10 : new a((s7.c) a10);
        }
        throw new a1.c(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    public final <T> Set<T> e(Class<T> cls) {
        if (this.f9600r.contains(cls)) {
            return this.f9602t.e(cls);
        }
        throw new a1.c(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }

    public final <T> b<T> h(Class<T> cls) {
        if (this.f9598p.contains(cls)) {
            return this.f9602t.h(cls);
        }
        throw new a1.c(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    public final <T> b<Set<T>> i(Class<T> cls) {
        if (this.f9601s.contains(cls)) {
            return this.f9602t.i(cls);
        }
        throw new a1.c(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }

    public final <T> v7.a<T> j(Class<T> cls) {
        if (this.f9599q.contains(cls)) {
            return this.f9602t.j(cls);
        }
        throw new a1.c(String.format("Attempting to request an undeclared dependency Deferred<%s>.", new Object[]{cls}));
    }
}

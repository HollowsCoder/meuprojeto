package t2;

import android.util.Log;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;
import n1.i;

public final class h implements b {

    /* renamed from: a  reason: collision with root package name */
    public final f<a, Object> f8896a = new f<>();

    /* renamed from: b  reason: collision with root package name */
    public final b f8897b = new b();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f8898c = new HashMap();
    public final HashMap d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final int f8899e;

    /* renamed from: f  reason: collision with root package name */
    public int f8900f;

    public static final class a implements k {

        /* renamed from: a  reason: collision with root package name */
        public final b f8901a;

        /* renamed from: b  reason: collision with root package name */
        public int f8902b;

        /* renamed from: c  reason: collision with root package name */
        public Class<?> f8903c;

        public a(b bVar) {
            this.f8901a = bVar;
        }

        public final void a() {
            this.f8901a.f(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f8902b == aVar.f8902b && this.f8903c == aVar.f8903c;
        }

        public final int hashCode() {
            int i10 = this.f8902b * 31;
            Class<?> cls = this.f8903c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        public final String toString() {
            return "Key{size=" + this.f8902b + "array=" + this.f8903c + '}';
        }
    }

    public static final class b extends i {
        public final k d() {
            return new a(this);
        }
    }

    public h(int i10) {
        this.f8899e = i10;
    }

    public final synchronized void a(int i10) {
        if (i10 >= 40) {
            try {
                b();
            } catch (Throwable th) {
                throw th;
            }
        } else if (i10 >= 20 || i10 == 15) {
            f(this.f8899e / 2);
        }
    }

    public final synchronized void b() {
        f(0);
    }

    public final synchronized <T> T c(int i10, Class<T> cls) {
        a aVar;
        boolean z;
        Integer ceilingKey = i(cls).ceilingKey(Integer.valueOf(i10));
        boolean z10 = false;
        if (ceilingKey != null) {
            int i11 = this.f8900f;
            if (i11 != 0) {
                if (this.f8899e / i11 < 2) {
                    z = false;
                    if (z || ceilingKey.intValue() <= i10 * 8) {
                        z10 = true;
                    }
                }
            }
            z = true;
            z10 = true;
        }
        if (z10) {
            b bVar = this.f8897b;
            int intValue = ceilingKey.intValue();
            aVar = (a) bVar.e();
            aVar.f8902b = intValue;
            aVar.f8903c = cls;
        } else {
            a aVar2 = (a) this.f8897b.e();
            aVar2.f8902b = i10;
            aVar2.f8903c = cls;
            aVar = aVar2;
        }
        return h(aVar, cls);
    }

    public final synchronized Object d() {
        Object h10;
        Class cls = byte[].class;
        synchronized (this) {
            a aVar = (a) this.f8897b.e();
            aVar.f8902b = 8;
            aVar.f8903c = cls;
            h10 = h(aVar, cls);
        }
        return h10;
    }

    public final void e(int i10, Class<?> cls) {
        NavigableMap<Integer, Integer> i11 = i(cls);
        Integer num = i11.get(Integer.valueOf(i10));
        if (num != null) {
            int intValue = num.intValue();
            Integer valueOf = Integer.valueOf(i10);
            if (intValue == 1) {
                i11.remove(valueOf);
            } else {
                i11.put(valueOf, Integer.valueOf(num.intValue() - 1));
            }
        } else {
            throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
        }
    }

    public final void f(int i10) {
        while (this.f8900f > i10) {
            Object c10 = this.f8896a.c();
            s6.a.n(c10);
            a<?> g10 = g(c10.getClass());
            this.f8900f -= g10.c() * g10.b(c10);
            e(g10.b(c10), c10.getClass());
            if (Log.isLoggable(g10.a(), 2)) {
                Log.v(g10.a(), "evicted: " + g10.b(c10));
            }
        }
    }

    public final <T> a<T> g(Class<T> cls) {
        HashMap hashMap = this.d;
        a<T> aVar = (a) hashMap.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new g();
            } else if (cls.equals(byte[].class)) {
                aVar = new e();
            } else {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            hashMap.put(cls, aVar);
        }
        return aVar;
    }

    public final <T> T h(a aVar, Class<T> cls) {
        a<T> g10 = g(cls);
        T a10 = this.f8896a.a(aVar);
        if (a10 != null) {
            this.f8900f -= g10.c() * g10.b(a10);
            e(g10.b(a10), cls);
        }
        if (a10 != null) {
            return a10;
        }
        if (Log.isLoggable(g10.a(), 2)) {
            Log.v(g10.a(), "Allocated " + aVar.f8902b + " bytes");
        }
        return g10.newArray(aVar.f8902b);
    }

    public final NavigableMap<Integer, Integer> i(Class<?> cls) {
        HashMap hashMap = this.f8898c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) hashMap.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        hashMap.put(cls, treeMap);
        return treeMap;
    }

    public final synchronized <T> void put(T t10) {
        boolean z;
        Class<?> cls = t10.getClass();
        a<?> g10 = g(cls);
        int b10 = g10.b(t10);
        int c10 = g10.c() * b10;
        int i10 = 1;
        if (c10 <= this.f8899e / 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            a aVar = (a) this.f8897b.e();
            aVar.f8902b = b10;
            aVar.f8903c = cls;
            this.f8896a.b(aVar, t10);
            NavigableMap<Integer, Integer> i11 = i(cls);
            Integer num = i11.get(Integer.valueOf(aVar.f8902b));
            Integer valueOf = Integer.valueOf(aVar.f8902b);
            if (num != null) {
                i10 = 1 + num.intValue();
            }
            i11.put(valueOf, Integer.valueOf(i10));
            this.f8900f += c10;
            f(this.f8899e);
        }
    }
}

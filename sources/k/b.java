package k;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: o  reason: collision with root package name */
    public c<K, V> f6609o;

    /* renamed from: p  reason: collision with root package name */
    public c<K, V> f6610p;

    /* renamed from: q  reason: collision with root package name */
    public final WeakHashMap<f<K, V>, Boolean> f6611q = new WeakHashMap<>();

    /* renamed from: r  reason: collision with root package name */
    public int f6612r = 0;

    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f6616r;
        }

        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f6615q;
        }
    }

    /* renamed from: k.b$b  reason: collision with other inner class name */
    public static class C0090b<K, V> extends e<K, V> {
        public C0090b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f6615q;
        }

        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f6616r;
        }
    }

    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: o  reason: collision with root package name */
        public final K f6613o;

        /* renamed from: p  reason: collision with root package name */
        public final V f6614p;

        /* renamed from: q  reason: collision with root package name */
        public c<K, V> f6615q;

        /* renamed from: r  reason: collision with root package name */
        public c<K, V> f6616r;

        public c(K k10, V v10) {
            this.f6613o = k10;
            this.f6614p = v10;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f6613o.equals(cVar.f6613o) && this.f6614p.equals(cVar.f6614p);
        }

        public final K getKey() {
            return this.f6613o;
        }

        public final V getValue() {
            return this.f6614p;
        }

        public final int hashCode() {
            return this.f6613o.hashCode() ^ this.f6614p.hashCode();
        }

        public final V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.f6613o + "=" + this.f6614p;
        }
    }

    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: o  reason: collision with root package name */
        public c<K, V> f6617o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f6618p = true;

        public d() {
        }

        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f6617o;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f6616r;
                this.f6617o = cVar3;
                this.f6618p = cVar3 == null;
            }
        }

        public final boolean hasNext() {
            if (this.f6618p) {
                return b.this.f6609o != null;
            }
            c<K, V> cVar = this.f6617o;
            return (cVar == null || cVar.f6615q == null) ? false : true;
        }

        public final Object next() {
            c<K, V> cVar;
            if (this.f6618p) {
                this.f6618p = false;
                cVar = b.this.f6609o;
            } else {
                c<K, V> cVar2 = this.f6617o;
                cVar = cVar2 != null ? cVar2.f6615q : null;
            }
            this.f6617o = cVar;
            return cVar;
        }
    }

    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: o  reason: collision with root package name */
        public c<K, V> f6620o;

        /* renamed from: p  reason: collision with root package name */
        public c<K, V> f6621p;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f6620o = cVar2;
            this.f6621p = cVar;
        }

        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.f6620o == cVar && cVar == this.f6621p) {
                this.f6621p = null;
                this.f6620o = null;
            }
            c<K, V> cVar3 = this.f6620o;
            if (cVar3 == cVar) {
                this.f6620o = b(cVar3);
            }
            c<K, V> cVar4 = this.f6621p;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.f6620o;
                if (!(cVar4 == cVar5 || cVar5 == null)) {
                    cVar2 = c(cVar4);
                }
                this.f6621p = cVar2;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        public final boolean hasNext() {
            return this.f6621p != null;
        }

        public final Object next() {
            c<K, V> cVar;
            c<K, V> cVar2 = this.f6621p;
            c<K, V> cVar3 = this.f6620o;
            if (cVar2 == cVar3 || cVar3 == null) {
                cVar = null;
            } else {
                cVar = c(cVar2);
            }
            this.f6621p = cVar;
            return cVar2;
        }
    }

    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public c<K, V> e(K k10) {
        c<K, V> cVar = this.f6609o;
        while (cVar != null && !cVar.f6613o.equals(k10)) {
            cVar = cVar.f6615q;
        }
        return cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r3.hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (((k.b.e) r7).hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof k.b
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            k.b r7 = (k.b) r7
            int r1 = r6.f6612r
            int r3 = r7.f6612r
            if (r1 == r3) goto L_0x0013
            return r2
        L_0x0013:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L_0x001b:
            r3 = r1
            k.b$e r3 = (k.b.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0044
            r4 = r7
            k.b$e r4 = (k.b.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0044
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L_0x003b
            if (r4 != 0) goto L_0x0043
        L_0x003b:
            if (r3 == 0) goto L_0x001b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x001b
        L_0x0043:
            return r2
        L_0x0044:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L_0x0053
            k.b$e r7 = (k.b.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = r2
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k.b.equals(java.lang.Object):boolean");
    }

    public V h(K k10) {
        c e10 = e(k10);
        if (e10 == null) {
            return null;
        }
        this.f6612r--;
        WeakHashMap<f<K, V>, Boolean> weakHashMap = this.f6611q;
        if (!weakHashMap.isEmpty()) {
            for (f<K, V> a10 : weakHashMap.keySet()) {
                a10.a(e10);
            }
        }
        c<K, V> cVar = e10.f6616r;
        c<K, V> cVar2 = e10.f6615q;
        if (cVar != null) {
            cVar.f6615q = cVar2;
        } else {
            this.f6609o = cVar2;
        }
        c<K, V> cVar3 = e10.f6615q;
        if (cVar3 != null) {
            cVar3.f6616r = cVar;
        } else {
            this.f6610p = cVar;
        }
        e10.f6615q = null;
        e10.f6616r = null;
        return e10.f6614p;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i10 = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return i10;
            }
            i10 += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f6609o, this.f6610p);
        this.f6611q.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                sb.append(((Map.Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}

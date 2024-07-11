package n;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public abstract class h<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public h<K, V>.b f7313a;

    /* renamed from: b  reason: collision with root package name */
    public h<K, V>.c f7314b;

    /* renamed from: c  reason: collision with root package name */
    public h<K, V>.e f7315c;

    public final class a<T> implements Iterator<T> {

        /* renamed from: o  reason: collision with root package name */
        public final int f7316o;

        /* renamed from: p  reason: collision with root package name */
        public int f7317p;

        /* renamed from: q  reason: collision with root package name */
        public int f7318q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f7319r = false;

        public a(int i10) {
            this.f7316o = i10;
            this.f7317p = h.this.d();
        }

        public final boolean hasNext() {
            return this.f7318q < this.f7317p;
        }

        public final T next() {
            if (hasNext()) {
                T b10 = h.this.b(this.f7318q, this.f7316o);
                this.f7318q++;
                this.f7319r = true;
                return b10;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            if (this.f7319r) {
                int i10 = this.f7318q - 1;
                this.f7318q = i10;
                this.f7317p--;
                this.f7319r = false;
                h.this.h(i10);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final class b implements Set<Map.Entry<K, V>> {
        public b() {
        }

        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            h hVar = h.this;
            int d = hVar.d();
            for (Map.Entry entry : collection) {
                hVar.g(entry.getKey(), entry.getValue());
            }
            return d != hVar.d();
        }

        public final void clear() {
            h.this.a();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
            r5 = (java.util.Map.Entry) r5;
            r0 = r5.getKey();
            r2 = r4.f7321o;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean contains(java.lang.Object r5) {
            /*
                r4 = this;
                boolean r0 = r5 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                java.util.Map$Entry r5 = (java.util.Map.Entry) r5
                java.lang.Object r0 = r5.getKey()
                n.h r2 = n.h.this
                int r0 = r2.e(r0)
                if (r0 >= 0) goto L_0x0015
                return r1
            L_0x0015:
                r3 = 1
                java.lang.Object r0 = r2.b(r0, r3)
                java.lang.Object r5 = r5.getValue()
                if (r0 == r5) goto L_0x0028
                if (r0 == 0) goto L_0x0029
                boolean r5 = r0.equals(r5)
                if (r5 == 0) goto L_0x0029
            L_0x0028:
                r1 = r3
            L_0x0029:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: n.h.b.contains(java.lang.Object):boolean");
        }

        public final boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean equals(Object obj) {
            return h.j(this, obj);
        }

        public final int hashCode() {
            h hVar = h.this;
            int i10 = 0;
            for (int d = hVar.d() - 1; d >= 0; d--) {
                Object b10 = hVar.b(d, 0);
                Object b11 = hVar.b(d, 1);
                i10 += (b10 == null ? 0 : b10.hashCode()) ^ (b11 == null ? 0 : b11.hashCode());
            }
            return i10;
        }

        public final boolean isEmpty() {
            return h.this.d() == 0;
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public final int size() {
            return h.this.d();
        }

        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    public final class c implements Set<K> {
        public c() {
        }

        public final boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public final void clear() {
            h.this.a();
        }

        public final boolean contains(Object obj) {
            return h.this.e(obj) >= 0;
        }

        public final boolean containsAll(Collection<?> collection) {
            Map c10 = h.this.c();
            for (Object containsKey : collection) {
                if (!c10.containsKey(containsKey)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean equals(Object obj) {
            return h.j(this, obj);
        }

        public final int hashCode() {
            h hVar = h.this;
            int i10 = 0;
            for (int d = hVar.d() - 1; d >= 0; d--) {
                Object b10 = hVar.b(d, 0);
                i10 += b10 == null ? 0 : b10.hashCode();
            }
            return i10;
        }

        public final boolean isEmpty() {
            return h.this.d() == 0;
        }

        public final Iterator<K> iterator() {
            return new a(0);
        }

        public final boolean remove(Object obj) {
            h hVar = h.this;
            int e10 = hVar.e(obj);
            if (e10 < 0) {
                return false;
            }
            hVar.h(e10);
            return true;
        }

        public final boolean removeAll(Collection<?> collection) {
            Map c10 = h.this.c();
            int size = c10.size();
            for (Object remove : collection) {
                c10.remove(remove);
            }
            if (size != c10.size()) {
                return true;
            }
            return false;
        }

        public final boolean retainAll(Collection<?> collection) {
            return h.k(collection, h.this.c());
        }

        public final int size() {
            return h.this.d();
        }

        public final Object[] toArray() {
            h hVar = h.this;
            int d = hVar.d();
            Object[] objArr = new Object[d];
            for (int i10 = 0; i10 < d; i10++) {
                objArr[i10] = hVar.b(i10, 0);
            }
            return objArr;
        }

        public final <T> T[] toArray(T[] tArr) {
            return h.this.l(0, tArr);
        }
    }

    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: o  reason: collision with root package name */
        public int f7323o;

        /* renamed from: p  reason: collision with root package name */
        public int f7324p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f7325q = false;

        public d() {
            this.f7323o = h.this.d() - 1;
            this.f7324p = -1;
        }

        public final boolean equals(Object obj) {
            boolean z;
            boolean z10;
            if (!this.f7325q) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                int i10 = this.f7324p;
                h hVar = h.this;
                Object b10 = hVar.b(i10, 0);
                if (key == b10 || (key != null && key.equals(b10))) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return false;
                }
                Object value = entry.getValue();
                Object b11 = hVar.b(this.f7324p, 1);
                if (value == b11 || (value != null && value.equals(b11))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return true;
                }
                return false;
            }
        }

        public final K getKey() {
            if (this.f7325q) {
                return h.this.b(this.f7324p, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final V getValue() {
            if (this.f7325q) {
                return h.this.b(this.f7324p, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final boolean hasNext() {
            return this.f7324p < this.f7323o;
        }

        public final int hashCode() {
            if (this.f7325q) {
                int i10 = this.f7324p;
                h hVar = h.this;
                int i11 = 0;
                Object b10 = hVar.b(i10, 0);
                Object b11 = hVar.b(this.f7324p, 1);
                int hashCode = b10 == null ? 0 : b10.hashCode();
                if (b11 != null) {
                    i11 = b11.hashCode();
                }
                return hashCode ^ i11;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final Object next() {
            if (hasNext()) {
                this.f7324p++;
                this.f7325q = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            if (this.f7325q) {
                h.this.h(this.f7324p);
                this.f7324p--;
                this.f7323o--;
                this.f7325q = false;
                return;
            }
            throw new IllegalStateException();
        }

        public final V setValue(V v10) {
            if (this.f7325q) {
                return h.this.i(this.f7324p, v10);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    public final class e implements Collection<V> {
        public e() {
        }

        public final boolean add(V v10) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public final void clear() {
            h.this.a();
        }

        public final boolean contains(Object obj) {
            return h.this.f(obj) >= 0;
        }

        public final boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isEmpty() {
            return h.this.d() == 0;
        }

        public final Iterator<V> iterator() {
            return new a(1);
        }

        public final boolean remove(Object obj) {
            h hVar = h.this;
            int f10 = hVar.f(obj);
            if (f10 < 0) {
                return false;
            }
            hVar.h(f10);
            return true;
        }

        public final boolean removeAll(Collection<?> collection) {
            h hVar = h.this;
            int d = hVar.d();
            int i10 = 0;
            boolean z = false;
            while (i10 < d) {
                if (collection.contains(hVar.b(i10, 1))) {
                    hVar.h(i10);
                    i10--;
                    d--;
                    z = true;
                }
                i10++;
            }
            return z;
        }

        public final boolean retainAll(Collection<?> collection) {
            h hVar = h.this;
            int d = hVar.d();
            int i10 = 0;
            boolean z = false;
            while (i10 < d) {
                if (!collection.contains(hVar.b(i10, 1))) {
                    hVar.h(i10);
                    i10--;
                    d--;
                    z = true;
                }
                i10++;
            }
            return z;
        }

        public final int size() {
            return h.this.d();
        }

        public final Object[] toArray() {
            h hVar = h.this;
            int d = hVar.d();
            Object[] objArr = new Object[d];
            for (int i10 = 0; i10 < d; i10++) {
                objArr[i10] = hVar.b(i10, 1);
            }
            return objArr;
        }

        public final <T> T[] toArray(T[] tArr) {
            return h.this.l(1, tArr);
        }
    }

    public static <T> boolean j(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean k(Collection collection, Map map) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void a();

    public abstract Object b(int i10, int i11);

    public abstract Map<K, V> c();

    public abstract int d();

    public abstract int e(Object obj);

    public abstract int f(Object obj);

    public abstract void g(K k10, V v10);

    public abstract void h(int i10);

    public abstract V i(int i10, V v10);

    public final Object[] l(int i10, Object[] objArr) {
        int d10 = d();
        if (objArr.length < d10) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), d10);
        }
        for (int i11 = 0; i11 < d10; i11++) {
            objArr[i11] = b(i11, i10);
        }
        if (objArr.length > d10) {
            objArr[d10] = null;
        }
        return objArr;
    }
}

package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    private static final Comparator<Comparable> NATURAL_ORDER = new a();
    private LinkedTreeMap<K, V>.b entrySet;
    private LinkedTreeMap<K, V>.c keySet;

    /* renamed from: o  reason: collision with root package name */
    public final Comparator<? super K> f3810o;

    /* renamed from: p  reason: collision with root package name */
    public e<K, V> f3811p;

    /* renamed from: q  reason: collision with root package name */
    public int f3812q;

    /* renamed from: r  reason: collision with root package name */
    public int f3813r;

    /* renamed from: s  reason: collision with root package name */
    public final e<K, V> f3814s;

    public class a implements Comparator<Comparable> {
        public final int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }

    public class b extends AbstractSet<Map.Entry<K, V>> {

        public class a extends LinkedTreeMap<K, V>.d<Map.Entry<K, V>> {
            public a(b bVar) {
                super();
            }

            public final Object next() {
                return a();
            }
        }

        public b() {
        }

        public final void clear() {
            LinkedTreeMap.this.clear();
        }

        public final boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedTreeMap.this.b((Map.Entry) obj) != null;
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
            r0 = r2.f3815o;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean remove(java.lang.Object r3) {
            /*
                r2 = this;
                boolean r0 = r3 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                com.google.gson.internal.LinkedTreeMap r0 = com.google.gson.internal.LinkedTreeMap.this
                com.google.gson.internal.LinkedTreeMap$e r3 = r0.b(r3)
                if (r3 != 0) goto L_0x0011
                return r1
            L_0x0011:
                r1 = 1
                r0.c(r3, r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedTreeMap.b.remove(java.lang.Object):boolean");
        }

        public final int size() {
            return LinkedTreeMap.this.f3812q;
        }
    }

    public final class c extends AbstractSet<K> {

        public class a extends LinkedTreeMap<K, V>.d<K> {
            public a(c cVar) {
                super();
            }

            public final K next() {
                return a().f3826t;
            }
        }

        public c() {
        }

        public final void clear() {
            LinkedTreeMap.this.clear();
        }

        public final boolean contains(Object obj) {
            return LinkedTreeMap.this.containsKey(obj);
        }

        public final Iterator<K> iterator() {
            return new a(this);
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0016  */
        /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0011  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean remove(java.lang.Object r4) {
            /*
                r3 = this;
                com.google.gson.internal.LinkedTreeMap r0 = com.google.gson.internal.LinkedTreeMap.this
                r0.getClass()
                r1 = 0
                if (r4 == 0) goto L_0x000d
                com.google.gson.internal.LinkedTreeMap$e r4 = r0.a(r4, r1)     // Catch:{ ClassCastException -> 0x000d }
                goto L_0x000e
            L_0x000d:
                r4 = 0
            L_0x000e:
                r2 = 1
                if (r4 == 0) goto L_0x0014
                r0.c(r4, r2)
            L_0x0014:
                if (r4 == 0) goto L_0x0017
                r1 = r2
            L_0x0017:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedTreeMap.c.remove(java.lang.Object):boolean");
        }

        public final int size() {
            return LinkedTreeMap.this.f3812q;
        }
    }

    public abstract class d<T> implements Iterator<T> {

        /* renamed from: o  reason: collision with root package name */
        public e<K, V> f3817o;

        /* renamed from: p  reason: collision with root package name */
        public e<K, V> f3818p = null;

        /* renamed from: q  reason: collision with root package name */
        public int f3819q;

        public d() {
            this.f3817o = LinkedTreeMap.this.f3814s.f3824r;
            this.f3819q = LinkedTreeMap.this.f3813r;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.f3817o;
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            if (eVar == linkedTreeMap.f3814s) {
                throw new NoSuchElementException();
            } else if (linkedTreeMap.f3813r == this.f3819q) {
                this.f3817o = eVar.f3824r;
                this.f3818p = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f3817o != LinkedTreeMap.this.f3814s;
        }

        public final void remove() {
            e<K, V> eVar = this.f3818p;
            if (eVar != null) {
                LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
                linkedTreeMap.c(eVar, true);
                this.f3818p = null;
                this.f3819q = linkedTreeMap.f3813r;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: o  reason: collision with root package name */
        public e<K, V> f3821o;

        /* renamed from: p  reason: collision with root package name */
        public e<K, V> f3822p;

        /* renamed from: q  reason: collision with root package name */
        public e<K, V> f3823q;

        /* renamed from: r  reason: collision with root package name */
        public e<K, V> f3824r;

        /* renamed from: s  reason: collision with root package name */
        public e<K, V> f3825s;

        /* renamed from: t  reason: collision with root package name */
        public final K f3826t;
        public V u;

        /* renamed from: v  reason: collision with root package name */
        public int f3827v;

        public e() {
            this.f3826t = null;
            this.f3825s = this;
            this.f3824r = this;
        }

        public e(e<K, V> eVar, K k10, e<K, V> eVar2, e<K, V> eVar3) {
            this.f3821o = eVar;
            this.f3826t = k10;
            this.f3827v = 1;
            this.f3824r = eVar2;
            this.f3825s = eVar3;
            eVar3.f3824r = this;
            eVar2.f3825s = this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x002e
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f3826t
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x002e
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x002e
            L_0x001c:
                V r0 = r3.u
                java.lang.Object r4 = r4.getValue()
                if (r0 != 0) goto L_0x0027
                if (r4 != 0) goto L_0x002e
                goto L_0x002d
            L_0x0027:
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x002e
            L_0x002d:
                r1 = 1
            L_0x002e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedTreeMap.e.equals(java.lang.Object):boolean");
        }

        public final K getKey() {
            return this.f3826t;
        }

        public final V getValue() {
            return this.u;
        }

        public final int hashCode() {
            int i10 = 0;
            K k10 = this.f3826t;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.u;
            if (v10 != null) {
                i10 = v10.hashCode();
            }
            return i10 ^ hashCode;
        }

        public final V setValue(V v10) {
            V v11 = this.u;
            this.u = v10;
            return v11;
        }

        public final String toString() {
            return this.f3826t + "=" + this.u;
        }
    }

    public LinkedTreeMap() {
        this(NATURAL_ORDER);
    }

    public LinkedTreeMap(Comparator<? super K> comparator) {
        this.f3812q = 0;
        this.f3813r = 0;
        this.f3814s = new e<>();
        this.f3810o = comparator == null ? NATURAL_ORDER : comparator;
    }

    private boolean equal(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void rebalance(e<K, V> eVar, boolean z) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f3822p;
            e<K, V> eVar3 = eVar.f3823q;
            int i10 = 0;
            int i11 = eVar2 != null ? eVar2.f3827v : 0;
            int i12 = eVar3 != null ? eVar3.f3827v : 0;
            int i13 = i11 - i12;
            if (i13 == -2) {
                e<K, V> eVar4 = eVar3.f3822p;
                e<K, V> eVar5 = eVar3.f3823q;
                int i14 = eVar5 != null ? eVar5.f3827v : 0;
                if (eVar4 != null) {
                    i10 = eVar4.f3827v;
                }
                int i15 = i10 - i14;
                if (i15 != -1 && (i15 != 0 || z)) {
                    rotateRight(eVar3);
                }
                rotateLeft(eVar);
                if (z) {
                    return;
                }
            } else if (i13 == 2) {
                e<K, V> eVar6 = eVar2.f3822p;
                e<K, V> eVar7 = eVar2.f3823q;
                int i16 = eVar7 != null ? eVar7.f3827v : 0;
                if (eVar6 != null) {
                    i10 = eVar6.f3827v;
                }
                int i17 = i10 - i16;
                if (i17 != 1 && (i17 != 0 || z)) {
                    rotateLeft(eVar2);
                }
                rotateRight(eVar);
                if (z) {
                    return;
                }
            } else if (i13 == 0) {
                eVar.f3827v = i11 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.f3827v = Math.max(i11, i12) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f3821o;
        }
    }

    private void replaceInParent(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f3821o;
        eVar.f3821o = null;
        if (eVar2 != null) {
            eVar2.f3821o = eVar3;
        }
        if (eVar3 == null) {
            this.f3811p = eVar2;
        } else if (eVar3.f3822p == eVar) {
            eVar3.f3822p = eVar2;
        } else {
            eVar3.f3823q = eVar2;
        }
    }

    private void rotateLeft(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f3822p;
        e<K, V> eVar3 = eVar.f3823q;
        e<K, V> eVar4 = eVar3.f3822p;
        e<K, V> eVar5 = eVar3.f3823q;
        eVar.f3823q = eVar4;
        if (eVar4 != null) {
            eVar4.f3821o = eVar;
        }
        replaceInParent(eVar, eVar3);
        eVar3.f3822p = eVar;
        eVar.f3821o = eVar3;
        int i10 = 0;
        int max = Math.max(eVar2 != null ? eVar2.f3827v : 0, eVar4 != null ? eVar4.f3827v : 0) + 1;
        eVar.f3827v = max;
        if (eVar5 != null) {
            i10 = eVar5.f3827v;
        }
        eVar3.f3827v = Math.max(max, i10) + 1;
    }

    private void rotateRight(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f3822p;
        e<K, V> eVar3 = eVar.f3823q;
        e<K, V> eVar4 = eVar2.f3822p;
        e<K, V> eVar5 = eVar2.f3823q;
        eVar.f3822p = eVar5;
        if (eVar5 != null) {
            eVar5.f3821o = eVar;
        }
        replaceInParent(eVar, eVar2);
        eVar2.f3823q = eVar;
        eVar.f3821o = eVar2;
        int i10 = 0;
        int max = Math.max(eVar3 != null ? eVar3.f3827v : 0, eVar5 != null ? eVar5.f3827v : 0) + 1;
        eVar.f3827v = max;
        if (eVar4 != null) {
            i10 = eVar4.f3827v;
        }
        eVar2.f3827v = Math.max(max, i10) + 1;
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    public final e<K, V> a(K k10, boolean z) {
        int i10;
        e<K, V> eVar;
        e<K, V> eVar2 = this.f3811p;
        Comparator<? super K> comparator = this.f3810o;
        if (eVar2 != null) {
            Comparable comparable = comparator == NATURAL_ORDER ? (Comparable) k10 : null;
            while (true) {
                K k11 = eVar2.f3826t;
                i10 = comparable != null ? comparable.compareTo(k11) : comparator.compare(k10, k11);
                if (i10 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i10 < 0 ? eVar2.f3822p : eVar2.f3823q;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i10 = 0;
        }
        if (!z) {
            return null;
        }
        e<K, V> eVar4 = this.f3814s;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k10, eVar4, eVar4.f3825s);
            if (i10 < 0) {
                eVar2.f3822p = eVar;
            } else {
                eVar2.f3823q = eVar;
            }
            rebalance(eVar2, true);
        } else if (comparator != NATURAL_ORDER || (k10 instanceof Comparable)) {
            eVar = new e<>(eVar2, k10, eVar4, eVar4.f3825s);
            this.f3811p = eVar;
        } else {
            throw new ClassCastException(k10.getClass().getName().concat(" is not Comparable"));
        }
        this.f3812q++;
        this.f3813r++;
        return eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.gson.internal.LinkedTreeMap.e<K, V> b(java.util.Map.Entry<?, ?> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x000d
            com.google.gson.internal.LinkedTreeMap$e r0 = r4.a(r0, r1)     // Catch:{ ClassCastException -> 0x000d }
            goto L_0x000e
        L_0x000d:
            r0 = r2
        L_0x000e:
            if (r0 == 0) goto L_0x001d
            V r3 = r0.u
            java.lang.Object r5 = r5.getValue()
            boolean r5 = r4.equal(r3, r5)
            if (r5 == 0) goto L_0x001d
            r1 = 1
        L_0x001d:
            if (r1 == 0) goto L_0x0020
            r2 = r0
        L_0x0020:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedTreeMap.b(java.util.Map$Entry):com.google.gson.internal.LinkedTreeMap$e");
    }

    public final void c(e<K, V> eVar, boolean z) {
        e<K, V> eVar2;
        int i10;
        e<K, V> eVar3;
        if (z) {
            e<K, V> eVar4 = eVar.f3825s;
            eVar4.f3824r = eVar.f3824r;
            eVar.f3824r.f3825s = eVar4;
        }
        e<K, V> eVar5 = eVar.f3822p;
        e<K, V> eVar6 = eVar.f3823q;
        e<K, V> eVar7 = eVar.f3821o;
        int i11 = 0;
        if (eVar5 == null || eVar6 == null) {
            if (eVar5 != null) {
                replaceInParent(eVar, eVar5);
                eVar.f3822p = null;
            } else if (eVar6 != null) {
                replaceInParent(eVar, eVar6);
                eVar.f3823q = null;
            } else {
                replaceInParent(eVar, (e<K, V>) null);
            }
            rebalance(eVar7, false);
            this.f3812q--;
            this.f3813r++;
            return;
        }
        if (eVar5.f3827v > eVar6.f3827v) {
            do {
                eVar2 = eVar5;
                eVar5 = eVar5.f3823q;
            } while (eVar5 != null);
        } else {
            do {
                e<K, V> eVar8 = eVar6;
                eVar6 = eVar6.f3822p;
                eVar3 = eVar8;
            } while (eVar6 != null);
            eVar2 = eVar3;
        }
        c(eVar2, false);
        e<K, V> eVar9 = eVar.f3822p;
        if (eVar9 != null) {
            i10 = eVar9.f3827v;
            eVar2.f3822p = eVar9;
            eVar9.f3821o = eVar2;
            eVar.f3822p = null;
        } else {
            i10 = 0;
        }
        e<K, V> eVar10 = eVar.f3823q;
        if (eVar10 != null) {
            i11 = eVar10.f3827v;
            eVar2.f3823q = eVar10;
            eVar10.f3821o = eVar2;
            eVar.f3823q = null;
        }
        eVar2.f3827v = Math.max(i10, i11) + 1;
        replaceInParent(eVar, eVar2);
    }

    public void clear() {
        this.f3811p = null;
        this.f3812q = 0;
        this.f3813r++;
        e<K, V> eVar = this.f3814s;
        eVar.f3825s = eVar;
        eVar.f3824r = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x000b A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean containsKey(java.lang.Object r2) {
        /*
            r1 = this;
            r0 = 0
            if (r2 == 0) goto L_0x0008
            com.google.gson.internal.LinkedTreeMap$e r2 = r1.a(r2, r0)     // Catch:{ ClassCastException -> 0x0008 }
            goto L_0x0009
        L_0x0008:
            r2 = 0
        L_0x0009:
            if (r2 == 0) goto L_0x000c
            r0 = 1
        L_0x000c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedTreeMap.containsKey(java.lang.Object):boolean");
    }

    public Set<Map.Entry<K, V>> entrySet() {
        LinkedTreeMap<K, V>.b bVar = this.entrySet;
        if (bVar != null) {
            return bVar;
        }
        LinkedTreeMap<K, V>.b bVar2 = new b();
        this.entrySet = bVar2;
        return bVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public V get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0009
            r1 = 0
            com.google.gson.internal.LinkedTreeMap$e r3 = r2.a(r3, r1)     // Catch:{ ClassCastException -> 0x0009 }
            goto L_0x000a
        L_0x0009:
            r3 = r0
        L_0x000a:
            if (r3 == 0) goto L_0x000e
            V r0 = r3.u
        L_0x000e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedTreeMap.get(java.lang.Object):java.lang.Object");
    }

    public Set<K> keySet() {
        LinkedTreeMap<K, V>.c cVar = this.keySet;
        if (cVar != null) {
            return cVar;
        }
        LinkedTreeMap<K, V>.c cVar2 = new c();
        this.keySet = cVar2;
        return cVar2;
    }

    public V put(K k10, V v10) {
        if (k10 != null) {
            e a10 = a(k10, true);
            V v11 = a10.u;
            a10.u = v10;
            return v11;
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0012  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public V remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0009
            r1 = 0
            com.google.gson.internal.LinkedTreeMap$e r3 = r2.a(r3, r1)     // Catch:{ ClassCastException -> 0x0009 }
            goto L_0x000a
        L_0x0009:
            r3 = r0
        L_0x000a:
            if (r3 == 0) goto L_0x0010
            r1 = 1
            r2.c(r3, r1)
        L_0x0010:
            if (r3 == 0) goto L_0x0014
            V r0 = r3.u
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedTreeMap.remove(java.lang.Object):java.lang.Object");
    }

    public int size() {
        return this.f3812q;
    }
}

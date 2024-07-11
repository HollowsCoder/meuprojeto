package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    private static final Comparator<Comparable> NATURAL_ORDER = new a();
    private LinkedHashTreeMap<K, V>.c entrySet;
    private LinkedHashTreeMap<K, V>.d keySet;

    /* renamed from: o  reason: collision with root package name */
    public final Comparator<? super K> f3788o;

    /* renamed from: p  reason: collision with root package name */
    public f<K, V>[] f3789p;

    /* renamed from: q  reason: collision with root package name */
    public final f<K, V> f3790q;

    /* renamed from: r  reason: collision with root package name */
    public int f3791r;

    /* renamed from: s  reason: collision with root package name */
    public int f3792s;

    /* renamed from: t  reason: collision with root package name */
    public int f3793t;

    public class a implements Comparator<Comparable> {
        public final int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }

    public static final class b<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public f<K, V> f3794a;

        /* renamed from: b  reason: collision with root package name */
        public int f3795b;

        /* renamed from: c  reason: collision with root package name */
        public int f3796c;
        public int d;

        public final void a(f<K, V> fVar) {
            fVar.f3805q = null;
            fVar.f3803o = null;
            fVar.f3804p = null;
            fVar.w = 1;
            int i10 = this.f3795b;
            if (i10 > 0) {
                int i11 = this.d;
                if ((i11 & 1) == 0) {
                    this.d = i11 + 1;
                    this.f3795b = i10 - 1;
                    this.f3796c++;
                }
            }
            fVar.f3803o = this.f3794a;
            this.f3794a = fVar;
            int i12 = this.d + 1;
            this.d = i12;
            int i13 = this.f3795b;
            if (i13 > 0 && (i12 & 1) == 0) {
                this.d = i12 + 1;
                this.f3795b = i13 - 1;
                this.f3796c++;
            }
            int i14 = 4;
            while (true) {
                int i15 = i14 - 1;
                if ((this.d & i15) == i15) {
                    int i16 = this.f3796c;
                    if (i16 == 0) {
                        f<K, V> fVar2 = this.f3794a;
                        f<K, V> fVar3 = fVar2.f3803o;
                        f<K, V> fVar4 = fVar3.f3803o;
                        fVar3.f3803o = fVar4.f3803o;
                        this.f3794a = fVar3;
                        fVar3.f3804p = fVar4;
                        fVar3.f3805q = fVar2;
                        fVar3.w = fVar2.w + 1;
                        fVar4.f3803o = fVar3;
                        fVar2.f3803o = fVar3;
                    } else {
                        if (i16 == 1) {
                            f<K, V> fVar5 = this.f3794a;
                            f<K, V> fVar6 = fVar5.f3803o;
                            this.f3794a = fVar6;
                            fVar6.f3805q = fVar5;
                            fVar6.w = fVar5.w + 1;
                            fVar5.f3803o = fVar6;
                        } else if (i16 != 2) {
                        }
                        this.f3796c = 0;
                    }
                    i14 *= 2;
                } else {
                    return;
                }
            }
        }
    }

    public final class c extends AbstractSet<Map.Entry<K, V>> {

        public class a extends LinkedHashTreeMap<K, V>.e<Map.Entry<K, V>> {
            public a(c cVar) {
                super();
            }

            public final Object next() {
                return a();
            }
        }

        public c() {
        }

        public final void clear() {
            LinkedHashTreeMap.this.clear();
        }

        public final boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedHashTreeMap.this.b((Map.Entry) obj) != null;
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
            r0 = r2.f3797o;
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
                com.google.gson.internal.LinkedHashTreeMap r0 = com.google.gson.internal.LinkedHashTreeMap.this
                com.google.gson.internal.LinkedHashTreeMap$f r3 = r0.b(r3)
                if (r3 != 0) goto L_0x0011
                return r1
            L_0x0011:
                r1 = 1
                r0.c(r3, r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedHashTreeMap.c.remove(java.lang.Object):boolean");
        }

        public final int size() {
            return LinkedHashTreeMap.this.f3791r;
        }
    }

    public final class d extends AbstractSet<K> {

        public class a extends LinkedHashTreeMap<K, V>.e<K> {
            public a(d dVar) {
                super();
            }

            public final K next() {
                return a().f3808t;
            }
        }

        public d() {
        }

        public final void clear() {
            LinkedHashTreeMap.this.clear();
        }

        public final boolean contains(Object obj) {
            return LinkedHashTreeMap.this.containsKey(obj);
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
                com.google.gson.internal.LinkedHashTreeMap r0 = com.google.gson.internal.LinkedHashTreeMap.this
                r0.getClass()
                r1 = 0
                if (r4 == 0) goto L_0x000d
                com.google.gson.internal.LinkedHashTreeMap$f r4 = r0.a(r4, r1)     // Catch:{ ClassCastException -> 0x000d }
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedHashTreeMap.d.remove(java.lang.Object):boolean");
        }

        public final int size() {
            return LinkedHashTreeMap.this.f3791r;
        }
    }

    public abstract class e<T> implements Iterator<T> {

        /* renamed from: o  reason: collision with root package name */
        public f<K, V> f3799o;

        /* renamed from: p  reason: collision with root package name */
        public f<K, V> f3800p = null;

        /* renamed from: q  reason: collision with root package name */
        public int f3801q;

        public e() {
            this.f3799o = LinkedHashTreeMap.this.f3790q.f3806r;
            this.f3801q = LinkedHashTreeMap.this.f3792s;
        }

        public final f<K, V> a() {
            f<K, V> fVar = this.f3799o;
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            if (fVar == linkedHashTreeMap.f3790q) {
                throw new NoSuchElementException();
            } else if (linkedHashTreeMap.f3792s == this.f3801q) {
                this.f3799o = fVar.f3806r;
                this.f3800p = fVar;
                return fVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f3799o != LinkedHashTreeMap.this.f3790q;
        }

        public final void remove() {
            f<K, V> fVar = this.f3800p;
            if (fVar != null) {
                LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
                linkedHashTreeMap.c(fVar, true);
                this.f3800p = null;
                this.f3801q = linkedHashTreeMap.f3792s;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static final class f<K, V> implements Map.Entry<K, V> {

        /* renamed from: o  reason: collision with root package name */
        public f<K, V> f3803o;

        /* renamed from: p  reason: collision with root package name */
        public f<K, V> f3804p;

        /* renamed from: q  reason: collision with root package name */
        public f<K, V> f3805q;

        /* renamed from: r  reason: collision with root package name */
        public f<K, V> f3806r;

        /* renamed from: s  reason: collision with root package name */
        public f<K, V> f3807s;

        /* renamed from: t  reason: collision with root package name */
        public final K f3808t;
        public final int u;

        /* renamed from: v  reason: collision with root package name */
        public V f3809v;
        public int w;

        public f() {
            this.f3808t = null;
            this.u = -1;
            this.f3807s = this;
            this.f3806r = this;
        }

        public f(f<K, V> fVar, K k10, int i10, f<K, V> fVar2, f<K, V> fVar3) {
            this.f3803o = fVar;
            this.f3808t = k10;
            this.u = i10;
            this.w = 1;
            this.f3806r = fVar2;
            this.f3807s = fVar3;
            fVar3.f3806r = this;
            fVar2.f3807s = this;
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
                K r0 = r3.f3808t
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x002e
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x002e
            L_0x001c:
                V r0 = r3.f3809v
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedHashTreeMap.f.equals(java.lang.Object):boolean");
        }

        public final K getKey() {
            return this.f3808t;
        }

        public final V getValue() {
            return this.f3809v;
        }

        public final int hashCode() {
            int i10 = 0;
            K k10 = this.f3808t;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f3809v;
            if (v10 != null) {
                i10 = v10.hashCode();
            }
            return i10 ^ hashCode;
        }

        public final V setValue(V v10) {
            V v11 = this.f3809v;
            this.f3809v = v10;
            return v11;
        }

        public final String toString() {
            return this.f3808t + "=" + this.f3809v;
        }
    }

    public LinkedHashTreeMap() {
        this(NATURAL_ORDER);
    }

    public LinkedHashTreeMap(Comparator<? super K> comparator) {
        this.f3791r = 0;
        this.f3792s = 0;
        this.f3788o = comparator == null ? NATURAL_ORDER : comparator;
        this.f3790q = new f<>();
        f<K, V>[] fVarArr = new f[16];
        this.f3789p = fVarArr;
        this.f3793t = (fVarArr.length / 4) + (fVarArr.length / 2);
    }

    private void doubleCapacity() {
        f<K, V> fVar;
        f<K, V> fVar2;
        f<K, V> fVar3;
        f<K, V>[] fVarArr = this.f3789p;
        int length = fVarArr.length;
        int i10 = length * 2;
        f<K, V>[] fVarArr2 = new f[i10];
        b bVar = new b();
        b bVar2 = new b();
        for (int i11 = 0; i11 < length; i11++) {
            f<K, V> fVar4 = fVarArr[i11];
            if (fVar4 != null) {
                f<K, V> fVar5 = null;
                f<K, V> fVar6 = null;
                for (f<K, V> fVar7 = fVar4; fVar7 != null; fVar7 = fVar7.f3804p) {
                    fVar7.f3803o = fVar6;
                    fVar6 = fVar7;
                }
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (fVar6 != null) {
                        f<K, V> fVar8 = fVar6.f3803o;
                        fVar6.f3803o = null;
                        f<K, V> fVar9 = fVar6.f3805q;
                        while (true) {
                            f<K, V> fVar10 = fVar9;
                            fVar = fVar8;
                            fVar8 = fVar10;
                            if (fVar8 == null) {
                                break;
                            }
                            fVar8.f3803o = fVar;
                            fVar9 = fVar8.f3804p;
                        }
                    } else {
                        fVar = fVar6;
                        fVar6 = null;
                    }
                    if (fVar6 == null) {
                        break;
                    }
                    if ((fVar6.u & length) == 0) {
                        i12++;
                    } else {
                        i13++;
                    }
                    fVar6 = fVar;
                }
                bVar.f3795b = ((Integer.highestOneBit(i12) * 2) - 1) - i12;
                bVar.d = 0;
                bVar.f3796c = 0;
                bVar.f3794a = null;
                bVar2.f3795b = ((Integer.highestOneBit(i13) * 2) - 1) - i13;
                bVar2.d = 0;
                bVar2.f3796c = 0;
                bVar2.f3794a = null;
                f<K, V> fVar11 = null;
                while (fVar4 != null) {
                    fVar4.f3803o = fVar11;
                    fVar11 = fVar4;
                    fVar4 = fVar4.f3804p;
                }
                while (true) {
                    if (fVar11 != null) {
                        f<K, V> fVar12 = fVar11.f3803o;
                        fVar11.f3803o = null;
                        f<K, V> fVar13 = fVar11.f3805q;
                        while (true) {
                            f<K, V> fVar14 = fVar13;
                            fVar2 = fVar12;
                            fVar12 = fVar14;
                            if (fVar12 == null) {
                                break;
                            }
                            fVar12.f3803o = fVar2;
                            fVar13 = fVar12.f3804p;
                        }
                    } else {
                        fVar2 = fVar11;
                        fVar11 = null;
                    }
                    if (fVar11 == null) {
                        break;
                    }
                    if ((fVar11.u & length) == 0) {
                        bVar.a(fVar11);
                    } else {
                        bVar2.a(fVar11);
                    }
                    fVar11 = fVar2;
                }
                if (i12 > 0) {
                    fVar3 = bVar.f3794a;
                    if (fVar3.f3803o != null) {
                        throw new IllegalStateException();
                    }
                } else {
                    fVar3 = null;
                }
                fVarArr2[i11] = fVar3;
                int i14 = i11 + length;
                if (i13 > 0) {
                    fVar5 = bVar2.f3794a;
                    if (fVar5.f3803o != null) {
                        throw new IllegalStateException();
                    }
                }
                fVarArr2[i14] = fVar5;
            }
        }
        this.f3789p = fVarArr2;
        this.f3793t = (i10 / 4) + (i10 / 2);
    }

    private boolean equal(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void rebalance(f<K, V> fVar, boolean z) {
        while (fVar != null) {
            f<K, V> fVar2 = fVar.f3804p;
            f<K, V> fVar3 = fVar.f3805q;
            int i10 = 0;
            int i11 = fVar2 != null ? fVar2.w : 0;
            int i12 = fVar3 != null ? fVar3.w : 0;
            int i13 = i11 - i12;
            if (i13 == -2) {
                f<K, V> fVar4 = fVar3.f3804p;
                f<K, V> fVar5 = fVar3.f3805q;
                int i14 = fVar5 != null ? fVar5.w : 0;
                if (fVar4 != null) {
                    i10 = fVar4.w;
                }
                int i15 = i10 - i14;
                if (i15 != -1 && (i15 != 0 || z)) {
                    rotateRight(fVar3);
                }
                rotateLeft(fVar);
                if (z) {
                    return;
                }
            } else if (i13 == 2) {
                f<K, V> fVar6 = fVar2.f3804p;
                f<K, V> fVar7 = fVar2.f3805q;
                int i16 = fVar7 != null ? fVar7.w : 0;
                if (fVar6 != null) {
                    i10 = fVar6.w;
                }
                int i17 = i10 - i16;
                if (i17 != 1 && (i17 != 0 || z)) {
                    rotateLeft(fVar2);
                }
                rotateRight(fVar);
                if (z) {
                    return;
                }
            } else if (i13 == 0) {
                fVar.w = i11 + 1;
                if (z) {
                    return;
                }
            } else {
                fVar.w = Math.max(i11, i12) + 1;
                if (!z) {
                    return;
                }
            }
            fVar = fVar.f3803o;
        }
    }

    private void replaceInParent(f<K, V> fVar, f<K, V> fVar2) {
        f<K, V> fVar3 = fVar.f3803o;
        fVar.f3803o = null;
        if (fVar2 != null) {
            fVar2.f3803o = fVar3;
        }
        if (fVar3 == null) {
            f<K, V>[] fVarArr = this.f3789p;
            fVarArr[fVar.u & (fVarArr.length - 1)] = fVar2;
        } else if (fVar3.f3804p == fVar) {
            fVar3.f3804p = fVar2;
        } else {
            fVar3.f3805q = fVar2;
        }
    }

    private void rotateLeft(f<K, V> fVar) {
        f<K, V> fVar2 = fVar.f3804p;
        f<K, V> fVar3 = fVar.f3805q;
        f<K, V> fVar4 = fVar3.f3804p;
        f<K, V> fVar5 = fVar3.f3805q;
        fVar.f3805q = fVar4;
        if (fVar4 != null) {
            fVar4.f3803o = fVar;
        }
        replaceInParent(fVar, fVar3);
        fVar3.f3804p = fVar;
        fVar.f3803o = fVar3;
        int i10 = 0;
        int max = Math.max(fVar2 != null ? fVar2.w : 0, fVar4 != null ? fVar4.w : 0) + 1;
        fVar.w = max;
        if (fVar5 != null) {
            i10 = fVar5.w;
        }
        fVar3.w = Math.max(max, i10) + 1;
    }

    private void rotateRight(f<K, V> fVar) {
        f<K, V> fVar2 = fVar.f3804p;
        f<K, V> fVar3 = fVar.f3805q;
        f<K, V> fVar4 = fVar2.f3804p;
        f<K, V> fVar5 = fVar2.f3805q;
        fVar.f3804p = fVar5;
        if (fVar5 != null) {
            fVar5.f3803o = fVar;
        }
        replaceInParent(fVar, fVar2);
        fVar2.f3805q = fVar;
        fVar.f3803o = fVar2;
        int i10 = 0;
        int max = Math.max(fVar3 != null ? fVar3.w : 0, fVar5 != null ? fVar5.w : 0) + 1;
        fVar.w = max;
        if (fVar4 != null) {
            i10 = fVar4.w;
        }
        fVar2.w = Math.max(max, i10) + 1;
    }

    private static int secondaryHash(int i10) {
        int i11 = i10 ^ ((i10 >>> 20) ^ (i10 >>> 12));
        return (i11 >>> 4) ^ ((i11 >>> 7) ^ i11);
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    public final f<K, V> a(K k10, boolean z) {
        int i10;
        f<K, V> fVar;
        f<K, V>[] fVarArr = this.f3789p;
        int secondaryHash = secondaryHash(k10.hashCode());
        int length = (fVarArr.length - 1) & secondaryHash;
        f<K, V> fVar2 = fVarArr[length];
        Comparator<? super K> comparator = this.f3788o;
        if (fVar2 != null) {
            Comparable comparable = comparator == NATURAL_ORDER ? (Comparable) k10 : null;
            while (true) {
                K k11 = fVar2.f3808t;
                i10 = comparable != null ? comparable.compareTo(k11) : comparator.compare(k10, k11);
                if (i10 == 0) {
                    return fVar2;
                }
                f<K, V> fVar3 = i10 < 0 ? fVar2.f3804p : fVar2.f3805q;
                if (fVar3 == null) {
                    break;
                }
                fVar2 = fVar3;
            }
        } else {
            i10 = 0;
        }
        f<K, V> fVar4 = fVar2;
        int i11 = i10;
        if (!z) {
            return null;
        }
        f<K, V> fVar5 = this.f3790q;
        if (fVar4 != null) {
            fVar = new f<>(fVar4, k10, secondaryHash, fVar5, fVar5.f3807s);
            if (i11 < 0) {
                fVar4.f3804p = fVar;
            } else {
                fVar4.f3805q = fVar;
            }
            rebalance(fVar4, true);
        } else if (comparator != NATURAL_ORDER || (k10 instanceof Comparable)) {
            fVar = new f<>(fVar4, k10, secondaryHash, fVar5, fVar5.f3807s);
            fVarArr[length] = fVar;
        } else {
            throw new ClassCastException(k10.getClass().getName().concat(" is not Comparable"));
        }
        int i12 = this.f3791r;
        this.f3791r = i12 + 1;
        if (i12 > this.f3793t) {
            doubleCapacity();
        }
        this.f3792s++;
        return fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.gson.internal.LinkedHashTreeMap.f<K, V> b(java.util.Map.Entry<?, ?> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x000d
            com.google.gson.internal.LinkedHashTreeMap$f r0 = r4.a(r0, r1)     // Catch:{ ClassCastException -> 0x000d }
            goto L_0x000e
        L_0x000d:
            r0 = r2
        L_0x000e:
            if (r0 == 0) goto L_0x001d
            V r3 = r0.f3809v
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedHashTreeMap.b(java.util.Map$Entry):com.google.gson.internal.LinkedHashTreeMap$f");
    }

    public final void c(f<K, V> fVar, boolean z) {
        f<K, V> fVar2;
        int i10;
        f<K, V> fVar3;
        if (z) {
            f<K, V> fVar4 = fVar.f3807s;
            fVar4.f3806r = fVar.f3806r;
            fVar.f3806r.f3807s = fVar4;
            fVar.f3807s = null;
            fVar.f3806r = null;
        }
        f<K, V> fVar5 = fVar.f3804p;
        f<K, V> fVar6 = fVar.f3805q;
        f<K, V> fVar7 = fVar.f3803o;
        int i11 = 0;
        if (fVar5 == null || fVar6 == null) {
            if (fVar5 != null) {
                replaceInParent(fVar, fVar5);
                fVar.f3804p = null;
            } else if (fVar6 != null) {
                replaceInParent(fVar, fVar6);
                fVar.f3805q = null;
            } else {
                replaceInParent(fVar, (f<K, V>) null);
            }
            rebalance(fVar7, false);
            this.f3791r--;
            this.f3792s++;
            return;
        }
        if (fVar5.w > fVar6.w) {
            do {
                fVar2 = fVar5;
                fVar5 = fVar5.f3805q;
            } while (fVar5 != null);
        } else {
            do {
                f<K, V> fVar8 = fVar6;
                fVar6 = fVar6.f3804p;
                fVar3 = fVar8;
            } while (fVar6 != null);
            fVar2 = fVar3;
        }
        c(fVar2, false);
        f<K, V> fVar9 = fVar.f3804p;
        if (fVar9 != null) {
            i10 = fVar9.w;
            fVar2.f3804p = fVar9;
            fVar9.f3803o = fVar2;
            fVar.f3804p = null;
        } else {
            i10 = 0;
        }
        f<K, V> fVar10 = fVar.f3805q;
        if (fVar10 != null) {
            i11 = fVar10.w;
            fVar2.f3805q = fVar10;
            fVar10.f3803o = fVar2;
            fVar.f3805q = null;
        }
        fVar2.w = Math.max(i10, i11) + 1;
        replaceInParent(fVar, fVar2);
    }

    public void clear() {
        Arrays.fill(this.f3789p, (Object) null);
        this.f3791r = 0;
        this.f3792s++;
        f<K, V> fVar = this.f3790q;
        f<K, V> fVar2 = fVar.f3806r;
        while (fVar2 != fVar) {
            f<K, V> fVar3 = fVar2.f3806r;
            fVar2.f3807s = null;
            fVar2.f3806r = null;
            fVar2 = fVar3;
        }
        fVar.f3807s = fVar;
        fVar.f3806r = fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x000b A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean containsKey(java.lang.Object r2) {
        /*
            r1 = this;
            r0 = 0
            if (r2 == 0) goto L_0x0008
            com.google.gson.internal.LinkedHashTreeMap$f r2 = r1.a(r2, r0)     // Catch:{ ClassCastException -> 0x0008 }
            goto L_0x0009
        L_0x0008:
            r2 = 0
        L_0x0009:
            if (r2 == 0) goto L_0x000c
            r0 = 1
        L_0x000c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedHashTreeMap.containsKey(java.lang.Object):boolean");
    }

    public Set<Map.Entry<K, V>> entrySet() {
        LinkedHashTreeMap<K, V>.c cVar = this.entrySet;
        if (cVar != null) {
            return cVar;
        }
        LinkedHashTreeMap<K, V>.c cVar2 = new c();
        this.entrySet = cVar2;
        return cVar2;
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
            com.google.gson.internal.LinkedHashTreeMap$f r3 = r2.a(r3, r1)     // Catch:{ ClassCastException -> 0x0009 }
            goto L_0x000a
        L_0x0009:
            r3 = r0
        L_0x000a:
            if (r3 == 0) goto L_0x000e
            V r0 = r3.f3809v
        L_0x000e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedHashTreeMap.get(java.lang.Object):java.lang.Object");
    }

    public Set<K> keySet() {
        LinkedHashTreeMap<K, V>.d dVar = this.keySet;
        if (dVar != null) {
            return dVar;
        }
        LinkedHashTreeMap<K, V>.d dVar2 = new d();
        this.keySet = dVar2;
        return dVar2;
    }

    public V put(K k10, V v10) {
        if (k10 != null) {
            f a10 = a(k10, true);
            V v11 = a10.f3809v;
            a10.f3809v = v10;
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
            com.google.gson.internal.LinkedHashTreeMap$f r3 = r2.a(r3, r1)     // Catch:{ ClassCastException -> 0x0009 }
            goto L_0x000a
        L_0x0009:
            r3 = r0
        L_0x000a:
            if (r3 == 0) goto L_0x0010
            r1 = 1
            r2.c(r3, r1)
        L_0x0010:
            if (r3 == 0) goto L_0x0014
            V r0 = r3.f3809v
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LinkedHashTreeMap.remove(java.lang.Object):java.lang.Object");
    }

    public int size() {
        return this.f3791r;
    }
}

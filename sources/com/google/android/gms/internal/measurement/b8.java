package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class b8<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int u = 0;

    /* renamed from: o  reason: collision with root package name */
    public final int f2639o;

    /* renamed from: p  reason: collision with root package name */
    public List<y7> f2640p = Collections.emptyList();

    /* renamed from: q  reason: collision with root package name */
    public Map<K, V> f2641q = Collections.emptyMap();

    /* renamed from: r  reason: collision with root package name */
    public boolean f2642r;

    /* renamed from: s  reason: collision with root package name */
    public volatile a8 f2643s;

    /* renamed from: t  reason: collision with root package name */
    public Map<K, V> f2644t = Collections.emptyMap();

    public /* synthetic */ b8(int i10) {
        this.f2639o = i10;
    }

    public void a() {
        if (!this.f2642r) {
            this.f2641q = this.f2641q.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f2641q);
            this.f2644t = this.f2644t.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f2644t);
            this.f2642r = true;
        }
    }

    /* renamed from: b */
    public final V put(K k10, V v10) {
        e();
        int d = d(k10);
        if (d >= 0) {
            return this.f2640p.get(d).setValue(v10);
        }
        e();
        boolean isEmpty = this.f2640p.isEmpty();
        int i10 = this.f2639o;
        if (isEmpty && !(this.f2640p instanceof ArrayList)) {
            this.f2640p = new ArrayList(i10);
        }
        int i11 = -(d + 1);
        if (i11 >= i10) {
            return f().put(k10, v10);
        }
        if (this.f2640p.size() == i10) {
            y7 remove = this.f2640p.remove(i10 - 1);
            f().put(remove.f3010o, remove.f3011p);
        }
        this.f2640p.add(i11, new y7(this, k10, v10));
        return null;
    }

    public final V c(int i10) {
        e();
        V v10 = this.f2640p.remove(i10).f3011p;
        if (!this.f2641q.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            List<y7> list = this.f2640p;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new y7(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return v10;
    }

    public final void clear() {
        e();
        if (!this.f2640p.isEmpty()) {
            this.f2640p.clear();
        }
        if (!this.f2641q.isEmpty()) {
            this.f2641q.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return d(comparable) >= 0 || this.f2641q.containsKey(comparable);
    }

    public final int d(K k10) {
        int size = this.f2640p.size() - 1;
        int i10 = 0;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f2640p.get(size).f3010o);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = k10.compareTo(this.f2640p.get(i11).f3010o);
            if (compareTo2 < 0) {
                size = i11 - 1;
            } else if (compareTo2 <= 0) {
                return i11;
            } else {
                i10 = i11 + 1;
            }
        }
        return -(i10 + 1);
    }

    public final void e() {
        if (this.f2642r) {
            throw new UnsupportedOperationException();
        }
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f2643s == null) {
            this.f2643s = new a8(this);
        }
        return this.f2643s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8)) {
            return super.equals(obj);
        }
        b8 b8Var = (b8) obj;
        int size = size();
        if (size != b8Var.size()) {
            return false;
        }
        int size2 = this.f2640p.size();
        if (size2 == b8Var.f2640p.size()) {
            for (int i10 = 0; i10 < size2; i10++) {
                if (!this.f2640p.get(i10).equals(b8Var.f2640p.get(i10))) {
                    return false;
                }
            }
            if (size2 != size) {
                return this.f2641q.equals(b8Var.f2641q);
            }
            return true;
        }
        return ((AbstractSet) entrySet()).equals(b8Var.entrySet());
    }

    public final SortedMap<K, V> f() {
        e();
        if (this.f2641q.isEmpty() && !(this.f2641q instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f2641q = treeMap;
            this.f2644t = treeMap.descendingMap();
        }
        return (SortedMap) this.f2641q;
    }

    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int d = d(comparable);
        if (d >= 0) {
            return this.f2640p.get(d).f3011p;
        }
        return this.f2641q.get(comparable);
    }

    public final int hashCode() {
        int size = this.f2640p.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += this.f2640p.get(i11).hashCode();
        }
        if (this.f2641q.size() > 0) {
            return this.f2641q.hashCode() + i10;
        }
        return i10;
    }

    public final V remove(Object obj) {
        e();
        Comparable comparable = (Comparable) obj;
        int d = d(comparable);
        if (d >= 0) {
            return c(d);
        }
        if (this.f2641q.isEmpty()) {
            return null;
        }
        return this.f2641q.remove(comparable);
    }

    public final int size() {
        return this.f2641q.size() + this.f2640p.size();
    }
}

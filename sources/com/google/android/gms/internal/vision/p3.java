package com.google.android.gms.internal.vision;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import s6.a;

public class p3<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int u = 0;

    /* renamed from: o  reason: collision with root package name */
    public final int f3129o;

    /* renamed from: p  reason: collision with root package name */
    public List<r3> f3130p = Collections.emptyList();

    /* renamed from: q  reason: collision with root package name */
    public Map<K, V> f3131q = Collections.emptyMap();

    /* renamed from: r  reason: collision with root package name */
    public boolean f3132r;

    /* renamed from: s  reason: collision with root package name */
    public volatile t3 f3133s;

    /* renamed from: t  reason: collision with root package name */
    public Map<K, V> f3134t = Collections.emptyMap();

    public p3(int i10) {
        this.f3129o = i10;
    }

    public final int a(K k10) {
        int size = this.f3130p.size() - 1;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f3130p.get(size).f3158o);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = k10.compareTo(this.f3130p.get(i11).f3158o);
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

    /* renamed from: b */
    public final V put(K k10, V v10) {
        h();
        int a10 = a(k10);
        if (a10 >= 0) {
            return this.f3130p.get(a10).setValue(v10);
        }
        h();
        boolean isEmpty = this.f3130p.isEmpty();
        int i10 = this.f3129o;
        if (isEmpty && !(this.f3130p instanceof ArrayList)) {
            this.f3130p = new ArrayList(i10);
        }
        int i11 = -(a10 + 1);
        if (i11 >= i10) {
            return i().put(k10, v10);
        }
        if (this.f3130p.size() == i10) {
            r3 remove = this.f3130p.remove(i10 - 1);
            i().put(remove.f3158o, remove.f3159p);
        }
        this.f3130p.add(i11, new r3(this, k10, v10));
        return null;
    }

    public void c() {
        if (!this.f3132r) {
            this.f3131q = this.f3131q.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f3131q);
            this.f3134t = this.f3134t.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f3134t);
            this.f3132r = true;
        }
    }

    public final void clear() {
        h();
        if (!this.f3130p.isEmpty()) {
            this.f3130p.clear();
        }
        if (!this.f3131q.isEmpty()) {
            this.f3131q.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f3131q.containsKey(comparable);
    }

    public final Map.Entry<K, V> d(int i10) {
        return this.f3130p.get(i10);
    }

    public final int e() {
        return this.f3130p.size();
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f3133s == null) {
            this.f3133s = new t3(this);
        }
        return this.f3133s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3)) {
            return super.equals(obj);
        }
        p3 p3Var = (p3) obj;
        int size = size();
        if (size != p3Var.size()) {
            return false;
        }
        int e10 = e();
        if (e10 != p3Var.e()) {
            return entrySet().equals(p3Var.entrySet());
        }
        for (int i10 = 0; i10 < e10; i10++) {
            if (!d(i10).equals(p3Var.d(i10))) {
                return false;
            }
        }
        if (e10 != size) {
            return this.f3131q.equals(p3Var.f3131q);
        }
        return true;
    }

    public final V f(int i10) {
        h();
        V v10 = this.f3130p.remove(i10).f3159p;
        if (!this.f3131q.isEmpty()) {
            Iterator it = i().entrySet().iterator();
            List<r3> list = this.f3130p;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new r3(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return v10;
    }

    public final Iterable<Map.Entry<K, V>> g() {
        return this.f3131q.isEmpty() ? a.F : this.f3131q.entrySet();
    }

    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a10 = a(comparable);
        if (a10 >= 0) {
            return this.f3130p.get(a10).f3159p;
        }
        return this.f3131q.get(comparable);
    }

    public final void h() {
        if (this.f3132r) {
            throw new UnsupportedOperationException();
        }
    }

    public final int hashCode() {
        int e10 = e();
        int i10 = 0;
        for (int i11 = 0; i11 < e10; i11++) {
            i10 += this.f3130p.get(i11).hashCode();
        }
        return this.f3131q.size() > 0 ? i10 + this.f3131q.hashCode() : i10;
    }

    public final SortedMap<K, V> i() {
        h();
        if (this.f3131q.isEmpty() && !(this.f3131q instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f3131q = treeMap;
            this.f3134t = treeMap.descendingMap();
        }
        return (SortedMap) this.f3131q;
    }

    public final V remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int a10 = a(comparable);
        if (a10 >= 0) {
            return f(a10);
        }
        if (this.f3131q.isEmpty()) {
            return null;
        }
        return this.f3131q.remove(comparable);
    }

    public final int size() {
        return this.f3131q.size() + this.f3130p.size();
    }
}

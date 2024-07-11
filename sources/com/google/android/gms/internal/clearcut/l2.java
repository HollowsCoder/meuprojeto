package com.google.android.gms.internal.clearcut;

import androidx.databinding.a;
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

public class l2<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public static final /* synthetic */ int u = 0;

    /* renamed from: o  reason: collision with root package name */
    public final int f2497o;

    /* renamed from: p  reason: collision with root package name */
    public List<p2> f2498p = Collections.emptyList();

    /* renamed from: q  reason: collision with root package name */
    public Map<K, V> f2499q = Collections.emptyMap();

    /* renamed from: r  reason: collision with root package name */
    public boolean f2500r;

    /* renamed from: s  reason: collision with root package name */
    public volatile r2 f2501s;

    /* renamed from: t  reason: collision with root package name */
    public Map<K, V> f2502t = Collections.emptyMap();

    public l2(int i10) {
        this.f2497o = i10;
    }

    public final int a(K k10) {
        int size = this.f2498p.size() - 1;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f2498p.get(size).f2518o);
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
            int compareTo2 = k10.compareTo(this.f2498p.get(i11).f2518o);
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
        g();
        int a10 = a(k10);
        if (a10 >= 0) {
            return this.f2498p.get(a10).setValue(v10);
        }
        g();
        boolean isEmpty = this.f2498p.isEmpty();
        int i10 = this.f2497o;
        if (isEmpty && !(this.f2498p instanceof ArrayList)) {
            this.f2498p = new ArrayList(i10);
        }
        int i11 = -(a10 + 1);
        if (i11 >= i10) {
            return h().put(k10, v10);
        }
        if (this.f2498p.size() == i10) {
            p2 remove = this.f2498p.remove(i10 - 1);
            h().put(remove.f2518o, remove.f2519p);
        }
        this.f2498p.add(i11, new p2(this, k10, v10));
        return null;
    }

    public final Map.Entry<K, V> c(int i10) {
        return this.f2498p.get(i10);
    }

    public final void clear() {
        g();
        if (!this.f2498p.isEmpty()) {
            this.f2498p.clear();
        }
        if (!this.f2499q.isEmpty()) {
            this.f2499q.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f2499q.containsKey(comparable);
    }

    public final V d(int i10) {
        g();
        V v10 = this.f2498p.remove(i10).f2519p;
        if (!this.f2499q.isEmpty()) {
            Iterator it = h().entrySet().iterator();
            List<p2> list = this.f2498p;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new p2(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return v10;
    }

    public final int e() {
        return this.f2498p.size();
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f2501s == null) {
            this.f2501s = new r2(this);
        }
        return this.f2501s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return super.equals(obj);
        }
        l2 l2Var = (l2) obj;
        int size = size();
        if (size != l2Var.size()) {
            return false;
        }
        int e10 = e();
        if (e10 != l2Var.e()) {
            return entrySet().equals(l2Var.entrySet());
        }
        for (int i10 = 0; i10 < e10; i10++) {
            if (!c(i10).equals(l2Var.c(i10))) {
                return false;
            }
        }
        if (e10 != size) {
            return this.f2499q.equals(l2Var.f2499q);
        }
        return true;
    }

    public final Iterable<Map.Entry<K, V>> f() {
        return this.f2499q.isEmpty() ? a.f1027x : this.f2499q.entrySet();
    }

    public final void g() {
        if (this.f2500r) {
            throw new UnsupportedOperationException();
        }
    }

    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a10 = a(comparable);
        if (a10 >= 0) {
            return this.f2498p.get(a10).f2519p;
        }
        return this.f2499q.get(comparable);
    }

    public final SortedMap<K, V> h() {
        g();
        if (this.f2499q.isEmpty() && !(this.f2499q instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f2499q = treeMap;
            this.f2502t = treeMap.descendingMap();
        }
        return (SortedMap) this.f2499q;
    }

    public final int hashCode() {
        int e10 = e();
        int i10 = 0;
        for (int i11 = 0; i11 < e10; i11++) {
            i10 += this.f2498p.get(i11).hashCode();
        }
        return this.f2499q.size() > 0 ? i10 + this.f2499q.hashCode() : i10;
    }

    public void i() {
        if (!this.f2500r) {
            this.f2499q = this.f2499q.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f2499q);
            this.f2502t = this.f2502t.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f2502t);
            this.f2500r = true;
        }
    }

    public final V remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int a10 = a(comparable);
        if (a10 >= 0) {
            return d(a10);
        }
        if (this.f2499q.isEmpty()) {
            return null;
        }
        return this.f2499q.remove(comparable);
    }

    public final int size() {
        return this.f2499q.size() + this.f2498p.size();
    }
}

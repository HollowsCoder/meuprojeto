package k;

import java.util.HashMap;
import k.b;

public final class a<K, V> extends b<K, V> {

    /* renamed from: s  reason: collision with root package name */
    public final HashMap<K, b.c<K, V>> f6608s = new HashMap<>();

    public final b.c<K, V> e(K k10) {
        return this.f6608s.get(k10);
    }

    public final V h(K k10) {
        V h10 = super.h(k10);
        this.f6608s.remove(k10);
        return h10;
    }

    public final V i(K k10, V v10) {
        b.c e10 = e(k10);
        if (e10 != null) {
            return e10.f6614p;
        }
        HashMap<K, b.c<K, V>> hashMap = this.f6608s;
        b.c<K, V> cVar = new b.c<>(k10, v10);
        this.f6612r++;
        b.c<K, V> cVar2 = this.f6610p;
        if (cVar2 == null) {
            this.f6609o = cVar;
        } else {
            cVar2.f6615q = cVar;
            cVar.f6616r = cVar2;
        }
        this.f6610p = cVar;
        hashMap.put(k10, cVar);
        return null;
    }
}

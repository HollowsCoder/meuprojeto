package n;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import n.h;

public class b<K, V> extends i<K, V> implements Map<K, V> {

    /* renamed from: v  reason: collision with root package name */
    public a f7286v;

    public b() {
    }

    public b(int i10) {
        super(i10);
    }

    public b(b bVar) {
        if (bVar != null) {
            i(bVar);
        }
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f7286v == null) {
            this.f7286v = new a(this);
        }
        a aVar = this.f7286v;
        if (aVar.f7313a == null) {
            aVar.f7313a = new h.b();
        }
        return aVar.f7313a;
    }

    public final Set<K> keySet() {
        if (this.f7286v == null) {
            this.f7286v = new a(this);
        }
        a aVar = this.f7286v;
        if (aVar.f7314b == null) {
            aVar.f7314b = new h.c();
        }
        return aVar.f7314b;
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        b(map.size() + this.f7333q);
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public final Collection<V> values() {
        if (this.f7286v == null) {
            this.f7286v = new a(this);
        }
        a aVar = this.f7286v;
        if (aVar.f7315c == null) {
            aVar.f7315c = new h.e();
        }
        return aVar.f7315c;
    }
}

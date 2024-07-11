package t2;

import java.util.ArrayList;
import java.util.HashMap;
import t2.k;

public final class f<K extends k, V> {

    /* renamed from: a  reason: collision with root package name */
    public final a<K, V> f8891a = new a<>();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f8892b = new HashMap();

    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final K f8893a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList f8894b;

        /* renamed from: c  reason: collision with root package name */
        public a<K, V> f8895c;
        public a<K, V> d;

        public a() {
            this((Object) null);
        }

        public a(K k10) {
            this.d = this;
            this.f8895c = this;
            this.f8893a = k10;
        }
    }

    public final V a(K k10) {
        int i10;
        HashMap hashMap = this.f8892b;
        a<K, V> aVar = (a) hashMap.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            hashMap.put(k10, aVar);
        } else {
            k10.a();
        }
        a<K, V> aVar2 = aVar.d;
        aVar2.f8895c = aVar.f8895c;
        aVar.f8895c.d = aVar2;
        a<K, V> aVar3 = this.f8891a;
        aVar.d = aVar3;
        a<K, V> aVar4 = aVar3.f8895c;
        aVar.f8895c = aVar4;
        aVar4.d = aVar;
        aVar.d.f8895c = aVar;
        ArrayList arrayList = aVar.f8894b;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            return aVar.f8894b.remove(i10 - 1);
        }
        return null;
    }

    public final void b(K k10, V v10) {
        HashMap hashMap = this.f8892b;
        a<K, V> aVar = (a) hashMap.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            a<K, V> aVar2 = aVar.d;
            aVar2.f8895c = aVar.f8895c;
            aVar.f8895c.d = aVar2;
            a<K, V> aVar3 = this.f8891a;
            aVar.d = aVar3.d;
            aVar.f8895c = aVar3;
            aVar3.d = aVar;
            aVar.d.f8895c = aVar;
            hashMap.put(k10, aVar);
        } else {
            k10.a();
        }
        if (aVar.f8894b == null) {
            aVar.f8894b = new ArrayList();
        }
        aVar.f8894b.add(v10);
    }

    public final V c() {
        int i10;
        a<K, V> aVar = this.f8891a;
        a<K, V> aVar2 = aVar.d;
        while (true) {
            V v10 = null;
            if (aVar2.equals(aVar)) {
                return null;
            }
            ArrayList arrayList = aVar2.f8894b;
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                v10 = aVar2.f8894b.remove(i10 - 1);
            }
            if (v10 != null) {
                return v10;
            }
            a<K, V> aVar3 = aVar2.d;
            aVar3.f8895c = aVar2.f8895c;
            aVar2.f8895c.d = aVar3;
            HashMap hashMap = this.f8892b;
            K k10 = aVar2.f8893a;
            hashMap.remove(k10);
            ((k) k10).a();
            aVar2 = aVar2.d;
        }
    }

    public final String toString() {
        int i10;
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        a<K, V> aVar = this.f8891a;
        a<K, V> aVar2 = aVar.f8895c;
        boolean z = false;
        while (!aVar2.equals(aVar)) {
            sb.append('{');
            sb.append(aVar2.f8893a);
            sb.append(':');
            ArrayList arrayList = aVar2.f8894b;
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            sb.append(i10);
            sb.append("}, ");
            aVar2 = aVar2.f8895c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}

package h3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import q2.j;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f5226a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f5227b = new HashMap();

    public static class a<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f5228a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<R> f5229b;

        /* renamed from: c  reason: collision with root package name */
        public final j<T, R> f5230c;

        public a(Class<T> cls, Class<R> cls2, j<T, R> jVar) {
            this.f5228a = cls;
            this.f5229b = cls2;
            this.f5230c = jVar;
        }
    }

    public final synchronized List<a<?, ?>> a(String str) {
        List<a<?, ?>> list;
        if (!this.f5226a.contains(str)) {
            this.f5226a.add(str);
        }
        list = (List) this.f5227b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f5227b.put(str, list);
        }
        return list;
    }

    public final synchronized ArrayList b(Class cls, Class cls2) {
        ArrayList arrayList;
        boolean z;
        arrayList = new ArrayList();
        Iterator it = this.f5226a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f5227b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (!aVar.f5228a.isAssignableFrom(cls) || !cls2.isAssignableFrom(aVar.f5229b)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z && !arrayList.contains(aVar.f5229b)) {
                        arrayList.add(aVar.f5229b);
                    }
                }
            }
        }
        return arrayList;
    }
}

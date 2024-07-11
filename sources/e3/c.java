package e3;

import java.util.ArrayList;
import java.util.Iterator;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f4472a = new ArrayList();

    public static final class a<Z, R> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<Z> f4473a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<R> f4474b;

        /* renamed from: c  reason: collision with root package name */
        public final b<Z, R> f4475c;

        public a(Class<Z> cls, Class<R> cls2, b<Z, R> bVar) {
            this.f4473a = cls;
            this.f4474b = cls2;
            this.f4475c = bVar;
        }
    }

    public final synchronized ArrayList a(Class cls, Class cls2) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.f4472a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!aVar.f4473a.isAssignableFrom(cls) || !cls2.isAssignableFrom(aVar.f4474b)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }
}

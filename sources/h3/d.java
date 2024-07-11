package h3;

import java.util.ArrayList;
import q2.k;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f5231a = new ArrayList();

    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f5232a;

        /* renamed from: b  reason: collision with root package name */
        public final k<T> f5233b;

        public a(Class<T> cls, k<T> kVar) {
            this.f5232a = cls;
            this.f5233b = kVar;
        }
    }

    public final synchronized <Z> k<Z> a(Class<Z> cls) {
        int size = this.f5231a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) this.f5231a.get(i10);
            if (aVar.f5232a.isAssignableFrom(cls)) {
                return aVar.f5233b;
            }
        }
        return null;
    }
}

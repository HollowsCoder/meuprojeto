package w2;

import com.bumptech.glide.k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import n3.a;
import q2.h;
import w2.n;

public final class r {

    /* renamed from: e  reason: collision with root package name */
    public static final c f9207e = new c();

    /* renamed from: f  reason: collision with root package name */
    public static final a f9208f = new a();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f9209a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final c f9210b;

    /* renamed from: c  reason: collision with root package name */
    public final HashSet f9211c = new HashSet();
    public final h0.c<List<Throwable>> d;

    public static class a implements n<Object, Object> {
        public final n.a<Object> a(Object obj, int i10, int i11, h hVar) {
            return null;
        }

        public final boolean b(Object obj) {
            return false;
        }
    }

    public static class b<Model, Data> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<Model> f9212a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<Data> f9213b;

        /* renamed from: c  reason: collision with root package name */
        public final o<? extends Model, ? extends Data> f9214c;

        public b(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
            this.f9212a = cls;
            this.f9213b = cls2;
            this.f9214c = oVar;
        }
    }

    public static class c {
    }

    public r(a.c cVar) {
        c cVar2 = f9207e;
        this.d = cVar;
        this.f9210b = cVar2;
    }

    public final synchronized ArrayList a(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f9209a.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (!this.f9211c.contains(bVar)) {
                    if (bVar.f9212a.isAssignableFrom(cls)) {
                        this.f9211c.add(bVar);
                        n<? extends Model, ? extends Data> b10 = bVar.f9214c.b(this);
                        s6.a.n(b10);
                        arrayList.add(b10);
                        this.f9211c.remove(bVar);
                    }
                }
            }
        } catch (Throwable th) {
            this.f9211c.clear();
            throw th;
        }
        return arrayList;
    }

    public final synchronized <Model, Data> n<Model, Data> b(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f9209a.iterator();
            boolean z = false;
            while (true) {
                boolean z10 = true;
                if (!it.hasNext()) {
                    break;
                }
                b bVar = (b) it.next();
                if (this.f9211c.contains(bVar)) {
                    z = true;
                } else {
                    if (!bVar.f9212a.isAssignableFrom(cls) || !bVar.f9213b.isAssignableFrom(cls2)) {
                        z10 = false;
                    }
                    if (z10) {
                        this.f9211c.add(bVar);
                        arrayList.add(c(bVar));
                        this.f9211c.remove(bVar);
                    }
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.f9210b;
                h0.c<List<Throwable>> cVar2 = this.d;
                cVar.getClass();
                return new q(arrayList, cVar2);
            } else if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            } else if (z) {
                return f9208f;
            } else {
                throw new k.c((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th) {
            this.f9211c.clear();
            throw th;
        }
    }

    public final <Model, Data> n<Model, Data> c(b<?, ?> bVar) {
        n<? extends Model, ? extends Data> b10 = bVar.f9214c.b(this);
        s6.a.n(b10);
        return b10;
    }

    public final synchronized ArrayList d(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f9209a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (!arrayList.contains(bVar.f9213b) && bVar.f9212a.isAssignableFrom(cls)) {
                arrayList.add(bVar.f9213b);
            }
        }
        return arrayList;
    }
}

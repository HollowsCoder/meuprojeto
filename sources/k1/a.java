package k1;

import java.util.ArrayList;
import java.util.List;

public abstract class a<K, A> {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f6631a = new ArrayList(1);

    /* renamed from: b  reason: collision with root package name */
    public boolean f6632b = false;

    /* renamed from: c  reason: collision with root package name */
    public final c<K> f6633c;
    public float d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    public u1.c<A> f6634e;

    /* renamed from: f  reason: collision with root package name */
    public A f6635f = null;

    /* renamed from: g  reason: collision with root package name */
    public float f6636g = -1.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f6637h = -1.0f;

    /* renamed from: k1.a$a  reason: collision with other inner class name */
    public interface C0091a {
        void b();
    }

    public static final class b<T> implements c<T> {
        public final float a() {
            return 1.0f;
        }

        public final boolean b(float f10) {
            throw new IllegalStateException("not implemented");
        }

        public final float c() {
            return 0.0f;
        }

        public final u1.a<T> d() {
            throw new IllegalStateException("not implemented");
        }

        public final boolean e(float f10) {
            return false;
        }

        public final boolean isEmpty() {
            return true;
        }
    }

    public interface c<T> {
        float a();

        boolean b(float f10);

        float c();

        u1.a<T> d();

        boolean e(float f10);

        boolean isEmpty();
    }

    public static final class d<T> implements c<T> {

        /* renamed from: a  reason: collision with root package name */
        public final List<? extends u1.a<T>> f6638a;

        /* renamed from: b  reason: collision with root package name */
        public u1.a<T> f6639b;

        /* renamed from: c  reason: collision with root package name */
        public u1.a<T> f6640c = null;
        public float d = -1.0f;

        public d(List<? extends u1.a<T>> list) {
            this.f6638a = list;
            this.f6639b = f(0.0f);
        }

        public final float a() {
            List<? extends u1.a<T>> list = this.f6638a;
            return ((u1.a) list.get(list.size() - 1)).a();
        }

        public final boolean b(float f10) {
            u1.a<T> aVar = this.f6640c;
            u1.a<T> aVar2 = this.f6639b;
            if (aVar == aVar2 && this.d == f10) {
                return true;
            }
            this.f6640c = aVar2;
            this.d = f10;
            return false;
        }

        public final float c() {
            return ((u1.a) this.f6638a.get(0)).b();
        }

        public final u1.a<T> d() {
            return this.f6639b;
        }

        public final boolean e(float f10) {
            boolean z;
            u1.a<T> aVar = this.f6639b;
            if (f10 < aVar.b() || f10 >= aVar.a()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return !this.f6639b.c();
            }
            this.f6639b = f(f10);
            return true;
        }

        public final u1.a<T> f(float f10) {
            List<? extends u1.a<T>> list = this.f6638a;
            u1.a<T> aVar = (u1.a) list.get(list.size() - 1);
            if (f10 >= aVar.b()) {
                return aVar;
            }
            int size = list.size() - 2;
            while (true) {
                boolean z = false;
                if (size < 1) {
                    return (u1.a) list.get(0);
                }
                u1.a<T> aVar2 = (u1.a) list.get(size);
                if (this.f6639b != aVar2) {
                    if (f10 >= aVar2.b() && f10 < aVar2.a()) {
                        z = true;
                    }
                    if (z) {
                        return aVar2;
                    }
                }
                size--;
            }
        }

        public final boolean isEmpty() {
            return false;
        }
    }

    public static final class e<T> implements c<T> {

        /* renamed from: a  reason: collision with root package name */
        public final u1.a<T> f6641a;

        /* renamed from: b  reason: collision with root package name */
        public float f6642b = -1.0f;

        public e(List<? extends u1.a<T>> list) {
            this.f6641a = (u1.a) list.get(0);
        }

        public final float a() {
            return this.f6641a.a();
        }

        public final boolean b(float f10) {
            if (this.f6642b == f10) {
                return true;
            }
            this.f6642b = f10;
            return false;
        }

        public final float c() {
            return this.f6641a.b();
        }

        public final u1.a<T> d() {
            return this.f6641a;
        }

        public final boolean e(float f10) {
            return !this.f6641a.c();
        }

        public final boolean isEmpty() {
            return false;
        }
    }

    public a(List<? extends u1.a<K>> list) {
        c<K> cVar;
        c<K> cVar2;
        if (list.isEmpty()) {
            cVar = new b<>();
        } else {
            if (list.size() == 1) {
                cVar2 = new e<>(list);
            } else {
                cVar2 = new d<>(list);
            }
            cVar = cVar2;
        }
        this.f6633c = cVar;
    }

    public final void a(C0091a aVar) {
        this.f6631a.add(aVar);
    }

    public final u1.a<K> b() {
        u1.a<K> d10 = this.f6633c.d();
        androidx.databinding.a.n();
        return d10;
    }

    public float c() {
        if (this.f6637h == -1.0f) {
            this.f6637h = this.f6633c.a();
        }
        return this.f6637h;
    }

    public final float d() {
        u1.a b10 = b();
        if (b10.c()) {
            return 0.0f;
        }
        return b10.d.getInterpolation(e());
    }

    public final float e() {
        if (this.f6632b) {
            return 0.0f;
        }
        u1.a b10 = b();
        if (b10.c()) {
            return 0.0f;
        }
        return (this.d - b10.b()) / (b10.a() - b10.b());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r3 = r1.f9044f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public A f() {
        /*
            r4 = this;
            float r0 = r4.e()
            u1.c<A> r1 = r4.f6634e
            if (r1 != 0) goto L_0x0013
            k1.a$c<K> r1 = r4.f6633c
            boolean r1 = r1.b(r0)
            if (r1 == 0) goto L_0x0013
            A r0 = r4.f6635f
            return r0
        L_0x0013:
            u1.a r1 = r4.b()
            android.view.animation.Interpolator r2 = r1.f9043e
            if (r2 == 0) goto L_0x002c
            android.view.animation.Interpolator r3 = r1.f9044f
            if (r3 == 0) goto L_0x002c
            float r2 = r2.getInterpolation(r0)
            float r3 = r3.getInterpolation(r0)
            java.lang.Object r0 = r4.h(r1, r0, r2, r3)
            goto L_0x0034
        L_0x002c:
            float r0 = r4.d()
            java.lang.Object r0 = r4.g(r1, r0)
        L_0x0034:
            r4.f6635f = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.a.f():java.lang.Object");
    }

    public abstract A g(u1.a<K> aVar, float f10);

    public A h(u1.a<K> aVar, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void i() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f6631a;
            if (i10 < arrayList.size()) {
                ((C0091a) arrayList.get(i10)).b();
                i10++;
            } else {
                return;
            }
        }
    }

    public void j(float f10) {
        c<K> cVar = this.f6633c;
        if (!cVar.isEmpty()) {
            if (this.f6636g == -1.0f) {
                this.f6636g = cVar.c();
            }
            float f11 = this.f6636g;
            if (f10 < f11) {
                if (f11 == -1.0f) {
                    this.f6636g = cVar.c();
                }
                f10 = this.f6636g;
            } else if (f10 > c()) {
                f10 = c();
            }
            if (f10 != this.d) {
                this.d = f10;
                if (cVar.e(f10)) {
                    i();
                }
            }
        }
    }

    public final void k(u1.c<A> cVar) {
        u1.c<A> cVar2 = this.f6634e;
        if (cVar2 != null) {
            cVar2.getClass();
        }
        this.f6634e = cVar;
    }
}

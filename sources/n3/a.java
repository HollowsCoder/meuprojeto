package n3;

import android.util.Log;
import n3.d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0103a f7359a = new C0103a();

    /* renamed from: n3.a$a  reason: collision with other inner class name */
    public class C0103a implements e<Object> {
        public final void a(Object obj) {
        }
    }

    public interface b<T> {
        T a();
    }

    public static final class c<T> implements h0.c<T> {

        /* renamed from: a  reason: collision with root package name */
        public final b<T> f7360a;

        /* renamed from: b  reason: collision with root package name */
        public final e<T> f7361b;

        /* renamed from: c  reason: collision with root package name */
        public final h0.c<T> f7362c;

        public c(h0.e eVar, b bVar, e eVar2) {
            this.f7362c = eVar;
            this.f7360a = bVar;
            this.f7361b = eVar2;
        }

        public final boolean a(T t10) {
            if (t10 instanceof d) {
                ((d) t10).k().f7363a = true;
            }
            this.f7361b.a(t10);
            return this.f7362c.a(t10);
        }

        public final T b() {
            T b10 = this.f7362c.b();
            if (b10 == null) {
                b10 = this.f7360a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + b10.getClass());
                }
            }
            if (b10 instanceof d) {
                ((d) b10).k().f7363a = false;
            }
            return b10;
        }
    }

    public interface d {
        d.a k();
    }

    public interface e<T> {
        void a(T t10);
    }

    public static c a(int i10, b bVar) {
        return new c(new h0.e(i10), bVar, f7359a);
    }
}

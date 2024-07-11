package y9;

import androidx.emoji2.text.f;
import i9.x;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import y9.c;

public final class i extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f9694a;

    public static final class a<T> implements b<T> {

        /* renamed from: o  reason: collision with root package name */
        public final Executor f9695o;

        /* renamed from: p  reason: collision with root package name */
        public final b<T> f9696p;

        /* renamed from: y9.i$a$a  reason: collision with other inner class name */
        public class C0169a implements d<T> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ d f9697a;

            public C0169a(d dVar) {
                this.f9697a = dVar;
            }

            public final void a(b<T> bVar, Throwable th) {
                a.this.f9695o.execute(new f(this, this.f9697a, th, 3));
            }

            public final void b(b<T> bVar, b0<T> b0Var) {
                a.this.f9695o.execute(new h(this, this.f9697a, b0Var));
            }
        }

        public a(Executor executor, b<T> bVar) {
            this.f9695o = executor;
            this.f9696p = bVar;
        }

        public final x a() {
            return this.f9696p.a();
        }

        public final boolean b() {
            return this.f9696p.b();
        }

        public final void cancel() {
            this.f9696p.cancel();
        }

        public final b<T> clone() {
            return new a(this.f9695o, this.f9696p.clone());
        }

        public final void o(d<T> dVar) {
            this.f9696p.o(new C0169a(dVar));
        }
    }

    public i(Executor executor) {
        this.f9694a = executor;
    }

    public final c a(Type type, Annotation[] annotationArr) {
        Executor executor = null;
        if (h0.f(type) != b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type e10 = h0.e(0, (ParameterizedType) type);
            if (!h0.i(annotationArr, f0.class)) {
                executor = this.f9694a;
            }
            return new g(e10, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}

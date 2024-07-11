package y9;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import y9.c;

@IgnoreJRERequirement
public final class e extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public static final e f9675a = new e();

    @IgnoreJRERequirement
    public static final class a<R> implements c<R, CompletableFuture<R>> {

        /* renamed from: a  reason: collision with root package name */
        public final Type f9676a;

        @IgnoreJRERequirement
        /* renamed from: y9.e$a$a  reason: collision with other inner class name */
        public class C0168a implements d<R> {

            /* renamed from: a  reason: collision with root package name */
            public final CompletableFuture<R> f9677a;

            public C0168a(b bVar) {
                this.f9677a = bVar;
            }

            public final void a(b<R> bVar, Throwable th) {
                this.f9677a.completeExceptionally(th);
            }

            public final void b(b<R> bVar, b0<R> b0Var) {
                boolean c10 = b0Var.f9660a.c();
                CompletableFuture<R> completableFuture = this.f9677a;
                if (c10) {
                    completableFuture.complete(b0Var.f9661b);
                } else {
                    completableFuture.completeExceptionally(new j(b0Var));
                }
            }
        }

        public a(Type type) {
            this.f9676a = type;
        }

        public final Object a(t tVar) {
            b bVar = new b(tVar);
            tVar.o(new C0168a(bVar));
            return bVar;
        }

        public final Type b() {
            return this.f9676a;
        }
    }

    @IgnoreJRERequirement
    public static final class b<T> extends CompletableFuture<T> {

        /* renamed from: o  reason: collision with root package name */
        public final b<?> f9678o;

        public b(t tVar) {
            this.f9678o = tVar;
        }

        public final boolean cancel(boolean z) {
            if (z) {
                this.f9678o.cancel();
            }
            return super.cancel(z);
        }
    }

    @IgnoreJRERequirement
    public static final class c<R> implements c<R, CompletableFuture<b0<R>>> {

        /* renamed from: a  reason: collision with root package name */
        public final Type f9679a;

        @IgnoreJRERequirement
        public class a implements d<R> {

            /* renamed from: a  reason: collision with root package name */
            public final CompletableFuture<b0<R>> f9680a;

            public a(b bVar) {
                this.f9680a = bVar;
            }

            public final void a(b<R> bVar, Throwable th) {
                this.f9680a.completeExceptionally(th);
            }

            public final void b(b<R> bVar, b0<R> b0Var) {
                this.f9680a.complete(b0Var);
            }
        }

        public c(Type type) {
            this.f9679a = type;
        }

        public final Object a(t tVar) {
            b bVar = new b(tVar);
            tVar.o(new a(bVar));
            return bVar;
        }

        public final Type b() {
            return this.f9679a;
        }
    }

    public final c a(Type type, Annotation[] annotationArr) {
        if (h0.f(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type e10 = h0.e(0, (ParameterizedType) type);
            if (h0.f(e10) != b0.class) {
                return new a(e10);
            }
            if (e10 instanceof ParameterizedType) {
                return new c(h0.e(0, (ParameterizedType) e10));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}

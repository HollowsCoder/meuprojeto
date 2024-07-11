package y9;

import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import y9.i;

public final class g implements c<Object, b<?>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Type f9681a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Executor f9682b;

    public g(Type type, Executor executor) {
        this.f9681a = type;
        this.f9682b = executor;
    }

    public final Object a(t tVar) {
        Executor executor = this.f9682b;
        return executor == null ? tVar : new i.a(executor, tVar);
    }

    public final Type b() {
        return this.f9681a;
    }
}

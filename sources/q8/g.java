package q8;

import java.io.Serializable;
import q8.f;
import y8.p;

public final class g implements f, Serializable {

    /* renamed from: o  reason: collision with root package name */
    public static final g f8275o = new g();

    public final <R> R fold(R r5, p<? super R, ? super f.b, ? extends R> pVar) {
        return r5;
    }

    public final <E extends f.b> E get(f.c<E> cVar) {
        z8.g.f(cVar, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final f minusKey(f.c<?> cVar) {
        z8.g.f(cVar, "key");
        return this;
    }

    public final f plus(f fVar) {
        z8.g.f(fVar, "context");
        return fVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}

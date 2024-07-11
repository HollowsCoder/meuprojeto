package s8;

import q8.d;
import q8.f;

public abstract class g extends a {
    public g(d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.b() == q8.g.f8275o)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    public final f b() {
        return q8.g.f8275o;
    }
}

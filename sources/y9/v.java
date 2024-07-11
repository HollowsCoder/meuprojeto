package y9;

public final class v extends x<Iterable<Object>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f9732a;

    public v(x xVar) {
        this.f9732a = xVar;
    }

    public final void a(z zVar, Object obj) {
        Iterable<Object> iterable = (Iterable) obj;
        if (iterable != null) {
            for (Object a10 : iterable) {
                this.f9732a.a(zVar, a10);
            }
        }
    }
}

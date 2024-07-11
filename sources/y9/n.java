package y9;

import n8.i;
import y8.l;
import z8.h;

public final class n extends h implements l<Throwable, i> {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ b f9706p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(b bVar) {
        super(1);
        this.f9706p = bVar;
    }

    public final Object k(Object obj) {
        Throwable th = (Throwable) obj;
        this.f9706p.cancel();
        return i.f7501a;
    }
}

package j4;

import java.util.concurrent.Callable;

public final class x extends v {

    /* renamed from: e  reason: collision with root package name */
    public final Callable<String> f6572e;

    public x(o oVar) {
        super(false, (String) null, (Exception) null);
        this.f6572e = oVar;
    }

    public final String a() {
        try {
            return this.f6572e.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}

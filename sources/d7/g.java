package d7;

import java.util.concurrent.Callable;
import m5.a;
import m5.i;

public final class g implements a<Void, Object> {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Callable f4227o;

    public g(Callable callable) {
        this.f4227o = callable;
    }

    public final Object c(i<Void> iVar) {
        return this.f4227o.call();
    }
}

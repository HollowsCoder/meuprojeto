package p9;

import java.io.IOException;
import l9.a;

public final class o extends a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f f8048e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(String str, f fVar) {
        super(str, true);
        this.f8048e = fVar;
    }

    public final long a() {
        f fVar = this.f8048e;
        fVar.getClass();
        try {
            fVar.M.f(2, 0, false);
            return -1;
        } catch (IOException e10) {
            fVar.b(e10);
            return -1;
        }
    }
}

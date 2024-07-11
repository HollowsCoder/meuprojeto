package g9;

import java.util.concurrent.CancellationException;
import q8.f;

public interface l0 extends f.b {

    public static final class a {
        public static /* synthetic */ a0 a(l0 l0Var, boolean z, p0 p0Var, int i10) {
            boolean z10 = false;
            if ((i10 & 1) != 0) {
                z = false;
            }
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            return l0Var.f(z, z10, p0Var);
        }
    }

    public static final class b implements f.c<l0> {

        /* renamed from: o  reason: collision with root package name */
        public static final /* synthetic */ b f5025o = new b();
    }

    boolean a();

    a0 f(boolean z, boolean z10, p0 p0Var);

    i j(q0 q0Var);

    CancellationException o();

    void s(CancellationException cancellationException);

    boolean start();
}

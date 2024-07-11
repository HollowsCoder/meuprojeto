package d7;

import java.util.concurrent.Callable;
import m5.i;
import m5.j;

public final class o0 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Callable f4258o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ j f4259p;

    public class a implements m5.a<Object, Void> {
        public a() {
        }

        public final Object c(i iVar) {
            boolean m10 = iVar.m();
            o0 o0Var = o0.this;
            if (m10) {
                o0Var.f4259p.a(iVar.i());
                return null;
            }
            j jVar = o0Var.f4259p;
            jVar.f7089a.r(iVar.h());
            return null;
        }
    }

    public o0(v vVar, j jVar) {
        this.f4258o = vVar;
        this.f4259p = jVar;
    }

    public final void run() {
        try {
            ((i) this.f4258o.call()).f(new a());
        } catch (Exception e10) {
            this.f4259p.f7089a.r(e10);
        }
    }
}

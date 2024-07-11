package d7;

import java.util.concurrent.Callable;

public final class r implements Callable<Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f4266a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f4267b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ t f4268c;

    public r(t tVar, long j8, String str) {
        this.f4268c = tVar;
        this.f4266a = j8;
        this.f4267b = str;
    }

    public final Object call() {
        boolean z;
        t tVar = this.f4268c;
        b0 b0Var = tVar.l;
        if (b0Var == null || !b0Var.f4206e.get()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        tVar.f4277h.f4496b.c(this.f4267b, this.f4266a);
        return null;
    }
}

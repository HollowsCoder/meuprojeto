package k9;

import k9.e;
import n8.i;
import w9.b0;
import w9.l;

public final class f extends l {

    /* renamed from: p  reason: collision with root package name */
    public boolean f6763p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ e.b f6764q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ b0 f6765r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(e.b bVar, b0 b0Var, b0 b0Var2) {
        super(b0Var2);
        this.f6764q = bVar;
        this.f6765r = b0Var;
    }

    public final void close() {
        super.close();
        if (!this.f6763p) {
            this.f6763p = true;
            synchronized (this.f6764q.f6758j) {
                e.b bVar = this.f6764q;
                int i10 = bVar.f6755g - 1;
                bVar.f6755g = i10;
                if (i10 == 0 && bVar.f6753e) {
                    bVar.f6758j.r(bVar);
                }
                i iVar = i.f7501a;
            }
        }
    }
}

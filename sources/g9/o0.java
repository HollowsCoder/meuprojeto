package g9;

public class o0 extends q0 {

    /* renamed from: p  reason: collision with root package name */
    public final boolean f5035p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o0(l0 l0Var) {
        super(true);
        j jVar;
        j jVar2;
        boolean z = true;
        F(l0Var);
        i B = B();
        if (B instanceof j) {
            jVar = (j) B;
        } else {
            jVar = null;
        }
        if (jVar != null) {
            while (true) {
                q0 r5 = jVar.r();
                if (!r5.y()) {
                    i B2 = r5.B();
                    if (B2 instanceof j) {
                        jVar2 = (j) B2;
                        continue;
                    } else {
                        jVar2 = null;
                        continue;
                    }
                    if (jVar == null) {
                        break;
                    }
                } else {
                    break;
                }
            }
        } else {
            z = false;
        }
        this.f5035p = z;
    }

    public final boolean y() {
        return this.f5035p;
    }

    public final boolean z() {
        return true;
    }
}

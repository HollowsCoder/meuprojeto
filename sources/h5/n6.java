package h5;

import android.os.SystemClock;

public final class n6 extends j {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ o6 f5597e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n6(o6 o6Var, i4 i4Var) {
        super(i4Var);
        this.f5597e = o6Var;
    }

    public final void a() {
        o6 o6Var = this.f5597e;
        o6Var.d.g();
        q6 q6Var = o6Var.d;
        q6Var.f5649o.B.getClass();
        o6Var.a(false, false, SystemClock.elapsedRealtime());
        i4 i4Var = q6Var.f5649o;
        u1 g10 = i4Var.g();
        i4Var.B.getClass();
        g10.j(SystemClock.elapsedRealtime());
    }
}

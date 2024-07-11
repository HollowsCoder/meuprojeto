package h5;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.ha;

public final class o6 {

    /* renamed from: a  reason: collision with root package name */
    public long f5613a;

    /* renamed from: b  reason: collision with root package name */
    public long f5614b;

    /* renamed from: c  reason: collision with root package name */
    public final n6 f5615c;
    public final /* synthetic */ q6 d;

    public o6(q6 q6Var) {
        this.d = q6Var;
        this.f5615c = new n6(this, q6Var.f5649o);
        q6Var.f5649o.B.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f5613a = elapsedRealtime;
        this.f5614b = elapsedRealtime;
    }

    public final boolean a(boolean z, boolean z10, long j8) {
        q6 q6Var = this.d;
        q6Var.g();
        q6Var.h();
        ha.f2735p.f2736o.zza().zza();
        i4 i4Var = q6Var.f5649o;
        if (!i4Var.u.m((String) null, u2.f5730m0) || i4Var.i()) {
            u3 u3Var = i4Var.f5458v;
            i4.l(u3Var);
            i4Var.B.getClass();
            u3Var.C.b(System.currentTimeMillis());
        }
        long j10 = j8 - this.f5613a;
        if (z || j10 >= 1000) {
            if (!z10) {
                j10 = j8 - this.f5614b;
                this.f5614b = j8;
            }
            g3 g3Var = i4Var.w;
            i4.n(g3Var);
            g3Var.B.b(Long.valueOf(j10), "Recording user engagement, ms");
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j10);
            boolean q10 = i4Var.u.q();
            u5 u5Var = i4Var.C;
            i4.m(u5Var);
            u5.q(u5Var.o(!q10), bundle, true);
            e eVar = i4Var.u;
            s2<Boolean> s2Var = u2.T;
            if (!eVar.m((String) null, s2Var) && z10) {
                bundle.putLong("_fr", 1);
            }
            if (!i4Var.u.m((String) null, s2Var) || !z10) {
                i5 i5Var = i4Var.D;
                i4.m(i5Var);
                i5Var.x("auto", "_e", bundle);
            }
            this.f5613a = j8;
            n6 n6Var = this.f5615c;
            n6Var.c();
            n6Var.b(3600000);
            return true;
        }
        g3 g3Var2 = i4Var.w;
        i4.n(g3Var2);
        g3Var2.B.b(Long.valueOf(j10), "Screen exposed for less than 1000 ms. Event not sent. time");
        return false;
    }
}

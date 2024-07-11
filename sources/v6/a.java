package v6;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.d1;
import com.google.android.gms.internal.measurement.f1;
import com.google.android.gms.internal.measurement.g1;
import com.google.android.gms.internal.measurement.j0;
import com.google.android.gms.internal.measurement.l1;
import com.google.android.gms.internal.measurement.u1;
import com.google.android.gms.internal.measurement.y0;
import com.google.android.gms.internal.measurement.z0;
import h5.j5;
import java.util.List;
import java.util.Map;
import java.util.Random;

public final class a implements j5 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u1 f9144a;

    public a(u1 u1Var) {
        this.f9144a = u1Var;
    }

    public final void a(String str) {
        u1 u1Var = this.f9144a;
        u1Var.getClass();
        u1Var.c(new d1(u1Var, str, 0));
    }

    public final void b(String str, String str2, Bundle bundle) {
        u1 u1Var = this.f9144a;
        u1Var.getClass();
        u1Var.c(new z0(u1Var, str, str2, bundle));
    }

    public final List<Bundle> c(String str, String str2) {
        return this.f9144a.f(str, str2);
    }

    public final long d() {
        u1 u1Var = this.f9144a;
        u1Var.getClass();
        j0 j0Var = new j0();
        u1Var.c(new y0(u1Var, j0Var, 2));
        Long l = (Long) j0.L(j0Var.K(500), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i10 = u1Var.d + 1;
        u1Var.d = i10;
        return nextLong + ((long) i10);
    }

    public final void e(Bundle bundle) {
        u1 u1Var = this.f9144a;
        u1Var.getClass();
        u1Var.c(new y0(u1Var, bundle, 0));
    }

    public final String f() {
        u1 u1Var = this.f9144a;
        u1Var.getClass();
        j0 j0Var = new j0();
        u1Var.c(new g1(u1Var, j0Var, 1));
        return j0Var.J(500);
    }

    public final String g() {
        u1 u1Var = this.f9144a;
        u1Var.getClass();
        j0 j0Var = new j0();
        u1Var.c(new g1(u1Var, j0Var, 0));
        return j0Var.J(50);
    }

    public final int h(String str) {
        return this.f9144a.b(str);
    }

    public final Map<String, Object> i(String str, String str2, boolean z) {
        return this.f9144a.a(str, str2, z);
    }

    public final String j() {
        u1 u1Var = this.f9144a;
        u1Var.getClass();
        j0 j0Var = new j0();
        u1Var.c(new f1(u1Var, j0Var, 1));
        return j0Var.J(500);
    }

    public final void k(String str, String str2, Bundle bundle) {
        u1 u1Var = this.f9144a;
        u1Var.getClass();
        u1Var.c(new l1(u1Var, str, str2, bundle));
    }

    public final void l(String str) {
        u1 u1Var = this.f9144a;
        u1Var.getClass();
        u1Var.c(new y0(u1Var, str, 1));
    }

    public final String p() {
        u1 u1Var = this.f9144a;
        u1Var.getClass();
        j0 j0Var = new j0();
        u1Var.c(new f1(u1Var, j0Var, 0));
        return j0Var.J(500);
    }
}

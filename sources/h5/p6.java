package h5;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.v9;

public final class p6 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q6 f5639a;

    public p6(q6 q6Var) {
        this.f5639a = q6Var;
    }

    public final void a() {
        q6 q6Var = this.f5639a;
        q6Var.g();
        i4 i4Var = q6Var.f5649o;
        u3 u3Var = i4Var.f5458v;
        i4.l(u3Var);
        i4Var.B.getClass();
        if (u3Var.r(System.currentTimeMillis())) {
            u3 u3Var2 = i4Var.f5458v;
            i4.l(u3Var2);
            u3Var2.z.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                g3 g3Var = i4Var.w;
                i4.n(g3Var);
                g3Var.B.a("Detected application was in foreground");
                i4Var.B.getClass();
                c(false, System.currentTimeMillis());
            }
        }
    }

    public final void b(boolean z, long j8) {
        q6 q6Var = this.f5639a;
        q6Var.g();
        q6Var.k();
        i4 i4Var = q6Var.f5649o;
        u3 u3Var = i4Var.f5458v;
        i4.l(u3Var);
        if (u3Var.r(j8)) {
            u3 u3Var2 = i4Var.f5458v;
            i4.l(u3Var2);
            u3Var2.z.b(true);
        }
        u3 u3Var3 = i4Var.f5458v;
        i4.l(u3Var3);
        u3Var3.C.b(j8);
        u3 u3Var4 = i4Var.f5458v;
        i4.l(u3Var4);
        if (u3Var4.z.a()) {
            c(z, j8);
        }
    }

    public final void c(boolean z, long j8) {
        q6 q6Var = this.f5639a;
        q6Var.g();
        i4 i4Var = q6Var.f5649o;
        if (i4Var.i()) {
            u3 u3Var = i4Var.f5458v;
            i4.l(u3Var);
            u3Var.C.b(j8);
            i4Var.B.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            g3 g3Var = i4Var.w;
            i4.n(g3Var);
            g3Var.B.b(Long.valueOf(elapsedRealtime), "Session started, time");
            Long valueOf = Long.valueOf(j8 / 1000);
            i5 i5Var = i4Var.D;
            i4.m(i5Var);
            i5Var.k(j8, valueOf, "auto", "_sid");
            u3 u3Var2 = i4Var.f5458v;
            i4.l(u3Var2);
            u3Var2.z.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (i4Var.u.m((String) null, u2.f5719g0) && z) {
                bundle.putLong("_aib", 1);
            }
            i5 i5Var2 = i4Var.D;
            i4.m(i5Var2);
            i5Var2.y(j8, bundle, "auto", "_s");
            v9.f2962p.f2963o.zza().zza();
            if (i4Var.u.m((String) null, u2.f5728l0)) {
                u3 u3Var3 = i4Var.f5458v;
                i4.l(u3Var3);
                String a10 = u3Var3.H.a();
                if (!TextUtils.isEmpty(a10)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", a10);
                    i5 i5Var3 = i4Var.D;
                    i4.m(i5Var3);
                    i5Var3.y(j8, bundle2, "auto", "_ssr");
                }
            }
        }
    }
}

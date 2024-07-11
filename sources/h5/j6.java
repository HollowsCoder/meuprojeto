package h5;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.w0;
import java.util.List;
import n4.m;

public final class j6 implements f7 {

    /* renamed from: o  reason: collision with root package name */
    public final Object f5493o;

    public /* synthetic */ j6(Context context) {
        m.h(context);
        this.f5493o = context;
    }

    public /* synthetic */ j6(q4 q4Var) {
        this.f5493o = q4Var;
    }

    public final void a(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            ((i5) this.f5493o).x("auto", "_err", bundle);
            return;
        }
        throw new IllegalStateException("Unexpected call on client side");
    }

    public final void b(int i10, String str, List list, boolean z, boolean z10) {
        e3 e3Var;
        int i11 = i10 - 1;
        Object obj = this.f5493o;
        if (i11 == 0) {
            g3 g3Var = ((c4) obj).f5649o.w;
            i4.n(g3Var);
            e3Var = g3Var.A;
        } else if (i11 == 1) {
            i4 i4Var = ((c4) obj).f5649o;
            if (z) {
                g3 g3Var2 = i4Var.w;
                i4.n(g3Var2);
                e3Var = g3Var2.u;
            } else if (!z10) {
                g3 g3Var3 = i4Var.w;
                i4.n(g3Var3);
                e3Var = g3Var3.f5398v;
            } else {
                g3 g3Var4 = i4Var.w;
                i4.n(g3Var4);
                e3Var = g3Var4.f5397t;
            }
        } else if (i11 == 3) {
            g3 g3Var5 = ((c4) obj).f5649o.w;
            i4.n(g3Var5);
            e3Var = g3Var5.B;
        } else if (i11 != 4) {
            g3 g3Var6 = ((c4) obj).f5649o.w;
            i4.n(g3Var6);
            e3Var = g3Var6.z;
        } else {
            i4 i4Var2 = ((c4) obj).f5649o;
            if (z) {
                g3 g3Var7 = i4Var2.w;
                i4.n(g3Var7);
                e3Var = g3Var7.f5399x;
            } else if (!z10) {
                g3 g3Var8 = i4Var2.w;
                i4.n(g3Var8);
                e3Var = g3Var8.f5400y;
            } else {
                g3 g3Var9 = i4Var2.w;
                i4.n(g3Var9);
                e3Var = g3Var9.w;
            }
        }
        int size = list.size();
        if (size == 1) {
            e3Var.b(list.get(0), str);
        } else if (size == 2) {
            e3Var.c(list.get(0), list.get(1), str);
        } else if (size != 3) {
            e3Var.a(str);
        } else {
            e3Var.d(str, list.get(0), list.get(1), list.get(2));
        }
    }

    public final void c() {
        g3 g3Var = i4.h((Context) this.f5493o, (w0) null, (Long) null).w;
        i4.n(g3Var);
        g3Var.B.a("Local AppMeasurementService is starting up");
    }

    public final void d() {
        g3 g3Var = i4.h((Context) this.f5493o, (w0) null, (Long) null).w;
        i4.n(g3Var);
        g3Var.B.a("Local AppMeasurementService is shutting down");
    }

    public final void e(Intent intent) {
        if (intent == null) {
            g().f5397t.a("onUnbind called with null intent");
            return;
        }
        g().B.b(intent.getAction(), "onUnbind called for intent. action");
    }

    public final void f(Intent intent) {
        if (intent == null) {
            g().f5397t.a("onRebind called with null intent");
            return;
        }
        g().B.b(intent.getAction(), "onRebind called. action");
    }

    public final g3 g() {
        g3 g3Var = i4.h((Context) this.f5493o, (w0) null, (Long) null).w;
        i4.n(g3Var);
        return g3Var;
    }
}

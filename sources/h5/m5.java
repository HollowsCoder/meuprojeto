package h5;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.q0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import j4.f;
import n4.m;
import r4.d;

public final class m5 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f5576o = 0;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ String f5577p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Object f5578q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Parcelable f5579r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Object f5580s;

    public m5(AppMeasurementDynamiteService appMeasurementDynamiteService, q0 q0Var, p pVar, String str) {
        this.f5580s = appMeasurementDynamiteService;
        this.f5578q = q0Var;
        this.f5579r = pVar;
        this.f5577p = str;
    }

    public final void run() {
        int i10 = this.f5576o;
        String str = this.f5577p;
        Parcelable parcelable = this.f5579r;
        Object obj = this.f5578q;
        Object obj2 = this.f5580s;
        switch (i10) {
            case 0:
                f6 r5 = ((AppMeasurementDynamiteService) obj2).f3203a.r();
                q0 q0Var = (q0) obj;
                p pVar = (p) parcelable;
                r5.g();
                r5.h();
                i4 i4Var = r5.f5649o;
                g7 g7Var = i4Var.z;
                i4.l(g7Var);
                g7Var.getClass();
                if (f.f6547b.b(g7Var.f5649o.f5452o, 12451000) != 0) {
                    g3 g3Var = i4Var.w;
                    i4.n(g3Var);
                    g3Var.w.a("Not bundling data. Service unavailable or out of date");
                    g7 g7Var2 = i4Var.z;
                    i4.l(g7Var2);
                    g7Var2.L(q0Var, new byte[0]);
                    return;
                }
                r5.q(new z5(r5, pVar, str, q0Var));
                return;
            default:
                w6 w6Var = (w6) obj2;
                z6 z6Var = w6Var.f5799o;
                ((d) z6Var.c()).getClass();
                p D = w6Var.f5799o.J().D(this.f5577p, (String) obj, (Bundle) parcelable, "auto", System.currentTimeMillis(), false);
                m.h(D);
                z6Var.O(D, str);
                return;
        }
    }

    public m5(w6 w6Var, String str, Bundle bundle) {
        this.f5580s = w6Var;
        this.f5577p = str;
        this.f5578q = "_err";
        this.f5579r = bundle;
    }
}

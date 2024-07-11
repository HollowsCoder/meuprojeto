package h5;

import android.content.ComponentName;
import android.content.Context;

public final class r5 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f5672o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f5673p;

    public /* synthetic */ r5(int i10, Object obj) {
        this.f5672o = i10;
        this.f5673p = obj;
    }

    public final void run() {
        int i10 = this.f5672o;
        Object obj = this.f5673p;
        switch (i10) {
            case 0:
                u5 u5Var = (u5) obj;
                u5Var.f5769s = u5Var.f5772x;
                return;
            case 1:
                ((u5) obj).f5772x = null;
                return;
            default:
                e6 e6Var = (e6) obj;
                f6 f6Var = e6Var.f5361c;
                Context context = f6Var.f5649o.f5452o;
                e6Var.f5361c.f5649o.getClass();
                f6.o(f6Var, new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"));
                return;
        }
    }
}

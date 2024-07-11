package h5;

import com.google.android.gms.internal.measurement.q0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.concurrent.atomic.AtomicReference;

public final class b5 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f5291o = 1;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ String f5292p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ String f5293q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f5294r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Object f5295s;

    public b5(AppMeasurementDynamiteService appMeasurementDynamiteService, q0 q0Var, String str, String str2) {
        this.f5295s = appMeasurementDynamiteService;
        this.f5294r = q0Var;
        this.f5292p = str;
        this.f5293q = str2;
    }

    public final void run() {
        int i10 = this.f5291o;
        Object obj = this.f5294r;
        Object obj2 = this.f5295s;
        switch (i10) {
            case 0:
                f6 r5 = ((i5) obj2).f5649o.r();
                String str = this.f5292p;
                String str2 = this.f5293q;
                r5.g();
                r5.h();
                r5.q(new c6(r5, (AtomicReference) obj, str, str2, r5.s(false)));
                return;
            default:
                f6 r10 = ((AppMeasurementDynamiteService) obj2).f3203a.r();
                String str3 = this.f5292p;
                String str4 = this.f5293q;
                r10.g();
                r10.h();
                f6 f6Var = r10;
                r10.q(new d6(f6Var, str3, str4, r10.s(false), (q0) obj));
                return;
        }
    }

    public b5(i5 i5Var, AtomicReference atomicReference, String str, String str2) {
        this.f5295s = i5Var;
        this.f5294r = atomicReference;
        this.f5292p = str;
        this.f5293q = str2;
    }
}

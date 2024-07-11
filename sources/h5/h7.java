package h5;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.t0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

public final class h7 implements t4 {

    /* renamed from: a  reason: collision with root package name */
    public final t0 f5441a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f5442b;

    public h7(AppMeasurementDynamiteService appMeasurementDynamiteService, t0 t0Var) {
        this.f5442b = appMeasurementDynamiteService;
        this.f5441a = t0Var;
    }

    public final void a(long j8, Bundle bundle, String str, String str2) {
        try {
            this.f5441a.e(j8, bundle, str, str2);
        } catch (RemoteException e10) {
            i4 i4Var = this.f5442b.f3203a;
            if (i4Var != null) {
                g3 g3Var = i4Var.w;
                i4.n(g3Var);
                g3Var.w.b(e10, "Event listener threw exception");
            }
        }
    }
}

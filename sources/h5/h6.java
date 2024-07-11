package h5;

import android.content.Context;
import android.content.Intent;

public final /* synthetic */ class h6 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final j6 f5437o;

    /* renamed from: p  reason: collision with root package name */
    public final int f5438p;

    /* renamed from: q  reason: collision with root package name */
    public final g3 f5439q;

    /* renamed from: r  reason: collision with root package name */
    public final Intent f5440r;

    public h6(j6 j6Var, int i10, g3 g3Var, Intent intent) {
        this.f5437o = j6Var;
        this.f5438p = i10;
        this.f5439q = g3Var;
        this.f5440r = intent;
    }

    public final void run() {
        j6 j6Var = this.f5437o;
        i6 i6Var = (i6) ((Context) j6Var.f5493o);
        int i10 = this.f5438p;
        if (i6Var.d(i10)) {
            this.f5439q.B.b(Integer.valueOf(i10), "Local AppMeasurementService processed last upload request. StartId");
            j6Var.g().B.a("Completed wakeful intent.");
            i6Var.a(this.f5440r);
        }
    }
}

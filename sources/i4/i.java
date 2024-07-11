package i4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.q0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import h5.f6;
import h5.i5;
import h5.v5;
import java.util.concurrent.atomic.AtomicReference;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f6078o = 2;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ boolean f6079p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Object f6080q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f6081r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Object f6082s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Object f6083t;

    public i(AppMeasurementDynamiteService appMeasurementDynamiteService, q0 q0Var, String str, String str2, boolean z) {
        this.f6083t = appMeasurementDynamiteService;
        this.f6080q = q0Var;
        this.f6081r = str;
        this.f6082s = str2;
        this.f6079p = z;
    }

    public final void run() {
        Intent intent;
        int i10;
        int i11 = this.f6078o;
        Object obj = this.f6083t;
        Object obj2 = this.f6082s;
        Object obj3 = this.f6081r;
        Object obj4 = this.f6080q;
        switch (i11) {
            case 0:
                b bVar = (b) obj4;
                Intent intent2 = (Intent) obj3;
                Context context = (Context) obj2;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) obj;
                bVar.getClass();
                try {
                    Parcelable parcelableExtra = intent2.getParcelableExtra("wrapped_intent");
                    if (parcelableExtra instanceof Intent) {
                        intent = (Intent) parcelableExtra;
                    } else {
                        intent = null;
                    }
                    if (intent != null) {
                        i10 = bVar.d(context, intent);
                    } else {
                        i10 = bVar.c(context, intent2);
                    }
                    if (this.f6079p) {
                        pendingResult.setResultCode(i10);
                    }
                    return;
                } finally {
                    pendingResult.finish();
                }
            case 1:
                f6 r5 = ((i5) obj).f5649o.r();
                boolean z = this.f6079p;
                r5.g();
                r5.h();
                r5.q(new v5(r5, (AtomicReference) obj4, (String) obj3, (String) obj2, r5.s(false), z));
                return;
            default:
                f6 r10 = ((AppMeasurementDynamiteService) obj).f3203a.r();
                boolean z10 = this.f6079p;
                r10.g();
                r10.h();
                f6 f6Var = r10;
                r10.q(new v5(f6Var, (String) obj3, (String) obj2, r10.s(false), z10, (q0) obj4));
                return;
        }
    }

    public i(i5 i5Var, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.f6083t = i5Var;
        this.f6080q = atomicReference;
        this.f6081r = str;
        this.f6082s = str2;
        this.f6079p = z;
    }

    public /* synthetic */ i(b bVar, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.f6080q = bVar;
        this.f6081r = intent;
        this.f6082s = context;
        this.f6079p = z;
        this.f6083t = pendingResult;
    }
}

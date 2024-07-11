package h5;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.w0;
import n4.m;

public final class u4 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f5758a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5759b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5760c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final Boolean f5761e;

    /* renamed from: f  reason: collision with root package name */
    public final long f5762f;

    /* renamed from: g  reason: collision with root package name */
    public final w0 f5763g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f5764h = true;

    /* renamed from: i  reason: collision with root package name */
    public final Long f5765i;

    /* renamed from: j  reason: collision with root package name */
    public final String f5766j;

    public u4(Context context, w0 w0Var, Long l) {
        m.h(context);
        Context applicationContext = context.getApplicationContext();
        m.h(applicationContext);
        this.f5758a = applicationContext;
        this.f5765i = l;
        if (w0Var != null) {
            this.f5763g = w0Var;
            this.f5759b = w0Var.f2974t;
            this.f5760c = w0Var.f2973s;
            this.d = w0Var.f2972r;
            this.f5764h = w0Var.f2971q;
            this.f5762f = w0Var.f2970p;
            this.f5766j = w0Var.f2975v;
            Bundle bundle = w0Var.u;
            if (bundle != null) {
                this.f5761e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}

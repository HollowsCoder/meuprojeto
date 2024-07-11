package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import h5.d4;
import n4.m;
import u4.b;

public final class c1 extends n1 {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Context f2651s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Bundle f2652t;
    public final /* synthetic */ u1 u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c1(u1 u1Var, Context context, Bundle bundle) {
        super(u1Var, true);
        this.u = u1Var;
        this.f2651s = context;
        this.f2652t = bundle;
    }

    public final void a() {
        n0 n0Var;
        boolean z;
        try {
            m.h(this.f2651s);
            u1 u1Var = this.u;
            Context context = this.f2651s;
            u1Var.getClass();
            try {
                n0Var = m0.asInterface(DynamiteModule.c(context, DynamiteModule.f2349k, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
            } catch (DynamiteModule.a e10) {
                u1Var.d(e10, true, false);
                n0Var = null;
            }
            u1Var.f2949f = n0Var;
            if (this.u.f2949f == null) {
                this.u.getClass();
                Log.w("FA", "Failed to connect to measurement client.");
                return;
            }
            int a10 = DynamiteModule.a(this.f2651s, ModuleDescriptor.MODULE_ID);
            int d = DynamiteModule.d(this.f2651s, ModuleDescriptor.MODULE_ID, false);
            int max = Math.max(a10, d);
            if (d < a10) {
                z = true;
            } else {
                z = false;
            }
            w0 w0Var = new w0(42004, (long) max, z, (String) null, (String) null, (String) null, this.f2652t, d4.a(this.f2651s));
            n0 n0Var2 = this.u.f2949f;
            m.h(n0Var2);
            n0Var2.initialize(new b(this.f2651s), w0Var, this.f2839o);
        } catch (Exception e11) {
            this.u.d(e11, true, false);
        }
    }
}

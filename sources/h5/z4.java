package h5;

import android.os.Bundle;

public final class z4 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ String f5837o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ String f5838p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ long f5839q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Bundle f5840r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ boolean f5841s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ boolean f5842t;
    public final /* synthetic */ boolean u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f5843v = null;
    public final /* synthetic */ i5 w;

    public z4(i5 i5Var, String str, String str2, long j8, Bundle bundle, boolean z, boolean z10, boolean z11) {
        this.w = i5Var;
        this.f5837o = str;
        this.f5838p = str2;
        this.f5839q = j8;
        this.f5840r = bundle;
        this.f5841s = z;
        this.f5842t = z10;
        this.u = z11;
    }

    public final void run() {
        this.w.z(this.f5837o, this.f5838p, this.f5839q, this.f5840r, this.f5841s, this.f5842t, this.u, this.f5843v);
    }
}

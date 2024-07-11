package h5;

import android.os.Bundle;

public final class q5 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ p5 f5650o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ p5 f5651p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ long f5652q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ boolean f5653r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ u5 f5654s;

    public q5(u5 u5Var, p5 p5Var, p5 p5Var2, long j8, boolean z) {
        this.f5654s = u5Var;
        this.f5650o = p5Var;
        this.f5651p = p5Var2;
        this.f5652q = j8;
        this.f5653r = z;
    }

    public final void run() {
        this.f5654s.l(this.f5650o, this.f5651p, this.f5652q, this.f5653r, (Bundle) null);
    }
}

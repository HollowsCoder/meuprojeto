package h5;

import android.content.SharedPreferences;
import n4.m;

public final class r3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f5667a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5668b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5669c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ u3 f5670e;

    public /* synthetic */ r3(u3 u3Var, long j8) {
        this.f5670e = u3Var;
        m.e("health_monitor");
        m.b(j8 > 0);
        this.f5667a = "health_monitor:start";
        this.f5668b = "health_monitor:count";
        this.f5669c = "health_monitor:value";
        this.d = j8;
    }

    public final void a() {
        u3 u3Var = this.f5670e;
        u3Var.g();
        u3Var.f5649o.B.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = u3Var.l().edit();
        edit.remove(this.f5668b);
        edit.remove(this.f5669c);
        edit.putLong(this.f5667a, currentTimeMillis);
        edit.apply();
    }
}

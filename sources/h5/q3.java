package h5;

import android.content.SharedPreferences;
import n4.m;

public final class q3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f5645a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5646b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5647c;
    public long d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ u3 f5648e;

    public q3(u3 u3Var, String str, long j8) {
        this.f5648e = u3Var;
        m.e(str);
        this.f5645a = str;
        this.f5646b = j8;
    }

    public final long a() {
        if (!this.f5647c) {
            this.f5647c = true;
            this.d = this.f5648e.l().getLong(this.f5645a, this.f5646b);
        }
        return this.d;
    }

    public final void b(long j8) {
        SharedPreferences.Editor edit = this.f5648e.l().edit();
        edit.putLong(this.f5645a, j8);
        edit.apply();
        this.d = j8;
    }
}

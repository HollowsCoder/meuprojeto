package h5;

import android.content.SharedPreferences;
import n4.m;

public final class o3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f5603a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5604b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5605c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ u3 f5606e;

    public o3(u3 u3Var, String str, boolean z) {
        this.f5606e = u3Var;
        m.e(str);
        this.f5603a = str;
        this.f5604b = z;
    }

    public final boolean a() {
        if (!this.f5605c) {
            this.f5605c = true;
            this.d = this.f5606e.l().getBoolean(this.f5603a, this.f5604b);
        }
        return this.d;
    }

    public final void b(boolean z) {
        SharedPreferences.Editor edit = this.f5606e.l().edit();
        edit.putBoolean(this.f5603a, z);
        edit.apply();
        this.d = z;
    }
}

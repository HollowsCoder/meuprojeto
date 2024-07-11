package h5;

import android.content.SharedPreferences;
import n4.m;

public final class t3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f5695a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5696b;

    /* renamed from: c  reason: collision with root package name */
    public String f5697c;
    public final /* synthetic */ u3 d;

    public t3(u3 u3Var, String str) {
        this.d = u3Var;
        m.e(str);
        this.f5695a = str;
    }

    public final String a() {
        if (!this.f5696b) {
            this.f5696b = true;
            this.f5697c = this.d.l().getString(this.f5695a, (String) null);
        }
        return this.f5697c;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.d.l().edit();
        edit.putString(this.f5695a, str);
        edit.apply();
        this.f5697c = str;
    }
}

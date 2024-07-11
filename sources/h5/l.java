package h5;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import n4.m;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final String f5518a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5519b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5520c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f5521e;

    /* renamed from: f  reason: collision with root package name */
    public final n f5522f;

    public l(i4 i4Var, String str, String str2, String str3, long j8, long j10, n nVar) {
        m.e(str2);
        m.e(str3);
        m.h(nVar);
        this.f5518a = str2;
        this.f5519b = str3;
        this.f5520c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j8;
        this.f5521e = j10;
        if (j10 != 0 && j10 > j8) {
            g3 g3Var = i4Var.w;
            i4.n(g3Var);
            g3Var.w.c(g3.p(str2), g3.p(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.f5522f = nVar;
    }

    public final l a(i4 i4Var, long j8) {
        return new l(i4Var, this.f5520c, this.f5518a, this.f5519b, this.d, j8, this.f5522f);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f5522f);
        String str = this.f5518a;
        int length = String.valueOf(str).length();
        String str2 = this.f5519b;
        StringBuilder sb = new StringBuilder(length + 33 + String.valueOf(str2).length() + valueOf.length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }

    public l(i4 i4Var, String str, String str2, String str3, long j8, Bundle bundle) {
        n nVar;
        m.e(str2);
        m.e(str3);
        this.f5518a = str2;
        this.f5519b = str3;
        this.f5520c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j8;
        this.f5521e = 0;
        if (!bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    g3 g3Var = i4Var.w;
                    i4.n(g3Var);
                    g3Var.f5397t.a("Param name can't be null");
                } else {
                    g7 g7Var = i4Var.z;
                    i4.l(g7Var);
                    Object o10 = g7Var.o(bundle2.get(next), next);
                    if (o10 == null) {
                        g3 g3Var2 = i4Var.w;
                        i4.n(g3Var2);
                        b3 b3Var = i4Var.A;
                        i4.l(b3Var);
                        g3Var2.w.b(b3Var.m(next), "Param value can't be null");
                    } else {
                        g7 g7Var2 = i4Var.z;
                        i4.l(g7Var2);
                        g7Var2.v(bundle2, next, o10);
                    }
                }
                it.remove();
            }
            nVar = new n(bundle2);
        } else {
            nVar = new n(new Bundle());
        }
        this.f5522f = nVar;
    }
}

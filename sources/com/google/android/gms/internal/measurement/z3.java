package com.google.android.gms.internal.measurement;

import android.content.Context;

public final class z3 extends l4 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3019a;

    /* renamed from: b  reason: collision with root package name */
    public final r4<p4<e4>> f3020b;

    public z3(Context context, r4<p4<e4>> r4Var) {
        this.f3019a = context;
        this.f3020b = r4Var;
    }

    public final Context a() {
        return this.f3019a;
    }

    public final r4<p4<e4>> b() {
        return this.f3020b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l4) {
            l4 l4Var = (l4) obj;
            if (this.f3019a.equals(l4Var.a())) {
                r4<p4<e4>> r4Var = this.f3020b;
                r4<p4<e4>> b10 = l4Var.b();
                if (r4Var != null ? r4Var.equals(b10) : b10 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f3019a.hashCode() ^ 1000003) * 1000003;
        r4<p4<e4>> r4Var = this.f3020b;
        return hashCode ^ (r4Var == null ? 0 : r4Var.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f3019a);
        String valueOf2 = String.valueOf(this.f3020b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 46 + valueOf2.length());
        sb.append("FlagsContext{context=");
        sb.append(valueOf);
        sb.append(", hermeticFileOverrides=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

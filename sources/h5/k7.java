package h5;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

public final class k7 {

    /* renamed from: a  reason: collision with root package name */
    public final i4 f5517a;

    public k7(i4 i4Var) {
        this.f5517a = i4Var;
    }

    public final void a(String str, Bundle bundle) {
        String str2;
        i4 i4Var = this.f5517a;
        h4 h4Var = i4Var.f5459x;
        i4.n(h4Var);
        h4Var.g();
        if (!i4Var.i()) {
            if (bundle.isEmpty()) {
                str2 = null;
            } else {
                if (true == str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String next : bundle.keySet()) {
                    builder.appendQueryParameter(next, bundle.getString(next));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                u3 u3Var = i4Var.f5458v;
                i4.l(u3Var);
                u3Var.I.b(str2);
                i4.l(u3Var);
                i4Var.B.getClass();
                u3Var.J.b(System.currentTimeMillis());
            }
        }
    }

    public final boolean b() {
        if (!c()) {
            return false;
        }
        i4 i4Var = this.f5517a;
        i4Var.B.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        u3 u3Var = i4Var.f5458v;
        i4.l(u3Var);
        if (currentTimeMillis - u3Var.J.a() > i4Var.u.k((String) null, u2.Q)) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        u3 u3Var = this.f5517a.f5458v;
        i4.l(u3Var);
        if (u3Var.J.a() > 0) {
            return true;
        }
        return false;
    }
}

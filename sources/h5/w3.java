package h5;

import t4.b;
import t4.c;

public final class w3 {

    /* renamed from: a  reason: collision with root package name */
    public final i4 f5792a;

    public w3(i4 i4Var) {
        this.f5792a = i4Var;
    }

    public final boolean a() {
        i4 i4Var = this.f5792a;
        try {
            b a10 = c.a(i4Var.f5452o);
            if (a10 == null) {
                g3 g3Var = i4Var.w;
                i4.n(g3Var);
                g3Var.B.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            } else if (a10.b("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e10) {
            g3 g3Var2 = i4Var.w;
            i4.n(g3Var2);
            g3Var2.B.b(e10, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }
}

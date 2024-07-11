package h5;

import android.os.SystemClock;
import android.util.Pair;
import com.karumi.dexter.BuildConfig;
import e4.a;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

public final class g6 extends u6 {

    /* renamed from: r  reason: collision with root package name */
    public String f5411r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f5412s;

    /* renamed from: t  reason: collision with root package name */
    public long f5413t;
    public final q3 u;

    /* renamed from: v  reason: collision with root package name */
    public final q3 f5414v;
    public final q3 w;

    /* renamed from: x  reason: collision with root package name */
    public final q3 f5415x;

    /* renamed from: y  reason: collision with root package name */
    public final q3 f5416y;

    public g6(z6 z6Var) {
        super(z6Var);
        u3 u3Var = this.f5649o.f5458v;
        i4.l(u3Var);
        this.u = new q3(u3Var, "last_delete_stale", 0);
        u3 u3Var2 = this.f5649o.f5458v;
        i4.l(u3Var2);
        this.f5414v = new q3(u3Var2, "backoff", 0);
        u3 u3Var3 = this.f5649o.f5458v;
        i4.l(u3Var3);
        this.w = new q3(u3Var3, "last_upload", 0);
        u3 u3Var4 = this.f5649o.f5458v;
        i4.l(u3Var4);
        this.f5415x = new q3(u3Var4, "last_upload_attempt", 0);
        u3 u3Var5 = this.f5649o.f5458v;
        i4.l(u3Var5);
        this.f5416y = new q3(u3Var5, "midnight_offset", 0);
    }

    public final void i() {
    }

    @Deprecated
    public final Pair<String, Boolean> k(String str) {
        g();
        i4 i4Var = this.f5649o;
        i4Var.B.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str2 = this.f5411r;
        if (str2 != null && elapsedRealtime < this.f5413t) {
            return new Pair<>(str2, Boolean.valueOf(this.f5412s));
        }
        this.f5413t = i4Var.u.k(str, u2.f5709b) + elapsedRealtime;
        try {
            a.C0054a b10 = a.b(i4Var.f5452o);
            this.f5411r = BuildConfig.FLAVOR;
            String str3 = b10.f4483a;
            if (str3 != null) {
                this.f5411r = str3;
            }
            this.f5412s = b10.f4484b;
        } catch (Exception e10) {
            g3 g3Var = i4Var.w;
            i4.n(g3Var);
            g3Var.A.b(e10, "Unable to get advertising id");
            this.f5411r = BuildConfig.FLAVOR;
        }
        return new Pair<>(this.f5411r, Boolean.valueOf(this.f5412s));
    }

    @Deprecated
    public final String l(String str) {
        g();
        String str2 = (String) k(str).first;
        MessageDigest x10 = g7.x();
        if (x10 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, x10.digest(str2.getBytes()))});
    }
}

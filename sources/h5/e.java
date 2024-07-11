package h5;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.databinding.a;
import com.google.android.gms.internal.measurement.ab;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.InvocationTargetException;
import n4.m;
import t4.c;

public final class e extends q4 {

    /* renamed from: p  reason: collision with root package name */
    public Boolean f5343p;

    /* renamed from: q  reason: collision with root package name */
    public d f5344q = a.f1013o0;

    /* renamed from: r  reason: collision with root package name */
    public Boolean f5345r;

    public e(i4 i4Var) {
        super(i4Var, 0);
    }

    public final String h(String str) {
        String str2;
        g3 g3Var;
        Class<String> cls = String.class;
        i4 i4Var = this.f5649o;
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, BuildConfig.FLAVOR});
            m.h(str3);
            return str3;
        } catch (ClassNotFoundException e10) {
            e = e10;
            g3Var = i4Var.w;
            i4.n(g3Var);
            str2 = "Could not find SystemProperties class";
            g3Var.f5397t.b(e, str2);
            return BuildConfig.FLAVOR;
        } catch (NoSuchMethodException e11) {
            e = e11;
            g3Var = i4Var.w;
            i4.n(g3Var);
            str2 = "Could not find SystemProperties.get() method";
            g3Var.f5397t.b(e, str2);
            return BuildConfig.FLAVOR;
        } catch (IllegalAccessException e12) {
            e = e12;
            g3Var = i4Var.w;
            i4.n(g3Var);
            str2 = "Could not access SystemProperties.get()";
            g3Var.f5397t.b(e, str2);
            return BuildConfig.FLAVOR;
        } catch (InvocationTargetException e13) {
            e = e13;
            g3Var = i4Var.w;
            i4.n(g3Var);
            str2 = "SystemProperties.get() threw an exception";
            g3Var.f5397t.b(e, str2);
            return BuildConfig.FLAVOR;
        }
    }

    public final int i() {
        g7 g7Var = this.f5649o.z;
        i4.l(g7Var);
        Boolean bool = g7Var.f5649o.r().f5384s;
        if (g7Var.G() >= 201500) {
            return 100;
        }
        if (bool == null || bool.booleanValue()) {
            return 25;
        }
        return 100;
    }

    public final void j() {
        this.f5649o.getClass();
    }

    public final long k(String str, s2<Long> s2Var) {
        if (str != null) {
            String b10 = this.f5344q.b(str, s2Var.f5680a);
            if (!TextUtils.isEmpty(b10)) {
                try {
                    return s2Var.a(Long.valueOf(Long.parseLong(b10))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return s2Var.a(null).longValue();
    }

    public final int l(String str, s2<Integer> s2Var) {
        if (str != null) {
            String b10 = this.f5344q.b(str, s2Var.f5680a);
            if (!TextUtils.isEmpty(b10)) {
                try {
                    return s2Var.a(Integer.valueOf(Integer.parseInt(b10))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return s2Var.a(null).intValue();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [h5.s2, h5.s2<java.lang.Boolean>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m(java.lang.String r4, h5.s2<java.lang.Boolean> r5) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x000e
        L_0x0003:
            java.lang.Object r4 = r5.a(r0)
        L_0x0007:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L_0x000e:
            h5.d r1 = r3.f5344q
            java.lang.String r2 = r5.f5680a
            java.lang.String r4 = r1.b(r4, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L_0x001d
            goto L_0x0003
        L_0x001d:
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r4 = r5.a(r4)
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.e.m(java.lang.String, h5.s2):boolean");
    }

    public final Bundle n() {
        i4 i4Var = this.f5649o;
        try {
            if (i4Var.f5452o.getPackageManager() == null) {
                g3 g3Var = i4Var.w;
                i4.n(g3Var);
                g3Var.f5397t.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a10 = c.a(i4Var.f5452o).a(i4Var.f5452o.getPackageName(), 128);
            if (a10 != null) {
                return a10.metaData;
            }
            g3 g3Var2 = i4Var.w;
            i4.n(g3Var2);
            g3Var2.f5397t.a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            g3 g3Var3 = i4Var.w;
            i4.n(g3Var3);
            g3Var3.f5397t.b(e10, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final Boolean o(String str) {
        m.e(str);
        Bundle n10 = n();
        if (n10 == null) {
            g3 g3Var = this.f5649o.w;
            i4.n(g3Var);
            g3Var.f5397t.a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!n10.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(n10.getBoolean(str));
        }
    }

    public final boolean p() {
        this.f5649o.getClass();
        Boolean o10 = o("firebase_analytics_collection_deactivated");
        return o10 != null && o10.booleanValue();
    }

    public final boolean q() {
        Boolean o10;
        ab.f2619p.f2620o.zza().zza();
        if (m((String) null, u2.f5736p0) && (o10 = o("google_analytics_automatic_screen_reporting_enabled")) != null && !o10.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean r(String str) {
        return "1".equals(this.f5344q.b(str, "measurement.event_sampling_enabled"));
    }

    public final boolean s() {
        if (this.f5343p == null) {
            Boolean o10 = o("app_measurement_lite");
            this.f5343p = o10;
            if (o10 == null) {
                this.f5343p = Boolean.FALSE;
            }
        }
        if (this.f5343p.booleanValue() || !this.f5649o.f5456s) {
            return true;
        }
        return false;
    }
}

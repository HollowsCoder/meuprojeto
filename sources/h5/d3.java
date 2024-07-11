package h5;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.karumi.dexter.BuildConfig;
import r4.h;

public final class d3 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f5326o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ String f5327p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Object f5328q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f5329r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Object f5330s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ g3 f5331t;

    public d3(g3 g3Var, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f5331t = g3Var;
        this.f5326o = i10;
        this.f5327p = str;
        this.f5328q = obj;
        this.f5329r = obj2;
        this.f5330s = obj3;
    }

    public final void run() {
        SharedPreferences.Editor editor;
        char c10;
        g3 g3Var;
        boolean z;
        u3 u3Var = this.f5331t.f5649o.f5458v;
        i4.l(u3Var);
        if (u3Var.f5671p) {
            g3 g3Var2 = this.f5331t;
            if (g3Var2.f5394q == 0) {
                e eVar = g3Var2.f5649o.u;
                if (eVar.f5345r == null) {
                    synchronized (eVar) {
                        if (eVar.f5345r == null) {
                            ApplicationInfo applicationInfo = eVar.f5649o.f5452o.getApplicationInfo();
                            String a10 = h.a();
                            if (applicationInfo != null) {
                                String str = applicationInfo.processName;
                                if (str == null || !str.equals(a10)) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                eVar.f5345r = Boolean.valueOf(z);
                            }
                            if (eVar.f5345r == null) {
                                eVar.f5345r = Boolean.TRUE;
                                g3 g3Var3 = eVar.f5649o.w;
                                i4.n(g3Var3);
                                g3Var3.f5397t.a("My process not in the list of running processes");
                            }
                        }
                    }
                }
                if (eVar.f5345r.booleanValue()) {
                    g3Var = this.f5331t;
                    g3Var.f5649o.getClass();
                    c10 = 'C';
                } else {
                    g3Var = this.f5331t;
                    g3Var.f5649o.getClass();
                    c10 = 'c';
                }
                g3Var.f5394q = c10;
            }
            g3 g3Var4 = this.f5331t;
            if (g3Var4.f5395r < 0) {
                g3Var4.f5649o.u.j();
                g3Var4.f5395r = 42004;
            }
            char charAt = "01VDIWEA?".charAt(this.f5326o);
            g3 g3Var5 = this.f5331t;
            char c11 = g3Var5.f5394q;
            long j8 = g3Var5.f5395r;
            String s10 = g3.s(true, this.f5327p, this.f5328q, this.f5329r, this.f5330s);
            StringBuilder sb = new StringBuilder(String.valueOf(s10).length() + 24);
            sb.append("2");
            sb.append(charAt);
            sb.append(c11);
            sb.append(j8);
            sb.append(":");
            sb.append(s10);
            String sb2 = sb.toString();
            if (sb2.length() > 1024) {
                sb2 = this.f5327p.substring(0, 1024);
            }
            r3 r3Var = u3Var.f5752r;
            if (r3Var != null) {
                u3 u3Var2 = r3Var.f5670e;
                u3Var2.g();
                if (r3Var.f5670e.l().getLong(r3Var.f5667a, 0) == 0) {
                    r3Var.a();
                }
                if (sb2 == null) {
                    sb2 = BuildConfig.FLAVOR;
                }
                SharedPreferences l = u3Var2.l();
                String str2 = r3Var.f5668b;
                long j10 = l.getLong(str2, 0);
                int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
                String str3 = r3Var.f5669c;
                if (i10 <= 0) {
                    editor = u3Var2.l().edit();
                    editor.putString(str3, sb2);
                    editor.putLong(str2, 1);
                } else {
                    g7 g7Var = u3Var2.f5649o.z;
                    i4.l(g7Var);
                    long nextLong = g7Var.X().nextLong();
                    long j11 = j10 + 1;
                    editor = u3Var2.l().edit();
                    if ((Long.MAX_VALUE & nextLong) < Long.MAX_VALUE / j11) {
                        editor.putString(str3, sb2);
                    }
                    editor.putLong(str2, j11);
                }
                editor.apply();
                return;
            }
            return;
        }
        Log.println(6, this.f5331t.r(), "Persisted config not initialized. Not logging error/warn");
    }
}

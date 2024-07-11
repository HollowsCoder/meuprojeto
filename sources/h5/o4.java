package h5;

import android.os.Bundle;
import java.util.List;

public final class o4 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f5607o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f5608p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Object f5609q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ long f5610r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Object f5611s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Object f5612t;

    public /* synthetic */ o4(Object obj, Object obj2, Object obj3, Object obj4, long j8, int i10) {
        this.f5607o = i10;
        this.f5612t = obj;
        this.f5608p = obj2;
        this.f5609q = obj3;
        this.f5611s = obj4;
        this.f5610r = j8;
    }

    public final void run() {
        switch (this.f5607o) {
            case 0:
                if (((String) this.f5608p) == null) {
                    u5 u5Var = ((p4) this.f5612t).f5631a.f5856y.C;
                    i4.m(u5Var);
                    String str = (String) this.f5609q;
                    u5Var.g();
                    synchronized (u5Var) {
                        String str2 = u5Var.A;
                        if (str2 == null || str2.equals(str)) {
                            u5Var.A = str;
                        }
                    }
                    return;
                }
                u5 u5Var2 = ((p4) this.f5612t).f5631a.f5856y.C;
                i4.m(u5Var2);
                String str3 = (String) this.f5609q;
                u5Var2.g();
                synchronized (u5Var2) {
                    String str4 = u5Var2.A;
                    if (str4 != null) {
                        str4.equals(str3);
                    }
                    u5Var2.A = str3;
                }
                return;
            case 1:
                Object obj = this.f5611s;
                ((i5) this.f5612t).k(this.f5610r, obj, (String) this.f5608p, (String) this.f5609q);
                return;
            default:
                u5 u5Var3 = (u5) this.f5612t;
                Bundle bundle = (Bundle) this.f5608p;
                long j8 = this.f5610r;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                g7 g7Var = u5Var3.f5649o.z;
                i4.l(g7Var);
                u5Var3.l((p5) this.f5609q, (p5) this.f5611s, j8, true, g7Var.p((String) null, "screen_view", bundle, (List<String>) null, true));
                return;
        }
    }
}

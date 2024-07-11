package h5;

import android.os.Bundle;
import java.util.Iterator;
import java.util.TreeSet;
import l4.g0;
import n4.m;

public final /* synthetic */ class v4 implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f5780o;

    /* renamed from: p  reason: collision with root package name */
    public final Bundle f5781p;

    /* renamed from: q  reason: collision with root package name */
    public final i5 f5782q;

    public /* synthetic */ v4(i5 i5Var, Bundle bundle, int i10) {
        this.f5780o = i10;
        this.f5782q = i5Var;
        this.f5781p = bundle;
    }

    public final void run() {
        Object obj;
        int i10 = this.f5780o;
        Bundle bundle = this.f5781p;
        i5 i5Var = this.f5782q;
        switch (i10) {
            case 0:
                i4 i4Var = i5Var.f5649o;
                if (bundle == null) {
                    u3 u3Var = i4Var.f5458v;
                    i4.l(u3Var);
                    u3Var.K.b(new Bundle());
                    return;
                }
                u3 u3Var2 = i4Var.f5458v;
                i4.l(u3Var2);
                Bundle a10 = u3Var2.K.a();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    j6 j6Var = i5Var.D;
                    g7 g7Var = i4Var.z;
                    g3 g3Var = i4Var.w;
                    e eVar = i4Var.u;
                    if (hasNext) {
                        String next = it.next();
                        Object obj2 = bundle.get(next);
                        if (obj2 == null || (obj2 instanceof String) || (obj2 instanceof Long) || (obj2 instanceof Double)) {
                            Object obj3 = obj2;
                            if (g7.A(next)) {
                                i4.n(g3Var);
                                g3Var.f5400y.b(next, "Invalid default event parameter name. Name");
                            } else if (obj3 == null) {
                                a10.remove(next);
                            } else {
                                i4.l(g7Var);
                                if (g7Var.j0("param", next, 100, obj3)) {
                                    g7Var.v(a10, next, obj3);
                                }
                            }
                        } else {
                            i4.l(g7Var);
                            g7Var.getClass();
                            if (g7.i0(obj2)) {
                                obj = obj2;
                                g7Var.w(j6Var, (String) null, 27, (String) null, (String) null, 0, eVar.m((String) null, u2.f5744u0));
                            } else {
                                obj = obj2;
                            }
                            i4.n(g3Var);
                            g3Var.f5400y.c(next, obj, "Invalid default event parameter type. Name, value");
                        }
                    } else {
                        i4.l(g7Var);
                        int i11 = eVar.i();
                        if (a10.size() > i11) {
                            Iterator it2 = new TreeSet(a10.keySet()).iterator();
                            int i12 = 0;
                            while (it2.hasNext()) {
                                String str = (String) it2.next();
                                i12++;
                                if (i12 > i11) {
                                    a10.remove(str);
                                }
                            }
                            i4.l(g7Var);
                            g7Var.w(j6Var, (String) null, 26, (String) null, (String) null, 0, eVar.m((String) null, u2.f5744u0));
                            i4.n(g3Var);
                            g3Var.f5400y.a("Too many default event parameters set. Discarding beyond event parameter limit");
                        }
                        u3 u3Var3 = i4Var.f5458v;
                        i4.l(u3Var3);
                        u3Var3.K.b(a10);
                        f6 r5 = i4Var.r();
                        r5.g();
                        r5.h();
                        r5.q(new g0(r5, r5.s(false), a10, 4));
                        return;
                    }
                }
                break;
            default:
                i5Var.g();
                i5Var.h();
                m.h(bundle);
                String string = bundle.getString("name");
                String string2 = bundle.getString("origin");
                m.e(string);
                m.e(string2);
                m.h(bundle.get("value"));
                i4 i4Var2 = i5Var.f5649o;
                boolean i13 = i4Var2.i();
                g7 g7Var2 = i4Var2.z;
                if (!i13) {
                    g3 g3Var2 = i4Var2.w;
                    i4.n(g3Var2);
                    g3Var2.B.a("Conditional property not set since app measurement is disabled");
                    return;
                }
                c7 c7Var = new c7(bundle.getLong("triggered_timestamp"), bundle.get("value"), string, string2);
                try {
                    i4.l(g7Var2);
                    g7 g7Var3 = g7Var2;
                    p D = g7Var2.D(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0, true);
                    i4Var2.r().v(new b(bundle.getString("app_id"), string2, c7Var, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), g7Var3.D(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0, true), bundle.getLong("trigger_timeout"), D, bundle.getLong("time_to_live"), g7Var3.D(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0, true)));
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
        }
    }
}

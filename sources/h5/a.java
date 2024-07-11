package h5;

import n.b;
import n4.m;

public final class a implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f5260o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ String f5261p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ long f5262q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ u1 f5263r;

    public /* synthetic */ a(u1 u1Var, String str, long j8, int i10) {
        this.f5260o = i10;
        this.f5263r = u1Var;
        this.f5261p = str;
        this.f5262q = j8;
    }

    public final void run() {
        Object obj;
        int i10 = this.f5260o;
        long j8 = this.f5262q;
        String str = this.f5261p;
        u1 u1Var = this.f5263r;
        switch (i10) {
            case 0:
                u1Var.g();
                m.e(str);
                b bVar = u1Var.f5705q;
                if (bVar.isEmpty()) {
                    u1Var.f5706r = j8;
                }
                Integer num = (Integer) bVar.getOrDefault(str, null);
                if (num != null) {
                    obj = Integer.valueOf(num.intValue() + 1);
                } else if (bVar.f7333q >= 100) {
                    g3 g3Var = u1Var.f5649o.w;
                    i4.n(g3Var);
                    g3Var.w.a("Too many ads visible");
                    return;
                } else {
                    bVar.put(str, 1);
                    bVar = u1Var.f5704p;
                    obj = Long.valueOf(j8);
                }
                bVar.put(str, obj);
                return;
            default:
                u1Var.g();
                m.e(str);
                b bVar2 = u1Var.f5705q;
                Integer num2 = (Integer) bVar2.getOrDefault(str, null);
                i4 i4Var = u1Var.f5649o;
                if (num2 != null) {
                    u5 u5Var = i4Var.C;
                    i4.m(u5Var);
                    p5 o10 = u5Var.o(false);
                    int intValue = num2.intValue() - 1;
                    if (intValue == 0) {
                        bVar2.remove(str);
                        b bVar3 = u1Var.f5704p;
                        Long l = (Long) bVar3.getOrDefault(str, null);
                        g3 g3Var2 = i4Var.w;
                        if (l == null) {
                            i4.n(g3Var2);
                            g3Var2.f5397t.a("First ad unit exposure time was never set");
                        } else {
                            long longValue = l.longValue();
                            bVar3.remove(str);
                            u1Var.l(str, j8 - longValue, o10);
                        }
                        if (bVar2.isEmpty()) {
                            long j10 = u1Var.f5706r;
                            if (j10 == 0) {
                                i4.n(g3Var2);
                                g3Var2.f5397t.a("First ad exposure time was never set");
                                return;
                            }
                            u1Var.k(j8 - j10, o10);
                            u1Var.f5706r = 0;
                            return;
                        }
                        return;
                    }
                    bVar2.put(str, Integer.valueOf(intValue));
                    return;
                }
                g3 g3Var3 = i4Var.w;
                i4.n(g3Var3);
                g3Var3.f5397t.b(str, "Call to endAdUnitExposure for unknown ad unit id");
                return;
        }
    }
}

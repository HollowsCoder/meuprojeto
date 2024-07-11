package h5;

import com.google.android.gms.internal.measurement.ba;
import com.google.android.gms.internal.measurement.l3;
import com.google.android.gms.internal.measurement.m3;
import com.google.android.gms.internal.measurement.n3;
import com.google.android.gms.internal.measurement.o3;
import com.google.android.gms.internal.measurement.s2;
import com.google.android.gms.internal.measurement.t2;
import com.google.android.gms.internal.measurement.u2;
import com.google.android.gms.internal.measurement.v2;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n.b;
import n.h;

public final class l7 {

    /* renamed from: a  reason: collision with root package name */
    public final String f5534a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5535b;

    /* renamed from: c  reason: collision with root package name */
    public final m3 f5536c;
    public final BitSet d;

    /* renamed from: e  reason: collision with root package name */
    public final BitSet f5537e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<Integer, Long> f5538f;

    /* renamed from: g  reason: collision with root package name */
    public final b f5539g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ q7 f5540h;

    public /* synthetic */ l7(q7 q7Var, String str) {
        this.f5540h = q7Var;
        this.f5534a = str;
        this.f5535b = true;
        this.d = new BitSet();
        this.f5537e = new BitSet();
        this.f5538f = new b();
        this.f5539g = new b();
    }

    public l7(q7 q7Var, String str, m3 m3Var, BitSet bitSet, BitSet bitSet2, b bVar, b bVar2) {
        this.f5540h = q7Var;
        this.f5534a = str;
        this.d = bitSet;
        this.f5537e = bitSet2;
        this.f5538f = bVar;
        this.f5539g = new b();
        Iterator it = ((h.c) bVar2.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) bVar2.getOrDefault(num, null));
            this.f5539g.put(num, arrayList);
        }
        this.f5535b = false;
        this.f5536c = m3Var;
    }

    public final void a(o7 o7Var) {
        int a10 = o7Var.a();
        Boolean bool = o7Var.f5618c;
        if (bool != null) {
            this.f5537e.set(a10, bool.booleanValue());
        }
        Boolean bool2 = o7Var.d;
        if (bool2 != null) {
            this.d.set(a10, bool2.booleanValue());
        }
        if (o7Var.f5619e != null) {
            Integer valueOf = Integer.valueOf(a10);
            Map<Integer, Long> map = this.f5538f;
            Long l = map.get(valueOf);
            long longValue = o7Var.f5619e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                map.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (o7Var.f5620f != null) {
            b bVar = this.f5539g;
            Integer valueOf2 = Integer.valueOf(a10);
            List list = (List) bVar.getOrDefault(valueOf2, null);
            if (list == null) {
                list = new ArrayList();
                bVar.put(valueOf2, list);
            }
            if (o7Var.b()) {
                list.clear();
            }
            ba.a();
            q7 q7Var = this.f5540h;
            e eVar = q7Var.f5649o.u;
            s2<Boolean> s2Var = u2.Y;
            String str = this.f5534a;
            if (eVar.m(str, s2Var) && o7Var.c()) {
                list.clear();
            }
            ba.a();
            boolean m10 = q7Var.f5649o.u.m(str, s2Var);
            Long l8 = o7Var.f5620f;
            if (m10) {
                Long valueOf3 = Long.valueOf(l8.longValue() / 1000);
                if (!list.contains(valueOf3)) {
                    list.add(valueOf3);
                    return;
                }
                return;
            }
            list.add(Long.valueOf(l8.longValue() / 1000));
        }
    }

    public final t2 b(int i10) {
        ArrayList arrayList;
        List list;
        s2 y10 = t2.y();
        if (y10.f2636q) {
            y10.m();
            y10.f2636q = false;
        }
        t2.A((t2) y10.f2635p, i10);
        if (y10.f2636q) {
            y10.m();
            y10.f2636q = false;
        }
        t2.D((t2) y10.f2635p, this.f5535b);
        m3 m3Var = this.f5536c;
        if (m3Var != null) {
            if (y10.f2636q) {
                y10.m();
                y10.f2636q = false;
            }
            t2.C((t2) y10.f2635p, m3Var);
        }
        l3 B = m3.B();
        ArrayList z = b7.z(this.d);
        if (B.f2636q) {
            B.m();
            B.f2636q = false;
        }
        m3.G((m3) B.f2635p, z);
        ArrayList z10 = b7.z(this.f5537e);
        if (B.f2636q) {
            B.m();
            B.f2636q = false;
        }
        m3.E((m3) B.f2635p, z10);
        Map<Integer, Long> map = this.f5538f;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(map.size());
            for (Integer intValue : map.keySet()) {
                int intValue2 = intValue.intValue();
                Long l = map.get(Integer.valueOf(intValue2));
                if (l != null) {
                    u2 v10 = v2.v();
                    if (v10.f2636q) {
                        v10.m();
                        v10.f2636q = false;
                    }
                    v2.x((v2) v10.f2635p, intValue2);
                    long longValue = l.longValue();
                    if (v10.f2636q) {
                        v10.m();
                        v10.f2636q = false;
                    }
                    v2.y((v2) v10.f2635p, longValue);
                    arrayList.add((v2) v10.j());
                }
            }
        }
        if (arrayList != null) {
            if (B.f2636q) {
                B.m();
                B.f2636q = false;
            }
            m3.I((m3) B.f2635p, arrayList);
        }
        b bVar = this.f5539g;
        if (bVar == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(bVar.f7333q);
            Iterator it = ((h.c) bVar.keySet()).iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                n3 w = o3.w();
                int intValue3 = num.intValue();
                if (w.f2636q) {
                    w.m();
                    w.f2636q = false;
                }
                o3.y((o3) w.f2635p, intValue3);
                List list2 = (List) bVar.getOrDefault(num, null);
                if (list2 != null) {
                    Collections.sort(list2);
                    if (w.f2636q) {
                        w.m();
                        w.f2636q = false;
                    }
                    o3.z((o3) w.f2635p, list2);
                }
                arrayList2.add((o3) w.j());
            }
            list = arrayList2;
        }
        if (B.f2636q) {
            B.m();
            B.f2636q = false;
        }
        m3.K((m3) B.f2635p, list);
        if (y10.f2636q) {
            y10.m();
            y10.f2636q = false;
        }
        t2.B((t2) y10.f2635p, (m3) B.j());
        return (t2) y10.j();
    }
}

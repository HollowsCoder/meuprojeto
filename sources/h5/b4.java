package h5;

import com.google.android.gms.internal.measurement.k0;
import com.google.android.gms.internal.measurement.o2;
import com.google.android.gms.internal.measurement.pb;
import java.util.LinkedHashMap;
import n.g;
import n4.m;

public final class b4 extends g<String, k0> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c4 f5290f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b4(c4 c4Var) {
        super(20);
        this.f5290f = c4Var;
    }

    public final Object a(Object obj) {
        LinkedHashMap linkedHashMap;
        String str = (String) obj;
        m.e(str);
        c4 c4Var = this.f5290f;
        c4Var.h();
        m.e(str);
        pb.a();
        if (!c4Var.f5649o.u.m((String) null, u2.f5750z0) || !c4Var.l(str)) {
            return null;
        }
        if (!c4Var.u.containsKey(str) || c4Var.u.getOrDefault(str, null) == null) {
            c4Var.q(str);
        } else {
            c4Var.s(str, (o2) c4Var.u.getOrDefault(str, null));
        }
        b4 b4Var = c4Var.w;
        synchronized (b4Var) {
            linkedHashMap = new LinkedHashMap(b4Var.f7309a);
        }
        return (k0) linkedHashMap.get(str);
    }
}

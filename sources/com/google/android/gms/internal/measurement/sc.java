package com.google.android.gms.internal.measurement;

import androidx.databinding.a;
import java.util.List;
import java.util.TreeMap;
import m1.i;

public final class sc extends i {

    /* renamed from: q  reason: collision with root package name */
    public final i f2931q;

    public sc(i iVar) {
        super("internal.registerCallback");
        this.f2931q = iVar;
    }

    public final o a(i3 i3Var, List<o> list) {
        int i10;
        Object obj;
        String str;
        a.A(this.f2738o, 3, list);
        i3Var.a(list.get(0)).zzc();
        o a10 = i3Var.a(list.get(1));
        if (a10 instanceof n) {
            o a11 = i3Var.a(list.get(2));
            if (a11 instanceof l) {
                l lVar = (l) a11;
                if (lVar.k("type")) {
                    String zzc = lVar.e("type").zzc();
                    if (lVar.k("priority")) {
                        i10 = a.N(lVar.e("priority").b().doubleValue());
                    } else {
                        i10 = 1000;
                    }
                    n nVar = (n) a10;
                    i iVar = this.f2931q;
                    iVar.getClass();
                    if ("create".equals(zzc)) {
                        obj = iVar.f7057q;
                    } else if ("edit".equals(zzc)) {
                        obj = iVar.f7056p;
                    } else {
                        String valueOf = String.valueOf(zzc);
                        if (valueOf.length() != 0) {
                            str = "Unknown callback type: ".concat(valueOf);
                        } else {
                            str = new String("Unknown callback type: ");
                        }
                        throw new IllegalStateException(str);
                    }
                    TreeMap treeMap = (TreeMap) obj;
                    if (treeMap.containsKey(Integer.valueOf(i10))) {
                        i10 = ((Integer) treeMap.lastKey()).intValue() + 1;
                    }
                    treeMap.put(Integer.valueOf(i10), nVar);
                    return o.f2850a;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}

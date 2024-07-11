package com.google.android.gms.internal.measurement;

import androidx.databinding.a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import q1.d;

public final class tc extends i {

    /* renamed from: q  reason: collision with root package name */
    public final d f2941q;

    /* renamed from: r  reason: collision with root package name */
    public final HashMap f2942r = new HashMap();

    public tc(d dVar) {
        super("require");
        this.f2941q = dVar;
    }

    public final o a(i3 i3Var, List<o> list) {
        o oVar;
        a.A("require", 1, list);
        String zzc = i3Var.a(list.get(0)).zzc();
        HashMap hashMap = this.f2942r;
        if (hashMap.containsKey(zzc)) {
            return (o) hashMap.get(zzc);
        }
        d dVar = this.f2941q;
        if (((Map) dVar.f8213p).containsKey(zzc)) {
            try {
                oVar = (o) ((Callable) ((Map) dVar.f8213p).get(zzc)).call();
            } catch (Exception unused) {
                String valueOf = String.valueOf(zzc);
                throw new IllegalStateException(valueOf.length() != 0 ? "Failed to create API implementation: ".concat(valueOf) : new String("Failed to create API implementation: "));
            }
        } else {
            oVar = o.f2850a;
        }
        if (oVar instanceof i) {
            hashMap.put(zzc, (i) oVar);
        }
        return oVar;
    }
}

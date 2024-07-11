package y3;

import c4.b;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import m8.a;
import q3.d;
import w3.b;
import z3.c;
import z3.e;

public final class e implements b<z3.e> {

    /* renamed from: a  reason: collision with root package name */
    public final a<c4.a> f9547a = b.a.f2138a;

    public final Object get() {
        c4.a aVar = this.f9547a.get();
        HashMap hashMap = new HashMap();
        d dVar = d.DEFAULT;
        c.a aVar2 = new c.a();
        Set<e.b> emptySet = Collections.emptySet();
        if (emptySet != null) {
            aVar2.f9881c = emptySet;
            aVar2.f9879a = 30000L;
            aVar2.f9880b = 86400000L;
            hashMap.put(dVar, aVar2.a());
            d dVar2 = d.HIGHEST;
            c.a aVar3 = new c.a();
            Set<e.b> emptySet2 = Collections.emptySet();
            if (emptySet2 != null) {
                aVar3.f9881c = emptySet2;
                aVar3.f9879a = 1000L;
                aVar3.f9880b = 86400000L;
                hashMap.put(dVar2, aVar3.a());
                d dVar3 = d.VERY_LOW;
                c.a aVar4 = new c.a();
                Set<e.b> emptySet3 = Collections.emptySet();
                if (emptySet3 != null) {
                    aVar4.f9881c = emptySet3;
                    aVar4.f9879a = 86400000L;
                    aVar4.f9880b = 86400000L;
                    Set<e.b> unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(new e.b[]{e.b.NETWORK_UNMETERED, e.b.DEVICE_IDLE})));
                    if (unmodifiableSet != null) {
                        aVar4.f9881c = unmodifiableSet;
                        hashMap.put(dVar3, aVar4.a());
                        if (aVar == null) {
                            throw new NullPointerException("missing required property: clock");
                        } else if (hashMap.keySet().size() >= d.values().length) {
                            new HashMap();
                            return new z3.b(aVar, hashMap);
                        } else {
                            throw new IllegalStateException("Not all priorities have been configured");
                        }
                    } else {
                        throw new NullPointerException("Null flags");
                    }
                } else {
                    throw new NullPointerException("Null flags");
                }
            } else {
                throw new NullPointerException("Null flags");
            }
        } else {
            throw new NullPointerException("Null flags");
        }
    }
}

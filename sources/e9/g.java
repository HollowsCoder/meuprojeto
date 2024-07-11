package e9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import n8.d;
import o8.l;
import p9.u;

public class g extends u {
    public static final Map u(ArrayList arrayList) {
        l lVar = l.f7765o;
        int size = arrayList.size();
        if (size == 0) {
            return lVar;
        }
        if (size != 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(u.m(arrayList.size()));
            v(arrayList, linkedHashMap);
            return linkedHashMap;
        }
        d dVar = (d) arrayList.get(0);
        z8.g.f(dVar, "pair");
        Map singletonMap = Collections.singletonMap(dVar.f7495o, dVar.f7496p);
        z8.g.e(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    public static final void v(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            linkedHashMap.put(dVar.f7495o, dVar.f7496p);
        }
    }
}

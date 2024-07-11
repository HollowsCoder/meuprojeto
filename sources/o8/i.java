package o8;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import n.e;
import p9.u;
import y8.l;
import z8.g;

public class i extends g {
    public static final void w(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l lVar) {
        g.f(iterable, "<this>");
        g.f(charSequence, "separator");
        g.f(charSequence2, "prefix");
        g.f(charSequence3, "postfix");
        g.f(charSequence4, "truncated");
        sb.append(charSequence2);
        int i11 = 0;
        for (Object next : iterable) {
            i11++;
            if (i11 > 1) {
                sb.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            e.k(sb, next, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static final void x(Iterable iterable, AbstractCollection abstractCollection) {
        g.f(iterable, "<this>");
        for (Object add : iterable) {
            abstractCollection.add(add);
        }
    }

    public static final <T> List<T> y(Iterable<? extends T> iterable) {
        ArrayList arrayList;
        Object obj;
        g.f(iterable, "<this>");
        boolean z = iterable instanceof Collection;
        if (z) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return k.f7764o;
            }
            if (size != 1) {
                return new ArrayList(collection);
            }
            if (iterable instanceof List) {
                obj = ((List) iterable).get(0);
            } else {
                obj = iterable.iterator().next();
            }
            return u.l(obj);
        }
        if (z) {
            arrayList = new ArrayList((Collection) iterable);
        } else {
            arrayList = new ArrayList();
            x(iterable, arrayList);
        }
        return u.n(arrayList);
    }

    public static final Set z(ArrayList arrayList) {
        g.f(arrayList, "<this>");
        m mVar = m.f7766o;
        int size = arrayList.size();
        if (size == 0) {
            return mVar;
        }
        if (size != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(u.m(arrayList.size()));
            x(arrayList, linkedHashSet);
            return linkedHashSet;
        }
        Set singleton = Collections.singleton(arrayList.get(0));
        g.e(singleton, "singleton(element)");
        return singleton;
    }
}

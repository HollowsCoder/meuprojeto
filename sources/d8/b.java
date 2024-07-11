package d8;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public final class b implements g {

    /* renamed from: a  reason: collision with root package name */
    public final String f4309a;

    /* renamed from: b  reason: collision with root package name */
    public final c f4310b;

    public b(Set<d> set, c cVar) {
        this.f4309a = b(set);
        this.f4310b = cVar;
    }

    public static String b(Set<d> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<d> it = set.iterator();
        while (it.hasNext()) {
            d next = it.next();
            sb.append(next.a());
            sb.append('/');
            sb.append(next.b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        c cVar = this.f4310b;
        synchronized (cVar.f4312a) {
            unmodifiableSet = Collections.unmodifiableSet(cVar.f4312a);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.f4309a;
        if (isEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (cVar.f4312a) {
            unmodifiableSet2 = Collections.unmodifiableSet(cVar.f4312a);
        }
        sb.append(b(unmodifiableSet2));
        return sb.toString();
    }
}

package n1;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import m3.j;
import t2.k;
import u1.a;

public abstract class i implements h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7357a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final Collection f7358b;

    public i() {
        char[] cArr = j.f7084a;
        this.f7358b = new ArrayDeque(20);
    }

    public final List b() {
        return (List) this.f7358b;
    }

    public final boolean c() {
        Collection collection = this.f7358b;
        if (!((List) collection).isEmpty()) {
            return ((List) collection).size() == 1 && ((a) ((List) collection).get(0)).c();
        }
        return true;
    }

    public abstract k d();

    public final k e() {
        k kVar = (k) ((Queue) this.f7358b).poll();
        return kVar == null ? d() : kVar;
    }

    public final void f(k kVar) {
        Collection collection = this.f7358b;
        if (((Queue) collection).size() < 20) {
            ((Queue) collection).offer(kVar);
        }
    }

    public final String toString() {
        switch (this.f7357a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                List list = (List) this.f7358b;
                if (!list.isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(list.toArray()));
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public i(Float f10) {
        this(Collections.singletonList(new a(f10)));
    }

    public i(List list) {
        this.f7358b = list;
    }
}

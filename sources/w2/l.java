package w2;

import java.util.ArrayDeque;
import m3.g;
import w2.m;

public final class l extends g<m.a<Object>, Object> {
    public l() {
        super(500);
    }

    public final void c(Object obj, Object obj2) {
        m.a aVar = (m.a) obj;
        aVar.getClass();
        ArrayDeque arrayDeque = m.a.d;
        synchronized (arrayDeque) {
            arrayDeque.offer(aVar);
        }
    }
}

package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;

public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, a0> f1386a = new HashMap<>();

    public final void a() {
        for (a0 next : this.f1386a.values()) {
            next.f1373b = true;
            HashMap hashMap = next.f1372a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    for (Object next2 : next.f1372a.values()) {
                        if (next2 instanceof Closeable) {
                            try {
                                ((Closeable) next2).close();
                            } catch (IOException e10) {
                                throw new RuntimeException(e10);
                            }
                        }
                    }
                }
            }
            next.a();
        }
        this.f1386a.clear();
    }
}

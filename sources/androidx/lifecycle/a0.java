package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;

public abstract class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f1372a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f1373b = false;

    public void a() {
    }

    public final void b(Object obj) {
        Object obj2;
        synchronized (this.f1372a) {
            obj2 = this.f1372a.get("androidx.lifecycle.savedstate.vm.tag");
            if (obj2 == null) {
                this.f1372a.put("androidx.lifecycle.savedstate.vm.tag", obj);
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.f1373b && (obj instanceof Closeable)) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }
}

package androidx.navigation;

import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

public final class f extends a0 {
    public static final a d = new a();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<UUID, c0> f1468c = new HashMap<>();

    public class a implements b0.b {
        public final <T extends a0> T a(Class<T> cls) {
            return new f();
        }
    }

    public final void a() {
        HashMap<UUID, c0> hashMap = this.f1468c;
        for (c0 a10 : hashMap.values()) {
            a10.a();
        }
        hashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator<UUID> it = this.f1468c.keySet().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}

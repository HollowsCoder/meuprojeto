package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import java.util.HashMap;
import java.util.Iterator;

public final class b0 extends a0 {

    /* renamed from: i  reason: collision with root package name */
    public static final a f1114i = new a();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, n> f1115c = new HashMap<>();
    public final HashMap<String, b0> d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<String, c0> f1116e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public final boolean f1117f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1118g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1119h = false;

    public class a implements b0.b {
        public final <T extends a0> T a(Class<T> cls) {
            return new b0(true);
        }
    }

    public b0(boolean z) {
        this.f1117f = z;
    }

    public final void a() {
        if (y.I(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1118g = true;
    }

    public final void c(n nVar) {
        if (!this.f1119h) {
            if ((this.f1115c.remove(nVar.f1240s) != null) && y.I(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Removed " + nVar);
            }
        } else if (y.I(2)) {
            Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b0.class != obj.getClass()) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f1115c.equals(b0Var.f1115c) && this.d.equals(b0Var.d) && this.f1116e.equals(b0Var.f1116e);
    }

    public final int hashCode() {
        int hashCode = this.d.hashCode();
        return this.f1116e.hashCode() + ((hashCode + (this.f1115c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<n> it = this.f1115c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f1116e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}

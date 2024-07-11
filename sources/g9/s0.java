package g9;

import kotlinx.coroutines.internal.h;
import n.e;

public abstract class s0 extends s {
    public String toString() {
        String str;
        s0 s0Var;
        f0 f0Var = z.f5055a;
        s0 s0Var2 = h.f6792a;
        if (this == s0Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                s0Var = s0Var2.y();
            } catch (UnsupportedOperationException unused) {
                s0Var = null;
            }
            if (this == s0Var) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + e.x(this);
    }

    public abstract s0 y();
}

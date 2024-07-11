package g9;

import java.util.concurrent.CancellationException;
import z8.g;

public final class m0 extends CancellationException {

    /* renamed from: o  reason: collision with root package name */
    public final l0 f5028o;

    public m0(String str, Throwable th, l0 l0Var) {
        super(str);
        this.f5028o = l0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof m0) {
                m0 m0Var = (m0) obj;
                if (!g.a(m0Var.getMessage(), getMessage()) || !g.a(m0Var.f5028o, this.f5028o) || !g.a(m0Var.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        g.c(message);
        int hashCode = (this.f5028o.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause == null ? 0 : cause.hashCode());
    }

    public final String toString() {
        return super.toString() + "; job=" + this.f5028o;
    }
}

package h9;

import android.os.Handler;
import android.os.Looper;
import g9.f0;
import g9.l0;
import g9.s0;
import g9.z;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.h;
import n8.i;
import q8.f;
import z8.g;

public final class a extends b {
    private volatile a _immediate;

    /* renamed from: p  reason: collision with root package name */
    public final Handler f5919p;

    /* renamed from: q  reason: collision with root package name */
    public final String f5920q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f5921r;

    /* renamed from: s  reason: collision with root package name */
    public final a f5922s;

    public a(Handler handler) {
        this(handler, (String) null, false);
    }

    public final void b(f fVar, Runnable runnable) {
        if (!this.f5919p.post(runnable)) {
            CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
            l0 l0Var = (l0) fVar.get(l0.b.f5025o);
            if (l0Var != null) {
                l0Var.s(cancellationException);
            }
            z.f5056b.y(runnable, false);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).f5919p == this.f5919p;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f5919p);
    }

    public final String toString() {
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
        String str2 = this.f5920q;
        if (str2 == null) {
            str2 = this.f5919p.toString();
        }
        if (this.f5921r) {
            return g.k(".immediate", str2);
        }
        return str2;
    }

    public final boolean x() {
        return !this.f5921r || !g.a(Looper.myLooper(), this.f5919p.getLooper());
    }

    public final s0 y() {
        return this.f5922s;
    }

    public a(Handler handler, String str, boolean z) {
        this.f5919p = handler;
        this.f5920q = str;
        this.f5921r = z;
        this._immediate = z ? this : null;
        a aVar = this._immediate;
        if (aVar == null) {
            aVar = new a(handler, str, true);
            this._immediate = aVar;
            i iVar = i.f7501a;
        }
        this.f5922s = aVar;
    }
}

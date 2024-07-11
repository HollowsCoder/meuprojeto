package f3;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.n;
import androidx.fragment.app.y;
import com.bumptech.glide.b;
import com.bumptech.glide.m;
import java.util.HashSet;

public class o extends n {

    /* renamed from: h0  reason: collision with root package name */
    public final a f4623h0;

    /* renamed from: i0  reason: collision with root package name */
    public final a f4624i0 = new a();

    /* renamed from: j0  reason: collision with root package name */
    public final HashSet f4625j0 = new HashSet();

    /* renamed from: k0  reason: collision with root package name */
    public o f4626k0;

    /* renamed from: l0  reason: collision with root package name */
    public m f4627l0;

    /* renamed from: m0  reason: collision with root package name */
    public n f4628m0;

    public class a implements m {
        public a() {
        }

        public final String toString() {
            return super.toString() + "{fragment=" + o.this + "}";
        }
    }

    public o() {
        a aVar = new a();
        this.f4623h0 = aVar;
    }

    public final void A() {
        this.Q = true;
        this.f4628m0 = null;
        o oVar = this.f4626k0;
        if (oVar != null) {
            oVar.f4625j0.remove(this);
            this.f4626k0 = null;
        }
    }

    public final void G() {
        this.Q = true;
        this.f4623h0.d();
    }

    public final void H() {
        this.Q = true;
        this.f4623h0.e();
    }

    public final void V(Context context, y yVar) {
        o oVar = this.f4626k0;
        if (oVar != null) {
            oVar.f4625j0.remove(this);
            this.f4626k0 = null;
        }
        o i10 = b.b(context).f2237t.i(yVar, (n) null);
        this.f4626k0 = i10;
        if (!equals(i10)) {
            this.f4626k0.f4625j0.add(this);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        n nVar = this.I;
        if (nVar == null) {
            nVar = this.f4628m0;
        }
        sb.append(nVar);
        sb.append("}");
        return sb.toString();
    }

    public final void u(Context context) {
        super.u(context);
        n nVar = this;
        while (true) {
            n nVar2 = nVar.I;
            if (nVar2 == null) {
                break;
            }
            nVar = nVar2;
        }
        y yVar = nVar.F;
        if (yVar != null) {
            try {
                V(k(), yVar);
            } catch (IllegalStateException e10) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e10);
                }
            }
        } else if (Log.isLoggable("SupportRMFragment", 5)) {
            Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
        }
    }

    public final void y() {
        this.Q = true;
        this.f4623h0.c();
        o oVar = this.f4626k0;
        if (oVar != null) {
            oVar.f4625j0.remove(this);
            this.f4626k0 = null;
        }
    }
}

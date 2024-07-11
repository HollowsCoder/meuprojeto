package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.h;
import androidx.savedstate.a;

public final class o implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f1262a;

    public o(q qVar) {
        this.f1262a = qVar;
    }

    public final Bundle a() {
        q qVar;
        Bundle bundle = new Bundle();
        do {
            qVar = this.f1262a;
        } while (q.x(qVar.w(), h.c.CREATED));
        qVar.z.e(h.b.ON_STOP);
        a0 U = qVar.f1284y.f1297a.f1302r.U();
        if (U != null) {
            bundle.putParcelable("android:support:fragments", U);
        }
        return bundle;
    }
}

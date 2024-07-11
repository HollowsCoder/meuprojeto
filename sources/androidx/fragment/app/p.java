package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.d0;
import b.b;

public final class p implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f1265a;

    public p(q qVar) {
        this.f1265a = qVar;
    }

    public final void a() {
        q qVar = this.f1265a;
        v<?> vVar = qVar.f1284y.f1297a;
        vVar.f1302r.c(vVar, vVar, (n) null);
        Bundle a10 = qVar.f157s.f1884b.a("android:support:fragments");
        if (a10 != null) {
            Parcelable parcelable = a10.getParcelable("android:support:fragments");
            v<?> vVar2 = qVar.f1284y.f1297a;
            if (vVar2 instanceof d0) {
                vVar2.f1302r.T(parcelable);
                return;
            }
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
    }
}

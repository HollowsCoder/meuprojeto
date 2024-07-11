package w5;

import android.os.Bundle;
import android.view.View;
import com.google.android.material.bottomsheet.b;
import i0.a;

public final class e extends a {
    public final /* synthetic */ b d;

    public e(b bVar) {
        this.d = bVar;
    }

    public final void d(View view, j0.b bVar) {
        boolean z;
        this.f5951a.onInitializeAccessibilityNodeInfo(view, bVar.f6386a);
        if (this.d.u) {
            bVar.a(1048576);
            z = true;
        } else {
            z = false;
        }
        bVar.i(z);
    }

    public final boolean g(View view, int i10, Bundle bundle) {
        if (i10 == 1048576) {
            b bVar = this.d;
            if (bVar.u) {
                bVar.cancel();
                return true;
            }
        }
        return super.g(view, i10, bundle);
    }
}

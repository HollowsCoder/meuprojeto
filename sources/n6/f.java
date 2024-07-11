package n6;

import android.os.Bundle;
import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import i0.a;
import j0.b;

public final class f extends a {
    public final /* synthetic */ BaseTransientBottomBar d;

    public f(BaseTransientBottomBar baseTransientBottomBar) {
        this.d = baseTransientBottomBar;
    }

    public final void d(View view, b bVar) {
        this.f5951a.onInitializeAccessibilityNodeInfo(view, bVar.f6386a);
        bVar.a(1048576);
        bVar.i(true);
    }

    public final boolean g(View view, int i10, Bundle bundle) {
        if (i10 != 1048576) {
            return super.g(view, i10, bundle);
        }
        this.d.a();
        return true;
    }
}

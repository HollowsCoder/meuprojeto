package n6;

import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import i0.e0;
import i0.o;

public final class e implements o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f7489a;

    public e(BaseTransientBottomBar baseTransientBottomBar) {
        this.f7489a = baseTransientBottomBar;
    }

    public final e0 a(View view, e0 e0Var) {
        int a10 = e0Var.a();
        BaseTransientBottomBar baseTransientBottomBar = this.f7489a;
        baseTransientBottomBar.f3535h = a10;
        baseTransientBottomBar.f3536i = e0Var.b();
        baseTransientBottomBar.f3537j = e0Var.c();
        baseTransientBottomBar.f();
        return e0Var;
    }
}

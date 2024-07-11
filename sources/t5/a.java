package t5;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import i0.b0;
import i0.e0;
import i0.o;
import i0.w;
import java.util.Objects;
import java.util.WeakHashMap;

public final class a implements o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f8997a;

    public a(AppBarLayout appBarLayout) {
        this.f8997a = appBarLayout;
    }

    public final e0 a(View view, e0 e0Var) {
        e0 e0Var2;
        boolean z;
        AppBarLayout appBarLayout = this.f8997a;
        appBarLayout.getClass();
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        if (w.d.b(appBarLayout)) {
            e0Var2 = e0Var;
        } else {
            e0Var2 = null;
        }
        if (!Objects.equals(appBarLayout.u, e0Var2)) {
            appBarLayout.u = e0Var2;
            if (appBarLayout.C == null || appBarLayout.getTopInset() <= 0) {
                z = false;
            } else {
                z = true;
            }
            appBarLayout.setWillNotDraw(!z);
            appBarLayout.requestLayout();
        }
        return e0Var;
    }
}

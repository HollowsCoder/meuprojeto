package e;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.m1;
import b0.b;
import com.karumi.dexter.R;
import i0.b0;
import i0.e0;
import i0.o;
import i0.w;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import y.a;

public final class h implements o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f4381a;

    public h(g gVar) {
        this.f4381a = gVar;
    }

    public final e0 a(View view, e0 e0Var) {
        boolean z;
        e0 e0Var2;
        e0.e eVar;
        boolean z10;
        int i10;
        int i11;
        boolean z11;
        boolean z12;
        int i12;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i13;
        View view2 = view;
        e0 e0Var3 = e0Var;
        int d = e0Var.d();
        g gVar = this.f4381a;
        gVar.getClass();
        int d10 = e0Var.d();
        ActionBarContextView actionBarContextView = gVar.C;
        int i14 = 0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) gVar.C.getLayoutParams();
            if (gVar.C.isShown()) {
                if (gVar.f4345k0 == null) {
                    gVar.f4345k0 = new Rect();
                    gVar.f4346l0 = new Rect();
                }
                Rect rect = gVar.f4345k0;
                Rect rect2 = gVar.f4346l0;
                rect.set(e0Var.b(), e0Var.d(), e0Var.c(), e0Var.a());
                ViewGroup viewGroup = gVar.I;
                Method method = m1.f654a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, new Object[]{rect, rect2});
                    } catch (Exception e10) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e10);
                    }
                }
                int i15 = rect.top;
                int i16 = rect.left;
                int i17 = rect.right;
                ViewGroup viewGroup2 = gVar.I;
                WeakHashMap<View, b0> weakHashMap = w.f6004a;
                e0 a10 = w.j.a(viewGroup2);
                if (a10 == null) {
                    i10 = 0;
                } else {
                    i10 = a10.b();
                }
                if (a10 == null) {
                    i11 = 0;
                } else {
                    i11 = a10.c();
                }
                if (marginLayoutParams2.topMargin == i15 && marginLayoutParams2.leftMargin == i16 && marginLayoutParams2.rightMargin == i17) {
                    z11 = false;
                } else {
                    marginLayoutParams2.topMargin = i15;
                    marginLayoutParams2.leftMargin = i16;
                    marginLayoutParams2.rightMargin = i17;
                    z11 = true;
                }
                Context context = gVar.f4349r;
                if (i15 <= 0 || gVar.K != null) {
                    View view3 = gVar.K;
                    if (!(view3 == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view3.getLayoutParams()).height == (i13 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == i10 && marginLayoutParams.rightMargin == i11))) {
                        marginLayoutParams.height = i13;
                        marginLayoutParams.leftMargin = i10;
                        marginLayoutParams.rightMargin = i11;
                        gVar.K.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view4 = new View(context);
                    gVar.K = view4;
                    view4.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = i10;
                    layoutParams.rightMargin = i11;
                    gVar.I.addView(gVar.K, -1, layoutParams);
                }
                View view5 = gVar.K;
                if (view5 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && view5.getVisibility() != 0) {
                    View view6 = gVar.K;
                    if ((w.d.g(view6) & 8192) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        Object obj = a.f9523a;
                        i12 = R.color.abc_decor_view_status_guard_light;
                    } else {
                        Object obj2 = a.f9523a;
                        i12 = R.color.abc_decor_view_status_guard;
                    }
                    view6.setBackgroundColor(a.d.a(context, i12));
                }
                if (!gVar.P && z) {
                    d10 = 0;
                }
                z10 = z11;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z = false;
                z10 = true;
            } else {
                z = false;
                z10 = false;
            }
            if (z10) {
                gVar.C.setLayoutParams(marginLayoutParams2);
            }
        }
        View view7 = gVar.K;
        if (view7 != null) {
            if (!z) {
                i14 = 8;
            }
            view7.setVisibility(i14);
        }
        if (d != d10) {
            int b10 = e0Var.b();
            int c10 = e0Var.c();
            int a11 = e0Var.a();
            int i18 = Build.VERSION.SDK_INT;
            if (i18 >= 30) {
                eVar = new e0.d(e0Var3);
            } else if (i18 >= 29) {
                eVar = new e0.c(e0Var3);
            } else {
                eVar = new e0.b(e0Var3);
            }
            eVar.d(b.a(b10, d10, c10, a11));
            e0Var2 = eVar.b();
        } else {
            e0Var2 = e0Var3;
        }
        WeakHashMap<View, b0> weakHashMap2 = w.f6004a;
        WindowInsets f10 = e0Var2.f();
        if (f10 == null) {
            return e0Var2;
        }
        WindowInsets b11 = w.h.b(view2, f10);
        if (!b11.equals(f10)) {
            return e0.g(b11, view2);
        }
        return e0Var2;
    }
}

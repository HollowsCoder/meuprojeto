package t5;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.a;
import com.google.android.material.appbar.AppBarLayout;
import i0.b0;
import i0.e0;
import i0.w;
import java.util.ArrayList;
import java.util.WeakHashMap;

public abstract class d extends e<View> {

    /* renamed from: c  reason: collision with root package name */
    public final Rect f9008c = new Rect();
    public final Rect d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public int f9009e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f9010f;

    public d() {
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        AppBarLayout u;
        int i13;
        e0 lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 != -1 && i14 != -2) || (u = u(coordinatorLayout.f(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i12);
        if (size > 0) {
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            if (w.d.b(u) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.a() + lastWindowInsets.d();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        int w = (w(u) + size) - u.getMeasuredHeight();
        if (i14 == -1) {
            i13 = 1073741824;
        } else {
            i13 = Integer.MIN_VALUE;
        }
        coordinatorLayout.s(view, i10, i11, View.MeasureSpec.makeMeasureSpec(w, i13));
        return true;
    }

    public final void t(CoordinatorLayout coordinatorLayout, View view, int i10) {
        AppBarLayout u = u(coordinatorLayout.f(view));
        int i11 = 0;
        if (u != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            int paddingLeft = coordinatorLayout.getPaddingLeft() + fVar.leftMargin;
            int bottom = u.getBottom() + fVar.topMargin;
            int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - fVar.rightMargin;
            int height = coordinatorLayout.getHeight();
            Rect rect = this.f9008c;
            rect.set(paddingLeft, bottom, width, ((u.getBottom() + height) - coordinatorLayout.getPaddingBottom()) - fVar.bottomMargin);
            e0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null) {
                WeakHashMap<View, b0> weakHashMap = w.f6004a;
                if (w.d.b(coordinatorLayout) && !w.d.b(view)) {
                    rect.left = lastWindowInsets.b() + rect.left;
                    rect.right -= lastWindowInsets.c();
                }
            }
            Rect rect2 = this.d;
            int i12 = fVar.f944c;
            if (i12 == 0) {
                i12 = 8388659;
            }
            Gravity.apply(i12, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
            if (this.f9010f != 0) {
                float v10 = v(u);
                int i13 = this.f9010f;
                i11 = a.l((int) (v10 * ((float) i13)), 0, i13);
            }
            view.layout(rect2.left, rect2.top - i11, rect2.right, rect2.bottom - i11);
            i11 = rect2.top - u.getBottom();
        } else {
            View view2 = view;
            coordinatorLayout.r(view, i10);
        }
        this.f9009e = i11;
    }

    public abstract AppBarLayout u(ArrayList arrayList);

    public float v(View view) {
        return 1.0f;
    }

    public int w(View view) {
        return view.getMeasuredHeight();
    }
}

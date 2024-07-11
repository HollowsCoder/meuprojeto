package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import b0.d;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.R;
import i0.b0;
import i0.e0;
import i0.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import n.e;

public final class s extends FrameLayout {

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<View> f1293o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList<View> f1294p;

    /* renamed from: q  reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f1295q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1296r = true;

    public s(Context context) {
        super(context);
    }

    public s(Context context, AttributeSet attributeSet, y yVar) {
        super(context, attributeSet);
        View view;
        String str;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.u);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        n C = yVar.C(id);
        if (classAttribute != null && C == null) {
            if (id <= 0) {
                if (string != null) {
                    str = " with tag ".concat(string);
                } else {
                    str = BuildConfig.FLAVOR;
                }
                throw new IllegalStateException(d.f("FragmentContainerView must have an android:id to add Fragment ", classAttribute, str));
            }
            u F = yVar.F();
            context.getClassLoader();
            n a10 = F.a(classAttribute);
            a10.C(context, attributeSet, (Bundle) null);
            a aVar = new a(yVar);
            aVar.f1171p = true;
            a10.R = this;
            aVar.f(getId(), a10, string, 1);
            if (!aVar.f1163g) {
                aVar.f1164h = false;
                aVar.f1095q.y(aVar, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = yVar.f1310c.h().iterator();
        while (it.hasNext()) {
            e0 e0Var = (e0) it.next();
            n nVar = e0Var.f1145c;
            if (nVar.K == getId() && (view = nVar.S) != null && view.getParent() == null) {
                nVar.R = this;
                e0Var.b();
            }
        }
    }

    public final void a(View view) {
        ArrayList<View> arrayList = this.f1294p;
        if (arrayList != null && arrayList.contains(view)) {
            if (this.f1293o == null) {
                this.f1293o = new ArrayList<>();
            }
            this.f1293o.add(view);
        }
    }

    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        n nVar;
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof n) {
            nVar = (n) tag;
        } else {
            nVar = null;
        }
        if (nVar != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    public final boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z) {
        n nVar;
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof n) {
            nVar = (n) tag;
        } else {
            nVar = null;
        }
        if (nVar != null) {
            return super.addViewInLayout(view, i10, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        e0 e0Var;
        e0 g10 = e0.g(windowInsets, (View) null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1295q;
        if (onApplyWindowInsetsListener != null) {
            e0Var = e0.g(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets), (View) null);
        } else {
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            WindowInsets f10 = g10.f();
            if (f10 != null) {
                WindowInsets b10 = w.h.b(this, f10);
                if (!b10.equals(f10)) {
                    g10 = e0.g(b10, this);
                }
            }
            e0Var = g10;
        }
        if (!e0Var.f5969a.j()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                WeakHashMap<View, b0> weakHashMap2 = w.f6004a;
                WindowInsets f11 = e0Var.f();
                if (f11 != null) {
                    WindowInsets a10 = w.h.a(childAt, f11);
                    if (!a10.equals(f11)) {
                        e0.g(a10, childAt);
                    }
                }
            }
        }
        return windowInsets;
    }

    public final void dispatchDraw(Canvas canvas) {
        if (this.f1296r && this.f1293o != null) {
            for (int i10 = 0; i10 < this.f1293o.size(); i10++) {
                super.drawChild(canvas, this.f1293o.get(i10), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    public final boolean drawChild(Canvas canvas, View view, long j8) {
        ArrayList<View> arrayList;
        if (!this.f1296r || (arrayList = this.f1293o) == null || arrayList.size() <= 0 || !this.f1293o.contains(view)) {
            return super.drawChild(canvas, view, j8);
        }
        return false;
    }

    public final void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f1294p;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f1293o;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f1296r = true;
            }
        }
        super.endViewTransition(view);
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    public final void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    public final void removeDetachedView(View view, boolean z) {
        if (z) {
            a(view);
        }
        super.removeDetachedView(view, z);
    }

    public final void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    public final void removeViewAt(int i10) {
        a(getChildAt(i10));
        super.removeViewAt(i10);
    }

    public final void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    public final void removeViews(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            a(getChildAt(i12));
        }
        super.removeViews(i10, i11);
    }

    public final void removeViewsInLayout(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            a(getChildAt(i12));
        }
        super.removeViewsInLayout(i10, i11);
    }

    public void setDrawDisappearingViewsLast(boolean z) {
        this.f1296r = z;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f1295q = onApplyWindowInsetsListener;
    }

    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f1294p == null) {
                this.f1294p = new ArrayList<>();
            }
            this.f1294p.add(view);
        }
        super.startViewTransition(view);
    }
}

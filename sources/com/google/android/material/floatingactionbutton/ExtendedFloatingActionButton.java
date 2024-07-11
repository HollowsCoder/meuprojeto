package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import i0.b0;
import i0.w;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p9.u;
import s5.g;

public final class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    public static final /* synthetic */ int G = 0;

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f3472a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f3473b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f3474c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f3473b = false;
            this.f3474c = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.w);
            this.f3473b = obtainStyledAttributes.getBoolean(0, false);
            this.f3474c = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }

        public final /* bridge */ /* synthetic */ boolean a(View view, Rect rect) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            return false;
        }

        public final void c(CoordinatorLayout.f fVar) {
            if (fVar.f948h == 0) {
                fVar.f948h = 80;
            }
        }

        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean z;
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                s(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f) {
                    z = ((CoordinatorLayout.f) layoutParams).f942a instanceof BottomSheetBehavior;
                } else {
                    z = false;
                }
                if (z) {
                    t(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            boolean z;
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            ArrayList f10 = coordinatorLayout.f(extendedFloatingActionButton);
            int size = f10.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view2 = (View) f10.get(i11);
                if (view2 instanceof AppBarLayout) {
                    s(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.f) {
                        z = ((CoordinatorLayout.f) layoutParams).f942a instanceof BottomSheetBehavior;
                    } else {
                        z = false;
                    }
                    if (z) {
                        t(view2, extendedFloatingActionButton);
                    }
                }
            }
            coordinatorLayout.r(extendedFloatingActionButton, i10);
            return true;
        }

        public final boolean s(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z;
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            boolean z10 = this.f3473b;
            boolean z11 = this.f3474c;
            if ((z10 || z11) && fVar.f946f == appBarLayout.getId()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
            if (this.f3472a == null) {
                this.f3472a = new Rect();
            }
            Rect rect = this.f3472a;
            h6.d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                int i10 = ExtendedFloatingActionButton.G;
                throw null;
            }
            int i11 = ExtendedFloatingActionButton.G;
            throw null;
        }

        public final boolean t(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z;
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            boolean z10 = this.f3473b;
            boolean z11 = this.f3474c;
            if ((z10 || z11) && fVar.f946f == view.getId()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                int i10 = ExtendedFloatingActionButton.G;
                throw null;
            }
            int i11 = ExtendedFloatingActionButton.G;
            throw null;
        }
    }

    public static class a extends Property<View, Float> {
        public a() {
            super(Float.class, "width");
        }

        public final Object get(Object obj) {
            return Float.valueOf((float) ((View) obj).getLayoutParams().width);
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            view.getLayoutParams().width = ((Float) obj2).intValue();
            view.requestLayout();
        }
    }

    public static class b extends Property<View, Float> {
        public b() {
            super(Float.class, "height");
        }

        public final Object get(Object obj) {
            return Float.valueOf((float) ((View) obj).getLayoutParams().height);
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            view.getLayoutParams().height = ((Float) obj2).intValue();
            view.requestLayout();
        }
    }

    public static class c extends Property<View, Float> {
        public c() {
            super(Float.class, "paddingStart");
        }

        public final Object get(Object obj) {
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            return Float.valueOf((float) w.e.f((View) obj));
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            int intValue = ((Float) obj2).intValue();
            int paddingTop = view.getPaddingTop();
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            w.e.k(view, intValue, paddingTop, w.e.e(view), view.getPaddingBottom());
        }
    }

    public static class d extends Property<View, Float> {
        public d() {
            super(Float.class, "paddingEnd");
        }

        public final Object get(Object obj) {
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            return Float.valueOf((float) w.e.e((View) obj));
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            w.e.k(view, w.e.f(view), view.getPaddingTop(), ((Float) obj2).intValue(), view.getPaddingBottom());
        }
    }

    static {
        new a();
        new b();
        new c();
        new d();
    }

    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        return 0;
    }

    public g getExtendMotionSpec() {
        throw null;
    }

    public g getHideMotionSpec() {
        throw null;
    }

    public g getShowMotionSpec() {
        throw null;
    }

    public g getShrinkMotionSpec() {
        throw null;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setAnimateShowBeforeLayout(boolean z) {
    }

    public void setExtendMotionSpec(g gVar) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i10) {
        setExtendMotionSpec(g.b(getContext(), i10));
    }

    public void setExtended(boolean z) {
        if (z) {
            throw null;
        }
    }

    public void setHideMotionSpec(g gVar) {
        throw null;
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(g.b(getContext(), i10));
    }

    public final void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
    }

    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
    }

    public void setShowMotionSpec(g gVar) {
        throw null;
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(g.b(getContext(), i10));
    }

    public void setShrinkMotionSpec(g gVar) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i10) {
        setShrinkMotionSpec(g.b(getContext(), i10));
    }

    public void setTextColor(int i10) {
        super.setTextColor(i10);
        getTextColors();
    }

    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        getTextColors();
    }
}

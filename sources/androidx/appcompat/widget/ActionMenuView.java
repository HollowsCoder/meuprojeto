package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.c;
import androidx.appcompat.widget.o0;
import i0.i;
import java.util.Iterator;

public class ActionMenuView extends o0 implements f.b, k {
    public f D;
    public Context E;
    public int F;
    public boolean G;
    public c H;
    public j.a I;
    public f.a J;
    public boolean K;
    public int L;
    public final int M;
    public final int N;
    public e O;

    public interface a {
        boolean a();

        boolean b();
    }

    public static class b implements j.a {
        public final void b(f fVar, boolean z) {
        }

        public final boolean c(f fVar) {
            return false;
        }
    }

    public static class c extends o0.a {
        @ViewDebug.ExportedProperty

        /* renamed from: a  reason: collision with root package name */
        public boolean f403a;
        @ViewDebug.ExportedProperty

        /* renamed from: b  reason: collision with root package name */
        public int f404b;
        @ViewDebug.ExportedProperty

        /* renamed from: c  reason: collision with root package name */
        public int f405c;
        @ViewDebug.ExportedProperty
        public boolean d;
        @ViewDebug.ExportedProperty

        /* renamed from: e  reason: collision with root package name */
        public boolean f406e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f407f;

        public c() {
            super(-2, -2);
            this.f403a = false;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f403a = cVar.f403a;
        }
    }

    public class d implements f.a {
        public d() {
        }

        public final boolean a(f fVar, MenuItem menuItem) {
            boolean z;
            e eVar = ActionMenuView.this.O;
            if (eVar == null) {
                return false;
            }
            Iterator<i> it = Toolbar.this.U.f5994a.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().b()) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                return true;
            }
            return false;
        }

        public final void b(f fVar) {
            f.a aVar = ActionMenuView.this.J;
            if (aVar != null) {
                aVar.b(fVar);
            }
        }
    }

    public interface e {
    }

    public ActionMenuView() {
        throw null;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.M = (int) (56.0f * f10);
        this.N = (int) (f10 * 4.0f);
        this.E = context;
        this.F = 0;
    }

    public static c j(ViewGroup.LayoutParams layoutParams) {
        c cVar;
        if (layoutParams != null) {
            if (layoutParams instanceof c) {
                cVar = new c((c) layoutParams);
            } else {
                cVar = new c(layoutParams);
            }
            if (cVar.gravity <= 0) {
                cVar.gravity = 16;
            }
            return cVar;
        }
        c cVar2 = new c();
        cVar2.gravity = 16;
        return cVar2;
    }

    public final boolean a(h hVar) {
        return this.D.q(hVar, (j) null, 0);
    }

    public final void b(f fVar) {
        this.D = fVar;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final o0.a f() {
        c cVar = new c();
        cVar.gravity = 16;
        return cVar;
    }

    public final o0.a g(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        c cVar = new c();
        cVar.gravity = 16;
        return cVar;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public Menu getMenu() {
        if (this.D == null) {
            Context context = getContext();
            f fVar = new f(context);
            this.D = fVar;
            fVar.f317e = new d();
            c cVar = new c(context);
            this.H = cVar;
            cVar.z = true;
            cVar.A = true;
            j.a aVar = this.I;
            if (aVar == null) {
                aVar = new b();
            }
            cVar.f278s = aVar;
            this.D.b(cVar, this.E);
            c cVar2 = this.H;
            cVar2.f280v = this;
            this.D = cVar2.f276q;
        }
        return this.D;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        c cVar = this.H;
        c.d dVar = cVar.w;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (cVar.f512y) {
            return cVar.f511x;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.F;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ o0.a h(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public final boolean k(int i10) {
        boolean z = false;
        if (i10 == 0) {
            return false;
        }
        View childAt = getChildAt(i10 - 1);
        View childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof a)) {
            z = false | ((a) childAt).a();
        }
        return (i10 <= 0 || !(childAt2 instanceof a)) ? z : z | ((a) childAt2).b();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c cVar = this.H;
        if (cVar != null) {
            cVar.f();
            if (this.H.g()) {
                this.H.c();
                this.H.l();
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.H;
        if (cVar != null) {
            cVar.c();
            c.a aVar = cVar.H;
            if (aVar != null && aVar.b()) {
                aVar.f367j.dismiss();
            }
        }
    }

    public final void onLayout(boolean z, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        if (!this.K) {
            super.onLayout(z, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i16 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i17 = i12 - i10;
        int paddingRight = (i17 - getPaddingRight()) - getPaddingLeft();
        boolean a10 = m1.a(this);
        int i18 = 0;
        int i19 = 0;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f403a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i20)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a10) {
                        i14 = getPaddingLeft() + cVar.leftMargin;
                        i15 = i14 + measuredWidth;
                    } else {
                        i15 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i14 = i15 - measuredWidth;
                    }
                    int i21 = i16 - (measuredHeight / 2);
                    childAt.layout(i14, i21, i15, measuredHeight + i21);
                    paddingRight -= measuredWidth;
                    i18 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    k(i20);
                    i19++;
                }
            }
        }
        if (childCount == 1 && i18 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i22 = (i17 / 2) - (measuredWidth2 / 2);
            int i23 = i16 - (measuredHeight2 / 2);
            childAt2.layout(i22, i23, measuredWidth2 + i22, measuredHeight2 + i23);
            return;
        }
        int i24 = i19 - (i18 ^ 1);
        int max = Math.max(0, i24 > 0 ? paddingRight / i24 : 0);
        if (a10) {
            int width = getWidth() - getPaddingRight();
            for (int i25 = 0; i25 < childCount; i25++) {
                View childAt3 = getChildAt(i25);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f403a) {
                    int i26 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i27 = i16 - (measuredHeight3 / 2);
                    childAt3.layout(i26 - measuredWidth3, i27, i26, measuredHeight3 + i27);
                    width = i26 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i28 = 0; i28 < childCount; i28++) {
            View childAt4 = getChildAt(i28);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f403a) {
                int i29 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i30 = i16 - (measuredHeight4 / 2);
                childAt4.layout(i29, i30, i29 + measuredWidth4, measuredHeight4 + i30);
                paddingLeft = measuredWidth4 + cVar3.rightMargin + max + i29;
            }
        }
    }

    public final void onMeasure(int i10, int i11) {
        boolean z;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z14;
        int i18;
        int i19;
        boolean z15;
        int i20;
        ActionMenuItemView actionMenuItemView;
        boolean z16;
        int i21;
        boolean z17;
        f fVar;
        boolean z18 = this.K;
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        this.K = z;
        if (z18 != z) {
            this.L = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (!(!this.K || (fVar = this.D) == null || size == this.L)) {
            this.L = size;
            fVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.K || childCount <= 0) {
            int i22 = i11;
            for (int i23 = 0; i23 < childCount; i23++) {
                c cVar = (c) getChildAt(i23).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(i11);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
        int i24 = size2 - paddingRight;
        int i25 = this.M;
        int i26 = i24 / i25;
        int i27 = i24 % i25;
        if (i26 == 0) {
            setMeasuredDimension(i24, 0);
            return;
        }
        int i28 = (i27 / i26) + i25;
        int childCount2 = getChildCount();
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        boolean z19 = false;
        int i33 = 0;
        long j8 = 0;
        while (true) {
            i12 = this.N;
            if (i32 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i32);
            int i34 = size3;
            int i35 = i24;
            if (childAt.getVisibility() == 8) {
                i18 = mode;
                i19 = paddingBottom;
            } else {
                boolean z20 = childAt instanceof ActionMenuItemView;
                int i36 = i30 + 1;
                if (z20) {
                    childAt.setPadding(i12, 0, i12, 0);
                }
                c cVar2 = (c) childAt.getLayoutParams();
                cVar2.f407f = false;
                cVar2.f405c = 0;
                cVar2.f404b = 0;
                cVar2.d = false;
                cVar2.leftMargin = 0;
                cVar2.rightMargin = 0;
                if (!z20 || !((ActionMenuItemView) childAt).d()) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                cVar2.f406e = z15;
                if (cVar2.f403a) {
                    i20 = 1;
                } else {
                    i20 = i26;
                }
                int i37 = i36;
                c cVar3 = (c) childAt.getLayoutParams();
                i18 = mode;
                i19 = paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                if (z20) {
                    actionMenuItemView = (ActionMenuItemView) childAt;
                } else {
                    actionMenuItemView = null;
                }
                if (actionMenuItemView == null || !actionMenuItemView.d()) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                if (i20 <= 0 || (z16 && i20 < 2)) {
                    i21 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i20 * i28, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i21 = measuredWidth / i28;
                    if (measuredWidth % i28 != 0) {
                        i21++;
                    }
                    if (z16 && i21 < 2) {
                        i21 = 2;
                    }
                }
                if (cVar3.f403a || !z16) {
                    z17 = false;
                } else {
                    z17 = true;
                }
                cVar3.d = z17;
                cVar3.f404b = i21;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i28 * i21, 1073741824), makeMeasureSpec);
                i31 = Math.max(i31, i21);
                if (cVar2.d) {
                    i33++;
                }
                if (cVar2.f403a) {
                    z19 = true;
                }
                i26 -= i21;
                i29 = Math.max(i29, childAt.getMeasuredHeight());
                if (i21 == 1) {
                    j8 |= (long) (1 << i32);
                }
                i30 = i37;
            }
            i32++;
            size3 = i34;
            i24 = i35;
            paddingBottom = i19;
            mode = i18;
        }
        int i38 = mode;
        int i39 = i24;
        int i40 = size3;
        if (!z19 || i30 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z21 = false;
        while (true) {
            if (i33 <= 0 || i26 <= 0) {
                z11 = z21;
            } else {
                int i41 = Integer.MAX_VALUE;
                int i42 = 0;
                int i43 = 0;
                long j10 = 0;
                while (i43 < childCount2) {
                    c cVar4 = (c) getChildAt(i43).getLayoutParams();
                    boolean z22 = z21;
                    if (cVar4.d) {
                        int i44 = cVar4.f404b;
                        if (i44 < i41) {
                            j10 = 1 << i43;
                            i41 = i44;
                            i42 = 1;
                        } else if (i44 == i41) {
                            j10 |= 1 << i43;
                            i42++;
                        }
                    }
                    i43++;
                    z21 = z22;
                }
                z11 = z21;
                j8 |= j10;
                if (i42 > i26) {
                    break;
                }
                int i45 = i41 + 1;
                int i46 = 0;
                while (i46 < childCount2) {
                    View childAt2 = getChildAt(i46);
                    c cVar5 = (c) childAt2.getLayoutParams();
                    int i47 = i29;
                    int i48 = childMeasureSpec;
                    int i49 = childCount2;
                    long j11 = (long) (1 << i46);
                    if ((j10 & j11) != 0) {
                        if (!z10 || !cVar5.f406e) {
                            z14 = true;
                        } else {
                            z14 = true;
                            if (i26 == 1) {
                                childAt2.setPadding(i12 + i28, 0, i12, 0);
                            }
                        }
                        cVar5.f404b += z14 ? 1 : 0;
                        cVar5.f407f = z14;
                        i26--;
                    } else if (cVar5.f404b == i45) {
                        j8 |= j11;
                    }
                    i46++;
                    childMeasureSpec = i48;
                    i29 = i47;
                    childCount2 = i49;
                }
                z21 = true;
            }
        }
        z11 = z21;
        int i50 = i29;
        int i51 = childMeasureSpec;
        int i52 = childCount2;
        if (z19 || i30 != 1) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (i26 <= 0 || j8 == 0 || (i26 >= i30 - 1 && !z12 && i31 <= 1)) {
            i13 = i52;
            z13 = z11;
        } else {
            float bitCount = (float) Long.bitCount(j8);
            if (!z12) {
                if ((j8 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f406e) {
                    bitCount -= 0.5f;
                }
                int i53 = i52 - 1;
                if ((j8 & ((long) (1 << i53))) != 0 && !((c) getChildAt(i53).getLayoutParams()).f406e) {
                    bitCount -= 0.5f;
                }
            }
            if (bitCount > 0.0f) {
                i17 = (int) (((float) (i26 * i28)) / bitCount);
            } else {
                i17 = 0;
            }
            boolean z23 = z11;
            i13 = i52;
            for (int i54 = 0; i54 < i13; i54++) {
                if ((j8 & ((long) (1 << i54))) != 0) {
                    View childAt3 = getChildAt(i54);
                    c cVar6 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar6.f405c = i17;
                        cVar6.f407f = true;
                        if (i54 == 0 && !cVar6.f406e) {
                            cVar6.leftMargin = (-i17) / 2;
                        }
                        z23 = true;
                    } else {
                        if (cVar6.f403a) {
                            cVar6.f405c = i17;
                            cVar6.f407f = true;
                            cVar6.rightMargin = (-i17) / 2;
                            z23 = true;
                        } else {
                            if (i54 != 0) {
                                cVar6.leftMargin = i17 / 2;
                            }
                            if (i54 != i13 - 1) {
                                cVar6.rightMargin = i17 / 2;
                            }
                        }
                    }
                }
            }
            z13 = z23;
        }
        if (z13) {
            int i55 = 0;
            while (i55 < i13) {
                View childAt4 = getChildAt(i55);
                c cVar7 = (c) childAt4.getLayoutParams();
                if (!cVar7.f407f) {
                    i16 = i51;
                } else {
                    i16 = i51;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar7.f404b * i28) + cVar7.f405c, 1073741824), i16);
                }
                i55++;
                i51 = i16;
            }
        }
        if (i38 != 1073741824) {
            i15 = i39;
            i14 = i50;
        } else {
            i14 = i40;
            i15 = i39;
        }
        setMeasuredDimension(i15, i14);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.H.E = z;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.O = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        c cVar = this.H;
        c.d dVar = cVar.w;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        cVar.f512y = true;
        cVar.f511x = drawable;
    }

    public void setOverflowReserved(boolean z) {
        this.G = z;
    }

    public void setPopupTheme(int i10) {
        if (this.F != i10) {
            this.F = i10;
            if (i10 == 0) {
                this.E = getContext();
            } else {
                this.E = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(c cVar) {
        this.H = cVar;
        cVar.f280v = this;
        this.D = cVar.f276q;
    }
}

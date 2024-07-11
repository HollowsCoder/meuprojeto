package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.f;
import com.karumi.dexter.R;
import e.g;
import e.r;
import i0.b0;
import i0.e0;
import i0.l;
import i0.m;
import i0.n;
import i0.w;
import java.util.WeakHashMap;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements i0, l, m {
    public static final int[] P = {R.attr.actionBarSize, 16842841};
    public int A;
    public final Rect B = new Rect();
    public final Rect C = new Rect();
    public final Rect D = new Rect();
    public e0 E;
    public e0 F;
    public e0 G;
    public e0 H;
    public d I;
    public OverScroller J;
    public ViewPropertyAnimator K;
    public final a L;
    public final b M;
    public final c N;
    public final n O;

    /* renamed from: o  reason: collision with root package name */
    public int f391o;

    /* renamed from: p  reason: collision with root package name */
    public int f392p = 0;

    /* renamed from: q  reason: collision with root package name */
    public ContentFrameLayout f393q;

    /* renamed from: r  reason: collision with root package name */
    public ActionBarContainer f394r;

    /* renamed from: s  reason: collision with root package name */
    public j0 f395s;

    /* renamed from: t  reason: collision with root package name */
    public Drawable f396t;
    public boolean u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f397v;
    public boolean w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f398x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f399y;
    public int z;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.K = null;
            actionBarOverlayLayout.f399y = false;
        }

        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.K = null;
            actionBarOverlayLayout.f399y = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.q();
            actionBarOverlayLayout.K = actionBarOverlayLayout.f394r.animate().translationY(0.0f).setListener(actionBarOverlayLayout.L);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.q();
            actionBarOverlayLayout.K = actionBarOverlayLayout.f394r.animate().translationY((float) (-actionBarOverlayLayout.f394r.getHeight())).setListener(actionBarOverlayLayout.L);
        }
    }

    public interface d {
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e() {
            super(-1, -1);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        e0 e0Var = e0.f5968b;
        this.E = e0Var;
        this.F = e0Var;
        this.G = e0Var;
        this.H = e0Var;
        this.L = new a();
        this.M = new b();
        this.N = new c();
        r(context);
        this.O = new n();
    }

    public static boolean p(FrameLayout frameLayout, Rect rect, boolean z10) {
        boolean z11;
        int i10;
        e eVar = (e) frameLayout.getLayoutParams();
        int i11 = eVar.leftMargin;
        int i12 = rect.left;
        if (i11 != i12) {
            eVar.leftMargin = i12;
            z11 = true;
        } else {
            z11 = false;
        }
        int i13 = eVar.topMargin;
        int i14 = rect.top;
        if (i13 != i14) {
            eVar.topMargin = i14;
            z11 = true;
        }
        int i15 = eVar.rightMargin;
        int i16 = rect.right;
        if (i15 != i16) {
            eVar.rightMargin = i16;
            z11 = true;
        }
        if (!z10 || eVar.bottomMargin == (i10 = rect.bottom)) {
            return z11;
        }
        eVar.bottomMargin = i10;
        return true;
    }

    public final boolean a() {
        s();
        return this.f395s.a();
    }

    public final void b(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    public final void c() {
        s();
        this.f395s.c();
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public final boolean d() {
        s();
        return this.f395s.d();
    }

    public final void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        if (this.f396t != null && !this.u) {
            if (this.f394r.getVisibility() == 0) {
                i10 = (int) (this.f394r.getTranslationY() + ((float) this.f394r.getBottom()) + 0.5f);
            } else {
                i10 = 0;
            }
            this.f396t.setBounds(0, i10, getWidth(), this.f396t.getIntrinsicHeight() + i10);
            this.f396t.draw(canvas);
        }
    }

    public final boolean e() {
        s();
        return this.f395s.e();
    }

    public final boolean f() {
        s();
        return this.f395s.f();
    }

    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public final void g(f fVar, g.b bVar) {
        s();
        this.f395s.g(fVar, bVar);
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f394r;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        n nVar = this.O;
        return nVar.f6000b | nVar.f5999a;
    }

    public CharSequence getTitle() {
        s();
        return this.f395s.getTitle();
    }

    public final boolean h() {
        s();
        return this.f395s.h();
    }

    public final void i(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    public final void j(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    public final void k(int i10) {
        s();
        if (i10 == 2) {
            this.f395s.s();
        } else if (i10 == 5) {
            this.f395s.t();
        } else if (i10 == 109) {
            setOverlayMode(true);
        }
    }

    public final void l() {
        s();
        this.f395s.i();
    }

    public final void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        n(view, i10, i11, i12, i13, i14);
    }

    public final void n(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    public final boolean o(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        s();
        e0 g10 = e0.g(windowInsets, this);
        boolean p10 = p(this.f394r, new Rect(g10.b(), g10.d(), g10.c(), g10.a()), false);
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        Rect rect = this.B;
        w.i.b(this, g10, rect);
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        e0.k kVar = g10.f5969a;
        e0 i14 = kVar.i(i10, i11, i12, i13);
        this.E = i14;
        boolean z10 = true;
        if (!this.F.equals(i14)) {
            this.F = this.E;
            p10 = true;
        }
        Rect rect2 = this.C;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        } else {
            z10 = p10;
        }
        if (z10) {
            requestLayout();
        }
        return kVar.a().f5969a.c().f5969a.b().f();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r(getContext());
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        w.h.c(this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q();
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = eVar.leftMargin + paddingLeft;
                int i16 = eVar.topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        e0 e0Var;
        e0.e eVar;
        s();
        measureChildWithMargins(this.f394r, i10, 0, i11, 0);
        e eVar2 = (e) this.f394r.getLayoutParams();
        int max = Math.max(0, this.f394r.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max2 = Math.max(0, this.f394r.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f394r.getMeasuredState());
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        if ((w.d.g(this) & 256) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i12 = this.f391o;
            if (this.w && this.f394r.getTabContainer() != null) {
                i12 += this.f391o;
            }
        } else {
            i12 = this.f394r.getVisibility() != 8 ? this.f394r.getMeasuredHeight() : 0;
        }
        Rect rect = this.B;
        Rect rect2 = this.D;
        rect2.set(rect);
        e0 e0Var2 = this.E;
        this.G = e0Var2;
        if (this.f397v || z10) {
            b0.b a10 = b0.b.a(e0Var2.b(), this.G.d() + i12, this.G.c(), this.G.a() + 0);
            e0 e0Var3 = this.G;
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 30) {
                eVar = new e0.d(e0Var3);
            } else if (i13 >= 29) {
                eVar = new e0.c(e0Var3);
            } else {
                eVar = new e0.b(e0Var3);
            }
            eVar.d(a10);
            e0Var = eVar.b();
        } else {
            rect2.top += i12;
            rect2.bottom += 0;
            e0Var = e0Var2.f5969a.i(0, i12, 0, 0);
        }
        this.G = e0Var;
        p(this.f393q, rect2, true);
        if (!this.H.equals(this.G)) {
            e0 e0Var4 = this.G;
            this.H = e0Var4;
            ContentFrameLayout contentFrameLayout = this.f393q;
            WindowInsets f10 = e0Var4.f();
            if (f10 != null) {
                WindowInsets a11 = w.h.a(contentFrameLayout, f10);
                if (!a11.equals(f10)) {
                    e0.g(a11, contentFrameLayout);
                }
            }
        }
        measureChildWithMargins(this.f393q, i10, 0, i11, 0);
        e eVar3 = (e) this.f393q.getLayoutParams();
        int max3 = Math.max(max, this.f393q.getMeasuredWidth() + eVar3.leftMargin + eVar3.rightMargin);
        int max4 = Math.max(max2, this.f393q.getMeasuredHeight() + eVar3.topMargin + eVar3.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f393q.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        boolean z11 = false;
        if (!this.f398x || !z10) {
            return false;
        }
        this.J.fling(0, 0, 0, (int) f11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.J.getFinalY() > this.f394r.getHeight()) {
            z11 = true;
        }
        if (z11) {
            q();
            this.N.run();
        } else {
            q();
            this.M.run();
        }
        this.f399y = true;
        return true;
    }

    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.z + i11;
        this.z = i14;
        setActionBarHideOffset(i14);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = (e.r) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3) {
        /*
            r0 = this;
            i0.n r1 = r0.O
            r1.f5999a = r3
            int r1 = r0.getActionBarHideOffset()
            r0.z = r1
            r0.q()
            androidx.appcompat.widget.ActionBarOverlayLayout$d r1 = r0.I
            if (r1 == 0) goto L_0x001d
            e.r r1 = (e.r) r1
            h.g r2 = r1.f4432t
            if (r2 == 0) goto L_0x001d
            r2.a()
            r2 = 0
            r1.f4432t = r2
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onNestedScrollAccepted(android.view.View, android.view.View, int):void");
    }

    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f394r.getVisibility() != 0) {
            return false;
        }
        return this.f398x;
    }

    public final void onStopNestedScroll(View view) {
        if (this.f398x && !this.f399y) {
            if (this.z <= this.f394r.getHeight()) {
                q();
                postDelayed(this.M, 600);
                return;
            }
            q();
            postDelayed(this.N, 600);
        }
    }

    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i10) {
        boolean z10;
        boolean z11;
        super.onWindowSystemUiVisibilityChanged(i10);
        s();
        int i11 = this.A ^ i10;
        this.A = i10;
        if ((i10 & 4) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i10 & 256) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        d dVar = this.I;
        if (dVar != null) {
            ((r) dVar).f4428p = !z11;
            if (z10 || !z11) {
                r rVar = (r) dVar;
                if (rVar.f4429q) {
                    rVar.f4429q = false;
                    rVar.f(true);
                }
            } else {
                r rVar2 = (r) dVar;
                if (!rVar2.f4429q) {
                    rVar2.f4429q = true;
                    rVar2.f(true);
                }
            }
        }
        if ((i11 & 256) != 0 && this.I != null) {
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            w.h.c(this);
        }
    }

    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f392p = i10;
        d dVar = this.I;
        if (dVar != null) {
            ((r) dVar).f4427o = i10;
        }
    }

    public final void q() {
        removeCallbacks(this.M);
        removeCallbacks(this.N);
        ViewPropertyAnimator viewPropertyAnimator = this.K;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void r(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(P);
        boolean z10 = false;
        this.f391o = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f396t = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z10 = true;
        }
        this.u = z10;
        this.J = new OverScroller(context);
    }

    public final void s() {
        j0 j0Var;
        if (this.f393q == null) {
            this.f393q = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f394r = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof j0) {
                j0Var = (j0) findViewById;
            } else if (findViewById instanceof Toolbar) {
                j0Var = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.f395s = j0Var;
        }
    }

    public void setActionBarHideOffset(int i10) {
        q();
        this.f394r.setTranslationY((float) (-Math.max(0, Math.min(i10, this.f394r.getHeight()))));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.I = dVar;
        if (getWindowToken() != null) {
            ((r) this.I).f4427o = this.f392p;
            int i10 = this.A;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                WeakHashMap<View, b0> weakHashMap = w.f6004a;
                w.h.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.w = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f398x) {
            this.f398x = z10;
            if (!z10) {
                q();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i10) {
        s();
        this.f395s.setIcon(i10);
    }

    public void setIcon(Drawable drawable) {
        s();
        this.f395s.setIcon(drawable);
    }

    public void setLogo(int i10) {
        s();
        this.f395s.p(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f397v = z10;
        this.u = z10 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    public void setWindowCallback(Window.Callback callback) {
        s();
        this.f395s.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        s();
        this.f395s.setWindowTitle(charSequence);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}

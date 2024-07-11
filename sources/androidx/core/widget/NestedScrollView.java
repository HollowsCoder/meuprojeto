package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.karumi.dexter.R;
import i0.b0;
import i0.j;
import i0.k;
import i0.m;
import i0.n;
import i0.w;
import j0.b;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l0.c;

public class NestedScrollView extends FrameLayout implements m, j {
    public static final a O = new a();
    public static final int[] P = {16843130};
    public boolean A = true;
    public int B;
    public int C;
    public int D;
    public int E = -1;
    public final int[] F = new int[2];
    public final int[] G = new int[2];
    public int H;
    public int I;
    public c J;
    public final n K;
    public final k L;
    public float M;
    public b N;

    /* renamed from: o  reason: collision with root package name */
    public long f980o;

    /* renamed from: p  reason: collision with root package name */
    public final Rect f981p = new Rect();

    /* renamed from: q  reason: collision with root package name */
    public OverScroller f982q;

    /* renamed from: r  reason: collision with root package name */
    public final EdgeEffect f983r;

    /* renamed from: s  reason: collision with root package name */
    public final EdgeEffect f984s;

    /* renamed from: t  reason: collision with root package name */
    public int f985t;
    public boolean u = true;

    /* renamed from: v  reason: collision with root package name */
    public boolean f986v = false;
    public View w = null;

    /* renamed from: x  reason: collision with root package name */
    public boolean f987x = false;

    /* renamed from: y  reason: collision with root package name */
    public VelocityTracker f988y;
    public boolean z;

    public static class a extends i0.a {
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            boolean z;
            super.c(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            if (nestedScrollView.getScrollRange() > 0) {
                z = true;
            } else {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
        }

        public final void d(View view, j0.b bVar) {
            int scrollRange;
            View.AccessibilityDelegate accessibilityDelegate = this.f5951a;
            AccessibilityNodeInfo accessibilityNodeInfo = bVar.f6386a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            bVar.g(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                accessibilityNodeInfo.setScrollable(true);
                if (nestedScrollView.getScrollY() > 0) {
                    bVar.b(b.a.f6391g);
                    bVar.b(b.a.f6395k);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    bVar.b(b.a.f6390f);
                    bVar.b(b.a.l);
                }
            }
        }

        public final boolean g(View view, int i10, Bundle bundle) {
            if (super.g(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i10 != 4096) {
                if (i10 == 8192 || i10 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.t(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                    return true;
                } else if (i10 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.t(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
            return true;
        }
    }

    public interface b {
    }

    public static class c extends View.BaseSavedState {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: o  reason: collision with root package name */
        public int f989o;

        public class a implements Parcelable.Creator<c> {
            public final Object createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            public final Object[] newArray(int i10) {
                return new c[i10];
            }
        }

        public c(Parcel parcel) {
            super(parcel);
            this.f989o = parcel.readInt();
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f989o + "}";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f989o);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.nestedScrollViewStyle);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        if (e0.a.a()) {
            edgeEffect = c.a.a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f983r = edgeEffect;
        if (e0.a.a()) {
            edgeEffect2 = c.a.a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f984s = edgeEffect2;
        this.f982q = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.B = viewConfiguration.getScaledTouchSlop();
        this.C = viewConfiguration.getScaledMinimumFlingVelocity();
        this.D = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, P, R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.K = new n();
        this.L = new k(this);
        setNestedScrollingEnabled(true);
        w.k(this, O);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.M == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.M = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.M;
    }

    public static boolean k(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && k((View) parent, view2);
    }

    public final boolean a(int i10) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !l(findNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            d(maxScrollAmount);
        } else {
            Rect rect = this.f981p;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            d(c(rect));
            findNextFocus.requestFocus(i10);
        }
        if (findFocus != null && findFocus.isFocused() && (!l(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void b(View view, View view2, int i10, int i11) {
        n nVar = this.K;
        if (i11 == 1) {
            nVar.f6000b = i10;
        } else {
            nVar.f5999a = i10;
        }
        this.L.g(2, i11);
    }

    public final int c(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i11) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        } else if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006d, code lost:
        if (r0.isFinished() != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0076, code lost:
        if (r0.isFinished() != false) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void computeScroll() {
        /*
            r13 = this;
            android.widget.OverScroller r0 = r13.f982q
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            android.widget.OverScroller r0 = r13.f982q
            r0.computeScrollOffset()
            android.widget.OverScroller r0 = r13.f982q
            int r0 = r0.getCurrY()
            int r1 = r13.I
            int r1 = r0 - r1
            r13.I = r0
            int[] r0 = r13.G
            r10 = 1
            r11 = 0
            r0[r10] = r11
            r3 = 0
            r6 = 0
            r7 = 1
            i0.k r2 = r13.L
            r4 = r1
            r5 = r0
            r2.c(r3, r4, r5, r6, r7)
            r2 = r0[r10]
            int r1 = r1 - r2
            int r12 = r13.getScrollRange()
            if (r1 == 0) goto L_0x0056
            int r2 = r13.getScrollY()
            int r3 = r13.getScrollX()
            r13.r(r1, r3, r2, r12)
            int r3 = r13.getScrollY()
            int r4 = r3 - r2
            int r1 = r1 - r4
            r0[r10] = r11
            int[] r7 = r13.F
            r8 = 1
            r3 = 0
            r5 = 0
            i0.k r2 = r13.L
            r6 = r1
            r9 = r0
            r2.e(r3, r4, r5, r6, r7, r8, r9)
            r0 = r0[r10]
            int r1 = r1 - r0
        L_0x0056:
            if (r1 == 0) goto L_0x008a
            int r0 = r13.getOverScrollMode()
            if (r0 == 0) goto L_0x0062
            if (r0 != r10) goto L_0x0063
            if (r12 <= 0) goto L_0x0063
        L_0x0062:
            r11 = r10
        L_0x0063:
            if (r11 == 0) goto L_0x0082
            if (r1 >= 0) goto L_0x0070
            android.widget.EdgeEffect r0 = r13.f983r
            boolean r1 = r0.isFinished()
            if (r1 == 0) goto L_0x0082
            goto L_0x0078
        L_0x0070:
            android.widget.EdgeEffect r0 = r13.f984s
            boolean r1 = r0.isFinished()
            if (r1 == 0) goto L_0x0082
        L_0x0078:
            android.widget.OverScroller r1 = r13.f982q
            float r1 = r1.getCurrVelocity()
            int r1 = (int) r1
            r0.onAbsorb(r1)
        L_0x0082:
            android.widget.OverScroller r0 = r13.f982q
            r0.abortAnimation()
            r13.v(r10)
        L_0x008a:
            android.widget.OverScroller r0 = r13.f982q
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0098
            java.util.WeakHashMap<android.view.View, i0.b0> r0 = i0.w.f6004a
            i0.w.d.k(r13)
            goto L_0x009b
        L_0x0098:
            r13.v(r10)
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public final void d(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.A) {
            t(0, i10, false);
        } else {
            scrollBy(0, i10);
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || f(keyEvent);
    }

    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.L.a(f10, f11, z10);
    }

    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return this.L.b(f10, f11);
    }

    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.L.c(i10, i11, iArr, iArr2, 0);
    }

    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.L.e(i10, i11, i12, i13, iArr, 0, (int[]) null);
    }

    public final void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f983r;
        int i11 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i10 = getPaddingLeft() + 0;
            } else {
                i10 = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate((float) i10, (float) min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                WeakHashMap<View, b0> weakHashMap = w.f6004a;
                w.d.k(this);
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f984s;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (getClipToPadding()) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i11 = 0 + getPaddingLeft();
            }
            if (getClipToPadding()) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i11 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                WeakHashMap<View, b0> weakHashMap2 = w.f6004a;
                w.d.k(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    public final void e() {
        this.f987x = false;
        VelocityTracker velocityTracker = this.f988y;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f988y = null;
        }
        v(0);
        this.f983r.onRelease();
        this.f984s.onRelease();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f(android.view.KeyEvent r8) {
        /*
            r7 = this;
            android.graphics.Rect r0 = r7.f981p
            r0.setEmpty()
            int r1 = r7.getChildCount()
            r2 = 1
            r3 = 0
            if (r1 <= 0) goto L_0x0033
            android.view.View r1 = r7.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r4 = (android.widget.FrameLayout.LayoutParams) r4
            int r1 = r1.getHeight()
            int r5 = r4.topMargin
            int r1 = r1 + r5
            int r4 = r4.bottomMargin
            int r1 = r1 + r4
            int r4 = r7.getHeight()
            int r5 = r7.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r7.getPaddingBottom()
            int r4 = r4 - r5
            if (r1 <= r4) goto L_0x0033
            r1 = r2
            goto L_0x0034
        L_0x0033:
            r1 = r3
        L_0x0034:
            r4 = 130(0x82, float:1.82E-43)
            if (r1 != 0) goto L_0x0062
            boolean r0 = r7.isFocused()
            if (r0 == 0) goto L_0x0061
            int r8 = r8.getKeyCode()
            r0 = 4
            if (r8 == r0) goto L_0x0061
            android.view.View r8 = r7.findFocus()
            if (r8 != r7) goto L_0x004c
            r8 = 0
        L_0x004c:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r8 = r0.findNextFocus(r7, r8, r4)
            if (r8 == 0) goto L_0x005f
            if (r8 == r7) goto L_0x005f
            boolean r8 = r8.requestFocus(r4)
            if (r8 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r2 = r3
        L_0x0060:
            return r2
        L_0x0061:
            return r3
        L_0x0062:
            int r1 = r8.getAction()
            if (r1 != 0) goto L_0x00ef
            int r1 = r8.getKeyCode()
            r5 = 19
            r6 = 33
            if (r1 == r5) goto L_0x00e0
            r5 = 20
            if (r1 == r5) goto L_0x00d0
            r5 = 62
            if (r1 == r5) goto L_0x007c
            goto L_0x00ef
        L_0x007c:
            boolean r8 = r8.isShiftPressed()
            if (r8 == 0) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r6 = r4
        L_0x0084:
            if (r6 != r4) goto L_0x0088
            r8 = r2
            goto L_0x0089
        L_0x0088:
            r8 = r3
        L_0x0089:
            int r1 = r7.getHeight()
            if (r8 == 0) goto L_0x00bc
            int r8 = r7.getScrollY()
            int r8 = r8 + r1
            r0.top = r8
            int r8 = r7.getChildCount()
            if (r8 <= 0) goto L_0x00c7
            int r8 = r8 - r2
            android.view.View r8 = r7.getChildAt(r8)
            android.view.ViewGroup$LayoutParams r2 = r8.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r8 = r8.getBottom()
            int r2 = r2.bottomMargin
            int r8 = r8 + r2
            int r2 = r7.getPaddingBottom()
            int r2 = r2 + r8
            int r8 = r0.top
            int r8 = r8 + r1
            if (r8 <= r2) goto L_0x00c7
            int r2 = r2 - r1
            r0.top = r2
            goto L_0x00c7
        L_0x00bc:
            int r8 = r7.getScrollY()
            int r8 = r8 - r1
            r0.top = r8
            if (r8 >= 0) goto L_0x00c7
            r0.top = r3
        L_0x00c7:
            int r8 = r0.top
            int r1 = r1 + r8
            r0.bottom = r1
            r7.s(r6, r8, r1)
            goto L_0x00ef
        L_0x00d0:
            boolean r8 = r8.isAltPressed()
            if (r8 != 0) goto L_0x00db
            boolean r3 = r7.a(r4)
            goto L_0x00ef
        L_0x00db:
            boolean r3 = r7.h(r4)
            goto L_0x00ef
        L_0x00e0:
            boolean r8 = r8.isAltPressed()
            if (r8 != 0) goto L_0x00eb
            boolean r3 = r7.a(r6)
            goto L_0x00ef
        L_0x00eb:
            boolean r3 = r7.h(r6)
        L_0x00ef:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.f(android.view.KeyEvent):boolean");
    }

    public final void g(int i10) {
        if (getChildCount() > 0) {
            this.f982q.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.L.g(2, 1);
            this.I = getScrollY();
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            w.d.k(this);
        }
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        n nVar = this.K;
        return nVar.f6000b | nVar.f5999a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public final boolean h(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f981p;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            rect.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.top = rect.bottom - height;
        }
        return s(i10, rect.top, rect.bottom);
    }

    public final boolean hasNestedScrollingParent() {
        return this.L.f(0) != null;
    }

    public final void i(View view, int i10) {
        n nVar = this.K;
        if (i10 == 1) {
            nVar.f6000b = 0;
        } else {
            nVar.f5999a = 0;
        }
        v(i10);
    }

    public final boolean isNestedScrollingEnabled() {
        return this.L.d;
    }

    public final void j(View view, int i10, int i11, int[] iArr, int i12) {
        this.L.c(i10, i11, iArr, (int[]) null, i12);
    }

    public final boolean l(View view, int i10, int i11) {
        Rect rect = this.f981p;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i10 >= getScrollY() && rect.top - i10 <= getScrollY() + i11;
    }

    public final void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        p(i13, i14, iArr);
    }

    public final void measureChild(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(View view, int i10, int i11, int i12, int i13, int i14) {
        p(i13, i14, (int[]) null);
    }

    public final boolean o(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f986v = false;
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f987x) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    scrollRange = 0;
                } else if (verticalScrollFactorCompat <= scrollRange) {
                    scrollRange = verticalScrollFactorCompat;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r0 = r13.getAction()
            r1 = 1
            r2 = 2
            if (r0 != r2) goto L_0x000d
            boolean r3 = r12.f987x
            if (r3 == 0) goto L_0x000d
            return r1
        L_0x000d:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L_0x00b1
            r5 = -1
            if (r0 == r1) goto L_0x0083
            if (r0 == r2) goto L_0x0025
            r1 = 3
            if (r0 == r1) goto L_0x0083
            r1 = 6
            if (r0 == r1) goto L_0x0020
            goto L_0x013b
        L_0x0020:
            r12.q(r13)
            goto L_0x013b
        L_0x0025:
            int r0 = r12.E
            if (r0 != r5) goto L_0x002b
            goto L_0x013b
        L_0x002b:
            int r3 = r13.findPointerIndex(r0)
            if (r3 != r5) goto L_0x004b
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid pointerId="
            r13.<init>(r1)
            r13.append(r0)
            java.lang.String r0 = " in onInterceptTouchEvent"
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r13)
            goto L_0x013b
        L_0x004b:
            float r0 = r13.getY(r3)
            int r0 = (int) r0
            int r3 = r12.f985t
            int r3 = r0 - r3
            int r3 = java.lang.Math.abs(r3)
            int r5 = r12.B
            if (r3 <= r5) goto L_0x013b
            int r3 = r12.getNestedScrollAxes()
            r2 = r2 & r3
            if (r2 != 0) goto L_0x013b
            r12.f987x = r1
            r12.f985t = r0
            android.view.VelocityTracker r0 = r12.f988y
            if (r0 != 0) goto L_0x0071
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.f988y = r0
        L_0x0071:
            android.view.VelocityTracker r0 = r12.f988y
            r0.addMovement(r13)
            r12.H = r4
            android.view.ViewParent r13 = r12.getParent()
            if (r13 == 0) goto L_0x013b
            r13.requestDisallowInterceptTouchEvent(r1)
            goto L_0x013b
        L_0x0083:
            r12.f987x = r4
            r12.E = r5
            android.view.VelocityTracker r13 = r12.f988y
            if (r13 == 0) goto L_0x0090
            r13.recycle()
            r12.f988y = r3
        L_0x0090:
            android.widget.OverScroller r5 = r12.f982q
            int r6 = r12.getScrollX()
            int r7 = r12.getScrollY()
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            boolean r13 = r5.springBack(r6, r7, r8, r9, r10, r11)
            if (r13 == 0) goto L_0x00ac
            java.util.WeakHashMap<android.view.View, i0.b0> r13 = i0.w.f6004a
            i0.w.d.k(r12)
        L_0x00ac:
            r12.v(r4)
            goto L_0x013b
        L_0x00b1:
            float r0 = r13.getY()
            int r0 = (int) r0
            float r5 = r13.getX()
            int r5 = (int) r5
            int r6 = r12.getChildCount()
            if (r6 <= 0) goto L_0x00e5
            int r6 = r12.getScrollY()
            android.view.View r7 = r12.getChildAt(r4)
            int r8 = r7.getTop()
            int r8 = r8 - r6
            if (r0 < r8) goto L_0x00e5
            int r8 = r7.getBottom()
            int r8 = r8 - r6
            if (r0 >= r8) goto L_0x00e5
            int r6 = r7.getLeft()
            if (r5 < r6) goto L_0x00e5
            int r6 = r7.getRight()
            if (r5 >= r6) goto L_0x00e5
            r5 = r1
            goto L_0x00e6
        L_0x00e5:
            r5 = r4
        L_0x00e6:
            if (r5 != 0) goto L_0x0104
            boolean r13 = r12.u(r13)
            if (r13 != 0) goto L_0x00f8
            android.widget.OverScroller r13 = r12.f982q
            boolean r13 = r13.isFinished()
            if (r13 != 0) goto L_0x00f7
            goto L_0x00f8
        L_0x00f7:
            r1 = r4
        L_0x00f8:
            r12.f987x = r1
            android.view.VelocityTracker r13 = r12.f988y
            if (r13 == 0) goto L_0x013b
            r13.recycle()
            r12.f988y = r3
            goto L_0x013b
        L_0x0104:
            r12.f985t = r0
            int r0 = r13.getPointerId(r4)
            r12.E = r0
            android.view.VelocityTracker r0 = r12.f988y
            if (r0 != 0) goto L_0x0117
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.f988y = r0
            goto L_0x011a
        L_0x0117:
            r0.clear()
        L_0x011a:
            android.view.VelocityTracker r0 = r12.f988y
            r0.addMovement(r13)
            android.widget.OverScroller r0 = r12.f982q
            r0.computeScrollOffset()
            boolean r13 = r12.u(r13)
            if (r13 != 0) goto L_0x0134
            android.widget.OverScroller r13 = r12.f982q
            boolean r13 = r13.isFinished()
            if (r13 != 0) goto L_0x0133
            goto L_0x0134
        L_0x0133:
            r1 = r4
        L_0x0134:
            r12.f987x = r1
            i0.k r13 = r12.L
            r13.g(r2, r4)
        L_0x013b:
            boolean r13 = r12.f987x
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = 0;
        this.u = false;
        View view = this.w;
        if (view != null && k(view, this)) {
            View view2 = this.w;
            Rect rect = this.f981p;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int c10 = c(rect);
            if (c10 != 0) {
                scrollBy(0, c10);
            }
        }
        this.w = null;
        if (!this.f986v) {
            if (this.J != null) {
                scrollTo(getScrollX(), this.J.f989o);
                this.J = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i14 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i14 = 0;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i14 && scrollY >= 0) {
                i15 = paddingTop + scrollY > i14 ? i14 - paddingTop : scrollY;
            }
            if (i15 != scrollY) {
                scrollTo(getScrollX(), i15);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f986v = true;
    }

    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.z && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        g((int) f11);
        return true;
    }

    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        j(view, i10, i11, iArr, 0);
    }

    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        p(i13, 0, (int[]) null);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        b(view, view2, i10, 0);
    }

    public final void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        View view;
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        FocusFinder instance = FocusFinder.getInstance();
        if (rect == null) {
            view = instance.findNextFocus(this, (View) null, i10);
        } else {
            view = instance.findNextFocusFromRect(this, rect, i10);
        }
        if (view != null && !(true ^ l(view, 0, getHeight()))) {
            return view.requestFocus(i10, rect);
        }
        return false;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.J = cVar;
        requestLayout();
    }

    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f989o = getScrollY();
        return cVar;
    }

    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        b bVar = this.N;
        if (bVar != null) {
            ((p3.a) bVar).a(this, i11, i13);
        }
    }

    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && l(findFocus, 0, i13)) {
            Rect rect = this.f981p;
            findFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findFocus, rect);
            d(c(rect));
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return o(view, view2, i10, 0);
    }

    public final void onStopNestedScroll(View view) {
        i(view, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x020e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            android.view.VelocityTracker r2 = r0.f988y
            if (r2 != 0) goto L_0x000e
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r0.f988y = r2
        L_0x000e:
            int r2 = r25.getActionMasked()
            r3 = 0
            if (r2 != 0) goto L_0x0017
            r0.H = r3
        L_0x0017:
            android.view.MotionEvent r4 = android.view.MotionEvent.obtain(r25)
            int r5 = r0.H
            float r5 = (float) r5
            r6 = 0
            r4.offsetLocation(r6, r5)
            i0.k r5 = r0.L
            r7 = 1
            r8 = 2
            if (r2 == 0) goto L_0x027b
            r9 = -1
            android.widget.EdgeEffect r10 = r0.f984s
            android.widget.EdgeEffect r11 = r0.f983r
            if (r2 == r7) goto L_0x0215
            if (r2 == r8) goto L_0x0086
            r3 = 3
            if (r2 == r3) goto L_0x0061
            r3 = 5
            if (r2 == r3) goto L_0x004e
            r3 = 6
            if (r2 == r3) goto L_0x003c
            goto L_0x02b1
        L_0x003c:
            r24.q(r25)
            int r2 = r0.E
            int r2 = r1.findPointerIndex(r2)
            float r1 = r1.getY(r2)
            int r1 = (int) r1
            r0.f985t = r1
            goto L_0x02b1
        L_0x004e:
            int r2 = r25.getActionIndex()
            float r3 = r1.getY(r2)
            int r3 = (int) r3
            r0.f985t = r3
            int r1 = r1.getPointerId(r2)
            r0.E = r1
            goto L_0x02b1
        L_0x0061:
            boolean r1 = r0.f987x
            if (r1 == 0) goto L_0x0275
            int r1 = r24.getChildCount()
            if (r1 <= 0) goto L_0x0275
            android.widget.OverScroller r10 = r0.f982q
            int r11 = r24.getScrollX()
            int r12 = r24.getScrollY()
            r13 = 0
            r14 = 0
            r15 = 0
            int r16 = r24.getScrollRange()
            boolean r1 = r10.springBack(r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x0275
            java.util.WeakHashMap<android.view.View, i0.b0> r1 = i0.w.f6004a
            goto L_0x0272
        L_0x0086:
            int r2 = r0.E
            int r2 = r1.findPointerIndex(r2)
            if (r2 != r9) goto L_0x00aa
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid pointerId="
            r1.<init>(r2)
            int r2 = r0.E
            r1.append(r2)
            java.lang.String r2 = " in onTouchEvent"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "NestedScrollView"
            android.util.Log.e(r2, r1)
            goto L_0x02b1
        L_0x00aa:
            float r8 = r1.getY(r2)
            int r8 = (int) r8
            int r9 = r0.f985t
            int r9 = r9 - r8
            float r12 = r1.getX(r2)
            int r13 = r24.getWidth()
            float r13 = (float) r13
            float r12 = r12 / r13
            float r13 = (float) r9
            int r14 = r24.getHeight()
            float r14 = (float) r14
            float r13 = r13 / r14
            float r14 = l0.c.a(r11)
            int r14 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            r15 = 1065353216(0x3f800000, float:1.0)
            if (r14 == 0) goto L_0x00df
            float r13 = -r13
            float r12 = l0.c.b(r11, r13, r12)
            float r12 = -r12
            float r13 = l0.c.a(r11)
            int r6 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x00dd
            r6 = r11
            goto L_0x00f6
        L_0x00dd:
            r6 = r12
            goto L_0x00fa
        L_0x00df:
            float r14 = l0.c.a(r10)
            int r14 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r14 == 0) goto L_0x00fa
            float r12 = r15 - r12
            float r12 = l0.c.b(r10, r13, r12)
            float r13 = l0.c.a(r10)
            int r6 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x00dd
            r6 = r10
        L_0x00f6:
            r6.onRelease()
            goto L_0x00dd
        L_0x00fa:
            int r12 = r24.getHeight()
            float r12 = (float) r12
            float r6 = r6 * r12
            int r6 = java.lang.Math.round(r6)
            if (r6 == 0) goto L_0x0109
            r24.invalidate()
        L_0x0109:
            int r9 = r9 - r6
            boolean r6 = r0.f987x
            if (r6 != 0) goto L_0x0128
            int r6 = java.lang.Math.abs(r9)
            int r12 = r0.B
            if (r6 <= r12) goto L_0x0128
            android.view.ViewParent r6 = r24.getParent()
            if (r6 == 0) goto L_0x011f
            r6.requestDisallowInterceptTouchEvent(r7)
        L_0x011f:
            r0.f987x = r7
            int r6 = r0.B
            if (r9 <= 0) goto L_0x0127
            int r9 = r9 - r6
            goto L_0x0128
        L_0x0127:
            int r9 = r9 + r6
        L_0x0128:
            boolean r6 = r0.f987x
            if (r6 == 0) goto L_0x02b1
            r17 = 0
            int[] r6 = r0.G
            int[] r12 = r0.F
            r21 = 0
            i0.k r13 = r0.L
            r16 = r13
            r18 = r9
            r19 = r6
            r20 = r12
            boolean r6 = r16.c(r17, r18, r19, r20, r21)
            int[] r12 = r0.G
            int[] r13 = r0.F
            if (r6 == 0) goto L_0x0152
            r6 = r12[r7]
            int r9 = r9 - r6
            int r6 = r0.H
            r14 = r13[r7]
            int r6 = r6 + r14
            r0.H = r6
        L_0x0152:
            r6 = r13[r7]
            int r8 = r8 - r6
            r0.f985t = r8
            int r6 = r24.getScrollY()
            int r8 = r24.getScrollRange()
            int r14 = r24.getOverScrollMode()
            if (r14 == 0) goto L_0x016c
            if (r14 != r7) goto L_0x016a
            if (r8 <= 0) goto L_0x016a
            goto L_0x016c
        L_0x016a:
            r14 = r3
            goto L_0x016d
        L_0x016c:
            r14 = r7
        L_0x016d:
            int r15 = r24.getScrollY()
            boolean r15 = r0.r(r9, r3, r15, r8)
            if (r15 == 0) goto L_0x0184
            android.view.ViewParent r5 = r5.f(r3)
            if (r5 == 0) goto L_0x017f
            r5 = r7
            goto L_0x0180
        L_0x017f:
            r5 = r3
        L_0x0180:
            if (r5 != 0) goto L_0x0184
            r5 = r7
            goto L_0x0185
        L_0x0184:
            r5 = r3
        L_0x0185:
            int r15 = r24.getScrollY()
            int r18 = r15 - r6
            int r20 = r9 - r18
            r12[r7] = r3
            int[] r15 = r0.F
            r22 = 0
            r17 = 0
            r19 = 0
            i0.k r3 = r0.L
            r16 = r3
            r21 = r15
            r23 = r12
            r16.e(r17, r18, r19, r20, r21, r22, r23)
            int r3 = r0.f985t
            r13 = r13[r7]
            int r3 = r3 - r13
            r0.f985t = r3
            int r3 = r0.H
            int r3 = r3 + r13
            r0.H = r3
            if (r14 == 0) goto L_0x020b
            r3 = r12[r7]
            int r9 = r9 - r3
            int r6 = r6 + r9
            if (r6 >= 0) goto L_0x01d5
            int r3 = -r9
            float r3 = (float) r3
            int r6 = r24.getHeight()
            float r6 = (float) r6
            float r3 = r3 / r6
            float r1 = r1.getX(r2)
            int r2 = r24.getWidth()
            float r2 = (float) r2
            float r1 = r1 / r2
            l0.c.b(r11, r3, r1)
            boolean r1 = r10.isFinished()
            if (r1 != 0) goto L_0x01f8
            r10.onRelease()
            goto L_0x01f8
        L_0x01d5:
            if (r6 <= r8) goto L_0x01f8
            float r3 = (float) r9
            int r6 = r24.getHeight()
            float r6 = (float) r6
            float r3 = r3 / r6
            float r1 = r1.getX(r2)
            int r2 = r24.getWidth()
            float r2 = (float) r2
            float r1 = r1 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            float r15 = r2 - r1
            l0.c.b(r10, r3, r15)
            boolean r1 = r11.isFinished()
            if (r1 != 0) goto L_0x01f8
            r11.onRelease()
        L_0x01f8:
            boolean r1 = r11.isFinished()
            if (r1 == 0) goto L_0x0204
            boolean r1 = r10.isFinished()
            if (r1 != 0) goto L_0x020b
        L_0x0204:
            java.util.WeakHashMap<android.view.View, i0.b0> r1 = i0.w.f6004a
            i0.w.d.k(r24)
            r3 = 0
            goto L_0x020c
        L_0x020b:
            r3 = r5
        L_0x020c:
            if (r3 == 0) goto L_0x02b1
            android.view.VelocityTracker r1 = r0.f988y
            r1.clear()
            goto L_0x02b1
        L_0x0215:
            android.view.VelocityTracker r1 = r0.f988y
            int r2 = r0.D
            float r2 = (float) r2
            r3 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r3, r2)
            int r2 = r0.E
            float r1 = r1.getYVelocity(r2)
            int r1 = (int) r1
            int r2 = java.lang.Math.abs(r1)
            int r3 = r0.C
            if (r2 < r3) goto L_0x0259
            float r2 = l0.c.a(r11)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0239
            r2 = r1
            r10 = r11
            goto L_0x0242
        L_0x0239:
            float r2 = l0.c.a(r10)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0247
            int r2 = -r1
        L_0x0242:
            r10.onAbsorb(r2)
            r3 = r7
            goto L_0x0248
        L_0x0247:
            r3 = 0
        L_0x0248:
            if (r3 != 0) goto L_0x0275
            int r1 = -r1
            float r2 = (float) r1
            boolean r3 = r0.dispatchNestedPreFling(r6, r2)
            if (r3 != 0) goto L_0x0275
            r0.dispatchNestedFling(r6, r2, r7)
            r0.g(r1)
            goto L_0x0275
        L_0x0259:
            android.widget.OverScroller r10 = r0.f982q
            int r11 = r24.getScrollX()
            int r12 = r24.getScrollY()
            r13 = 0
            r14 = 0
            r15 = 0
            int r16 = r24.getScrollRange()
            boolean r1 = r10.springBack(r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x0275
            java.util.WeakHashMap<android.view.View, i0.b0> r1 = i0.w.f6004a
        L_0x0272:
            i0.w.d.k(r24)
        L_0x0275:
            r0.E = r9
            r24.e()
            goto L_0x02b1
        L_0x027b:
            int r2 = r24.getChildCount()
            if (r2 != 0) goto L_0x0283
            r2 = 0
            return r2
        L_0x0283:
            boolean r2 = r0.f987x
            if (r2 == 0) goto L_0x0290
            android.view.ViewParent r2 = r24.getParent()
            if (r2 == 0) goto L_0x0290
            r2.requestDisallowInterceptTouchEvent(r7)
        L_0x0290:
            android.widget.OverScroller r2 = r0.f982q
            boolean r2 = r2.isFinished()
            if (r2 != 0) goto L_0x02a0
            android.widget.OverScroller r2 = r0.f982q
            r2.abortAnimation()
            r0.v(r7)
        L_0x02a0:
            float r2 = r25.getY()
            int r2 = (int) r2
            r0.f985t = r2
            r2 = 0
            int r1 = r1.getPointerId(r2)
            r0.E = r1
            r5.g(r8, r2)
        L_0x02b1:
            android.view.VelocityTracker r1 = r0.f988y
            if (r1 == 0) goto L_0x02b8
            r1.addMovement(r4)
        L_0x02b8:
            r4.recycle()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.L.d(scrollY2, i10 - scrollY2, i11, iArr);
    }

    public final void q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.E) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f985t = (int) motionEvent.getY(i10);
            this.E = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f988y;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            int r0 = r9.getOverScrollMode()
            r9.computeHorizontalScrollRange()
            r9.computeHorizontalScrollExtent()
            r9.computeVerticalScrollRange()
            r9.computeVerticalScrollExtent()
            r1 = 1
            r0 = 0
            int r11 = r11 + r0
            int r12 = r12 + r10
            int r13 = r13 + r0
            if (r11 <= 0) goto L_0x001a
        L_0x0017:
            r11 = r0
            r10 = r1
            goto L_0x001e
        L_0x001a:
            if (r11 >= 0) goto L_0x001d
            goto L_0x0017
        L_0x001d:
            r10 = r0
        L_0x001e:
            if (r12 <= r13) goto L_0x0023
            r12 = r13
        L_0x0021:
            r13 = r1
            goto L_0x0028
        L_0x0023:
            if (r12 >= 0) goto L_0x0027
            r12 = r0
            goto L_0x0021
        L_0x0027:
            r13 = r0
        L_0x0028:
            if (r13 == 0) goto L_0x0045
            i0.k r2 = r9.L
            android.view.ViewParent r2 = r2.f(r1)
            if (r2 == 0) goto L_0x0034
            r2 = r1
            goto L_0x0035
        L_0x0034:
            r2 = r0
        L_0x0035:
            if (r2 != 0) goto L_0x0045
            android.widget.OverScroller r2 = r9.f982q
            r5 = 0
            r6 = 0
            r7 = 0
            int r8 = r9.getScrollRange()
            r3 = r11
            r4 = r12
            r2.springBack(r3, r4, r5, r6, r7, r8)
        L_0x0045:
            r9.onOverScrolled(r11, r12, r10, r13)
            if (r10 != 0) goto L_0x004e
            if (r13 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r1 = r0
        L_0x004e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.r(int, int, int, int):boolean");
    }

    public final void requestChildFocus(View view, View view2) {
        if (!this.u) {
            Rect rect = this.f981p;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int c10 = c(rect);
            if (c10 != 0) {
                scrollBy(0, c10);
            }
        } else {
            this.w = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        boolean z11;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int c10 = c(rect);
        if (c10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (z10) {
                scrollBy(0, c10);
            } else {
                t(0, c10, false);
            }
        }
        return z11;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        VelocityTracker velocityTracker;
        if (z10 && (velocityTracker = this.f988y) != null) {
            velocityTracker.recycle();
            this.f988y = null;
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void requestLayout() {
        this.u = true;
        super.requestLayout();
    }

    public final boolean s(int i10, int i11, int i12) {
        boolean z10;
        boolean z11;
        int i13;
        boolean z12;
        boolean z13;
        int i14 = i10;
        int i15 = i11;
        int i16 = i12;
        int height = getHeight();
        int scrollY = getScrollY();
        int i17 = height + scrollY;
        if (i14 == 33) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z14 = false;
        for (int i18 = 0; i18 < size; i18++) {
            View view2 = focusables.get(i18);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i15 < bottom && top < i16) {
                if (i15 >= top || bottom >= i16) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (view == null) {
                    view = view2;
                    z14 = z12;
                } else {
                    if ((!z10 || top >= view.getTop()) && (z10 || bottom <= view.getBottom())) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (z14) {
                        if (z12) {
                            if (!z13) {
                            }
                        }
                    } else if (z12) {
                        view = view2;
                        z14 = true;
                    } else if (!z13) {
                    }
                    view = view2;
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i15 < scrollY || i16 > i17) {
            if (z10) {
                i13 = i15 - scrollY;
            } else {
                i13 = i16 - i17;
            }
            d(i13);
            z11 = true;
        } else {
            z11 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i14);
        }
        return z11;
    }

    public final void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i10 < 0) {
                i10 = 0;
            } else if (width + i10 > width2) {
                i10 = width2 - width;
            }
            if (height >= height2 || i11 < 0) {
                i11 = 0;
            } else if (height + i11 > height2) {
                i11 = height2 - height;
            }
            if (i10 != getScrollX() || i11 != getScrollY()) {
                super.scrollTo(i10, i11);
            }
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.z) {
            this.z = z10;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z10) {
        k kVar = this.L;
        if (kVar.d) {
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            w.i.z(kVar.f5997c);
        }
        kVar.d = z10;
    }

    public void setOnScrollChangeListener(b bVar) {
        this.N = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.A = z10;
    }

    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public final boolean startNestedScroll(int i10) {
        return this.L.g(i10, 0);
    }

    public final void stopNestedScroll() {
        v(0);
    }

    public final void t(int i10, int i11, boolean z10) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f980o > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f982q;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
                if (z10) {
                    this.L.g(2, 1);
                } else {
                    v(1);
                }
                this.I = getScrollY();
                WeakHashMap<View, b0> weakHashMap = w.f6004a;
                w.d.k(this);
            } else {
                if (!this.f982q.isFinished()) {
                    this.f982q.abortAnimation();
                    v(1);
                }
                scrollBy(i10, i11);
            }
            this.f980o = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public final boolean u(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.f983r;
        if (l0.c.a(edgeEffect) != 0.0f) {
            l0.c.b(edgeEffect, 0.0f, motionEvent.getY() / ((float) getHeight()));
            z10 = true;
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.f984s;
        if (l0.c.a(edgeEffect2) == 0.0f) {
            return z10;
        }
        l0.c.b(edgeEffect2, 0.0f, 1.0f - (motionEvent.getY() / ((float) getHeight())));
        return true;
    }

    public final void v(int i10) {
        this.L.h(i10);
    }
}

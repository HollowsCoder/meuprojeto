package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.databinding.a;
import com.karumi.dexter.R;
import i0.b0;
import i0.w;
import java.util.WeakHashMap;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: o  reason: collision with root package name */
    public boolean f380o;

    /* renamed from: p  reason: collision with root package name */
    public w0 f381p;

    /* renamed from: q  reason: collision with root package name */
    public View f382q;

    /* renamed from: r  reason: collision with root package name */
    public View f383r;

    /* renamed from: s  reason: collision with root package name */
    public Drawable f384s;

    /* renamed from: t  reason: collision with root package name */
    public Drawable f385t;
    public Drawable u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f386v;
    public boolean w;

    /* renamed from: x  reason: collision with root package name */
    public final int f387x;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar = new b(this);
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        w.d.q(this, bVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.z);
        boolean z = false;
        this.f384s = obtainStyledAttributes.getDrawable(0);
        this.f385t = obtainStyledAttributes.getDrawable(2);
        this.f387x = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f386v = true;
            this.u = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f386v ? this.f384s == null && this.f385t == null : this.u == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    public static int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f384s;
        if (drawable != null && drawable.isStateful()) {
            this.f384s.setState(getDrawableState());
        }
        Drawable drawable2 = this.f385t;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f385t.setState(getDrawableState());
        }
        Drawable drawable3 = this.u;
        if (drawable3 != null && drawable3.isStateful()) {
            this.u.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f381p;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f384s;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f385t;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.u;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f382q = findViewById(R.id.action_bar);
        this.f383r = findViewById(R.id.action_context_bar);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f380o || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            androidx.appcompat.widget.w0 r5 = r4.f381p
            r7 = 8
            r9 = 1
            r0 = 0
            if (r5 == 0) goto L_0x0013
            int r1 = r5.getVisibility()
            if (r1 == r7) goto L_0x0013
            r1 = r9
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            if (r5 == 0) goto L_0x0033
            int r2 = r5.getVisibility()
            if (r2 == r7) goto L_0x0033
            int r7 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r5.getMeasuredHeight()
            int r3 = r7 - r3
            int r2 = r2.bottomMargin
            int r3 = r3 - r2
            int r7 = r7 - r2
            r5.layout(r6, r3, r8, r7)
        L_0x0033:
            boolean r6 = r4.f386v
            if (r6 == 0) goto L_0x004a
            android.graphics.drawable.Drawable r5 = r4.u
            if (r5 == 0) goto L_0x0048
            int r6 = r4.getMeasuredWidth()
            int r7 = r4.getMeasuredHeight()
            r5.setBounds(r0, r0, r6, r7)
            goto L_0x00b6
        L_0x0048:
            r9 = r0
            goto L_0x00b6
        L_0x004a:
            android.graphics.drawable.Drawable r6 = r4.f384s
            if (r6 == 0) goto L_0x009b
            android.view.View r6 = r4.f382q
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x006d
            android.graphics.drawable.Drawable r6 = r4.f384s
            android.view.View r7 = r4.f382q
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f382q
            int r8 = r8.getTop()
            android.view.View r0 = r4.f382q
            int r0 = r0.getRight()
            android.view.View r2 = r4.f382q
            goto L_0x008d
        L_0x006d:
            android.view.View r6 = r4.f383r
            if (r6 == 0) goto L_0x0095
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0095
            android.graphics.drawable.Drawable r6 = r4.f384s
            android.view.View r7 = r4.f383r
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f383r
            int r8 = r8.getTop()
            android.view.View r0 = r4.f383r
            int r0 = r0.getRight()
            android.view.View r2 = r4.f383r
        L_0x008d:
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto L_0x009a
        L_0x0095:
            android.graphics.drawable.Drawable r6 = r4.f384s
            r6.setBounds(r0, r0, r0, r0)
        L_0x009a:
            r0 = r9
        L_0x009b:
            r4.w = r1
            if (r1 == 0) goto L_0x0048
            android.graphics.drawable.Drawable r6 = r4.f385t
            if (r6 == 0) goto L_0x0048
            int r7 = r5.getLeft()
            int r8 = r5.getTop()
            int r0 = r5.getRight()
            int r5 = r5.getBottom()
            r6.setBounds(r7, r8, r0, r5)
        L_0x00b6:
            if (r9 == 0) goto L_0x00bb
            r4.invalidate()
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.view.View r0 = r6.f382q
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x001c
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            if (r0 != r1) goto L_0x001c
            int r0 = r6.f387x
            if (r0 < 0) goto L_0x001c
            int r8 = android.view.View.MeasureSpec.getSize(r8)
            int r8 = java.lang.Math.min(r0, r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r1)
        L_0x001c:
            super.onMeasure(r7, r8)
            android.view.View r7 = r6.f382q
            if (r7 != 0) goto L_0x0024
            return
        L_0x0024:
            int r7 = android.view.View.MeasureSpec.getMode(r8)
            androidx.appcompat.widget.w0 r0 = r6.f381p
            if (r0 == 0) goto L_0x0089
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x0089
            r0 = 1073741824(0x40000000, float:2.0)
            if (r7 == r0) goto L_0x0089
            android.view.View r0 = r6.f382q
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x004d
            int r5 = r0.getVisibility()
            if (r5 == r2) goto L_0x004d
            int r0 = r0.getMeasuredHeight()
            if (r0 != 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r0 = r4
            goto L_0x004e
        L_0x004d:
            r0 = r3
        L_0x004e:
            if (r0 != 0) goto L_0x0053
            android.view.View r0 = r6.f382q
            goto L_0x0069
        L_0x0053:
            android.view.View r0 = r6.f383r
            if (r0 == 0) goto L_0x0065
            int r5 = r0.getVisibility()
            if (r5 == r2) goto L_0x0065
            int r0 = r0.getMeasuredHeight()
            if (r0 != 0) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r3 = r4
        L_0x0065:
            if (r3 != 0) goto L_0x006d
            android.view.View r0 = r6.f383r
        L_0x0069:
            int r4 = a(r0)
        L_0x006d:
            if (r7 != r1) goto L_0x0074
            int r7 = android.view.View.MeasureSpec.getSize(r8)
            goto L_0x0077
        L_0x0074:
            r7 = 2147483647(0x7fffffff, float:NaN)
        L_0x0077:
            int r8 = r6.getMeasuredWidth()
            androidx.appcompat.widget.w0 r0 = r6.f381p
            int r0 = a(r0)
            int r0 = r0 + r4
            int r7 = java.lang.Math.min(r0, r7)
            r6.setMeasuredDimension(r8, r7)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f384s;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f384s);
        }
        this.f384s = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f382q;
            if (view != null) {
                this.f384s.setBounds(view.getLeft(), this.f382q.getTop(), this.f382q.getRight(), this.f382q.getBottom());
            }
        }
        boolean z = true;
        if (!this.f386v ? !(this.f384s == null && this.f385t == null) : this.u != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.u;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.u);
        }
        this.u = drawable;
        boolean z = this.f386v;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.u) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? this.f384s == null && this.f385t == null : this.u == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f385t;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f385t);
        }
        this.f385t = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.w && (drawable2 = this.f385t) != null) {
                drawable2.setBounds(this.f381p.getLeft(), this.f381p.getTop(), this.f381p.getRight(), this.f381p.getBottom());
            }
        }
        setWillNotDraw(!this.f386v ? this.f384s == null && this.f385t == null : this.u == null);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(w0 w0Var) {
        w0 w0Var2 = this.f381p;
        if (w0Var2 != null) {
            removeView(w0Var2);
        }
        this.f381p = w0Var;
        if (w0Var != null) {
            addView(w0Var);
            ViewGroup.LayoutParams layoutParams = w0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            w0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f380o = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z = i10 == 0;
        Drawable drawable = this.f384s;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f385t;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.u;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f384s;
        boolean z = this.f386v;
        return (drawable == drawable2 && !z) || (drawable == this.f385t && this.w) || ((drawable == this.u && z) || super.verifyDrawable(drawable));
    }
}

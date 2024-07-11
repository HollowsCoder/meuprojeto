package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.c;
import com.karumi.dexter.R;
import i0.b0;
import i0.w;
import java.util.WeakHashMap;

public class ActionBarContextView extends a {
    public View A;
    public LinearLayout B;
    public TextView C;
    public TextView D;
    public final int E;
    public final int F;
    public boolean G;
    public final int H;
    public CharSequence w;

    /* renamed from: x  reason: collision with root package name */
    public CharSequence f388x;

    /* renamed from: y  reason: collision with root package name */
    public View f389y;
    public View z;

    public class a implements View.OnClickListener {

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ h.a f390o;

        public a(h.a aVar) {
            this.f390o = aVar;
        }

        public final void onClick(View view) {
            this.f390o.c();
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.databinding.a.C, R.attr.actionModeStyle, 0);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(0);
        } else {
            drawable = f.a.b(context, resourceId);
        }
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        w.d.q(this, drawable);
        this.E = obtainStyledAttributes.getResourceId(5, 0);
        this.F = obtainStyledAttributes.getResourceId(4, 0);
        this.f503s = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.H = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(h.a r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f389y
            r1 = 0
            if (r0 != 0) goto L_0x0016
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = r5.H
            android.view.View r0 = r0.inflate(r2, r5, r1)
            r5.f389y = r0
            goto L_0x001e
        L_0x0016:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0021
            android.view.View r0 = r5.f389y
        L_0x001e:
            r5.addView(r0)
        L_0x0021:
            android.view.View r0 = r5.f389y
            r2 = 2131361862(0x7f0a0046, float:1.8343488E38)
            android.view.View r0 = r0.findViewById(r2)
            r5.z = r0
            androidx.appcompat.widget.ActionBarContextView$a r2 = new androidx.appcompat.widget.ActionBarContextView$a
            r2.<init>(r6)
            r0.setOnClickListener(r2)
            androidx.appcompat.view.menu.f r6 = r6.e()
            androidx.appcompat.widget.c r0 = r5.f502r
            if (r0 == 0) goto L_0x004e
            r0.c()
            androidx.appcompat.widget.c$a r0 = r0.H
            if (r0 == 0) goto L_0x004e
            boolean r2 = r0.b()
            if (r2 == 0) goto L_0x004e
            i.d r0 = r0.f367j
            r0.dismiss()
        L_0x004e:
            androidx.appcompat.widget.c r0 = new androidx.appcompat.widget.c
            android.content.Context r2 = r5.getContext()
            r0.<init>(r2)
            r5.f502r = r0
            r2 = 1
            r0.z = r2
            r0.A = r2
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r2 = -2
            r3 = -1
            r0.<init>(r2, r3)
            androidx.appcompat.widget.c r2 = r5.f502r
            android.content.Context r3 = r5.f500p
            r6.b(r2, r3)
            androidx.appcompat.widget.c r6 = r5.f502r
            androidx.appcompat.view.menu.k r2 = r6.f280v
            if (r2 != 0) goto L_0x0086
            android.view.LayoutInflater r3 = r6.f277r
            int r4 = r6.f279t
            android.view.View r1 = r3.inflate(r4, r5, r1)
            androidx.appcompat.view.menu.k r1 = (androidx.appcompat.view.menu.k) r1
            r6.f280v = r1
            androidx.appcompat.view.menu.f r3 = r6.f276q
            r1.b(r3)
            r6.f()
        L_0x0086:
            androidx.appcompat.view.menu.k r1 = r6.f280v
            if (r2 == r1) goto L_0x0090
            r2 = r1
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            r2.setPresenter(r6)
        L_0x0090:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r5.f501q = r1
            java.util.WeakHashMap<android.view.View, i0.b0> r6 = i0.w.f6004a
            r6 = 0
            i0.w.d.q(r1, r6)
            androidx.appcompat.widget.ActionMenuView r6 = r5.f501q
            r5.addView(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.f(h.a):void");
    }

    public final void g() {
        if (this.B == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.B = linearLayout;
            this.C = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.D = (TextView) this.B.findViewById(R.id.action_bar_subtitle);
            int i10 = this.E;
            if (i10 != 0) {
                this.C.setTextAppearance(getContext(), i10);
            }
            int i11 = this.F;
            if (i11 != 0) {
                this.D.setTextAppearance(getContext(), i11);
            }
        }
        this.C.setText(this.w);
        this.D.setText(this.f388x);
        boolean z10 = !TextUtils.isEmpty(this.w);
        boolean z11 = !TextUtils.isEmpty(this.f388x);
        int i12 = 0;
        this.D.setVisibility(z11 ? 0 : 8);
        LinearLayout linearLayout2 = this.B;
        if (!z10 && !z11) {
            i12 = 8;
        }
        linearLayout2.setVisibility(i12);
        if (this.B.getParent() == null) {
            addView(this.B);
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f388x;
    }

    public CharSequence getTitle() {
        return this.w;
    }

    public final void h() {
        removeAllViews();
        this.A = null;
        this.f501q = null;
        this.f502r = null;
        View view = this.z;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f502r;
        if (cVar != null) {
            cVar.c();
            c.a aVar = this.f502r.H;
            if (aVar != null && aVar.b()) {
                aVar.f367j.dismiss();
            }
        }
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean a10 = m1.a(this);
        int paddingRight = a10 ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f389y;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f389y.getLayoutParams();
            int i14 = a10 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = a10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i16 = a10 ? paddingRight - i14 : paddingRight + i14;
            int d = a.d(this.f389y, i16, paddingTop, paddingTop2, a10) + i16;
            paddingRight = a10 ? d - i15 : d + i15;
        }
        LinearLayout linearLayout = this.B;
        if (!(linearLayout == null || this.A != null || linearLayout.getVisibility() == 8)) {
            paddingRight += a.d(this.B, paddingRight, paddingTop, paddingTop2, a10);
        }
        View view2 = this.A;
        if (view2 != null) {
            a.d(view2, paddingRight, paddingTop, paddingTop2, a10);
        }
        int paddingLeft = a10 ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f501q;
        if (actionMenuView != null) {
            a.d(actionMenuView, paddingLeft, paddingTop, paddingTop2, !a10);
        }
    }

    public final void onMeasure(int i10, int i11) {
        int i12 = 1073741824;
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        } else if (View.MeasureSpec.getMode(i11) != 0) {
            int size = View.MeasureSpec.getSize(i10);
            int i13 = this.f503s;
            if (i13 <= 0) {
                i13 = View.MeasureSpec.getSize(i11);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i14 = i13 - paddingBottom;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE);
            View view = this.f389y;
            if (view != null) {
                int c10 = a.c(view, paddingLeft, makeMeasureSpec);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f389y.getLayoutParams();
                paddingLeft = c10 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f501q;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = a.c(this.f501q, paddingLeft, makeMeasureSpec);
            }
            LinearLayout linearLayout = this.B;
            if (linearLayout != null && this.A == null) {
                if (this.G) {
                    this.B.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.B.getMeasuredWidth();
                    boolean z10 = measuredWidth <= paddingLeft;
                    if (z10) {
                        paddingLeft -= measuredWidth;
                    }
                    this.B.setVisibility(z10 ? 0 : 8);
                } else {
                    paddingLeft = a.c(linearLayout, paddingLeft, makeMeasureSpec);
                }
            }
            View view2 = this.A;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i15 = layoutParams.width;
                int i16 = i15 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i15 >= 0) {
                    paddingLeft = Math.min(i15, paddingLeft);
                }
                int i17 = layoutParams.height;
                if (i17 == -2) {
                    i12 = Integer.MIN_VALUE;
                }
                if (i17 >= 0) {
                    i14 = Math.min(i17, i14);
                }
                this.A.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i16), View.MeasureSpec.makeMeasureSpec(i14, i12));
            }
            if (this.f503s <= 0) {
                int childCount = getChildCount();
                i13 = 0;
                for (int i18 = 0; i18 < childCount; i18++) {
                    int measuredHeight = getChildAt(i18).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i13) {
                        i13 = measuredHeight;
                    }
                }
            }
            setMeasuredDimension(size, i13);
        } else {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
    }

    public void setContentHeight(int i10) {
        this.f503s = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.A;
        if (view2 != null) {
            removeView(view2);
        }
        this.A = view;
        if (!(view == null || (linearLayout = this.B) == null)) {
            removeView(linearLayout);
            this.B = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f388x = charSequence;
        g();
    }

    public void setTitle(CharSequence charSequence) {
        this.w = charSequence;
        g();
        w.l(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.G) {
            requestLayout();
        }
        this.G = z10;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}

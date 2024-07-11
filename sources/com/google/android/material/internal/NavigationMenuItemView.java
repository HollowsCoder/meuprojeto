package com.google.android.material.internal;

import a0.d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.i1;
import androidx.appcompat.widget.o0;
import com.karumi.dexter.R;
import h6.f;
import i0.b0;
import i0.w;
import j0.b;
import java.util.WeakHashMap;

public class NavigationMenuItemView extends f implements k.a {
    public static final int[] T = {16842912};
    public int J;
    public boolean K;
    public boolean L;
    public final CheckedTextView M;
    public FrameLayout N;
    public h O;
    public ColorStateList P;
    public boolean Q;
    public Drawable R;
    public final a S;

    public class a extends i0.a {
        public a() {
        }

        public final void d(View view, b bVar) {
            View.AccessibilityDelegate accessibilityDelegate = this.f5951a;
            AccessibilityNodeInfo accessibilityNodeInfo = bVar.f6386a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCheckable(NavigationMenuItemView.this.L);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, 0);
        a aVar = new a();
        this.S = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.M = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        w.k(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.N == null) {
                this.N = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.N.removeAllViews();
            this.N.addView(view);
        }
    }

    public final void c(h hVar) {
        int i10;
        o0.a aVar;
        int i11;
        StateListDrawable stateListDrawable;
        this.O = hVar;
        int i12 = hVar.f337a;
        if (i12 > 0) {
            setId(i12);
        }
        if (hVar.isVisible()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        setVisibility(i10);
        boolean z = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(T, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            w.d.q(this, stateListDrawable);
        }
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setTitle(hVar.f340e);
        setIcon(hVar.getIcon());
        setActionView(hVar.getActionView());
        setContentDescription(hVar.f351q);
        i1.a(this, hVar.f352r);
        h hVar2 = this.O;
        if (!(hVar2.f340e == null && hVar2.getIcon() == null && this.O.getActionView() != null)) {
            z = false;
        }
        CheckedTextView checkedTextView = this.M;
        if (z) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.N;
            if (frameLayout != null) {
                aVar = (o0.a) frameLayout.getLayoutParams();
                i11 = -1;
            } else {
                return;
            }
        } else {
            checkedTextView.setVisibility(0);
            FrameLayout frameLayout2 = this.N;
            if (frameLayout2 != null) {
                aVar = (o0.a) frameLayout2.getLayoutParams();
                i11 = -2;
            } else {
                return;
            }
        }
        aVar.width = i11;
        this.N.setLayoutParams(aVar);
    }

    public h getItemData() {
        return this.O;
    }

    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        h hVar = this.O;
        if (hVar != null && hVar.isCheckable() && this.O.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, T);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.L != z) {
            this.L = z;
            this.S.h(this.M, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.M.setChecked(z);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, 0, i10, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.Q) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.P);
            }
            int i10 = this.J;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.K) {
            if (this.R == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = d.f22a;
                Drawable drawable2 = resources.getDrawable(R.drawable.navigation_empty_icon, theme);
                this.R = drawable2;
                if (drawable2 != null) {
                    int i11 = this.J;
                    drawable2.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.R;
        }
        this.M.setCompoundDrawablesRelative(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i10) {
        this.M.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.J = i10;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.P = colorStateList;
        this.Q = colorStateList != null;
        h hVar = this.O;
        if (hVar != null) {
            setIcon(hVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.M.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.K = z;
    }

    public void setTextAppearance(int i10) {
        this.M.setTextAppearance(i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.M.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.M.setText(charSequence);
    }
}

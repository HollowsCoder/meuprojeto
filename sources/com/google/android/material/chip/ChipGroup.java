package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.karumi.dexter.R;
import h6.e;
import h6.k;
import i0.b0;
import i0.w;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p9.u;

public class ChipGroup extends e {

    /* renamed from: s  reason: collision with root package name */
    public int f3351s;

    /* renamed from: t  reason: collision with root package name */
    public int f3352t;
    public boolean u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f3353v;
    public final a w = new a();

    /* renamed from: x  reason: collision with root package name */
    public final d f3354x;

    /* renamed from: y  reason: collision with root package name */
    public int f3355y;
    public boolean z;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ChipGroup chipGroup = ChipGroup.this;
            if (!chipGroup.z) {
                if (!chipGroup.getCheckedChipIds().isEmpty() || !chipGroup.f3353v) {
                    int id = compoundButton.getId();
                    if (z) {
                        int i10 = chipGroup.f3355y;
                        if (!(i10 == -1 || i10 == id || !chipGroup.u)) {
                            chipGroup.d(i10, false);
                        }
                        chipGroup.setCheckedId(id);
                    } else if (chipGroup.f3355y == id) {
                        chipGroup.setCheckedId(-1);
                    }
                } else {
                    chipGroup.d(compoundButton.getId(), true);
                    chipGroup.f3355y = compoundButton.getId();
                }
            }
        }
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public b() {
            super(-2, -2);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public interface c {
    }

    public class d implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public ViewGroup.OnHierarchyChangeListener f3357a;

        public d() {
        }

        public final void onChildViewAdded(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    WeakHashMap<View, b0> weakHashMap = w.f6004a;
                    view2.setId(w.e.a());
                }
                Chip chip = (Chip) view2;
                if (chip.isChecked()) {
                    ((ChipGroup) view).c(chip.getId());
                }
                chip.setOnCheckedChangeListenerInternal(chipGroup.w);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f3357a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public final void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal((CompoundButton.OnCheckedChangeListener) null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f3357a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        super(q6.a.a(context, attributeSet, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup), attributeSet, R.attr.chipGroupStyle);
        d dVar = new d();
        this.f3354x = dVar;
        this.f3355y = -1;
        this.z = false;
        TypedArray d10 = k.d(getContext(), attributeSet, u.f8116t, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = d10.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(d10.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(d10.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(d10.getBoolean(5, false));
        setSingleSelection(d10.getBoolean(6, false));
        setSelectionRequired(d10.getBoolean(4, false));
        int resourceId = d10.getResourceId(0, -1);
        if (resourceId != -1) {
            this.f3355y = resourceId;
        }
        d10.recycle();
        super.setOnHierarchyChangeListener(dVar);
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        w.d.s(this, 1);
    }

    private int getChipCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof Chip) {
                i10++;
            }
        }
        return i10;
    }

    /* access modifiers changed from: private */
    public void setCheckedId(int i10) {
        this.f3355y = i10;
    }

    public final boolean a() {
        return this.f5883q;
    }

    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i11 = this.f3355y;
                if (i11 != -1 && this.u) {
                    d(i11, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i10, layoutParams);
    }

    public final void c(int i10) {
        int i11 = this.f3355y;
        if (i10 != i11) {
            if (i11 != -1 && this.u) {
                d(i11, false);
            }
            if (i10 != -1) {
                d(i10, true);
            }
            setCheckedId(i10);
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof b);
    }

    public final void d(int i10, boolean z10) {
        View findViewById = findViewById(i10);
        if (findViewById instanceof Chip) {
            this.z = true;
            ((Chip) findViewById).setChecked(z10);
            this.z = false;
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public int getCheckedChipId() {
        if (this.u) {
            return this.f3355y;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.u) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.f3351s;
    }

    public int getChipSpacingVertical() {
        return this.f3352t;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f3355y;
        if (i10 != -1) {
            d(i10, true);
            setCheckedId(this.f3355y);
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        int i11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f5883q) {
            i10 = getChipCount();
        } else {
            i10 = -1;
        }
        int rowCount = getRowCount();
        if (this.u) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(rowCount, i10, false, i11));
    }

    public void setChipSpacing(int i10) {
        setChipSpacingHorizontal(i10);
        setChipSpacingVertical(i10);
    }

    public void setChipSpacingHorizontal(int i10) {
        if (this.f3351s != i10) {
            this.f3351s = i10;
            setItemSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i10) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingResource(int i10) {
        setChipSpacing(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingVertical(int i10) {
        if (this.f3352t != i10) {
            this.f3352t = i10;
            setLineSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i10) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i10));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i10) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(c cVar) {
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f3354x.f3357a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z10) {
        this.f3353v = z10;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i10) {
        setSingleLine(getResources().getBoolean(i10));
    }

    public void setSingleLine(boolean z10) {
        super.setSingleLine(z10);
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }

    public void setSingleSelection(boolean z10) {
        if (this.u != z10) {
            this.u = z10;
            this.z = true;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof Chip) {
                    ((Chip) childAt).setChecked(false);
                }
            }
            this.z = false;
            setCheckedId(-1);
        }
    }
}

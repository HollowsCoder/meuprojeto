package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.karumi.dexter.R;
import h6.k;
import h6.n;
import i0.b0;
import i0.w;
import j0.b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.WeakHashMap;
import m6.i;
import p9.u;

public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f3328y = 0;

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList f3329o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    public final c f3330p = new c();

    /* renamed from: q  reason: collision with root package name */
    public final f f3331q = new f();

    /* renamed from: r  reason: collision with root package name */
    public final LinkedHashSet<e> f3332r = new LinkedHashSet<>();

    /* renamed from: s  reason: collision with root package name */
    public final a f3333s = new a();

    /* renamed from: t  reason: collision with root package name */
    public Integer[] f3334t;
    public boolean u = false;

    /* renamed from: v  reason: collision with root package name */
    public boolean f3335v;
    public boolean w;

    /* renamed from: x  reason: collision with root package name */
    public int f3336x;

    public class a implements Comparator<MaterialButton> {
        public a() {
        }

        public final int compare(Object obj, Object obj2) {
            MaterialButton materialButton = (MaterialButton) obj;
            MaterialButton materialButton2 = (MaterialButton) obj2;
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
        }
    }

    public class b extends i0.a {
        public b() {
        }

        public final void d(View view, j0.b bVar) {
            int i10;
            this.f5951a.onInitializeAccessibilityNodeInfo(view, bVar.f6386a);
            int i11 = MaterialButtonToggleGroup.f3328y;
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            materialButtonToggleGroup.getClass();
            if (view instanceof MaterialButton) {
                int i12 = 0;
                i10 = 0;
                while (true) {
                    if (i12 >= materialButtonToggleGroup.getChildCount()) {
                        break;
                    } else if (materialButtonToggleGroup.getChildAt(i12) == view) {
                        break;
                    } else {
                        if ((materialButtonToggleGroup.getChildAt(i12) instanceof MaterialButton) && materialButtonToggleGroup.d(i12)) {
                            i10++;
                        }
                        i12++;
                    }
                }
            }
            i10 = -1;
            bVar.h(b.C0084b.a(0, 1, i10, 1, ((MaterialButton) view).isChecked()));
        }
    }

    public class c implements MaterialButton.a {
        public c() {
        }

        public final void a(MaterialButton materialButton, boolean z) {
            int i10;
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            if (!materialButtonToggleGroup.u) {
                if (materialButtonToggleGroup.f3335v) {
                    if (z) {
                        i10 = materialButton.getId();
                    } else {
                        i10 = -1;
                    }
                    materialButtonToggleGroup.f3336x = i10;
                }
                if (materialButtonToggleGroup.e(materialButton.getId(), z)) {
                    materialButtonToggleGroup.b(materialButton.getId(), materialButton.isChecked());
                }
                materialButtonToggleGroup.invalidate();
            }
        }
    }

    public static class d {

        /* renamed from: e  reason: collision with root package name */
        public static final m6.a f3339e = new m6.a(0.0f);

        /* renamed from: a  reason: collision with root package name */
        public final m6.c f3340a;

        /* renamed from: b  reason: collision with root package name */
        public final m6.c f3341b;

        /* renamed from: c  reason: collision with root package name */
        public final m6.c f3342c;
        public final m6.c d;

        public d(m6.c cVar, m6.c cVar2, m6.c cVar3, m6.c cVar4) {
            this.f3340a = cVar;
            this.f3341b = cVar3;
            this.f3342c = cVar4;
            this.d = cVar2;
        }
    }

    public interface e {
        void a();
    }

    public class f implements MaterialButton.b {
        public f() {
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(q6.a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, 2131952289), attributeSet, R.attr.materialButtonToggleGroupStyle);
        TypedArray d10 = k.d(getContext(), attributeSet, u.E, R.attr.materialButtonToggleGroupStyle, 2131952289, new int[0]);
        setSingleSelection(d10.getBoolean(2, false));
        this.f3336x = d10.getResourceId(0, -1);
        this.w = d10.getBoolean(1, false);
        setChildrenDrawingOrderEnabled(true);
        d10.recycle();
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        w.d.s(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (d(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (d(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && d(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private void setCheckedId(int i10) {
        this.f3336x = i10;
        b(i10, true);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            materialButton.setId(w.e.a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.f3322s.add(this.f3330p);
        materialButton.setOnPressedChangeListenerInternal(this.f3331q);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
                MaterialButton c10 = c(i10);
                int min = Math.min(c10.getStrokeWidth(), c(i10 - 1).getStrokeWidth());
                ViewGroup.LayoutParams layoutParams2 = c10.getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    layoutParams = (LinearLayout.LayoutParams) layoutParams2;
                } else {
                    layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
                }
                if (getOrientation() == 0) {
                    layoutParams.setMarginEnd(0);
                    layoutParams.setMarginStart(-min);
                    layoutParams.topMargin = 0;
                } else {
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = -min;
                    layoutParams.setMarginStart(0);
                }
                c10.setLayoutParams(layoutParams);
            }
            if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) c(firstVisibleChildIndex).getLayoutParams();
                if (getOrientation() == 1) {
                    layoutParams3.topMargin = 0;
                    layoutParams3.bottomMargin = 0;
                    return;
                }
                layoutParams3.setMarginEnd(0);
                layoutParams3.setMarginStart(0);
                layoutParams3.leftMargin = 0;
                layoutParams3.rightMargin = 0;
            }
        }
    }

    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MaterialButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.isChecked()) {
            e(materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        i shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f3329o.add(new d(shapeAppearanceModel.f7154e, shapeAppearanceModel.f7157h, shapeAppearanceModel.f7155f, shapeAppearanceModel.f7156g));
        w.k(materialButton, new b());
    }

    public final void b(int i10, boolean z) {
        Iterator<e> it = this.f3332r.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public final MaterialButton c(int i10) {
        return (MaterialButton) getChildAt(i10);
    }

    public final boolean d(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f3333s);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put(c(i10), Integer.valueOf(i10));
        }
        this.f3334t = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final boolean e(int i10, boolean z) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (!this.w || !checkedButtonIds.isEmpty()) {
            if (z && this.f3335v) {
                checkedButtonIds.remove(Integer.valueOf(i10));
                for (Integer intValue : checkedButtonIds) {
                    int intValue2 = intValue.intValue();
                    View findViewById = findViewById(intValue2);
                    if (findViewById instanceof MaterialButton) {
                        this.u = true;
                        ((MaterialButton) findViewById).setChecked(false);
                        this.u = false;
                    }
                    b(intValue2, false);
                }
            }
            return true;
        }
        View findViewById2 = findViewById(i10);
        if (findViewById2 instanceof MaterialButton) {
            this.u = true;
            ((MaterialButton) findViewById2).setChecked(true);
            this.u = false;
        }
        this.f3336x = i10;
        return false;
    }

    public final void f() {
        boolean z;
        d dVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton c10 = c(i10);
            if (c10.getVisibility() != 8) {
                i shapeAppearanceModel = c10.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                i.a aVar = new i.a(shapeAppearanceModel);
                d dVar2 = (d) this.f3329o.get(i10);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    if (getOrientation() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    m6.a aVar2 = d.f3339e;
                    if (i10 == firstVisibleChildIndex) {
                        if (!z) {
                            dVar = new d(dVar2.f3340a, aVar2, dVar2.f3341b, aVar2);
                        } else if (n.a(this)) {
                            dVar = new d(aVar2, aVar2, dVar2.f3341b, dVar2.f3342c);
                        } else {
                            dVar = new d(dVar2.f3340a, dVar2.d, aVar2, aVar2);
                        }
                    } else if (i10 != lastVisibleChildIndex) {
                        dVar2 = null;
                    } else if (!z) {
                        dVar = new d(aVar2, dVar2.d, aVar2, dVar2.f3342c);
                    } else if (n.a(this)) {
                        dVar = new d(dVar2.f3340a, dVar2.d, aVar2, aVar2);
                    } else {
                        dVar = new d(aVar2, aVar2, dVar2.f3341b, dVar2.f3342c);
                    }
                    dVar2 = dVar;
                }
                if (dVar2 == null) {
                    aVar.f7164e = new m6.a(0.0f);
                    aVar.f7165f = new m6.a(0.0f);
                    aVar.f7166g = new m6.a(0.0f);
                    aVar.f7167h = new m6.a(0.0f);
                } else {
                    aVar.f7164e = dVar2.f3340a;
                    aVar.f7167h = dVar2.d;
                    aVar.f7165f = dVar2.f3341b;
                    aVar.f7166g = dVar2.f3342c;
                }
                c10.setShapeAppearanceModel(new i(aVar));
            }
        }
    }

    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.f3335v) {
            return this.f3336x;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            MaterialButton c10 = c(i10);
            if (c10.isChecked()) {
                arrayList.add(Integer.valueOf(c10.getId()));
            }
        }
        return arrayList;
    }

    public final int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f3334t;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        Log.w("MaterialButtonToggleGroup", "Child order wasn't updated");
        return i11;
    }

    public final void onFinishInflate() {
        MaterialButton materialButton;
        super.onFinishInflate();
        int i10 = this.f3336x;
        if (i10 != -1 && (materialButton = (MaterialButton) findViewById(i10)) != null) {
            materialButton.setChecked(true);
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (this.f3335v) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, visibleButtonCount, false, i10));
    }

    public final void onMeasure(int i10, int i11) {
        f();
        a();
        super.onMeasure(i10, i11);
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.f3322s.remove(this.f3330p);
            materialButton.setOnPressedChangeListenerInternal((MaterialButton.b) null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f3329o.remove(indexOfChild);
        }
        f();
        a();
    }

    public void setSelectionRequired(boolean z) {
        this.w = z;
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }

    public void setSingleSelection(boolean z) {
        if (this.f3335v != z) {
            this.f3335v = z;
            this.u = true;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                MaterialButton c10 = c(i10);
                c10.setChecked(false);
                b(c10.getId(), false);
            }
            this.u = false;
            setCheckedId(-1);
        }
    }
}

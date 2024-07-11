package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import androidx.viewpager2.widget.c;
import i0.b0;
import i0.w;
import j0.b;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class ViewPager2 extends ViewGroup {
    public g1.c A;
    public b B;
    public RecyclerView.k C;
    public boolean D;
    public boolean E;
    public int F;
    public f G;

    /* renamed from: o  reason: collision with root package name */
    public final Rect f1886o = new Rect();

    /* renamed from: p  reason: collision with root package name */
    public final Rect f1887p = new Rect();

    /* renamed from: q  reason: collision with root package name */
    public int f1888q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1889r;

    /* renamed from: s  reason: collision with root package name */
    public final a f1890s;

    /* renamed from: t  reason: collision with root package name */
    public d f1891t;
    public int u;

    /* renamed from: v  reason: collision with root package name */
    public Parcelable f1892v;
    public i w;

    /* renamed from: x  reason: collision with root package name */
    public h f1893x;

    /* renamed from: y  reason: collision with root package name */
    public c f1894y;
    public a z;

    public class a extends c {
        public a() {
        }

        public final void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f1889r = true;
            viewPager2.f1894y.l = true;
        }
    }

    public abstract class b {
    }

    public static abstract class c extends RecyclerView.h {
        public abstract void a();

        public final void b() {
            a();
        }

        public final void c(int i10) {
            a();
        }
    }

    public class d extends LinearLayoutManager {
        public d() {
            super(1);
        }

        public final void D0(RecyclerView.z zVar, int[] iArr) {
            ViewPager2 viewPager2 = ViewPager2.this;
            int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.D0(zVar, iArr);
                return;
            }
            int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        public final void V(RecyclerView.u uVar, RecyclerView.z zVar, j0.b bVar) {
            super.V(uVar, zVar, bVar);
            ViewPager2.this.G.getClass();
        }

        public final boolean i0(RecyclerView.u uVar, RecyclerView.z zVar, int i10, Bundle bundle) {
            ViewPager2.this.G.getClass();
            return super.i0(uVar, zVar, i10, bundle);
        }

        public final boolean n0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z10) {
            return false;
        }
    }

    public static abstract class e {
        public void a(int i10) {
        }

        public void b(float f10, int i10, int i11) {
        }

        public void c(int i10) {
        }
    }

    public class f extends b {

        /* renamed from: a  reason: collision with root package name */
        public final a f1896a = new a();

        /* renamed from: b  reason: collision with root package name */
        public final b f1897b = new b();

        /* renamed from: c  reason: collision with root package name */
        public f f1898c;

        public class a implements j0.d {
            public a() {
            }

            public final boolean a(View view) {
                int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.E) {
                    viewPager2.b(currentItem);
                }
                return true;
            }
        }

        public class b implements j0.d {
            public b() {
            }

            public final boolean a(View view) {
                int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.E) {
                    viewPager2.b(currentItem);
                }
                return true;
            }
        }

        public f() {
        }

        public final void a(RecyclerView recyclerView) {
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            w.d.s(recyclerView, 2);
            this.f1898c = new f(this);
            ViewPager2 viewPager2 = ViewPager2.this;
            if (w.d.c(viewPager2) == 0) {
                w.d.s(viewPager2, 1);
            }
        }

        public final void b() {
            int a10;
            int i10;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i11 = 16908360;
            w.h(viewPager2, 16908360);
            boolean z = false;
            w.f(viewPager2, 0);
            w.h(viewPager2, 16908361);
            w.f(viewPager2, 0);
            w.h(viewPager2, 16908358);
            w.f(viewPager2, 0);
            w.h(viewPager2, 16908359);
            w.f(viewPager2, 0);
            if (viewPager2.getAdapter() != null && (a10 = viewPager2.getAdapter().a()) != 0 && viewPager2.E) {
                int orientation = viewPager2.getOrientation();
                b bVar = this.f1897b;
                a aVar = this.f1896a;
                if (orientation == 0) {
                    if (viewPager2.f1891t.A() == 1) {
                        z = true;
                    }
                    if (z) {
                        i10 = 16908360;
                    } else {
                        i10 = 16908361;
                    }
                    if (z) {
                        i11 = 16908361;
                    }
                    if (viewPager2.f1888q < a10 - 1) {
                        w.i(viewPager2, new b.a(i10), aVar);
                    }
                    if (viewPager2.f1888q > 0) {
                        w.i(viewPager2, new b.a(i11), bVar);
                        return;
                    }
                    return;
                }
                if (viewPager2.f1888q < a10 - 1) {
                    w.i(viewPager2, new b.a(16908359), aVar);
                }
                if (viewPager2.f1888q > 0) {
                    w.i(viewPager2, new b.a(16908358), bVar);
                }
            }
        }
    }

    public interface g {
        void f(View view, float f10);
    }

    public class h extends u {
        public h() {
        }

        public final View c(RecyclerView.n nVar) {
            if (((c) ViewPager2.this.A.f4967p).f1920m) {
                return null;
            }
            return super.c(nVar);
        }
    }

    public class i extends RecyclerView {
        public i(Context context) {
            super(context, (AttributeSet) null);
        }

        public final CharSequence getAccessibilityClassName() {
            ViewPager2.this.G.getClass();
            return super.getAccessibilityClassName();
        }

        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            ViewPager2 viewPager2 = ViewPager2.this;
            accessibilityEvent.setFromIndex(viewPager2.f1888q);
            accessibilityEvent.setToIndex(viewPager2.f1888q);
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (!ViewPager2.this.E || !super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (!ViewPager2.this.E || !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
    }

    public static class j extends View.BaseSavedState {
        public static final Parcelable.Creator<j> CREATOR = new a();

        /* renamed from: o  reason: collision with root package name */
        public int f1902o;

        /* renamed from: p  reason: collision with root package name */
        public int f1903p;

        /* renamed from: q  reason: collision with root package name */
        public Parcelable f1904q;

        public static class a implements Parcelable.ClassLoaderCreator<j> {
            public final Object createFromParcel(Parcel parcel) {
                return new j(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i10) {
                return new j[i10];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new j(parcel, classLoader);
            }
        }

        public j() {
            throw null;
        }

        public j(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1902o = parcel.readInt();
            this.f1903p = parcel.readInt();
            this.f1904q = parcel.readParcelable(classLoader);
        }

        public j(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1902o);
            parcel.writeInt(this.f1903p);
            parcel.writeParcelable(this.f1904q, i10);
        }
    }

    public static class k implements Runnable {

        /* renamed from: o  reason: collision with root package name */
        public final int f1905o;

        /* renamed from: p  reason: collision with root package name */
        public final RecyclerView f1906p;

        public k(int i10, i iVar) {
            this.f1905o = i10;
            this.f1906p = iVar;
        }

        public final void run() {
            this.f1906p.c0(this.f1905o);
        }
    }

    /* JADX INFO: finally extract failed */
    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a();
        this.f1889r = false;
        this.f1890s = new a();
        this.u = -1;
        this.C = null;
        this.D = false;
        this.E = true;
        this.F = -1;
        this.G = new f();
        i iVar = new i(context);
        this.w = iVar;
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        iVar.setId(w.e.a());
        this.w.setDescendantFocusability(131072);
        d dVar = new d();
        this.f1891t = dVar;
        this.w.setLayoutManager(dVar);
        this.w.setScrollingTouchSlop(1);
        int[] iArr = androidx.databinding.a.f998a0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
            this.w.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            i iVar2 = this.w;
            g1.d dVar2 = new g1.d();
            if (iVar2.Q == null) {
                iVar2.Q = new ArrayList();
            }
            iVar2.Q.add(dVar2);
            c cVar = new c(this);
            this.f1894y = cVar;
            this.A = new g1.c(this, cVar, this.w);
            h hVar = new h();
            this.f1893x = hVar;
            hVar.a(this.w);
            this.w.h(this.f1894y);
            a aVar2 = new a();
            this.z = aVar2;
            this.f1894y.f1910a = aVar2;
            d dVar3 = new d(this);
            e eVar = new e(this);
            this.z.f1907a.add(dVar3);
            this.z.f1907a.add(eVar);
            this.G.a(this.w);
            this.z.f1907a.add(aVar);
            b bVar = new b(this.f1891t);
            this.B = bVar;
            this.z.f1907a.add(bVar);
            i iVar3 = this.w;
            attachViewToParent(iVar3, 0, iVar3.getLayoutParams());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a() {
        RecyclerView.f adapter;
        if (this.u != -1 && (adapter = getAdapter()) != null) {
            if (this.f1892v != null) {
                if (adapter instanceof androidx.viewpager2.adapter.a) {
                    ((androidx.viewpager2.adapter.a) adapter).b();
                }
                this.f1892v = null;
            }
            int max = Math.max(0, Math.min(this.u, adapter.a() - 1));
            this.f1888q = max;
            this.u = -1;
            this.w.a0(max);
            this.G.b();
        }
    }

    public final void b(int i10) {
        boolean z10;
        int i11;
        boolean z11;
        RecyclerView.f adapter = getAdapter();
        boolean z12 = false;
        if (adapter == null) {
            if (this.u != -1) {
                this.u = Math.max(i10, 0);
            }
        } else if (adapter.a() > 0) {
            int min = Math.min(Math.max(i10, 0), adapter.a() - 1);
            int i12 = this.f1888q;
            if (min == i12) {
                if (this.f1894y.f1914f == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    return;
                }
            }
            if (min != i12) {
                double d10 = (double) i12;
                this.f1888q = min;
                this.G.b();
                c cVar = this.f1894y;
                if (cVar.f1914f == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    cVar.f();
                    c.a aVar = cVar.f1915g;
                    d10 = ((double) aVar.f1921a) + ((double) aVar.f1922b);
                }
                c cVar2 = this.f1894y;
                cVar2.getClass();
                cVar2.f1913e = 2;
                cVar2.f1920m = false;
                if (cVar2.f1917i != min) {
                    z12 = true;
                }
                cVar2.f1917i = min;
                cVar2.d(2);
                if (z12) {
                    cVar2.c(min);
                }
                double d11 = (double) min;
                if (Math.abs(d11 - d10) > 3.0d) {
                    i iVar = this.w;
                    if (d11 > d10) {
                        i11 = min - 3;
                    } else {
                        i11 = min + 3;
                    }
                    iVar.a0(i11);
                    i iVar2 = this.w;
                    iVar2.post(new k(min, iVar2));
                    return;
                }
                this.w.c0(min);
            }
        }
    }

    public final void c() {
        h hVar = this.f1893x;
        if (hVar != null) {
            View c10 = hVar.c(this.f1891t);
            if (c10 != null) {
                this.f1891t.getClass();
                int G2 = RecyclerView.n.G(c10);
                if (G2 != this.f1888q && getScrollState() == 0) {
                    this.z.c(G2);
                }
                this.f1889r = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public final boolean canScrollHorizontally(int i10) {
        return this.w.canScrollHorizontally(i10);
    }

    public final boolean canScrollVertically(int i10) {
        return this.w.canScrollVertically(i10);
    }

    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof j) {
            int i10 = ((j) parcelable).f1902o;
            sparseArray.put(this.w.getId(), sparseArray.get(i10));
            sparseArray.remove(i10);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        a();
    }

    public CharSequence getAccessibilityClassName() {
        this.G.getClass();
        this.G.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public RecyclerView.f getAdapter() {
        return this.w.getAdapter();
    }

    public int getCurrentItem() {
        return this.f1888q;
    }

    public int getItemDecorationCount() {
        return this.w.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.F;
    }

    public int getOrientation() {
        return this.f1891t.f1540p;
    }

    public int getPageSize() {
        int i10;
        int i11;
        i iVar = this.w;
        if (getOrientation() == 0) {
            i10 = iVar.getWidth() - iVar.getPaddingLeft();
            i11 = iVar.getPaddingRight();
        } else {
            i10 = iVar.getHeight() - iVar.getPaddingTop();
            i11 = iVar.getPaddingBottom();
        }
        return i10 - i11;
    }

    public int getScrollState() {
        return this.f1894y.f1914f;
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        int i11;
        int a10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = ViewPager2.this;
        if (viewPager2.getAdapter() != null) {
            int orientation = viewPager2.getOrientation();
            i10 = viewPager2.getAdapter().a();
            if (orientation == 1) {
                i11 = 0;
            } else {
                i11 = i10;
                i10 = 0;
            }
        } else {
            i11 = 0;
            i10 = 0;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, false, 0));
        RecyclerView.f adapter = viewPager2.getAdapter();
        if (adapter != null && (a10 = adapter.a()) != 0 && viewPager2.E) {
            if (viewPager2.f1888q > 0) {
                accessibilityNodeInfo.addAction(8192);
            }
            if (viewPager2.f1888q < a10 - 1) {
                accessibilityNodeInfo.addAction(4096);
            }
            accessibilityNodeInfo.setScrollable(true);
        }
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = this.w.getMeasuredWidth();
        int measuredHeight = this.w.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f1886o;
        rect.left = paddingLeft;
        rect.right = (i12 - i10) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i13 - i11) - getPaddingBottom();
        Rect rect2 = this.f1887p;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.w.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f1889r) {
            c();
        }
    }

    public final void onMeasure(int i10, int i11) {
        measureChild(this.w, i10, i11);
        int measuredWidth = this.w.getMeasuredWidth();
        int measuredHeight = this.w.getMeasuredHeight();
        int measuredState = this.w.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingTop = getPaddingTop();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, measuredState), View.resolveSizeAndState(Math.max(getPaddingBottom() + paddingTop + measuredHeight, getSuggestedMinimumHeight()), i11, measuredState << 16));
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.getSuperState());
        this.u = jVar.f1903p;
        this.f1892v = jVar.f1904q;
    }

    public final Parcelable onSaveInstanceState() {
        j jVar = new j(super.onSaveInstanceState());
        jVar.f1902o = this.w.getId();
        int i10 = this.u;
        if (i10 == -1) {
            i10 = this.f1888q;
        }
        jVar.f1903p = i10;
        Parcelable parcelable = this.f1892v;
        if (parcelable == null) {
            RecyclerView.f adapter = this.w.getAdapter();
            if (adapter instanceof androidx.viewpager2.adapter.a) {
                parcelable = ((androidx.viewpager2.adapter.a) adapter).a();
            }
            return jVar;
        }
        jVar.f1904q = parcelable;
        return jVar;
    }

    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        boolean z10;
        int i11;
        this.G.getClass();
        boolean z11 = false;
        if (i10 == 8192 || i10 == 4096) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return super.performAccessibilityAction(i10, bundle);
        }
        f fVar = this.G;
        fVar.getClass();
        if (i10 == 8192 || i10 == 4096) {
            z11 = true;
        }
        if (z11) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (i10 == 8192) {
                i11 = viewPager2.getCurrentItem() - 1;
            } else {
                i11 = viewPager2.getCurrentItem() + 1;
            }
            if (viewPager2.E) {
                viewPager2.b(i11);
            }
            return true;
        }
        throw new IllegalStateException();
    }

    public void setAdapter(RecyclerView.f fVar) {
        RecyclerView.f adapter = this.w.getAdapter();
        f fVar2 = this.G;
        if (adapter != null) {
            adapter.f1628a.unregisterObserver(fVar2.f1898c);
        } else {
            fVar2.getClass();
        }
        a aVar = this.f1890s;
        if (adapter != null) {
            adapter.f1628a.unregisterObserver(aVar);
        }
        this.w.setAdapter(fVar);
        this.f1888q = 0;
        a();
        f fVar3 = this.G;
        fVar3.b();
        if (fVar != null) {
            fVar.f1628a.registerObserver(fVar3.f1898c);
        }
        if (fVar != null) {
            fVar.f1628a.registerObserver(aVar);
        }
    }

    public void setCurrentItem(int i10) {
        if (!((c) this.A.f4967p).f1920m) {
            b(i10);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    public void setLayoutDirection(int i10) {
        super.setLayoutDirection(i10);
        this.G.b();
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 >= 1 || i10 == -1) {
            this.F = i10;
            this.w.requestLayout();
            return;
        }
        throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public void setOrientation(int i10) {
        this.f1891t.d1(i10);
        this.G.b();
    }

    public void setPageTransformer(g gVar) {
        boolean z10 = this.D;
        if (gVar != null) {
            if (!z10) {
                this.C = this.w.getItemAnimator();
                this.D = true;
            }
            this.w.setItemAnimator((RecyclerView.k) null);
        } else if (z10) {
            this.w.setItemAnimator(this.C);
            this.C = null;
            this.D = false;
        }
        b bVar = this.B;
        if (gVar != bVar.f1909b) {
            bVar.f1909b = gVar;
            if (gVar != null) {
                c cVar = this.f1894y;
                cVar.f();
                c.a aVar = cVar.f1915g;
                double d10 = ((double) aVar.f1921a) + ((double) aVar.f1922b);
                int i10 = (int) d10;
                float f10 = (float) (d10 - ((double) i10));
                this.B.b(f10, i10, Math.round(((float) getPageSize()) * f10));
            }
        }
    }

    public void setUserInputEnabled(boolean z10) {
        this.E = z10;
        this.G.b();
    }
}

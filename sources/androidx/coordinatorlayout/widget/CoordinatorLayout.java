package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.x0;
import com.karumi.dexter.R;
import i0.b0;
import i0.e0;
import i0.l;
import i0.m;
import i0.n;
import i0.o;
import i0.w;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import y.a;

public class CoordinatorLayout extends ViewGroup implements l, m {
    public static final String H;
    public static final Class<?>[] I = {Context.class, AttributeSet.class};
    public static final ThreadLocal<Map<String, Constructor<c>>> J = new ThreadLocal<>();
    public static final i K = new i();
    public static final h0.e L = new h0.e(12);
    public boolean A;
    public e0 B;
    public boolean C;
    public Drawable D;
    public ViewGroup.OnHierarchyChangeListener E;
    public a F;
    public final n G = new n();

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList f931o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    public final o.c f932p = new o.c(1);

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList f933q = new ArrayList();

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f934r = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    public final int[] f935s = new int[2];

    /* renamed from: t  reason: collision with root package name */
    public final int[] f936t = new int[2];
    public boolean u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f937v;
    public final int[] w;

    /* renamed from: x  reason: collision with root package name */
    public View f938x;

    /* renamed from: y  reason: collision with root package name */
    public View f939y;
    public g z;

    public class a implements o {
        public a() {
        }

        public final e0 a(View view, e0 e0Var) {
            boolean z;
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!Objects.equals(coordinatorLayout.B, e0Var)) {
                coordinatorLayout.B = e0Var;
                boolean z10 = true;
                if (e0Var.d() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                coordinatorLayout.C = z;
                if (z || coordinatorLayout.getBackground() != null) {
                    z10 = false;
                }
                coordinatorLayout.setWillNotDraw(z10);
                e0.k kVar = e0Var.f5969a;
                if (!kVar.j()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = coordinatorLayout.getChildAt(i10);
                        WeakHashMap<View, b0> weakHashMap = w.f6004a;
                        if (w.d.b(childAt) && ((f) childAt.getLayoutParams()).f942a != null && kVar.j()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return e0Var;
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public boolean a(View view, Rect rect) {
            return false;
        }

        public boolean b(View view, View view2) {
            return false;
        }

        public void c(f fVar) {
        }

        public boolean d(CoordinatorLayout coordinatorLayout, V v10, View view) {
            return false;
        }

        public void e(CoordinatorLayout coordinatorLayout, View view) {
        }

        public void f() {
        }

        public boolean g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
            return false;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            return false;
        }

        public boolean j(View view) {
            return false;
        }

        public void k(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
        }

        public void l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
            iArr[0] = iArr[0] + i11;
            iArr[1] = iArr[1] + i12;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v10, Rect rect, boolean z) {
            return false;
        }

        public void n(View view, Parcelable parcelable) {
        }

        public Parcelable o(View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean p(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
            return false;
        }

        public void q(CoordinatorLayout coordinatorLayout, V v10, View view, int i10) {
        }

        public boolean r(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class<? extends c> value();
    }

    public class e implements ViewGroup.OnHierarchyChangeListener {
        public e() {
        }

        public final void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.E;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            coordinatorLayout.q(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.E;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public c f942a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f943b = false;

        /* renamed from: c  reason: collision with root package name */
        public final int f944c = 0;
        public int d = 0;

        /* renamed from: e  reason: collision with root package name */
        public final int f945e = -1;

        /* renamed from: f  reason: collision with root package name */
        public final int f946f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f947g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f948h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f949i;

        /* renamed from: j  reason: collision with root package name */
        public int f950j;

        /* renamed from: k  reason: collision with root package name */
        public View f951k;
        public View l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f952m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f953n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f954o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f955p;

        /* renamed from: q  reason: collision with root package name */
        public final Rect f956q = new Rect();

        public f() {
            super(-2, -2);
        }

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            c cVar;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.e.w);
            this.f944c = obtainStyledAttributes.getInteger(0, 0);
            this.f946f = obtainStyledAttributes.getResourceId(1, -1);
            this.d = obtainStyledAttributes.getInteger(2, 0);
            this.f945e = obtainStyledAttributes.getInteger(6, -1);
            this.f947g = obtainStyledAttributes.getInt(5, 0);
            this.f948h = obtainStyledAttributes.getInt(4, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(3);
            this.f943b = hasValue;
            if (hasValue) {
                String string = obtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.H;
                if (TextUtils.isEmpty(string)) {
                    cVar = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.H;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<c>>> threadLocal = CoordinatorLayout.J;
                        Map map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap();
                            threadLocal.set(map);
                        }
                        Constructor<?> constructor = (Constructor) map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.I);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        cVar = (c) constructor.newInstance(new Object[]{context, attributeSet});
                    } catch (Exception e10) {
                        throw new RuntimeException(x0.e("Could not inflate Behavior subclass ", string), e10);
                    }
                }
                this.f942a = cVar;
            }
            obtainStyledAttributes.recycle();
            c cVar2 = this.f942a;
            if (cVar2 != null) {
                cVar2.c(this);
            }
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public f(f fVar) {
            super(fVar);
        }

        public final boolean a(int i10) {
            if (i10 == 0) {
                return this.f953n;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f954o;
        }

        public final void b(c cVar) {
            c cVar2 = this.f942a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.f();
                }
                this.f942a = cVar;
                this.f943b = true;
                if (cVar != null) {
                    cVar.c(this);
                }
            }
        }
    }

    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
        }

        public final boolean onPreDraw() {
            CoordinatorLayout.this.q(0);
            return true;
        }
    }

    public static class h extends n0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: q  reason: collision with root package name */
        public SparseArray<Parcelable> f958q;

        public static class a implements Parcelable.ClassLoaderCreator<h> {
            public final Object createFromParcel(Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i10) {
                return new h[i10];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f958q = new SparseArray<>(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                this.f958q.append(iArr[i10], readParcelableArray[i10]);
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            int i11;
            parcel.writeParcelable(this.f7340o, i10);
            SparseArray<Parcelable> sparseArray = this.f958q;
            if (sparseArray != null) {
                i11 = sparseArray.size();
            } else {
                i11 = 0;
            }
            parcel.writeInt(i11);
            int[] iArr = new int[i11];
            Parcelable[] parcelableArr = new Parcelable[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                iArr[i12] = this.f958q.keyAt(i12);
                parcelableArr[i12] = this.f958q.valueAt(i12);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }
    }

    public static class i implements Comparator<View> {
        public final int compare(Object obj, Object obj2) {
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            float m10 = w.i.m((View) obj);
            float m11 = w.i.m((View) obj2);
            if (m10 > m11) {
                return -1;
            }
            if (m10 < m11) {
                return 1;
            }
            return 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = r0.getName()
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            H = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$i r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$i
            r0.<init>()
            K = r0
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            I = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            J = r0
            h0.e r0 = new h0.e
            r1 = 12
            r0.<init>(r1)
            L = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void");
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        int[] iArr = n.e.f7301v;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.w = intArray;
            float f10 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i10 = 0; i10 < length; i10++) {
                int[] iArr2 = this.w;
                iArr2[i10] = (int) (((float) iArr2[i10]) * f10);
            }
        }
        this.D = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        y();
        super.setOnHierarchyChangeListener(new e());
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        if (w.d.c(this) == 0) {
            w.d.s(this, 1);
        }
    }

    public static Rect a() {
        Rect rect = (Rect) L.b();
        return rect == null ? new Rect() : rect;
    }

    public static void h(int i10, Rect rect, Rect rect2, f fVar, int i11, int i12) {
        int i13;
        int i14;
        int i15 = fVar.f944c;
        if (i15 == 0) {
            i15 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i15, i10);
        int i16 = fVar.d;
        if ((i16 & 7) == 0) {
            i16 |= 8388611;
        }
        if ((i16 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i16 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i16, i10);
        int i17 = absoluteGravity & 7;
        int i18 = absoluteGravity & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        int i19 = absoluteGravity2 & 7;
        int i20 = absoluteGravity2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        if (i19 == 1) {
            i13 = rect.left + (rect.width() / 2);
        } else if (i19 != 5) {
            i13 = rect.left;
        } else {
            i13 = rect.right;
        }
        if (i20 == 16) {
            i14 = rect.top + (rect.height() / 2);
        } else if (i20 != 80) {
            i14 = rect.top;
        } else {
            i14 = rect.bottom;
        }
        if (i17 == 1) {
            i13 -= i11 / 2;
        } else if (i17 != 5) {
            i13 -= i11;
        }
        if (i18 == 16) {
            i14 -= i12 / 2;
        } else if (i18 != 80) {
            i14 -= i12;
        }
        rect2.set(i13, i14, i11 + i13, i12 + i14);
    }

    public static f l(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f943b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.b(behavior);
            } else {
                d dVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.b((c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e10) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                    }
                }
            }
            fVar.f943b = true;
        }
        return fVar;
    }

    public static void w(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f949i;
        if (i11 != i10) {
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            view.offsetLeftAndRight(i10 - i11);
            fVar.f949i = i10;
        }
    }

    public static void x(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f950j;
        if (i11 != i10) {
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            view.offsetTopAndBottom(i10 - i11);
            fVar.f950j = i10;
        }
    }

    public final void b(View view, View view2, int i10, int i11) {
        n nVar = this.G;
        if (i11 == 1) {
            nVar.f6000b = i10;
        } else {
            nVar.f5999a = i10;
        }
        this.f939y = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            ((f) getChildAt(i12).getLayoutParams()).getClass();
        }
    }

    public final void c(f fVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - fVar.bottomMargin));
        rect.set(max, max2, i10 + max, i11 + max2);
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public final void d(View view) {
        List list = (List) ((n.i) this.f932p.f7536b).getOrDefault(view, null);
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                View view2 = (View) list.get(i10);
                c cVar = ((f) view2.getLayoutParams()).f942a;
                if (cVar != null) {
                    cVar.d(this, view2, view);
                }
            }
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j8) {
        c cVar = ((f) view.getLayoutParams()).f942a;
        if (cVar != null) {
            cVar.getClass();
        }
        return super.drawChild(canvas, view, j8);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.D;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    public final void e(View view, Rect rect, boolean z10) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            g(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList f(View view) {
        n.i iVar = (n.i) this.f932p.f7536b;
        int i10 = iVar.f7333q;
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < i10; i11++) {
            ArrayList arrayList2 = (ArrayList) iVar.l(i11);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(iVar.h(i11));
            }
        }
        ArrayList arrayList3 = this.f934r;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void g(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = v.a.f9114a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = v.a.f9114a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        v.a.a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = v.a.f9115b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        u();
        return Collections.unmodifiableList(this.f931o);
    }

    public final e0 getLastWindowInsets() {
        return this.B;
    }

    public int getNestedScrollAxes() {
        n nVar = this.G;
        return nVar.f6000b | nVar.f5999a;
    }

    public Drawable getStatusBarBackground() {
        return this.D;
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void i(View view, int i10) {
        n nVar = this.G;
        if (i10 == 1) {
            nVar.f6000b = 0;
        } else {
            nVar.f5999a = 0;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i10)) {
                c cVar = fVar.f942a;
                if (cVar != null) {
                    cVar.q(this, childAt, view, i10);
                }
                if (i10 == 0) {
                    fVar.f953n = false;
                } else if (i10 == 1) {
                    fVar.f954o = false;
                }
                fVar.f955p = false;
            }
        }
        this.f939y = null;
    }

    public final void j(View view, int i10, int i11, int[] iArr, int i12) {
        c cVar;
        int i13;
        int i14;
        int childCount = getChildCount();
        boolean z10 = false;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() == 8) {
                int i18 = i12;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i12) && (cVar = fVar.f942a) != null) {
                    int[] iArr2 = this.f935s;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.k(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.f935s;
                    if (i10 > 0) {
                        i13 = Math.max(i15, iArr3[0]);
                    } else {
                        i13 = Math.min(i15, iArr3[0]);
                    }
                    i15 = i13;
                    if (i11 > 0) {
                        i14 = Math.max(i16, iArr3[1]);
                    } else {
                        i14 = Math.min(i16, iArr3[1]);
                    }
                    i16 = i14;
                    z10 = true;
                }
            }
        }
        iArr[0] = i15;
        iArr[1] = i16;
        if (z10) {
            q(1);
        }
    }

    public final int k(int i10) {
        StringBuilder sb;
        int[] iArr = this.w;
        if (iArr == null) {
            sb = new StringBuilder("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i10);
        } else if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        } else {
            sb = new StringBuilder("Keyline index ");
            sb.append(i10);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    public final void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        c cVar;
        int i15;
        int i16;
        int childCount = getChildCount();
        boolean z10 = false;
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() == 8) {
                int i20 = i14;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i14) && (cVar = fVar.f942a) != null) {
                    int[] iArr2 = this.f935s;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.l(this, childAt, i11, i12, i13, iArr2);
                    if (i12 > 0) {
                        i15 = Math.max(i17, iArr2[0]);
                    } else {
                        i15 = Math.min(i17, iArr2[0]);
                    }
                    i17 = i15;
                    if (i13 > 0) {
                        i16 = Math.max(i18, iArr2[1]);
                    } else {
                        i16 = Math.min(i18, iArr2[1]);
                    }
                    i18 = i16;
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i17;
        iArr[1] = iArr[1] + i18;
        if (z10) {
            q(1);
        }
    }

    public final void n(View view, int i10, int i11, int i12, int i13, int i14) {
        m(view, i10, i11, i12, i13, 0, this.f936t);
    }

    public final boolean o(View view, View view2, int i10, int i11) {
        int i12 = i11;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVar = fVar.f942a;
                if (cVar != null) {
                    boolean p10 = cVar.p(this, childAt, view, view2, i10, i11);
                    z10 |= p10;
                    if (i12 == 0) {
                        fVar.f953n = p10;
                    } else if (i12 == 1) {
                        fVar.f954o = p10;
                    }
                } else if (i12 == 0) {
                    fVar.f953n = false;
                } else if (i12 == 1) {
                    fVar.f954o = false;
                }
            }
        }
        return z10;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v(false);
        if (this.A) {
            if (this.z == null) {
                this.z = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.z);
        }
        if (this.B == null) {
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            if (w.d.b(this)) {
                w.h.c(this);
            }
        }
        this.f937v = true;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v(false);
        if (this.A && this.z != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.z);
        }
        View view = this.f939y;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f937v = false;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.C && this.D != null) {
            e0 e0Var = this.B;
            int d10 = e0Var != null ? e0Var.d() : 0;
            if (d10 > 0) {
                this.D.setBounds(0, 0, getWidth(), d10);
                this.D.draw(canvas);
            }
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            v(true);
        }
        boolean t10 = t(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            v(true);
        }
        return t10;
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        c cVar;
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        int d10 = w.e.d(this);
        ArrayList arrayList = this.f931o;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) arrayList.get(i14);
            if (view.getVisibility() != 8 && ((cVar = ((f) view.getLayoutParams()).f942a) == null || !cVar.h(this, view, d10))) {
                r(view, d10);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0193, code lost:
        if (r0.i(r32, r19, r25, r20, r26) == false) goto L_0x01ad;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0196  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r33, int r34) {
        /*
            r32 = this;
            r6 = r32
            r32.u()
            int r0 = r32.getChildCount()
            r7 = 0
            r1 = r7
        L_0x000b:
            r2 = 1
            if (r1 >= r0) goto L_0x0038
            android.view.View r3 = r6.getChildAt(r1)
            o.c r4 = r6.f932p
            java.lang.Object r4 = r4.f7536b
            n.i r4 = (n.i) r4
            int r5 = r4.f7333q
            r8 = r7
        L_0x001b:
            if (r8 >= r5) goto L_0x0030
            java.lang.Object r9 = r4.l(r8)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L_0x002d
            boolean r9 = r9.contains(r3)
            if (r9 == 0) goto L_0x002d
            r3 = r2
            goto L_0x0031
        L_0x002d:
            int r8 = r8 + 1
            goto L_0x001b
        L_0x0030:
            r3 = r7
        L_0x0031:
            if (r3 == 0) goto L_0x0035
            r0 = r2
            goto L_0x0039
        L_0x0035:
            int r1 = r1 + 1
            goto L_0x000b
        L_0x0038:
            r0 = r7
        L_0x0039:
            boolean r1 = r6.A
            if (r0 == r1) goto L_0x006d
            if (r0 == 0) goto L_0x005a
            boolean r0 = r6.f937v
            if (r0 == 0) goto L_0x0057
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = r6.z
            if (r0 != 0) goto L_0x004e
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$g
            r0.<init>()
            r6.z = r0
        L_0x004e:
            android.view.ViewTreeObserver r0 = r32.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = r6.z
            r0.addOnPreDrawListener(r1)
        L_0x0057:
            r6.A = r2
            goto L_0x006d
        L_0x005a:
            boolean r0 = r6.f937v
            if (r0 == 0) goto L_0x006b
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = r6.z
            if (r0 == 0) goto L_0x006b
            android.view.ViewTreeObserver r0 = r32.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = r6.z
            r0.removeOnPreDrawListener(r1)
        L_0x006b:
            r6.A = r7
        L_0x006d:
            int r8 = r32.getPaddingLeft()
            int r0 = r32.getPaddingTop()
            int r9 = r32.getPaddingRight()
            int r1 = r32.getPaddingBottom()
            java.util.WeakHashMap<android.view.View, i0.b0> r3 = i0.w.f6004a
            int r10 = i0.w.e.d(r32)
            if (r10 != r2) goto L_0x0087
            r11 = r2
            goto L_0x0088
        L_0x0087:
            r11 = r7
        L_0x0088:
            int r12 = android.view.View.MeasureSpec.getMode(r33)
            int r13 = android.view.View.MeasureSpec.getSize(r33)
            int r14 = android.view.View.MeasureSpec.getMode(r34)
            int r15 = android.view.View.MeasureSpec.getSize(r34)
            int r16 = r8 + r9
            int r17 = r0 + r1
            int r0 = r32.getSuggestedMinimumWidth()
            int r1 = r32.getSuggestedMinimumHeight()
            i0.e0 r3 = r6.B
            if (r3 == 0) goto L_0x00b1
            boolean r3 = i0.w.d.b(r32)
            if (r3 == 0) goto L_0x00b1
            r18 = r2
            goto L_0x00b3
        L_0x00b1:
            r18 = r7
        L_0x00b3:
            java.util.ArrayList r5 = r6.f931o
            int r4 = r5.size()
            r3 = r0
            r2 = r1
            r0 = r7
            r1 = r0
        L_0x00bd:
            if (r1 >= r4) goto L_0x01f6
            java.lang.Object r19 = r5.get(r1)
            android.view.View r19 = (android.view.View) r19
            int r7 = r19.getVisibility()
            r21 = r0
            r0 = 8
            if (r7 != r0) goto L_0x00e1
            r28 = r4
            r29 = r5
            r22 = r8
            r23 = r9
            r27 = r10
            r0 = r21
            r24 = 0
            r21 = r1
            goto L_0x01e6
        L_0x00e1:
            android.view.ViewGroup$LayoutParams r0 = r19.getLayoutParams()
            r7 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r7 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r7
            int r0 = r7.f945e
            if (r0 < 0) goto L_0x012d
            if (r12 == 0) goto L_0x012d
            int r0 = r6.k(r0)
            r22 = r1
            int r1 = r7.f944c
            if (r1 != 0) goto L_0x00fb
            r1 = 8388661(0x800035, float:1.1755018E-38)
        L_0x00fb:
            int r1 = android.view.Gravity.getAbsoluteGravity(r1, r10)
            r1 = r1 & 7
            r23 = r2
            r2 = 3
            if (r1 != r2) goto L_0x0108
            if (r11 == 0) goto L_0x010d
        L_0x0108:
            r2 = 5
            if (r1 != r2) goto L_0x0119
            if (r11 == 0) goto L_0x0119
        L_0x010d:
            int r1 = r13 - r9
            int r1 = r1 - r0
            r0 = 0
            int r1 = java.lang.Math.max(r0, r1)
            r2 = r0
            r20 = r1
            goto L_0x0134
        L_0x0119:
            if (r1 != r2) goto L_0x011d
            if (r11 == 0) goto L_0x0122
        L_0x011d:
            r2 = 3
            if (r1 != r2) goto L_0x012b
            if (r11 == 0) goto L_0x012b
        L_0x0122:
            int r0 = r0 - r8
            r2 = 0
            int r0 = java.lang.Math.max(r2, r0)
            r20 = r0
            goto L_0x0134
        L_0x012b:
            r2 = 0
            goto L_0x0132
        L_0x012d:
            r22 = r1
            r23 = r2
            goto L_0x012b
        L_0x0132:
            r20 = r2
        L_0x0134:
            if (r18 == 0) goto L_0x0167
            boolean r0 = i0.w.d.b(r19)
            if (r0 != 0) goto L_0x0167
            i0.e0 r0 = r6.B
            int r0 = r0.b()
            i0.e0 r1 = r6.B
            int r1 = r1.c()
            int r1 = r1 + r0
            i0.e0 r0 = r6.B
            int r0 = r0.d()
            i0.e0 r2 = r6.B
            int r2 = r2.a()
            int r2 = r2 + r0
            int r0 = r13 - r1
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r12)
            int r1 = r15 - r2
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r14)
            r25 = r0
            r26 = r1
            goto L_0x016b
        L_0x0167:
            r25 = r33
            r26 = r34
        L_0x016b:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r7.f942a
            if (r0 == 0) goto L_0x0196
            r2 = r21
            r21 = r22
            r1 = r32
            r22 = r8
            r24 = 0
            r8 = r2
            r30 = r23
            r23 = r9
            r9 = r30
            r2 = r19
            r27 = r10
            r10 = r3
            r3 = r25
            r28 = r4
            r4 = r20
            r29 = r5
            r5 = r26
            boolean r0 = r0.i(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x01bb
            goto L_0x01ad
        L_0x0196:
            r28 = r4
            r29 = r5
            r27 = r10
            r24 = 0
            r10 = r3
            r30 = r22
            r22 = r8
            r8 = r21
            r21 = r30
            r31 = r23
            r23 = r9
            r9 = r31
        L_0x01ad:
            r5 = 0
            r0 = r32
            r1 = r19
            r2 = r25
            r3 = r20
            r4 = r26
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
        L_0x01bb:
            int r0 = r19.getMeasuredWidth()
            int r0 = r0 + r16
            int r1 = r7.leftMargin
            int r0 = r0 + r1
            int r1 = r7.rightMargin
            int r0 = r0 + r1
            int r0 = java.lang.Math.max(r10, r0)
            int r1 = r19.getMeasuredHeight()
            int r1 = r1 + r17
            int r2 = r7.topMargin
            int r1 = r1 + r2
            int r2 = r7.bottomMargin
            int r1 = r1 + r2
            int r1 = java.lang.Math.max(r9, r1)
            int r2 = r19.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r8, r2)
            r3 = r0
            r0 = r2
            r2 = r1
        L_0x01e6:
            int r1 = r21 + 1
            r8 = r22
            r9 = r23
            r7 = r24
            r10 = r27
            r4 = r28
            r5 = r29
            goto L_0x00bd
        L_0x01f6:
            r8 = r0
            r9 = r2
            r10 = r3
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r8
            r1 = r33
            int r0 = android.view.View.resolveSizeAndState(r10, r1, r0)
            int r1 = r8 << 16
            r2 = r34
            int r1 = android.view.View.resolveSizeAndState(r9, r2, r1)
            r6.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0)) {
                    c cVar = fVar.f942a;
                }
            }
        }
        return false;
    }

    public final boolean onNestedPreFling(View view, float f10, float f11) {
        c cVar;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.f942a) != null) {
                    z10 |= cVar.j(view);
                }
            }
        }
        return z10;
    }

    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        j(view, i10, i11, iArr, 0);
    }

    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        n(view, i10, i11, i12, i13, 0);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        b(view, view2, i10, 0);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f7340o);
        SparseArray<Parcelable> sparseArray = hVar.f958q;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            c cVar = l(childAt).f942a;
            if (!(id == -1 || cVar == null || (parcelable2 = sparseArray.get(id)) == null)) {
                cVar.n(childAt, parcelable2);
            }
        }
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable o10;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            c cVar = ((f) childAt.getLayoutParams()).f942a;
            if (!(id == -1 || cVar == null || (o10 = cVar.o(childAt)) == null)) {
                sparseArray.append(id, o10);
            }
        }
        hVar.f958q = sparseArray;
        return hVar;
    }

    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return o(view, view2, i10, 0);
    }

    public final void onStopNestedScroll(View view) {
        i(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f938x
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.t(r1, r4)
            if (r3 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0015:
            r3 = r5
        L_0x0016:
            android.view.View r6 = r0.f938x
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f942a
            if (r6 == 0) goto L_0x0029
            android.view.View r7 = r0.f938x
            boolean r6 = r6.r(r0, r7, r1)
            goto L_0x002a
        L_0x0029:
            r6 = r5
        L_0x002a:
            android.view.View r7 = r0.f938x
            r8 = 0
            if (r7 != 0) goto L_0x0035
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x0048
        L_0x0035:
            if (r3 == 0) goto L_0x0048
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x0048:
            if (r8 == 0) goto L_0x004d
            r8.recycle()
        L_0x004d:
            if (r2 == r4) goto L_0x0052
            r1 = 3
            if (r2 != r1) goto L_0x0055
        L_0x0052:
            r0.v(r5)
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(View view, int i10, int i11) {
        h0.e eVar = L;
        Rect a10 = a();
        g(view, a10);
        try {
            return a10.contains(i10, i11);
        } finally {
            a10.setEmpty();
            eVar.a(a10);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0298 A[EDGE_INSN: B:134:0x0298->B:100:0x0298 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(int r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            java.util.WeakHashMap<android.view.View, i0.b0> r2 = i0.w.f6004a
            int r2 = i0.w.e.d(r25)
            java.util.ArrayList r9 = r0.f931o
            int r10 = r9.size()
            android.graphics.Rect r11 = a()
            android.graphics.Rect r12 = a()
            android.graphics.Rect r13 = a()
            r3 = r1
            r15 = 0
        L_0x001e:
            h0.e r8 = L
            if (r15 >= r10) goto L_0x02f2
            java.lang.Object r4 = r9.get(r15)
            r7 = r4
            android.view.View r7 = (android.view.View) r7
            android.view.ViewGroup$LayoutParams r4 = r7.getLayoutParams()
            r6 = r4
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            if (r3 != 0) goto L_0x0042
            int r4 = r7.getVisibility()
            r5 = 8
            if (r4 != r5) goto L_0x0042
            r7 = r9
            r6 = r10
            r5 = r13
            r21 = r15
            r14 = 0
            goto L_0x02eb
        L_0x0042:
            r5 = 0
        L_0x0043:
            if (r5 >= r15) goto L_0x0109
            java.lang.Object r3 = r9.get(r5)
            android.view.View r3 = (android.view.View) r3
            android.view.View r4 = r6.l
            if (r4 != r3) goto L_0x00eb
            android.view.ViewGroup$LayoutParams r3 = r7.getLayoutParams()
            r4 = r3
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r4
            android.view.View r3 = r4.f951k
            if (r3 == 0) goto L_0x00eb
            android.graphics.Rect r3 = a()
            android.graphics.Rect r14 = a()
            r17 = r9
            android.graphics.Rect r9 = a()
            r18 = r5
            android.view.View r5 = r4.f951k
            r0.g(r5, r3)
            r5 = 0
            r0.e(r7, r14, r5)
            int r5 = r7.getMeasuredWidth()
            r19 = r10
            int r10 = r7.getMeasuredHeight()
            r20 = r3
            r3 = r2
            r16 = r4
            r21 = r15
            r15 = 1
            r4 = r20
            r22 = r5
            r5 = r9
            r23 = r6
            r6 = r16
            r15 = r7
            r7 = r22
            r24 = r13
            r13 = r8
            r8 = r10
            h(r3, r4, r5, r6, r7, r8)
            int r3 = r9.left
            int r4 = r14.left
            if (r3 != r4) goto L_0x00ab
            int r3 = r9.top
            int r4 = r14.top
            if (r3 == r4) goto L_0x00a5
            goto L_0x00ab
        L_0x00a5:
            r3 = r16
            r5 = r22
            r4 = 0
            goto L_0x00b0
        L_0x00ab:
            r3 = r16
            r5 = r22
            r4 = 1
        L_0x00b0:
            r0.c(r3, r9, r5, r10)
            int r5 = r9.left
            int r6 = r14.left
            int r5 = r5 - r6
            int r6 = r9.top
            int r7 = r14.top
            int r6 = r6 - r7
            if (r5 == 0) goto L_0x00c4
            java.util.WeakHashMap<android.view.View, i0.b0> r7 = i0.w.f6004a
            r15.offsetLeftAndRight(r5)
        L_0x00c4:
            if (r6 == 0) goto L_0x00cb
            java.util.WeakHashMap<android.view.View, i0.b0> r5 = i0.w.f6004a
            r15.offsetTopAndBottom(r6)
        L_0x00cb:
            if (r4 == 0) goto L_0x00d6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r4 = r3.f942a
            if (r4 == 0) goto L_0x00d6
            android.view.View r3 = r3.f951k
            r4.d(r0, r15, r3)
        L_0x00d6:
            r20.setEmpty()
            r3 = r20
            r13.a(r3)
            r14.setEmpty()
            r13.a(r14)
            r9.setEmpty()
            r13.a(r9)
            goto L_0x00f9
        L_0x00eb:
            r18 = r5
            r23 = r6
            r17 = r9
            r19 = r10
            r24 = r13
            r21 = r15
            r15 = r7
            r13 = r8
        L_0x00f9:
            int r5 = r18 + 1
            r8 = r13
            r7 = r15
            r9 = r17
            r10 = r19
            r15 = r21
            r6 = r23
            r13 = r24
            goto L_0x0043
        L_0x0109:
            r23 = r6
            r17 = r9
            r19 = r10
            r24 = r13
            r21 = r15
            r3 = 1
            r15 = r7
            r13 = r8
            r0.e(r15, r12, r3)
            r4 = r23
            int r3 = r4.f947g
            r5 = 48
            r6 = 80
            r7 = 3
            r8 = 5
            if (r3 == 0) goto L_0x0173
            boolean r3 = r12.isEmpty()
            if (r3 != 0) goto L_0x0173
            int r3 = r4.f947g
            int r3 = android.view.Gravity.getAbsoluteGravity(r3, r2)
            r9 = r3 & 112(0x70, float:1.57E-43)
            if (r9 == r5) goto L_0x0148
            if (r9 == r6) goto L_0x0138
            goto L_0x0152
        L_0x0138:
            int r9 = r11.bottom
            int r10 = r25.getHeight()
            int r14 = r12.top
            int r10 = r10 - r14
            int r9 = java.lang.Math.max(r9, r10)
            r11.bottom = r9
            goto L_0x0152
        L_0x0148:
            int r9 = r11.top
            int r10 = r12.bottom
            int r9 = java.lang.Math.max(r9, r10)
            r11.top = r9
        L_0x0152:
            r3 = r3 & 7
            if (r3 == r7) goto L_0x0169
            if (r3 == r8) goto L_0x0159
            goto L_0x0173
        L_0x0159:
            int r3 = r11.right
            int r9 = r25.getWidth()
            int r10 = r12.left
            int r9 = r9 - r10
            int r3 = java.lang.Math.max(r3, r9)
            r11.right = r3
            goto L_0x0173
        L_0x0169:
            int r3 = r11.left
            int r9 = r12.right
            int r3 = java.lang.Math.max(r3, r9)
            r11.left = r3
        L_0x0173:
            int r3 = r4.f948h
            if (r3 == 0) goto L_0x027e
            int r3 = r15.getVisibility()
            if (r3 != 0) goto L_0x027e
            java.util.WeakHashMap<android.view.View, i0.b0> r3 = i0.w.f6004a
            boolean r3 = i0.w.g.c(r15)
            if (r3 != 0) goto L_0x0187
            goto L_0x027e
        L_0x0187:
            int r3 = r15.getWidth()
            if (r3 <= 0) goto L_0x027e
            int r3 = r15.getHeight()
            if (r3 > 0) goto L_0x0195
            goto L_0x027e
        L_0x0195:
            android.view.ViewGroup$LayoutParams r3 = r15.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r3
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r4 = r3.f942a
            android.graphics.Rect r9 = a()
            android.graphics.Rect r10 = a()
            int r14 = r15.getLeft()
            int r8 = r15.getTop()
            int r7 = r15.getRight()
            int r6 = r15.getBottom()
            r10.set(r14, r8, r7, r6)
            if (r4 == 0) goto L_0x01eb
            boolean r4 = r4.a(r15, r9)
            if (r4 == 0) goto L_0x01eb
            boolean r4 = r10.contains(r9)
            if (r4 == 0) goto L_0x01c7
            goto L_0x01ee
        L_0x01c7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Rect should be within the child's bounds. Rect:"
            r2.<init>(r3)
            java.lang.String r3 = r9.toShortString()
            r2.append(r3)
            java.lang.String r3 = " | Bounds:"
            r2.append(r3)
            java.lang.String r3 = r10.toShortString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01eb:
            r9.set(r10)
        L_0x01ee:
            r10.setEmpty()
            r13.a(r10)
            boolean r4 = r9.isEmpty()
            if (r4 == 0) goto L_0x0202
        L_0x01fa:
            r9.setEmpty()
            r13.a(r9)
            goto L_0x027e
        L_0x0202:
            int r4 = r3.f948h
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r2)
            r6 = r4 & 48
            if (r6 != r5) goto L_0x021e
            int r5 = r9.top
            int r6 = r3.topMargin
            int r5 = r5 - r6
            int r6 = r3.f950j
            int r5 = r5 - r6
            int r6 = r11.top
            if (r5 >= r6) goto L_0x021e
            int r6 = r6 - r5
            x(r15, r6)
            r5 = 1
            goto L_0x021f
        L_0x021e:
            r5 = 0
        L_0x021f:
            r6 = r4 & 80
            r7 = 80
            if (r6 != r7) goto L_0x023b
            int r6 = r25.getHeight()
            int r7 = r9.bottom
            int r6 = r6 - r7
            int r7 = r3.bottomMargin
            int r6 = r6 - r7
            int r7 = r3.f950j
            int r6 = r6 + r7
            int r7 = r11.bottom
            if (r6 >= r7) goto L_0x023b
            int r6 = r6 - r7
            x(r15, r6)
            r5 = 1
        L_0x023b:
            if (r5 != 0) goto L_0x0241
            r5 = 0
            x(r15, r5)
        L_0x0241:
            r5 = r4 & 3
            r6 = 3
            if (r5 != r6) goto L_0x0258
            int r5 = r9.left
            int r6 = r3.leftMargin
            int r5 = r5 - r6
            int r6 = r3.f949i
            int r5 = r5 - r6
            int r6 = r11.left
            if (r5 >= r6) goto L_0x0258
            int r6 = r6 - r5
            w(r15, r6)
            r5 = 1
            goto L_0x0259
        L_0x0258:
            r5 = 0
        L_0x0259:
            r4 = r4 & 5
            r6 = 5
            if (r4 != r6) goto L_0x0275
            int r4 = r25.getWidth()
            int r6 = r9.right
            int r4 = r4 - r6
            int r6 = r3.rightMargin
            int r4 = r4 - r6
            int r3 = r3.f949i
            int r4 = r4 + r3
            int r3 = r11.right
            if (r4 >= r3) goto L_0x0275
            int r4 = r4 - r3
            w(r15, r4)
            r4 = 1
            goto L_0x0276
        L_0x0275:
            r4 = r5
        L_0x0276:
            if (r4 != 0) goto L_0x01fa
            r3 = 0
            w(r15, r3)
            goto L_0x01fa
        L_0x027e:
            r3 = 2
            if (r1 == r3) goto L_0x02a6
            android.view.ViewGroup$LayoutParams r4 = r15.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r4
            android.graphics.Rect r4 = r4.f956q
            r5 = r24
            r5.set(r4)
            boolean r4 = r5.equals(r12)
            if (r4 == 0) goto L_0x029a
            r7 = r17
            r6 = r19
        L_0x0298:
            r14 = 0
            goto L_0x02ea
        L_0x029a:
            android.view.ViewGroup$LayoutParams r4 = r15.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r4
            android.graphics.Rect r4 = r4.f956q
            r4.set(r12)
            goto L_0x02a8
        L_0x02a6:
            r5 = r24
        L_0x02a8:
            int r4 = r21 + 1
            r6 = r19
        L_0x02ac:
            r7 = r17
            if (r4 >= r6) goto L_0x0298
            java.lang.Object r8 = r7.get(r4)
            android.view.View r8 = (android.view.View) r8
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r9 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r9
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r10 = r9.f942a
            if (r10 == 0) goto L_0x02e3
            boolean r13 = r10.b(r8, r15)
            if (r13 == 0) goto L_0x02e3
            if (r1 != 0) goto L_0x02d1
            boolean r13 = r9.f955p
            if (r13 == 0) goto L_0x02d1
            r14 = 0
            r9.f955p = r14
            r10 = 1
            goto L_0x02e5
        L_0x02d1:
            r14 = 0
            if (r1 == r3) goto L_0x02d9
            boolean r8 = r10.d(r0, r8, r15)
            goto L_0x02dd
        L_0x02d9:
            r10.e(r0, r15)
            r8 = 1
        L_0x02dd:
            r10 = 1
            if (r1 != r10) goto L_0x02e5
            r9.f955p = r8
            goto L_0x02e5
        L_0x02e3:
            r10 = 1
            r14 = 0
        L_0x02e5:
            int r4 = r4 + 1
            r17 = r7
            goto L_0x02ac
        L_0x02ea:
            r3 = r1
        L_0x02eb:
            int r15 = r21 + 1
            r13 = r5
            r10 = r6
            r9 = r7
            goto L_0x001e
        L_0x02f2:
            r5 = r13
            r13 = r8
            r11.setEmpty()
            r13.a(r11)
            r12.setEmpty()
            r13.a(r12)
            r5.setEmpty()
            r13.a(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.q(int):void");
    }

    public final void r(View view, int i10) {
        boolean z10;
        f fVar = (f) view.getLayoutParams();
        View view2 = fVar.f951k;
        int i11 = 0;
        if (view2 != null || fVar.f946f == -1) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            h0.e eVar = L;
            if (view2 != null) {
                Rect a10 = a();
                Rect a11 = a();
                try {
                    g(view2, a10);
                    f fVar2 = (f) view.getLayoutParams();
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    h(i10, a10, a11, fVar2, measuredWidth, measuredHeight);
                    c(fVar2, a11, measuredWidth, measuredHeight);
                    view.layout(a11.left, a11.top, a11.right, a11.bottom);
                } finally {
                    a10.setEmpty();
                    eVar.a(a10);
                    a11.setEmpty();
                    eVar.a(a11);
                }
            } else {
                int i12 = fVar.f945e;
                if (i12 >= 0) {
                    f fVar3 = (f) view.getLayoutParams();
                    int i13 = fVar3.f944c;
                    if (i13 == 0) {
                        i13 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i13, i10);
                    int i14 = absoluteGravity & 7;
                    int i15 = absoluteGravity & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                    int width = getWidth();
                    int height = getHeight();
                    int measuredWidth2 = view.getMeasuredWidth();
                    int measuredHeight2 = view.getMeasuredHeight();
                    if (i10 == 1) {
                        i12 = width - i12;
                    }
                    int k10 = k(i12) - measuredWidth2;
                    if (i14 == 1) {
                        k10 += measuredWidth2 / 2;
                    } else if (i14 == 5) {
                        k10 += measuredWidth2;
                    }
                    if (i15 == 16) {
                        i11 = 0 + (measuredHeight2 / 2);
                    } else if (i15 == 80) {
                        i11 = measuredHeight2 + 0;
                    }
                    int max = Math.max(getPaddingLeft() + fVar3.leftMargin, Math.min(k10, ((width - getPaddingRight()) - measuredWidth2) - fVar3.rightMargin));
                    int max2 = Math.max(getPaddingTop() + fVar3.topMargin, Math.min(i11, ((height - getPaddingBottom()) - measuredHeight2) - fVar3.bottomMargin));
                    view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                    return;
                }
                f fVar4 = (f) view.getLayoutParams();
                Rect a12 = a();
                a12.set(getPaddingLeft() + fVar4.leftMargin, getPaddingTop() + fVar4.topMargin, (getWidth() - getPaddingRight()) - fVar4.rightMargin, (getHeight() - getPaddingBottom()) - fVar4.bottomMargin);
                if (this.B != null) {
                    WeakHashMap<View, b0> weakHashMap = w.f6004a;
                    if (w.d.b(this) && !w.d.b(view)) {
                        a12.left = this.B.b() + a12.left;
                        a12.top = this.B.d() + a12.top;
                        a12.right -= this.B.c();
                        a12.bottom -= this.B.a();
                    }
                }
                Rect a13 = a();
                int i16 = fVar4.f944c;
                if ((i16 & 7) == 0) {
                    i16 |= 8388611;
                }
                if ((i16 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                    i16 |= 48;
                }
                Gravity.apply(i16, view.getMeasuredWidth(), view.getMeasuredHeight(), a12, a13, i10);
                view.layout(a13.left, a13.top, a13.right, a13.bottom);
                a12.setEmpty();
                eVar.a(a12);
                a13.setEmpty();
                eVar.a(a13);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        c cVar = ((f) view.getLayoutParams()).f942a;
        if (cVar == null || !cVar.m(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10 && !this.u) {
            v(false);
            this.u = true;
        }
    }

    public final void s(View view, int i10, int i11, int i12) {
        measureChildWithMargins(view, i10, i11, i12, 0);
    }

    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        y();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.E = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z10;
        Drawable drawable2 = this.D;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.D = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.D.setState(getDrawableState());
                }
                Drawable drawable4 = this.D;
                WeakHashMap<View, b0> weakHashMap = w.f6004a;
                drawable4.setLayoutDirection(w.e.d(this));
                Drawable drawable5 = this.D;
                if (getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawable5.setVisible(z10, false);
                this.D.setCallback(this);
            }
            WeakHashMap<View, b0> weakHashMap2 = w.f6004a;
            w.d.k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            Context context = getContext();
            Object obj = y.a.f9523a;
            drawable = a.c.b(context, i10);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.D;
        if (drawable != null && drawable.isVisible() != z10) {
            this.D.setVisible(z10, false);
        }
    }

    public final boolean t(MotionEvent motionEvent, int i10) {
        boolean z10;
        int i11;
        MotionEvent motionEvent2 = motionEvent;
        int i12 = i10;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f933q;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i13 = childCount - 1; i13 >= 0; i13--) {
            if (isChildrenDrawingOrderEnabled) {
                i11 = getChildDrawingOrder(childCount, i13);
            } else {
                i11 = i13;
            }
            arrayList.add(getChildAt(i11));
        }
        i iVar = K;
        if (iVar != null) {
            Collections.sort(arrayList, iVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent3 = null;
        boolean z11 = false;
        boolean z12 = false;
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) arrayList.get(i14);
            f fVar = (f) view.getLayoutParams();
            c cVar = fVar.f942a;
            if ((!z11 && !z12) || actionMasked == 0) {
                if (!z11 && cVar != null) {
                    if (i12 == 0) {
                        z11 = cVar.g(this, view, motionEvent2);
                    } else if (i12 == 1) {
                        z11 = cVar.r(this, view, motionEvent2);
                    }
                    if (z11) {
                        this.f938x = view;
                    }
                }
                if (fVar.f942a == null) {
                    fVar.f952m = false;
                }
                boolean z13 = fVar.f952m;
                if (z13) {
                    z10 = true;
                } else {
                    z10 = z13 | false;
                    fVar.f952m = z10;
                }
                if (!z10 || z13) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z10 && !z12) {
                    break;
                }
            } else if (cVar != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i12 == 0) {
                    cVar.g(this, view, motionEvent3);
                } else if (i12 == 1) {
                    cVar.r(this, view, motionEvent3);
                }
            }
        }
        arrayList.clear();
        return z11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0075, code lost:
        if (r12 != false) goto L_0x00c2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x015a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u() {
        /*
            r16 = this;
            r0 = r16
            java.util.ArrayList r1 = r0.f931o
            r1.clear()
            o.c r2 = r0.f932p
            java.lang.Object r3 = r2.f7536b
            n.i r3 = (n.i) r3
            int r4 = r3.f7333q
            r6 = 0
        L_0x0010:
            java.lang.Object r7 = r2.f7535a
            if (r6 >= r4) goto L_0x0027
            java.lang.Object r8 = r3.l(r6)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            if (r8 == 0) goto L_0x0024
            r8.clear()
            h0.c r7 = (h0.c) r7
            r7.a(r8)
        L_0x0024:
            int r6 = r6 + 1
            goto L_0x0010
        L_0x0027:
            r3.clear()
            int r3 = r16.getChildCount()
            r4 = 0
        L_0x002f:
            java.lang.Object r6 = r2.f7536b
            if (r4 >= r3) goto L_0x0186
            android.view.View r8 = r0.getChildAt(r4)
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r9 = l(r8)
            r10 = 0
            r11 = 1
            r12 = -1
            int r13 = r9.f946f
            if (r13 != r12) goto L_0x0048
            r9.l = r10
            r9.f951k = r10
            goto L_0x00c2
        L_0x0048:
            android.view.View r12 = r9.f951k
            if (r12 == 0) goto L_0x0077
            int r12 = r12.getId()
            if (r12 == r13) goto L_0x0053
            goto L_0x0070
        L_0x0053:
            android.view.View r12 = r9.f951k
            android.view.ViewParent r14 = r12.getParent()
        L_0x0059:
            if (r14 == r0) goto L_0x0072
            if (r14 == 0) goto L_0x006c
            if (r14 != r8) goto L_0x0060
            goto L_0x006c
        L_0x0060:
            boolean r15 = r14 instanceof android.view.View
            if (r15 == 0) goto L_0x0067
            r12 = r14
            android.view.View r12 = (android.view.View) r12
        L_0x0067:
            android.view.ViewParent r14 = r14.getParent()
            goto L_0x0059
        L_0x006c:
            r9.l = r10
            r9.f951k = r10
        L_0x0070:
            r12 = 0
            goto L_0x0075
        L_0x0072:
            r9.l = r12
            r12 = r11
        L_0x0075:
            if (r12 != 0) goto L_0x00c2
        L_0x0077:
            android.view.View r12 = r0.findViewById(r13)
            r9.f951k = r12
            if (r12 == 0) goto L_0x00b8
            if (r12 != r0) goto L_0x0090
            boolean r12 = r16.isInEditMode()
            if (r12 == 0) goto L_0x0088
            goto L_0x00be
        L_0x0088:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "View can not be anchored to the the parent CoordinatorLayout"
            r1.<init>(r2)
            throw r1
        L_0x0090:
            android.view.ViewParent r13 = r12.getParent()
        L_0x0094:
            if (r13 == r0) goto L_0x00b5
            if (r13 == 0) goto L_0x00b5
            if (r13 != r8) goto L_0x00a9
            boolean r12 = r16.isInEditMode()
            if (r12 == 0) goto L_0x00a1
            goto L_0x00be
        L_0x00a1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Anchor must not be a descendant of the anchored view"
            r1.<init>(r2)
            throw r1
        L_0x00a9:
            boolean r14 = r13 instanceof android.view.View
            if (r14 == 0) goto L_0x00b0
            r12 = r13
            android.view.View r12 = (android.view.View) r12
        L_0x00b0:
            android.view.ViewParent r13 = r13.getParent()
            goto L_0x0094
        L_0x00b5:
            r9.l = r12
            goto L_0x00c2
        L_0x00b8:
            boolean r12 = r16.isInEditMode()
            if (r12 == 0) goto L_0x0162
        L_0x00be:
            r9.l = r10
            r9.f951k = r10
        L_0x00c2:
            r12 = r6
            n.i r12 = (n.i) r12
            boolean r13 = r12.containsKey(r8)
            if (r13 != 0) goto L_0x00ce
            r12.put(r8, r10)
        L_0x00ce:
            r12 = 0
        L_0x00cf:
            if (r12 >= r3) goto L_0x015e
            if (r12 != r4) goto L_0x00d5
            goto L_0x015a
        L_0x00d5:
            android.view.View r13 = r0.getChildAt(r12)
            android.view.View r14 = r9.l
            if (r13 == r14) goto L_0x010c
            java.util.WeakHashMap<android.view.View, i0.b0> r14 = i0.w.f6004a
            int r14 = i0.w.e.d(r16)
            android.view.ViewGroup$LayoutParams r15 = r13.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r15 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r15
            int r15 = r15.f947g
            int r15 = android.view.Gravity.getAbsoluteGravity(r15, r14)
            if (r15 == 0) goto L_0x00fc
            int r5 = r9.f948h
            int r5 = android.view.Gravity.getAbsoluteGravity(r5, r14)
            r5 = r5 & r15
            if (r5 != r15) goto L_0x00fc
            r5 = r11
            goto L_0x00fd
        L_0x00fc:
            r5 = 0
        L_0x00fd:
            if (r5 != 0) goto L_0x010c
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r5 = r9.f942a
            if (r5 == 0) goto L_0x010a
            boolean r5 = r5.b(r8, r13)
            if (r5 == 0) goto L_0x010a
            goto L_0x010c
        L_0x010a:
            r5 = 0
            goto L_0x010d
        L_0x010c:
            r5 = r11
        L_0x010d:
            if (r5 == 0) goto L_0x015a
            r5 = r6
            n.i r5 = (n.i) r5
            boolean r5 = r5.containsKey(r13)
            if (r5 != 0) goto L_0x0124
            r5 = r6
            n.i r5 = (n.i) r5
            boolean r14 = r5.containsKey(r13)
            if (r14 != 0) goto L_0x0124
            r5.put(r13, r10)
        L_0x0124:
            r5 = r6
            n.i r5 = (n.i) r5
            boolean r14 = r5.containsKey(r13)
            if (r14 == 0) goto L_0x0152
            boolean r14 = r5.containsKey(r8)
            if (r14 == 0) goto L_0x0152
            java.lang.Object r14 = r5.getOrDefault(r13, r10)
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            if (r14 != 0) goto L_0x014e
            r14 = r7
            h0.c r14 = (h0.c) r14
            java.lang.Object r14 = r14.b()
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            if (r14 != 0) goto L_0x014b
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x014b:
            r5.put(r13, r14)
        L_0x014e:
            r14.add(r8)
            goto L_0x015a
        L_0x0152:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "All nodes must be present in the graph before being added as an edge"
            r1.<init>(r2)
            throw r1
        L_0x015a:
            int r12 = r12 + 1
            goto L_0x00cf
        L_0x015e:
            int r4 = r4 + 1
            goto L_0x002f
        L_0x0162:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Could not find CoordinatorLayout descendant view with id "
            r2.<init>(r3)
            android.content.res.Resources r3 = r16.getResources()
            java.lang.String r3 = r3.getResourceName(r13)
            r2.append(r3)
            java.lang.String r3 = " to anchor view "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0186:
            java.lang.Object r3 = r2.f7537c
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.clear()
            java.lang.Object r4 = r2.d
            java.util.HashSet r4 = (java.util.HashSet) r4
            r4.clear()
            n.i r6 = (n.i) r6
            int r4 = r6.f7333q
            r5 = 0
        L_0x0199:
            if (r5 >= r4) goto L_0x01a9
            java.lang.Object r7 = r6.h(r5)
            java.lang.Object r8 = r2.d
            java.util.HashSet r8 = (java.util.HashSet) r8
            r2.a(r7, r3, r8)
            int r5 = r5 + 1
            goto L_0x0199
        L_0x01a9:
            r1.addAll(r3)
            java.util.Collections.reverse(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.u():void");
    }

    public final void v(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c cVar = ((f) childAt.getLayoutParams()).f942a;
            if (cVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    cVar.g(this, childAt, obtain);
                } else {
                    cVar.r(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((f) getChildAt(i11).getLayoutParams()).f952m = false;
        }
        this.f938x = null;
        this.u = false;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.D;
    }

    public final void y() {
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        if (w.d.b(this)) {
            if (this.F == null) {
                this.F = new a();
            }
            w.i.u(this, this.F);
            setSystemUiVisibility(1280);
            return;
        }
        w.i.u(this, (o) null);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }
}

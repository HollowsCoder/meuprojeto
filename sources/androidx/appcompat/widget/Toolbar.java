package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import com.karumi.dexter.R;
import e.a;
import i0.b0;
import i0.h;
import i0.i;
import i0.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

public class Toolbar extends ViewGroup {
    public int A;
    public final int B;
    public final int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public v0 H;
    public int I;
    public int J;
    public final int K;
    public CharSequence L;
    public CharSequence M;
    public ColorStateList N;
    public ColorStateList O;
    public boolean P;
    public boolean Q;
    public final ArrayList<View> R;
    public final ArrayList<View> S;
    public final int[] T;
    public final h U;
    public ArrayList<MenuItem> V;
    public final a W;

    /* renamed from: a0  reason: collision with root package name */
    public h1 f472a0;

    /* renamed from: b0  reason: collision with root package name */
    public c f473b0;

    /* renamed from: c0  reason: collision with root package name */
    public d f474c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f475d0;

    /* renamed from: e0  reason: collision with root package name */
    public final b f476e0;

    /* renamed from: o  reason: collision with root package name */
    public ActionMenuView f477o;

    /* renamed from: p  reason: collision with root package name */
    public AppCompatTextView f478p;

    /* renamed from: q  reason: collision with root package name */
    public AppCompatTextView f479q;

    /* renamed from: r  reason: collision with root package name */
    public o f480r;

    /* renamed from: s  reason: collision with root package name */
    public AppCompatImageView f481s;

    /* renamed from: t  reason: collision with root package name */
    public final Drawable f482t;
    public final CharSequence u;

    /* renamed from: v  reason: collision with root package name */
    public o f483v;
    public View w;

    /* renamed from: x  reason: collision with root package name */
    public Context f484x;

    /* renamed from: y  reason: collision with root package name */
    public int f485y;
    public int z;

    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            c cVar;
            ActionMenuView actionMenuView = Toolbar.this.f477o;
            if (actionMenuView != null && (cVar = actionMenuView.H) != null) {
                cVar.l();
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        public final void onClick(View view) {
            androidx.appcompat.view.menu.h hVar;
            d dVar = Toolbar.this.f474c0;
            if (dVar == null) {
                hVar = null;
            } else {
                hVar = dVar.f490p;
            }
            if (hVar != null) {
                hVar.collapseActionView();
            }
        }
    }

    public class d implements j {

        /* renamed from: o  reason: collision with root package name */
        public androidx.appcompat.view.menu.f f489o;

        /* renamed from: p  reason: collision with root package name */
        public androidx.appcompat.view.menu.h f490p;

        public d() {
        }

        public final void b(androidx.appcompat.view.menu.f fVar, boolean z) {
        }

        public final boolean d(androidx.appcompat.view.menu.h hVar) {
            Toolbar toolbar = Toolbar.this;
            View view = toolbar.w;
            if (view instanceof h.b) {
                ((h.b) view).onActionViewCollapsed();
            }
            toolbar.removeView(toolbar.w);
            toolbar.removeView(toolbar.f483v);
            toolbar.w = null;
            ArrayList<View> arrayList = toolbar.S;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    toolbar.addView(arrayList.get(size));
                } else {
                    arrayList.clear();
                    this.f490p = null;
                    toolbar.requestLayout();
                    hVar.C = false;
                    hVar.f348n.p(false);
                    return true;
                }
            }
        }

        public final void e(Context context, androidx.appcompat.view.menu.f fVar) {
            androidx.appcompat.view.menu.h hVar;
            androidx.appcompat.view.menu.f fVar2 = this.f489o;
            if (!(fVar2 == null || (hVar = this.f490p) == null)) {
                fVar2.d(hVar);
            }
            this.f489o = fVar;
        }

        public final void f() {
            if (this.f490p != null) {
                androidx.appcompat.view.menu.f fVar = this.f489o;
                boolean z = false;
                if (fVar != null) {
                    int size = fVar.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        } else if (this.f489o.getItem(i10) == this.f490p) {
                            z = true;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (!z) {
                    d(this.f490p);
                }
            }
        }

        public final boolean h(m mVar) {
            return false;
        }

        public final boolean i() {
            return false;
        }

        public final boolean k(androidx.appcompat.view.menu.h hVar) {
            Toolbar toolbar = Toolbar.this;
            toolbar.c();
            ViewParent parent = toolbar.f483v.getParent();
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f483v);
                }
                toolbar.addView(toolbar.f483v);
            }
            View actionView = hVar.getActionView();
            toolbar.w = actionView;
            this.f490p = hVar;
            ViewParent parent2 = actionView.getParent();
            if (parent2 != toolbar) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar.w);
                }
                e eVar = new e();
                eVar.f4326a = (toolbar.B & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8388611;
                eVar.f492b = 2;
                toolbar.w.setLayoutParams(eVar);
                toolbar.addView(toolbar.w);
            }
            int childCount = toolbar.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar.getChildAt(childCount);
                if (!(((e) childAt.getLayoutParams()).f492b == 2 || childAt == toolbar.f477o)) {
                    toolbar.removeViewAt(childCount);
                    toolbar.S.add(childAt);
                }
            }
            toolbar.requestLayout();
            hVar.C = true;
            hVar.f348n.p(false);
            View view = toolbar.w;
            if (view instanceof h.b) {
                ((h.b) view).onActionViewExpanded();
            }
            return true;
        }
    }

    public static class e extends a.C0052a {

        /* renamed from: b  reason: collision with root package name */
        public int f492b = 0;

        public e() {
            this.f4326a = 8388627;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(e eVar) {
            super((a.C0052a) eVar);
            this.f492b = eVar.f492b;
        }

        public e(a.C0052a aVar) {
            super(aVar);
        }
    }

    public interface f {
    }

    public static class g extends n0.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: q  reason: collision with root package name */
        public int f493q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f494r;

        public class a implements Parcelable.ClassLoaderCreator<g> {
            public final Object createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i10) {
                return new g[i10];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f493q = parcel.readInt();
            this.f494r = parcel.readInt() != 0;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f7340o, i10);
            parcel.writeInt(this.f493q);
            parcel.writeInt(this.f494r ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.K = 8388627;
        this.R = new ArrayList<>();
        this.S = new ArrayList<>();
        this.T = new int[2];
        this.U = new h();
        this.V = new ArrayList<>();
        this.W = new a();
        this.f476e0 = new b();
        Context context2 = getContext();
        int[] iArr = androidx.databinding.a.W;
        e1 m10 = e1.m(context2, attributeSet, iArr, R.attr.toolbarStyle);
        w.j(this, context, iArr, attributeSet, m10.f551b, R.attr.toolbarStyle);
        this.z = m10.i(28, 0);
        this.A = m10.i(19, 0);
        TypedArray typedArray = m10.f551b;
        this.K = typedArray.getInteger(0, 8388627);
        this.B = typedArray.getInteger(2, 48);
        int c10 = m10.c(22, 0);
        c10 = m10.l(27) ? m10.c(27, c10) : c10;
        this.G = c10;
        this.F = c10;
        this.E = c10;
        this.D = c10;
        int c11 = m10.c(25, -1);
        if (c11 >= 0) {
            this.D = c11;
        }
        int c12 = m10.c(24, -1);
        if (c12 >= 0) {
            this.E = c12;
        }
        int c13 = m10.c(26, -1);
        if (c13 >= 0) {
            this.F = c13;
        }
        int c14 = m10.c(23, -1);
        if (c14 >= 0) {
            this.G = c14;
        }
        this.C = m10.d(13, -1);
        int c15 = m10.c(9, Integer.MIN_VALUE);
        int c16 = m10.c(5, Integer.MIN_VALUE);
        int d10 = m10.d(7, 0);
        int d11 = m10.d(8, 0);
        if (this.H == null) {
            this.H = new v0();
        }
        v0 v0Var = this.H;
        v0Var.f721h = false;
        if (d10 != Integer.MIN_VALUE) {
            v0Var.f718e = d10;
            v0Var.f715a = d10;
        }
        if (d11 != Integer.MIN_VALUE) {
            v0Var.f719f = d11;
            v0Var.f716b = d11;
        }
        if (!(c15 == Integer.MIN_VALUE && c16 == Integer.MIN_VALUE)) {
            v0Var.a(c15, c16);
        }
        this.I = m10.c(10, Integer.MIN_VALUE);
        this.J = m10.c(6, Integer.MIN_VALUE);
        this.f482t = m10.e(4);
        this.u = m10.k(3);
        CharSequence k10 = m10.k(21);
        if (!TextUtils.isEmpty(k10)) {
            setTitle(k10);
        }
        CharSequence k11 = m10.k(18);
        if (!TextUtils.isEmpty(k11)) {
            setSubtitle(k11);
        }
        this.f484x = getContext();
        setPopupTheme(m10.i(17, 0));
        Drawable e10 = m10.e(16);
        if (e10 != null) {
            setNavigationIcon(e10);
        }
        CharSequence k12 = m10.k(15);
        if (!TextUtils.isEmpty(k12)) {
            setNavigationContentDescription(k12);
        }
        Drawable e11 = m10.e(11);
        if (e11 != null) {
            setLogo(e11);
        }
        CharSequence k13 = m10.k(12);
        if (!TextUtils.isEmpty(k13)) {
            setLogoDescription(k13);
        }
        if (m10.l(29)) {
            setTitleTextColor(m10.b(29));
        }
        if (m10.l(20)) {
            setSubtitleTextColor(m10.b(20));
        }
        if (m10.l(14)) {
            k(m10.i(14, 0));
        }
        m10.n();
    }

    public static e g(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof a.C0052a ? new e((a.C0052a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new h.f(getContext());
    }

    public static int i(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i10, ArrayList arrayList) {
        boolean z10;
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        if (w.e.d(this) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, w.e.d(this));
        arrayList.clear();
        if (z10) {
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = getChildAt(i11);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f492b == 0 && r(childAt)) {
                    int i12 = eVar.f4326a;
                    WeakHashMap<View, b0> weakHashMap2 = w.f6004a;
                    int d10 = w.e.d(this);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i12, d10) & 7;
                    if (!(absoluteGravity2 == 1 || absoluteGravity2 == 3 || absoluteGravity2 == 5)) {
                        absoluteGravity2 = d10 == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = getChildAt(i13);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f492b == 0 && r(childAt2)) {
                int i14 = eVar2.f4326a;
                WeakHashMap<View, b0> weakHashMap3 = w.f6004a;
                int d11 = w.e.d(this);
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i14, d11) & 7;
                if (!(absoluteGravity3 == 1 || absoluteGravity3 == 3 || absoluteGravity3 == 5)) {
                    absoluteGravity3 = d11 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z10) {
        e eVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            eVar = new e();
        } else if (!checkLayoutParams(layoutParams)) {
            eVar = g(layoutParams);
        } else {
            eVar = (e) layoutParams;
        }
        eVar.f492b = 1;
        if (!z10 || this.w == null) {
            addView(view, eVar);
            return;
        }
        view.setLayoutParams(eVar);
        this.S.add(view);
    }

    public final void c() {
        if (this.f483v == null) {
            o oVar = new o(getContext(), (AttributeSet) null, R.attr.toolbarNavigationButtonStyle);
            this.f483v = oVar;
            oVar.setImageDrawable(this.f482t);
            this.f483v.setContentDescription(this.u);
            e eVar = new e();
            eVar.f4326a = (this.B & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8388611;
            eVar.f492b = 2;
            this.f483v.setLayoutParams(eVar);
            this.f483v.setOnClickListener(new c());
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public final void d() {
        e();
        ActionMenuView actionMenuView = this.f477o;
        if (actionMenuView.D == null) {
            androidx.appcompat.view.menu.f fVar = (androidx.appcompat.view.menu.f) actionMenuView.getMenu();
            if (this.f474c0 == null) {
                this.f474c0 = new d();
            }
            this.f477o.setExpandedActionViewsExclusive(true);
            fVar.b(this.f474c0, this.f484x);
        }
    }

    public final void e() {
        if (this.f477o == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), (AttributeSet) null);
            this.f477o = actionMenuView;
            actionMenuView.setPopupTheme(this.f485y);
            this.f477o.setOnMenuItemClickListener(this.W);
            ActionMenuView actionMenuView2 = this.f477o;
            actionMenuView2.I = null;
            actionMenuView2.J = null;
            e eVar = new e();
            eVar.f4326a = (this.B & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8388613;
            this.f477o.setLayoutParams(eVar);
            b(this.f477o, false);
        }
    }

    public final void f() {
        if (this.f480r == null) {
            this.f480r = new o(getContext(), (AttributeSet) null, R.attr.toolbarNavigationButtonStyle);
            e eVar = new e();
            eVar.f4326a = (this.B & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8388611;
            this.f480r.setLayoutParams(eVar);
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return g(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        o oVar = this.f483v;
        if (oVar != null) {
            return oVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        o oVar = this.f483v;
        if (oVar != null) {
            return oVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        v0 v0Var = this.H;
        if (v0Var == null) {
            return 0;
        }
        if (v0Var.f720g) {
            return v0Var.f715a;
        }
        return v0Var.f716b;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.J;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        v0 v0Var = this.H;
        if (v0Var != null) {
            return v0Var.f715a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        v0 v0Var = this.H;
        if (v0Var != null) {
            return v0Var.f716b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        v0 v0Var = this.H;
        if (v0Var == null) {
            return 0;
        }
        if (v0Var.f720g) {
            return v0Var.f716b;
        }
        return v0Var.f715a;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.I;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        boolean z10;
        androidx.appcompat.view.menu.f fVar;
        ActionMenuView actionMenuView = this.f477o;
        if (actionMenuView == null || (fVar = actionMenuView.D) == null || !fVar.hasVisibleItems()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return Math.max(getContentInsetEnd(), Math.max(this.J, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        if (w.e.d(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        if (w.e.d(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.I, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f481s;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f481s;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        d();
        return this.f477o.getMenu();
    }

    public View getNavButtonView() {
        return this.f480r;
    }

    public CharSequence getNavigationContentDescription() {
        o oVar = this.f480r;
        if (oVar != null) {
            return oVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        o oVar = this.f480r;
        if (oVar != null) {
            return oVar.getDrawable();
        }
        return null;
    }

    public c getOuterActionMenuPresenter() {
        return this.f473b0;
    }

    public Drawable getOverflowIcon() {
        d();
        return this.f477o.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f484x;
    }

    public int getPopupTheme() {
        return this.f485y;
    }

    public CharSequence getSubtitle() {
        return this.M;
    }

    public final TextView getSubtitleTextView() {
        return this.f479q;
    }

    public CharSequence getTitle() {
        return this.L;
    }

    public int getTitleMarginBottom() {
        return this.G;
    }

    public int getTitleMarginEnd() {
        return this.E;
    }

    public int getTitleMarginStart() {
        return this.D;
    }

    public int getTitleMarginTop() {
        return this.F;
    }

    public final TextView getTitleTextView() {
        return this.f478p;
    }

    public j0 getWrapper() {
        if (this.f472a0 == null) {
            this.f472a0 = new h1(this);
        }
        return this.f472a0;
    }

    public final int h(View view, int i10) {
        int i11;
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i10 > 0) {
            i11 = (measuredHeight - i10) / 2;
        } else {
            i11 = 0;
        }
        int i12 = eVar.f4326a & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        if (!(i12 == 16 || i12 == 48 || i12 == 80)) {
            i12 = this.K & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        }
        if (i12 == 48) {
            return getPaddingTop() - i11;
        }
        if (i12 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i13 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i14 = eVar.topMargin;
        if (i13 < i14) {
            i13 = i14;
        } else {
            int i15 = (((height - paddingBottom) - measuredHeight) - i13) - paddingTop;
            int i16 = eVar.bottomMargin;
            if (i15 < i16) {
                i13 = Math.max(0, i13 - (i16 - i15));
            }
        }
        return paddingTop + i13;
    }

    public final void k(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public final void l() {
        Iterator<MenuItem> it = this.V.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenu();
        getMenuInflater();
        Iterator<i> it2 = this.U.f5994a.iterator();
        while (it2.hasNext()) {
            it2.next().a();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.V = currentMenuItems2;
    }

    public final boolean m(View view) {
        return view.getParent() == this || this.S.contains(view);
    }

    public final int n(View view, int i10, int i11, int[] iArr) {
        e eVar = (e) view.getLayoutParams();
        int i12 = eVar.leftMargin - iArr[0];
        int max = Math.max(0, i12) + i10;
        iArr[0] = Math.max(0, -i12);
        int h10 = h(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, h10, max + measuredWidth, view.getMeasuredHeight() + h10);
        return measuredWidth + eVar.rightMargin + max;
    }

    public final int o(View view, int i10, int i11, int[] iArr) {
        e eVar = (e) view.getLayoutParams();
        int i12 = eVar.rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int h10 = h(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, h10, max, view.getMeasuredHeight() + h10);
        return max - (measuredWidth + eVar.leftMargin);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f476e0);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.Q = false;
        }
        if (!this.Q) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.Q = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.Q = false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0288 A[LOOP:0: B:104:0x0286->B:105:0x0288, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02a4 A[LOOP:1: B:107:0x02a2->B:108:0x02a4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02c3 A[LOOP:2: B:110:0x02c1->B:111:0x02c3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0311 A[LOOP:3: B:118:0x030f->B:119:0x0311, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0213  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            java.util.WeakHashMap<android.view.View, i0.b0> r1 = i0.w.f6004a
            int r1 = i0.w.e.d(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000e
            r1 = r2
            goto L_0x000f
        L_0x000e:
            r1 = r3
        L_0x000f:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.T
            r11[r2] = r3
            r11[r3] = r3
            int r12 = i0.w.d.d(r19)
            if (r12 < 0) goto L_0x003c
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003d
        L_0x003c:
            r12 = r3
        L_0x003d:
            androidx.appcompat.widget.o r13 = r0.f480r
            boolean r13 = r0.r(r13)
            if (r13 == 0) goto L_0x0055
            androidx.appcompat.widget.o r13 = r0.f480r
            if (r1 == 0) goto L_0x0050
            int r13 = r0.o(r13, r10, r12, r11)
            r14 = r13
            r13 = r6
            goto L_0x0057
        L_0x0050:
            int r13 = r0.n(r13, r6, r12, r11)
            goto L_0x0056
        L_0x0055:
            r13 = r6
        L_0x0056:
            r14 = r10
        L_0x0057:
            androidx.appcompat.widget.o r15 = r0.f483v
            boolean r15 = r0.r(r15)
            if (r15 == 0) goto L_0x006c
            androidx.appcompat.widget.o r15 = r0.f483v
            if (r1 == 0) goto L_0x0068
            int r14 = r0.o(r15, r14, r12, r11)
            goto L_0x006c
        L_0x0068:
            int r13 = r0.n(r15, r13, r12, r11)
        L_0x006c:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f477o
            boolean r15 = r0.r(r15)
            if (r15 == 0) goto L_0x0081
            androidx.appcompat.widget.ActionMenuView r15 = r0.f477o
            if (r1 == 0) goto L_0x007d
            int r13 = r0.n(r15, r13, r12, r11)
            goto L_0x0081
        L_0x007d:
            int r14 = r0.o(r15, r14, r12, r11)
        L_0x0081:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.w
            boolean r13 = r0.r(r13)
            if (r13 == 0) goto L_0x00bc
            android.view.View r13 = r0.w
            if (r1 == 0) goto L_0x00b8
            int r10 = r0.o(r13, r10, r12, r11)
            goto L_0x00bc
        L_0x00b8:
            int r2 = r0.n(r13, r2, r12, r11)
        L_0x00bc:
            androidx.appcompat.widget.AppCompatImageView r13 = r0.f481s
            boolean r13 = r0.r(r13)
            if (r13 == 0) goto L_0x00d1
            androidx.appcompat.widget.AppCompatImageView r13 = r0.f481s
            if (r1 == 0) goto L_0x00cd
            int r10 = r0.o(r13, r10, r12, r11)
            goto L_0x00d1
        L_0x00cd:
            int r2 = r0.n(r13, r2, r12, r11)
        L_0x00d1:
            androidx.appcompat.widget.AppCompatTextView r13 = r0.f478p
            boolean r13 = r0.r(r13)
            androidx.appcompat.widget.AppCompatTextView r14 = r0.f479q
            boolean r14 = r0.r(r14)
            if (r13 == 0) goto L_0x00f8
            androidx.appcompat.widget.AppCompatTextView r15 = r0.f478p
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r15 = (androidx.appcompat.widget.Toolbar.e) r15
            int r3 = r15.topMargin
            r23 = r7
            androidx.appcompat.widget.AppCompatTextView r7 = r0.f478p
            int r7 = r7.getMeasuredHeight()
            int r7 = r7 + r3
            int r3 = r15.bottomMargin
            int r7 = r7 + r3
            r3 = 0
            int r7 = r7 + r3
            goto L_0x00fb
        L_0x00f8:
            r23 = r7
            r7 = 0
        L_0x00fb:
            if (r14 == 0) goto L_0x0115
            androidx.appcompat.widget.AppCompatTextView r3 = r0.f479q
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.e) r3
            int r15 = r3.topMargin
            r16 = r4
            androidx.appcompat.widget.AppCompatTextView r4 = r0.f479q
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r15
            int r3 = r3.bottomMargin
            int r4 = r4 + r3
            int r7 = r7 + r4
            goto L_0x0117
        L_0x0115:
            r16 = r4
        L_0x0117:
            if (r13 != 0) goto L_0x0122
            if (r14 == 0) goto L_0x011c
            goto L_0x0122
        L_0x011c:
            r18 = r6
            r22 = r12
            goto L_0x027a
        L_0x0122:
            if (r13 == 0) goto L_0x0127
            androidx.appcompat.widget.AppCompatTextView r3 = r0.f478p
            goto L_0x0129
        L_0x0127:
            androidx.appcompat.widget.AppCompatTextView r3 = r0.f479q
        L_0x0129:
            if (r14 == 0) goto L_0x012e
            androidx.appcompat.widget.AppCompatTextView r4 = r0.f479q
            goto L_0x0130
        L_0x012e:
            androidx.appcompat.widget.AppCompatTextView r4 = r0.f478p
        L_0x0130:
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.e) r3
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r4 = (androidx.appcompat.widget.Toolbar.e) r4
            if (r13 == 0) goto L_0x0146
            androidx.appcompat.widget.AppCompatTextView r15 = r0.f478p
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0150
        L_0x0146:
            if (r14 == 0) goto L_0x0153
            androidx.appcompat.widget.AppCompatTextView r15 = r0.f479q
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x0153
        L_0x0150:
            r17 = 1
            goto L_0x0155
        L_0x0153:
            r17 = 0
        L_0x0155:
            int r15 = r0.K
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x0197
            r6 = 80
            if (r15 == r6) goto L_0x018b
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r7
            int r6 = r6 / 2
            int r15 = r3.topMargin
            r22 = r12
            int r12 = r0.F
            int r15 = r15 + r12
            if (r6 >= r15) goto L_0x0174
            r6 = r15
            goto L_0x0189
        L_0x0174:
            int r5 = r5 - r9
            int r5 = r5 - r7
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r3 = r3.bottomMargin
            int r7 = r0.G
            int r3 = r3 + r7
            if (r5 >= r3) goto L_0x0189
            int r3 = r4.bottomMargin
            int r3 = r3 + r7
            int r3 = r3 - r5
            int r6 = r6 - r3
            r3 = 0
            int r6 = java.lang.Math.max(r3, r6)
        L_0x0189:
            int r8 = r8 + r6
            goto L_0x01a4
        L_0x018b:
            r22 = r12
            int r5 = r5 - r9
            int r3 = r4.bottomMargin
            int r5 = r5 - r3
            int r3 = r0.G
            int r5 = r5 - r3
            int r8 = r5 - r7
            goto L_0x01a4
        L_0x0197:
            r22 = r12
            int r4 = r19.getPaddingTop()
            int r3 = r3.topMargin
            int r4 = r4 + r3
            int r3 = r0.F
            int r8 = r4 + r3
        L_0x01a4:
            if (r1 == 0) goto L_0x0213
            if (r17 == 0) goto L_0x01ab
            int r1 = r0.D
            goto L_0x01ac
        L_0x01ab:
            r1 = 0
        L_0x01ac:
            r3 = 1
            r4 = r11[r3]
            int r1 = r1 - r4
            r4 = 0
            int r5 = java.lang.Math.max(r4, r1)
            int r10 = r10 - r5
            int r1 = -r1
            int r1 = java.lang.Math.max(r4, r1)
            r11[r3] = r1
            if (r13 == 0) goto L_0x01e3
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f478p
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            androidx.appcompat.widget.AppCompatTextView r3 = r0.f478p
            int r3 = r3.getMeasuredWidth()
            int r3 = r10 - r3
            androidx.appcompat.widget.AppCompatTextView r4 = r0.f478p
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            androidx.appcompat.widget.AppCompatTextView r5 = r0.f478p
            r5.layout(r3, r8, r10, r4)
            int r5 = r0.E
            int r3 = r3 - r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x01e4
        L_0x01e3:
            r3 = r10
        L_0x01e4:
            if (r14 == 0) goto L_0x020a
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f479q
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f479q
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            androidx.appcompat.widget.AppCompatTextView r4 = r0.f479q
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            androidx.appcompat.widget.AppCompatTextView r5 = r0.f479q
            r5.layout(r1, r8, r10, r4)
            int r1 = r0.E
            int r1 = r10 - r1
            goto L_0x020b
        L_0x020a:
            r1 = r10
        L_0x020b:
            if (r17 == 0) goto L_0x027a
            int r1 = java.lang.Math.min(r3, r1)
            r10 = r1
            goto L_0x027a
        L_0x0213:
            if (r17 == 0) goto L_0x0218
            int r1 = r0.D
            goto L_0x0219
        L_0x0218:
            r1 = 0
        L_0x0219:
            r3 = 0
            r4 = r11[r3]
            int r1 = r1 - r4
            int r4 = java.lang.Math.max(r3, r1)
            int r2 = r2 + r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r3] = r1
            if (r13 == 0) goto L_0x024e
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f478p
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            androidx.appcompat.widget.AppCompatTextView r3 = r0.f478p
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 + r2
            androidx.appcompat.widget.AppCompatTextView r4 = r0.f478p
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            androidx.appcompat.widget.AppCompatTextView r5 = r0.f478p
            r5.layout(r2, r8, r3, r4)
            int r5 = r0.E
            int r3 = r3 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x024f
        L_0x024e:
            r3 = r2
        L_0x024f:
            if (r14 == 0) goto L_0x0273
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f479q
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            androidx.appcompat.widget.AppCompatTextView r1 = r0.f479q
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r2
            androidx.appcompat.widget.AppCompatTextView r4 = r0.f479q
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            androidx.appcompat.widget.AppCompatTextView r5 = r0.f479q
            r5.layout(r2, r8, r1, r4)
            int r4 = r0.E
            int r1 = r1 + r4
            goto L_0x0274
        L_0x0273:
            r1 = r2
        L_0x0274:
            if (r17 == 0) goto L_0x027a
            int r2 = java.lang.Math.max(r3, r1)
        L_0x027a:
            java.util.ArrayList<android.view.View> r1 = r0.R
            r3 = 3
            r0.a(r3, r1)
            int r3 = r1.size()
            r4 = r2
            r2 = 0
        L_0x0286:
            if (r2 >= r3) goto L_0x0297
            java.lang.Object r5 = r1.get(r2)
            android.view.View r5 = (android.view.View) r5
            r12 = r22
            int r4 = r0.n(r5, r4, r12, r11)
            int r2 = r2 + 1
            goto L_0x0286
        L_0x0297:
            r12 = r22
            r2 = 5
            r0.a(r2, r1)
            int r2 = r1.size()
            r3 = 0
        L_0x02a2:
            if (r3 >= r2) goto L_0x02b1
            java.lang.Object r5 = r1.get(r3)
            android.view.View r5 = (android.view.View) r5
            int r10 = r0.o(r5, r10, r12, r11)
            int r3 = r3 + 1
            goto L_0x02a2
        L_0x02b1:
            r3 = 1
            r0.a(r3, r1)
            r2 = 0
            r5 = r11[r2]
            r2 = r11[r3]
            int r3 = r1.size()
            r7 = r5
            r5 = 0
            r6 = 0
        L_0x02c1:
            if (r5 >= r3) goto L_0x02f4
            java.lang.Object r8 = r1.get(r5)
            android.view.View r8 = (android.view.View) r8
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r9 = (androidx.appcompat.widget.Toolbar.e) r9
            int r13 = r9.leftMargin
            int r13 = r13 - r7
            int r7 = r9.rightMargin
            int r7 = r7 - r2
            r2 = 0
            int r9 = java.lang.Math.max(r2, r13)
            int r14 = java.lang.Math.max(r2, r7)
            int r13 = -r13
            int r13 = java.lang.Math.max(r2, r13)
            int r7 = -r7
            int r7 = java.lang.Math.max(r2, r7)
            int r8 = r8.getMeasuredWidth()
            int r8 = r8 + r9
            int r8 = r8 + r14
            int r6 = r6 + r8
            int r5 = r5 + 1
            r2 = r7
            r7 = r13
            goto L_0x02c1
        L_0x02f4:
            r2 = 0
            int r3 = r16 - r18
            int r3 = r3 - r23
            int r3 = r3 / 2
            int r3 = r3 + r18
            int r5 = r6 / 2
            int r3 = r3 - r5
            int r6 = r6 + r3
            if (r3 >= r4) goto L_0x0304
            goto L_0x030b
        L_0x0304:
            if (r6 <= r10) goto L_0x030a
            int r6 = r6 - r10
            int r4 = r3 - r6
            goto L_0x030b
        L_0x030a:
            r4 = r3
        L_0x030b:
            int r3 = r1.size()
        L_0x030f:
            if (r2 >= r3) goto L_0x031e
            java.lang.Object r5 = r1.get(r2)
            android.view.View r5 = (android.view.View) r5
            int r4 = r0.n(r5, r4, r12, r11)
            int r2 = r2 + 1
            goto L_0x030f
        L_0x031e:
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z10;
        char a10 = m1.a(this);
        char c10 = a10 ^ 1;
        int i19 = 0;
        if (r(this.f480r)) {
            q(this.f480r, i10, 0, i11, this.C);
            i14 = i(this.f480r) + this.f480r.getMeasuredWidth();
            i13 = Math.max(0, j(this.f480r) + this.f480r.getMeasuredHeight());
            i12 = View.combineMeasuredStates(0, this.f480r.getMeasuredState());
        } else {
            i14 = 0;
            i13 = 0;
            i12 = 0;
        }
        if (r(this.f483v)) {
            q(this.f483v, i10, 0, i11, this.C);
            i14 = i(this.f483v) + this.f483v.getMeasuredWidth();
            i13 = Math.max(i13, j(this.f483v) + this.f483v.getMeasuredHeight());
            i12 = View.combineMeasuredStates(i12, this.f483v.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i14) + 0;
        int max2 = Math.max(0, currentContentInsetStart - i14);
        int[] iArr = this.T;
        iArr[a10] = max2;
        if (r(this.f477o)) {
            q(this.f477o, i10, max, i11, this.C);
            i15 = i(this.f477o) + this.f477o.getMeasuredWidth();
            i13 = Math.max(i13, j(this.f477o) + this.f477o.getMeasuredHeight());
            i12 = View.combineMeasuredStates(i12, this.f477o.getMeasuredState());
        } else {
            i15 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i15);
        iArr[c10] = Math.max(0, currentContentInsetEnd - i15);
        if (r(this.w)) {
            max3 += p(this.w, i10, max3, i11, 0, iArr);
            i13 = Math.max(i13, j(this.w) + this.w.getMeasuredHeight());
            i12 = View.combineMeasuredStates(i12, this.w.getMeasuredState());
        }
        if (r(this.f481s)) {
            max3 += p(this.f481s, i10, max3, i11, 0, iArr);
            i13 = Math.max(i13, j(this.f481s) + this.f481s.getMeasuredHeight());
            i12 = View.combineMeasuredStates(i12, this.f481s.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (((e) childAt.getLayoutParams()).f492b == 0 && r(childAt)) {
                max3 += p(childAt, i10, max3, i11, 0, iArr);
                i13 = Math.max(i13, j(childAt) + childAt.getMeasuredHeight());
                i12 = View.combineMeasuredStates(i12, childAt.getMeasuredState());
            }
        }
        int i21 = this.F + this.G;
        int i22 = this.D + this.E;
        if (r(this.f478p)) {
            p(this.f478p, i10, max3 + i22, i11, i21, iArr);
            int i23 = i(this.f478p) + this.f478p.getMeasuredWidth();
            i16 = j(this.f478p) + this.f478p.getMeasuredHeight();
            i18 = View.combineMeasuredStates(i12, this.f478p.getMeasuredState());
            i17 = i23;
        } else {
            i16 = 0;
            i18 = i12;
            i17 = 0;
        }
        if (r(this.f479q)) {
            i17 = Math.max(i17, p(this.f479q, i10, max3 + i22, i11, i16 + i21, iArr));
            i16 += j(this.f479q) + this.f479q.getMeasuredHeight();
            i18 = View.combineMeasuredStates(i18, this.f479q.getMeasuredState());
        } else {
            int i24 = i18;
        }
        int max4 = Math.max(i13, i16);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i17, getSuggestedMinimumWidth()), i10, -16777216 & i18);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, i18 << 16);
        if (this.f475d0) {
            int childCount2 = getChildCount();
            int i25 = 0;
            while (true) {
                if (i25 >= childCount2) {
                    z10 = true;
                    break;
                }
                View childAt2 = getChildAt(i25);
                if (r(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i25++;
            }
        }
        z10 = false;
        if (!z10) {
            i19 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i19);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        androidx.appcompat.view.menu.f fVar;
        MenuItem findItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.f7340o);
        ActionMenuView actionMenuView = this.f477o;
        if (actionMenuView != null) {
            fVar = actionMenuView.D;
        } else {
            fVar = null;
        }
        int i10 = gVar.f493q;
        if (!(i10 == 0 || this.f474c0 == null || fVar == null || (findItem = fVar.findItem(i10)) == null)) {
            findItem.expandActionView();
        }
        if (gVar.f494r) {
            b bVar = this.f476e0;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onRtlPropertiesChanged(int r3) {
        /*
            r2 = this;
            super.onRtlPropertiesChanged(r3)
            androidx.appcompat.widget.v0 r0 = r2.H
            if (r0 != 0) goto L_0x000e
            androidx.appcompat.widget.v0 r0 = new androidx.appcompat.widget.v0
            r0.<init>()
            r2.H = r0
        L_0x000e:
            androidx.appcompat.widget.v0 r0 = r2.H
            r1 = 1
            if (r3 != r1) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            boolean r3 = r0.f720g
            if (r1 != r3) goto L_0x001a
            goto L_0x0048
        L_0x001a:
            r0.f720g = r1
            boolean r3 = r0.f721h
            if (r3 == 0) goto L_0x0040
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x0032
            int r1 = r0.d
            if (r1 == r3) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            int r1 = r0.f718e
        L_0x002b:
            r0.f715a = r1
            int r1 = r0.f717c
            if (r1 == r3) goto L_0x0044
            goto L_0x0046
        L_0x0032:
            int r1 = r0.f717c
            if (r1 == r3) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            int r1 = r0.f718e
        L_0x0039:
            r0.f715a = r1
            int r1 = r0.d
            if (r1 == r3) goto L_0x0044
            goto L_0x0046
        L_0x0040:
            int r3 = r0.f718e
            r0.f715a = r3
        L_0x0044:
            int r1 = r0.f719f
        L_0x0046:
            r0.f716b = r1
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onRtlPropertiesChanged(int):void");
    }

    public Parcelable onSaveInstanceState() {
        boolean z10;
        androidx.appcompat.view.menu.h hVar;
        g gVar = new g(super.onSaveInstanceState());
        d dVar = this.f474c0;
        if (!(dVar == null || (hVar = dVar.f490p) == null)) {
            gVar.f493q = hVar.f337a;
        }
        ActionMenuView actionMenuView = this.f477o;
        boolean z11 = false;
        if (actionMenuView != null) {
            c cVar = actionMenuView.H;
            if (cVar == null || !cVar.g()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                z11 = true;
            }
        }
        gVar.f494r = z11;
        return gVar;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.P = false;
        }
        if (!this.P) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.P = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.P = false;
        }
        return true;
    }

    public final int p(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i15) + Math.max(0, i14);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void q(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i13 >= 0) {
            if (mode != 0) {
                i13 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i13);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean r(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        o oVar = this.f483v;
        if (oVar != null) {
            oVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(f.a.b(getContext(), i10));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f483v.setImageDrawable(drawable);
            return;
        }
        o oVar = this.f483v;
        if (oVar != null) {
            oVar.setImageDrawable(this.f482t);
        }
    }

    public void setCollapsible(boolean z10) {
        this.f475d0 = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.J) {
            this.J = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.I) {
            this.I = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(f.a.b(getContext(), i10));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f481s == null) {
                this.f481s = new AppCompatImageView(getContext(), (AttributeSet) null);
            }
            if (!m(this.f481s)) {
                b(this.f481s, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f481s;
            if (appCompatImageView != null && m(appCompatImageView)) {
                removeView(this.f481s);
                this.S.remove(this.f481s);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f481s;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f481s == null) {
            this.f481s = new AppCompatImageView(getContext(), (AttributeSet) null);
        }
        AppCompatImageView appCompatImageView = this.f481s;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        o oVar = this.f480r;
        if (oVar != null) {
            oVar.setContentDescription(charSequence);
            i1.a(this.f480r, charSequence);
        }
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(f.a.b(getContext(), i10));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!m(this.f480r)) {
                b(this.f480r, true);
            }
        } else {
            o oVar = this.f480r;
            if (oVar != null && m(oVar)) {
                removeView(this.f480r);
                this.S.remove(this.f480r);
            }
        }
        o oVar2 = this.f480r;
        if (oVar2 != null) {
            oVar2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f480r.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
    }

    public void setOverflowIcon(Drawable drawable) {
        d();
        this.f477o.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f485y != i10) {
            this.f485y = i10;
            if (i10 == 0) {
                this.f484x = getContext();
            } else {
                this.f484x = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f479q == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
                this.f479q = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f479q.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.A;
                if (i10 != 0) {
                    this.f479q.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.O;
                if (colorStateList != null) {
                    this.f479q.setTextColor(colorStateList);
                }
            }
            if (!m(this.f479q)) {
                b(this.f479q, true);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f479q;
            if (appCompatTextView2 != null && m(appCompatTextView2)) {
                removeView(this.f479q);
                this.S.remove(this.f479q);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f479q;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.M = charSequence;
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.O = colorStateList;
        AppCompatTextView appCompatTextView = this.f479q;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f478p == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
                this.f478p = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f478p.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.z;
                if (i10 != 0) {
                    this.f478p.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.N;
                if (colorStateList != null) {
                    this.f478p.setTextColor(colorStateList);
                }
            }
            if (!m(this.f478p)) {
                b(this.f478p, true);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f478p;
            if (appCompatTextView2 != null && m(appCompatTextView2)) {
                removeView(this.f478p);
                this.S.remove(this.f478p);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f478p;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.L = charSequence;
    }

    public void setTitleMarginBottom(int i10) {
        this.G = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.E = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.D = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.F = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.N = colorStateList;
        AppCompatTextView appCompatTextView = this.f478p;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }
}

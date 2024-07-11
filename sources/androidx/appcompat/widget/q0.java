package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import i.f;
import i0.b0;
import i0.w;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class q0 implements f {
    public static final Method N;
    public static final Method O;
    public final int A = Integer.MAX_VALUE;
    public b B;
    public View C;
    public AdapterView.OnItemClickListener D;
    public final e E = new e();
    public final d F = new d();
    public final c G = new c();
    public final a H = new a();
    public final Handler I;
    public final Rect J = new Rect();
    public Rect K;
    public boolean L;
    public final r M;

    /* renamed from: o  reason: collision with root package name */
    public final Context f686o;

    /* renamed from: p  reason: collision with root package name */
    public ListAdapter f687p;

    /* renamed from: q  reason: collision with root package name */
    public l0 f688q;

    /* renamed from: r  reason: collision with root package name */
    public final int f689r = -2;

    /* renamed from: s  reason: collision with root package name */
    public int f690s = -2;

    /* renamed from: t  reason: collision with root package name */
    public int f691t;
    public int u;

    /* renamed from: v  reason: collision with root package name */
    public final int f692v = 1002;
    public boolean w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f693x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f694y;
    public int z = 0;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            l0 l0Var = q0.this.f688q;
            if (l0Var != null) {
                l0Var.setListSelectionHidden(true);
                l0Var.requestLayout();
            }
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        public final void onChanged() {
            q0 q0Var = q0.this;
            if (q0Var.c()) {
                q0Var.a();
            }
        }

        public final void onInvalidated() {
            q0.this.dismiss();
        }
    }

    public class c implements AbsListView.OnScrollListener {
        public c() {
        }

        public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        public final void onScrollStateChanged(AbsListView absListView, int i10) {
            boolean z = true;
            if (i10 == 1) {
                q0 q0Var = q0.this;
                if (q0Var.M.getInputMethodMode() != 2) {
                    z = false;
                }
                if (!z && q0Var.M.getContentView() != null) {
                    Handler handler = q0Var.I;
                    e eVar = q0Var.E;
                    handler.removeCallbacks(eVar);
                    eVar.run();
                }
            }
        }
    }

    public class d implements View.OnTouchListener {
        public d() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            r rVar;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            q0 q0Var = q0.this;
            if (action == 0 && (rVar = q0Var.M) != null && rVar.isShowing() && x10 >= 0) {
                r rVar2 = q0Var.M;
                if (x10 < rVar2.getWidth() && y10 >= 0 && y10 < rVar2.getHeight()) {
                    q0Var.I.postDelayed(q0Var.E, 250);
                    return false;
                }
            }
            if (action != 1) {
                return false;
            }
            q0Var.I.removeCallbacks(q0Var.E);
            return false;
        }
    }

    public class e implements Runnable {
        public e() {
        }

        public final void run() {
            q0 q0Var = q0.this;
            l0 l0Var = q0Var.f688q;
            if (l0Var != null) {
                WeakHashMap<View, b0> weakHashMap = w.f6004a;
                if (w.g.b(l0Var) && q0Var.f688q.getCount() > q0Var.f688q.getChildCount() && q0Var.f688q.getChildCount() <= q0Var.A) {
                    q0Var.M.setInputMethodMode(2);
                    q0Var.a();
                }
            }
        }
    }

    static {
        Class<PopupWindow> cls = PopupWindow.class;
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                N = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                O = cls.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public q0(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f686o = context;
        this.I = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.databinding.a.N, i10, i11);
        this.f691t = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.u = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.w = true;
        }
        obtainStyledAttributes.recycle();
        r rVar = new r(context, attributeSet, i10, i11);
        this.M = rVar;
        rVar.setInputMethodMode(1);
    }

    public final void a() {
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        l0 l0Var;
        int i12;
        int i13;
        int i14;
        int i15;
        l0 l0Var2 = this.f688q;
        r rVar = this.M;
        Context context = this.f686o;
        if (l0Var2 == null) {
            l0 q10 = q(context, !this.L);
            this.f688q = q10;
            q10.setAdapter(this.f687p);
            this.f688q.setOnItemClickListener(this.D);
            this.f688q.setFocusable(true);
            this.f688q.setFocusableInTouchMode(true);
            this.f688q.setOnItemSelectedListener(new p0(this));
            this.f688q.setOnScrollListener(this.G);
            rVar.setContentView(this.f688q);
        } else {
            ViewGroup viewGroup = (ViewGroup) rVar.getContentView();
        }
        Drawable background = rVar.getBackground();
        int i16 = 0;
        Rect rect = this.J;
        if (background != null) {
            background.getPadding(rect);
            int i17 = rect.top;
            i10 = rect.bottom + i17;
            if (!this.w) {
                this.u = -i17;
            }
        } else {
            rect.setEmpty();
            i10 = 0;
        }
        if (rVar.getInputMethodMode() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        int maxAvailableHeight = rVar.getMaxAvailableHeight(this.C, this.u, z10);
        int i18 = this.f689r;
        if (i18 == -1) {
            i11 = maxAvailableHeight + i10;
        } else {
            int i19 = this.f690s;
            if (i19 == -2) {
                i14 = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            } else if (i19 != -1) {
                i14 = View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
            } else {
                i14 = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            }
            int a10 = this.f688q.a(i14, maxAvailableHeight + 0);
            if (a10 > 0) {
                i15 = this.f688q.getPaddingBottom() + this.f688q.getPaddingTop() + i10 + 0;
            } else {
                i15 = 0;
            }
            i11 = a10 + i15;
        }
        if (rVar.getInputMethodMode() == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        l0.f.d(rVar, this.f692v);
        if (rVar.isShowing()) {
            View view = this.C;
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            if (w.g.b(view)) {
                int i20 = this.f690s;
                if (i20 == -1) {
                    i20 = -1;
                } else if (i20 == -2) {
                    i20 = this.C.getWidth();
                }
                if (i18 == -1) {
                    if (z11) {
                        i18 = i11;
                    } else {
                        i18 = -1;
                    }
                    int i21 = this.f690s;
                    if (z11) {
                        if (i21 == -1) {
                            i13 = -1;
                        } else {
                            i13 = 0;
                        }
                        rVar.setWidth(i13);
                        rVar.setHeight(0);
                    } else {
                        if (i21 == -1) {
                            i16 = -1;
                        }
                        rVar.setWidth(i16);
                        rVar.setHeight(-1);
                    }
                } else if (i18 == -2) {
                    i18 = i11;
                }
                rVar.setOutsideTouchable(true);
                View view2 = this.C;
                int i22 = this.f691t;
                int i23 = this.u;
                if (i20 < 0) {
                    i20 = -1;
                }
                if (i18 < 0) {
                    i12 = -1;
                } else {
                    i12 = i18;
                }
                rVar.update(view2, i22, i23, i20, i12);
                return;
            }
            return;
        }
        int i24 = this.f690s;
        if (i24 == -1) {
            i24 = -1;
        } else if (i24 == -2) {
            i24 = this.C.getWidth();
        }
        if (i18 == -1) {
            i18 = -1;
        } else if (i18 == -2) {
            i18 = i11;
        }
        rVar.setWidth(i24);
        rVar.setHeight(i18);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = N;
            if (method != null) {
                try {
                    method.invoke(rVar, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            rVar.setIsClippedToScreen(true);
        }
        rVar.setOutsideTouchable(true);
        rVar.setTouchInterceptor(this.F);
        if (this.f694y) {
            l0.f.c(rVar, this.f693x);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = O;
            if (method2 != null) {
                try {
                    method2.invoke(rVar, new Object[]{this.K});
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            rVar.setEpicenterBounds(this.K);
        }
        l0.e.a(rVar, this.C, this.f691t, this.u, this.z);
        this.f688q.setSelection(-1);
        if ((!this.L || this.f688q.isInTouchMode()) && (l0Var = this.f688q) != null) {
            l0Var.setListSelectionHidden(true);
            l0Var.requestLayout();
        }
        if (!this.L) {
            this.I.post(this.H);
        }
    }

    public final boolean c() {
        return this.M.isShowing();
    }

    public final int d() {
        return this.f691t;
    }

    public final void dismiss() {
        r rVar = this.M;
        rVar.dismiss();
        rVar.setContentView((View) null);
        this.f688q = null;
        this.I.removeCallbacks(this.E);
    }

    public final Drawable f() {
        return this.M.getBackground();
    }

    public final l0 g() {
        return this.f688q;
    }

    public final void i(Drawable drawable) {
        this.M.setBackgroundDrawable(drawable);
    }

    public final void j(int i10) {
        this.u = i10;
        this.w = true;
    }

    public final void l(int i10) {
        this.f691t = i10;
    }

    public final int n() {
        if (!this.w) {
            return 0;
        }
        return this.u;
    }

    public void p(ListAdapter listAdapter) {
        b bVar = this.B;
        if (bVar == null) {
            this.B = new b();
        } else {
            ListAdapter listAdapter2 = this.f687p;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(bVar);
            }
        }
        this.f687p = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.B);
        }
        l0 l0Var = this.f688q;
        if (l0Var != null) {
            l0Var.setAdapter(this.f687p);
        }
    }

    public l0 q(Context context, boolean z10) {
        return new l0(context, z10);
    }

    public final void r(int i10) {
        Drawable background = this.M.getBackground();
        if (background != null) {
            Rect rect = this.J;
            background.getPadding(rect);
            this.f690s = rect.left + rect.right + i10;
            return;
        }
        this.f690s = i10;
    }
}

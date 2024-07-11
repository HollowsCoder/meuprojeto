package e;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.j0;
import androidx.appcompat.widget.w0;
import com.karumi.dexter.R;
import e.a;
import e.g;
import h.a;
import h.g;
import i0.a0;
import i0.b0;
import i0.d0;
import i0.w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class r extends a implements ActionBarOverlayLayout.d {
    public static final DecelerateInterpolator A = new DecelerateInterpolator();
    public static final AccelerateInterpolator z = new AccelerateInterpolator();

    /* renamed from: a  reason: collision with root package name */
    public Context f4415a;

    /* renamed from: b  reason: collision with root package name */
    public Context f4416b;

    /* renamed from: c  reason: collision with root package name */
    public ActionBarOverlayLayout f4417c;
    public ActionBarContainer d;

    /* renamed from: e  reason: collision with root package name */
    public j0 f4418e;

    /* renamed from: f  reason: collision with root package name */
    public ActionBarContextView f4419f;

    /* renamed from: g  reason: collision with root package name */
    public final View f4420g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4421h;

    /* renamed from: i  reason: collision with root package name */
    public d f4422i;

    /* renamed from: j  reason: collision with root package name */
    public d f4423j;

    /* renamed from: k  reason: collision with root package name */
    public a.C0073a f4424k;
    public boolean l;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList<a.b> f4425m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    public boolean f4426n;

    /* renamed from: o  reason: collision with root package name */
    public int f4427o = 0;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4428p = true;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4429q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f4430r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f4431s = true;

    /* renamed from: t  reason: collision with root package name */
    public g f4432t;
    public boolean u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f4433v;
    public final a w = new a();

    /* renamed from: x  reason: collision with root package name */
    public final b f4434x = new b();

    /* renamed from: y  reason: collision with root package name */
    public final c f4435y = new c();

    public class a extends androidx.databinding.a {
        public a() {
        }

        public final void a() {
            View view;
            r rVar = r.this;
            if (rVar.f4428p && (view = rVar.f4420g) != null) {
                view.setTranslationY(0.0f);
                rVar.d.setTranslationY(0.0f);
            }
            rVar.d.setVisibility(8);
            rVar.d.setTransitioning(false);
            rVar.f4432t = null;
            a.C0073a aVar = rVar.f4424k;
            if (aVar != null) {
                aVar.c(rVar.f4423j);
                rVar.f4423j = null;
                rVar.f4424k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = rVar.f4417c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, b0> weakHashMap = w.f6004a;
                w.h.c(actionBarOverlayLayout);
            }
        }
    }

    public class b extends androidx.databinding.a {
        public b() {
        }

        public final void a() {
            r rVar = r.this;
            rVar.f4432t = null;
            rVar.d.requestLayout();
        }
    }

    public class c implements d0 {
        public c() {
        }
    }

    public class d extends h.a implements f.a {

        /* renamed from: q  reason: collision with root package name */
        public final Context f4439q;

        /* renamed from: r  reason: collision with root package name */
        public final f f4440r;

        /* renamed from: s  reason: collision with root package name */
        public a.C0073a f4441s;

        /* renamed from: t  reason: collision with root package name */
        public WeakReference<View> f4442t;

        public d(Context context, g.c cVar) {
            this.f4439q = context;
            this.f4441s = cVar;
            f fVar = new f(context);
            fVar.l = 1;
            this.f4440r = fVar;
            fVar.f317e = this;
        }

        public final boolean a(f fVar, MenuItem menuItem) {
            a.C0073a aVar = this.f4441s;
            if (aVar != null) {
                return aVar.a(this, menuItem);
            }
            return false;
        }

        public final void b(f fVar) {
            if (this.f4441s != null) {
                i();
                androidx.appcompat.widget.c cVar = r.this.f4419f.f502r;
                if (cVar != null) {
                    cVar.l();
                }
            }
        }

        public final void c() {
            r rVar = r.this;
            if (rVar.f4422i == this) {
                if (!(!rVar.f4429q)) {
                    rVar.f4423j = this;
                    rVar.f4424k = this.f4441s;
                } else {
                    this.f4441s.c(this);
                }
                this.f4441s = null;
                rVar.a(false);
                ActionBarContextView actionBarContextView = rVar.f4419f;
                if (actionBarContextView.f389y == null) {
                    actionBarContextView.h();
                }
                rVar.f4417c.setHideOnContentScrollEnabled(rVar.f4433v);
                rVar.f4422i = null;
            }
        }

        public final View d() {
            WeakReference<View> weakReference = this.f4442t;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        public final f e() {
            return this.f4440r;
        }

        public final MenuInflater f() {
            return new h.f(this.f4439q);
        }

        public final CharSequence g() {
            return r.this.f4419f.getSubtitle();
        }

        public final CharSequence h() {
            return r.this.f4419f.getTitle();
        }

        public final void i() {
            if (r.this.f4422i == this) {
                f fVar = this.f4440r;
                fVar.w();
                try {
                    this.f4441s.b(this, fVar);
                } finally {
                    fVar.v();
                }
            }
        }

        public final boolean j() {
            return r.this.f4419f.G;
        }

        public final void k(View view) {
            r.this.f4419f.setCustomView(view);
            this.f4442t = new WeakReference<>(view);
        }

        public final void l(int i10) {
            m(r.this.f4415a.getResources().getString(i10));
        }

        public final void m(CharSequence charSequence) {
            r.this.f4419f.setSubtitle(charSequence);
        }

        public final void n(int i10) {
            o(r.this.f4415a.getResources().getString(i10));
        }

        public final void o(CharSequence charSequence) {
            r.this.f4419f.setTitle(charSequence);
        }

        public final void p(boolean z) {
            this.f5058p = z;
            r.this.f4419f.setTitleOptional(z);
        }
    }

    public r(Activity activity, boolean z10) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        d(decorView);
        if (!z10) {
            this.f4420g = decorView.findViewById(16908290);
        }
    }

    public r(Dialog dialog) {
        new ArrayList();
        d(dialog.getWindow().getDecorView());
    }

    public final void a(boolean z10) {
        b0 b0Var;
        b0 b0Var2;
        long j8;
        if (z10) {
            if (!this.f4430r) {
                this.f4430r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f4417c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                f(false);
            }
        } else if (this.f4430r) {
            this.f4430r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f4417c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            f(false);
        }
        ActionBarContainer actionBarContainer = this.d;
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        if (w.g.c(actionBarContainer)) {
            if (z10) {
                b0Var = this.f4418e.r(4, 100);
                b0Var2 = this.f4419f.e(0, 200);
            } else {
                b0Var2 = this.f4418e.r(0, 200);
                b0Var = this.f4419f.e(8, 100);
            }
            h.g gVar = new h.g();
            ArrayList<b0> arrayList = gVar.f5102a;
            arrayList.add(b0Var);
            View view = b0Var.f5956a.get();
            if (view != null) {
                j8 = view.animate().getDuration();
            } else {
                j8 = 0;
            }
            View view2 = b0Var2.f5956a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j8);
            }
            arrayList.add(b0Var2);
            gVar.b();
        } else if (z10) {
            this.f4418e.j(4);
            this.f4419f.setVisibility(0);
        } else {
            this.f4418e.j(0);
            this.f4419f.setVisibility(8);
        }
    }

    public final void b(boolean z10) {
        if (z10 != this.l) {
            this.l = z10;
            ArrayList<a.b> arrayList = this.f4425m;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.get(i10).a();
            }
        }
    }

    public final Context c() {
        if (this.f4416b == null) {
            TypedValue typedValue = new TypedValue();
            this.f4415a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f4416b = new ContextThemeWrapper(this.f4415a, i10);
            } else {
                this.f4416b = this.f4415a;
            }
        }
        return this.f4416b;
    }

    public final void d(View view) {
        j0 j0Var;
        boolean z10;
        String str;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f4417c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof j0) {
            j0Var = (j0) findViewById;
        } else if (findViewById instanceof Toolbar) {
            j0Var = ((Toolbar) findViewById).getWrapper();
        } else {
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = "null";
            }
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(str));
        }
        this.f4418e = j0Var;
        this.f4419f = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.d = actionBarContainer;
        j0 j0Var2 = this.f4418e;
        if (j0Var2 == null || this.f4419f == null || actionBarContainer == null) {
            throw new IllegalStateException(r.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        this.f4415a = j0Var2.b();
        if ((this.f4418e.o() & 4) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f4421h = true;
        }
        Context context = this.f4415a;
        if (context.getApplicationInfo().targetSdkVersion < 14) {
        }
        this.f4418e.k();
        e(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f4415a.obtainStyledAttributes((AttributeSet) null, androidx.databinding.a.z, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f4417c;
            if (actionBarOverlayLayout2.f397v) {
                this.f4433v = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            w.i.s(actionBarContainer2, (float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void e(boolean z10) {
        this.f4426n = z10;
        if (!z10) {
            this.f4418e.n();
            this.d.setTabContainer((w0) null);
        } else {
            this.d.setTabContainer((w0) null);
            this.f4418e.n();
        }
        this.f4418e.q();
        j0 j0Var = this.f4418e;
        boolean z11 = this.f4426n;
        j0Var.u(false);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f4417c;
        boolean z12 = this.f4426n;
        actionBarOverlayLayout.setHasNonEmbeddedTabs(false);
    }

    public final void f(boolean z10) {
        boolean z11;
        boolean z12 = this.f4429q;
        if (!this.f4430r && z12) {
            z11 = false;
        } else {
            z11 = true;
        }
        a0 a0Var = null;
        View view = this.f4420g;
        c cVar = this.f4435y;
        if (z11) {
            if (!this.f4431s) {
                this.f4431s = true;
                h.g gVar = this.f4432t;
                if (gVar != null) {
                    gVar.a();
                }
                this.d.setVisibility(0);
                int i10 = this.f4427o;
                b bVar = this.f4434x;
                if (i10 != 0 || (!this.u && !z10)) {
                    this.d.setAlpha(1.0f);
                    this.d.setTranslationY(0.0f);
                    if (this.f4428p && view != null) {
                        view.setTranslationY(0.0f);
                    }
                    bVar.a();
                } else {
                    this.d.setTranslationY(0.0f);
                    float f10 = (float) (-this.d.getHeight());
                    if (z10) {
                        int[] iArr = {0, 0};
                        this.d.getLocationInWindow(iArr);
                        f10 -= (float) iArr[1];
                    }
                    this.d.setTranslationY(f10);
                    h.g gVar2 = new h.g();
                    b0 a10 = w.a(this.d);
                    a10.e(0.0f);
                    View view2 = a10.f5956a.get();
                    if (view2 != null) {
                        if (cVar != null) {
                            a0Var = new a0(cVar, view2);
                        }
                        view2.animate().setUpdateListener(a0Var);
                    }
                    boolean z13 = gVar2.f5105e;
                    ArrayList<b0> arrayList = gVar2.f5102a;
                    if (!z13) {
                        arrayList.add(a10);
                    }
                    if (this.f4428p && view != null) {
                        view.setTranslationY(f10);
                        b0 a11 = w.a(view);
                        a11.e(0.0f);
                        if (!gVar2.f5105e) {
                            arrayList.add(a11);
                        }
                    }
                    DecelerateInterpolator decelerateInterpolator = A;
                    boolean z14 = gVar2.f5105e;
                    if (!z14) {
                        gVar2.f5104c = decelerateInterpolator;
                    }
                    if (!z14) {
                        gVar2.f5103b = 250;
                    }
                    if (!z14) {
                        gVar2.d = bVar;
                    }
                    this.f4432t = gVar2;
                    gVar2.b();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f4417c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap<View, b0> weakHashMap = w.f6004a;
                    w.h.c(actionBarOverlayLayout);
                }
            }
        } else if (this.f4431s) {
            this.f4431s = false;
            h.g gVar3 = this.f4432t;
            if (gVar3 != null) {
                gVar3.a();
            }
            int i11 = this.f4427o;
            a aVar = this.w;
            if (i11 != 0 || (!this.u && !z10)) {
                aVar.a();
                return;
            }
            this.d.setAlpha(1.0f);
            this.d.setTransitioning(true);
            h.g gVar4 = new h.g();
            float f11 = (float) (-this.d.getHeight());
            if (z10) {
                int[] iArr2 = {0, 0};
                this.d.getLocationInWindow(iArr2);
                f11 -= (float) iArr2[1];
            }
            b0 a12 = w.a(this.d);
            a12.e(f11);
            View view3 = a12.f5956a.get();
            if (view3 != null) {
                if (cVar != null) {
                    a0Var = new a0(cVar, view3);
                }
                view3.animate().setUpdateListener(a0Var);
            }
            boolean z15 = gVar4.f5105e;
            ArrayList<b0> arrayList2 = gVar4.f5102a;
            if (!z15) {
                arrayList2.add(a12);
            }
            if (this.f4428p && view != null) {
                b0 a13 = w.a(view);
                a13.e(f11);
                if (!gVar4.f5105e) {
                    arrayList2.add(a13);
                }
            }
            AccelerateInterpolator accelerateInterpolator = z;
            boolean z16 = gVar4.f5105e;
            if (!z16) {
                gVar4.f5104c = accelerateInterpolator;
            }
            if (!z16) {
                gVar4.f5103b = 250;
            }
            if (!z16) {
                gVar4.d = aVar;
            }
            this.f4432t = gVar4;
            gVar4.b();
        }
    }
}

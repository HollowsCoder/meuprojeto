package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c;
import com.karumi.dexter.R;
import e.g;
import i0.b0;
import i0.w;

public final class h1 implements j0 {

    /* renamed from: a  reason: collision with root package name */
    public final Toolbar f582a;

    /* renamed from: b  reason: collision with root package name */
    public int f583b;

    /* renamed from: c  reason: collision with root package name */
    public w0 f584c;
    public View d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f585e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f586f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f587g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f588h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f589i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f590j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f591k;
    public Window.Callback l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f592m;

    /* renamed from: n  reason: collision with root package name */
    public c f593n;

    /* renamed from: o  reason: collision with root package name */
    public int f594o = 0;

    /* renamed from: p  reason: collision with root package name */
    public Drawable f595p;

    public class a extends androidx.databinding.a {
        public final /* synthetic */ int A0;

        /* renamed from: z0  reason: collision with root package name */
        public boolean f596z0 = false;

        public a(int i10) {
            this.A0 = i10;
        }

        public final void a() {
            if (!this.f596z0) {
                h1.this.f582a.setVisibility(this.A0);
            }
        }

        public final void f(View view) {
            this.f596z0 = true;
        }

        public final void k() {
            h1.this.f582a.setVisibility(0);
        }
    }

    public h1(Toolbar toolbar) {
        boolean z;
        Drawable drawable;
        this.f582a = toolbar;
        this.f589i = toolbar.getTitle();
        this.f590j = toolbar.getSubtitle();
        if (this.f589i != null) {
            z = true;
        } else {
            z = false;
        }
        this.f588h = z;
        this.f587g = toolbar.getNavigationIcon();
        String str = null;
        e1 m10 = e1.m(toolbar.getContext(), (AttributeSet) null, androidx.databinding.a.z, R.attr.actionBarStyle);
        this.f595p = m10.e(15);
        CharSequence k10 = m10.k(27);
        if (!TextUtils.isEmpty(k10)) {
            setTitle(k10);
        }
        CharSequence k11 = m10.k(25);
        if (!TextUtils.isEmpty(k11)) {
            this.f590j = k11;
            if ((this.f583b & 8) != 0) {
                toolbar.setSubtitle(k11);
            }
        }
        Drawable e10 = m10.e(20);
        if (e10 != null) {
            this.f586f = e10;
            v();
        }
        Drawable e11 = m10.e(17);
        if (e11 != null) {
            setIcon(e11);
        }
        if (this.f587g == null && (drawable = this.f595p) != null) {
            this.f587g = drawable;
            toolbar.setNavigationIcon((this.f583b & 4) == 0 ? null : drawable);
        }
        m(m10.h(10, 0));
        int i10 = m10.i(9, 0);
        if (i10 != 0) {
            View inflate = LayoutInflater.from(toolbar.getContext()).inflate(i10, toolbar, false);
            View view = this.d;
            if (!(view == null || (this.f583b & 16) == 0)) {
                toolbar.removeView(view);
            }
            this.d = inflate;
            if (!(inflate == null || (this.f583b & 16) == 0)) {
                toolbar.addView(inflate);
            }
            m(this.f583b | 16);
        }
        int layoutDimension = m10.f551b.getLayoutDimension(13, 0);
        if (layoutDimension > 0) {
            ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
            layoutParams.height = layoutDimension;
            toolbar.setLayoutParams(layoutParams);
        }
        int c10 = m10.c(7, -1);
        int c11 = m10.c(3, -1);
        if (c10 >= 0 || c11 >= 0) {
            int max = Math.max(c10, 0);
            int max2 = Math.max(c11, 0);
            if (toolbar.H == null) {
                toolbar.H = new v0();
            }
            toolbar.H.a(max, max2);
        }
        int i11 = m10.i(28, 0);
        if (i11 != 0) {
            Context context = toolbar.getContext();
            toolbar.z = i11;
            AppCompatTextView appCompatTextView = toolbar.f478p;
            if (appCompatTextView != null) {
                appCompatTextView.setTextAppearance(context, i11);
            }
        }
        int i12 = m10.i(26, 0);
        if (i12 != 0) {
            Context context2 = toolbar.getContext();
            toolbar.A = i12;
            AppCompatTextView appCompatTextView2 = toolbar.f479q;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setTextAppearance(context2, i12);
            }
        }
        int i13 = m10.i(22, 0);
        if (i13 != 0) {
            toolbar.setPopupTheme(i13);
        }
        m10.n();
        if (R.string.abc_action_bar_up_description != this.f594o) {
            this.f594o = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i14 = this.f594o;
                str = i14 != 0 ? b().getString(i14) : str;
                this.f591k = str;
                if ((this.f583b & 4) != 0) {
                    if (TextUtils.isEmpty(str)) {
                        toolbar.setNavigationContentDescription(this.f594o);
                    } else {
                        toolbar.setNavigationContentDescription(this.f591k);
                    }
                }
            }
        }
        this.f591k = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new g1(this));
    }

    public final boolean a() {
        boolean z;
        ActionMenuView actionMenuView = this.f582a.f477o;
        if (actionMenuView == null) {
            return false;
        }
        c cVar = actionMenuView.H;
        if (cVar == null || !cVar.g()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return false;
    }

    public final Context b() {
        return this.f582a.getContext();
    }

    public final void c() {
        this.f592m = true;
    }

    public final void collapseActionView() {
        h hVar;
        Toolbar.d dVar = this.f582a.f474c0;
        if (dVar == null) {
            hVar = null;
        } else {
            hVar = dVar.f490p;
        }
        if (hVar != null) {
            hVar.collapseActionView();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.f582a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f477o
            r1 = 0
            if (r0 == 0) goto L_0x0022
            androidx.appcompat.widget.c r0 = r0.H
            r2 = 1
            if (r0 == 0) goto L_0x001e
            androidx.appcompat.widget.c$c r3 = r0.I
            if (r3 != 0) goto L_0x0019
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r0 = r1
            goto L_0x001a
        L_0x0019:
            r0 = r2
        L_0x001a:
            if (r0 == 0) goto L_0x001e
            r0 = r2
            goto L_0x001f
        L_0x001e:
            r0 = r1
        L_0x001f:
            if (r0 == 0) goto L_0x0022
            r1 = r2
        L_0x0022:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h1.d():boolean");
    }

    public final boolean e() {
        boolean z;
        ActionMenuView actionMenuView = this.f582a.f477o;
        if (actionMenuView == null) {
            return false;
        }
        c cVar = actionMenuView.H;
        if (cVar == null || !cVar.c()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        boolean z;
        ActionMenuView actionMenuView = this.f582a.f477o;
        if (actionMenuView == null) {
            return false;
        }
        c cVar = actionMenuView.H;
        if (cVar == null || !cVar.l()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return false;
    }

    public final void g(f fVar, g.b bVar) {
        c cVar = this.f593n;
        Toolbar toolbar = this.f582a;
        if (cVar == null) {
            this.f593n = new c(toolbar.getContext());
        }
        c cVar2 = this.f593n;
        cVar2.f278s = bVar;
        if (fVar != null || toolbar.f477o != null) {
            toolbar.e();
            f fVar2 = toolbar.f477o.D;
            if (fVar2 != fVar) {
                if (fVar2 != null) {
                    fVar2.r(toolbar.f473b0);
                    fVar2.r(toolbar.f474c0);
                }
                if (toolbar.f474c0 == null) {
                    toolbar.f474c0 = new Toolbar.d();
                }
                cVar2.E = true;
                if (fVar != null) {
                    fVar.b(cVar2, toolbar.f484x);
                    fVar.b(toolbar.f474c0, toolbar.f484x);
                } else {
                    cVar2.e(toolbar.f484x, (f) null);
                    toolbar.f474c0.e(toolbar.f484x, (f) null);
                    cVar2.f();
                    toolbar.f474c0.f();
                }
                toolbar.f477o.setPopupTheme(toolbar.f485y);
                toolbar.f477o.setPresenter(cVar2);
                toolbar.f473b0 = cVar2;
            }
        }
    }

    public final CharSequence getTitle() {
        return this.f582a.getTitle();
    }

    public final boolean h() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f582a;
        if (toolbar.getVisibility() != 0 || (actionMenuView = toolbar.f477o) == null || !actionMenuView.G) {
            return false;
        }
        return true;
    }

    public final void i() {
        c cVar;
        ActionMenuView actionMenuView = this.f582a.f477o;
        if (actionMenuView != null && (cVar = actionMenuView.H) != null) {
            cVar.c();
            c.a aVar = cVar.H;
            if (aVar != null && aVar.b()) {
                aVar.f367j.dismiss();
            }
        }
    }

    public final void j(int i10) {
        this.f582a.setVisibility(i10);
    }

    public final void k() {
    }

    public final boolean l() {
        Toolbar.d dVar = this.f582a.f474c0;
        if (dVar == null || dVar.f490p == null) {
            return false;
        }
        return true;
    }

    public final void m(int i10) {
        View view;
        Drawable drawable;
        int i11 = this.f583b ^ i10;
        this.f583b = i10;
        if (i11 != 0) {
            int i12 = i11 & 4;
            CharSequence charSequence = null;
            Toolbar toolbar = this.f582a;
            if (i12 != 0) {
                if (!((i10 & 4) == 0 || (i10 & 4) == 0)) {
                    if (TextUtils.isEmpty(this.f591k)) {
                        toolbar.setNavigationContentDescription(this.f594o);
                    } else {
                        toolbar.setNavigationContentDescription(this.f591k);
                    }
                }
                if ((this.f583b & 4) != 0) {
                    drawable = this.f587g;
                    if (drawable == null) {
                        drawable = this.f595p;
                    }
                } else {
                    drawable = null;
                }
                toolbar.setNavigationIcon(drawable);
            }
            if ((i11 & 3) != 0) {
                v();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    toolbar.setTitle(this.f589i);
                    charSequence = this.f590j;
                } else {
                    toolbar.setTitle((CharSequence) null);
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i11 & 16) != 0 && (view = this.d) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void n() {
        Toolbar toolbar;
        w0 w0Var = this.f584c;
        if (w0Var != null && w0Var.getParent() == (toolbar = this.f582a)) {
            toolbar.removeView(this.f584c);
        }
        this.f584c = null;
    }

    public final int o() {
        return this.f583b;
    }

    public final void p(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = f.a.b(b(), i10);
        } else {
            drawable = null;
        }
        this.f586f = drawable;
        v();
    }

    public final void q() {
    }

    public final b0 r(int i10, long j8) {
        b0 a10 = w.a(this.f582a);
        a10.a(i10 == 0 ? 1.0f : 0.0f);
        a10.c(j8);
        a10.d(new a(i10));
        return a10;
    }

    public final void s() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final void setIcon(int i10) {
        setIcon(i10 != 0 ? f.a.b(b(), i10) : null);
    }

    public final void setIcon(Drawable drawable) {
        this.f585e = drawable;
        v();
    }

    public final void setTitle(CharSequence charSequence) {
        this.f588h = true;
        this.f589i = charSequence;
        if ((this.f583b & 8) != 0) {
            Toolbar toolbar = this.f582a;
            toolbar.setTitle(charSequence);
            if (this.f588h) {
                w.l(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final void setWindowCallback(Window.Callback callback) {
        this.l = callback;
    }

    public final void setWindowTitle(CharSequence charSequence) {
        if (!this.f588h) {
            this.f589i = charSequence;
            if ((this.f583b & 8) != 0) {
                Toolbar toolbar = this.f582a;
                toolbar.setTitle(charSequence);
                if (this.f588h) {
                    w.l(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    public final void t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final void u(boolean z) {
        this.f582a.setCollapsible(z);
    }

    public final void v() {
        Drawable drawable;
        int i10 = this.f583b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f586f) == null) {
            drawable = this.f585e;
        }
        this.f582a.setLogo(drawable);
    }
}

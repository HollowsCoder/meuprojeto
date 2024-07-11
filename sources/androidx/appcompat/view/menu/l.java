package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.l0;
import androidx.appcompat.widget.r;
import androidx.appcompat.widget.s0;
import com.karumi.dexter.R;
import i.d;

public final class l extends d implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public View A;
    public View B;
    public j.a C;
    public ViewTreeObserver D;
    public boolean E;
    public boolean F;
    public int G;
    public int H = 0;
    public boolean I;

    /* renamed from: p  reason: collision with root package name */
    public final Context f370p;

    /* renamed from: q  reason: collision with root package name */
    public final f f371q;

    /* renamed from: r  reason: collision with root package name */
    public final e f372r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f373s;

    /* renamed from: t  reason: collision with root package name */
    public final int f374t;
    public final int u;

    /* renamed from: v  reason: collision with root package name */
    public final int f375v;
    public final s0 w;

    /* renamed from: x  reason: collision with root package name */
    public final a f376x = new a();

    /* renamed from: y  reason: collision with root package name */
    public final b f377y = new b();
    public PopupWindow.OnDismissListener z;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public final void onGlobalLayout() {
            l lVar = l.this;
            if (lVar.c() && !lVar.w.L) {
                View view = lVar.B;
                if (view == null || !view.isShown()) {
                    lVar.dismiss();
                } else {
                    lVar.w.a();
                }
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            l lVar = l.this;
            ViewTreeObserver viewTreeObserver = lVar.D;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    lVar.D = view.getViewTreeObserver();
                }
                lVar.D.removeGlobalOnLayoutListener(lVar.f376x);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(int i10, int i11, Context context, View view, f fVar, boolean z10) {
        this.f370p = context;
        this.f371q = fVar;
        this.f373s = z10;
        this.f372r = new e(fVar, LayoutInflater.from(context), z10, R.layout.abc_popup_menu_item_layout);
        this.u = i10;
        this.f375v = i11;
        Resources resources = context.getResources();
        this.f374t = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.A = view;
        this.w = new s0(context, i10, i11);
        fVar.b(this, context);
    }

    public final void a() {
        View view;
        boolean z10;
        Rect rect;
        boolean z11 = true;
        if (!c()) {
            if (this.E || (view = this.A) == null) {
                z11 = false;
            } else {
                this.B = view;
                s0 s0Var = this.w;
                s0Var.M.setOnDismissListener(this);
                s0Var.D = this;
                s0Var.L = true;
                r rVar = s0Var.M;
                rVar.setFocusable(true);
                View view2 = this.B;
                if (this.D == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.D = viewTreeObserver;
                if (z10) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f376x);
                }
                view2.addOnAttachStateChangeListener(this.f377y);
                s0Var.C = view2;
                s0Var.z = this.H;
                boolean z12 = this.F;
                Context context = this.f370p;
                e eVar = this.f372r;
                if (!z12) {
                    this.G = d.m(eVar, context, this.f374t);
                    this.F = true;
                }
                s0Var.r(this.G);
                rVar.setInputMethodMode(2);
                Rect rect2 = this.f5948o;
                if (rect2 != null) {
                    rect = new Rect(rect2);
                } else {
                    rect = null;
                }
                s0Var.K = rect;
                s0Var.a();
                l0 l0Var = s0Var.f688q;
                l0Var.setOnKeyListener(this);
                if (this.I) {
                    f fVar = this.f371q;
                    if (fVar.f324m != null) {
                        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, l0Var, false);
                        TextView textView = (TextView) frameLayout.findViewById(16908310);
                        if (textView != null) {
                            textView.setText(fVar.f324m);
                        }
                        frameLayout.setEnabled(false);
                        l0Var.addHeaderView(frameLayout, (Object) null, false);
                    }
                }
                s0Var.p(eVar);
                s0Var.a();
            }
        }
        if (!z11) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public final void b(f fVar, boolean z10) {
        if (fVar == this.f371q) {
            dismiss();
            j.a aVar = this.C;
            if (aVar != null) {
                aVar.b(fVar, z10);
            }
        }
    }

    public final boolean c() {
        return !this.E && this.w.c();
    }

    public final void dismiss() {
        if (c()) {
            this.w.dismiss();
        }
    }

    public final void f() {
        this.F = false;
        e eVar = this.f372r;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    public final l0 g() {
        return this.w.f688q;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(androidx.appcompat.view.menu.m r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L_0x007a
            androidx.appcompat.view.menu.i r0 = new androidx.appcompat.view.menu.i
            android.content.Context r5 = r9.f370p
            android.view.View r6 = r9.B
            boolean r8 = r9.f373s
            int r3 = r9.u
            int r4 = r9.f375v
            r2 = r0
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            androidx.appcompat.view.menu.j$a r2 = r9.C
            r0.f366i = r2
            i.d r3 = r0.f367j
            if (r3 == 0) goto L_0x0023
            r3.j(r2)
        L_0x0023:
            boolean r2 = i.d.u(r10)
            r0.f365h = r2
            i.d r3 = r0.f367j
            if (r3 == 0) goto L_0x0030
            r3.o(r2)
        L_0x0030:
            android.widget.PopupWindow$OnDismissListener r2 = r9.z
            r0.f368k = r2
            r2 = 0
            r9.z = r2
            androidx.appcompat.view.menu.f r2 = r9.f371q
            r2.c(r1)
            androidx.appcompat.widget.s0 r2 = r9.w
            int r3 = r2.f691t
            int r2 = r2.n()
            int r4 = r9.H
            android.view.View r5 = r9.A
            java.util.WeakHashMap<android.view.View, i0.b0> r6 = i0.w.f6004a
            int r5 = i0.w.e.d(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L_0x005e
            android.view.View r4 = r9.A
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L_0x005e:
            boolean r4 = r0.b()
            r5 = 1
            if (r4 == 0) goto L_0x0066
            goto L_0x006f
        L_0x0066:
            android.view.View r4 = r0.f363f
            if (r4 != 0) goto L_0x006c
            r0 = r1
            goto L_0x0070
        L_0x006c:
            r0.d(r3, r2, r5, r5)
        L_0x006f:
            r0 = r5
        L_0x0070:
            if (r0 == 0) goto L_0x007a
            androidx.appcompat.view.menu.j$a r0 = r9.C
            if (r0 == 0) goto L_0x0079
            r0.c(r10)
        L_0x0079:
            return r5
        L_0x007a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.l.h(androidx.appcompat.view.menu.m):boolean");
    }

    public final boolean i() {
        return false;
    }

    public final void j(j.a aVar) {
        this.C = aVar;
    }

    public final void l(f fVar) {
    }

    public final void n(View view) {
        this.A = view;
    }

    public final void o(boolean z10) {
        this.f372r.f309q = z10;
    }

    public final void onDismiss() {
        this.E = true;
        this.f371q.c(true);
        ViewTreeObserver viewTreeObserver = this.D;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.D = this.B.getViewTreeObserver();
            }
            this.D.removeGlobalOnLayoutListener(this.f376x);
            this.D = null;
        }
        this.B.removeOnAttachStateChangeListener(this.f377y);
        PopupWindow.OnDismissListener onDismissListener = this.z;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public final void p(int i10) {
        this.H = i10;
    }

    public final void q(int i10) {
        this.w.f691t = i10;
    }

    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.z = onDismissListener;
    }

    public final void s(boolean z10) {
        this.I = z10;
    }

    public final void t(int i10) {
        this.w.j(i10);
    }
}

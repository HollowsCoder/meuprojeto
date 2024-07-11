package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.transition.Transition;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.l0;
import androidx.appcompat.widget.r0;
import androidx.appcompat.widget.s0;
import com.karumi.dexter.R;
import i0.b0;
import i0.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

public final class b extends i.d implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public int A;
    public int B;
    public View C;
    public View D;
    public int E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public boolean K;
    public j.a L;
    public ViewTreeObserver M;
    public PopupWindow.OnDismissListener N;
    public boolean O;

    /* renamed from: p  reason: collision with root package name */
    public final Context f281p;

    /* renamed from: q  reason: collision with root package name */
    public final int f282q;

    /* renamed from: r  reason: collision with root package name */
    public final int f283r;

    /* renamed from: s  reason: collision with root package name */
    public final int f284s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f285t;
    public final Handler u;

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList f286v = new ArrayList();
    public final ArrayList w = new ArrayList();

    /* renamed from: x  reason: collision with root package name */
    public final a f287x = new a();

    /* renamed from: y  reason: collision with root package name */
    public final C0006b f288y = new C0006b();
    public final c z = new c();

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public final void onGlobalLayout() {
            b bVar = b.this;
            if (bVar.c()) {
                ArrayList arrayList = bVar.w;
                if (arrayList.size() > 0 && !((d) arrayList.get(0)).f292a.L) {
                    View view = bVar.D;
                    if (view == null || !view.isShown()) {
                        bVar.dismiss();
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((d) it.next()).f292a.a();
                    }
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b  reason: collision with other inner class name */
    public class C0006b implements View.OnAttachStateChangeListener {
        public C0006b() {
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            b bVar = b.this;
            ViewTreeObserver viewTreeObserver = bVar.M;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    bVar.M = view.getViewTreeObserver();
                }
                bVar.M.removeGlobalOnLayoutListener(bVar.f287x);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class c implements r0 {
        public c() {
        }

        public final void b(f fVar, MenuItem menuItem) {
            b.this.u.removeCallbacksAndMessages(fVar);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: androidx.appcompat.view.menu.b$d} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void e(androidx.appcompat.view.menu.f r8, androidx.appcompat.view.menu.h r9) {
            /*
                r7 = this;
                androidx.appcompat.view.menu.b r0 = androidx.appcompat.view.menu.b.this
                android.os.Handler r1 = r0.u
                r2 = 0
                r1.removeCallbacksAndMessages(r2)
                java.util.ArrayList r1 = r0.w
                int r3 = r1.size()
                r4 = 0
            L_0x000f:
                r5 = -1
                if (r4 >= r3) goto L_0x0020
                java.lang.Object r6 = r1.get(r4)
                androidx.appcompat.view.menu.b$d r6 = (androidx.appcompat.view.menu.b.d) r6
                androidx.appcompat.view.menu.f r6 = r6.f293b
                if (r8 != r6) goto L_0x001d
                goto L_0x0021
            L_0x001d:
                int r4 = r4 + 1
                goto L_0x000f
            L_0x0020:
                r4 = r5
            L_0x0021:
                if (r4 != r5) goto L_0x0024
                return
            L_0x0024:
                int r4 = r4 + 1
                int r3 = r1.size()
                if (r4 >= r3) goto L_0x0033
                java.lang.Object r1 = r1.get(r4)
                r2 = r1
                androidx.appcompat.view.menu.b$d r2 = (androidx.appcompat.view.menu.b.d) r2
            L_0x0033:
                androidx.appcompat.view.menu.c r1 = new androidx.appcompat.view.menu.c
                r1.<init>(r7, r2, r9, r8)
                long r2 = android.os.SystemClock.uptimeMillis()
                r4 = 200(0xc8, double:9.9E-322)
                long r2 = r2 + r4
                android.os.Handler r9 = r0.u
                r9.postAtTime(r1, r8, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.b.c.e(androidx.appcompat.view.menu.f, androidx.appcompat.view.menu.h):void");
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final s0 f292a;

        /* renamed from: b  reason: collision with root package name */
        public final f f293b;

        /* renamed from: c  reason: collision with root package name */
        public final int f294c;

        public d(s0 s0Var, f fVar, int i10) {
            this.f292a = s0Var;
            this.f293b = fVar;
            this.f294c = i10;
        }
    }

    public b(Context context, View view, int i10, int i11, boolean z10) {
        int i12 = 0;
        this.A = 0;
        this.B = 0;
        this.f281p = context;
        this.C = view;
        this.f283r = i10;
        this.f284s = i11;
        this.f285t = z10;
        this.J = false;
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        this.E = w.e.d(view) != 1 ? 1 : i12;
        Resources resources = context.getResources();
        this.f282q = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.u = new Handler();
    }

    public final void a() {
        if (!c()) {
            ArrayList arrayList = this.f286v;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                v((f) it.next());
            }
            arrayList.clear();
            View view = this.C;
            this.D = view;
            if (view != null) {
                boolean z10 = this.M == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.M = viewTreeObserver;
                if (z10) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f287x);
                }
                this.D.addOnAttachStateChangeListener(this.f288y);
            }
        }
    }

    public final void b(f fVar, boolean z10) {
        int i10;
        ArrayList arrayList = this.w;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (fVar == ((d) arrayList.get(i11)).f293b) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            int i12 = i11 + 1;
            if (i12 < arrayList.size()) {
                ((d) arrayList.get(i12)).f293b.c(false);
            }
            d dVar = (d) arrayList.remove(i11);
            dVar.f293b.r(this);
            boolean z11 = this.O;
            s0 s0Var = dVar.f292a;
            if (z11) {
                s0Var.M.setExitTransition((Transition) null);
                s0Var.M.setAnimationStyle(0);
            }
            s0Var.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                i10 = ((d) arrayList.get(size2 - 1)).f294c;
            } else {
                View view = this.C;
                WeakHashMap<View, b0> weakHashMap = w.f6004a;
                if (w.e.d(view) == 1) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
            }
            this.E = i10;
            if (size2 == 0) {
                dismiss();
                j.a aVar = this.L;
                if (aVar != null) {
                    aVar.b(fVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.M;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.M.removeGlobalOnLayoutListener(this.f287x);
                    }
                    this.M = null;
                }
                this.D.removeOnAttachStateChangeListener(this.f288y);
                this.N.onDismiss();
            } else if (z10) {
                ((d) arrayList.get(0)).f293b.c(false);
            }
        }
    }

    public final boolean c() {
        ArrayList arrayList = this.w;
        return arrayList.size() > 0 && ((d) arrayList.get(0)).f292a.c();
    }

    public final void dismiss() {
        ArrayList arrayList = this.w;
        int size = arrayList.size();
        if (size > 0) {
            d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
            while (true) {
                size--;
                if (size >= 0) {
                    d dVar = dVarArr[size];
                    if (dVar.f292a.c()) {
                        dVar.f292a.dismiss();
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void f() {
        Iterator it = this.w.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((d) it.next()).f292a.f688q.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((e) adapter).notifyDataSetChanged();
        }
    }

    public final l0 g() {
        ArrayList arrayList = this.w;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) arrayList.get(arrayList.size() - 1)).f292a.f688q;
    }

    public final boolean h(m mVar) {
        Iterator it = this.w.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (mVar == dVar.f293b) {
                dVar.f292a.f688q.requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        l(mVar);
        j.a aVar = this.L;
        if (aVar != null) {
            aVar.c(mVar);
        }
        return true;
    }

    public final boolean i() {
        return false;
    }

    public final void j(j.a aVar) {
        this.L = aVar;
    }

    public final void l(f fVar) {
        fVar.b(this, this.f281p);
        if (c()) {
            v(fVar);
        } else {
            this.f286v.add(fVar);
        }
    }

    public final void n(View view) {
        if (this.C != view) {
            this.C = view;
            int i10 = this.A;
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            this.B = Gravity.getAbsoluteGravity(i10, w.e.d(view));
        }
    }

    public final void o(boolean z10) {
        this.J = z10;
    }

    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.w;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) arrayList.get(i10);
            if (!dVar.f292a.c()) {
                break;
            }
            i10++;
        }
        if (dVar != null) {
            dVar.f293b.c(false);
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
        if (this.A != i10) {
            this.A = i10;
            View view = this.C;
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            this.B = Gravity.getAbsoluteGravity(i10, w.e.d(view));
        }
    }

    public final void q(int i10) {
        this.F = true;
        this.H = i10;
    }

    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.N = onDismissListener;
    }

    public final void s(boolean z10) {
        this.K = z10;
    }

    public final void t(int i10) {
        this.G = true;
        this.I = i10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(androidx.appcompat.view.menu.f r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            android.content.Context r2 = r0.f281p
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r2)
            androidx.appcompat.view.menu.e r4 = new androidx.appcompat.view.menu.e
            boolean r5 = r0.f285t
            r6 = 2131558411(0x7f0d000b, float:1.8742137E38)
            r4.<init>(r1, r3, r5, r6)
            boolean r5 = r18.c()
            r6 = 1
            if (r5 != 0) goto L_0x0022
            boolean r5 = r0.J
            if (r5 == 0) goto L_0x0022
            r4.f309q = r6
            goto L_0x002e
        L_0x0022:
            boolean r5 = r18.c()
            if (r5 == 0) goto L_0x002e
            boolean r5 = i.d.u(r19)
            r4.f309q = r5
        L_0x002e:
            int r5 = r0.f282q
            int r5 = i.d.m(r4, r2, r5)
            androidx.appcompat.widget.s0 r7 = new androidx.appcompat.widget.s0
            int r8 = r0.f283r
            int r9 = r0.f284s
            r7.<init>(r2, r8, r9)
            androidx.appcompat.view.menu.b$c r2 = r0.z
            r7.P = r2
            r7.D = r0
            androidx.appcompat.widget.r r2 = r7.M
            r2.setOnDismissListener(r0)
            android.view.View r8 = r0.C
            r7.C = r8
            int r8 = r0.B
            r7.z = r8
            r7.L = r6
            r2.setFocusable(r6)
            r8 = 2
            r2.setInputMethodMode(r8)
            r7.p(r4)
            r7.r(r5)
            int r4 = r0.B
            r7.z = r4
            java.util.ArrayList r4 = r0.w
            int r9 = r4.size()
            if (r9 <= 0) goto L_0x00e0
            int r9 = r4.size()
            int r9 = r9 - r6
            java.lang.Object r9 = r4.get(r9)
            androidx.appcompat.view.menu.b$d r9 = (androidx.appcompat.view.menu.b.d) r9
            androidx.appcompat.view.menu.f r12 = r9.f293b
            int r13 = r12.size()
            r14 = 0
        L_0x007d:
            if (r14 >= r13) goto L_0x0094
            android.view.MenuItem r15 = r12.getItem(r14)
            boolean r16 = r15.hasSubMenu()
            if (r16 == 0) goto L_0x0090
            android.view.SubMenu r8 = r15.getSubMenu()
            if (r1 != r8) goto L_0x0090
            goto L_0x0095
        L_0x0090:
            int r14 = r14 + 1
            r8 = 2
            goto L_0x007d
        L_0x0094:
            r15 = 0
        L_0x0095:
            if (r15 != 0) goto L_0x0099
        L_0x0097:
            r6 = 0
            goto L_0x00e2
        L_0x0099:
            androidx.appcompat.widget.s0 r8 = r9.f292a
            androidx.appcompat.widget.l0 r8 = r8.f688q
            android.widget.ListAdapter r12 = r8.getAdapter()
            boolean r13 = r12 instanceof android.widget.HeaderViewListAdapter
            if (r13 == 0) goto L_0x00b2
            android.widget.HeaderViewListAdapter r12 = (android.widget.HeaderViewListAdapter) r12
            int r13 = r12.getHeadersCount()
            android.widget.ListAdapter r12 = r12.getWrappedAdapter()
            androidx.appcompat.view.menu.e r12 = (androidx.appcompat.view.menu.e) r12
            goto L_0x00b5
        L_0x00b2:
            androidx.appcompat.view.menu.e r12 = (androidx.appcompat.view.menu.e) r12
            r13 = 0
        L_0x00b5:
            int r14 = r12.getCount()
            r10 = 0
        L_0x00ba:
            r11 = -1
            if (r10 >= r14) goto L_0x00c8
            androidx.appcompat.view.menu.h r6 = r12.getItem(r10)
            if (r15 != r6) goto L_0x00c4
            goto L_0x00c9
        L_0x00c4:
            int r10 = r10 + 1
            r6 = 1
            goto L_0x00ba
        L_0x00c8:
            r10 = r11
        L_0x00c9:
            if (r10 != r11) goto L_0x00cc
            goto L_0x0097
        L_0x00cc:
            int r10 = r10 + r13
            int r6 = r8.getFirstVisiblePosition()
            int r10 = r10 - r6
            if (r10 < 0) goto L_0x0097
            int r6 = r8.getChildCount()
            if (r10 < r6) goto L_0x00db
            goto L_0x0097
        L_0x00db:
            android.view.View r6 = r8.getChildAt(r10)
            goto L_0x00e2
        L_0x00e0:
            r6 = 0
            r9 = 0
        L_0x00e2:
            if (r6 == 0) goto L_0x01b4
            int r8 = android.os.Build.VERSION.SDK_INT
            r10 = 28
            if (r8 > r10) goto L_0x0102
            java.lang.reflect.Method r8 = androidx.appcompat.widget.s0.Q
            if (r8 == 0) goto L_0x0105
            r10 = 1
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x00fa }
            java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x00fa }
            r12 = 0
            r11[r12] = r10     // Catch:{ Exception -> 0x00fa }
            r8.invoke(r2, r11)     // Catch:{ Exception -> 0x00fa }
            goto L_0x0105
        L_0x00fa:
            java.lang.String r8 = "MenuPopupWindow"
            java.lang.String r10 = "Could not invoke setTouchModal() on PopupWindow. Oh well."
            android.util.Log.i(r8, r10)
            goto L_0x0105
        L_0x0102:
            r2.setTouchModal(false)
        L_0x0105:
            r8 = 0
            r2.setEnterTransition(r8)
            int r2 = r4.size()
            r8 = 1
            int r2 = r2 - r8
            java.lang.Object r2 = r4.get(r2)
            androidx.appcompat.view.menu.b$d r2 = (androidx.appcompat.view.menu.b.d) r2
            androidx.appcompat.widget.s0 r2 = r2.f292a
            androidx.appcompat.widget.l0 r2 = r2.f688q
            r8 = 2
            int[] r10 = new int[r8]
            r2.getLocationOnScreen(r10)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            android.view.View r11 = r0.D
            r11.getWindowVisibleDisplayFrame(r8)
            int r11 = r0.E
            r12 = 1
            r17 = 0
            if (r11 != r12) goto L_0x013f
            r10 = r10[r17]
            int r2 = r2.getWidth()
            int r2 = r2 + r10
            int r2 = r2 + r5
            int r8 = r8.right
            if (r2 <= r8) goto L_0x0144
            r2 = r17
            goto L_0x0145
        L_0x013f:
            r2 = r10[r17]
            int r2 = r2 - r5
            if (r2 >= 0) goto L_0x0147
        L_0x0144:
            r2 = 1
        L_0x0145:
            r8 = 1
            goto L_0x0149
        L_0x0147:
            r2 = 0
            goto L_0x0145
        L_0x0149:
            if (r2 != r8) goto L_0x014d
            r10 = 1
            goto L_0x014e
        L_0x014d:
            r10 = 0
        L_0x014e:
            r0.E = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r8 = 26
            r11 = 5
            if (r2 < r8) goto L_0x015c
            r7.C = r6
            r2 = 0
            r12 = 0
            goto L_0x0192
        L_0x015c:
            r2 = 2
            int[] r8 = new int[r2]
            android.view.View r12 = r0.C
            r12.getLocationOnScreen(r8)
            int[] r2 = new int[r2]
            r6.getLocationOnScreen(r2)
            int r12 = r0.B
            r12 = r12 & 7
            if (r12 != r11) goto L_0x0185
            r12 = 0
            r13 = r8[r12]
            android.view.View r14 = r0.C
            int r14 = r14.getWidth()
            int r14 = r14 + r13
            r8[r12] = r14
            r13 = r2[r12]
            int r14 = r6.getWidth()
            int r14 = r14 + r13
            r2[r12] = r14
            goto L_0x0186
        L_0x0185:
            r12 = 0
        L_0x0186:
            r13 = r2[r12]
            r14 = r8[r12]
            int r12 = r13 - r14
            r13 = 1
            r2 = r2[r13]
            r8 = r8[r13]
            int r2 = r2 - r8
        L_0x0192:
            int r8 = r0.B
            r8 = r8 & r11
            if (r8 != r11) goto L_0x01a0
            if (r10 == 0) goto L_0x019b
            int r12 = r12 + r5
            goto L_0x01a9
        L_0x019b:
            int r5 = r6.getWidth()
            goto L_0x01a8
        L_0x01a0:
            if (r10 == 0) goto L_0x01a8
            int r5 = r6.getWidth()
            int r12 = r12 + r5
            goto L_0x01a9
        L_0x01a8:
            int r12 = r12 - r5
        L_0x01a9:
            r7.f691t = r12
            r5 = 1
            r7.f694y = r5
            r7.f693x = r5
            r7.j(r2)
            goto L_0x01d2
        L_0x01b4:
            boolean r2 = r0.F
            if (r2 == 0) goto L_0x01bc
            int r2 = r0.H
            r7.f691t = r2
        L_0x01bc:
            boolean r2 = r0.G
            if (r2 == 0) goto L_0x01c5
            int r2 = r0.I
            r7.j(r2)
        L_0x01c5:
            android.graphics.Rect r2 = r0.f5948o
            if (r2 == 0) goto L_0x01cf
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>(r2)
            goto L_0x01d0
        L_0x01cf:
            r8 = 0
        L_0x01d0:
            r7.K = r8
        L_0x01d2:
            androidx.appcompat.view.menu.b$d r2 = new androidx.appcompat.view.menu.b$d
            int r5 = r0.E
            r2.<init>(r7, r1, r5)
            r4.add(r2)
            r7.a()
            androidx.appcompat.widget.l0 r2 = r7.f688q
            r2.setOnKeyListener(r0)
            if (r9 != 0) goto L_0x0210
            boolean r4 = r0.K
            if (r4 == 0) goto L_0x0210
            java.lang.CharSequence r4 = r1.f324m
            if (r4 == 0) goto L_0x0210
            r4 = 2131558418(0x7f0d0012, float:1.8742151E38)
            r5 = 0
            android.view.View r3 = r3.inflate(r4, r2, r5)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r4 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.setEnabled(r5)
            java.lang.CharSequence r1 = r1.f324m
            r4.setText(r1)
            r1 = 0
            r2.addHeaderView(r3, r1, r5)
            r7.a()
        L_0x0210:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.b.v(androidx.appcompat.view.menu.f):void");
    }
}

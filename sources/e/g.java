package e;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.k;
import androidx.appcompat.widget.m1;
import androidx.appcompat.widget.t0;
import com.karumi.dexter.R;
import e.q;
import h.a;
import h.e;
import i0.b0;
import i0.c0;
import i0.w;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.List;
import java.util.WeakHashMap;

public final class g extends f implements f.a, LayoutInflater.Factory2 {

    /* renamed from: n0  reason: collision with root package name */
    public static final n.i<String, Integer> f4331n0 = new n.i<>();

    /* renamed from: o0  reason: collision with root package name */
    public static final int[] f4332o0 = {16842836};

    /* renamed from: p0  reason: collision with root package name */
    public static final boolean f4333p0 = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: q0  reason: collision with root package name */
    public static final boolean f4334q0 = true;
    public j A;
    public h.a B;
    public ActionBarContextView C;
    public PopupWindow D;
    public j E;
    public b0 F = null;
    public final boolean G = true;
    public boolean H;
    public ViewGroup I;
    public TextView J;
    public View K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public i[] T;
    public i U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public Configuration Z;

    /* renamed from: a0  reason: collision with root package name */
    public final int f4335a0 = -100;

    /* renamed from: b0  reason: collision with root package name */
    public int f4336b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f4337c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f4338d0;

    /* renamed from: e0  reason: collision with root package name */
    public C0053g f4339e0;

    /* renamed from: f0  reason: collision with root package name */
    public e f4340f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f4341g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f4342h0;

    /* renamed from: i0  reason: collision with root package name */
    public final a f4343i0 = new a();

    /* renamed from: j0  reason: collision with root package name */
    public boolean f4344j0;

    /* renamed from: k0  reason: collision with root package name */
    public Rect f4345k0;

    /* renamed from: l0  reason: collision with root package name */
    public Rect f4346l0;

    /* renamed from: m0  reason: collision with root package name */
    public n f4347m0;

    /* renamed from: q  reason: collision with root package name */
    public final Object f4348q;

    /* renamed from: r  reason: collision with root package name */
    public final Context f4349r;

    /* renamed from: s  reason: collision with root package name */
    public Window f4350s;

    /* renamed from: t  reason: collision with root package name */
    public d f4351t;
    public final e u;

    /* renamed from: v  reason: collision with root package name */
    public r f4352v;
    public h.f w;

    /* renamed from: x  reason: collision with root package name */
    public CharSequence f4353x;

    /* renamed from: y  reason: collision with root package name */
    public i0 f4354y;
    public b z;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            g gVar = g.this;
            if ((gVar.f4342h0 & 1) != 0) {
                gVar.D(0);
            }
            if ((gVar.f4342h0 & 4096) != 0) {
                gVar.D(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
            }
            gVar.f4341g0 = false;
            gVar.f4342h0 = 0;
        }
    }

    public final class b implements j.a {
        public b() {
        }

        public final void b(androidx.appcompat.view.menu.f fVar, boolean z) {
            g.this.z(fVar);
        }

        public final boolean c(androidx.appcompat.view.menu.f fVar) {
            Window.Callback I = g.this.I();
            if (I == null) {
                return true;
            }
            I.onMenuOpened(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, fVar);
            return true;
        }
    }

    public class c implements a.C0073a {

        /* renamed from: a  reason: collision with root package name */
        public final a.C0073a f4357a;

        public class a extends androidx.databinding.a {
            public a() {
            }

            public final void a() {
                c cVar = c.this;
                g.this.C.setVisibility(8);
                g gVar = g.this;
                PopupWindow popupWindow = gVar.D;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (gVar.C.getParent() instanceof View) {
                    WeakHashMap<View, b0> weakHashMap = w.f6004a;
                    w.h.c((View) gVar.C.getParent());
                }
                gVar.C.h();
                gVar.F.d((c0) null);
                gVar.F = null;
                ViewGroup viewGroup = gVar.I;
                WeakHashMap<View, b0> weakHashMap2 = w.f6004a;
                w.h.c(viewGroup);
            }
        }

        public c(e.a aVar) {
            this.f4357a = aVar;
        }

        public final boolean a(h.a aVar, MenuItem menuItem) {
            return this.f4357a.a(aVar, menuItem);
        }

        public final boolean b(h.a aVar, androidx.appcompat.view.menu.f fVar) {
            ViewGroup viewGroup = g.this.I;
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            w.h.c(viewGroup);
            return this.f4357a.b(aVar, fVar);
        }

        public final void c(h.a aVar) {
            this.f4357a.c(aVar);
            g gVar = g.this;
            if (gVar.D != null) {
                gVar.f4350s.getDecorView().removeCallbacks(gVar.E);
            }
            if (gVar.C != null) {
                b0 b0Var = gVar.F;
                if (b0Var != null) {
                    b0Var.b();
                }
                b0 a10 = w.a(gVar.C);
                a10.a(0.0f);
                gVar.F = a10;
                a10.d(new a());
            }
            e eVar = gVar.u;
            if (eVar != null) {
                eVar.e();
            }
            gVar.B = null;
            ViewGroup viewGroup = gVar.I;
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            w.h.c(viewGroup);
        }

        public final boolean d(h.a aVar, androidx.appcompat.view.menu.f fVar) {
            return this.f4357a.d(aVar, fVar);
        }
    }

    public class d extends h.h {
        public d(Window.Callback callback) {
            super(callback);
        }

        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return g.this.C(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
            if (r0 != false) goto L_0x0067;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0065, code lost:
            if (r7 != false) goto L_0x0067;
         */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x006d  */
        /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
            /*
                r6 = this;
                boolean r0 = super.dispatchKeyShortcutEvent(r7)
                r1 = 1
                if (r0 != 0) goto L_0x006e
                int r0 = r7.getKeyCode()
                e.g r2 = e.g.this
                r2.J()
                e.r r3 = r2.f4352v
                r4 = 0
                if (r3 == 0) goto L_0x003b
                e.r$d r3 = r3.f4422i
                if (r3 != 0) goto L_0x001a
                goto L_0x0037
            L_0x001a:
                androidx.appcompat.view.menu.f r3 = r3.f4440r
                if (r3 == 0) goto L_0x0037
                int r5 = r7.getDeviceId()
                android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
                int r5 = r5.getKeyboardType()
                if (r5 == r1) goto L_0x002e
                r5 = r1
                goto L_0x002f
            L_0x002e:
                r5 = r4
            L_0x002f:
                r3.setQwertyMode(r5)
                boolean r0 = r3.performShortcut(r0, r7, r4)
                goto L_0x0038
            L_0x0037:
                r0 = r4
            L_0x0038:
                if (r0 == 0) goto L_0x003b
                goto L_0x0067
            L_0x003b:
                e.g$i r0 = r2.U
                if (r0 == 0) goto L_0x0050
                int r3 = r7.getKeyCode()
                boolean r0 = r2.M(r0, r3, r7)
                if (r0 == 0) goto L_0x0050
                e.g$i r7 = r2.U
                if (r7 == 0) goto L_0x0067
                r7.l = r1
                goto L_0x0067
            L_0x0050:
                e.g$i r0 = r2.U
                if (r0 != 0) goto L_0x0069
                e.g$i r0 = r2.H(r4)
                r2.N(r0, r7)
                int r3 = r7.getKeyCode()
                boolean r7 = r2.M(r0, r3, r7)
                r0.f4375k = r4
                if (r7 == 0) goto L_0x0069
            L_0x0067:
                r7 = r1
                goto L_0x006a
            L_0x0069:
                r7 = r4
            L_0x006a:
                if (r7 == 0) goto L_0x006d
                goto L_0x006e
            L_0x006d:
                r1 = r4
            L_0x006e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: e.g.d.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        public final void onContentChanged() {
        }

        public final boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.f)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        public final View onCreatePanelView(int i10) {
            return super.onCreatePanelView(i10);
        }

        public final boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            g gVar = g.this;
            if (i10 == 108) {
                gVar.J();
                r rVar = gVar.f4352v;
                if (rVar != null) {
                    rVar.b(true);
                }
            } else {
                gVar.getClass();
            }
            return true;
        }

        public final void onPanelClosed(int i10, Menu menu) {
            super.onPanelClosed(i10, menu);
            g gVar = g.this;
            if (i10 == 108) {
                gVar.J();
                r rVar = gVar.f4352v;
                if (rVar != null) {
                    rVar.b(false);
                }
            } else if (i10 == 0) {
                i H = gVar.H(i10);
                if (H.f4376m) {
                    gVar.A(H, false);
                }
            } else {
                gVar.getClass();
            }
        }

        public final boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.f fVar;
            if (menu instanceof androidx.appcompat.view.menu.f) {
                fVar = (androidx.appcompat.view.menu.f) menu;
            } else {
                fVar = null;
            }
            if (i10 == 0 && fVar == null) {
                return false;
            }
            if (fVar != null) {
                fVar.f333x = true;
            }
            boolean onPreparePanel = super.onPreparePanel(i10, view, menu);
            if (fVar != null) {
                fVar.f333x = false;
            }
            return onPreparePanel;
        }

        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            androidx.appcompat.view.menu.f fVar = g.this.H(0).f4372h;
            if (fVar != null) {
                super.onProvideKeyboardShortcuts(list, fVar, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            }
        }

        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:68:0x017f, code lost:
            if (i0.w.g.c(r10) != false) goto L_0x0183;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r10, int r11) {
            /*
                r9 = this;
                e.g r0 = e.g.this
                boolean r1 = r0.G
                if (r1 == 0) goto L_0x01e8
                if (r11 == 0) goto L_0x000a
                goto L_0x01e8
            L_0x000a:
                h.e$a r11 = new h.e$a
                android.content.Context r1 = r0.f4349r
                r11.<init>(r1, r10)
                h.a r10 = r0.B
                if (r10 == 0) goto L_0x0018
                r10.c()
            L_0x0018:
                e.g$c r10 = new e.g$c
                r10.<init>(r11)
                r0.J()
                e.r r1 = r0.f4352v
                r2 = 0
                r3 = 1
                r4 = 0
                e.e r5 = r0.u
                if (r1 == 0) goto L_0x0073
                e.r$d r6 = r1.f4422i
                if (r6 == 0) goto L_0x0030
                r6.c()
            L_0x0030:
                androidx.appcompat.widget.ActionBarOverlayLayout r6 = r1.f4417c
                r6.setHideOnContentScrollEnabled(r2)
                androidx.appcompat.widget.ActionBarContextView r6 = r1.f4419f
                r6.h()
                e.r$d r6 = new e.r$d
                androidx.appcompat.widget.ActionBarContextView r7 = r1.f4419f
                android.content.Context r7 = r7.getContext()
                r6.<init>(r7, r10)
                androidx.appcompat.view.menu.f r7 = r6.f4440r
                r7.w()
                h.a$a r8 = r6.f4441s     // Catch:{ all -> 0x006e }
                boolean r8 = r8.d(r6, r7)     // Catch:{ all -> 0x006e }
                r7.v()
                if (r8 == 0) goto L_0x0063
                r1.f4422i = r6
                r6.i()
                androidx.appcompat.widget.ActionBarContextView r7 = r1.f4419f
                r7.f(r6)
                r1.a(r3)
                goto L_0x0064
            L_0x0063:
                r6 = r4
            L_0x0064:
                r0.B = r6
                if (r6 == 0) goto L_0x0073
                if (r5 == 0) goto L_0x0073
                r5.k()
                goto L_0x0073
            L_0x006e:
                r10 = move-exception
                r7.v()
                throw r10
            L_0x0073:
                h.a r1 = r0.B
                if (r1 != 0) goto L_0x01df
                i0.b0 r1 = r0.F
                if (r1 == 0) goto L_0x007e
                r1.b()
            L_0x007e:
                h.a r1 = r0.B
                if (r1 == 0) goto L_0x0085
                r1.c()
            L_0x0085:
                if (r5 == 0) goto L_0x008e
                boolean r1 = r0.Y
                if (r1 != 0) goto L_0x008e
                r5.o()     // Catch:{ AbstractMethodError -> 0x008e }
            L_0x008e:
                androidx.appcompat.widget.ActionBarContextView r1 = r0.C
                if (r1 != 0) goto L_0x0142
                boolean r1 = r0.Q
                android.content.Context r6 = r0.f4349r
                if (r1 == 0) goto L_0x0115
                android.util.TypedValue r1 = new android.util.TypedValue
                r1.<init>()
                android.content.res.Resources$Theme r7 = r6.getTheme()
                r8 = 2130968588(0x7f04000c, float:1.7545834E38)
                r7.resolveAttribute(r8, r1, r3)
                int r8 = r1.resourceId
                if (r8 == 0) goto L_0x00c8
                android.content.res.Resources r8 = r6.getResources()
                android.content.res.Resources$Theme r8 = r8.newTheme()
                r8.setTo(r7)
                int r7 = r1.resourceId
                r8.applyStyle(r7, r3)
                h.c r7 = new h.c
                r7.<init>((android.content.Context) r6, (int) r2)
                android.content.res.Resources$Theme r6 = r7.getTheme()
                r6.setTo(r8)
                r6 = r7
            L_0x00c8:
                androidx.appcompat.widget.ActionBarContextView r7 = new androidx.appcompat.widget.ActionBarContextView
                r7.<init>(r6, r4)
                r0.C = r7
                android.widget.PopupWindow r7 = new android.widget.PopupWindow
                r8 = 2130968603(0x7f04001b, float:1.7545864E38)
                r7.<init>(r6, r4, r8)
                r0.D = r7
                r8 = 2
                l0.f.d(r7, r8)
                android.widget.PopupWindow r7 = r0.D
                androidx.appcompat.widget.ActionBarContextView r8 = r0.C
                r7.setContentView(r8)
                android.widget.PopupWindow r7 = r0.D
                r8 = -1
                r7.setWidth(r8)
                android.content.res.Resources$Theme r7 = r6.getTheme()
                r8 = 2130968582(0x7f040006, float:1.7545822E38)
                r7.resolveAttribute(r8, r1, r3)
                int r1 = r1.data
                android.content.res.Resources r6 = r6.getResources()
                android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
                int r1 = android.util.TypedValue.complexToDimensionPixelSize(r1, r6)
                androidx.appcompat.widget.ActionBarContextView r6 = r0.C
                r6.setContentHeight(r1)
                android.widget.PopupWindow r1 = r0.D
                r6 = -2
                r1.setHeight(r6)
                e.j r1 = new e.j
                r1.<init>(r0)
                r0.E = r1
                goto L_0x0142
            L_0x0115:
                android.view.ViewGroup r1 = r0.I
                r7 = 2131361861(0x7f0a0045, float:1.8343486E38)
                android.view.View r1 = r1.findViewById(r7)
                androidx.appcompat.widget.ViewStubCompat r1 = (androidx.appcompat.widget.ViewStubCompat) r1
                if (r1 == 0) goto L_0x0142
                r0.J()
                e.r r7 = r0.f4352v
                if (r7 == 0) goto L_0x012e
                android.content.Context r7 = r7.c()
                goto L_0x012f
            L_0x012e:
                r7 = r4
            L_0x012f:
                if (r7 != 0) goto L_0x0132
                goto L_0x0133
            L_0x0132:
                r6 = r7
            L_0x0133:
                android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
                r1.setLayoutInflater(r6)
                android.view.View r1 = r1.a()
                androidx.appcompat.widget.ActionBarContextView r1 = (androidx.appcompat.widget.ActionBarContextView) r1
                r0.C = r1
            L_0x0142:
                androidx.appcompat.widget.ActionBarContextView r1 = r0.C
                if (r1 == 0) goto L_0x01d2
                i0.b0 r1 = r0.F
                if (r1 == 0) goto L_0x014d
                r1.b()
            L_0x014d:
                androidx.appcompat.widget.ActionBarContextView r1 = r0.C
                r1.h()
                h.d r1 = new h.d
                androidx.appcompat.widget.ActionBarContextView r6 = r0.C
                android.content.Context r6 = r6.getContext()
                androidx.appcompat.widget.ActionBarContextView r7 = r0.C
                r1.<init>(r6, r7, r10)
                androidx.appcompat.view.menu.f r6 = r1.f5067v
                boolean r10 = r10.d(r1, r6)
                if (r10 == 0) goto L_0x01d0
                r1.i()
                androidx.appcompat.widget.ActionBarContextView r10 = r0.C
                r10.f(r1)
                r0.B = r1
                boolean r10 = r0.H
                if (r10 == 0) goto L_0x0182
                android.view.ViewGroup r10 = r0.I
                if (r10 == 0) goto L_0x0182
                java.util.WeakHashMap<android.view.View, i0.b0> r1 = i0.w.f6004a
                boolean r10 = i0.w.g.c(r10)
                if (r10 == 0) goto L_0x0182
                goto L_0x0183
            L_0x0182:
                r3 = r2
            L_0x0183:
                androidx.appcompat.widget.ActionBarContextView r10 = r0.C
                r1 = 1065353216(0x3f800000, float:1.0)
                if (r3 == 0) goto L_0x01a1
                r2 = 0
                r10.setAlpha(r2)
                androidx.appcompat.widget.ActionBarContextView r10 = r0.C
                i0.b0 r10 = i0.w.a(r10)
                r10.a(r1)
                r0.F = r10
                e.k r1 = new e.k
                r1.<init>(r0)
                r10.d(r1)
                goto L_0x01c0
            L_0x01a1:
                r10.setAlpha(r1)
                androidx.appcompat.widget.ActionBarContextView r10 = r0.C
                r10.setVisibility(r2)
                androidx.appcompat.widget.ActionBarContextView r10 = r0.C
                android.view.ViewParent r10 = r10.getParent()
                boolean r10 = r10 instanceof android.view.View
                if (r10 == 0) goto L_0x01c0
                androidx.appcompat.widget.ActionBarContextView r10 = r0.C
                android.view.ViewParent r10 = r10.getParent()
                android.view.View r10 = (android.view.View) r10
                java.util.WeakHashMap<android.view.View, i0.b0> r1 = i0.w.f6004a
                i0.w.h.c(r10)
            L_0x01c0:
                android.widget.PopupWindow r10 = r0.D
                if (r10 == 0) goto L_0x01d2
                android.view.Window r10 = r0.f4350s
                android.view.View r10 = r10.getDecorView()
                e.j r1 = r0.E
                r10.post(r1)
                goto L_0x01d2
            L_0x01d0:
                r0.B = r4
            L_0x01d2:
                h.a r10 = r0.B
                if (r10 == 0) goto L_0x01db
                if (r5 == 0) goto L_0x01db
                r5.k()
            L_0x01db:
                h.a r10 = r0.B
                r0.B = r10
            L_0x01df:
                h.a r10 = r0.B
                if (r10 == 0) goto L_0x01e7
                h.e r4 = r11.e(r10)
            L_0x01e7:
                return r4
            L_0x01e8:
                android.view.ActionMode r10 = super.onWindowStartingActionMode(r10, r11)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: e.g.d.onWindowStartingActionMode(android.view.ActionMode$Callback, int):android.view.ActionMode");
        }
    }

    public class e extends f {

        /* renamed from: c  reason: collision with root package name */
        public final PowerManager f4361c;

        public e(Context context) {
            super();
            this.f4361c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        public final int c() {
            return this.f4361c.isPowerSaveMode() ? 2 : 1;
        }

        public final void d() {
            g.this.w(true);
        }
    }

    public abstract class f {

        /* renamed from: a  reason: collision with root package name */
        public a f4362a;

        public class a extends BroadcastReceiver {
            public a() {
            }

            public final void onReceive(Context context, Intent intent) {
                f.this.d();
            }
        }

        public f() {
        }

        public final void a() {
            a aVar = this.f4362a;
            if (aVar != null) {
                try {
                    g.this.f4349r.unregisterReceiver(aVar);
                } catch (IllegalArgumentException unused) {
                }
                this.f4362a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public final void e() {
            a();
            IntentFilter b10 = b();
            if (b10 != null && b10.countActions() != 0) {
                if (this.f4362a == null) {
                    this.f4362a = new a();
                }
                g.this.f4349r.registerReceiver(this.f4362a, b10);
            }
        }
    }

    /* renamed from: e.g$g  reason: collision with other inner class name */
    public class C0053g extends f {

        /* renamed from: c  reason: collision with root package name */
        public final q f4365c;

        public C0053g(q qVar) {
            super();
            this.f4365c = qVar;
        }

        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        public final int c() {
            boolean z;
            boolean z10;
            Location location;
            long j8;
            long j10;
            Location location2;
            q qVar = this.f4365c;
            q.a aVar = qVar.f4412c;
            boolean z11 = false;
            if (aVar.f4414b > System.currentTimeMillis()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z10 = aVar.f4413a;
            } else {
                Context context = qVar.f4410a;
                int q10 = s6.a.q(context, "android.permission.ACCESS_COARSE_LOCATION");
                Location location3 = null;
                LocationManager locationManager = qVar.f4411b;
                if (q10 == 0) {
                    try {
                        if (locationManager.isProviderEnabled("network")) {
                            location2 = locationManager.getLastKnownLocation("network");
                            location = location2;
                        }
                    } catch (Exception e10) {
                        Log.d("TwilightManager", "Failed to get last known location", e10);
                    }
                    location2 = null;
                    location = location2;
                } else {
                    location = null;
                }
                if (s6.a.q(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    try {
                        if (locationManager.isProviderEnabled("gps")) {
                            location3 = locationManager.getLastKnownLocation("gps");
                        }
                    } catch (Exception e11) {
                        Log.d("TwilightManager", "Failed to get last known location", e11);
                    }
                }
                if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                    location = location3;
                }
                if (location != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (p.d == null) {
                        p.d = new p();
                    }
                    p pVar = p.d;
                    p pVar2 = pVar;
                    pVar2.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                    pVar2.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                    if (pVar.f4409c == 1) {
                        z11 = true;
                    }
                    long j11 = pVar.f4408b;
                    long j12 = pVar.f4407a;
                    long j13 = j11;
                    pVar.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
                    long j14 = pVar.f4408b;
                    if (j13 == -1 || j12 == -1) {
                        j8 = 43200000 + currentTimeMillis;
                    } else {
                        if (currentTimeMillis > j12) {
                            j10 = j14 + 0;
                        } else if (currentTimeMillis > j13) {
                            j10 = j12 + 0;
                        } else {
                            j10 = j13 + 0;
                        }
                        j8 = j10 + 60000;
                    }
                    aVar.f4413a = z11;
                    aVar.f4414b = j8;
                } else {
                    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                    int i10 = Calendar.getInstance().get(11);
                    if (i10 < 6 || i10 >= 22) {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                return 2;
            }
            return 1;
        }

        public final void d() {
            g.this.w(true);
        }
    }

    public class h extends ContentFrameLayout {
        public h(h.c cVar) {
            super(cVar, (AttributeSet) null);
        }

        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return g.this.C(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            boolean z;
            if (motionEvent.getAction() == 0) {
                int x10 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                if (x10 < -5 || y10 < -5 || x10 > getWidth() + 5 || y10 > getHeight() + 5) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    g gVar = g.this;
                    gVar.A(gVar.H(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        public final void setBackgroundResource(int i10) {
            setBackgroundDrawable(f.a.b(getContext(), i10));
        }
    }

    public static final class i {

        /* renamed from: a  reason: collision with root package name */
        public final int f4366a;

        /* renamed from: b  reason: collision with root package name */
        public int f4367b;

        /* renamed from: c  reason: collision with root package name */
        public int f4368c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public h f4369e;

        /* renamed from: f  reason: collision with root package name */
        public View f4370f;

        /* renamed from: g  reason: collision with root package name */
        public View f4371g;

        /* renamed from: h  reason: collision with root package name */
        public androidx.appcompat.view.menu.f f4372h;

        /* renamed from: i  reason: collision with root package name */
        public androidx.appcompat.view.menu.d f4373i;

        /* renamed from: j  reason: collision with root package name */
        public h.c f4374j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f4375k;
        public boolean l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f4376m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f4377n = false;

        /* renamed from: o  reason: collision with root package name */
        public boolean f4378o;

        /* renamed from: p  reason: collision with root package name */
        public Bundle f4379p;

        public i(int i10) {
            this.f4366a = i10;
        }
    }

    public final class j implements j.a {
        public j() {
        }

        public final void b(androidx.appcompat.view.menu.f fVar, boolean z) {
            boolean z10;
            int i10;
            i iVar;
            androidx.appcompat.view.menu.f k10 = fVar.k();
            int i11 = 0;
            if (k10 != fVar) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                fVar = k10;
            }
            g gVar = g.this;
            i[] iVarArr = gVar.T;
            if (iVarArr != null) {
                i10 = iVarArr.length;
            } else {
                i10 = 0;
            }
            while (true) {
                if (i11 < i10) {
                    iVar = iVarArr[i11];
                    if (iVar != null && iVar.f4372h == fVar) {
                        break;
                    }
                    i11++;
                } else {
                    iVar = null;
                    break;
                }
            }
            if (iVar == null) {
                return;
            }
            if (z10) {
                gVar.y(iVar.f4366a, iVar, k10);
                gVar.A(iVar, true);
                return;
            }
            gVar.A(iVar, z);
        }

        public final boolean c(androidx.appcompat.view.menu.f fVar) {
            Window.Callback I;
            if (fVar != fVar.k()) {
                return true;
            }
            g gVar = g.this;
            if (!gVar.N || (I = gVar.I()) == null || gVar.Y) {
                return true;
            }
            I.onMenuOpened(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, fVar);
            return true;
        }
    }

    public g(Context context, Window window, e eVar, Object obj) {
        n.i<String, Integer> iVar;
        Integer orDefault;
        d dVar;
        this.f4349r = context;
        this.u = eVar;
        this.f4348q = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof d)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        dVar = (d) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            dVar = null;
            if (dVar != null) {
                this.f4335a0 = dVar.z().f();
            }
        }
        if (this.f4335a0 == -100 && (orDefault = iVar.getOrDefault(this.f4348q.getClass().getName(), null)) != null) {
            this.f4335a0 = orDefault.intValue();
            (iVar = f4331n0).remove(this.f4348q.getClass().getName());
        }
        if (window != null) {
            x(window);
        }
        k.d();
    }

    public static Configuration B(Context context, int i10, Configuration configuration) {
        int i11 = i10 != 1 ? i10 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & -49);
        return configuration2;
    }

    public final void A(i iVar, boolean z10) {
        h hVar;
        i0 i0Var;
        if (!z10 || iVar.f4366a != 0 || (i0Var = this.f4354y) == null || !i0Var.a()) {
            WindowManager windowManager = (WindowManager) this.f4349r.getSystemService("window");
            if (!(windowManager == null || !iVar.f4376m || (hVar = iVar.f4369e) == null)) {
                windowManager.removeView(hVar);
                if (z10) {
                    y(iVar.f4366a, iVar, (androidx.appcompat.view.menu.f) null);
                }
            }
            iVar.f4375k = false;
            iVar.l = false;
            iVar.f4376m = false;
            iVar.f4370f = null;
            iVar.f4377n = true;
            if (this.U == iVar) {
                this.U = null;
                return;
            }
            return;
        }
        z(iVar.f4372h);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0120, code lost:
        if (r7 != false) goto L_0x0122;
     */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean C(android.view.KeyEvent r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f4348q
            boolean r1 = r0 instanceof i0.g.a
            r2 = 1
            if (r1 != 0) goto L_0x000b
            boolean r0 = r0 instanceof e.l
            if (r0 == 0) goto L_0x001a
        L_0x000b:
            android.view.Window r0 = r6.f4350s
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x001a
            boolean r0 = i0.g.a(r0, r7)
            if (r0 == 0) goto L_0x001a
            return r2
        L_0x001a:
            int r0 = r7.getKeyCode()
            r1 = 82
            if (r0 != r1) goto L_0x002d
            e.g$d r0 = r6.f4351t
            android.view.Window$Callback r0 = r0.f5108o
            boolean r0 = r0.dispatchKeyEvent(r7)
            if (r0 == 0) goto L_0x002d
            return r2
        L_0x002d:
            int r0 = r7.getKeyCode()
            int r3 = r7.getAction()
            r4 = 0
            if (r3 != 0) goto L_0x003a
            r3 = r2
            goto L_0x003b
        L_0x003a:
            r3 = r4
        L_0x003b:
            r5 = 4
            if (r3 == 0) goto L_0x0065
            if (r0 == r5) goto L_0x0057
            if (r0 == r1) goto L_0x0044
            goto L_0x0128
        L_0x0044:
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L_0x0129
            e.g$i r0 = r6.H(r4)
            boolean r1 = r0.f4376m
            if (r1 != 0) goto L_0x0129
            r6.N(r0, r7)
            goto L_0x0129
        L_0x0057:
            int r7 = r7.getFlags()
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r2 = r4
        L_0x0061:
            r6.V = r2
            goto L_0x0128
        L_0x0065:
            if (r0 == r5) goto L_0x00ed
            if (r0 == r1) goto L_0x006b
            goto L_0x0128
        L_0x006b:
            h.a r0 = r6.B
            if (r0 == 0) goto L_0x0071
            goto L_0x0129
        L_0x0071:
            e.g$i r0 = r6.H(r4)
            androidx.appcompat.widget.i0 r1 = r6.f4354y
            android.content.Context r3 = r6.f4349r
            if (r1 == 0) goto L_0x00ab
            boolean r1 = r1.h()
            if (r1 == 0) goto L_0x00ab
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r3)
            boolean r1 = r1.hasPermanentMenuKey()
            if (r1 != 0) goto L_0x00ab
            androidx.appcompat.widget.i0 r1 = r6.f4354y
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x00a4
            boolean r1 = r6.Y
            if (r1 != 0) goto L_0x00cb
            boolean r7 = r6.N(r0, r7)
            if (r7 == 0) goto L_0x00cb
            androidx.appcompat.widget.i0 r7 = r6.f4354y
            boolean r7 = r7.f()
            goto L_0x00d1
        L_0x00a4:
            androidx.appcompat.widget.i0 r7 = r6.f4354y
            boolean r7 = r7.e()
            goto L_0x00d1
        L_0x00ab:
            boolean r1 = r0.f4376m
            if (r1 != 0) goto L_0x00cd
            boolean r5 = r0.l
            if (r5 == 0) goto L_0x00b4
            goto L_0x00cd
        L_0x00b4:
            boolean r1 = r0.f4375k
            if (r1 == 0) goto L_0x00cb
            boolean r1 = r0.f4378o
            if (r1 == 0) goto L_0x00c3
            r0.f4375k = r4
            boolean r1 = r6.N(r0, r7)
            goto L_0x00c4
        L_0x00c3:
            r1 = r2
        L_0x00c4:
            if (r1 == 0) goto L_0x00cb
            r6.L(r0, r7)
            r7 = r2
            goto L_0x00d1
        L_0x00cb:
            r7 = r4
            goto L_0x00d1
        L_0x00cd:
            r6.A(r0, r2)
            r7 = r1
        L_0x00d1:
            if (r7 == 0) goto L_0x0129
            android.content.Context r7 = r3.getApplicationContext()
            java.lang.String r0 = "audio"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.media.AudioManager r7 = (android.media.AudioManager) r7
            if (r7 == 0) goto L_0x00e5
            r7.playSoundEffect(r4)
            goto L_0x0129
        L_0x00e5:
            java.lang.String r7 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r7, r0)
            goto L_0x0129
        L_0x00ed:
            boolean r7 = r6.V
            r6.V = r4
            e.g$i r0 = r6.H(r4)
            boolean r1 = r0.f4376m
            if (r1 == 0) goto L_0x00ff
            if (r7 != 0) goto L_0x0129
            r6.A(r0, r2)
            goto L_0x0129
        L_0x00ff:
            h.a r7 = r6.B
            if (r7 == 0) goto L_0x0107
            r7.c()
            goto L_0x0122
        L_0x0107:
            r6.J()
            e.r r7 = r6.f4352v
            if (r7 == 0) goto L_0x0124
            androidx.appcompat.widget.j0 r0 = r7.f4418e
            if (r0 == 0) goto L_0x011f
            boolean r0 = r0.l()
            if (r0 == 0) goto L_0x011f
            androidx.appcompat.widget.j0 r7 = r7.f4418e
            r7.collapseActionView()
            r7 = r2
            goto L_0x0120
        L_0x011f:
            r7 = r4
        L_0x0120:
            if (r7 == 0) goto L_0x0124
        L_0x0122:
            r7 = r2
            goto L_0x0125
        L_0x0124:
            r7 = r4
        L_0x0125:
            if (r7 == 0) goto L_0x0128
            goto L_0x0129
        L_0x0128:
            r2 = r4
        L_0x0129:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e.g.C(android.view.KeyEvent):boolean");
    }

    public final void D(int i10) {
        i H2 = H(i10);
        if (H2.f4372h != null) {
            Bundle bundle = new Bundle();
            H2.f4372h.t(bundle);
            if (bundle.size() > 0) {
                H2.f4379p = bundle;
            }
            H2.f4372h.w();
            H2.f4372h.clear();
        }
        H2.f4378o = true;
        H2.f4377n = true;
        if ((i10 == 108 || i10 == 0) && this.f4354y != null) {
            i H3 = H(0);
            H3.f4375k = false;
            N(H3, (KeyEvent) null);
        }
    }

    public final void E() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        int i10;
        Context context;
        if (!this.H) {
            int[] iArr = androidx.databinding.a.I;
            Context context2 = this.f4349r;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(R.styleable.AppCompatTheme_windowActionBar)) {
                if (obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_windowNoTitle, false)) {
                    q(1);
                } else if (obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_windowActionBar, false)) {
                    q(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
                }
                if (obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_windowActionBarOverlay, false)) {
                    q(R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu);
                }
                if (obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_windowActionModeOverlay, false)) {
                    q(10);
                }
                this.Q = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                F();
                this.f4350s.getDecorView();
                LayoutInflater from = LayoutInflater.from(context2);
                if (this.R) {
                    if (this.P) {
                        i10 = R.layout.abc_screen_simple_overlay_action_mode;
                    } else {
                        i10 = R.layout.abc_screen_simple;
                    }
                    viewGroup = (ViewGroup) from.inflate(i10, (ViewGroup) null);
                } else if (this.Q) {
                    viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                    this.O = false;
                    this.N = false;
                } else if (this.N) {
                    TypedValue typedValue = new TypedValue();
                    context2.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new h.c(context2, typedValue.resourceId);
                    } else {
                        context = context2;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                    i0 i0Var = (i0) viewGroup.findViewById(R.id.decor_content_parent);
                    this.f4354y = i0Var;
                    i0Var.setWindowCallback(I());
                    if (this.O) {
                        this.f4354y.k(R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu);
                    }
                    if (this.L) {
                        this.f4354y.k(2);
                    }
                    if (this.M) {
                        this.f4354y.k(5);
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    h hVar = new h(this);
                    WeakHashMap<View, b0> weakHashMap = w.f6004a;
                    w.i.u(viewGroup, hVar);
                    if (this.f4354y == null) {
                        this.J = (TextView) viewGroup.findViewById(R.id.title);
                    }
                    Method method = m1.f654a;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, new Object[0]);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (IllegalAccessException | InvocationTargetException e10) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f4350s.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                        }
                    }
                    this.f4350s.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new i(this));
                    this.I = viewGroup;
                    Object obj = this.f4348q;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.f4353x;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        i0 i0Var2 = this.f4354y;
                        if (i0Var2 != null) {
                            i0Var2.setWindowTitle(charSequence);
                        } else {
                            r rVar = this.f4352v;
                            if (rVar != null) {
                                rVar.f4418e.setWindowTitle(charSequence);
                            } else {
                                TextView textView = this.J;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.I.findViewById(16908290);
                    View decorView = this.f4350s.getDecorView();
                    contentFrameLayout2.u.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap<View, b0> weakHashMap2 = w.f6004a;
                    if (w.g.c(contentFrameLayout2)) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(iArr);
                    obtainStyledAttributes2.getValue(R.styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(R.styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(R.styleable.AppCompatTheme_windowFixedWidthMajor)) {
                        obtainStyledAttributes2.getValue(R.styleable.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(R.styleable.AppCompatTheme_windowFixedWidthMinor)) {
                        obtainStyledAttributes2.getValue(R.styleable.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(R.styleable.AppCompatTheme_windowFixedHeightMajor)) {
                        obtainStyledAttributes2.getValue(R.styleable.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(R.styleable.AppCompatTheme_windowFixedHeightMinor)) {
                        obtainStyledAttributes2.getValue(R.styleable.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.H = true;
                    i H2 = H(0);
                    if (!this.Y && H2.f4372h == null) {
                        this.f4342h0 |= 4096;
                        if (!this.f4341g0) {
                            w.d.m(this.f4350s.getDecorView(), this.f4343i0);
                            this.f4341g0 = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.N + ", windowActionBarOverlay: " + this.O + ", android:windowIsFloating: " + this.Q + ", windowActionModeOverlay: " + this.P + ", windowNoTitle: " + this.R + " }");
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void F() {
        if (this.f4350s == null) {
            Object obj = this.f4348q;
            if (obj instanceof Activity) {
                x(((Activity) obj).getWindow());
            }
        }
        if (this.f4350s == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final f G(Context context) {
        if (this.f4339e0 == null) {
            if (q.d == null) {
                Context applicationContext = context.getApplicationContext();
                q.d = new q(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f4339e0 = new C0053g(q.d);
        }
        return this.f4339e0;
    }

    public final i H(int i10) {
        i[] iVarArr = this.T;
        if (iVarArr == null || iVarArr.length <= i10) {
            i[] iVarArr2 = new i[(i10 + 1)];
            if (iVarArr != null) {
                System.arraycopy(iVarArr, 0, iVarArr2, 0, iVarArr.length);
            }
            this.T = iVarArr2;
            iVarArr = iVarArr2;
        }
        i iVar = iVarArr[i10];
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(i10);
        iVarArr[i10] = iVar2;
        return iVar2;
    }

    public final Window.Callback I() {
        return this.f4350s.getCallback();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void J() {
        /*
            r5 = this;
            r5.E()
            boolean r0 = r5.N
            if (r0 == 0) goto L_0x004b
            e.r r0 = r5.f4352v
            if (r0 == 0) goto L_0x000c
            goto L_0x004b
        L_0x000c:
            java.lang.Object r0 = r5.f4348q
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x001c
            e.r r1 = new e.r
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r2 = r5.O
            r1.<init>(r0, r2)
            goto L_0x0027
        L_0x001c:
            boolean r1 = r0 instanceof android.app.Dialog
            if (r1 == 0) goto L_0x0029
            e.r r1 = new e.r
            android.app.Dialog r0 = (android.app.Dialog) r0
            r1.<init>(r0)
        L_0x0027:
            r5.f4352v = r1
        L_0x0029:
            e.r r0 = r5.f4352v
            if (r0 == 0) goto L_0x004b
            boolean r1 = r5.f4344j0
            boolean r2 = r0.f4421h
            if (r2 != 0) goto L_0x004b
            r2 = 4
            if (r1 == 0) goto L_0x0038
            r1 = r2
            goto L_0x0039
        L_0x0038:
            r1 = 0
        L_0x0039:
            androidx.appcompat.widget.j0 r3 = r0.f4418e
            int r3 = r3.o()
            r4 = 1
            r0.f4421h = r4
            androidx.appcompat.widget.j0 r0 = r0.f4418e
            r1 = r1 & r2
            r2 = r3 & -5
            r1 = r1 | r2
            r0.m(r1)
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.g.J():void");
    }

    public final int K(Context context, int i10) {
        f fVar;
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 != 0) {
                if (!(i10 == 1 || i10 == 2)) {
                    if (i10 == 3) {
                        if (this.f4340f0 == null) {
                            this.f4340f0 = new e(context);
                        }
                        fVar = this.f4340f0;
                    } else {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                fVar = G(context);
            }
            return fVar.c();
        }
        return i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x014d, code lost:
        if (r15 != null) goto L_0x014f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0171, code lost:
        if (r15.f304t.getCount() > 0) goto L_0x0173;
     */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0179  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void L(e.g.i r14, android.view.KeyEvent r15) {
        /*
            r13 = this;
            boolean r0 = r14.f4376m
            if (r0 != 0) goto L_0x01d5
            boolean r0 = r13.Y
            if (r0 == 0) goto L_0x000a
            goto L_0x01d5
        L_0x000a:
            android.content.Context r0 = r13.f4349r
            r1 = 0
            r2 = 1
            int r3 = r14.f4366a
            if (r3 != 0) goto L_0x0027
            android.content.res.Resources r4 = r0.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.screenLayout
            r4 = r4 & 15
            r5 = 4
            if (r4 != r5) goto L_0x0023
            r4 = r2
            goto L_0x0024
        L_0x0023:
            r4 = r1
        L_0x0024:
            if (r4 == 0) goto L_0x0027
            return
        L_0x0027:
            android.view.Window$Callback r4 = r13.I()
            if (r4 == 0) goto L_0x0039
            androidx.appcompat.view.menu.f r5 = r14.f4372h
            boolean r3 = r4.onMenuOpened(r3, r5)
            if (r3 != 0) goto L_0x0039
            r13.A(r14, r2)
            return
        L_0x0039:
            java.lang.String r3 = "window"
            java.lang.Object r3 = r0.getSystemService(r3)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            if (r3 != 0) goto L_0x0044
            return
        L_0x0044:
            boolean r15 = r13.N(r14, r15)
            if (r15 != 0) goto L_0x004b
            return
        L_0x004b:
            e.g$h r15 = r14.f4369e
            r4 = -2
            if (r15 == 0) goto L_0x0067
            boolean r5 = r14.f4377n
            if (r5 == 0) goto L_0x0055
            goto L_0x0067
        L_0x0055:
            android.view.View r15 = r14.f4371g
            if (r15 == 0) goto L_0x01b2
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            if (r15 == 0) goto L_0x01b2
            int r15 = r15.width
            r0 = -1
            if (r15 != r0) goto L_0x01b2
            r6 = r0
            goto L_0x01b3
        L_0x0067:
            if (r15 != 0) goto L_0x00df
            r13.J()
            e.r r15 = r13.f4352v
            if (r15 == 0) goto L_0x0075
            android.content.Context r15 = r15.c()
            goto L_0x0076
        L_0x0075:
            r15 = 0
        L_0x0076:
            if (r15 != 0) goto L_0x0079
            goto L_0x007a
        L_0x0079:
            r0 = r15
        L_0x007a:
            android.util.TypedValue r15 = new android.util.TypedValue
            r15.<init>()
            android.content.res.Resources r5 = r0.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            android.content.res.Resources$Theme r6 = r0.getTheme()
            r5.setTo(r6)
            r6 = 2130968581(0x7f040005, float:1.754582E38)
            r5.resolveAttribute(r6, r15, r2)
            int r6 = r15.resourceId
            if (r6 == 0) goto L_0x009b
            r5.applyStyle(r6, r2)
        L_0x009b:
            r6 = 2130969347(0x7f040303, float:1.7547373E38)
            r5.resolveAttribute(r6, r15, r2)
            int r15 = r15.resourceId
            if (r15 == 0) goto L_0x00a6
            goto L_0x00a9
        L_0x00a6:
            r15 = 2131952023(0x7f130197, float:1.9540477E38)
        L_0x00a9:
            r5.applyStyle(r15, r2)
            h.c r15 = new h.c
            r15.<init>((android.content.Context) r0, (int) r1)
            android.content.res.Resources$Theme r0 = r15.getTheme()
            r0.setTo(r5)
            r14.f4374j = r15
            int[] r0 = androidx.databinding.a.I
            android.content.res.TypedArray r15 = r15.obtainStyledAttributes(r0)
            r0 = 86
            int r0 = r15.getResourceId(r0, r1)
            r14.f4367b = r0
            int r0 = r15.getResourceId(r2, r1)
            r14.d = r0
            r15.recycle()
            e.g$h r15 = new e.g$h
            h.c r0 = r14.f4374j
            r15.<init>(r0)
            r14.f4369e = r15
            r15 = 81
            r14.f4368c = r15
            goto L_0x00ee
        L_0x00df:
            boolean r0 = r14.f4377n
            if (r0 == 0) goto L_0x00ee
            int r15 = r15.getChildCount()
            if (r15 <= 0) goto L_0x00ee
            e.g$h r15 = r14.f4369e
            r15.removeAllViews()
        L_0x00ee:
            android.view.View r15 = r14.f4371g
            if (r15 == 0) goto L_0x00f5
            r14.f4370f = r15
            goto L_0x014f
        L_0x00f5:
            androidx.appcompat.view.menu.f r15 = r14.f4372h
            if (r15 != 0) goto L_0x00fa
            goto L_0x0151
        L_0x00fa:
            e.g$j r15 = r13.A
            if (r15 != 0) goto L_0x0105
            e.g$j r15 = new e.g$j
            r15.<init>()
            r13.A = r15
        L_0x0105:
            e.g$j r15 = r13.A
            androidx.appcompat.view.menu.d r0 = r14.f4373i
            if (r0 != 0) goto L_0x011d
            androidx.appcompat.view.menu.d r0 = new androidx.appcompat.view.menu.d
            h.c r5 = r14.f4374j
            r0.<init>(r5)
            r14.f4373i = r0
            r0.f303s = r15
            androidx.appcompat.view.menu.f r15 = r14.f4372h
            android.content.Context r5 = r15.f314a
            r15.b(r0, r5)
        L_0x011d:
            androidx.appcompat.view.menu.d r15 = r14.f4373i
            e.g$h r0 = r14.f4369e
            androidx.appcompat.view.menu.ExpandedMenuView r5 = r15.f302r
            if (r5 != 0) goto L_0x0149
            android.view.LayoutInflater r5 = r15.f300p
            r6 = 2131558413(0x7f0d000d, float:1.8742141E38)
            android.view.View r0 = r5.inflate(r6, r0, r1)
            androidx.appcompat.view.menu.ExpandedMenuView r0 = (androidx.appcompat.view.menu.ExpandedMenuView) r0
            r15.f302r = r0
            androidx.appcompat.view.menu.d$a r0 = r15.f304t
            if (r0 != 0) goto L_0x013d
            androidx.appcompat.view.menu.d$a r0 = new androidx.appcompat.view.menu.d$a
            r0.<init>()
            r15.f304t = r0
        L_0x013d:
            androidx.appcompat.view.menu.ExpandedMenuView r0 = r15.f302r
            androidx.appcompat.view.menu.d$a r5 = r15.f304t
            r0.setAdapter(r5)
            androidx.appcompat.view.menu.ExpandedMenuView r0 = r15.f302r
            r0.setOnItemClickListener(r15)
        L_0x0149:
            androidx.appcompat.view.menu.ExpandedMenuView r15 = r15.f302r
            r14.f4370f = r15
            if (r15 == 0) goto L_0x0151
        L_0x014f:
            r15 = r2
            goto L_0x0152
        L_0x0151:
            r15 = r1
        L_0x0152:
            if (r15 == 0) goto L_0x01d3
            android.view.View r15 = r14.f4370f
            if (r15 != 0) goto L_0x0159
            goto L_0x0175
        L_0x0159:
            android.view.View r15 = r14.f4371g
            if (r15 == 0) goto L_0x015e
            goto L_0x0173
        L_0x015e:
            androidx.appcompat.view.menu.d r15 = r14.f4373i
            androidx.appcompat.view.menu.d$a r0 = r15.f304t
            if (r0 != 0) goto L_0x016b
            androidx.appcompat.view.menu.d$a r0 = new androidx.appcompat.view.menu.d$a
            r0.<init>()
            r15.f304t = r0
        L_0x016b:
            androidx.appcompat.view.menu.d$a r15 = r15.f304t
            int r15 = r15.getCount()
            if (r15 <= 0) goto L_0x0175
        L_0x0173:
            r15 = r2
            goto L_0x0176
        L_0x0175:
            r15 = r1
        L_0x0176:
            if (r15 != 0) goto L_0x0179
            goto L_0x01d3
        L_0x0179:
            android.view.View r15 = r14.f4370f
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            if (r15 != 0) goto L_0x0186
            android.view.ViewGroup$LayoutParams r15 = new android.view.ViewGroup$LayoutParams
            r15.<init>(r4, r4)
        L_0x0186:
            int r0 = r14.f4367b
            e.g$h r5 = r14.f4369e
            r5.setBackgroundResource(r0)
            android.view.View r0 = r14.f4370f
            android.view.ViewParent r0 = r0.getParent()
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x019e
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r5 = r14.f4370f
            r0.removeView(r5)
        L_0x019e:
            e.g$h r0 = r14.f4369e
            android.view.View r5 = r14.f4370f
            r0.addView(r5, r15)
            android.view.View r15 = r14.f4370f
            boolean r15 = r15.hasFocus()
            if (r15 != 0) goto L_0x01b2
            android.view.View r15 = r14.f4370f
            r15.requestFocus()
        L_0x01b2:
            r6 = r4
        L_0x01b3:
            r14.l = r1
            android.view.WindowManager$LayoutParams r15 = new android.view.WindowManager$LayoutParams
            r7 = -2
            r8 = 0
            r9 = 0
            r10 = 1002(0x3ea, float:1.404E-42)
            r11 = 8519680(0x820000, float:1.1938615E-38)
            r12 = -3
            r5 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            int r0 = r14.f4368c
            r15.gravity = r0
            int r0 = r14.d
            r15.windowAnimations = r0
            e.g$h r0 = r14.f4369e
            r3.addView(r0, r15)
            r14.f4376m = r2
            return
        L_0x01d3:
            r14.f4377n = r2
        L_0x01d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.g.L(e.g$i, android.view.KeyEvent):void");
    }

    public final boolean M(i iVar, int i10, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.f fVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((iVar.f4375k || N(iVar, keyEvent)) && (fVar = iVar.f4372h) != null) {
            return fVar.performShortcut(i10, keyEvent, 1);
        }
        return false;
    }

    public final boolean N(i iVar, KeyEvent keyEvent) {
        boolean z10;
        int i10;
        boolean z11;
        i0 i0Var;
        i0 i0Var2;
        i0 i0Var3;
        Resources.Theme theme;
        i0 i0Var4;
        if (this.Y) {
            return false;
        }
        if (iVar.f4375k) {
            return true;
        }
        i iVar2 = this.U;
        if (!(iVar2 == null || iVar2 == iVar)) {
            A(iVar2, false);
        }
        Window.Callback I2 = I();
        int i11 = iVar.f4366a;
        if (I2 != null) {
            iVar.f4371g = I2.onCreatePanelView(i11);
        }
        if (i11 == 0 || i11 == 108) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (i0Var4 = this.f4354y) != null) {
            i0Var4.c();
        }
        if (iVar.f4371g == null) {
            androidx.appcompat.view.menu.f fVar = iVar.f4372h;
            if (fVar == null || iVar.f4378o) {
                if (fVar == null) {
                    Context context = this.f4349r;
                    if ((i11 == 0 || i11 == 108) && this.f4354y != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            h.c cVar = new h.c(context, 0);
                            cVar.getTheme().setTo(theme);
                            context = cVar;
                        }
                    }
                    androidx.appcompat.view.menu.f fVar2 = new androidx.appcompat.view.menu.f(context);
                    fVar2.f317e = this;
                    androidx.appcompat.view.menu.f fVar3 = iVar.f4372h;
                    if (fVar2 != fVar3) {
                        if (fVar3 != null) {
                            fVar3.r(iVar.f4373i);
                        }
                        iVar.f4372h = fVar2;
                        androidx.appcompat.view.menu.d dVar = iVar.f4373i;
                        if (dVar != null) {
                            fVar2.b(dVar, fVar2.f314a);
                        }
                    }
                    if (iVar.f4372h == null) {
                        return false;
                    }
                }
                if (z10 && (i0Var3 = this.f4354y) != null) {
                    if (this.z == null) {
                        this.z = new b();
                    }
                    i0Var3.g(iVar.f4372h, this.z);
                }
                iVar.f4372h.w();
                if (!I2.onCreatePanelMenu(i11, iVar.f4372h)) {
                    androidx.appcompat.view.menu.f fVar4 = iVar.f4372h;
                    if (fVar4 != null) {
                        if (fVar4 != null) {
                            fVar4.r(iVar.f4373i);
                        }
                        iVar.f4372h = null;
                    }
                    if (z10 && (i0Var2 = this.f4354y) != null) {
                        i0Var2.g((androidx.appcompat.view.menu.f) null, this.z);
                    }
                    return false;
                }
                iVar.f4378o = false;
            }
            iVar.f4372h.w();
            Bundle bundle = iVar.f4379p;
            if (bundle != null) {
                iVar.f4372h.s(bundle);
                iVar.f4379p = null;
            }
            if (!I2.onPreparePanel(0, iVar.f4371g, iVar.f4372h)) {
                if (z10 && (i0Var = this.f4354y) != null) {
                    i0Var.g((androidx.appcompat.view.menu.f) null, this.z);
                }
                iVar.f4372h.v();
                return false;
            }
            if (keyEvent != null) {
                i10 = keyEvent.getDeviceId();
            } else {
                i10 = -1;
            }
            if (KeyCharacterMap.load(i10).getKeyboardType() != 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            iVar.f4372h.setQwertyMode(z11);
            iVar.f4372h.v();
        }
        iVar.f4375k = true;
        iVar.l = false;
        this.U = iVar;
        return true;
    }

    public final void O() {
        if (this.H) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        int i10;
        int i11;
        i iVar;
        Window.Callback I2 = I();
        if (I2 != null && !this.Y) {
            androidx.appcompat.view.menu.f k10 = fVar.k();
            i[] iVarArr = this.T;
            if (iVarArr != null) {
                i11 = iVarArr.length;
                i10 = 0;
            } else {
                i11 = 0;
                i10 = 0;
            }
            while (true) {
                if (i10 < i11) {
                    iVar = iVarArr[i10];
                    if (iVar != null && iVar.f4372h == k10) {
                        break;
                    }
                    i10++;
                } else {
                    iVar = null;
                    break;
                }
            }
            if (iVar != null) {
                return I2.onMenuItemSelected(iVar.f4366a, menuItem);
            }
        }
        return false;
    }

    public final void b(androidx.appcompat.view.menu.f fVar) {
        i0 i0Var = this.f4354y;
        if (i0Var == null || !i0Var.h() || (ViewConfiguration.get(this.f4349r).hasPermanentMenuKey() && !this.f4354y.d())) {
            i H2 = H(0);
            H2.f4377n = true;
            A(H2, false);
            L(H2, (KeyEvent) null);
            return;
        }
        Window.Callback I2 = I();
        if (this.f4354y.a()) {
            this.f4354y.e();
            if (!this.Y) {
                I2.onPanelClosed(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, H(0).f4372h);
            }
        } else if (I2 != null && !this.Y) {
            if (this.f4341g0 && (1 & this.f4342h0) != 0) {
                View decorView = this.f4350s.getDecorView();
                a aVar = this.f4343i0;
                decorView.removeCallbacks(aVar);
                aVar.run();
            }
            i H3 = H(0);
            androidx.appcompat.view.menu.f fVar2 = H3.f4372h;
            if (fVar2 != null && !H3.f4378o && I2.onPreparePanel(0, H3.f4371g, fVar2)) {
                I2.onMenuOpened(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, H3.f4372h);
                this.f4354y.f();
            }
        }
    }

    public final void c(View view, ViewGroup.LayoutParams layoutParams) {
        E();
        ((ViewGroup) this.I.findViewById(16908290)).addView(view, layoutParams);
        this.f4351t.f5108o.onContentChanged();
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x01a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Context d(android.content.Context r10) {
        /*
            r9 = this;
            r0 = 1
            r9.W = r0
            int r1 = r9.f4335a0
            r2 = -100
            if (r1 == r2) goto L_0x000a
            goto L_0x000b
        L_0x000a:
            r1 = r2
        L_0x000b:
            int r1 = r9.K(r10, r1)
            boolean r2 = f4334q0
            r3 = 0
            if (r2 == 0) goto L_0x0023
            boolean r2 = r10 instanceof android.view.ContextThemeWrapper
            if (r2 == 0) goto L_0x0023
            android.content.res.Configuration r2 = B(r10, r1, r3)
            r4 = r10
            android.view.ContextThemeWrapper r4 = (android.view.ContextThemeWrapper) r4     // Catch:{ IllegalStateException -> 0x0023 }
            r4.applyOverrideConfiguration(r2)     // Catch:{ IllegalStateException -> 0x0023 }
            return r10
        L_0x0023:
            boolean r2 = r10 instanceof h.c
            if (r2 == 0) goto L_0x0032
            android.content.res.Configuration r2 = B(r10, r1, r3)
            r4 = r10
            h.c r4 = (h.c) r4     // Catch:{ IllegalStateException -> 0x0032 }
            r4.a(r2)     // Catch:{ IllegalStateException -> 0x0032 }
            return r10
        L_0x0032:
            boolean r2 = f4333p0
            if (r2 != 0) goto L_0x0037
            return r10
        L_0x0037:
            int r2 = android.os.Build.VERSION.SDK_INT
            android.content.res.Configuration r4 = new android.content.res.Configuration
            r4.<init>()
            r5 = -1
            r4.uiMode = r5
            r5 = 0
            r4.fontScale = r5
            android.content.Context r4 = r10.createConfigurationContext(r4)
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            android.content.res.Resources r6 = r10.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r7 = r6.uiMode
            r4.uiMode = r7
            boolean r7 = r4.equals(r6)
            if (r7 != 0) goto L_0x0187
            android.content.res.Configuration r7 = new android.content.res.Configuration
            r7.<init>()
            r7.fontScale = r5
            int r5 = r4.diff(r6)
            if (r5 != 0) goto L_0x0071
            goto L_0x0188
        L_0x0071:
            float r5 = r4.fontScale
            float r8 = r6.fontScale
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 == 0) goto L_0x007b
            r7.fontScale = r8
        L_0x007b:
            int r5 = r4.mcc
            int r8 = r6.mcc
            if (r5 == r8) goto L_0x0083
            r7.mcc = r8
        L_0x0083:
            int r5 = r4.mnc
            int r8 = r6.mnc
            if (r5 == r8) goto L_0x008b
            r7.mnc = r8
        L_0x008b:
            android.os.LocaleList r5 = r4.getLocales()
            android.os.LocaleList r8 = r6.getLocales()
            boolean r5 = r5.equals(r8)
            if (r5 != 0) goto L_0x00a0
            r7.setLocales(r8)
            java.util.Locale r5 = r6.locale
            r7.locale = r5
        L_0x00a0:
            int r5 = r4.touchscreen
            int r8 = r6.touchscreen
            if (r5 == r8) goto L_0x00a8
            r7.touchscreen = r8
        L_0x00a8:
            int r5 = r4.keyboard
            int r8 = r6.keyboard
            if (r5 == r8) goto L_0x00b0
            r7.keyboard = r8
        L_0x00b0:
            int r5 = r4.keyboardHidden
            int r8 = r6.keyboardHidden
            if (r5 == r8) goto L_0x00b8
            r7.keyboardHidden = r8
        L_0x00b8:
            int r5 = r4.navigation
            int r8 = r6.navigation
            if (r5 == r8) goto L_0x00c0
            r7.navigation = r8
        L_0x00c0:
            int r5 = r4.navigationHidden
            int r8 = r6.navigationHidden
            if (r5 == r8) goto L_0x00c8
            r7.navigationHidden = r8
        L_0x00c8:
            int r5 = r4.orientation
            int r8 = r6.orientation
            if (r5 == r8) goto L_0x00d0
            r7.orientation = r8
        L_0x00d0:
            int r5 = r4.screenLayout
            r5 = r5 & 15
            int r8 = r6.screenLayout
            r8 = r8 & 15
            if (r5 == r8) goto L_0x00df
            int r5 = r7.screenLayout
            r5 = r5 | r8
            r7.screenLayout = r5
        L_0x00df:
            int r5 = r4.screenLayout
            r5 = r5 & 192(0xc0, float:2.69E-43)
            int r8 = r6.screenLayout
            r8 = r8 & 192(0xc0, float:2.69E-43)
            if (r5 == r8) goto L_0x00ee
            int r5 = r7.screenLayout
            r5 = r5 | r8
            r7.screenLayout = r5
        L_0x00ee:
            int r5 = r4.screenLayout
            r5 = r5 & 48
            int r8 = r6.screenLayout
            r8 = r8 & 48
            if (r5 == r8) goto L_0x00fd
            int r5 = r7.screenLayout
            r5 = r5 | r8
            r7.screenLayout = r5
        L_0x00fd:
            int r5 = r4.screenLayout
            r5 = r5 & 768(0x300, float:1.076E-42)
            int r8 = r6.screenLayout
            r8 = r8 & 768(0x300, float:1.076E-42)
            if (r5 == r8) goto L_0x010c
            int r5 = r7.screenLayout
            r5 = r5 | r8
            r7.screenLayout = r5
        L_0x010c:
            r5 = 26
            if (r2 < r5) goto L_0x0148
            int r2 = r4.colorMode
            r2 = r2 & 3
            int r5 = r6.colorMode
            r5 = r5 & 3
            if (r2 == r5) goto L_0x012c
            int r2 = r7.colorMode
            int r5 = r6.colorMode
            r5 = r5 & 3
            r2 = r2 | r5
            r7.colorMode = r2
        L_0x012c:
            int r2 = r4.colorMode
            r2 = r2 & 12
            int r5 = r6.colorMode
            r5 = r5 & 12
            if (r2 == r5) goto L_0x0148
            int r2 = r7.colorMode
            int r5 = r6.colorMode
            r5 = r5 & 12
            r2 = r2 | r5
            r7.colorMode = r2
        L_0x0148:
            int r2 = r4.uiMode
            r2 = r2 & 15
            int r5 = r6.uiMode
            r5 = r5 & 15
            if (r2 == r5) goto L_0x0157
            int r2 = r7.uiMode
            r2 = r2 | r5
            r7.uiMode = r2
        L_0x0157:
            int r2 = r4.uiMode
            r2 = r2 & 48
            int r5 = r6.uiMode
            r5 = r5 & 48
            if (r2 == r5) goto L_0x0166
            int r2 = r7.uiMode
            r2 = r2 | r5
            r7.uiMode = r2
        L_0x0166:
            int r2 = r4.screenWidthDp
            int r5 = r6.screenWidthDp
            if (r2 == r5) goto L_0x016e
            r7.screenWidthDp = r5
        L_0x016e:
            int r2 = r4.screenHeightDp
            int r5 = r6.screenHeightDp
            if (r2 == r5) goto L_0x0176
            r7.screenHeightDp = r5
        L_0x0176:
            int r2 = r4.smallestScreenWidthDp
            int r5 = r6.smallestScreenWidthDp
            if (r2 == r5) goto L_0x017e
            r7.smallestScreenWidthDp = r5
        L_0x017e:
            int r2 = r4.densityDpi
            int r4 = r6.densityDpi
            if (r2 == r4) goto L_0x0188
            r7.densityDpi = r4
            goto L_0x0188
        L_0x0187:
            r7 = r3
        L_0x0188:
            android.content.res.Configuration r1 = B(r10, r1, r7)
            h.c r2 = new h.c
            r4 = 2131952035(0x7f1301a3, float:1.9540501E38)
            r2.<init>((android.content.Context) r10, (int) r4)
            r2.a(r1)
            r1 = 0
            android.content.res.Resources$Theme r10 = r10.getTheme()     // Catch:{ NullPointerException -> 0x01a0 }
            if (r10 == 0) goto L_0x01a0
            r10 = r0
            goto L_0x01a1
        L_0x01a0:
            r10 = r1
        L_0x01a1:
            if (r10 == 0) goto L_0x01ed
            android.content.res.Resources$Theme r10 = r2.getTheme()
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r4 < r5) goto L_0x01b1
            r10.rebase()
            goto L_0x01ed
        L_0x01b1:
            java.lang.Object r4 = a0.g.f33a
            monitor-enter(r4)
            boolean r5 = a0.g.f35c     // Catch:{ all -> 0x01ea }
            if (r5 != 0) goto L_0x01d2
            java.lang.Class<android.content.res.Resources$Theme> r5 = android.content.res.Resources.Theme.class
            java.lang.String r6 = "rebase"
            java.lang.Class[] r7 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x01c8 }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r7)     // Catch:{ NoSuchMethodException -> 0x01c8 }
            a0.g.f34b = r5     // Catch:{ NoSuchMethodException -> 0x01c8 }
            r5.setAccessible(r0)     // Catch:{ NoSuchMethodException -> 0x01c8 }
            goto L_0x01d0
        L_0x01c8:
            r5 = move-exception
            java.lang.String r6 = "ResourcesCompat"
            java.lang.String r7 = "Failed to retrieve rebase() method"
            android.util.Log.i(r6, r7, r5)     // Catch:{ all -> 0x01ea }
        L_0x01d0:
            a0.g.f35c = r0     // Catch:{ all -> 0x01ea }
        L_0x01d2:
            java.lang.reflect.Method r0 = a0.g.f34b     // Catch:{ all -> 0x01ea }
            if (r0 == 0) goto L_0x01e8
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ IllegalAccessException -> 0x01de, InvocationTargetException -> 0x01dc }
            r0.invoke(r10, r1)     // Catch:{ IllegalAccessException -> 0x01de, InvocationTargetException -> 0x01dc }
            goto L_0x01e8
        L_0x01dc:
            r10 = move-exception
            goto L_0x01df
        L_0x01de:
            r10 = move-exception
        L_0x01df:
            java.lang.String r0 = "ResourcesCompat"
            java.lang.String r1 = "Failed to invoke rebase() method via reflection"
            android.util.Log.i(r0, r1, r10)     // Catch:{ all -> 0x01ea }
            a0.g.f34b = r3     // Catch:{ all -> 0x01ea }
        L_0x01e8:
            monitor-exit(r4)     // Catch:{ all -> 0x01ea }
            goto L_0x01ed
        L_0x01ea:
            r10 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01ea }
            throw r10
        L_0x01ed:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e.g.d(android.content.Context):android.content.Context");
    }

    public final <T extends View> T e(int i10) {
        E();
        return this.f4350s.findViewById(i10);
    }

    public final int f() {
        return this.f4335a0;
    }

    public final MenuInflater g() {
        if (this.w == null) {
            J();
            r rVar = this.f4352v;
            this.w = new h.f(rVar != null ? rVar.c() : this.f4349r);
        }
        return this.w;
    }

    public final void h() {
        LayoutInflater from = LayoutInflater.from(this.f4349r);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof g)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final void i() {
        J();
        this.f4342h0 |= 1;
        if (!this.f4341g0) {
            View decorView = this.f4350s.getDecorView();
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            w.d.m(decorView, this.f4343i0);
            this.f4341g0 = true;
        }
    }

    public final void j() {
        if (this.N && this.H) {
            J();
            r rVar = this.f4352v;
            if (rVar != null) {
                rVar.e(rVar.f4415a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            }
        }
        k a10 = k.a();
        Context context = this.f4349r;
        synchronized (a10) {
            t0 t0Var = a10.f620a;
            synchronized (t0Var) {
                n.f fVar = t0Var.f711b.get(context);
                if (fVar != null) {
                    fVar.c();
                }
            }
        }
        this.Z = new Configuration(this.f4349r.getResources().getConfiguration());
        w(false);
    }

    public final void k() {
        String str;
        this.W = true;
        w(false);
        F();
        Object obj = this.f4348q;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                str = x.f.c(activity, activity.getComponentName());
            } catch (PackageManager.NameNotFoundException e10) {
                throw new IllegalArgumentException(e10);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                r rVar = this.f4352v;
                if (rVar == null) {
                    this.f4344j0 = true;
                } else if (!rVar.f4421h) {
                    int o10 = rVar.f4418e.o();
                    rVar.f4421h = true;
                    rVar.f4418e.m((o10 & -5) | 4);
                }
            }
            synchronized (f.f4330p) {
                f.p(this);
                f.f4329o.add(new WeakReference(this));
            }
        }
        this.Z = new Configuration(this.f4349r.getResources().getConfiguration());
        this.X = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f4348q
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = e.f.f4330p
            monitor-enter(r0)
            e.f.p(r3)     // Catch:{ all -> 0x000e }
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            goto L_0x0011
        L_0x000e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            throw r1
        L_0x0011:
            boolean r0 = r3.f4341g0
            if (r0 == 0) goto L_0x0020
            android.view.Window r0 = r3.f4350s
            android.view.View r0 = r0.getDecorView()
            e.g$a r1 = r3.f4343i0
            r0.removeCallbacks(r1)
        L_0x0020:
            r0 = 1
            r3.Y = r0
            int r0 = r3.f4335a0
            r1 = -100
            if (r0 == r1) goto L_0x004d
            java.lang.Object r0 = r3.f4348q
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x004d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x004d
            n.i<java.lang.String, java.lang.Integer> r0 = f4331n0
            java.lang.Object r1 = r3.f4348q
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f4335a0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x005c
        L_0x004d:
            n.i<java.lang.String, java.lang.Integer> r0 = f4331n0
            java.lang.Object r1 = r3.f4348q
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x005c:
            e.g$g r0 = r3.f4339e0
            if (r0 == 0) goto L_0x0063
            r0.a()
        L_0x0063:
            e.g$e r0 = r3.f4340f0
            if (r0 == 0) goto L_0x006a
            r0.a()
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.g.l():void");
    }

    public final void m() {
        J();
        r rVar = this.f4352v;
        if (rVar != null) {
            rVar.u = true;
        }
    }

    public final void n() {
        w(true);
    }

    public final void o() {
        J();
        r rVar = this.f4352v;
        if (rVar != null) {
            rVar.u = false;
            h.g gVar = rVar.f4432t;
            if (gVar != null) {
                gVar.a();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.appcompat.widget.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: androidx.appcompat.widget.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: androidx.appcompat.widget.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v73, resolved type: androidx.appcompat.widget.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v74, resolved type: androidx.appcompat.widget.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v75, resolved type: androidx.appcompat.widget.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v76, resolved type: androidx.appcompat.widget.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v77, resolved type: androidx.appcompat.widget.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v78, resolved type: androidx.appcompat.widget.w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v79, resolved type: androidx.appcompat.widget.z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v80, resolved type: androidx.appcompat.widget.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v81, resolved type: androidx.appcompat.widget.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v82, resolved type: androidx.appcompat.widget.AppCompatImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v83, resolved type: androidx.appcompat.widget.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v84, resolved type: androidx.appcompat.widget.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v85, resolved type: androidx.appcompat.widget.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v86, resolved type: androidx.appcompat.widget.f} */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r9v13, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r6v3, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v16, types: [androidx.appcompat.widget.AppCompatTextView] */
    /* JADX WARNING: type inference failed for: r2v27 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0110, code lost:
        if (r10.equals("ImageButton") == false) goto L_0x013f;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            r8 = this;
            e.n r9 = r8.f4347m0
            r0 = 0
            if (r9 != 0) goto L_0x0054
            int[] r9 = androidx.databinding.a.I
            android.content.Context r1 = r8.f4349r
            android.content.res.TypedArray r9 = r1.obtainStyledAttributes(r9)
            r2 = 116(0x74, float:1.63E-43)
            java.lang.String r9 = r9.getString(r2)
            if (r9 != 0) goto L_0x001b
            e.n r9 = new e.n
            r9.<init>()
            goto L_0x0052
        L_0x001b:
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ all -> 0x0034 }
            java.lang.Class r1 = r1.loadClass(r9)     // Catch:{ all -> 0x0034 }
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ all -> 0x0034 }
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r2)     // Catch:{ all -> 0x0034 }
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x0034 }
            java.lang.Object r1 = r1.newInstance(r2)     // Catch:{ all -> 0x0034 }
            e.n r1 = (e.n) r1     // Catch:{ all -> 0x0034 }
            r8.f4347m0 = r1     // Catch:{ all -> 0x0034 }
            goto L_0x0054
        L_0x0034:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to instantiate custom view inflater "
            r2.<init>(r3)
            r2.append(r9)
            java.lang.String r9 = ". Falling back to default."
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            java.lang.String r2 = "AppCompatDelegate"
            android.util.Log.i(r2, r9, r1)
            e.n r9 = new e.n
            r9.<init>()
        L_0x0052:
            r8.f4347m0 = r9
        L_0x0054:
            e.n r9 = r8.f4347m0
            int r1 = androidx.appcompat.widget.l1.f650a
            r9.getClass()
            int[] r1 = androidx.databinding.a.X
            android.content.res.TypedArray r1 = r11.obtainStyledAttributes(r12, r1, r0, r0)
            r2 = 4
            int r3 = r1.getResourceId(r2, r0)
            if (r3 == 0) goto L_0x006f
            java.lang.String r4 = "AppCompatViewInflater"
            java.lang.String r5 = "app:theme is now deprecated. Please move to using android:theme instead."
            android.util.Log.i(r4, r5)
        L_0x006f:
            r1.recycle()
            if (r3 == 0) goto L_0x0085
            boolean r1 = r11 instanceof h.c
            if (r1 == 0) goto L_0x007f
            r1 = r11
            h.c r1 = (h.c) r1
            int r1 = r1.f5059a
            if (r1 == r3) goto L_0x0085
        L_0x007f:
            h.c r1 = new h.c
            r1.<init>((android.content.Context) r11, (int) r3)
            goto L_0x0086
        L_0x0085:
            r1 = r11
        L_0x0086:
            r10.getClass()
            int r3 = r10.hashCode()
            r4 = 1
            r5 = 3
            r6 = -1
            switch(r3) {
                case -1946472170: goto L_0x0134;
                case -1455429095: goto L_0x0129;
                case -1346021293: goto L_0x011e;
                case -938935918: goto L_0x0113;
                case -937446323: goto L_0x010a;
                case -658531749: goto L_0x00ff;
                case -339785223: goto L_0x00f4;
                case 776382189: goto L_0x00e9;
                case 799298502: goto L_0x00db;
                case 1125864064: goto L_0x00cd;
                case 1413872058: goto L_0x00bf;
                case 1601505219: goto L_0x00b1;
                case 1666676343: goto L_0x00a3;
                case 2001146706: goto L_0x0095;
                default: goto L_0x0093;
            }
        L_0x0093:
            goto L_0x013f
        L_0x0095:
            java.lang.String r2 = "Button"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x009f
            goto L_0x013f
        L_0x009f:
            r2 = 13
            goto L_0x0140
        L_0x00a3:
            java.lang.String r2 = "EditText"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x00ad
            goto L_0x013f
        L_0x00ad:
            r2 = 12
            goto L_0x0140
        L_0x00b1:
            java.lang.String r2 = "CheckBox"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x00bb
            goto L_0x013f
        L_0x00bb:
            r2 = 11
            goto L_0x0140
        L_0x00bf:
            java.lang.String r2 = "AutoCompleteTextView"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x00c9
            goto L_0x013f
        L_0x00c9:
            r2 = 10
            goto L_0x0140
        L_0x00cd:
            java.lang.String r2 = "ImageView"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x00d7
            goto L_0x013f
        L_0x00d7:
            r2 = 9
            goto L_0x0140
        L_0x00db:
            java.lang.String r2 = "ToggleButton"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x00e5
            goto L_0x013f
        L_0x00e5:
            r2 = 8
            goto L_0x0140
        L_0x00e9:
            java.lang.String r2 = "RadioButton"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x00f2
            goto L_0x013f
        L_0x00f2:
            r2 = 7
            goto L_0x0140
        L_0x00f4:
            java.lang.String r2 = "Spinner"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x00fd
            goto L_0x013f
        L_0x00fd:
            r2 = 6
            goto L_0x0140
        L_0x00ff:
            java.lang.String r2 = "SeekBar"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x0108
            goto L_0x013f
        L_0x0108:
            r2 = 5
            goto L_0x0140
        L_0x010a:
            java.lang.String r3 = "ImageButton"
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L_0x0140
            goto L_0x013f
        L_0x0113:
            java.lang.String r2 = "TextView"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x011c
            goto L_0x013f
        L_0x011c:
            r2 = r5
            goto L_0x0140
        L_0x011e:
            java.lang.String r2 = "MultiAutoCompleteTextView"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x0127
            goto L_0x013f
        L_0x0127:
            r2 = 2
            goto L_0x0140
        L_0x0129:
            java.lang.String r2 = "CheckedTextView"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x0132
            goto L_0x013f
        L_0x0132:
            r2 = r4
            goto L_0x0140
        L_0x0134:
            java.lang.String r2 = "RatingBar"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x013d
            goto L_0x013f
        L_0x013d:
            r2 = r0
            goto L_0x0140
        L_0x013f:
            r2 = r6
        L_0x0140:
            r3 = 0
            switch(r2) {
                case 0: goto L_0x01bd;
                case 1: goto L_0x01b7;
                case 2: goto L_0x01b1;
                case 3: goto L_0x0183;
                case 4: goto L_0x017d;
                case 5: goto L_0x0177;
                case 6: goto L_0x016e;
                case 7: goto L_0x0169;
                case 8: goto L_0x0163;
                case 9: goto L_0x015d;
                case 10: goto L_0x0158;
                case 11: goto L_0x0153;
                case 12: goto L_0x014c;
                case 13: goto L_0x0147;
                default: goto L_0x0144;
            }
        L_0x0144:
            r2 = r3
            goto L_0x01c2
        L_0x0147:
            androidx.appcompat.widget.f r2 = r9.b(r1, r12)
            goto L_0x0187
        L_0x014c:
            androidx.appcompat.widget.l r2 = new androidx.appcompat.widget.l
            r2.<init>(r1, r12)
            goto L_0x01c2
        L_0x0153:
            androidx.appcompat.widget.g r2 = r9.c(r1, r12)
            goto L_0x0187
        L_0x0158:
            androidx.appcompat.widget.d r2 = r9.a(r1, r12)
            goto L_0x0187
        L_0x015d:
            androidx.appcompat.widget.AppCompatImageView r2 = new androidx.appcompat.widget.AppCompatImageView
            r2.<init>(r1, r12)
            goto L_0x01c2
        L_0x0163:
            androidx.appcompat.widget.h0 r2 = new androidx.appcompat.widget.h0
            r2.<init>(r1, r12)
            goto L_0x01c2
        L_0x0169:
            androidx.appcompat.widget.t r2 = r9.d(r1, r12)
            goto L_0x0187
        L_0x016e:
            androidx.appcompat.widget.z r2 = new androidx.appcompat.widget.z
            r7 = 2130969448(0x7f040368, float:1.7547578E38)
            r2.<init>(r1, r12, r7)
            goto L_0x01c2
        L_0x0177:
            androidx.appcompat.widget.w r2 = new androidx.appcompat.widget.w
            r2.<init>(r1, r12)
            goto L_0x01c2
        L_0x017d:
            androidx.appcompat.widget.o r2 = new androidx.appcompat.widget.o
            r2.<init>(r1, r12)
            goto L_0x01c2
        L_0x0183:
            androidx.appcompat.widget.AppCompatTextView r2 = r9.e(r1, r12)
        L_0x0187:
            if (r2 == 0) goto L_0x018a
            goto L_0x01c2
        L_0x018a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            r12.append(r9)
            java.lang.String r9 = " asked to inflate view for <"
            r12.append(r9)
            r12.append(r10)
            java.lang.String r9 = ">, but returned null"
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r11.<init>(r9)
            throw r11
        L_0x01b1:
            androidx.appcompat.widget.q r2 = new androidx.appcompat.widget.q
            r2.<init>(r1, r12)
            goto L_0x01c2
        L_0x01b7:
            androidx.appcompat.widget.h r2 = new androidx.appcompat.widget.h
            r2.<init>(r1, r12)
            goto L_0x01c2
        L_0x01bd:
            androidx.appcompat.widget.u r2 = new androidx.appcompat.widget.u
            r2.<init>(r1, r12)
        L_0x01c2:
            if (r2 != 0) goto L_0x0212
            if (r11 == r1) goto L_0x0212
            java.lang.Object[] r11 = r9.f4395a
            java.lang.String r2 = "view"
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L_0x01d6
            java.lang.String r10 = "class"
            java.lang.String r10 = r12.getAttributeValue(r3, r10)
        L_0x01d6:
            r11[r0] = r1     // Catch:{ Exception -> 0x020d, all -> 0x0207 }
            r11[r4] = r12     // Catch:{ Exception -> 0x020d, all -> 0x0207 }
            r2 = 46
            int r2 = r10.indexOf(r2)     // Catch:{ Exception -> 0x020d, all -> 0x0207 }
            if (r6 != r2) goto L_0x01fd
            r2 = r0
        L_0x01e3:
            java.lang.String[] r6 = e.n.f4393g     // Catch:{ Exception -> 0x020d, all -> 0x0207 }
            if (r2 >= r5) goto L_0x01f8
            r6 = r6[r2]     // Catch:{ Exception -> 0x020d, all -> 0x0207 }
            android.view.View r6 = r9.f(r1, r10, r6)     // Catch:{ Exception -> 0x020d, all -> 0x0207 }
            if (r6 == 0) goto L_0x01f5
            r11[r0] = r3
            r11[r4] = r3
            r3 = r6
            goto L_0x0211
        L_0x01f5:
            int r2 = r2 + 1
            goto L_0x01e3
        L_0x01f8:
            r11[r0] = r3
            r11[r4] = r3
            goto L_0x0211
        L_0x01fd:
            android.view.View r9 = r9.f(r1, r10, r3)     // Catch:{ Exception -> 0x020d, all -> 0x0207 }
            r11[r0] = r3
            r11[r4] = r3
            r3 = r9
            goto L_0x0211
        L_0x0207:
            r9 = move-exception
            r11[r0] = r3
            r11[r4] = r3
            throw r9
        L_0x020d:
            r11[r0] = r3
            r11[r4] = r3
        L_0x0211:
            r2 = r3
        L_0x0212:
            if (r2 == 0) goto L_0x029b
            android.content.Context r9 = r2.getContext()
            boolean r10 = r9 instanceof android.content.ContextWrapper
            if (r10 == 0) goto L_0x023c
            java.util.WeakHashMap<android.view.View, i0.b0> r10 = i0.w.f6004a
            boolean r10 = i0.w.c.a(r2)
            if (r10 != 0) goto L_0x0225
            goto L_0x023c
        L_0x0225:
            int[] r10 = e.n.f4390c
            android.content.res.TypedArray r9 = r9.obtainStyledAttributes(r12, r10)
            java.lang.String r10 = r9.getString(r0)
            if (r10 == 0) goto L_0x0239
            e.n$a r11 = new e.n$a
            r11.<init>(r2, r10)
            r2.setOnClickListener(r11)
        L_0x0239:
            r9.recycle()
        L_0x023c:
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 28
            if (r9 <= r10) goto L_0x0243
            goto L_0x029b
        L_0x0243:
            int[] r9 = e.n.d
            android.content.res.TypedArray r9 = r1.obtainStyledAttributes(r12, r9)
            boolean r10 = r9.hasValue(r0)
            if (r10 == 0) goto L_0x0261
            boolean r10 = r9.getBoolean(r0, r0)
            java.util.WeakHashMap<android.view.View, i0.b0> r11 = i0.w.f6004a
            i0.v r11 = new i0.v
            r11.<init>()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r11.e(r2, r10)
        L_0x0261:
            r9.recycle()
            int[] r9 = e.n.f4391e
            android.content.res.TypedArray r9 = r1.obtainStyledAttributes(r12, r9)
            boolean r10 = r9.hasValue(r0)
            if (r10 == 0) goto L_0x0277
            java.lang.String r10 = r9.getString(r0)
            i0.w.l(r2, r10)
        L_0x0277:
            r9.recycle()
            int[] r9 = e.n.f4392f
            android.content.res.TypedArray r9 = r1.obtainStyledAttributes(r12, r9)
            boolean r10 = r9.hasValue(r0)
            if (r10 == 0) goto L_0x0298
            boolean r10 = r9.getBoolean(r0, r0)
            java.util.WeakHashMap<android.view.View, i0.b0> r11 = i0.w.f6004a
            i0.t r11 = new i0.t
            r11.<init>()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r11.e(r2, r10)
        L_0x0298:
            r9.recycle()
        L_0x029b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e.g.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public final boolean q(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i10 = 108;
        } else if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i10 = 109;
        }
        if (this.R && i10 == 108) {
            return false;
        }
        if (this.N && i10 == 1) {
            this.N = false;
        }
        if (i10 == 1) {
            O();
            this.R = true;
            return true;
        } else if (i10 == 2) {
            O();
            this.L = true;
            return true;
        } else if (i10 == 5) {
            O();
            this.M = true;
            return true;
        } else if (i10 == 10) {
            O();
            this.P = true;
            return true;
        } else if (i10 == 108) {
            O();
            this.N = true;
            return true;
        } else if (i10 != 109) {
            return this.f4350s.requestFeature(i10);
        } else {
            O();
            this.O = true;
            return true;
        }
    }

    public final void r(int i10) {
        E();
        ViewGroup viewGroup = (ViewGroup) this.I.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f4349r).inflate(i10, viewGroup);
        this.f4351t.f5108o.onContentChanged();
    }

    public final void s(View view) {
        E();
        ViewGroup viewGroup = (ViewGroup) this.I.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f4351t.f5108o.onContentChanged();
    }

    public final void t(View view, ViewGroup.LayoutParams layoutParams) {
        E();
        ViewGroup viewGroup = (ViewGroup) this.I.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f4351t.f5108o.onContentChanged();
    }

    public final void u(int i10) {
        this.f4336b0 = i10;
    }

    public final void v(CharSequence charSequence) {
        this.f4353x = charSequence;
        i0 i0Var = this.f4354y;
        if (i0Var != null) {
            i0Var.setWindowTitle(charSequence);
            return;
        }
        r rVar = this.f4352v;
        if (rVar != null) {
            rVar.f4418e.setWindowTitle(charSequence);
            return;
        }
        TextView textView = this.J;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:134:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x012f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean w(boolean r12) {
        /*
            r11 = this;
            boolean r0 = r11.Y
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r11.f4335a0
            r2 = -100
            if (r0 == r2) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            r0 = r2
        L_0x000e:
            android.content.Context r2 = r11.f4349r
            int r3 = r11.K(r2, r0)
            r4 = 0
            android.content.res.Configuration r3 = B(r2, r3, r4)
            boolean r5 = r11.f4338d0
            r6 = 1
            java.lang.Object r7 = r11.f4348q
            if (r5 != 0) goto L_0x005c
            boolean r5 = r7 instanceof android.app.Activity
            if (r5 == 0) goto L_0x005c
            android.content.pm.PackageManager r5 = r2.getPackageManager()
            if (r5 != 0) goto L_0x002c
            r5 = r1
            goto L_0x0060
        L_0x002c:
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException -> 0x0052 }
            r9 = 29
            if (r8 < r9) goto L_0x0035
            r8 = 269221888(0x100c0000, float:2.7610132E-29)
            goto L_0x0037
        L_0x0035:
            r8 = 786432(0xc0000, float:1.102026E-39)
        L_0x0037:
            android.content.ComponentName r9 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0052 }
            java.lang.Class r10 = r7.getClass()     // Catch:{ NameNotFoundException -> 0x0052 }
            r9.<init>(r2, r10)     // Catch:{ NameNotFoundException -> 0x0052 }
            android.content.pm.ActivityInfo r5 = r5.getActivityInfo(r9, r8)     // Catch:{ NameNotFoundException -> 0x0052 }
            if (r5 == 0) goto L_0x004e
            int r5 = r5.configChanges     // Catch:{ NameNotFoundException -> 0x0052 }
            r5 = r5 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x004e
            r5 = r6
            goto L_0x004f
        L_0x004e:
            r5 = r1
        L_0x004f:
            r11.f4337c0 = r5     // Catch:{ NameNotFoundException -> 0x0052 }
            goto L_0x005c
        L_0x0052:
            r5 = move-exception
            java.lang.String r8 = "AppCompatDelegate"
            java.lang.String r9 = "Exception while getting ActivityInfo"
            android.util.Log.d(r8, r9, r5)
            r11.f4337c0 = r1
        L_0x005c:
            r11.f4338d0 = r6
            boolean r5 = r11.f4337c0
        L_0x0060:
            android.content.res.Configuration r8 = r11.Z
            if (r8 != 0) goto L_0x006c
            android.content.res.Resources r8 = r2.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
        L_0x006c:
            int r8 = r8.uiMode
            r8 = r8 & 48
            int r3 = r3.uiMode
            r3 = r3 & 48
            r9 = 28
            if (r8 == r3) goto L_0x00a6
            if (r12 == 0) goto L_0x00a6
            if (r5 != 0) goto L_0x00a6
            boolean r12 = r11.W
            if (r12 == 0) goto L_0x00a6
            boolean r12 = f4333p0
            if (r12 != 0) goto L_0x0088
            boolean r12 = r11.X
            if (r12 == 0) goto L_0x00a6
        L_0x0088:
            boolean r12 = r7 instanceof android.app.Activity
            if (r12 == 0) goto L_0x00a6
            r12 = r7
            android.app.Activity r12 = (android.app.Activity) r12
            boolean r10 = r12.isChild()
            if (r10 != 0) goto L_0x00a6
            int r1 = x.a.f9376c
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r9) goto L_0x009c
            goto L_0x00a2
        L_0x009c:
            boolean r1 = x.b.a(r12)
            if (r1 != 0) goto L_0x00a5
        L_0x00a2:
            r12.recreate()
        L_0x00a5:
            r1 = r6
        L_0x00a6:
            if (r1 != 0) goto L_0x01b4
            if (r8 == r3) goto L_0x01b4
            android.content.res.Resources r12 = r2.getResources()
            android.content.res.Configuration r1 = new android.content.res.Configuration
            android.content.res.Configuration r8 = r12.getConfiguration()
            r1.<init>(r8)
            android.content.res.Configuration r8 = r12.getConfiguration()
            int r8 = r8.uiMode
            r8 = r8 & -49
            r3 = r3 | r8
            r1.uiMode = r3
            r12.updateConfiguration(r1, r4)
            int r3 = android.os.Build.VERSION.SDK_INT
            r8 = 26
            if (r3 >= r8) goto L_0x0179
            if (r3 < r9) goto L_0x00cf
            goto L_0x0179
        L_0x00cf:
            boolean r3 = e.o.f4406h
            java.lang.String r8 = "ResourcesFlusher"
            if (r3 != 0) goto L_0x00eb
            java.lang.Class<android.content.res.Resources> r3 = android.content.res.Resources.class
            java.lang.String r9 = "mResourcesImpl"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r9)     // Catch:{ NoSuchFieldException -> 0x00e3 }
            e.o.f4405g = r3     // Catch:{ NoSuchFieldException -> 0x00e3 }
            r3.setAccessible(r6)     // Catch:{ NoSuchFieldException -> 0x00e3 }
            goto L_0x00e9
        L_0x00e3:
            r3 = move-exception
            java.lang.String r9 = "Could not retrieve Resources#mResourcesImpl field"
            android.util.Log.e(r8, r9, r3)
        L_0x00e9:
            e.o.f4406h = r6
        L_0x00eb:
            java.lang.reflect.Field r3 = e.o.f4405g
            if (r3 != 0) goto L_0x00f1
            goto L_0x0179
        L_0x00f1:
            java.lang.Object r12 = r3.get(r12)     // Catch:{ IllegalAccessException -> 0x00f6 }
            goto L_0x00fd
        L_0x00f6:
            r12 = move-exception
            java.lang.String r3 = "Could not retrieve value from Resources#mResourcesImpl"
            android.util.Log.e(r8, r3, r12)
            r12 = r4
        L_0x00fd:
            if (r12 != 0) goto L_0x0101
            goto L_0x0179
        L_0x0101:
            boolean r3 = e.o.f4401b
            if (r3 != 0) goto L_0x011d
            java.lang.Class r3 = r12.getClass()     // Catch:{ NoSuchFieldException -> 0x0115 }
            java.lang.String r9 = "mDrawableCache"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r9)     // Catch:{ NoSuchFieldException -> 0x0115 }
            e.o.f4400a = r3     // Catch:{ NoSuchFieldException -> 0x0115 }
            r3.setAccessible(r6)     // Catch:{ NoSuchFieldException -> 0x0115 }
            goto L_0x011b
        L_0x0115:
            r3 = move-exception
            java.lang.String r9 = "Could not retrieve ResourcesImpl#mDrawableCache field"
            android.util.Log.e(r8, r9, r3)
        L_0x011b:
            e.o.f4401b = r6
        L_0x011d:
            java.lang.reflect.Field r3 = e.o.f4400a
            if (r3 == 0) goto L_0x012c
            java.lang.Object r12 = r3.get(r12)     // Catch:{ IllegalAccessException -> 0x0126 }
            goto L_0x012d
        L_0x0126:
            r12 = move-exception
            java.lang.String r3 = "Could not retrieve value from ResourcesImpl#mDrawableCache"
            android.util.Log.e(r8, r3, r12)
        L_0x012c:
            r12 = r4
        L_0x012d:
            if (r12 == 0) goto L_0x0179
            boolean r3 = e.o.d
            if (r3 != 0) goto L_0x0144
            java.lang.String r3 = "android.content.res.ThemedResourceCache"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x013c }
            e.o.f4402c = r3     // Catch:{ ClassNotFoundException -> 0x013c }
            goto L_0x0142
        L_0x013c:
            r3 = move-exception
            java.lang.String r9 = "Could not find ThemedResourceCache class"
            android.util.Log.e(r8, r9, r3)
        L_0x0142:
            e.o.d = r6
        L_0x0144:
            java.lang.Class<?> r3 = e.o.f4402c
            if (r3 != 0) goto L_0x0149
            goto L_0x0179
        L_0x0149:
            boolean r9 = e.o.f4404f
            if (r9 != 0) goto L_0x0161
            java.lang.String r9 = "mUnthemedEntries"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r9)     // Catch:{ NoSuchFieldException -> 0x0159 }
            e.o.f4403e = r3     // Catch:{ NoSuchFieldException -> 0x0159 }
            r3.setAccessible(r6)     // Catch:{ NoSuchFieldException -> 0x0159 }
            goto L_0x015f
        L_0x0159:
            r3 = move-exception
            java.lang.String r9 = "Could not retrieve ThemedResourceCache#mUnthemedEntries field"
            android.util.Log.e(r8, r9, r3)
        L_0x015f:
            e.o.f4404f = r6
        L_0x0161:
            java.lang.reflect.Field r3 = e.o.f4403e
            if (r3 != 0) goto L_0x0166
            goto L_0x0179
        L_0x0166:
            java.lang.Object r12 = r3.get(r12)     // Catch:{ IllegalAccessException -> 0x016e }
            android.util.LongSparseArray r12 = (android.util.LongSparseArray) r12     // Catch:{ IllegalAccessException -> 0x016e }
            r4 = r12
            goto L_0x0174
        L_0x016e:
            r12 = move-exception
            java.lang.String r3 = "Could not retrieve value from ThemedResourceCache#mUnthemedEntries"
            android.util.Log.e(r8, r3, r12)
        L_0x0174:
            if (r4 == 0) goto L_0x0179
            r4.clear()
        L_0x0179:
            int r12 = r11.f4336b0
            if (r12 == 0) goto L_0x0189
            r2.setTheme(r12)
            android.content.res.Resources$Theme r12 = r2.getTheme()
            int r3 = r11.f4336b0
            r12.applyStyle(r3, r6)
        L_0x0189:
            if (r5 == 0) goto L_0x01b5
            boolean r12 = r7 instanceof android.app.Activity
            if (r12 == 0) goto L_0x01b5
            r12 = r7
            android.app.Activity r12 = (android.app.Activity) r12
            boolean r3 = r12 instanceof androidx.lifecycle.n
            if (r3 == 0) goto L_0x01a8
            r3 = r12
            androidx.lifecycle.n r3 = (androidx.lifecycle.n) r3
            androidx.lifecycle.o r3 = r3.r()
            androidx.lifecycle.h$c r3 = r3.f1394c
            androidx.lifecycle.h$c r4 = androidx.lifecycle.h.c.CREATED
            boolean r3 = r3.isAtLeast(r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b0
        L_0x01a8:
            boolean r3 = r11.X
            if (r3 == 0) goto L_0x01b5
            boolean r3 = r11.Y
            if (r3 != 0) goto L_0x01b5
        L_0x01b0:
            r12.onConfigurationChanged(r1)
            goto L_0x01b5
        L_0x01b4:
            r6 = r1
        L_0x01b5:
            if (r6 == 0) goto L_0x01c0
            boolean r12 = r7 instanceof e.d
            if (r12 == 0) goto L_0x01c0
            e.d r7 = (e.d) r7
            r7.getClass()
        L_0x01c0:
            if (r0 != 0) goto L_0x01ca
            e.g$f r12 = r11.G(r2)
            r12.e()
            goto L_0x01d1
        L_0x01ca:
            e.g$g r12 = r11.f4339e0
            if (r12 == 0) goto L_0x01d1
            r12.a()
        L_0x01d1:
            r12 = 3
            if (r0 != r12) goto L_0x01e5
            e.g$e r12 = r11.f4340f0
            if (r12 != 0) goto L_0x01df
            e.g$e r12 = new e.g$e
            r12.<init>(r2)
            r11.f4340f0 = r12
        L_0x01df:
            e.g$e r12 = r11.f4340f0
            r12.e()
            goto L_0x01ec
        L_0x01e5:
            e.g$e r12 = r11.f4340f0
            if (r12 == 0) goto L_0x01ec
            r12.a()
        L_0x01ec:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e.g.w(boolean):boolean");
    }

    public final void x(Window window) {
        int resourceId;
        Drawable e10;
        if (this.f4350s == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof d)) {
                d dVar = new d(callback);
                this.f4351t = dVar;
                window.setCallback(dVar);
                int[] iArr = f4332o0;
                Context context = this.f4349r;
                Drawable drawable = null;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    k a10 = k.a();
                    synchronized (a10) {
                        e10 = a10.f620a.e(resourceId, context, true);
                    }
                    drawable = e10;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.f4350s = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final void y(int i10, i iVar, androidx.appcompat.view.menu.f fVar) {
        if (fVar == null) {
            if (iVar == null && i10 >= 0) {
                i[] iVarArr = this.T;
                if (i10 < iVarArr.length) {
                    iVar = iVarArr[i10];
                }
            }
            if (iVar != null) {
                fVar = iVar.f4372h;
            }
        }
        if ((iVar == null || iVar.f4376m) && !this.Y) {
            this.f4351t.f5108o.onPanelClosed(i10, fVar);
        }
    }

    public final void z(androidx.appcompat.view.menu.f fVar) {
        if (!this.S) {
            this.S = true;
            this.f4354y.l();
            Window.Callback I2 = I();
            if (I2 != null && !this.Y) {
                I2.onPanelClosed(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, fVar);
            }
            this.S = false;
        }
    }
}

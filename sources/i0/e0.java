package i0;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import i0.w;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;

public final class e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final e0 f5968b = (Build.VERSION.SDK_INT >= 30 ? j.f5987m : k.f5988b);

    /* renamed from: a  reason: collision with root package name */
    public final k f5969a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final Field f5970a;

        /* renamed from: b  reason: collision with root package name */
        public static final Field f5971b;

        /* renamed from: c  reason: collision with root package name */
        public static final Field f5972c;
        public static final boolean d = true;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f5970a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f5971b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f5972c = declaredField3;
                declaredField3.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
            }
        }
    }

    public static class b extends e {

        /* renamed from: c  reason: collision with root package name */
        public static Field f5973c = null;
        public static boolean d = false;

        /* renamed from: e  reason: collision with root package name */
        public static Constructor<WindowInsets> f5974e = null;

        /* renamed from: f  reason: collision with root package name */
        public static boolean f5975f = false;

        /* renamed from: a  reason: collision with root package name */
        public WindowInsets f5976a;

        /* renamed from: b  reason: collision with root package name */
        public b0.b f5977b;

        public b() {
            this.f5976a = e();
        }

        public b(e0 e0Var) {
            super(e0Var);
            this.f5976a = e0Var.f();
        }

        private static WindowInsets e() {
            Class<WindowInsets> cls = WindowInsets.class;
            if (!d) {
                try {
                    f5973c = cls.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                d = true;
            }
            Field field = f5973c;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f5975f) {
                try {
                    f5974e = cls.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f5975f = true;
            }
            Constructor<WindowInsets> constructor = f5974e;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        public e0 b() {
            a();
            e0 g10 = e0.g(this.f5976a, (View) null);
            k kVar = g10.f5969a;
            kVar.l((b0.b[]) null);
            kVar.n(this.f5977b);
            return g10;
        }

        public void c(b0.b bVar) {
            this.f5977b = bVar;
        }

        public void d(b0.b bVar) {
            WindowInsets windowInsets = this.f5976a;
            if (windowInsets != null) {
                this.f5976a = windowInsets.replaceSystemWindowInsets(bVar.f1931a, bVar.f1932b, bVar.f1933c, bVar.d);
            }
        }
    }

    public static class c extends e {

        /* renamed from: a  reason: collision with root package name */
        public final WindowInsets.Builder f5978a;

        public c() {
            this.f5978a = new WindowInsets.Builder();
        }

        public c(e0 e0Var) {
            super(e0Var);
            WindowInsets.Builder builder;
            WindowInsets f10 = e0Var.f();
            if (f10 == null) {
                builder = new WindowInsets.Builder();
            }
            this.f5978a = builder;
        }

        public e0 b() {
            a();
            e0 g10 = e0.g(this.f5978a.build(), (View) null);
            g10.f5969a.l((b0.b[]) null);
            return g10;
        }

        public void c(b0.b bVar) {
            this.f5978a.setStableInsets(bVar.c());
        }

        public void d(b0.b bVar) {
            this.f5978a.setSystemWindowInsets(bVar.c());
        }
    }

    public static class d extends c {
        public d() {
        }

        public d(e0 e0Var) {
            super(e0Var);
        }
    }

    public static class e {
        public e() {
            this(new e0());
        }

        public e(e0 e0Var) {
        }

        public final void a() {
        }

        public e0 b() {
            throw null;
        }

        public void c(b0.b bVar) {
            throw null;
        }

        public void d(b0.b bVar) {
            throw null;
        }
    }

    public static class f extends k {

        /* renamed from: f  reason: collision with root package name */
        public static boolean f5979f = false;

        /* renamed from: g  reason: collision with root package name */
        public static Method f5980g;

        /* renamed from: h  reason: collision with root package name */
        public static Class<?> f5981h;

        /* renamed from: i  reason: collision with root package name */
        public static Field f5982i;

        /* renamed from: j  reason: collision with root package name */
        public static Field f5983j;

        /* renamed from: c  reason: collision with root package name */
        public final WindowInsets f5984c;
        public b0.b d = null;

        /* renamed from: e  reason: collision with root package name */
        public b0.b f5985e;

        public f(e0 e0Var, WindowInsets windowInsets) {
            super(e0Var);
            this.f5984c = windowInsets;
        }

        private b0.b o(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f5979f) {
                    p();
                }
                Method method = f5980g;
                if (!(method == null || f5981h == null || f5982i == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f5982i.get(f5983j.get(invoke));
                        if (rect != null) {
                            return b0.b.a(rect.left, rect.top, rect.right, rect.bottom);
                        }
                        return null;
                    } catch (ReflectiveOperationException e10) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        private static void p() {
            try {
                f5980g = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f5981h = cls;
                f5982i = cls.getDeclaredField("mVisibleInsets");
                f5983j = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f5982i.setAccessible(true);
                f5983j.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f5979f = true;
        }

        public void d(View view) {
            b0.b o10 = o(view);
            if (o10 == null) {
                o10 = b0.b.f1930e;
            }
            q(o10);
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f5985e, ((f) obj).f5985e);
        }

        public final b0.b h() {
            if (this.d == null) {
                WindowInsets windowInsets = this.f5984c;
                this.d = b0.b.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            }
            return this.d;
        }

        public e0 i(int i10, int i11, int i12, int i13) {
            e eVar;
            e0 g10 = e0.g(this.f5984c, (View) null);
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 30) {
                eVar = new d(g10);
            } else if (i14 >= 29) {
                eVar = new c(g10);
            } else {
                eVar = new b(g10);
            }
            eVar.d(e0.e(h(), i10, i11, i12, i13));
            eVar.c(e0.e(g(), i10, i11, i12, i13));
            return eVar.b();
        }

        public boolean k() {
            return this.f5984c.isRound();
        }

        public void l(b0.b[] bVarArr) {
        }

        public void m(e0 e0Var) {
        }

        public void q(b0.b bVar) {
            this.f5985e = bVar;
        }
    }

    public static class g extends f {

        /* renamed from: k  reason: collision with root package name */
        public b0.b f5986k = null;

        public g(e0 e0Var, WindowInsets windowInsets) {
            super(e0Var, windowInsets);
        }

        public e0 b() {
            return e0.g(this.f5984c.consumeStableInsets(), (View) null);
        }

        public e0 c() {
            return e0.g(this.f5984c.consumeSystemWindowInsets(), (View) null);
        }

        public final b0.b g() {
            if (this.f5986k == null) {
                WindowInsets windowInsets = this.f5984c;
                this.f5986k = b0.b.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            }
            return this.f5986k;
        }

        public boolean j() {
            return this.f5984c.isConsumed();
        }

        public void n(b0.b bVar) {
            this.f5986k = bVar;
        }
    }

    public static class h extends g {
        public h(e0 e0Var, WindowInsets windowInsets) {
            super(e0Var, windowInsets);
        }

        public e0 a() {
            return e0.g(this.f5984c.consumeDisplayCutout(), (View) null);
        }

        public f e() {
            DisplayCutout m10 = this.f5984c.getDisplayCutout();
            if (m10 == null) {
                return null;
            }
            return new f(m10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Objects.equals(this.f5984c, hVar.f5984c) && Objects.equals(this.f5985e, hVar.f5985e);
        }

        public int hashCode() {
            return this.f5984c.hashCode();
        }
    }

    public static class i extends h {
        public b0.b l = null;

        public i(e0 e0Var, WindowInsets windowInsets) {
            super(e0Var, windowInsets);
        }

        public b0.b f() {
            if (this.l == null) {
                this.l = b0.b.b(this.f5984c.getMandatorySystemGestureInsets());
            }
            return this.l;
        }

        public e0 i(int i10, int i11, int i12, int i13) {
            return e0.g(this.f5984c.inset(i10, i11, i12, i13), (View) null);
        }

        public void n(b0.b bVar) {
        }
    }

    public static class j extends i {

        /* renamed from: m  reason: collision with root package name */
        public static final e0 f5987m = e0.g(WindowInsets.CONSUMED, (View) null);

        public j(e0 e0Var, WindowInsets windowInsets) {
            super(e0Var, windowInsets);
        }

        public final void d(View view) {
        }
    }

    public static class k {

        /* renamed from: b  reason: collision with root package name */
        public static final e0 f5988b;

        /* renamed from: a  reason: collision with root package name */
        public final e0 f5989a;

        static {
            e eVar;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                eVar = new d();
            } else if (i10 >= 29) {
                eVar = new c();
            } else {
                eVar = new b();
            }
            f5988b = eVar.b().f5969a.a().f5969a.b().f5969a.c();
        }

        public k(e0 e0Var) {
            this.f5989a = e0Var;
        }

        public e0 a() {
            return this.f5989a;
        }

        public e0 b() {
            return this.f5989a;
        }

        public e0 c() {
            return this.f5989a;
        }

        public void d(View view) {
        }

        public f e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            if (k() != kVar.k() || j() != kVar.j() || !Objects.equals(h(), kVar.h()) || !Objects.equals(g(), kVar.g()) || !Objects.equals(e(), kVar.e())) {
                return false;
            }
            return true;
        }

        public b0.b f() {
            return h();
        }

        public b0.b g() {
            return b0.b.f1930e;
        }

        public b0.b h() {
            return b0.b.f1930e;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Boolean.valueOf(k()), Boolean.valueOf(j()), h(), g(), e()});
        }

        public e0 i(int i10, int i11, int i12, int i13) {
            return f5988b;
        }

        public boolean j() {
            return false;
        }

        public boolean k() {
            return false;
        }

        public void l(b0.b[] bVarArr) {
        }

        public void m(e0 e0Var) {
        }

        public void n(b0.b bVar) {
        }
    }

    public e0() {
        this.f5969a = new k(this);
    }

    public e0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        this.f5969a = i10 >= 30 ? new j(this, windowInsets) : i10 >= 29 ? new i(this, windowInsets) : i10 >= 28 ? new h(this, windowInsets) : new g(this, windowInsets);
    }

    public static b0.b e(b0.b bVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, bVar.f1931a - i10);
        int max2 = Math.max(0, bVar.f1932b - i11);
        int max3 = Math.max(0, bVar.f1933c - i12);
        int max4 = Math.max(0, bVar.d - i13);
        return (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) ? bVar : b0.b.a(max, max2, max3, max4);
    }

    public static e0 g(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        e0 e0Var = new e0(windowInsets);
        if (view != null) {
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            if (w.g.b(view)) {
                e0 a10 = w.j.a(view);
                k kVar = e0Var.f5969a;
                kVar.m(a10);
                kVar.d(view.getRootView());
            }
        }
        return e0Var;
    }

    @Deprecated
    public final int a() {
        return this.f5969a.h().d;
    }

    @Deprecated
    public final int b() {
        return this.f5969a.h().f1931a;
    }

    @Deprecated
    public final int c() {
        return this.f5969a.h().f1933c;
    }

    @Deprecated
    public final int d() {
        return this.f5969a.h().f1932b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        return Objects.equals(this.f5969a, ((e0) obj).f5969a);
    }

    public final WindowInsets f() {
        k kVar = this.f5969a;
        if (kVar instanceof f) {
            return ((f) kVar).f5984c;
        }
        return null;
    }

    public final int hashCode() {
        k kVar = this.f5969a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }
}

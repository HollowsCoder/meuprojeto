package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.k;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import n.f;
import n.g;
import n.j;

public final class t0 {

    /* renamed from: f  reason: collision with root package name */
    public static final PorterDuff.Mode f707f = PorterDuff.Mode.SRC_IN;

    /* renamed from: g  reason: collision with root package name */
    public static t0 f708g;

    /* renamed from: h  reason: collision with root package name */
    public static final a f709h = new a();

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap<Context, j<ColorStateList>> f710a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakHashMap<Context, f<WeakReference<Drawable.ConstantState>>> f711b = new WeakHashMap<>(0);

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f712c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public b f713e;

    public static class a extends g<Integer, PorterDuffColorFilter> {
        public a() {
            super(6);
        }
    }

    public interface b {
    }

    public static synchronized t0 c() {
        t0 t0Var;
        synchronized (t0.class) {
            if (f708g == null) {
                f708g = new t0();
            }
            t0Var = f708g;
        }
        return t0Var;
    }

    public static synchronized PorterDuffColorFilter g(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (t0.class) {
            a aVar = f709h;
            aVar.getClass();
            int i11 = (i10 + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) aVar.b(Integer.valueOf(mode.hashCode() + i11));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
                aVar.getClass();
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) aVar.c(Integer.valueOf(mode.hashCode() + i11), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public final synchronized void a(Context context, long j8, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            f fVar = this.f711b.get(context);
            if (fVar == null) {
                fVar = new f();
                this.f711b.put(context, fVar);
            }
            fVar.i(j8, new WeakReference(constantState));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable b(android.content.Context r12, int r13) {
        /*
            r11 = this;
            android.util.TypedValue r0 = r11.f712c
            if (r0 != 0) goto L_0x000b
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r11.f712c = r0
        L_0x000b:
            android.util.TypedValue r0 = r11.f712c
            android.content.res.Resources r1 = r12.getResources()
            r2 = 1
            r1.getValue(r13, r0, r2)
            int r1 = r0.assetCookie
            long r3 = (long) r1
            r1 = 32
            long r3 = r3 << r1
            int r1 = r0.data
            long r5 = (long) r1
            long r3 = r3 | r5
            android.graphics.drawable.Drawable r1 = r11.d(r12, r3)
            if (r1 == 0) goto L_0x0026
            return r1
        L_0x0026:
            androidx.appcompat.widget.t0$b r1 = r11.f713e
            if (r1 != 0) goto L_0x002c
            goto L_0x0104
        L_0x002c:
            r1 = 2131230742(0x7f080016, float:1.8077545E38)
            r5 = 0
            r6 = 2
            if (r13 != r1) goto L_0x004e
            android.graphics.drawable.LayerDrawable r13 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r6]
            r6 = 2131230741(0x7f080015, float:1.8077543E38)
            android.graphics.drawable.Drawable r6 = r11.f(r12, r6)
            r1[r5] = r6
            r5 = 2131230743(0x7f080017, float:1.8077547E38)
            android.graphics.drawable.Drawable r5 = r11.f(r12, r5)
            r1[r2] = r5
            r13.<init>(r1)
            goto L_0x0105
        L_0x004e:
            r1 = 2131230777(0x7f080039, float:1.8077616E38)
            if (r13 != r1) goto L_0x0057
            r13 = 2131165243(0x7f07003b, float:1.7944698E38)
            goto L_0x0068
        L_0x0057:
            r1 = 2131230776(0x7f080038, float:1.8077614E38)
            if (r13 != r1) goto L_0x0060
            r13 = 2131165244(0x7f07003c, float:1.79447E38)
            goto L_0x0068
        L_0x0060:
            r1 = 2131230778(0x7f08003a, float:1.8077618E38)
            if (r13 != r1) goto L_0x0104
            r13 = 2131165245(0x7f07003d, float:1.7944702E38)
        L_0x0068:
            android.content.res.Resources r1 = r12.getResources()
            int r13 = r1.getDimensionPixelSize(r13)
            r1 = 2131230789(0x7f080045, float:1.807764E38)
            android.graphics.drawable.Drawable r1 = r11.f(r12, r1)
            r7 = 2131230790(0x7f080046, float:1.8077643E38)
            android.graphics.drawable.Drawable r7 = r11.f(r12, r7)
            boolean r8 = r1 instanceof android.graphics.drawable.BitmapDrawable
            if (r8 == 0) goto L_0x009a
            int r8 = r1.getIntrinsicWidth()
            if (r8 != r13) goto L_0x009a
            int r8 = r1.getIntrinsicHeight()
            if (r8 != r13) goto L_0x009a
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1
            android.graphics.drawable.BitmapDrawable r8 = new android.graphics.drawable.BitmapDrawable
            android.graphics.Bitmap r9 = r1.getBitmap()
            r8.<init>(r9)
            goto L_0x00b6
        L_0x009a:
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r13, r13, r8)
            android.graphics.Canvas r9 = new android.graphics.Canvas
            r9.<init>(r8)
            r1.setBounds(r5, r5, r13, r13)
            r1.draw(r9)
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            r1.<init>(r8)
            android.graphics.drawable.BitmapDrawable r9 = new android.graphics.drawable.BitmapDrawable
            r9.<init>(r8)
            r8 = r9
        L_0x00b6:
            android.graphics.Shader$TileMode r9 = android.graphics.Shader.TileMode.REPEAT
            r8.setTileModeX(r9)
            boolean r9 = r7 instanceof android.graphics.drawable.BitmapDrawable
            if (r9 == 0) goto L_0x00ce
            int r9 = r7.getIntrinsicWidth()
            if (r9 != r13) goto L_0x00ce
            int r9 = r7.getIntrinsicHeight()
            if (r9 != r13) goto L_0x00ce
            android.graphics.drawable.BitmapDrawable r7 = (android.graphics.drawable.BitmapDrawable) r7
            goto L_0x00e4
        L_0x00ce:
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r13, r13, r9)
            android.graphics.Canvas r10 = new android.graphics.Canvas
            r10.<init>(r9)
            r7.setBounds(r5, r5, r13, r13)
            r7.draw(r10)
            android.graphics.drawable.BitmapDrawable r7 = new android.graphics.drawable.BitmapDrawable
            r7.<init>(r9)
        L_0x00e4:
            android.graphics.drawable.LayerDrawable r13 = new android.graphics.drawable.LayerDrawable
            r9 = 3
            android.graphics.drawable.Drawable[] r9 = new android.graphics.drawable.Drawable[r9]
            r9[r5] = r1
            r9[r2] = r7
            r9[r6] = r8
            r13.<init>(r9)
            r1 = 16908288(0x1020000, float:2.387723E-38)
            r13.setId(r5, r1)
            r1 = 16908303(0x102000f, float:2.387727E-38)
            r13.setId(r2, r1)
            r1 = 16908301(0x102000d, float:2.3877265E-38)
            r13.setId(r6, r1)
            goto L_0x0105
        L_0x0104:
            r13 = 0
        L_0x0105:
            if (r13 == 0) goto L_0x010f
            int r0 = r0.changingConfigurations
            r13.setChangingConfigurations(r0)
            r11.a(r12, r3, r13)
        L_0x010f:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.t0.b(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        r5 = r0.f7307q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable d(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, n.f<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f711b     // Catch:{ all -> 0x0041 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0041 }
            n.f r0 = (n.f) r0     // Catch:{ all -> 0x0041 }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.h(r5, r1)     // Catch:{ all -> 0x0041 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x003f
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0041 }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0041 }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x0041 }
            monitor-exit(r3)
            return r4
        L_0x0028:
            long[] r4 = r0.f7306p     // Catch:{ all -> 0x0041 }
            int r2 = r0.f7308r     // Catch:{ all -> 0x0041 }
            int r4 = n.e.m(r4, r2, r5)     // Catch:{ all -> 0x0041 }
            if (r4 < 0) goto L_0x003f
            java.lang.Object[] r5 = r0.f7307q     // Catch:{ all -> 0x0041 }
            r6 = r5[r4]     // Catch:{ all -> 0x0041 }
            java.lang.Object r2 = n.f.f7304s     // Catch:{ all -> 0x0041 }
            if (r6 == r2) goto L_0x003f
            r5[r4] = r2     // Catch:{ all -> 0x0041 }
            r4 = 1
            r0.f7305o = r4     // Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r3)
            return r1
        L_0x0041:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.t0.d(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (r0 == false) goto L_0x00ec;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00db A[Catch:{ all -> 0x0062 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable e(int r12, android.content.Context r13, boolean r14) {
        /*
            r11 = this;
            monitor-enter(r11)
            boolean r0 = r11.d     // Catch:{ all -> 0x0062 }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0008
            goto L_0x002d
        L_0x0008:
            r11.d = r2     // Catch:{ all -> 0x0062 }
            r0 = 2131230804(0x7f080054, float:1.8077671E38)
            android.graphics.drawable.Drawable r0 = r11.f(r13, r0)     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x00ec
            boolean r3 = r0 instanceof d1.b     // Catch:{ all -> 0x0062 }
            if (r3 != 0) goto L_0x002a
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0062 }
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r0 = r1
            goto L_0x002b
        L_0x002a:
            r0 = r2
        L_0x002b:
            if (r0 == 0) goto L_0x00ec
        L_0x002d:
            android.graphics.drawable.Drawable r0 = r11.b(r13, r12)     // Catch:{ all -> 0x0062 }
            if (r0 != 0) goto L_0x0039
            java.lang.Object r0 = y.a.f9523a     // Catch:{ all -> 0x0062 }
            android.graphics.drawable.Drawable r0 = y.a.c.b(r13, r12)     // Catch:{ all -> 0x0062 }
        L_0x0039:
            if (r0 == 0) goto L_0x00e5
            android.content.res.ColorStateList r3 = r11.h(r13, r12)     // Catch:{ all -> 0x0062 }
            r4 = 0
            if (r3 == 0) goto L_0x0065
            boolean r13 = androidx.appcompat.widget.k0.a(r0)     // Catch:{ all -> 0x0062 }
            if (r13 == 0) goto L_0x004c
            android.graphics.drawable.Drawable r0 = r0.mutate()     // Catch:{ all -> 0x0062 }
        L_0x004c:
            r0.setTintList(r3)     // Catch:{ all -> 0x0062 }
            androidx.appcompat.widget.t0$b r13 = r11.f713e     // Catch:{ all -> 0x0062 }
            if (r13 != 0) goto L_0x0054
            goto L_0x005b
        L_0x0054:
            r13 = 2131230791(0x7f080047, float:1.8077645E38)
            if (r12 != r13) goto L_0x005b
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.MULTIPLY     // Catch:{ all -> 0x0062 }
        L_0x005b:
            if (r4 == 0) goto L_0x00e5
            r0.setTintMode(r4)     // Catch:{ all -> 0x0062 }
            goto L_0x00e5
        L_0x0062:
            r12 = move-exception
            goto L_0x00f6
        L_0x0065:
            androidx.appcompat.widget.t0$b r3 = r11.f713e     // Catch:{ all -> 0x0062 }
            if (r3 == 0) goto L_0x00dc
            r3 = 2131230786(0x7f080042, float:1.8077635E38)
            r5 = 16908301(0x102000d, float:2.3877265E-38)
            r6 = 16908303(0x102000f, float:2.387727E-38)
            r7 = 16908288(0x1020000, float:2.387723E-38)
            r8 = 2130968799(0x7f0400df, float:1.7546262E38)
            r9 = 2130968801(0x7f0400e1, float:1.7546266E38)
            if (r12 != r3) goto L_0x00a3
            r1 = r0
            android.graphics.drawable.LayerDrawable r1 = (android.graphics.drawable.LayerDrawable) r1     // Catch:{ all -> 0x0062 }
            android.graphics.drawable.Drawable r3 = r1.findDrawableByLayerId(r7)     // Catch:{ all -> 0x0062 }
            int r7 = androidx.appcompat.widget.z0.c(r13, r9)     // Catch:{ all -> 0x0062 }
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.k.f618b     // Catch:{ all -> 0x0062 }
            androidx.appcompat.widget.k.a.d(r3, r7, r10)     // Catch:{ all -> 0x0062 }
            android.graphics.drawable.Drawable r3 = r1.findDrawableByLayerId(r6)     // Catch:{ all -> 0x0062 }
            int r6 = androidx.appcompat.widget.z0.c(r13, r9)     // Catch:{ all -> 0x0062 }
            androidx.appcompat.widget.k.a.d(r3, r6, r10)     // Catch:{ all -> 0x0062 }
            android.graphics.drawable.Drawable r1 = r1.findDrawableByLayerId(r5)     // Catch:{ all -> 0x0062 }
            int r3 = androidx.appcompat.widget.z0.c(r13, r8)     // Catch:{ all -> 0x0062 }
            androidx.appcompat.widget.k.a.d(r1, r3, r10)     // Catch:{ all -> 0x0062 }
            goto L_0x00d8
        L_0x00a3:
            r3 = 2131230777(0x7f080039, float:1.8077616E38)
            if (r12 == r3) goto L_0x00b2
            r3 = 2131230776(0x7f080038, float:1.8077614E38)
            if (r12 == r3) goto L_0x00b2
            r3 = 2131230778(0x7f08003a, float:1.8077618E38)
            if (r12 != r3) goto L_0x00d9
        L_0x00b2:
            r1 = r0
            android.graphics.drawable.LayerDrawable r1 = (android.graphics.drawable.LayerDrawable) r1     // Catch:{ all -> 0x0062 }
            android.graphics.drawable.Drawable r3 = r1.findDrawableByLayerId(r7)     // Catch:{ all -> 0x0062 }
            int r7 = androidx.appcompat.widget.z0.b(r13, r9)     // Catch:{ all -> 0x0062 }
            android.graphics.PorterDuff$Mode r9 = androidx.appcompat.widget.k.f618b     // Catch:{ all -> 0x0062 }
            androidx.appcompat.widget.k.a.d(r3, r7, r9)     // Catch:{ all -> 0x0062 }
            android.graphics.drawable.Drawable r3 = r1.findDrawableByLayerId(r6)     // Catch:{ all -> 0x0062 }
            int r6 = androidx.appcompat.widget.z0.c(r13, r8)     // Catch:{ all -> 0x0062 }
            androidx.appcompat.widget.k.a.d(r3, r6, r9)     // Catch:{ all -> 0x0062 }
            android.graphics.drawable.Drawable r1 = r1.findDrawableByLayerId(r5)     // Catch:{ all -> 0x0062 }
            int r3 = androidx.appcompat.widget.z0.c(r13, r8)     // Catch:{ all -> 0x0062 }
            androidx.appcompat.widget.k.a.d(r1, r3, r9)     // Catch:{ all -> 0x0062 }
        L_0x00d8:
            r1 = r2
        L_0x00d9:
            if (r1 == 0) goto L_0x00dc
            goto L_0x00e5
        L_0x00dc:
            boolean r12 = r11.i(r13, r12, r0)     // Catch:{ all -> 0x0062 }
            if (r12 != 0) goto L_0x00e5
            if (r14 == 0) goto L_0x00e5
            r0 = r4
        L_0x00e5:
            if (r0 == 0) goto L_0x00ea
            androidx.appcompat.widget.k0.b(r0)     // Catch:{ all -> 0x0062 }
        L_0x00ea:
            monitor-exit(r11)
            return r0
        L_0x00ec:
            r11.d = r1     // Catch:{ all -> 0x0062 }
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0062 }
            java.lang.String r13 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r12.<init>(r13)     // Catch:{ all -> 0x0062 }
            throw r12     // Catch:{ all -> 0x0062 }
        L_0x00f6:
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.t0.e(int, android.content.Context, boolean):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable f(Context context, int i10) {
        return e(i10, context, false);
    }

    public final synchronized ColorStateList h(Context context, int i10) {
        ColorStateList colorStateList;
        j jVar;
        try {
            WeakHashMap<Context, j<ColorStateList>> weakHashMap = this.f710a;
            ColorStateList colorStateList2 = null;
            if (weakHashMap == null || (jVar = weakHashMap.get(context)) == null) {
                colorStateList = null;
            } else {
                colorStateList = (ColorStateList) jVar.h(i10, (Integer) null);
            }
            if (colorStateList == null) {
                b bVar = this.f713e;
                if (bVar != null) {
                    colorStateList2 = ((k.a) bVar).c(context, i10);
                }
                if (colorStateList2 != null) {
                    if (this.f710a == null) {
                        this.f710a = new WeakHashMap<>();
                    }
                    j jVar2 = this.f710a.get(context);
                    if (jVar2 == null) {
                        jVar2 = new j();
                        this.f710a.put(context, jVar2);
                    }
                    jVar2.c(i10, colorStateList2);
                }
                colorStateList = colorStateList2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return colorStateList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
        /*
            r6 = this;
            androidx.appcompat.widget.t0$b r0 = r6.f713e
            r1 = 0
            if (r0 == 0) goto L_0x0074
            androidx.appcompat.widget.k$a r0 = (androidx.appcompat.widget.k.a) r0
            android.graphics.PorterDuff$Mode r2 = androidx.appcompat.widget.k.f618b
            int[] r3 = r0.f621a
            boolean r3 = androidx.appcompat.widget.k.a.a(r3, r8)
            r4 = 1
            r5 = -1
            if (r3 == 0) goto L_0x0017
            r8 = 2130968801(0x7f0400e1, float:1.7546266E38)
            goto L_0x004a
        L_0x0017:
            int[] r3 = r0.f623c
            boolean r3 = androidx.appcompat.widget.k.a.a(r3, r8)
            if (r3 == 0) goto L_0x0023
            r8 = 2130968799(0x7f0400df, float:1.7546262E38)
            goto L_0x004a
        L_0x0023:
            int[] r0 = r0.d
            boolean r0 = androidx.appcompat.widget.k.a.a(r0, r8)
            if (r0 == 0) goto L_0x002e
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0047
        L_0x002e:
            r0 = 2131230763(0x7f08002b, float:1.8077588E38)
            if (r8 != r0) goto L_0x0042
            r8 = 1109603123(0x42233333, float:40.8)
            int r8 = java.lang.Math.round(r8)
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            r3 = r2
            r2 = r0
            r0 = r8
            r8 = r4
            goto L_0x0052
        L_0x0042:
            r0 = 2131230745(0x7f080019, float:1.8077551E38)
            if (r8 != r0) goto L_0x004d
        L_0x0047:
            r8 = 16842801(0x1010031, float:2.3693695E-38)
        L_0x004a:
            r0 = r8
            r8 = r4
            goto L_0x004f
        L_0x004d:
            r8 = r1
            r0 = r8
        L_0x004f:
            r3 = r2
            r2 = r0
            r0 = r5
        L_0x0052:
            if (r8 == 0) goto L_0x0070
            boolean r8 = androidx.appcompat.widget.k0.a(r9)
            if (r8 == 0) goto L_0x005e
            android.graphics.drawable.Drawable r9 = r9.mutate()
        L_0x005e:
            int r7 = androidx.appcompat.widget.z0.c(r7, r2)
            android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.k.c(r7, r3)
            r9.setColorFilter(r7)
            if (r0 == r5) goto L_0x006e
            r9.setAlpha(r0)
        L_0x006e:
            r7 = r4
            goto L_0x0071
        L_0x0070:
            r7 = r1
        L_0x0071:
            if (r7 == 0) goto L_0x0074
            r1 = r4
        L_0x0074:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.t0.i(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}

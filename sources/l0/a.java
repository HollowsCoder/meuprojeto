package l0;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import i0.b0;
import i0.w;
import java.util.WeakHashMap;

public abstract class a implements View.OnTouchListener {
    public static final int E = ViewConfiguration.getTapTimeout();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;

    /* renamed from: o  reason: collision with root package name */
    public final C0098a f6840o;

    /* renamed from: p  reason: collision with root package name */
    public final AccelerateInterpolator f6841p = new AccelerateInterpolator();

    /* renamed from: q  reason: collision with root package name */
    public final View f6842q;

    /* renamed from: r  reason: collision with root package name */
    public b f6843r;

    /* renamed from: s  reason: collision with root package name */
    public final float[] f6844s;

    /* renamed from: t  reason: collision with root package name */
    public final float[] f6845t;
    public int u;

    /* renamed from: v  reason: collision with root package name */
    public int f6846v;
    public final float[] w;

    /* renamed from: x  reason: collision with root package name */
    public final float[] f6847x;

    /* renamed from: y  reason: collision with root package name */
    public final float[] f6848y;
    public boolean z;

    /* renamed from: l0.a$a  reason: collision with other inner class name */
    public static class C0098a {

        /* renamed from: a  reason: collision with root package name */
        public int f6849a;

        /* renamed from: b  reason: collision with root package name */
        public int f6850b;

        /* renamed from: c  reason: collision with root package name */
        public float f6851c;
        public float d;

        /* renamed from: e  reason: collision with root package name */
        public long f6852e = Long.MIN_VALUE;

        /* renamed from: f  reason: collision with root package name */
        public long f6853f = 0;

        /* renamed from: g  reason: collision with root package name */
        public long f6854g = -1;

        /* renamed from: h  reason: collision with root package name */
        public float f6855h;

        /* renamed from: i  reason: collision with root package name */
        public int f6856i;

        public final float a(long j8) {
            long j10 = this.f6852e;
            if (j8 < j10) {
                return 0.0f;
            }
            long j11 = this.f6854g;
            if (j11 < 0 || j8 < j11) {
                return a.b(((float) (j8 - j10)) / ((float) this.f6849a), 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f6855h;
            return (a.b(((float) (j8 - j11)) / ((float) this.f6856i), 0.0f, 1.0f) * f10) + (1.0f - f10);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            boolean z;
            a aVar = a.this;
            if (aVar.C) {
                boolean z10 = aVar.A;
                C0098a aVar2 = aVar.f6840o;
                if (z10) {
                    aVar.A = false;
                    aVar2.getClass();
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    aVar2.f6852e = currentAnimationTimeMillis;
                    aVar2.f6854g = -1;
                    aVar2.f6853f = currentAnimationTimeMillis;
                    aVar2.f6855h = 0.5f;
                }
                if (aVar2.f6854g <= 0 || AnimationUtils.currentAnimationTimeMillis() <= aVar2.f6854g + ((long) aVar2.f6856i)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z || !aVar.e()) {
                    aVar.C = false;
                    return;
                }
                boolean z11 = aVar.B;
                View view = aVar.f6842q;
                if (z11) {
                    aVar.B = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (aVar2.f6853f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a10 = aVar2.a(currentAnimationTimeMillis2);
                    aVar2.f6853f = currentAnimationTimeMillis2;
                    ((d) aVar).F.scrollListBy((int) (((float) (currentAnimationTimeMillis2 - aVar2.f6853f)) * ((a10 * 4.0f) + (-4.0f * a10 * a10)) * aVar2.d));
                    WeakHashMap<View, b0> weakHashMap = w.f6004a;
                    w.d.m(view, this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
        }
    }

    public a(View view) {
        C0098a aVar = new C0098a();
        this.f6840o = aVar;
        float[] fArr = {0.0f, 0.0f};
        this.f6844s = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f6845t = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.w = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f6847x = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f6848y = fArr5;
        this.f6842q = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = ((float) ((int) ((1575.0f * f10) + 0.5f))) / 1000.0f;
        fArr5[0] = f11;
        fArr5[1] = f11;
        float f12 = ((float) ((int) ((f10 * 315.0f) + 0.5f))) / 1000.0f;
        fArr4[0] = f12;
        fArr4[1] = f12;
        this.u = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f6846v = E;
        aVar.f6849a = 500;
        aVar.f6850b = 500;
    }

    public static float b(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f6844s
            r0 = r0[r7]
            float[] r1 = r3.f6845t
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f6841p
            if (r5 >= 0) goto L_0x0025
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L_0x002d
        L_0x0025:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x0036
            float r4 = r0.getInterpolation(r4)
        L_0x002d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = b(r4, r5, r0)
            goto L_0x0037
        L_0x0036:
            r4 = r2
        L_0x0037:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x003c
            return r2
        L_0x003c:
            float[] r0 = r3.w
            r0 = r0[r7]
            float[] r1 = r3.f6847x
            r1 = r1[r7]
            float[] r2 = r3.f6848y
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L_0x0051
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            return r4
        L_0x0051:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.a.a(float, float, float, int):float");
    }

    public final float c(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.u;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                return f10 >= 0.0f ? 1.0f - (f10 / f11) : (!this.C || i10 != 1) ? 0.0f : 1.0f;
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
    }

    public final void d() {
        int i10 = 0;
        if (this.A) {
            this.C = false;
            return;
        }
        C0098a aVar = this.f6840o;
        aVar.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i11 = (int) (currentAnimationTimeMillis - aVar.f6852e);
        int i12 = aVar.f6850b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        aVar.f6856i = i10;
        aVar.f6855h = aVar.a(currentAnimationTimeMillis);
        aVar.f6854g = currentAnimationTimeMillis;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e() {
        /*
            r9 = this;
            l0.a$a r0 = r9.f6840o
            float r1 = r0.d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f6851c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 0
            if (r1 == 0) goto L_0x0055
            r3 = r9
            l0.d r3 = (l0.d) r3
            android.widget.ListView r3 = r3.F
            int r4 = r3.getCount()
            r5 = 1
            if (r4 != 0) goto L_0x0023
        L_0x0021:
            r1 = r2
            goto L_0x0051
        L_0x0023:
            int r6 = r3.getChildCount()
            int r7 = r3.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L_0x0041
            if (r8 < r4) goto L_0x0050
            int r6 = r6 - r5
            android.view.View r1 = r3.getChildAt(r6)
            int r1 = r1.getBottom()
            int r3 = r3.getHeight()
            if (r1 > r3) goto L_0x0050
            goto L_0x0021
        L_0x0041:
            if (r1 >= 0) goto L_0x0021
            if (r7 > 0) goto L_0x0050
            android.view.View r1 = r3.getChildAt(r2)
            int r1 = r1.getTop()
            if (r1 < 0) goto L_0x0050
            goto L_0x0021
        L_0x0050:
            r1 = r5
        L_0x0051:
            if (r1 != 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r2 = r5
        L_0x0055:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.a.e():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.D
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r8 = 3
            if (r0 == r8) goto L_0x0016
            goto L_0x007b
        L_0x0016:
            r7.d()
            goto L_0x007b
        L_0x001a:
            r7.B = r2
            r7.z = r1
        L_0x001e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r7.f6842q
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r9, r8, r3, r2)
            l0.a$a r9 = r7.f6840o
            r9.f6851c = r0
            r9.d = r8
            boolean r8 = r7.C
            if (r8 != 0) goto L_0x007b
            boolean r8 = r7.e()
            if (r8 == 0) goto L_0x007b
            l0.a$b r8 = r7.f6843r
            if (r8 != 0) goto L_0x005f
            l0.a$b r8 = new l0.a$b
            r8.<init>()
            r7.f6843r = r8
        L_0x005f:
            r7.C = r2
            r7.A = r2
            boolean r8 = r7.z
            if (r8 != 0) goto L_0x0074
            int r8 = r7.f6846v
            if (r8 <= 0) goto L_0x0074
            l0.a$b r9 = r7.f6843r
            long r5 = (long) r8
            java.util.WeakHashMap<android.view.View, i0.b0> r8 = i0.w.f6004a
            i0.w.d.n(r4, r9, r5)
            goto L_0x0079
        L_0x0074:
            l0.a$b r8 = r7.f6843r
            r8.run()
        L_0x0079:
            r7.z = r2
        L_0x007b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}

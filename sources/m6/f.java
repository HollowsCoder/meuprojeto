package m6;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;
import m6.j;
import m6.l;
import n.e;

public class f extends Drawable implements m {
    public static final Paint K = new Paint(1);
    public i A;
    public final Paint B;
    public final Paint C;
    public final l6.a D;
    public final a E;
    public final j F;
    public PorterDuffColorFilter G;
    public PorterDuffColorFilter H;
    public final RectF I;
    public final boolean J;

    /* renamed from: o  reason: collision with root package name */
    public b f7121o;

    /* renamed from: p  reason: collision with root package name */
    public final l.f[] f7122p;

    /* renamed from: q  reason: collision with root package name */
    public final l.f[] f7123q;

    /* renamed from: r  reason: collision with root package name */
    public final BitSet f7124r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f7125s;

    /* renamed from: t  reason: collision with root package name */
    public final Matrix f7126t;
    public final Path u;

    /* renamed from: v  reason: collision with root package name */
    public final Path f7127v;
    public final RectF w;

    /* renamed from: x  reason: collision with root package name */
    public final RectF f7128x;

    /* renamed from: y  reason: collision with root package name */
    public final Region f7129y;
    public final Region z;

    public class a {
        public a() {
        }
    }

    public static final class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public i f7131a;

        /* renamed from: b  reason: collision with root package name */
        public e6.a f7132b;

        /* renamed from: c  reason: collision with root package name */
        public ColorStateList f7133c = null;
        public ColorStateList d = null;

        /* renamed from: e  reason: collision with root package name */
        public final ColorStateList f7134e = null;

        /* renamed from: f  reason: collision with root package name */
        public ColorStateList f7135f = null;

        /* renamed from: g  reason: collision with root package name */
        public PorterDuff.Mode f7136g = PorterDuff.Mode.SRC_IN;

        /* renamed from: h  reason: collision with root package name */
        public Rect f7137h = null;

        /* renamed from: i  reason: collision with root package name */
        public final float f7138i = 1.0f;

        /* renamed from: j  reason: collision with root package name */
        public float f7139j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f7140k;
        public int l = 255;

        /* renamed from: m  reason: collision with root package name */
        public float f7141m = 0.0f;

        /* renamed from: n  reason: collision with root package name */
        public float f7142n = 0.0f;

        /* renamed from: o  reason: collision with root package name */
        public final float f7143o = 0.0f;

        /* renamed from: p  reason: collision with root package name */
        public final int f7144p = 0;

        /* renamed from: q  reason: collision with root package name */
        public int f7145q = 0;

        /* renamed from: r  reason: collision with root package name */
        public int f7146r = 0;

        /* renamed from: s  reason: collision with root package name */
        public int f7147s = 0;

        /* renamed from: t  reason: collision with root package name */
        public boolean f7148t = false;
        public final Paint.Style u = Paint.Style.FILL_AND_STROKE;

        public b(b bVar) {
            this.f7131a = bVar.f7131a;
            this.f7132b = bVar.f7132b;
            this.f7140k = bVar.f7140k;
            this.f7133c = bVar.f7133c;
            this.d = bVar.d;
            this.f7136g = bVar.f7136g;
            this.f7135f = bVar.f7135f;
            this.l = bVar.l;
            this.f7138i = bVar.f7138i;
            this.f7146r = bVar.f7146r;
            this.f7144p = bVar.f7144p;
            this.f7148t = bVar.f7148t;
            this.f7139j = bVar.f7139j;
            this.f7141m = bVar.f7141m;
            this.f7142n = bVar.f7142n;
            this.f7143o = bVar.f7143o;
            this.f7145q = bVar.f7145q;
            this.f7147s = bVar.f7147s;
            this.f7134e = bVar.f7134e;
            this.u = bVar.u;
            if (bVar.f7137h != null) {
                this.f7137h = new Rect(bVar.f7137h);
            }
        }

        public b(i iVar) {
            this.f7131a = iVar;
            this.f7132b = null;
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            f fVar = new f(this);
            fVar.f7125s = true;
            return fVar;
        }
    }

    public f() {
        this(new i());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(android.content.Context r4, android.util.AttributeSet r5, int r6, int r7) {
        /*
            r3 = this;
            m6.a r0 = new m6.a
            r1 = 0
            float r2 = (float) r1
            r0.<init>(r2)
            int[] r2 = p9.u.J
            android.content.res.TypedArray r5 = r4.obtainStyledAttributes(r5, r2, r6, r7)
            int r6 = r5.getResourceId(r1, r1)
            r7 = 1
            int r7 = r5.getResourceId(r7, r1)
            r5.recycle()
            m6.i$a r4 = m6.i.a(r4, r6, r7, r0)
            m6.i r5 = new m6.i
            r5.<init>(r4)
            r3.<init>((m6.i) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.f.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    public f(i iVar) {
        this(new b(iVar));
    }

    public final void b(RectF rectF, Path path) {
        j jVar = this.F;
        b bVar = this.f7121o;
        i iVar = bVar.f7131a;
        float f10 = bVar.f7139j;
        jVar.a(iVar, f10, rectF, this.E, path);
        if (this.f7121o.f7138i != 1.0f) {
            Matrix matrix = this.f7126t;
            matrix.reset();
            float f11 = this.f7121o.f7138i;
            matrix.setScale(f11, f11, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.I, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        r2 = r4.getColor();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.PorterDuffColorFilter c(android.content.res.ColorStateList r2, android.graphics.PorterDuff.Mode r3, android.graphics.Paint r4, boolean r5) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x001a
            if (r3 != 0) goto L_0x0005
            goto L_0x001a
        L_0x0005:
            int[] r4 = r1.getState()
            r0 = 0
            int r2 = r2.getColorForState(r4, r0)
            if (r5 == 0) goto L_0x0014
            int r2 = r1.d(r2)
        L_0x0014:
            android.graphics.PorterDuffColorFilter r4 = new android.graphics.PorterDuffColorFilter
            r4.<init>(r2, r3)
            goto L_0x0030
        L_0x001a:
            if (r5 == 0) goto L_0x002e
            int r2 = r4.getColor()
            int r3 = r1.d(r2)
            if (r3 == r2) goto L_0x002e
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.<init>(r3, r4)
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            r4 = r2
        L_0x0030:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.f.c(android.content.res.ColorStateList, android.graphics.PorterDuff$Mode, android.graphics.Paint, boolean):android.graphics.PorterDuffColorFilter");
    }

    public final int d(int i10) {
        boolean z10;
        b bVar = this.f7121o;
        float f10 = bVar.f7142n + bVar.f7143o + bVar.f7141m;
        e6.a aVar = bVar.f7132b;
        if (aVar == null || !aVar.f4491a) {
            return i10;
        }
        if (b0.a.c(i10, 255) == aVar.f4493c) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return i10;
        }
        float f11 = aVar.d;
        float f12 = 0.0f;
        if (f11 > 0.0f && f10 > 0.0f) {
            f12 = Math.min(((((float) Math.log1p((double) (f10 / f11))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        }
        return b0.a.c(e.C(f12, b0.a.c(i10, 255), aVar.f4492b), Color.alpha(i10));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0129, code lost:
        if (r0 != false) goto L_0x012b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x021c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r21) {
        /*
            r20 = this;
            r6 = r20
            r7 = r21
            android.graphics.Paint r8 = r6.B
            android.graphics.PorterDuffColorFilter r0 = r6.G
            r8.setColorFilter(r0)
            int r9 = r8.getAlpha()
            m6.f$b r0 = r6.f7121o
            int r0 = r0.l
            int r1 = r0 >>> 7
            int r0 = r0 + r1
            int r0 = r0 * r9
            int r0 = r0 >>> 8
            r8.setAlpha(r0)
            android.graphics.Paint r10 = r6.C
            android.graphics.PorterDuffColorFilter r0 = r6.H
            r10.setColorFilter(r0)
            m6.f$b r0 = r6.f7121o
            float r0 = r0.f7140k
            r10.setStrokeWidth(r0)
            int r11 = r10.getAlpha()
            m6.f$b r0 = r6.f7121o
            int r0 = r0.l
            int r1 = r0 >>> 7
            int r0 = r0 + r1
            int r0 = r0 * r11
            int r0 = r0 >>> 8
            r10.setAlpha(r0)
            boolean r0 = r6.f7125s
            android.graphics.Path r5 = r6.f7127v
            android.graphics.Path r3 = r6.u
            android.graphics.RectF r4 = r6.f7128x
            r18 = 1073741824(0x40000000, float:2.0)
            r19 = 0
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L_0x0101
            m6.f$b r0 = r6.f7121o
            android.graphics.Paint$Style r0 = r0.u
            android.graphics.Paint$Style r12 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r0 == r12) goto L_0x0057
            android.graphics.Paint$Style r12 = android.graphics.Paint.Style.STROKE
            if (r0 != r12) goto L_0x0061
        L_0x0057:
            float r0 = r10.getStrokeWidth()
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x0061
            r0 = r2
            goto L_0x0062
        L_0x0061:
            r0 = r1
        L_0x0062:
            if (r0 == 0) goto L_0x006b
            float r0 = r10.getStrokeWidth()
            float r0 = r0 / r18
            goto L_0x006d
        L_0x006b:
            r0 = r19
        L_0x006d:
            float r0 = -r0
            m6.f$b r12 = r6.f7121o
            m6.i r12 = r12.f7131a
            r12.getClass()
            m6.i$a r13 = new m6.i$a
            r13.<init>(r12)
            m6.c r14 = r12.f7154e
            boolean r15 = r14 instanceof m6.g
            if (r15 == 0) goto L_0x0081
            goto L_0x0087
        L_0x0081:
            m6.b r15 = new m6.b
            r15.<init>(r0, r14)
            r14 = r15
        L_0x0087:
            r13.f7164e = r14
            m6.c r14 = r12.f7155f
            boolean r15 = r14 instanceof m6.g
            if (r15 == 0) goto L_0x0090
            goto L_0x0096
        L_0x0090:
            m6.b r15 = new m6.b
            r15.<init>(r0, r14)
            r14 = r15
        L_0x0096:
            r13.f7165f = r14
            m6.c r14 = r12.f7157h
            boolean r15 = r14 instanceof m6.g
            if (r15 == 0) goto L_0x009f
            goto L_0x00a5
        L_0x009f:
            m6.b r15 = new m6.b
            r15.<init>(r0, r14)
            r14 = r15
        L_0x00a5:
            r13.f7167h = r14
            m6.c r12 = r12.f7156g
            boolean r14 = r12 instanceof m6.g
            if (r14 == 0) goto L_0x00ae
            goto L_0x00b4
        L_0x00ae:
            m6.b r14 = new m6.b
            r14.<init>(r0, r12)
            r12 = r14
        L_0x00b4:
            r13.f7166g = r12
            m6.i r0 = new m6.i
            r0.<init>(r13)
            r6.A = r0
            m6.f$b r12 = r6.f7121o
            float r14 = r12.f7139j
            android.graphics.RectF r12 = r20.g()
            r4.set(r12)
            m6.f$b r12 = r6.f7121o
            android.graphics.Paint$Style r12 = r12.u
            android.graphics.Paint$Style r13 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r12 == r13) goto L_0x00d4
            android.graphics.Paint$Style r13 = android.graphics.Paint.Style.STROKE
            if (r12 != r13) goto L_0x00de
        L_0x00d4:
            float r12 = r10.getStrokeWidth()
            int r12 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r12 <= 0) goto L_0x00de
            r12 = r2
            goto L_0x00df
        L_0x00de:
            r12 = r1
        L_0x00df:
            if (r12 == 0) goto L_0x00e8
            float r12 = r10.getStrokeWidth()
            float r12 = r12 / r18
            goto L_0x00ea
        L_0x00e8:
            r12 = r19
        L_0x00ea:
            r4.inset(r12, r12)
            m6.j r12 = r6.F
            r16 = 0
            r13 = r0
            r15 = r4
            r17 = r5
            r12.a(r13, r14, r15, r16, r17)
            android.graphics.RectF r0 = r20.g()
            r6.b(r0, r3)
            r6.f7125s = r1
        L_0x0101:
            m6.f$b r0 = r6.f7121o
            int r12 = r0.f7144p
            r13 = 2
            if (r12 == r2) goto L_0x012d
            int r14 = r0.f7145q
            if (r14 <= 0) goto L_0x012d
            if (r12 == r13) goto L_0x012b
            int r12 = android.os.Build.VERSION.SDK_INT
            m6.i r0 = r0.f7131a
            android.graphics.RectF r14 = r20.g()
            boolean r0 = r0.c(r14)
            if (r0 != 0) goto L_0x0128
            boolean r0 = r3.isConvex()
            if (r0 != 0) goto L_0x0128
            r0 = 29
            if (r12 >= r0) goto L_0x0128
            r0 = r2
            goto L_0x0129
        L_0x0128:
            r0 = r1
        L_0x0129:
            if (r0 == 0) goto L_0x012d
        L_0x012b:
            r0 = r2
            goto L_0x012e
        L_0x012d:
            r0 = r1
        L_0x012e:
            if (r0 != 0) goto L_0x0132
            goto L_0x01d9
        L_0x0132:
            r21.save()
            m6.f$b r0 = r6.f7121o
            int r12 = r0.f7146r
            double r14 = (double) r12
            int r0 = r0.f7147s
            double r1 = (double) r0
            double r0 = java.lang.Math.toRadians(r1)
            double r0 = java.lang.Math.sin(r0)
            double r0 = r0 * r14
            int r0 = (int) r0
            m6.f$b r1 = r6.f7121o
            int r2 = r1.f7146r
            double r14 = (double) r2
            int r1 = r1.f7147s
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            double r1 = java.lang.Math.cos(r1)
            double r1 = r1 * r14
            int r1 = (int) r1
            float r0 = (float) r0
            float r1 = (float) r1
            r7.translate(r0, r1)
            boolean r0 = r6.J
            if (r0 != 0) goto L_0x0166
            r20.e(r21)
            goto L_0x01d6
        L_0x0166:
            android.graphics.RectF r0 = r6.I
            float r1 = r0.width()
            android.graphics.Rect r2 = r20.getBounds()
            int r2 = r2.width()
            float r2 = (float) r2
            float r1 = r1 - r2
            int r1 = (int) r1
            float r2 = r0.height()
            android.graphics.Rect r14 = r20.getBounds()
            int r14 = r14.height()
            float r14 = (float) r14
            float r2 = r2 - r14
            int r2 = (int) r2
            if (r1 < 0) goto L_0x025a
            if (r2 < 0) goto L_0x025a
            float r14 = r0.width()
            int r14 = (int) r14
            m6.f$b r15 = r6.f7121o
            int r15 = r15.f7145q
            int r15 = r15 * r13
            int r15 = r15 + r14
            int r15 = r15 + r1
            float r0 = r0.height()
            int r0 = (int) r0
            m6.f$b r14 = r6.f7121o
            int r14 = r14.f7145q
            int r14 = r14 * r13
            int r14 = r14 + r0
            int r14 = r14 + r2
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r15, r14, r0)
            android.graphics.Canvas r13 = new android.graphics.Canvas
            r13.<init>(r0)
            android.graphics.Rect r14 = r20.getBounds()
            int r14 = r14.left
            m6.f$b r15 = r6.f7121o
            int r15 = r15.f7145q
            int r14 = r14 - r15
            int r14 = r14 - r1
            float r1 = (float) r14
            android.graphics.Rect r14 = r20.getBounds()
            int r14 = r14.top
            m6.f$b r15 = r6.f7121o
            int r15 = r15.f7145q
            int r14 = r14 - r15
            int r14 = r14 - r2
            float r2 = (float) r14
            float r14 = -r1
            float r15 = -r2
            r13.translate(r14, r15)
            r6.e(r13)
            r13 = 0
            r7.drawBitmap(r0, r1, r2, r13)
            r0.recycle()
        L_0x01d6:
            r21.restore()
        L_0x01d9:
            m6.f$b r0 = r6.f7121o
            android.graphics.Paint$Style r1 = r0.u
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r1 == r2) goto L_0x01e8
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            if (r1 != r2) goto L_0x01e6
            goto L_0x01e8
        L_0x01e6:
            r1 = 0
            goto L_0x01e9
        L_0x01e8:
            r1 = 1
        L_0x01e9:
            if (r1 == 0) goto L_0x0200
            m6.i r13 = r0.f7131a
            android.graphics.RectF r14 = r20.g()
            r0 = r20
            r15 = 0
            r1 = r21
            r12 = 1
            r2 = r8
            r12 = r4
            r4 = r13
            r13 = r5
            r5 = r14
            r0.f(r1, r2, r3, r4, r5)
            goto L_0x0203
        L_0x0200:
            r12 = r4
            r13 = r5
            r15 = 0
        L_0x0203:
            m6.f$b r0 = r6.f7121o
            android.graphics.Paint$Style r0 = r0.u
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r0 == r1) goto L_0x020f
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            if (r0 != r1) goto L_0x0219
        L_0x020f:
            float r0 = r10.getStrokeWidth()
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x0219
            r2 = 1
            goto L_0x021a
        L_0x0219:
            r2 = r15
        L_0x021a:
            if (r2 == 0) goto L_0x0253
            m6.i r4 = r6.A
            android.graphics.RectF r0 = r20.g()
            r12.set(r0)
            m6.f$b r0 = r6.f7121o
            android.graphics.Paint$Style r0 = r0.u
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r0 == r1) goto L_0x0231
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            if (r0 != r1) goto L_0x023b
        L_0x0231:
            float r0 = r10.getStrokeWidth()
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x023b
            r2 = 1
            goto L_0x023c
        L_0x023b:
            r2 = r15
        L_0x023c:
            if (r2 == 0) goto L_0x0244
            float r0 = r10.getStrokeWidth()
            float r19 = r0 / r18
        L_0x0244:
            r0 = r19
            r12.inset(r0, r0)
            r0 = r20
            r1 = r21
            r2 = r10
            r3 = r13
            r5 = r12
            r0.f(r1, r2, r3, r4, r5)
        L_0x0253:
            r8.setAlpha(r9)
            r10.setAlpha(r11)
            return
        L_0x025a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Invalid shadow bounds. Check that the treatments result in a valid path."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.f.draw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas) {
        if (this.f7124r.cardinality() > 0) {
            Log.w("f", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i10 = this.f7121o.f7146r;
        Path path = this.u;
        l6.a aVar = this.D;
        if (i10 != 0) {
            canvas.drawPath(path, aVar.f6965a);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            l.f fVar = this.f7122p[i11];
            int i12 = this.f7121o.f7145q;
            Matrix matrix = l.f.f7203a;
            fVar.a(matrix, aVar, i12, canvas);
            this.f7123q[i11].a(matrix, aVar, this.f7121o.f7145q, canvas);
        }
        if (this.J) {
            b bVar = this.f7121o;
            int sin = (int) (Math.sin(Math.toRadians((double) bVar.f7147s)) * ((double) bVar.f7146r));
            b bVar2 = this.f7121o;
            int cos = (int) (Math.cos(Math.toRadians((double) bVar2.f7147s)) * ((double) bVar2.f7146r));
            canvas.translate((float) (-sin), (float) (-cos));
            canvas.drawPath(path, K);
            canvas.translate((float) sin, (float) cos);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, i iVar, RectF rectF) {
        if (iVar.c(rectF)) {
            float a10 = iVar.f7155f.a(rectF) * this.f7121o.f7139j;
            canvas.drawRoundRect(rectF, a10, a10, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public final RectF g() {
        RectF rectF = this.w;
        rectF.set(getBounds());
        return rectF;
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f7121o;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        b bVar = this.f7121o;
        if (bVar.f7144p != 2) {
            if (bVar.f7131a.c(g())) {
                outline.setRoundRect(getBounds(), this.f7121o.f7131a.f7154e.a(g()) * this.f7121o.f7139j);
                return;
            }
            RectF g10 = g();
            Path path = this.u;
            b(g10, path);
            if (path.isConvex() || Build.VERSION.SDK_INT >= 29) {
                try {
                    outline.setConvexPath(path);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f7121o.f7137h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f7129y;
        region.set(bounds);
        RectF g10 = g();
        Path path = this.u;
        b(g10, path);
        Region region2 = this.z;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.f7121o.f7132b = new e6.a(context);
        m();
    }

    public final void i(float f10) {
        b bVar = this.f7121o;
        if (bVar.f7142n != f10) {
            bVar.f7142n = f10;
            m();
        }
    }

    public final void invalidateSelf() {
        this.f7125s = true;
        super.invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r1.f7121o.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = r1.f7121o.f7133c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f7121o.f7135f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.f7121o.f7134e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0039
            m6.f$b r0 = r1.f7121o
            android.content.res.ColorStateList r0 = r0.f7135f
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x0012:
            m6.f$b r0 = r1.f7121o
            android.content.res.ColorStateList r0 = r0.f7134e
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x001e:
            m6.f$b r0 = r1.f7121o
            android.content.res.ColorStateList r0 = r0.d
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x002a:
            m6.f$b r0 = r1.f7121o
            android.content.res.ColorStateList r0 = r0.f7133c
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.f.isStateful():boolean");
    }

    public final void j(ColorStateList colorStateList) {
        b bVar = this.f7121o;
        if (bVar.f7133c != colorStateList) {
            bVar.f7133c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean k(int[] iArr) {
        boolean z10;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f7121o.f7133c == null || (color2 = paint2.getColor()) == (colorForState2 = this.f7121o.f7133c.getColorForState(iArr, color2))) {
            z10 = false;
        } else {
            (paint2 = this.B).setColor(colorForState2);
            z10 = true;
        }
        if (this.f7121o.d == null || (color = paint.getColor()) == (colorForState = this.f7121o.d.getColorForState(iArr, color))) {
            return z10;
        }
        (paint = this.C).setColor(colorForState);
        return true;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter = this.G;
        PorterDuffColorFilter porterDuffColorFilter2 = this.H;
        b bVar = this.f7121o;
        this.G = c(bVar.f7135f, bVar.f7136g, this.B, true);
        b bVar2 = this.f7121o;
        this.H = c(bVar2.f7134e, bVar2.f7136g, this.C, false);
        b bVar3 = this.f7121o;
        if (bVar3.f7148t) {
            this.D.a(bVar3.f7135f.getColorForState(getState(), 0));
        }
        if (!Objects.equals(porterDuffColorFilter, this.G) || !Objects.equals(porterDuffColorFilter2, this.H)) {
            return true;
        }
        return false;
    }

    public final void m() {
        b bVar = this.f7121o;
        float f10 = bVar.f7142n + bVar.f7143o;
        bVar.f7145q = (int) Math.ceil((double) (0.75f * f10));
        this.f7121o.f7146r = (int) Math.ceil((double) (f10 * 0.25f));
        l();
        super.invalidateSelf();
    }

    public final Drawable mutate() {
        this.f7121o = new b(this.f7121o);
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        this.f7125s = true;
        super.onBoundsChange(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean z10 = k(iArr) || l();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    public void setAlpha(int i10) {
        b bVar = this.f7121o;
        if (bVar.l != i10) {
            bVar.l = i10;
            super.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f7121o.getClass();
        super.invalidateSelf();
    }

    public final void setShapeAppearanceModel(i iVar) {
        this.f7121o.f7131a = iVar;
        invalidateSelf();
    }

    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f7121o.f7135f = colorStateList;
        l();
        super.invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f7121o;
        if (bVar.f7136g != mode) {
            bVar.f7136g = mode;
            l();
            super.invalidateSelf();
        }
    }

    public f(b bVar) {
        j jVar;
        this.f7122p = new l.f[4];
        this.f7123q = new l.f[4];
        this.f7124r = new BitSet(8);
        this.f7126t = new Matrix();
        this.u = new Path();
        this.f7127v = new Path();
        this.w = new RectF();
        this.f7128x = new RectF();
        this.f7129y = new Region();
        this.z = new Region();
        Paint paint = new Paint(1);
        this.B = paint;
        Paint paint2 = new Paint(1);
        this.C = paint2;
        this.D = new l6.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            jVar = j.a.f7181a;
        } else {
            jVar = new j();
        }
        this.F = jVar;
        this.I = new RectF();
        this.J = true;
        this.f7121o = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = K;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        l();
        k(getState());
        this.E = new a();
    }
}

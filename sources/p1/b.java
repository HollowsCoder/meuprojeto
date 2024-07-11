package p1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import b0.d;
import g1.c;
import h1.l;
import h1.u;
import j1.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import k1.a;
import k1.m;
import m1.f;
import n.h;
import n1.g;
import p1.e;

public abstract class b implements e, a.C0091a, f {

    /* renamed from: a  reason: collision with root package name */
    public final Path f7803a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final Matrix f7804b = new Matrix();

    /* renamed from: c  reason: collision with root package name */
    public final i1.a f7805c;
    public final i1.a d;

    /* renamed from: e  reason: collision with root package name */
    public final i1.a f7806e;

    /* renamed from: f  reason: collision with root package name */
    public final i1.a f7807f;

    /* renamed from: g  reason: collision with root package name */
    public final i1.a f7808g;

    /* renamed from: h  reason: collision with root package name */
    public final RectF f7809h;

    /* renamed from: i  reason: collision with root package name */
    public final RectF f7810i;

    /* renamed from: j  reason: collision with root package name */
    public final RectF f7811j;

    /* renamed from: k  reason: collision with root package name */
    public final RectF f7812k;
    public final Matrix l;

    /* renamed from: m  reason: collision with root package name */
    public final l f7813m;

    /* renamed from: n  reason: collision with root package name */
    public final e f7814n;

    /* renamed from: o  reason: collision with root package name */
    public final c f7815o;

    /* renamed from: p  reason: collision with root package name */
    public k1.c f7816p;

    /* renamed from: q  reason: collision with root package name */
    public b f7817q;

    /* renamed from: r  reason: collision with root package name */
    public b f7818r;

    /* renamed from: s  reason: collision with root package name */
    public List<b> f7819s;

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList f7820t;
    public final m u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f7821v;
    public boolean w;

    /* renamed from: x  reason: collision with root package name */
    public i1.a f7822x;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7823a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f7824b;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|(3:29|30|32)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        static {
            /*
                o1.g$a[] r0 = o1.g.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7824b = r0
                r1 = 1
                o1.g$a r2 = o1.g.a.MASK_MODE_NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f7824b     // Catch:{ NoSuchFieldError -> 0x001d }
                o1.g$a r3 = o1.g.a.MASK_MODE_SUBTRACT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f7824b     // Catch:{ NoSuchFieldError -> 0x0028 }
                o1.g$a r4 = o1.g.a.MASK_MODE_INTERSECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f7824b     // Catch:{ NoSuchFieldError -> 0x0033 }
                o1.g$a r5 = o1.g.a.MASK_MODE_ADD     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                p1.e$a[] r4 = p1.e.a.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f7823a = r4
                p1.e$a r5 = p1.e.a.SHAPE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f7823a     // Catch:{ NoSuchFieldError -> 0x004e }
                p1.e$a r4 = p1.e.a.PRE_COMP     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f7823a     // Catch:{ NoSuchFieldError -> 0x0058 }
                p1.e$a r1 = p1.e.a.SOLID     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f7823a     // Catch:{ NoSuchFieldError -> 0x0062 }
                p1.e$a r1 = p1.e.a.IMAGE     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f7823a     // Catch:{ NoSuchFieldError -> 0x006d }
                p1.e$a r1 = p1.e.a.NULL     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f7823a     // Catch:{ NoSuchFieldError -> 0x0078 }
                p1.e$a r1 = p1.e.a.TEXT     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f7823a     // Catch:{ NoSuchFieldError -> 0x0083 }
                p1.e$a r1 = p1.e.a.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p1.b.a.<clinit>():void");
        }
    }

    public b(l lVar, e eVar) {
        PorterDuffXfermode porterDuffXfermode;
        boolean z = true;
        this.f7805c = new i1.a(1);
        this.d = new i1.a(PorterDuff.Mode.DST_IN, 0);
        this.f7806e = new i1.a(PorterDuff.Mode.DST_OUT, 0);
        i1.a aVar = new i1.a(1);
        this.f7807f = aVar;
        this.f7808g = new i1.a(PorterDuff.Mode.CLEAR);
        this.f7809h = new RectF();
        this.f7810i = new RectF();
        this.f7811j = new RectF();
        this.f7812k = new RectF();
        this.l = new Matrix();
        this.f7820t = new ArrayList();
        this.f7821v = true;
        this.f7813m = lVar;
        this.f7814n = eVar;
        d.g(new StringBuilder(), eVar.f7830c, "#draw");
        if (eVar.u == e.b.INVERT) {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        } else {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        }
        aVar.setXfermode(porterDuffXfermode);
        g gVar = eVar.f7835i;
        gVar.getClass();
        m mVar = new m(gVar);
        this.u = mVar;
        mVar.b(this);
        List<o1.g> list = eVar.f7834h;
        if (list != null && !list.isEmpty()) {
            c cVar = new c((List) list);
            this.f7815o = cVar;
            for (k1.a a10 : (List) cVar.f4966o) {
                a10.a(this);
            }
            for (k1.a aVar2 : (List) this.f7815o.f4967p) {
                d(aVar2);
                aVar2.a(this);
            }
        }
        e eVar2 = this.f7814n;
        if (!eVar2.f7845t.isEmpty()) {
            k1.c cVar2 = new k1.c(eVar2.f7845t);
            this.f7816p = cVar2;
            cVar2.f6632b = true;
            cVar2.a(new a(this));
            z = ((Float) this.f7816p.f()).floatValue() != 1.0f ? false : z;
            if (z != this.f7821v) {
                this.f7821v = z;
                this.f7813m.invalidateSelf();
            }
            d(this.f7816p);
        } else if (true != this.f7821v) {
            this.f7821v = true;
            this.f7813m.invalidateSelf();
        }
    }

    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.f7809h.set(0.0f, 0.0f, 0.0f, 0.0f);
        i();
        Matrix matrix2 = this.l;
        matrix2.set(matrix);
        if (z) {
            List<b> list = this.f7819s;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    matrix2.preConcat(this.f7819s.get(size).u.d());
                }
            } else {
                b bVar = this.f7818r;
                if (bVar != null) {
                    matrix2.preConcat(bVar.u.d());
                }
            }
        }
        matrix2.preConcat(this.u.d());
    }

    public final void b() {
        this.f7813m.invalidateSelf();
    }

    public final void c(List<j1.c> list, List<j1.c> list2) {
    }

    public final void d(k1.a<?, ?> aVar) {
        if (aVar != null) {
            this.f7820t.add(aVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0319  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(android.graphics.Canvas r19, android.graphics.Matrix r20, int r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r0.f7821v
            if (r3 == 0) goto L_0x0396
            p1.e r3 = r0.f7814n
            boolean r4 = r3.f7846v
            if (r4 == 0) goto L_0x0012
            goto L_0x0396
        L_0x0012:
            r18.i()
            android.graphics.Matrix r4 = r0.f7804b
            r4.reset()
            r4.set(r2)
            java.util.List<p1.b> r5 = r0.f7819s
            int r5 = r5.size()
            r6 = 1
            int r5 = r5 - r6
        L_0x0025:
            if (r5 < 0) goto L_0x003b
            java.util.List<p1.b> r7 = r0.f7819s
            java.lang.Object r7 = r7.get(r5)
            p1.b r7 = (p1.b) r7
            k1.m r7 = r7.u
            android.graphics.Matrix r7 = r7.d()
            r4.preConcat(r7)
            int r5 = r5 + -1
            goto L_0x0025
        L_0x003b:
            androidx.databinding.a.n()
            k1.m r5 = r0.u
            k1.a<java.lang.Integer, java.lang.Integer> r7 = r5.f6666j
            if (r7 != 0) goto L_0x0047
            r7 = 100
            goto L_0x0051
        L_0x0047:
            java.lang.Object r7 = r7.f()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
        L_0x0051:
            r8 = r21
            float r8 = (float) r8
            r9 = 1132396544(0x437f0000, float:255.0)
            float r8 = r8 / r9
            float r7 = (float) r7
            float r8 = r8 * r7
            r7 = 1120403456(0x42c80000, float:100.0)
            float r8 = r8 / r7
            float r8 = r8 * r9
            int r7 = (int) r8
            p1.b r8 = r0.f7817q
            r9 = 0
            if (r8 == 0) goto L_0x0065
            r8 = r6
            goto L_0x0066
        L_0x0065:
            r8 = r9
        L_0x0066:
            if (r8 != 0) goto L_0x0082
            boolean r8 = r18.l()
            if (r8 != 0) goto L_0x0082
            android.graphics.Matrix r2 = r5.d()
            r4.preConcat(r2)
            r0.k(r1, r4, r7)
            androidx.databinding.a.n()
        L_0x007b:
            androidx.databinding.a.n()
            r18.m()
            return
        L_0x0082:
            android.graphics.RectF r8 = r0.f7809h
            r0.a(r8, r4, r9)
            p1.b r10 = r0.f7817q
            if (r10 == 0) goto L_0x008d
            r10 = r6
            goto L_0x008e
        L_0x008d:
            r10 = r9
        L_0x008e:
            r11 = 0
            if (r10 != 0) goto L_0x0092
            goto L_0x00ac
        L_0x0092:
            p1.e$b r3 = r3.u
            p1.e$b r10 = p1.e.b.INVERT
            if (r3 != r10) goto L_0x0099
            goto L_0x00ac
        L_0x0099:
            android.graphics.RectF r3 = r0.f7811j
            r3.set(r11, r11, r11, r11)
            p1.b r10 = r0.f7817q
            r10.a(r3, r2, r6)
            boolean r3 = r8.intersect(r3)
            if (r3 != 0) goto L_0x00ac
            r8.set(r11, r11, r11, r11)
        L_0x00ac:
            android.graphics.Matrix r3 = r5.d()
            r4.preConcat(r3)
            android.graphics.RectF r3 = r0.f7810i
            r3.set(r11, r11, r11, r11)
            boolean r5 = r18.l()
            android.graphics.Path r10 = r0.f7803a
            r14 = 2
            g1.c r15 = r0.f7815o
            if (r5 != 0) goto L_0x00c6
            r3 = r11
            goto L_0x014c
        L_0x00c6:
            java.lang.Object r5 = r15.f4968q
            java.util.List r5 = (java.util.List) r5
            int r5 = r5.size()
            r11 = r9
        L_0x00cf:
            if (r11 >= r5) goto L_0x0140
            java.lang.Object r9 = r15.f4968q
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r9 = r9.get(r11)
            o1.g r9 = (o1.g) r9
            java.lang.Object r12 = r15.f4966o
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r12 = r12.get(r11)
            k1.a r12 = (k1.a) r12
            java.lang.Object r12 = r12.f()
            android.graphics.Path r12 = (android.graphics.Path) r12
            r10.set(r12)
            r10.transform(r4)
            int[] r12 = p1.b.a.f7824b
            o1.g$a r13 = r9.f7629a
            int r13 = r13.ordinal()
            r12 = r12[r13]
            if (r12 == r6) goto L_0x014b
            if (r12 == r14) goto L_0x014b
            r13 = 3
            if (r12 == r13) goto L_0x0106
            r13 = 4
            if (r12 == r13) goto L_0x0106
            goto L_0x010b
        L_0x0106:
            boolean r9 = r9.d
            if (r9 == 0) goto L_0x010b
            goto L_0x014b
        L_0x010b:
            android.graphics.RectF r9 = r0.f7812k
            r12 = 0
            r10.computeBounds(r9, r12)
            if (r11 != 0) goto L_0x0117
            r3.set(r9)
            goto L_0x013a
        L_0x0117:
            float r13 = r3.left
            float r12 = r9.left
            float r12 = java.lang.Math.min(r13, r12)
            float r13 = r3.top
            float r14 = r9.top
            float r13 = java.lang.Math.min(r13, r14)
            float r14 = r3.right
            float r6 = r9.right
            float r6 = java.lang.Math.max(r14, r6)
            float r14 = r3.bottom
            float r9 = r9.bottom
            float r9 = java.lang.Math.max(r14, r9)
            r3.set(r12, r13, r6, r9)
        L_0x013a:
            int r11 = r11 + 1
            r6 = 1
            r9 = 0
            r14 = 2
            goto L_0x00cf
        L_0x0140:
            boolean r3 = r8.intersect(r3)
            if (r3 != 0) goto L_0x014b
            r3 = 0
            r8.set(r3, r3, r3, r3)
            goto L_0x014c
        L_0x014b:
            r3 = 0
        L_0x014c:
            int r5 = r19.getWidth()
            float r5 = (float) r5
            int r6 = r19.getHeight()
            float r6 = (float) r6
            boolean r5 = r8.intersect(r3, r3, r5, r6)
            if (r5 != 0) goto L_0x015f
            r8.set(r3, r3, r3, r3)
        L_0x015f:
            androidx.databinding.a.n()
            float r3 = r8.width()
            r5 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x035f
            float r3 = r8.height()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x035f
            i1.a r3 = r0.f7805c
            r5 = 255(0xff, float:3.57E-43)
            r3.setAlpha(r5)
            t1.g$a r6 = t1.g.f8886a
            r1.saveLayer(r8, r3)
            androidx.databinding.a.n()
            androidx.databinding.a.n()
            r18.j(r19)
            r0.k(r1, r4, r7)
            androidx.databinding.a.n()
            boolean r6 = r18.l()
            if (r6 == 0) goto L_0x0332
            i1.a r6 = r0.d
            r1.saveLayer(r8, r6)
            androidx.databinding.a.n()
            int r9 = android.os.Build.VERSION.SDK_INT
            r11 = 28
            if (r9 >= r11) goto L_0x01a6
            r18.j(r19)
        L_0x01a6:
            androidx.databinding.a.n()
            r9 = 0
        L_0x01aa:
            java.lang.Object r11 = r15.f4968q
            java.util.List r11 = (java.util.List) r11
            int r11 = r11.size()
            if (r9 >= r11) goto L_0x032c
            java.lang.Object r11 = r15.f4968q
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r11.get(r9)
            o1.g r12 = (o1.g) r12
            java.lang.Object r13 = r15.f4966o
            r14 = r13
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r14 = r14.get(r9)
            k1.a r14 = (k1.a) r14
            java.lang.Object r5 = r15.f4967p
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r5 = r5.get(r9)
            k1.a r5 = (k1.a) r5
            int[] r16 = p1.b.a.f7824b
            r17 = r15
            o1.g$a r15 = r12.f7629a
            int r15 = r15.ordinal()
            r15 = r16[r15]
            r2 = 1
            if (r15 == r2) goto L_0x02f4
            i1.a r11 = r0.f7806e
            r13 = 1076048691(0x40233333, float:2.55)
            boolean r12 = r12.d
            r2 = 2
            if (r15 == r2) goto L_0x02a4
            r2 = 3
            if (r15 == r2) goto L_0x0246
            r2 = 4
            if (r15 == r2) goto L_0x01f4
            goto L_0x0322
        L_0x01f4:
            if (r12 == 0) goto L_0x0225
            t1.g$a r12 = t1.g.f8886a
            r1.saveLayer(r8, r3)
            androidx.databinding.a.n()
            r1.drawRect(r8, r3)
            java.lang.Object r12 = r14.f()
            android.graphics.Path r12 = (android.graphics.Path) r12
            r10.set(r12)
            r10.transform(r4)
            java.lang.Object r5 = r5.f()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            float r5 = (float) r5
            float r5 = r5 * r13
            int r5 = (int) r5
            r3.setAlpha(r5)
            r1.drawPath(r10, r11)
            r19.restore()
            goto L_0x0322
        L_0x0225:
            java.lang.Object r11 = r14.f()
            android.graphics.Path r11 = (android.graphics.Path) r11
            r10.set(r11)
            r10.transform(r4)
            java.lang.Object r5 = r5.f()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            float r5 = (float) r5
            float r5 = r5 * r13
            int r5 = (int) r5
            r3.setAlpha(r5)
            r1.drawPath(r10, r3)
            goto L_0x0322
        L_0x0246:
            r2 = 4
            if (r12 == 0) goto L_0x0278
            t1.g$a r12 = t1.g.f8886a
            r1.saveLayer(r8, r6)
            androidx.databinding.a.n()
            r1.drawRect(r8, r3)
            java.lang.Object r5 = r5.f()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            float r5 = (float) r5
            float r5 = r5 * r13
            int r5 = (int) r5
            r11.setAlpha(r5)
            java.lang.Object r5 = r14.f()
            android.graphics.Path r5 = (android.graphics.Path) r5
            r10.set(r5)
            r10.transform(r4)
            r1.drawPath(r10, r11)
            r19.restore()
            goto L_0x0322
        L_0x0278:
            t1.g$a r11 = t1.g.f8886a
            r1.saveLayer(r8, r6)
            androidx.databinding.a.n()
            java.lang.Object r11 = r14.f()
            android.graphics.Path r11 = (android.graphics.Path) r11
            r10.set(r11)
            r10.transform(r4)
            java.lang.Object r5 = r5.f()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            float r5 = (float) r5
            float r5 = r5 * r13
            int r5 = (int) r5
            r3.setAlpha(r5)
            r1.drawPath(r10, r3)
            r19.restore()
            goto L_0x0322
        L_0x02a4:
            r2 = 4
            if (r9 != 0) goto L_0x02b4
            r15 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3.setColor(r15)
            r15 = 255(0xff, float:3.57E-43)
            r3.setAlpha(r15)
            r1.drawRect(r8, r3)
        L_0x02b4:
            if (r12 == 0) goto L_0x02e4
            t1.g$a r12 = t1.g.f8886a
            r1.saveLayer(r8, r11)
            androidx.databinding.a.n()
            r1.drawRect(r8, r3)
            java.lang.Object r5 = r5.f()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            float r5 = (float) r5
            float r5 = r5 * r13
            int r5 = (int) r5
            r11.setAlpha(r5)
            java.lang.Object r5 = r14.f()
            android.graphics.Path r5 = (android.graphics.Path) r5
            r10.set(r5)
            r10.transform(r4)
            r1.drawPath(r10, r11)
            r19.restore()
            goto L_0x0322
        L_0x02e4:
            java.lang.Object r5 = r14.f()
            android.graphics.Path r5 = (android.graphics.Path) r5
            r10.set(r5)
            r10.transform(r4)
            r1.drawPath(r10, r11)
            goto L_0x0322
        L_0x02f4:
            r2 = 4
            java.util.List r13 = (java.util.List) r13
            boolean r5 = r13.isEmpty()
            if (r5 == 0) goto L_0x02ff
        L_0x02fd:
            r5 = 0
            goto L_0x0317
        L_0x02ff:
            r5 = 0
        L_0x0300:
            int r12 = r11.size()
            if (r5 >= r12) goto L_0x0316
            java.lang.Object r12 = r11.get(r5)
            o1.g r12 = (o1.g) r12
            o1.g$a r12 = r12.f7629a
            o1.g$a r13 = o1.g.a.MASK_MODE_NONE
            if (r12 == r13) goto L_0x0313
            goto L_0x02fd
        L_0x0313:
            int r5 = r5 + 1
            goto L_0x0300
        L_0x0316:
            r5 = 1
        L_0x0317:
            if (r5 == 0) goto L_0x0322
            r5 = 255(0xff, float:3.57E-43)
            r3.setAlpha(r5)
            r1.drawRect(r8, r3)
            goto L_0x0324
        L_0x0322:
            r5 = 255(0xff, float:3.57E-43)
        L_0x0324:
            int r9 = r9 + 1
            r2 = r20
            r15 = r17
            goto L_0x01aa
        L_0x032c:
            r19.restore()
            androidx.databinding.a.n()
        L_0x0332:
            p1.b r2 = r0.f7817q
            if (r2 == 0) goto L_0x0338
            r6 = 1
            goto L_0x0339
        L_0x0338:
            r6 = 0
        L_0x0339:
            if (r6 == 0) goto L_0x0359
            i1.a r2 = r0.f7807f
            r1.saveLayer(r8, r2)
            androidx.databinding.a.n()
            androidx.databinding.a.n()
            r18.j(r19)
            p1.b r2 = r0.f7817q
            r3 = r20
            r2.e(r1, r3, r7)
            r19.restore()
            androidx.databinding.a.n()
            androidx.databinding.a.n()
        L_0x0359:
            r19.restore()
            androidx.databinding.a.n()
        L_0x035f:
            boolean r2 = r0.w
            if (r2 == 0) goto L_0x007b
            i1.a r2 = r0.f7822x
            if (r2 == 0) goto L_0x007b
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r3)
            i1.a r2 = r0.f7822x
            r3 = -251901(0xfffffffffffc2803, float:NaN)
            r2.setColor(r3)
            i1.a r2 = r0.f7822x
            r3 = 1082130432(0x40800000, float:4.0)
            r2.setStrokeWidth(r3)
            i1.a r2 = r0.f7822x
            r1.drawRect(r8, r2)
            i1.a r2 = r0.f7822x
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r2.setStyle(r3)
            i1.a r2 = r0.f7822x
            r3 = 1357638635(0x50ebebeb, float:3.1664855E10)
            r2.setColor(r3)
            i1.a r2 = r0.f7822x
            r1.drawRect(r8, r2)
            goto L_0x007b
        L_0x0396:
            androidx.databinding.a.n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.b.e(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final void g(m1.e eVar, int i10, ArrayList arrayList, m1.e eVar2) {
        b bVar = this.f7817q;
        e eVar3 = this.f7814n;
        if (bVar != null) {
            String str = bVar.f7814n.f7830c;
            eVar2.getClass();
            m1.e eVar4 = new m1.e(eVar2);
            eVar4.f7048a.add(str);
            if (eVar.a(this.f7817q.f7814n.f7830c, i10)) {
                b bVar2 = this.f7817q;
                m1.e eVar5 = new m1.e(eVar4);
                eVar5.f7049b = bVar2;
                arrayList.add(eVar5);
            }
            if (eVar.d(eVar3.f7830c, i10)) {
                this.f7817q.o(eVar, eVar.b(this.f7817q.f7814n.f7830c, i10) + i10, arrayList, eVar4);
            }
        }
        if (eVar.c(eVar3.f7830c, i10)) {
            String str2 = eVar3.f7830c;
            if (!"__container".equals(str2)) {
                eVar2.getClass();
                m1.e eVar6 = new m1.e(eVar2);
                eVar6.f7048a.add(str2);
                if (eVar.a(str2, i10)) {
                    m1.e eVar7 = new m1.e(eVar6);
                    eVar7.f7049b = this;
                    arrayList.add(eVar7);
                }
                eVar2 = eVar6;
            }
            if (eVar.d(str2, i10)) {
                o(eVar, eVar.b(str2, i10) + i10, arrayList, eVar2);
            }
        }
    }

    public final String getName() {
        return this.f7814n.f7830c;
    }

    public void h(u1.c cVar, Object obj) {
        this.u.c(cVar, obj);
    }

    public final void i() {
        if (this.f7819s == null) {
            if (this.f7818r == null) {
                this.f7819s = Collections.emptyList();
                return;
            }
            this.f7819s = new ArrayList();
            for (b bVar = this.f7818r; bVar != null; bVar = bVar.f7818r) {
                this.f7819s.add(bVar);
            }
        }
    }

    public final void j(Canvas canvas) {
        RectF rectF = this.f7809h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f7808g);
        androidx.databinding.a.n();
    }

    public abstract void k(Canvas canvas, Matrix matrix, int i10);

    public final boolean l() {
        c cVar = this.f7815o;
        if (cVar == null || ((List) cVar.f4966o).isEmpty()) {
            return false;
        }
        return true;
    }

    public final void m() {
        u uVar = this.f7813m.f5147p.f5117a;
        String str = this.f7814n.f7830c;
        if (uVar.f5214a) {
            HashMap hashMap = uVar.f5216c;
            t1.e eVar = (t1.e) hashMap.get(str);
            if (eVar == null) {
                eVar = new t1.e();
                hashMap.put(str, eVar);
            }
            int i10 = eVar.f8884a + 1;
            eVar.f8884a = i10;
            if (i10 == Integer.MAX_VALUE) {
                eVar.f8884a = i10 / 2;
            }
            if (str.equals("__container")) {
                Iterator it = uVar.f5215b.iterator();
                while (true) {
                    h.a aVar = (h.a) it;
                    if (aVar.hasNext()) {
                        ((u.a) aVar.next()).a();
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void n(k1.a<?, ?> aVar) {
        this.f7820t.remove(aVar);
    }

    public void o(m1.e eVar, int i10, ArrayList arrayList, m1.e eVar2) {
    }

    public void p(boolean z) {
        if (z && this.f7822x == null) {
            this.f7822x = new i1.a();
        }
        this.w = z;
    }

    public void q(float f10) {
        m mVar = this.u;
        k1.a<Integer, Integer> aVar = mVar.f6666j;
        if (aVar != null) {
            aVar.j(f10);
        }
        k1.a<?, Float> aVar2 = mVar.f6668m;
        if (aVar2 != null) {
            aVar2.j(f10);
        }
        k1.a<?, Float> aVar3 = mVar.f6669n;
        if (aVar3 != null) {
            aVar3.j(f10);
        }
        k1.a<PointF, PointF> aVar4 = mVar.f6662f;
        if (aVar4 != null) {
            aVar4.j(f10);
        }
        k1.a<?, PointF> aVar5 = mVar.f6663g;
        if (aVar5 != null) {
            aVar5.j(f10);
        }
        k1.a<u1.d, u1.d> aVar6 = mVar.f6664h;
        if (aVar6 != null) {
            aVar6.j(f10);
        }
        k1.a<Float, Float> aVar7 = mVar.f6665i;
        if (aVar7 != null) {
            aVar7.j(f10);
        }
        k1.c cVar = mVar.f6667k;
        if (cVar != null) {
            cVar.j(f10);
        }
        k1.c cVar2 = mVar.l;
        if (cVar2 != null) {
            cVar2.j(f10);
        }
        int i10 = 0;
        c cVar3 = this.f7815o;
        if (cVar3 != null) {
            int i11 = 0;
            while (true) {
                Object obj = cVar3.f4966o;
                if (i11 >= ((List) obj).size()) {
                    break;
                }
                ((k1.a) ((List) obj).get(i11)).j(f10);
                i11++;
            }
        }
        float f11 = this.f7814n.f7838m;
        if (f11 != 0.0f) {
            f10 /= f11;
        }
        k1.c cVar4 = this.f7816p;
        if (cVar4 != null) {
            cVar4.j(f10 / f11);
        }
        b bVar = this.f7817q;
        if (bVar != null) {
            bVar.q(bVar.f7814n.f7838m * f10);
        }
        while (true) {
            ArrayList arrayList = this.f7820t;
            if (i10 < arrayList.size()) {
                ((k1.a) arrayList.get(i10)).j(f10);
                i10++;
            } else {
                return;
            }
        }
    }
}

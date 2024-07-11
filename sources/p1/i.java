package p1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import h1.q;
import java.util.HashMap;
import java.util.List;
import k1.l;
import k1.n;
import m1.b;
import n.f;

public final class i extends b {
    public final Matrix A = new Matrix();
    public final a B = new a();
    public final b C = new b();
    public final HashMap D = new HashMap();
    public final f<String> E = new f<>();
    public final l F;
    public final h1.l G;
    public final h1.f H;
    public final k1.a<Integer, Integer> I;
    public n J;
    public final k1.a<Integer, Integer> K;
    public n L;
    public final k1.c M;
    public n N;
    public final k1.c O;
    public n P;
    public n Q;

    /* renamed from: y  reason: collision with root package name */
    public final StringBuilder f7849y = new StringBuilder(2);
    public final RectF z = new RectF();

    public class a extends Paint {
        public a() {
            super(1);
            setStyle(Paint.Style.FILL);
        }
    }

    public class b extends Paint {
        public b() {
            super(1);
            setStyle(Paint.Style.STROKE);
        }
    }

    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7850a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                m1.b$a[] r0 = m1.b.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7850a = r0
                m1.b$a r1 = m1.b.a.LEFT_ALIGN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7850a     // Catch:{ NoSuchFieldError -> 0x001d }
                m1.b$a r1 = m1.b.a.RIGHT_ALIGN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f7850a     // Catch:{ NoSuchFieldError -> 0x0028 }
                m1.b$a r1 = m1.b.a.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p1.i.c.<clinit>():void");
        }
    }

    public i(h1.l lVar, e eVar) {
        super(lVar, eVar);
        n1.b bVar;
        n1.b bVar2;
        n1.a aVar;
        n1.a aVar2;
        this.G = lVar;
        this.H = eVar.f7829b;
        l lVar2 = new l((List) eVar.f7842q.f7358b);
        this.F = lVar2;
        lVar2.a(this);
        d(lVar2);
        n1.f fVar = eVar.f7843r;
        if (!(fVar == null || (aVar2 = fVar.f7346a) == null)) {
            k1.a<Integer, Integer> a10 = aVar2.a();
            this.I = a10;
            a10.a(this);
            d(a10);
        }
        if (!(fVar == null || (aVar = fVar.f7347b) == null)) {
            k1.a<Integer, Integer> a11 = aVar.a();
            this.K = a11;
            a11.a(this);
            d(a11);
        }
        if (!(fVar == null || (bVar2 = fVar.f7348c) == null)) {
            k1.a<Float, Float> a12 = bVar2.a();
            this.M = (k1.c) a12;
            a12.a(this);
            d(a12);
        }
        if (fVar != null && (bVar = fVar.d) != null) {
            k1.a<Float, Float> a13 = bVar.a();
            this.O = (k1.c) a13;
            a13.a(this);
            d(a13);
        }
    }

    public static void r(b.a aVar, Canvas canvas, float f10) {
        float f11;
        int i10 = c.f7850a[aVar.ordinal()];
        if (i10 == 2) {
            f11 = -f10;
        } else if (i10 == 3) {
            f11 = (-f10) / 2.0f;
        } else {
            return;
        }
        canvas.translate(f11, 0.0f);
    }

    public static void s(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
            }
        }
    }

    public static void t(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    public final void a(RectF rectF, Matrix matrix, boolean z10) {
        super.a(rectF, matrix, z10);
        h1.f fVar = this.H;
        rectF.set(0.0f, 0.0f, (float) fVar.f5125j.width(), (float) fVar.f5125j.height());
    }

    public final void h(u1.c cVar, Object obj) {
        n nVar;
        super.h(cVar, obj);
        if (obj == q.f5185a) {
            n nVar2 = this.J;
            if (nVar2 != null) {
                n(nVar2);
            }
            if (cVar == null) {
                this.J = null;
                return;
            }
            n nVar3 = new n(cVar, null);
            this.J = nVar3;
            nVar3.a(this);
            nVar = this.J;
        } else if (obj == q.f5186b) {
            n nVar4 = this.L;
            if (nVar4 != null) {
                n(nVar4);
            }
            if (cVar == null) {
                this.L = null;
                return;
            }
            n nVar5 = new n(cVar, null);
            this.L = nVar5;
            nVar5.a(this);
            nVar = this.L;
        } else if (obj == q.f5199q) {
            n nVar6 = this.N;
            if (nVar6 != null) {
                n(nVar6);
            }
            if (cVar == null) {
                this.N = null;
                return;
            }
            n nVar7 = new n(cVar, null);
            this.N = nVar7;
            nVar7.a(this);
            nVar = this.N;
        } else if (obj == q.f5200r) {
            n nVar8 = this.P;
            if (nVar8 != null) {
                n(nVar8);
            }
            if (cVar == null) {
                this.P = null;
                return;
            }
            n nVar9 = new n(cVar, null);
            this.P = nVar9;
            nVar9.a(this);
            nVar = this.P;
        } else if (obj == q.D) {
            n nVar10 = this.Q;
            if (nVar10 != null) {
                n(nVar10);
            }
            if (cVar == null) {
                this.Q = null;
                return;
            }
            n nVar11 = new n(cVar, null);
            this.Q = nVar11;
            nVar11.a(this);
            nVar = this.Q;
        } else {
            return;
        }
        d(nVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:123:0x03da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(android.graphics.Canvas r30, android.graphics.Matrix r31, int r32) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            r30.save()
            h1.l r2 = r0.G
            h1.f r3 = r2.f5147p
            n.j<m1.d> r3 = r3.f5122g
            int r3 = r3.j()
            if (r3 <= 0) goto L_0x0015
            r3 = 1
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            if (r3 != 0) goto L_0x001b
            r30.concat(r31)
        L_0x001b:
            k1.l r3 = r0.F
            java.lang.Object r3 = r3.f()
            m1.b r3 = (m1.b) r3
            h1.f r6 = r0.H
            java.util.Map<java.lang.String, m1.c> r7 = r6.f5120e
            java.lang.String r8 = r3.f7032b
            java.lang.Object r7 = r7.get(r8)
            m1.c r7 = (m1.c) r7
            if (r7 != 0) goto L_0x0035
            r30.restore()
            return
        L_0x0035:
            k1.n r8 = r0.J
            if (r8 == 0) goto L_0x003a
            goto L_0x003e
        L_0x003a:
            k1.a<java.lang.Integer, java.lang.Integer> r8 = r0.I
            if (r8 == 0) goto L_0x0049
        L_0x003e:
            java.lang.Object r8 = r8.f()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            goto L_0x004b
        L_0x0049:
            int r8 = r3.f7037h
        L_0x004b:
            p1.i$a r9 = r0.B
            r9.setColor(r8)
            k1.n r8 = r0.L
            if (r8 == 0) goto L_0x0055
            goto L_0x0059
        L_0x0055:
            k1.a<java.lang.Integer, java.lang.Integer> r8 = r0.K
            if (r8 == 0) goto L_0x0064
        L_0x0059:
            java.lang.Object r8 = r8.f()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            goto L_0x0066
        L_0x0064:
            int r8 = r3.f7038i
        L_0x0066:
            p1.i$b r10 = r0.C
            r10.setColor(r8)
            k1.m r8 = r0.u
            k1.a<java.lang.Integer, java.lang.Integer> r8 = r8.f6666j
            r11 = 100
            if (r8 != 0) goto L_0x0075
            r8 = r11
            goto L_0x007f
        L_0x0075:
            java.lang.Object r8 = r8.f()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
        L_0x007f:
            int r8 = r8 * 255
            int r8 = r8 / r11
            r9.setAlpha(r8)
            r10.setAlpha(r8)
            k1.n r8 = r0.N
            if (r8 == 0) goto L_0x008d
            goto L_0x0091
        L_0x008d:
            k1.c r8 = r0.M
            if (r8 == 0) goto L_0x009f
        L_0x0091:
            java.lang.Object r8 = r8.f()
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            r10.setStrokeWidth(r8)
            goto L_0x00ae
        L_0x009f:
            float r8 = t1.g.d(r31)
            float r11 = r3.f7039j
            float r12 = t1.g.c()
            float r12 = r12 * r11
            float r12 = r12 * r8
            r10.setStrokeWidth(r12)
        L_0x00ae:
            h1.f r8 = r2.f5147p
            n.j<m1.d> r8 = r8.f5122g
            int r8 = r8.j()
            if (r8 <= 0) goto L_0x00ba
            r8 = 1
            goto L_0x00bb
        L_0x00ba:
            r8 = 0
        L_0x00bb:
            java.lang.String r13 = "\n"
            java.lang.String r14 = "\r"
            java.lang.String r15 = "\r\n"
            r16 = 1120403456(0x42c80000, float:100.0)
            k1.c r5 = r0.O
            boolean r11 = r3.f7040k
            m1.b$a r12 = r3.d
            int r4 = r3.f7034e
            r17 = r5
            float r5 = r3.f7035f
            r18 = r4
            float r4 = r3.f7033c
            r19 = r4
            java.lang.String r4 = r3.f7031a
            r20 = r10
            java.lang.String r10 = r7.f7042b
            java.lang.String r7 = r7.f7041a
            if (r8 == 0) goto L_0x02d5
            k1.n r8 = r0.Q
            if (r8 == 0) goto L_0x00ef
            java.lang.Object r8 = r8.f()
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            r19 = r8
        L_0x00ef:
            float r8 = r19 / r16
            r21 = r9
            float r9 = t1.g.d(r31)
            float r16 = t1.g.c()
            float r16 = r16 * r5
            java.lang.String r4 = r4.replaceAll(r15, r14)
            java.lang.String r4 = r4.replaceAll(r13, r14)
            java.lang.String[] r4 = r4.split(r14)
            java.util.List r4 = java.util.Arrays.asList(r4)
            int r5 = r4.size()
            r13 = 0
        L_0x0112:
            if (r13 >= r5) goto L_0x02d2
            java.lang.Object r14 = r4.get(r13)
            java.lang.String r14 = (java.lang.String) r14
            r32 = r4
            r22 = r11
            r4 = 0
            r15 = 0
        L_0x0120:
            int r11 = r14.length()
            if (r15 >= r11) goto L_0x0164
            char r11 = r14.charAt(r15)
            int r11 = m1.d.a(r11, r7, r10)
            r23 = r3
            n.j<m1.d> r3 = r6.f5122g
            r24 = r2
            r2 = 0
            java.lang.Object r3 = r3.h(r11, r2)
            m1.d r3 = (m1.d) r3
            r2 = r6
            if (r3 != 0) goto L_0x0143
            r26 = r7
            r25 = r10
            goto L_0x0158
        L_0x0143:
            r11 = r7
            double r6 = (double) r4
            r25 = r10
            r26 = r11
            double r10 = (double) r8
            double r3 = r3.f7045c
            double r3 = r3 * r10
            float r10 = t1.g.c()
            double r10 = (double) r10
            double r3 = r3 * r10
            double r10 = (double) r9
            double r3 = r3 * r10
            double r3 = r3 + r6
            float r3 = (float) r3
            r4 = r3
        L_0x0158:
            int r15 = r15 + 1
            r6 = r2
            r3 = r23
            r2 = r24
            r10 = r25
            r7 = r26
            goto L_0x0120
        L_0x0164:
            r24 = r2
            r23 = r3
            r2 = r6
            r26 = r7
            r25 = r10
            r30.save()
            r(r12, r1, r4)
            int r3 = r5 + -1
            float r3 = (float) r3
            float r3 = r3 * r16
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r4 = (float) r13
            float r4 = r4 * r16
            float r4 = r4 - r3
            r3 = 0
            r1.translate(r3, r4)
            r3 = 0
        L_0x0184:
            int r4 = r14.length()
            if (r3 >= r4) goto L_0x02ac
            char r4 = r14.charAt(r3)
            r6 = r25
            r7 = r26
            int r4 = m1.d.a(r4, r7, r6)
            n.j<m1.d> r10 = r2.f5122g
            r11 = 0
            java.lang.Object r4 = r10.h(r4, r11)
            m1.d r4 = (m1.d) r4
            if (r4 != 0) goto L_0x01b5
            r19 = r2
            r25 = r5
            r28 = r12
            r26 = r14
            r2 = r18
            r11 = r20
            r10 = r21
            r15 = r23
            r12 = r24
            goto L_0x0292
        L_0x01b5:
            java.util.HashMap r10 = r0.D
            boolean r11 = r10.containsKey(r4)
            if (r11 == 0) goto L_0x01ce
            java.lang.Object r10 = r10.get(r4)
            java.util.List r10 = (java.util.List) r10
            r19 = r2
            r25 = r5
            r28 = r12
            r26 = r14
            r12 = r24
            goto L_0x020b
        L_0x01ce:
            java.util.List<o1.n> r11 = r4.f7043a
            int r15 = r11.size()
            r19 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r15)
            r25 = r5
            r5 = 0
        L_0x01de:
            if (r5 >= r15) goto L_0x0201
            java.lang.Object r26 = r11.get(r5)
            r27 = r11
            r11 = r26
            o1.n r11 = (o1.n) r11
            r26 = r14
            j1.d r14 = new j1.d
            r28 = r12
            r12 = r24
            r14.<init>(r12, r0, r11)
            r2.add(r14)
            int r5 = r5 + 1
            r14 = r26
            r11 = r27
            r12 = r28
            goto L_0x01de
        L_0x0201:
            r28 = r12
            r26 = r14
            r12 = r24
            r10.put(r4, r2)
            r10 = r2
        L_0x020b:
            r2 = 0
        L_0x020c:
            int r5 = r10.size()
            if (r2 >= r5) goto L_0x0262
            java.lang.Object r5 = r10.get(r2)
            j1.d r5 = (j1.d) r5
            android.graphics.Path r5 = r5.f()
            android.graphics.RectF r11 = r0.z
            r14 = 0
            r5.computeBounds(r11, r14)
            android.graphics.Matrix r11 = r0.A
            r14 = r31
            r11.set(r14)
            r15 = r23
            r23 = r10
            float r10 = r15.f7036g
            float r10 = -r10
            float r24 = t1.g.c()
            float r10 = r10 * r24
            r14 = 0
            r11.preTranslate(r14, r10)
            r11.preScale(r8, r8)
            r5.transform(r11)
            if (r22 == 0) goto L_0x024d
            r10 = r21
            t(r5, r10, r1)
            r11 = r20
            t(r5, r11, r1)
            goto L_0x0257
        L_0x024d:
            r11 = r20
            r10 = r21
            t(r5, r11, r1)
            t(r5, r10, r1)
        L_0x0257:
            int r2 = r2 + 1
            r21 = r10
            r20 = r11
            r10 = r23
            r23 = r15
            goto L_0x020c
        L_0x0262:
            r11 = r20
            r10 = r21
            r15 = r23
            double r4 = r4.f7045c
            float r2 = (float) r4
            float r2 = r2 * r8
            float r4 = t1.g.c()
            float r4 = r4 * r2
            float r4 = r4 * r9
            r2 = r18
            float r5 = (float) r2
            r14 = 1092616192(0x41200000, float:10.0)
            float r5 = r5 / r14
            k1.n r14 = r0.P
            if (r14 == 0) goto L_0x027d
            goto L_0x0281
        L_0x027d:
            if (r17 == 0) goto L_0x028c
            r14 = r17
        L_0x0281:
            java.lang.Object r14 = r14.f()
            java.lang.Float r14 = (java.lang.Float) r14
            float r14 = r14.floatValue()
            float r5 = r5 + r14
        L_0x028c:
            float r5 = r5 * r9
            float r5 = r5 + r4
            r4 = 0
            r1.translate(r5, r4)
        L_0x0292:
            int r3 = r3 + 1
            r18 = r2
            r21 = r10
            r20 = r11
            r24 = r12
            r23 = r15
            r2 = r19
            r5 = r25
            r14 = r26
            r12 = r28
            r25 = r6
            r26 = r7
            goto L_0x0184
        L_0x02ac:
            r19 = r2
            r28 = r12
            r2 = r18
            r11 = r20
            r10 = r21
            r15 = r23
            r12 = r24
            r6 = r25
            r7 = r26
            r25 = r5
            r30.restore()
            int r13 = r13 + 1
            r4 = r32
            r2 = r12
            r3 = r15
            r11 = r22
            r12 = r28
            r10 = r6
            r6 = r19
            goto L_0x0112
        L_0x02d2:
            r6 = r1
            goto L_0x04dc
        L_0x02d5:
            r6 = r10
            r22 = r11
            r28 = r12
            r11 = r20
            r12 = r2
            r10 = r9
            r2 = r18
            t1.g.d(r31)
            android.graphics.drawable.Drawable$Callback r3 = r12.getCallback()
            if (r3 != 0) goto L_0x02eb
            r3 = 0
            goto L_0x02fc
        L_0x02eb:
            l1.a r3 = r12.f5154y
            if (r3 != 0) goto L_0x02fa
            l1.a r3 = new l1.a
            android.graphics.drawable.Drawable$Callback r8 = r12.getCallback()
            r3.<init>(r8)
            r12.f5154y = r3
        L_0x02fa:
            l1.a r3 = r12.f5154y
        L_0x02fc:
            if (r3 == 0) goto L_0x0369
            m1.i r8 = r3.f6863a
            r8.f7056p = r7
            r8.f7057q = r6
            java.util.HashMap r9 = r3.f6864b
            java.lang.Object r12 = r9.get(r8)
            android.graphics.Typeface r12 = (android.graphics.Typeface) r12
            if (r12 == 0) goto L_0x0311
            r18 = r13
            goto L_0x036c
        L_0x0311:
            java.util.HashMap r12 = r3.f6865c
            java.lang.Object r18 = r12.get(r7)
            android.graphics.Typeface r18 = (android.graphics.Typeface) r18
            if (r18 == 0) goto L_0x0320
            r1 = r18
            r18 = r13
            goto L_0x033e
        L_0x0320:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r18 = r13
            java.lang.String r13 = "fonts/"
            r1.<init>(r13)
            r1.append(r7)
            java.lang.String r13 = r3.f6866e
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            android.content.res.AssetManager r3 = r3.d
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r3, r1)
            r12.put(r7, r1)
        L_0x033e:
            java.lang.String r3 = "Italic"
            boolean r3 = r6.contains(r3)
            java.lang.String r7 = "Bold"
            boolean r6 = r6.contains(r7)
            if (r3 == 0) goto L_0x0350
            if (r6 == 0) goto L_0x0350
            r3 = 3
            goto L_0x0359
        L_0x0350:
            if (r3 == 0) goto L_0x0354
            r3 = 2
            goto L_0x0359
        L_0x0354:
            if (r6 == 0) goto L_0x0358
            r3 = 1
            goto L_0x0359
        L_0x0358:
            r3 = 0
        L_0x0359:
            int r6 = r1.getStyle()
            if (r6 != r3) goto L_0x0360
            goto L_0x0364
        L_0x0360:
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r1, r3)
        L_0x0364:
            r9.put(r8, r1)
            r12 = r1
            goto L_0x036c
        L_0x0369:
            r18 = r13
            r12 = 0
        L_0x036c:
            if (r12 != 0) goto L_0x0372
        L_0x036e:
            r6 = r30
            goto L_0x04dc
        L_0x0372:
            r10.setTypeface(r12)
            k1.n r1 = r0.Q
            if (r1 == 0) goto L_0x0384
            java.lang.Object r1 = r1.f()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            goto L_0x0386
        L_0x0384:
            r1 = r19
        L_0x0386:
            float r3 = t1.g.c()
            float r3 = r3 * r1
            r10.setTextSize(r3)
            android.graphics.Typeface r3 = r10.getTypeface()
            r11.setTypeface(r3)
            float r3 = r10.getTextSize()
            r11.setTextSize(r3)
            float r3 = t1.g.c()
            float r3 = r3 * r5
            float r2 = (float) r2
            r5 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r5
            k1.n r5 = r0.P
            if (r5 == 0) goto L_0x03aa
            goto L_0x03ae
        L_0x03aa:
            if (r17 == 0) goto L_0x03b9
            r5 = r17
        L_0x03ae:
            java.lang.Object r5 = r5.f()
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            float r2 = r2 + r5
        L_0x03b9:
            float r5 = t1.g.c()
            float r5 = r5 * r2
            float r5 = r5 * r1
            float r5 = r5 / r16
            java.lang.String r1 = r4.replaceAll(r15, r14)
            r2 = r18
            java.lang.String r1 = r1.replaceAll(r2, r14)
            java.lang.String[] r1 = r1.split(r14)
            java.util.List r1 = java.util.Arrays.asList(r1)
            int r2 = r1.size()
            r14 = 0
        L_0x03d8:
            if (r14 >= r2) goto L_0x036e
            java.lang.Object r4 = r1.get(r14)
            java.lang.String r4 = (java.lang.String) r4
            float r6 = r11.measureText(r4)
            int r7 = r4.length()
            r8 = 1
            int r7 = r7 - r8
            float r7 = (float) r7
            float r7 = r7 * r5
            float r7 = r7 + r6
            r30.save()
            r6 = r30
            r9 = r28
            r(r9, r6, r7)
            int r7 = r2 + -1
            float r7 = (float) r7
            float r7 = r7 * r3
            r12 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r12
            float r13 = (float) r14
            float r13 = r13 * r3
            float r13 = r13 - r7
            r7 = 0
            r6.translate(r7, r13)
            r7 = 0
        L_0x0406:
            int r13 = r4.length()
            if (r7 >= r13) goto L_0x04ca
            int r13 = r4.codePointAt(r7)
            int r15 = java.lang.Character.charCount(r13)
            int r15 = r15 + r7
        L_0x0415:
            int r8 = r4.length()
            if (r15 >= r8) goto L_0x045c
            int r8 = r4.codePointAt(r15)
            int r12 = java.lang.Character.getType(r8)
            r31 = r1
            r1 = 16
            if (r12 == r1) goto L_0x044b
            int r1 = java.lang.Character.getType(r8)
            r12 = 27
            if (r1 == r12) goto L_0x044b
            int r1 = java.lang.Character.getType(r8)
            r12 = 6
            if (r1 == r12) goto L_0x044b
            int r1 = java.lang.Character.getType(r8)
            r12 = 28
            if (r1 == r12) goto L_0x044b
            int r1 = java.lang.Character.getType(r8)
            r12 = 19
            if (r1 != r12) goto L_0x0449
            goto L_0x044b
        L_0x0449:
            r1 = 0
            goto L_0x044c
        L_0x044b:
            r1 = 1
        L_0x044c:
            if (r1 != 0) goto L_0x044f
            goto L_0x045e
        L_0x044f:
            int r1 = java.lang.Character.charCount(r8)
            int r15 = r15 + r1
            int r13 = r13 * 31
            int r13 = r13 + r8
            r1 = r31
            r12 = 1073741824(0x40000000, float:2.0)
            goto L_0x0415
        L_0x045c:
            r31 = r1
        L_0x045e:
            long r12 = (long) r13
            n.f<java.lang.String> r1 = r0.E
            boolean r8 = r1.f7305o
            if (r8 == 0) goto L_0x0468
            r1.e()
        L_0x0468:
            long[] r8 = r1.f7306p
            r16 = r2
            int r2 = r1.f7308r
            int r2 = n.e.m(r8, r2, r12)
            if (r2 < 0) goto L_0x0476
            r2 = 1
            goto L_0x0477
        L_0x0476:
            r2 = 0
        L_0x0477:
            if (r2 == 0) goto L_0x0481
            r2 = 0
            java.lang.Object r1 = r1.h(r12, r2)
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x04a2
        L_0x0481:
            r2 = 0
            java.lang.StringBuilder r8 = r0.f7849y
            r2 = 0
            r8.setLength(r2)
            r2 = r7
        L_0x0489:
            if (r2 >= r15) goto L_0x049a
            int r0 = r4.codePointAt(r2)
            r8.appendCodePoint(r0)
            int r0 = java.lang.Character.charCount(r0)
            int r2 = r2 + r0
            r0 = r29
            goto L_0x0489
        L_0x049a:
            java.lang.String r0 = r8.toString()
            r1.i(r12, r0)
            r1 = r0
        L_0x04a2:
            int r0 = r1.length()
            int r7 = r7 + r0
            if (r22 == 0) goto L_0x04b0
            s(r1, r10, r6)
            s(r1, r11, r6)
            goto L_0x04b6
        L_0x04b0:
            s(r1, r11, r6)
            s(r1, r10, r6)
        L_0x04b6:
            float r0 = r10.measureText(r1)
            float r0 = r0 + r5
            r1 = 0
            r6.translate(r0, r1)
            r1 = r31
            r2 = r16
            r8 = 1
            r12 = 1073741824(0x40000000, float:2.0)
            r0 = r29
            goto L_0x0406
        L_0x04ca:
            r31 = r1
            r16 = r2
            r1 = 0
            r30.restore()
            int r14 = r14 + 1
            r0 = r29
            r1 = r31
            r28 = r9
            goto L_0x03d8
        L_0x04dc:
            r30.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.i.k(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}

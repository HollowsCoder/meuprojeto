package j1;

import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import h1.l;
import h1.q;
import k1.a;
import k1.n;
import n.f;
import o1.e;
import p1.b;
import u1.c;

public final class i extends a {

    /* renamed from: o  reason: collision with root package name */
    public final String f6459o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f6460p;

    /* renamed from: q  reason: collision with root package name */
    public final f<LinearGradient> f6461q = new f<>();

    /* renamed from: r  reason: collision with root package name */
    public final f<RadialGradient> f6462r = new f<>();

    /* renamed from: s  reason: collision with root package name */
    public final RectF f6463s = new RectF();

    /* renamed from: t  reason: collision with root package name */
    public final o1.f f6464t;
    public final int u;

    /* renamed from: v  reason: collision with root package name */
    public final k1.f f6465v;
    public final k1.f w;

    /* renamed from: x  reason: collision with root package name */
    public final k1.f f6466x;

    /* renamed from: y  reason: collision with root package name */
    public n f6467y;

    public i(l lVar, b bVar, e eVar) {
        super(lVar, bVar, eVar.f7624h.toPaintCap(), eVar.f7625i.toPaintJoin(), eVar.f7626j, eVar.d, eVar.f7623g, eVar.f7627k, eVar.l);
        this.f6459o = eVar.f7618a;
        this.f6464t = eVar.f7619b;
        this.f6460p = eVar.f7628m;
        this.u = (int) (lVar.f5147p.b() / 32.0f);
        a a10 = eVar.f7620c.a();
        this.f6465v = (k1.f) a10;
        a10.a(this);
        bVar.d(a10);
        a a11 = eVar.f7621e.a();
        this.w = (k1.f) a11;
        a11.a(this);
        bVar.d(a11);
        a a12 = eVar.f7622f.a();
        this.f6466x = (k1.f) a12;
        a12.a(this);
        bVar.d(a12);
    }

    public final int[] d(int[] iArr) {
        n nVar = this.f6467y;
        if (nVar != null) {
            Integer[] numArr = (Integer[]) nVar.f();
            int i10 = 0;
            if (iArr.length == numArr.length) {
                while (i10 < iArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i10 < numArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            }
        }
        return iArr;
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: type inference failed for: r9v2, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: type inference failed for: r9v3, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(android.graphics.Canvas r18, android.graphics.Matrix r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r0.f6460p
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            android.graphics.RectF r2 = r0.f6463s
            r3 = 0
            r0.a(r2, r1, r3)
            o1.f r2 = o1.f.LINEAR
            o1.f r3 = r0.f6464t
            k1.f r4 = r0.f6465v
            k1.f r5 = r0.f6466x
            k1.f r6 = r0.w
            r7 = 0
            if (r3 != r2) goto L_0x005b
            int r2 = r17.i()
            long r2 = (long) r2
            n.f<android.graphics.LinearGradient> r8 = r0.f6461q
            java.lang.Object r7 = r8.h(r2, r7)
            android.graphics.LinearGradient r7 = (android.graphics.LinearGradient) r7
            if (r7 == 0) goto L_0x002d
            goto L_0x00a1
        L_0x002d:
            java.lang.Object r6 = r6.f()
            android.graphics.PointF r6 = (android.graphics.PointF) r6
            java.lang.Object r5 = r5.f()
            android.graphics.PointF r5 = (android.graphics.PointF) r5
            java.lang.Object r4 = r4.f()
            o1.c r4 = (o1.c) r4
            int[] r7 = r4.f7610b
            int[] r14 = r0.d(r7)
            float[] r15 = r4.f7609a
            float r10 = r6.x
            float r11 = r6.y
            float r12 = r5.x
            float r13 = r5.y
            android.graphics.LinearGradient r7 = new android.graphics.LinearGradient
            android.graphics.Shader$TileMode r16 = android.graphics.Shader.TileMode.CLAMP
            r9 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r8.i(r2, r7)
            goto L_0x00a1
        L_0x005b:
            int r2 = r17.i()
            long r2 = (long) r2
            n.f<android.graphics.RadialGradient> r8 = r0.f6462r
            java.lang.Object r7 = r8.h(r2, r7)
            android.graphics.RadialGradient r7 = (android.graphics.RadialGradient) r7
            if (r7 == 0) goto L_0x006b
            goto L_0x00a1
        L_0x006b:
            java.lang.Object r6 = r6.f()
            android.graphics.PointF r6 = (android.graphics.PointF) r6
            java.lang.Object r5 = r5.f()
            android.graphics.PointF r5 = (android.graphics.PointF) r5
            java.lang.Object r4 = r4.f()
            o1.c r4 = (o1.c) r4
            int[] r7 = r4.f7610b
            int[] r13 = r0.d(r7)
            float[] r14 = r4.f7609a
            float r10 = r6.x
            float r11 = r6.y
            float r4 = r5.x
            float r5 = r5.y
            float r4 = r4 - r10
            double r6 = (double) r4
            float r5 = r5 - r11
            double r4 = (double) r5
            double r4 = java.lang.Math.hypot(r6, r4)
            float r12 = (float) r4
            android.graphics.RadialGradient r7 = new android.graphics.RadialGradient
            android.graphics.Shader$TileMode r15 = android.graphics.Shader.TileMode.CLAMP
            r9 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r8.i(r2, r7)
        L_0x00a1:
            r7.setLocalMatrix(r1)
            i1.a r2 = r0.f6409i
            r2.setShader(r7)
            super.e(r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.i.e(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final String getName() {
        return this.f6459o;
    }

    public final void h(c cVar, Object obj) {
        super.h(cVar, obj);
        if (obj == q.F) {
            n nVar = this.f6467y;
            b bVar = this.f6406f;
            if (nVar != null) {
                bVar.n(nVar);
            }
            if (cVar == null) {
                this.f6467y = null;
                return;
            }
            n nVar2 = new n(cVar, null);
            this.f6467y = nVar2;
            nVar2.a(this);
            bVar.d(this.f6467y);
        }
    }

    public final int i() {
        int i10;
        float f10 = this.w.d;
        float f11 = (float) this.u;
        int round = Math.round(f10 * f11);
        int round2 = Math.round(this.f6466x.d * f11);
        int round3 = Math.round(this.f6465v.d * f11);
        if (round != 0) {
            i10 = round * 527;
        } else {
            i10 = 17;
        }
        if (round2 != 0) {
            i10 = i10 * 31 * round2;
        }
        if (round3 != 0) {
            return i10 * 31 * round3;
        }
        return i10;
    }
}

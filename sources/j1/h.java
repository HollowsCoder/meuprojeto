package j1;

import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import h1.l;
import h1.q;
import java.util.ArrayList;
import java.util.List;
import k1.a;
import k1.n;
import m1.e;
import n.f;
import o1.d;
import p1.b;
import u1.c;

public final class h implements e, a.C0091a, k {

    /* renamed from: a  reason: collision with root package name */
    public final String f6443a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6444b;

    /* renamed from: c  reason: collision with root package name */
    public final b f6445c;
    public final f<LinearGradient> d = new f<>();

    /* renamed from: e  reason: collision with root package name */
    public final f<RadialGradient> f6446e = new f<>();

    /* renamed from: f  reason: collision with root package name */
    public final Path f6447f;

    /* renamed from: g  reason: collision with root package name */
    public final i1.a f6448g;

    /* renamed from: h  reason: collision with root package name */
    public final RectF f6449h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f6450i;

    /* renamed from: j  reason: collision with root package name */
    public final o1.f f6451j;

    /* renamed from: k  reason: collision with root package name */
    public final k1.f f6452k;
    public final k1.f l;

    /* renamed from: m  reason: collision with root package name */
    public final k1.f f6453m;

    /* renamed from: n  reason: collision with root package name */
    public final k1.f f6454n;

    /* renamed from: o  reason: collision with root package name */
    public n f6455o;

    /* renamed from: p  reason: collision with root package name */
    public n f6456p;

    /* renamed from: q  reason: collision with root package name */
    public final l f6457q;

    /* renamed from: r  reason: collision with root package name */
    public final int f6458r;

    public h(l lVar, b bVar, d dVar) {
        Path path = new Path();
        this.f6447f = path;
        this.f6448g = new i1.a(1);
        this.f6449h = new RectF();
        this.f6450i = new ArrayList();
        this.f6445c = bVar;
        this.f6443a = dVar.f7616g;
        this.f6444b = dVar.f7617h;
        this.f6457q = lVar;
        this.f6451j = dVar.f7611a;
        path.setFillType(dVar.f7612b);
        this.f6458r = (int) (lVar.f5147p.b() / 32.0f);
        a a10 = dVar.f7613c.a();
        this.f6452k = (k1.f) a10;
        a10.a(this);
        bVar.d(a10);
        a a11 = dVar.d.a();
        this.l = (k1.f) a11;
        a11.a(this);
        bVar.d(a11);
        a a12 = dVar.f7614e.a();
        this.f6453m = (k1.f) a12;
        a12.a(this);
        bVar.d(a12);
        a a13 = dVar.f7615f.a();
        this.f6454n = (k1.f) a13;
        a13.a(this);
        bVar.d(a13);
    }

    public final void a(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f6447f;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f6450i;
            if (i10 < arrayList.size()) {
                path.addPath(((m) arrayList.get(i10)).f(), matrix);
                i10++;
            } else {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
        }
    }

    public final void b() {
        this.f6457q.invalidateSelf();
    }

    public final void c(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = list2.get(i10);
            if (cVar instanceof m) {
                this.f6450i.add((m) cVar);
            }
        }
    }

    public final int[] d(int[] iArr) {
        n nVar = this.f6456p;
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

    /* JADX WARNING: type inference failed for: r9v1, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r9v9 */
    /* JADX WARNING: type inference failed for: r11v2, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r9v10 */
    /* JADX WARNING: type inference failed for: r11v3, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(android.graphics.Canvas r22, android.graphics.Matrix r23, int r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            boolean r2 = r0.f6444b
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            android.graphics.Path r2 = r0.f6447f
            r2.reset()
            r3 = 0
            r4 = r3
        L_0x0010:
            java.util.ArrayList r5 = r0.f6450i
            int r6 = r5.size()
            if (r4 >= r6) goto L_0x0028
            java.lang.Object r5 = r5.get(r4)
            j1.m r5 = (j1.m) r5
            android.graphics.Path r5 = r5.f()
            r2.addPath(r5, r1)
            int r4 = r4 + 1
            goto L_0x0010
        L_0x0028:
            android.graphics.RectF r4 = r0.f6449h
            r2.computeBounds(r4, r3)
            o1.f r4 = o1.f.LINEAR
            o1.f r5 = r0.f6451j
            k1.f r6 = r0.f6452k
            k1.f r7 = r0.f6454n
            k1.f r8 = r0.f6453m
            r9 = 0
            if (r5 != r4) goto L_0x007b
            int r4 = r21.i()
            long r4 = (long) r4
            n.f<android.graphics.LinearGradient> r10 = r0.d
            java.lang.Object r9 = r10.h(r4, r9)
            android.graphics.LinearGradient r9 = (android.graphics.LinearGradient) r9
            if (r9 == 0) goto L_0x004b
            goto L_0x00d0
        L_0x004b:
            java.lang.Object r8 = r8.f()
            android.graphics.PointF r8 = (android.graphics.PointF) r8
            java.lang.Object r7 = r7.f()
            android.graphics.PointF r7 = (android.graphics.PointF) r7
            java.lang.Object r6 = r6.f()
            o1.c r6 = (o1.c) r6
            int[] r9 = r6.f7610b
            int[] r16 = r0.d(r9)
            float[] r6 = r6.f7609a
            android.graphics.LinearGradient r9 = new android.graphics.LinearGradient
            float r12 = r8.x
            float r13 = r8.y
            float r14 = r7.x
            float r15 = r7.y
            android.graphics.Shader$TileMode r18 = android.graphics.Shader.TileMode.CLAMP
            r11 = r9
            r17 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r10.i(r4, r9)
            goto L_0x00d0
        L_0x007b:
            int r4 = r21.i()
            long r4 = (long) r4
            n.f<android.graphics.RadialGradient> r10 = r0.f6446e
            java.lang.Object r9 = r10.h(r4, r9)
            android.graphics.RadialGradient r9 = (android.graphics.RadialGradient) r9
            if (r9 == 0) goto L_0x008b
            goto L_0x00d0
        L_0x008b:
            java.lang.Object r8 = r8.f()
            android.graphics.PointF r8 = (android.graphics.PointF) r8
            java.lang.Object r7 = r7.f()
            android.graphics.PointF r7 = (android.graphics.PointF) r7
            java.lang.Object r6 = r6.f()
            o1.c r6 = (o1.c) r6
            int[] r9 = r6.f7610b
            int[] r15 = r0.d(r9)
            float[] r6 = r6.f7609a
            float r12 = r8.x
            float r13 = r8.y
            float r8 = r7.x
            float r7 = r7.y
            float r8 = r8 - r12
            double r8 = (double) r8
            float r7 = r7 - r13
            r19 = r4
            double r3 = (double) r7
            double r3 = java.lang.Math.hypot(r8, r3)
            float r3 = (float) r3
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x00c0
            r3 = 981668463(0x3a83126f, float:0.001)
        L_0x00c0:
            r14 = r3
            android.graphics.RadialGradient r9 = new android.graphics.RadialGradient
            android.graphics.Shader$TileMode r17 = android.graphics.Shader.TileMode.CLAMP
            r11 = r9
            r16 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r3 = r19
            r10.i(r3, r9)
        L_0x00d0:
            r9.setLocalMatrix(r1)
            i1.a r1 = r0.f6448g
            r1.setShader(r9)
            k1.n r3 = r0.f6455o
            if (r3 == 0) goto L_0x00e5
            java.lang.Object r3 = r3.f()
            android.graphics.ColorFilter r3 = (android.graphics.ColorFilter) r3
            r1.setColorFilter(r3)
        L_0x00e5:
            r3 = r24
            float r3 = (float) r3
            r4 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 / r4
            k1.f r5 = r0.l
            java.lang.Object r5 = r5.f()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            float r5 = (float) r5
            float r3 = r3 * r5
            r5 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 / r5
            float r3 = r3 * r4
            int r3 = (int) r3
            android.graphics.PointF r4 = t1.f.f8885a
            r4 = 255(0xff, float:3.57E-43)
            int r3 = java.lang.Math.min(r4, r3)
            r4 = 0
            int r3 = java.lang.Math.max(r4, r3)
            r1.setAlpha(r3)
            r3 = r22
            r3.drawPath(r2, r1)
            androidx.databinding.a.n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.h.e(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final void g(e eVar, int i10, ArrayList arrayList, e eVar2) {
        t1.f.d(eVar, i10, arrayList, eVar2, this);
    }

    public final String getName() {
        return this.f6443a;
    }

    public final void h(c cVar, Object obj) {
        n nVar;
        if (obj == q.d) {
            this.l.k(cVar);
            return;
        }
        ColorFilter colorFilter = q.E;
        b bVar = this.f6445c;
        if (obj == colorFilter) {
            n nVar2 = this.f6455o;
            if (nVar2 != null) {
                bVar.n(nVar2);
            }
            if (cVar == null) {
                this.f6455o = null;
                return;
            }
            n nVar3 = new n(cVar, null);
            this.f6455o = nVar3;
            nVar3.a(this);
            nVar = this.f6455o;
        } else if (obj == q.F) {
            n nVar4 = this.f6456p;
            if (nVar4 != null) {
                bVar.n(nVar4);
            }
            if (cVar == null) {
                this.f6456p = null;
                return;
            }
            this.d.c();
            this.f6446e.c();
            n nVar5 = new n(cVar, null);
            this.f6456p = nVar5;
            nVar5.a(this);
            nVar = this.f6456p;
        } else {
            return;
        }
        bVar.d(nVar);
    }

    public final int i() {
        int i10;
        float f10 = this.f6453m.d;
        float f11 = (float) this.f6458r;
        int round = Math.round(f10 * f11);
        int round2 = Math.round(this.f6454n.d * f11);
        int round3 = Math.round(this.f6452k.d * f11);
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

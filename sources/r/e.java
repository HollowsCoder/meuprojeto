package r;

import androidx.constraintlayout.widget.ConstraintLayout;
import b0.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q.e;
import q.f;
import q.g;
import q.i;
import r.b;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final f f8290a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8291b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8292c = true;
    public final f d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<p> f8293e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public b.C0118b f8294f;

    /* renamed from: g  reason: collision with root package name */
    public final b.a f8295g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList<m> f8296h;

    public e(f fVar) {
        new ArrayList();
        this.f8294f = null;
        this.f8295g = new b.a();
        this.f8296h = new ArrayList<>();
        this.f8290a = fVar;
        this.d = fVar;
    }

    public final void a(f fVar, int i10, int i11, ArrayList arrayList, m mVar) {
        p pVar = fVar.d;
        if (pVar.f8322c == null) {
            f fVar2 = this.f8290a;
            if (pVar != fVar2.d && pVar != fVar2.f8158e) {
                if (mVar == null) {
                    mVar = new m(pVar);
                    arrayList.add(mVar);
                }
                pVar.f8322c = mVar;
                mVar.f8312b.add(pVar);
                f fVar3 = pVar.f8326h;
                Iterator it = fVar3.f8306k.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    if (dVar instanceof f) {
                        a((f) dVar, i10, 0, arrayList, mVar);
                    }
                }
                f fVar4 = pVar.f8327i;
                Iterator it2 = fVar4.f8306k.iterator();
                while (it2.hasNext()) {
                    d dVar2 = (d) it2.next();
                    if (dVar2 instanceof f) {
                        a((f) dVar2, i10, 1, arrayList, mVar);
                    }
                }
                if (i10 == 1 && (pVar instanceof n)) {
                    Iterator it3 = ((n) pVar).f8313k.f8306k.iterator();
                    while (it3.hasNext()) {
                        d dVar3 = (d) it3.next();
                        if (dVar3 instanceof f) {
                            a((f) dVar3, i10, 2, arrayList, mVar);
                        }
                    }
                }
                Iterator it4 = fVar3.l.iterator();
                while (it4.hasNext()) {
                    a((f) it4.next(), i10, 0, arrayList, mVar);
                }
                Iterator it5 = fVar4.l.iterator();
                while (it5.hasNext()) {
                    a((f) it5.next(), i10, 1, arrayList, mVar);
                }
                if (i10 == 1 && (pVar instanceof n)) {
                    Iterator it6 = ((n) pVar).f8313k.l.iterator();
                    while (it6.hasNext()) {
                        a((f) it6.next(), i10, 2, arrayList, mVar);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006e, code lost:
        if (r2.f8184s == 0) goto L_0x0070;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0195  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(q.f r18) {
        /*
            r17 = this;
            r0 = r18
            java.util.ArrayList<q.e> r1 = r0.f8205r0
            java.util.Iterator r1 = r1.iterator()
        L_0x0008:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0273
            java.lang.Object r2 = r1.next()
            q.e r2 = (q.e) r2
            q.e$b[] r3 = r2.U
            r4 = 0
            r5 = r3[r4]
            r9 = 1
            r3 = r3[r9]
            int r6 = r2.f8167i0
            r7 = 8
            if (r6 != r7) goto L_0x0025
            r2.f8151a = r9
            goto L_0x0008
        L_0x0025:
            float r6 = r2.w
            r10 = 1065353216(0x3f800000, float:1.0)
            int r7 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            r8 = 2
            if (r7 >= 0) goto L_0x0034
            q.e$b r7 = q.e.b.MATCH_CONSTRAINT
            if (r5 != r7) goto L_0x0034
            r2.f8183r = r8
        L_0x0034:
            float r7 = r2.z
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 >= 0) goto L_0x0040
            q.e$b r11 = q.e.b.MATCH_CONSTRAINT
            if (r3 != r11) goto L_0x0040
            r2.f8184s = r8
        L_0x0040:
            float r11 = r2.Y
            r12 = 0
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            r12 = 3
            if (r11 <= 0) goto L_0x0072
            q.e$b r11 = q.e.b.MATCH_CONSTRAINT
            if (r5 != r11) goto L_0x0057
            q.e$b r13 = q.e.b.WRAP_CONTENT
            if (r3 == r13) goto L_0x0054
            q.e$b r13 = q.e.b.FIXED
            if (r3 != r13) goto L_0x0057
        L_0x0054:
            r2.f8183r = r12
            goto L_0x0072
        L_0x0057:
            if (r3 != r11) goto L_0x0062
            q.e$b r13 = q.e.b.WRAP_CONTENT
            if (r5 == r13) goto L_0x0070
            q.e$b r13 = q.e.b.FIXED
            if (r5 != r13) goto L_0x0062
            goto L_0x0070
        L_0x0062:
            if (r5 != r11) goto L_0x0072
            if (r3 != r11) goto L_0x0072
            int r11 = r2.f8183r
            if (r11 != 0) goto L_0x006c
            r2.f8183r = r12
        L_0x006c:
            int r11 = r2.f8184s
            if (r11 != 0) goto L_0x0072
        L_0x0070:
            r2.f8184s = r12
        L_0x0072:
            q.e$b r11 = q.e.b.MATCH_CONSTRAINT
            q.d r13 = r2.L
            q.d r14 = r2.J
            if (r5 != r11) goto L_0x0088
            int r15 = r2.f8183r
            if (r15 != r9) goto L_0x0088
            q.d r15 = r14.f8146f
            if (r15 == 0) goto L_0x0086
            q.d r15 = r13.f8146f
            if (r15 != 0) goto L_0x0088
        L_0x0086:
            q.e$b r5 = q.e.b.WRAP_CONTENT
        L_0x0088:
            q.d r15 = r2.M
            q.d r10 = r2.K
            if (r3 != r11) goto L_0x009c
            int r4 = r2.f8184s
            if (r4 != r9) goto L_0x009c
            q.d r4 = r10.f8146f
            if (r4 == 0) goto L_0x009a
            q.d r4 = r15.f8146f
            if (r4 != 0) goto L_0x009c
        L_0x009a:
            q.e$b r3 = q.e.b.WRAP_CONTENT
        L_0x009c:
            r4 = r3
            r.l r3 = r2.d
            r3.d = r5
            int r8 = r2.f8183r
            r3.f8320a = r8
            r.n r3 = r2.f8158e
            r3.d = r4
            int r9 = r2.f8184s
            r3.f8320a = r9
            q.e$b r3 = q.e.b.MATCH_PARENT
            if (r5 == r3) goto L_0x00b9
            q.e$b r12 = q.e.b.FIXED
            if (r5 == r12) goto L_0x00b9
            q.e$b r12 = q.e.b.WRAP_CONTENT
            if (r5 != r12) goto L_0x00c5
        L_0x00b9:
            if (r4 == r3) goto L_0x022a
            q.e$b r12 = q.e.b.FIXED
            if (r4 == r12) goto L_0x022a
            q.e$b r12 = q.e.b.WRAP_CONTENT
            if (r4 != r12) goto L_0x00c5
            goto L_0x022a
        L_0x00c5:
            r10 = 1056964608(0x3f000000, float:0.5)
            q.e$b[] r12 = r0.U
            q.d[] r13 = r2.R
            if (r5 != r11) goto L_0x015f
            q.e$b r14 = q.e.b.WRAP_CONTENT
            if (r4 == r14) goto L_0x00d5
            q.e$b r15 = q.e.b.FIXED
            if (r4 != r15) goto L_0x015f
        L_0x00d5:
            r15 = 3
            if (r8 != r15) goto L_0x00f4
            if (r4 != r14) goto L_0x00e4
            r6 = 0
            r8 = 0
            r3 = r17
            r4 = r2
            r5 = r14
            r7 = r14
            r3.f(r4, r5, r6, r7, r8)
        L_0x00e4:
            int r3 = r2.i()
            float r4 = (float) r3
            float r5 = r2.Y
            float r4 = r4 * r5
            float r4 = r4 + r10
            int r4 = (int) r4
            q.e$b r5 = q.e.b.FIXED
            r8 = r3
            r6 = r4
            r7 = r5
            goto L_0x0129
        L_0x00f4:
            r15 = 1
            if (r8 != r15) goto L_0x010c
            r6 = 0
            r8 = 0
            r3 = r17
            r15 = r4
            r4 = r2
            r5 = r14
            r7 = r15
            r3.f(r4, r5, r6, r7, r8)
            r.l r3 = r2.d
            r.g r3 = r3.f8323e
            int r2 = r2.k()
            goto L_0x0226
        L_0x010c:
            r15 = r4
            r4 = 2
            if (r8 != r4) goto L_0x014a
            r4 = 0
            r14 = r12[r4]
            q.e$b r4 = q.e.b.FIXED
            if (r14 == r4) goto L_0x0119
            if (r14 != r3) goto L_0x0160
        L_0x0119:
            int r3 = r18.k()
            float r3 = (float) r3
            float r6 = r6 * r3
            float r6 = r6 + r10
            int r3 = (int) r6
            int r5 = r2.i()
            r6 = r3
            r8 = r5
            r7 = r15
            r5 = r4
        L_0x0129:
            r3 = r17
            r4 = r2
        L_0x012c:
            r3.f(r4, r5, r6, r7, r8)
            r.l r3 = r2.d
            r.g r3 = r3.f8323e
            int r4 = r2.k()
            r3.d(r4)
            r.n r3 = r2.f8158e
            r.g r3 = r3.f8323e
            int r4 = r2.i()
            r3.d(r4)
            r4 = 1
            r2.f8151a = r4
            goto L_0x0008
        L_0x014a:
            r4 = 1
            r16 = 0
            r10 = r13[r16]
            q.d r10 = r10.f8146f
            if (r10 == 0) goto L_0x0159
            r10 = r13[r4]
            q.d r4 = r10.f8146f
            if (r4 != 0) goto L_0x0160
        L_0x0159:
            r5 = r14
            r7 = r15
            r6 = 0
            r8 = 0
            goto L_0x0252
        L_0x015f:
            r15 = r4
        L_0x0160:
            if (r15 != r11) goto L_0x01d9
            q.e$b r10 = q.e.b.WRAP_CONTENT
            if (r5 == r10) goto L_0x016a
            q.e$b r4 = q.e.b.FIXED
            if (r5 != r4) goto L_0x01d9
        L_0x016a:
            r4 = 3
            if (r9 != r4) goto L_0x0195
            if (r5 != r10) goto L_0x0179
            r6 = 0
            r8 = 0
            r3 = r17
            r4 = r2
            r5 = r10
            r7 = r10
            r3.f(r4, r5, r6, r7, r8)
        L_0x0179:
            int r6 = r2.k()
            float r3 = r2.Y
            int r4 = r2.Z
            r5 = -1
            if (r4 != r5) goto L_0x0188
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r4 / r3
        L_0x0188:
            float r4 = (float) r6
            float r4 = r4 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r3
            int r8 = (int) r4
            q.e$b r7 = q.e.b.FIXED
            r3 = r17
            r4 = r2
            r5 = r7
            goto L_0x012c
        L_0x0195:
            r4 = 1
            if (r9 != r4) goto L_0x01a3
            r6 = 0
            r8 = 0
            r3 = r17
            r4 = r2
            r7 = r10
            r3.f(r4, r5, r6, r7, r8)
            goto L_0x021e
        L_0x01a3:
            r4 = 2
            if (r9 != r4) goto L_0x01c2
            r4 = 1
            r10 = r12[r4]
            q.e$b r4 = q.e.b.FIXED
            if (r10 == r4) goto L_0x01af
            if (r10 != r3) goto L_0x01d9
        L_0x01af:
            int r3 = r2.k()
            int r6 = r18.i()
            float r6 = (float) r6
            float r7 = r7 * r6
            r6 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r6
            int r6 = (int) r7
            r7 = r4
            r8 = r6
            r6 = r3
            goto L_0x0252
        L_0x01c2:
            r3 = r4
            r4 = r13[r3]
            q.d r3 = r4.f8146f
            if (r3 == 0) goto L_0x01d0
            r3 = 3
            r3 = r13[r3]
            q.d r3 = r3.f8146f
            if (r3 != 0) goto L_0x01d9
        L_0x01d0:
            r6 = 0
            r8 = 0
            r3 = r17
            r4 = r2
            r5 = r10
            r7 = r15
            goto L_0x0255
        L_0x01d9:
            r3 = 1
            if (r5 != r11) goto L_0x0008
            if (r15 != r11) goto L_0x0008
            if (r8 == r3) goto L_0x0209
            if (r9 != r3) goto L_0x01e3
            goto L_0x0209
        L_0x01e3:
            r4 = 2
            if (r9 != r4) goto L_0x0008
            if (r8 != r4) goto L_0x0008
            r4 = 0
            r4 = r12[r4]
            q.e$b r5 = q.e.b.FIXED
            if (r4 != r5) goto L_0x0008
            r4 = r12[r3]
            if (r4 != r5) goto L_0x0008
            int r3 = r18.k()
            float r3 = (float) r3
            float r6 = r6 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 + r3
            int r4 = (int) r6
            int r6 = r18.i()
            float r6 = (float) r6
            float r7 = r7 * r6
            float r7 = r7 + r3
            int r3 = (int) r7
            r8 = r3
            r6 = r4
            r7 = r5
            goto L_0x0252
        L_0x0209:
            q.e$b r7 = q.e.b.WRAP_CONTENT
            r6 = 0
            r8 = 0
            r3 = r17
            r4 = r2
            r5 = r7
            r3.f(r4, r5, r6, r7, r8)
            r.l r3 = r2.d
            r.g r3 = r3.f8323e
            int r4 = r2.k()
            r3.f8307m = r4
        L_0x021e:
            r.n r3 = r2.f8158e
            r.g r3 = r3.f8323e
            int r2 = r2.i()
        L_0x0226:
            r3.f8307m = r2
            goto L_0x0008
        L_0x022a:
            int r6 = r2.k()
            if (r5 != r3) goto L_0x023d
            int r5 = r18.k()
            int r6 = r14.f8147g
            int r5 = r5 - r6
            int r6 = r13.f8147g
            int r6 = r5 - r6
            q.e$b r5 = q.e.b.FIXED
        L_0x023d:
            int r7 = r2.i()
            if (r4 != r3) goto L_0x0250
            int r3 = r18.i()
            int r4 = r10.f8147g
            int r3 = r3 - r4
            int r4 = r15.f8147g
            int r7 = r3 - r4
            q.e$b r4 = q.e.b.FIXED
        L_0x0250:
            r8 = r7
            r7 = r4
        L_0x0252:
            r3 = r17
            r4 = r2
        L_0x0255:
            r3.f(r4, r5, r6, r7, r8)
            r.l r3 = r2.d
            r.g r3 = r3.f8323e
            int r4 = r2.k()
            r3.d(r4)
            r.n r3 = r2.f8158e
            r.g r3 = r3.f8323e
            int r4 = r2.i()
            r3.d(r4)
            r3 = 1
            r2.f8151a = r3
            goto L_0x0008
        L_0x0273:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r.e.b(q.f):void");
    }

    public final void c() {
        Object obj;
        ArrayList<p> arrayList = this.f8293e;
        arrayList.clear();
        f fVar = this.d;
        fVar.d.f();
        fVar.f8158e.f();
        arrayList.add(fVar.d);
        arrayList.add(fVar.f8158e);
        Iterator<q.e> it = fVar.f8205r0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            q.e next = it.next();
            if (next instanceof g) {
                obj = new j(next);
            } else {
                if (next.r()) {
                    if (next.f8153b == null) {
                        next.f8153b = new c(0, next);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f8153b);
                } else {
                    arrayList.add(next.d);
                }
                if (next.s()) {
                    if (next.f8155c == null) {
                        next.f8155c = new c(1, next);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f8155c);
                } else {
                    arrayList.add(next.f8158e);
                }
                if (next instanceof i) {
                    obj = new k(next);
                }
            }
            arrayList.add(obj);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f8321b != fVar) {
                next2.d();
            }
        }
        ArrayList<m> arrayList2 = this.f8296h;
        arrayList2.clear();
        f fVar2 = this.f8290a;
        e(fVar2.d, 0, arrayList2);
        e(fVar2.f8158e, 1, arrayList2);
        this.f8291b = false;
    }

    public final int d(f fVar, int i10) {
        int i11;
        ArrayList<m> arrayList;
        long j8;
        p pVar;
        p pVar2;
        long j10;
        long j11;
        float f10;
        long j12;
        f fVar2 = fVar;
        int i12 = i10;
        ArrayList<m> arrayList2 = this.f8296h;
        int size = arrayList2.size();
        int i13 = 0;
        long j13 = 0;
        while (i13 < size) {
            p pVar3 = arrayList2.get(i13).f8311a;
            if (!(pVar3 instanceof c) ? i12 != 0 ? (pVar3 instanceof n) : (pVar3 instanceof l) : ((c) pVar3).f8324f == i12) {
                if (i12 == 0) {
                    pVar = fVar2.d;
                } else {
                    pVar = fVar2.f8158e;
                }
                f fVar3 = pVar.f8326h;
                if (i12 == 0) {
                    pVar2 = fVar2.d;
                } else {
                    pVar2 = fVar2.f8158e;
                }
                f fVar4 = pVar2.f8327i;
                boolean contains = pVar3.f8326h.l.contains(fVar3);
                f fVar5 = pVar3.f8327i;
                boolean contains2 = fVar5.l.contains(fVar4);
                long j14 = pVar3.j();
                f fVar6 = pVar3.f8326h;
                if (!contains || !contains2) {
                    arrayList = arrayList2;
                    i11 = size;
                    if (contains) {
                        j11 = m.b(fVar6, (long) fVar6.f8301f);
                        j10 = ((long) fVar6.f8301f) + j14;
                    } else if (contains2) {
                        long a10 = m.a(fVar5, (long) fVar5.f8301f);
                        j10 = ((long) (-fVar5.f8301f)) + j14;
                        j11 = -a10;
                    } else {
                        j8 = (pVar3.j() + ((long) fVar6.f8301f)) - ((long) fVar5.f8301f);
                    }
                    j8 = Math.max(j11, j10);
                } else {
                    long b10 = m.b(fVar6, 0);
                    long a11 = m.a(fVar5, 0);
                    long j15 = b10 - j14;
                    int i14 = fVar5.f8301f;
                    arrayList = arrayList2;
                    i11 = size;
                    if (j15 >= ((long) (-i14))) {
                        j15 += (long) i14;
                    }
                    long j16 = j15;
                    long j17 = (long) fVar6.f8301f;
                    long j18 = ((-a11) - j14) - j17;
                    if (j18 >= j17) {
                        j18 -= j17;
                    }
                    q.e eVar = pVar3.f8321b;
                    if (i12 == 0) {
                        f10 = eVar.f8161f0;
                    } else if (i12 == 1) {
                        f10 = eVar.f8163g0;
                    } else {
                        eVar.getClass();
                        f10 = -1.0f;
                    }
                    if (f10 > 0.0f) {
                        j12 = (long) ((((float) j16) / (1.0f - f10)) + (((float) j18) / f10));
                    } else {
                        j12 = 0;
                    }
                    float f11 = (float) j12;
                    j8 = (((long) fVar6.f8301f) + ((((long) ((f11 * f10) + 0.5f)) + j14) + ((long) d.a(1.0f, f10, f11, 0.5f)))) - ((long) fVar5.f8301f);
                }
            } else {
                j8 = 0;
                arrayList = arrayList2;
                i11 = size;
            }
            j13 = Math.max(j13, j8);
            i13++;
            fVar2 = fVar;
            i12 = i10;
            arrayList2 = arrayList;
            size = i11;
        }
        return (int) j13;
    }

    public final void e(p pVar, int i10, ArrayList<m> arrayList) {
        f fVar;
        f fVar2;
        f fVar3;
        Iterator it = pVar.f8326h.f8306k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            fVar = pVar.f8327i;
            if (!hasNext) {
                break;
            }
            d dVar = (d) it.next();
            if (dVar instanceof f) {
                fVar3 = (f) dVar;
            } else if (dVar instanceof p) {
                fVar3 = ((p) dVar).f8326h;
            }
            a(fVar3, i10, 0, arrayList, (m) null);
        }
        Iterator it2 = fVar.f8306k.iterator();
        while (it2.hasNext()) {
            d dVar2 = (d) it2.next();
            if (dVar2 instanceof f) {
                fVar2 = (f) dVar2;
            } else if (dVar2 instanceof p) {
                fVar2 = ((p) dVar2).f8327i;
            }
            a(fVar2, i10, 1, arrayList, (m) null);
        }
        if (i10 == 1) {
            Iterator it3 = ((n) pVar).f8313k.f8306k.iterator();
            while (it3.hasNext()) {
                d dVar3 = (d) it3.next();
                if (dVar3 instanceof f) {
                    a((f) dVar3, i10, 2, arrayList, (m) null);
                }
            }
        }
    }

    public final void f(q.e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        boolean z;
        b.a aVar = this.f8295g;
        aVar.f8280a = bVar;
        aVar.f8281b = bVar2;
        aVar.f8282c = i10;
        aVar.d = i11;
        ((ConstraintLayout.c) this.f8294f).b(eVar, aVar);
        eVar.E(aVar.f8283e);
        eVar.B(aVar.f8284f);
        eVar.E = aVar.f8286h;
        int i12 = aVar.f8285g;
        eVar.f8156c0 = i12;
        if (i12 > 0) {
            z = true;
        } else {
            z = false;
        }
        eVar.E = z;
    }

    public final void g() {
        boolean z;
        a aVar;
        int i10;
        g gVar;
        int i11;
        g gVar2;
        Iterator<q.e> it = this.f8290a.f8205r0.iterator();
        while (it.hasNext()) {
            q.e next = it.next();
            if (!next.f8151a) {
                e.b[] bVarArr = next.U;
                boolean z10 = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i12 = next.f8183r;
                int i13 = next.f8184s;
                e.b bVar3 = e.b.WRAP_CONTENT;
                if (bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i12 == 1)) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i13 == 1)) {
                    z10 = true;
                }
                g gVar3 = next.d.f8323e;
                boolean z11 = gVar3.f8305j;
                g gVar4 = next.f8158e.f8323e;
                boolean z12 = gVar4.f8305j;
                if (!z11 || !z12) {
                    if (!z11 || !z10) {
                        if (z12 && z) {
                            f(next, bVar3, gVar3.f8302g, e.b.FIXED, gVar4.f8302g);
                            if (bVar == e.b.MATCH_CONSTRAINT) {
                                gVar2 = next.d.f8323e;
                                i11 = next.k();
                            } else {
                                gVar = next.d.f8323e;
                                i10 = next.k();
                                gVar.d(i10);
                            }
                        }
                        if (next.f8151a && (aVar = next.f8158e.l) != null) {
                            aVar.d(next.f8156c0);
                        }
                    } else {
                        f(next, e.b.FIXED, gVar3.f8302g, bVar3, gVar4.f8302g);
                        if (bVar2 == e.b.MATCH_CONSTRAINT) {
                            gVar2 = next.f8158e.f8323e;
                            i11 = next.i();
                        } else {
                            gVar = next.f8158e.f8323e;
                            i10 = next.i();
                            gVar.d(i10);
                        }
                    }
                    gVar2.f8307m = i11;
                    aVar.d(next.f8156c0);
                } else {
                    e.b bVar4 = e.b.FIXED;
                    f(next, bVar4, gVar3.f8302g, bVar4, gVar4.f8302g);
                }
                next.f8151a = true;
                aVar.d(next.f8156c0);
            }
        }
    }
}

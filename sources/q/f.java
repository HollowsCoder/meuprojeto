package q;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import o.d;
import q.e;
import r.b;
import r.e;

public final class f extends l {
    public int A0 = 0;
    public int B0 = 0;
    public c[] C0 = new c[4];
    public c[] D0 = new c[4];
    public int E0 = 257;
    public boolean F0 = false;
    public boolean G0 = false;
    public WeakReference<d> H0 = null;
    public WeakReference<d> I0 = null;
    public WeakReference<d> J0 = null;
    public WeakReference<d> K0 = null;
    public final HashSet<e> L0 = new HashSet<>();
    public final b.a M0 = new b.a();

    /* renamed from: s0  reason: collision with root package name */
    public final b f8191s0 = new b(this);
    public final e t0 = new e(this);

    /* renamed from: u0  reason: collision with root package name */
    public int f8192u0;

    /* renamed from: v0  reason: collision with root package name */
    public b.C0118b f8193v0 = null;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f8194w0 = false;
    public final d x0 = new d();
    public int y0;

    /* renamed from: z0  reason: collision with root package name */
    public int f8195z0;

    public static void L(e eVar, b.C0118b bVar, b.a aVar) {
        boolean z;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        int i12;
        if (bVar != null) {
            if (eVar.f8167i0 == 8 || (eVar instanceof g) || (eVar instanceof a)) {
                aVar.f8283e = 0;
                aVar.f8284f = 0;
                return;
            }
            e.b[] bVarArr = eVar.U;
            aVar.f8280a = bVarArr[0];
            boolean z13 = true;
            aVar.f8281b = bVarArr[1];
            aVar.f8282c = eVar.k();
            aVar.d = eVar.i();
            aVar.f8287i = false;
            aVar.f8288j = 0;
            e.b bVar2 = aVar.f8280a;
            e.b bVar3 = e.b.MATCH_CONSTRAINT;
            if (bVar2 == bVar3) {
                z = true;
            } else {
                z = false;
            }
            if (aVar.f8281b == bVar3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z || eVar.Y <= 0.0f) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z10 || eVar.Y <= 0.0f) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (z && eVar.n(0) && eVar.f8183r == 0 && !z11) {
                aVar.f8280a = e.b.WRAP_CONTENT;
                if (z10 && eVar.f8184s == 0) {
                    aVar.f8280a = e.b.FIXED;
                }
                z = false;
            }
            if (z10 && eVar.n(1) && eVar.f8184s == 0 && !z12) {
                aVar.f8281b = e.b.WRAP_CONTENT;
                if (z && eVar.f8183r == 0) {
                    aVar.f8281b = e.b.FIXED;
                }
                z10 = false;
            }
            if (eVar.u()) {
                aVar.f8280a = e.b.FIXED;
                z = false;
            }
            if (eVar.v()) {
                aVar.f8281b = e.b.FIXED;
                z10 = false;
            }
            int[] iArr = eVar.f8185t;
            if (z11) {
                if (iArr[0] == 4) {
                    aVar.f8280a = e.b.FIXED;
                } else if (!z10) {
                    e.b bVar4 = aVar.f8281b;
                    e.b bVar5 = e.b.FIXED;
                    if (bVar4 == bVar5) {
                        i12 = aVar.d;
                    } else {
                        aVar.f8280a = e.b.WRAP_CONTENT;
                        ((ConstraintLayout.c) bVar).b(eVar, aVar);
                        i12 = aVar.f8284f;
                    }
                    aVar.f8280a = bVar5;
                    aVar.f8282c = (int) (eVar.Y * ((float) i12));
                }
            }
            if (z12) {
                if (iArr[1] == 4) {
                    aVar.f8281b = e.b.FIXED;
                } else if (!z) {
                    e.b bVar6 = aVar.f8280a;
                    e.b bVar7 = e.b.FIXED;
                    if (bVar6 == bVar7) {
                        i10 = aVar.f8282c;
                    } else {
                        aVar.f8281b = e.b.WRAP_CONTENT;
                        ((ConstraintLayout.c) bVar).b(eVar, aVar);
                        i10 = aVar.f8283e;
                    }
                    aVar.f8281b = bVar7;
                    if (eVar.Z == -1) {
                        i11 = (int) (((float) i10) / eVar.Y);
                    } else {
                        i11 = (int) (eVar.Y * ((float) i10));
                    }
                    aVar.d = i11;
                }
            }
            ((ConstraintLayout.c) bVar).b(eVar, aVar);
            eVar.E(aVar.f8283e);
            eVar.B(aVar.f8284f);
            eVar.E = aVar.f8286h;
            int i13 = aVar.f8285g;
            eVar.f8156c0 = i13;
            if (i13 <= 0) {
                z13 = false;
            }
            eVar.E = z13;
            aVar.f8288j = 0;
        }
    }

    public final void F(boolean z, boolean z10) {
        super.F(z, z10);
        int size = this.f8205r0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f8205r0.get(i10).F(z, z10);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v99, resolved type: q.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v100, resolved type: q.a} */
    /* JADX WARNING: type inference failed for: r5v7, types: [boolean] */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: type inference failed for: r5v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0606, code lost:
        r0 = false;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x05d4  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x062e  */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x0644  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x066f  */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0671  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x067c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x0690  */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x0692  */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x069c  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x06b9  */
    /* JADX WARNING: Removed duplicated region for block: B:468:0x07a2  */
    /* JADX WARNING: Removed duplicated region for block: B:480:0x07e9  */
    /* JADX WARNING: Removed duplicated region for block: B:491:0x0812 A[LOOP:34: B:490:0x0810->B:491:0x0812, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:503:0x0879  */
    /* JADX WARNING: Removed duplicated region for block: B:506:0x0895  */
    /* JADX WARNING: Removed duplicated region for block: B:507:0x08a2  */
    /* JADX WARNING: Removed duplicated region for block: B:509:0x08a5  */
    /* JADX WARNING: Removed duplicated region for block: B:523:0x08e3  */
    /* JADX WARNING: Removed duplicated region for block: B:524:0x08e5  */
    /* JADX WARNING: Removed duplicated region for block: B:528:0x08f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void H() {
        /*
            r29 = this;
            r1 = r29
            r2 = 0
            r1.f8152a0 = r2
            r1.f8154b0 = r2
            r1.F0 = r2
            r1.G0 = r2
            java.util.ArrayList<q.e> r0 = r1.f8205r0
            int r3 = r0.size()
            int r0 = r29.k()
            int r0 = java.lang.Math.max(r2, r0)
            int r4 = r29.i()
            int r4 = java.lang.Math.max(r2, r4)
            q.e$b[] r5 = r1.U
            r6 = 1
            r7 = r5[r6]
            r8 = r5[r2]
            int r9 = r1.f8192u0
            q.d r11 = r1.K
            q.d r12 = r1.J
            if (r9 != 0) goto L_0x0258
            int r9 = r1.E0
            boolean r9 = q.j.b(r9, r6)
            if (r9 == 0) goto L_0x0258
            r.b$b r9 = r1.f8193v0
            r13 = r5[r2]
            r14 = r5[r6]
            r29.x()
            java.util.ArrayList<q.e> r15 = r1.f8205r0
            int r10 = r15.size()
            r6 = r2
        L_0x0048:
            if (r6 >= r10) goto L_0x0056
            java.lang.Object r17 = r15.get(r6)
            q.e r17 = (q.e) r17
            r17.x()
            int r6 = r6 + 1
            goto L_0x0048
        L_0x0056:
            boolean r6 = r1.f8194w0
            q.e$b r2 = q.e.b.FIXED
            if (r13 != r2) goto L_0x0065
            int r2 = r29.k()
            r13 = 0
            r1.z(r13, r2)
            goto L_0x006b
        L_0x0065:
            r13 = 0
            r12.i(r13)
            r1.f8152a0 = r13
        L_0x006b:
            r2 = 0
            r13 = 0
            r18 = 0
        L_0x006f:
            r19 = 1056964608(0x3f000000, float:0.5)
            if (r13 >= r10) goto L_0x00d8
            java.lang.Object r20 = r15.get(r13)
            r21 = r12
            r12 = r20
            q.e r12 = (q.e) r12
            r20 = r4
            boolean r4 = r12 instanceof q.g
            if (r4 == 0) goto L_0x00bf
            q.g r12 = (q.g) r12
            int r4 = r12.f8199v0
            r22 = r5
            r5 = 1
            if (r4 != r5) goto L_0x00cf
            int r2 = r12.f8197s0
            r4 = -1
            if (r2 == r4) goto L_0x0092
            goto L_0x00b5
        L_0x0092:
            int r2 = r12.t0
            if (r2 == r4) goto L_0x00a4
            boolean r2 = r29.u()
            if (r2 == 0) goto L_0x00a4
            int r2 = r29.k()
            int r4 = r12.t0
            int r2 = r2 - r4
            goto L_0x00b5
        L_0x00a4:
            boolean r2 = r29.u()
            if (r2 == 0) goto L_0x00bd
            float r2 = r12.f8196r0
            int r4 = r29.k()
            float r4 = (float) r4
            float r2 = r2 * r4
            float r2 = r2 + r19
            int r2 = (int) r2
        L_0x00b5:
            q.d r4 = r12.f8198u0
            r4.i(r2)
            r2 = 1
            r12.f8200w0 = r2
        L_0x00bd:
            r2 = 1
            goto L_0x00cf
        L_0x00bf:
            r22 = r5
            boolean r4 = r12 instanceof q.a
            if (r4 == 0) goto L_0x00cf
            q.a r12 = (q.a) r12
            int r4 = r12.J()
            if (r4 != 0) goto L_0x00cf
            r18 = 1
        L_0x00cf:
            int r13 = r13 + 1
            r4 = r20
            r12 = r21
            r5 = r22
            goto L_0x006f
        L_0x00d8:
            r20 = r4
            r22 = r5
            r21 = r12
            if (r2 == 0) goto L_0x00fd
            r2 = 0
        L_0x00e1:
            if (r2 >= r10) goto L_0x00fd
            java.lang.Object r4 = r15.get(r2)
            q.e r4 = (q.e) r4
            boolean r5 = r4 instanceof q.g
            if (r5 == 0) goto L_0x00f9
            q.g r4 = (q.g) r4
            int r5 = r4.f8199v0
            r12 = 1
            if (r5 != r12) goto L_0x00f9
            r5 = 0
            r.h.b(r5, r4, r9, r6)
            goto L_0x00fa
        L_0x00f9:
            r5 = 0
        L_0x00fa:
            int r2 = r2 + 1
            goto L_0x00e1
        L_0x00fd:
            r5 = 0
            r.h.b(r5, r1, r9, r6)
            if (r18 == 0) goto L_0x0125
            r2 = 0
        L_0x0104:
            if (r2 >= r10) goto L_0x0125
            java.lang.Object r4 = r15.get(r2)
            q.e r4 = (q.e) r4
            boolean r5 = r4 instanceof q.a
            if (r5 == 0) goto L_0x0122
            q.a r4 = (q.a) r4
            int r5 = r4.J()
            if (r5 != 0) goto L_0x0122
            boolean r5 = r4.I()
            if (r5 == 0) goto L_0x0122
            r5 = 1
            r.h.b(r5, r4, r9, r6)
        L_0x0122:
            int r2 = r2 + 1
            goto L_0x0104
        L_0x0125:
            q.e$b r2 = q.e.b.FIXED
            if (r14 != r2) goto L_0x0132
            int r2 = r29.i()
            r4 = 0
            r1.A(r4, r2)
            goto L_0x0138
        L_0x0132:
            r4 = 0
            r11.i(r4)
            r1.f8154b0 = r4
        L_0x0138:
            r2 = 0
            r4 = 0
            r5 = 0
        L_0x013b:
            if (r4 >= r10) goto L_0x0193
            java.lang.Object r12 = r15.get(r4)
            q.e r12 = (q.e) r12
            boolean r13 = r12 instanceof q.g
            if (r13 == 0) goto L_0x0182
            q.g r12 = (q.g) r12
            int r13 = r12.f8199v0
            if (r13 != 0) goto L_0x0190
            int r2 = r12.f8197s0
            r13 = -1
            if (r2 == r13) goto L_0x0153
            goto L_0x0176
        L_0x0153:
            int r2 = r12.t0
            if (r2 == r13) goto L_0x0165
            boolean r2 = r29.v()
            if (r2 == 0) goto L_0x0165
            int r2 = r29.i()
            int r13 = r12.t0
            int r2 = r2 - r13
            goto L_0x0176
        L_0x0165:
            boolean r2 = r29.v()
            if (r2 == 0) goto L_0x017f
            float r2 = r12.f8196r0
            int r13 = r29.i()
            float r13 = (float) r13
            float r2 = r2 * r13
            float r2 = r2 + r19
            int r2 = (int) r2
        L_0x0176:
            q.d r13 = r12.f8198u0
            r13.i(r2)
            r13 = 1
            r12.f8200w0 = r13
            goto L_0x0180
        L_0x017f:
            r13 = 1
        L_0x0180:
            r2 = r13
            goto L_0x0190
        L_0x0182:
            r13 = 1
            boolean r14 = r12 instanceof q.a
            if (r14 == 0) goto L_0x0190
            q.a r12 = (q.a) r12
            int r12 = r12.J()
            if (r12 != r13) goto L_0x0190
            r5 = 1
        L_0x0190:
            int r4 = r4 + 1
            goto L_0x013b
        L_0x0193:
            if (r2 == 0) goto L_0x01af
            r2 = 0
        L_0x0196:
            if (r2 >= r10) goto L_0x01af
            java.lang.Object r4 = r15.get(r2)
            q.e r4 = (q.e) r4
            boolean r12 = r4 instanceof q.g
            if (r12 == 0) goto L_0x01ac
            q.g r4 = (q.g) r4
            int r12 = r4.f8199v0
            if (r12 != 0) goto L_0x01ac
            r12 = 1
            r.h.g(r12, r4, r9)
        L_0x01ac:
            int r2 = r2 + 1
            goto L_0x0196
        L_0x01af:
            r2 = 0
            r.h.g(r2, r1, r9)
            if (r5 == 0) goto L_0x01d7
            r2 = 0
        L_0x01b6:
            if (r2 >= r10) goto L_0x01d7
            java.lang.Object r4 = r15.get(r2)
            q.e r4 = (q.e) r4
            boolean r5 = r4 instanceof q.a
            if (r5 == 0) goto L_0x01d4
            q.a r4 = (q.a) r4
            int r5 = r4.J()
            r12 = 1
            if (r5 != r12) goto L_0x01d4
            boolean r5 = r4.I()
            if (r5 == 0) goto L_0x01d4
            r.h.g(r12, r4, r9)
        L_0x01d4:
            int r2 = r2 + 1
            goto L_0x01b6
        L_0x01d7:
            r2 = 0
        L_0x01d8:
            if (r2 >= r10) goto L_0x020d
            java.lang.Object r4 = r15.get(r2)
            q.e r4 = (q.e) r4
            boolean r5 = r4.t()
            if (r5 == 0) goto L_0x020a
            boolean r5 = r.h.a(r4)
            if (r5 == 0) goto L_0x020a
            r.b$a r5 = r.h.f8308a
            L(r4, r9, r5)
            boolean r5 = r4 instanceof q.g
            if (r5 == 0) goto L_0x0203
            r5 = r4
            q.g r5 = (q.g) r5
            int r5 = r5.f8199v0
            if (r5 != 0) goto L_0x01fe
            r5 = 0
            goto L_0x0207
        L_0x01fe:
            r5 = 0
            r.h.b(r5, r4, r9, r6)
            goto L_0x020a
        L_0x0203:
            r5 = 0
            r.h.b(r5, r4, r9, r6)
        L_0x0207:
            r.h.g(r5, r4, r9)
        L_0x020a:
            int r2 = r2 + 1
            goto L_0x01d8
        L_0x020d:
            r2 = 0
        L_0x020e:
            if (r2 >= r3) goto L_0x025e
            java.util.ArrayList<q.e> r4 = r1.f8205r0
            java.lang.Object r4 = r4.get(r2)
            q.e r4 = (q.e) r4
            boolean r5 = r4.t()
            if (r5 == 0) goto L_0x0255
            boolean r5 = r4 instanceof q.g
            if (r5 != 0) goto L_0x0255
            boolean r5 = r4 instanceof q.a
            if (r5 != 0) goto L_0x0255
            boolean r5 = r4 instanceof q.k
            if (r5 != 0) goto L_0x0255
            boolean r5 = r4.G
            if (r5 != 0) goto L_0x0255
            r5 = 0
            q.e$b r6 = r4.h(r5)
            r5 = 1
            q.e$b r9 = r4.h(r5)
            q.e$b r10 = q.e.b.MATCH_CONSTRAINT
            if (r6 != r10) goto L_0x0248
            int r6 = r4.f8183r
            if (r6 == r5) goto L_0x0248
            if (r9 != r10) goto L_0x0248
            int r6 = r4.f8184s
            if (r6 == r5) goto L_0x0248
            r5 = 1
            goto L_0x0249
        L_0x0248:
            r5 = 0
        L_0x0249:
            if (r5 != 0) goto L_0x0255
            r.b$a r5 = new r.b$a
            r5.<init>()
            r.b$b r6 = r1.f8193v0
            L(r4, r6, r5)
        L_0x0255:
            int r2 = r2 + 1
            goto L_0x020e
        L_0x0258:
            r20 = r4
            r22 = r5
            r21 = r12
        L_0x025e:
            r2 = 2
            o.d r4 = r1.x0
            if (r3 <= r2) goto L_0x0653
            q.e$b r6 = q.e.b.WRAP_CONTENT
            if (r8 == r6) goto L_0x0269
            if (r7 != r6) goto L_0x0653
        L_0x0269:
            int r6 = r1.E0
            r9 = 1024(0x400, float:1.435E-42)
            boolean r6 = q.j.b(r6, r9)
            if (r6 == 0) goto L_0x0653
            r.b$b r6 = r1.f8193v0
            java.util.ArrayList<q.e> r9 = r1.f8205r0
            int r10 = r9.size()
            r12 = 0
        L_0x027c:
            if (r12 >= r10) goto L_0x02a7
            java.lang.Object r13 = r9.get(r12)
            q.e r13 = (q.e) r13
            r14 = 0
            r15 = r22[r14]
            r16 = 1
            r2 = r22[r16]
            q.e$b[] r13 = r13.U
            r5 = r13[r14]
            r13 = r13[r16]
            boolean r2 = r.i.b(r15, r2, r5, r13)
            if (r2 != 0) goto L_0x02a3
            r27 = r0
            r24 = r3
            r26 = r7
            r28 = r8
            r25 = r11
            goto L_0x0606
        L_0x02a3:
            int r12 = r12 + 1
            r2 = 2
            goto L_0x027c
        L_0x02a7:
            r2 = 0
            r5 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r23 = 0
        L_0x02af:
            if (r2 >= r10) goto L_0x0394
            java.lang.Object r24 = r9.get(r2)
            r25 = r11
            r11 = r24
            q.e r11 = (q.e) r11
            r24 = r3
            r17 = 0
            r3 = r22[r17]
            r26 = r7
            r16 = 1
            r7 = r22[r16]
            r27 = r0
            q.e$b[] r0 = r11.U
            r28 = r8
            r8 = r0[r17]
            r0 = r0[r16]
            boolean r0 = r.i.b(r3, r7, r8, r0)
            if (r0 != 0) goto L_0x02dc
            r.b$a r0 = r1.M0
            L(r11, r6, r0)
        L_0x02dc:
            boolean r0 = r11 instanceof q.g
            if (r0 == 0) goto L_0x0301
            r3 = r11
            q.g r3 = (q.g) r3
            int r7 = r3.f8199v0
            if (r7 != 0) goto L_0x02f2
            if (r13 != 0) goto L_0x02ef
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r13 = r7
        L_0x02ef:
            r13.add(r3)
        L_0x02f2:
            int r7 = r3.f8199v0
            r8 = 1
            if (r7 != r8) goto L_0x0301
            if (r5 != 0) goto L_0x02fe
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x02fe:
            r5.add(r3)
        L_0x0301:
            boolean r3 = r11 instanceof q.i
            if (r3 == 0) goto L_0x0344
            boolean r3 = r11 instanceof q.a
            if (r3 == 0) goto L_0x032c
            r3 = r11
            q.a r3 = (q.a) r3
            int r7 = r3.J()
            if (r7 != 0) goto L_0x031d
            if (r12 != 0) goto L_0x031a
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r12 = r7
        L_0x031a:
            r12.add(r3)
        L_0x031d:
            int r7 = r3.J()
            r8 = 1
            if (r7 != r8) goto L_0x0344
            if (r14 != 0) goto L_0x0341
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            goto L_0x0340
        L_0x032c:
            r3 = r11
            q.i r3 = (q.i) r3
            if (r12 != 0) goto L_0x0336
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
        L_0x0336:
            r12.add(r3)
            if (r14 != 0) goto L_0x0341
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x0340:
            r14 = r7
        L_0x0341:
            r14.add(r3)
        L_0x0344:
            q.d r3 = r11.J
            q.d r3 = r3.f8146f
            if (r3 != 0) goto L_0x0360
            q.d r3 = r11.L
            q.d r3 = r3.f8146f
            if (r3 != 0) goto L_0x0360
            if (r0 != 0) goto L_0x0360
            boolean r3 = r11 instanceof q.a
            if (r3 != 0) goto L_0x0360
            if (r15 != 0) goto L_0x035d
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
        L_0x035d:
            r15.add(r11)
        L_0x0360:
            q.d r3 = r11.K
            q.d r3 = r3.f8146f
            if (r3 != 0) goto L_0x0386
            q.d r3 = r11.M
            q.d r3 = r3.f8146f
            if (r3 != 0) goto L_0x0386
            q.d r3 = r11.N
            q.d r3 = r3.f8146f
            if (r3 != 0) goto L_0x0386
            if (r0 != 0) goto L_0x0386
            boolean r0 = r11 instanceof q.a
            if (r0 != 0) goto L_0x0386
            if (r23 != 0) goto L_0x037f
            java.util.ArrayList r23 = new java.util.ArrayList
            r23.<init>()
        L_0x037f:
            r0 = r23
            r0.add(r11)
            r23 = r0
        L_0x0386:
            int r2 = r2 + 1
            r3 = r24
            r11 = r25
            r7 = r26
            r0 = r27
            r8 = r28
            goto L_0x02af
        L_0x0394:
            r27 = r0
            r24 = r3
            r26 = r7
            r28 = r8
            r25 = r11
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r5 == 0) goto L_0x03bb
            java.util.Iterator r2 = r5.iterator()
        L_0x03a9:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03bb
            java.lang.Object r3 = r2.next()
            q.g r3 = (q.g) r3
            r5 = 0
            r6 = 0
            r.i.a(r3, r6, r0, r5)
            goto L_0x03a9
        L_0x03bb:
            r5 = 0
            r6 = 0
            if (r12 == 0) goto L_0x03dc
            java.util.Iterator r2 = r12.iterator()
        L_0x03c3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03dc
            java.lang.Object r3 = r2.next()
            q.i r3 = (q.i) r3
            r.o r7 = r.i.a(r3, r6, r0, r5)
            r3.H(r6, r7, r0)
            r7.a(r0)
            r5 = 0
            r6 = 0
            goto L_0x03c3
        L_0x03dc:
            q.d$b r2 = q.d.b.LEFT
            q.d r2 = r1.g(r2)
            java.util.HashSet<q.d> r2 = r2.f8142a
            if (r2 == 0) goto L_0x03fe
            java.util.Iterator r2 = r2.iterator()
        L_0x03ea:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03fe
            java.lang.Object r3 = r2.next()
            q.d r3 = (q.d) r3
            q.e r3 = r3.d
            r5 = 0
            r6 = 0
            r.i.a(r3, r6, r0, r5)
            goto L_0x03ea
        L_0x03fe:
            q.d$b r2 = q.d.b.RIGHT
            q.d r2 = r1.g(r2)
            java.util.HashSet<q.d> r2 = r2.f8142a
            if (r2 == 0) goto L_0x0420
            java.util.Iterator r2 = r2.iterator()
        L_0x040c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0420
            java.lang.Object r3 = r2.next()
            q.d r3 = (q.d) r3
            q.e r3 = r3.d
            r5 = 0
            r6 = 0
            r.i.a(r3, r6, r0, r5)
            goto L_0x040c
        L_0x0420:
            q.d$b r2 = q.d.b.CENTER
            q.d r2 = r1.g(r2)
            java.util.HashSet<q.d> r2 = r2.f8142a
            if (r2 == 0) goto L_0x0442
            java.util.Iterator r2 = r2.iterator()
        L_0x042e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0442
            java.lang.Object r3 = r2.next()
            q.d r3 = (q.d) r3
            q.e r3 = r3.d
            r5 = 0
            r6 = 0
            r.i.a(r3, r6, r0, r5)
            goto L_0x042e
        L_0x0442:
            r5 = 0
            r6 = 0
            if (r15 == 0) goto L_0x045a
            java.util.Iterator r2 = r15.iterator()
        L_0x044a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x045a
            java.lang.Object r3 = r2.next()
            q.e r3 = (q.e) r3
            r.i.a(r3, r6, r0, r5)
            goto L_0x044a
        L_0x045a:
            if (r13 == 0) goto L_0x0471
            java.util.Iterator r2 = r13.iterator()
        L_0x0460:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0471
            java.lang.Object r3 = r2.next()
            q.g r3 = (q.g) r3
            r6 = 1
            r.i.a(r3, r6, r0, r5)
            goto L_0x0460
        L_0x0471:
            r6 = 1
            if (r14 == 0) goto L_0x0491
            java.util.Iterator r2 = r14.iterator()
        L_0x0478:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0491
            java.lang.Object r3 = r2.next()
            q.i r3 = (q.i) r3
            r.o r7 = r.i.a(r3, r6, r0, r5)
            r3.H(r6, r7, r0)
            r7.a(r0)
            r5 = 0
            r6 = 1
            goto L_0x0478
        L_0x0491:
            q.d$b r2 = q.d.b.TOP
            q.d r2 = r1.g(r2)
            java.util.HashSet<q.d> r2 = r2.f8142a
            if (r2 == 0) goto L_0x04b3
            java.util.Iterator r2 = r2.iterator()
        L_0x049f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04b3
            java.lang.Object r3 = r2.next()
            q.d r3 = (q.d) r3
            q.e r3 = r3.d
            r5 = 0
            r6 = 1
            r.i.a(r3, r6, r0, r5)
            goto L_0x049f
        L_0x04b3:
            q.d$b r2 = q.d.b.BASELINE
            q.d r2 = r1.g(r2)
            java.util.HashSet<q.d> r2 = r2.f8142a
            if (r2 == 0) goto L_0x04d5
            java.util.Iterator r2 = r2.iterator()
        L_0x04c1:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04d5
            java.lang.Object r3 = r2.next()
            q.d r3 = (q.d) r3
            q.e r3 = r3.d
            r5 = 0
            r6 = 1
            r.i.a(r3, r6, r0, r5)
            goto L_0x04c1
        L_0x04d5:
            q.d$b r2 = q.d.b.BOTTOM
            q.d r2 = r1.g(r2)
            java.util.HashSet<q.d> r2 = r2.f8142a
            if (r2 == 0) goto L_0x04f7
            java.util.Iterator r2 = r2.iterator()
        L_0x04e3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04f7
            java.lang.Object r3 = r2.next()
            q.d r3 = (q.d) r3
            q.e r3 = r3.d
            r5 = 0
            r6 = 1
            r.i.a(r3, r6, r0, r5)
            goto L_0x04e3
        L_0x04f7:
            q.d$b r2 = q.d.b.CENTER
            q.d r2 = r1.g(r2)
            java.util.HashSet<q.d> r2 = r2.f8142a
            if (r2 == 0) goto L_0x0519
            java.util.Iterator r2 = r2.iterator()
        L_0x0505:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0519
            java.lang.Object r3 = r2.next()
            q.d r3 = (q.d) r3
            q.e r3 = r3.d
            r5 = 0
            r6 = 1
            r.i.a(r3, r6, r0, r5)
            goto L_0x0505
        L_0x0519:
            r5 = 0
            r6 = 1
            if (r23 == 0) goto L_0x0531
            java.util.Iterator r2 = r23.iterator()
        L_0x0521:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0531
            java.lang.Object r3 = r2.next()
            q.e r3 = (q.e) r3
            r.i.a(r3, r6, r0, r5)
            goto L_0x0521
        L_0x0531:
            r2 = 0
        L_0x0532:
            if (r2 >= r10) goto L_0x058e
            java.lang.Object r3 = r9.get(r2)
            q.e r3 = (q.e) r3
            q.e$b[] r5 = r3.U
            r6 = 0
            r7 = r5[r6]
            q.e$b r6 = q.e.b.MATCH_CONSTRAINT
            if (r7 != r6) goto L_0x054a
            r7 = 1
            r5 = r5[r7]
            if (r5 != r6) goto L_0x054a
            r5 = 1
            goto L_0x054b
        L_0x054a:
            r5 = 0
        L_0x054b:
            if (r5 == 0) goto L_0x058b
            int r5 = r3.f8180p0
            int r6 = r0.size()
            r7 = 0
        L_0x0554:
            if (r7 >= r6) goto L_0x0564
            java.lang.Object r8 = r0.get(r7)
            r.o r8 = (r.o) r8
            int r11 = r8.f8317b
            if (r5 != r11) goto L_0x0561
            goto L_0x0565
        L_0x0561:
            int r7 = r7 + 1
            goto L_0x0554
        L_0x0564:
            r8 = 0
        L_0x0565:
            int r3 = r3.f8182q0
            int r5 = r0.size()
            r6 = 0
        L_0x056c:
            if (r6 >= r5) goto L_0x057c
            java.lang.Object r7 = r0.get(r6)
            r.o r7 = (r.o) r7
            int r11 = r7.f8317b
            if (r3 != r11) goto L_0x0579
            goto L_0x057d
        L_0x0579:
            int r6 = r6 + 1
            goto L_0x056c
        L_0x057c:
            r7 = 0
        L_0x057d:
            if (r8 == 0) goto L_0x058b
            if (r7 == 0) goto L_0x058b
            r3 = 0
            r8.c(r3, r7)
            r3 = 2
            r7.f8318c = r3
            r0.remove(r8)
        L_0x058b:
            int r2 = r2 + 1
            goto L_0x0532
        L_0x058e:
            int r2 = r0.size()
            r3 = 1
            if (r2 > r3) goto L_0x0597
            goto L_0x0606
        L_0x0597:
            r2 = 0
            r3 = r22[r2]
            q.e$b r2 = q.e.b.WRAP_CONTENT
            if (r3 != r2) goto L_0x05cc
            java.util.Iterator r2 = r0.iterator()
            r3 = 0
            r5 = 0
        L_0x05a4:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x05c0
            java.lang.Object r6 = r2.next()
            r.o r6 = (r.o) r6
            int r7 = r6.f8318c
            r8 = 1
            if (r7 != r8) goto L_0x05b6
            goto L_0x05a4
        L_0x05b6:
            r7 = 0
            int r8 = r6.b(r4, r7)
            if (r8 <= r3) goto L_0x05a4
            r5 = r6
            r3 = r8
            goto L_0x05a4
        L_0x05c0:
            if (r5 == 0) goto L_0x05cc
            q.e$b r2 = q.e.b.FIXED
            r1.C(r2)
            r1.E(r3)
            r2 = 1
            goto L_0x05ce
        L_0x05cc:
            r2 = 1
            r5 = 0
        L_0x05ce:
            r3 = r22[r2]
            q.e$b r2 = q.e.b.WRAP_CONTENT
            if (r3 != r2) goto L_0x0600
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = 0
        L_0x05da:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x05f5
            java.lang.Object r6 = r0.next()
            r.o r6 = (r.o) r6
            int r7 = r6.f8318c
            if (r7 != 0) goto L_0x05eb
            goto L_0x05da
        L_0x05eb:
            r7 = 1
            int r8 = r6.b(r4, r7)
            if (r8 <= r2) goto L_0x05da
            r3 = r6
            r2 = r8
            goto L_0x05da
        L_0x05f5:
            if (r3 == 0) goto L_0x0600
            q.e$b r0 = q.e.b.FIXED
            r1.D(r0)
            r1.B(r2)
            goto L_0x0601
        L_0x0600:
            r3 = 0
        L_0x0601:
            if (r5 != 0) goto L_0x0608
            if (r3 == 0) goto L_0x0606
            goto L_0x0608
        L_0x0606:
            r0 = 0
            goto L_0x0609
        L_0x0608:
            r0 = 1
        L_0x0609:
            if (r0 == 0) goto L_0x064a
            q.e$b r0 = q.e.b.WRAP_CONTENT
            r2 = r28
            if (r2 != r0) goto L_0x0627
            int r3 = r29.k()
            r5 = r27
            if (r5 >= r3) goto L_0x0622
            if (r5 <= 0) goto L_0x0622
            r1.E(r5)
            r3 = 1
            r1.F0 = r3
            goto L_0x0629
        L_0x0622:
            int r3 = r29.k()
            goto L_0x062a
        L_0x0627:
            r5 = r27
        L_0x0629:
            r3 = r5
        L_0x062a:
            r6 = r26
            if (r6 != r0) goto L_0x0644
            int r0 = r29.i()
            r7 = r20
            if (r7 >= r0) goto L_0x063f
            if (r7 <= 0) goto L_0x063f
            r1.B(r7)
            r5 = 1
            r1.G0 = r5
            goto L_0x0646
        L_0x063f:
            int r0 = r29.i()
            goto L_0x0647
        L_0x0644:
            r7 = r20
        L_0x0646:
            r0 = r7
        L_0x0647:
            r7 = r0
            r0 = 1
            goto L_0x065e
        L_0x064a:
            r7 = r20
            r6 = r26
            r5 = r27
            r2 = r28
            goto L_0x065c
        L_0x0653:
            r5 = r0
            r24 = r3
            r6 = r7
            r2 = r8
            r25 = r11
            r7 = r20
        L_0x065c:
            r3 = r5
            r0 = 0
        L_0x065e:
            r5 = 64
            boolean r8 = r1.M(r5)
            if (r8 != 0) goto L_0x0671
            r8 = 128(0x80, float:1.794E-43)
            boolean r8 = r1.M(r8)
            if (r8 == 0) goto L_0x066f
            goto L_0x0671
        L_0x066f:
            r8 = 0
            goto L_0x0672
        L_0x0671:
            r8 = 1
        L_0x0672:
            r4.getClass()
            r9 = 0
            r4.f7545g = r9
            int r10 = r1.E0
            if (r10 == 0) goto L_0x0682
            if (r8 == 0) goto L_0x0682
            r8 = 1
            r4.f7545g = r8
            goto L_0x0683
        L_0x0682:
            r8 = 1
        L_0x0683:
            java.util.ArrayList<q.e> r10 = r1.f8205r0
            r11 = r22[r9]
            q.e$b r12 = q.e.b.WRAP_CONTENT
            if (r11 == r12) goto L_0x0692
            r11 = r22[r8]
            if (r11 != r12) goto L_0x0690
            goto L_0x0692
        L_0x0690:
            r13 = r9
            goto L_0x0693
        L_0x0692:
            r13 = 1
        L_0x0693:
            r1.A0 = r9
            r1.B0 = r9
            r9 = r24
            r8 = 0
        L_0x069a:
            if (r8 >= r9) goto L_0x06b0
            java.util.ArrayList<q.e> r11 = r1.f8205r0
            java.lang.Object r11 = r11.get(r8)
            q.e r11 = (q.e) r11
            boolean r12 = r11 instanceof q.l
            if (r12 == 0) goto L_0x06ad
            q.l r11 = (q.l) r11
            r11.H()
        L_0x06ad:
            int r8 = r8 + 1
            goto L_0x069a
        L_0x06b0:
            boolean r8 = r1.M(r5)
            r11 = r0
            r0 = 0
            r12 = 1
        L_0x06b7:
            if (r12 == 0) goto L_0x08ec
            r14 = 1
            int r15 = r0 + 1
            r4.u()     // Catch:{ Exception -> 0x0784 }
            r14 = 0
            r1.A0 = r14     // Catch:{ Exception -> 0x0784 }
            r1.B0 = r14     // Catch:{ Exception -> 0x0784 }
            r1.e(r4)     // Catch:{ Exception -> 0x0784 }
            r0 = 0
        L_0x06c8:
            if (r0 >= r9) goto L_0x06d8
            java.util.ArrayList<q.e> r14 = r1.f8205r0     // Catch:{ Exception -> 0x0784 }
            java.lang.Object r14 = r14.get(r0)     // Catch:{ Exception -> 0x0784 }
            q.e r14 = (q.e) r14     // Catch:{ Exception -> 0x0784 }
            r14.e(r4)     // Catch:{ Exception -> 0x0784 }
            int r0 = r0 + 1
            goto L_0x06c8
        L_0x06d8:
            r1.J(r4)     // Catch:{ Exception -> 0x0784 }
            java.lang.ref.WeakReference<q.d> r0 = r1.H0     // Catch:{ Exception -> 0x0778 }
            r12 = 5
            if (r0 == 0) goto L_0x0706
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0778 }
            if (r0 == 0) goto L_0x0706
            java.lang.ref.WeakReference<q.d> r0 = r1.H0     // Catch:{ Exception -> 0x0778 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0778 }
            q.d r0 = (q.d) r0     // Catch:{ Exception -> 0x0778 }
            r14 = r25
            o.g r5 = r4.l(r14)     // Catch:{ Exception -> 0x0702 }
            o.g r0 = r4.l(r0)     // Catch:{ Exception -> 0x0702 }
            r25 = r14
            r14 = 0
            r4.f(r0, r5, r14, r12)     // Catch:{ Exception -> 0x0778 }
            r5 = 0
            r1.H0 = r5     // Catch:{ Exception -> 0x0778 }
            goto L_0x0706
        L_0x0702:
            r0 = move-exception
            r25 = r14
            goto L_0x0752
        L_0x0706:
            java.lang.ref.WeakReference<q.d> r0 = r1.J0     // Catch:{ Exception -> 0x0778 }
            if (r0 == 0) goto L_0x0729
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0778 }
            if (r0 == 0) goto L_0x0729
            java.lang.ref.WeakReference<q.d> r0 = r1.J0     // Catch:{ Exception -> 0x0778 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0778 }
            q.d r0 = (q.d) r0     // Catch:{ Exception -> 0x0778 }
            q.d r5 = r1.M     // Catch:{ Exception -> 0x0778 }
            o.g r5 = r4.l(r5)     // Catch:{ Exception -> 0x0778 }
            o.g r0 = r4.l(r0)     // Catch:{ Exception -> 0x0778 }
            r14 = 0
            r4.f(r5, r0, r14, r12)     // Catch:{ Exception -> 0x0778 }
            r5 = 0
            r1.J0 = r5     // Catch:{ Exception -> 0x0778 }
        L_0x0729:
            java.lang.ref.WeakReference<q.d> r0 = r1.I0     // Catch:{ Exception -> 0x0778 }
            if (r0 == 0) goto L_0x0754
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0778 }
            if (r0 == 0) goto L_0x0754
            java.lang.ref.WeakReference<q.d> r0 = r1.I0     // Catch:{ Exception -> 0x0778 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0778 }
            q.d r0 = (q.d) r0     // Catch:{ Exception -> 0x0778 }
            r5 = r21
            o.g r14 = r4.l(r5)     // Catch:{ Exception -> 0x074f }
            o.g r0 = r4.l(r0)     // Catch:{ Exception -> 0x074f }
            r21 = r5
            r5 = 0
            r4.f(r0, r14, r5, r12)     // Catch:{ Exception -> 0x0778 }
            r5 = 0
            r1.I0 = r5     // Catch:{ Exception -> 0x0781 }
            goto L_0x0754
        L_0x074f:
            r0 = move-exception
            r21 = r5
        L_0x0752:
            r5 = 0
            goto L_0x0782
        L_0x0754:
            java.lang.ref.WeakReference<q.d> r0 = r1.K0     // Catch:{ Exception -> 0x0778 }
            if (r0 == 0) goto L_0x077a
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0778 }
            if (r0 == 0) goto L_0x077a
            java.lang.ref.WeakReference<q.d> r0 = r1.K0     // Catch:{ Exception -> 0x0778 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0778 }
            q.d r0 = (q.d) r0     // Catch:{ Exception -> 0x0778 }
            q.d r5 = r1.L     // Catch:{ Exception -> 0x0778 }
            o.g r5 = r4.l(r5)     // Catch:{ Exception -> 0x0778 }
            o.g r0 = r4.l(r0)     // Catch:{ Exception -> 0x0778 }
            r14 = 0
            r4.f(r5, r0, r14, r12)     // Catch:{ Exception -> 0x0778 }
            r5 = 0
            r1.K0 = r5     // Catch:{ Exception -> 0x0781 }
            goto L_0x077b
        L_0x0778:
            r0 = move-exception
            goto L_0x0752
        L_0x077a:
            r5 = 0
        L_0x077b:
            r4.q()     // Catch:{ Exception -> 0x0781 }
            r23 = 1
            goto L_0x079e
        L_0x0781:
            r0 = move-exception
        L_0x0782:
            r12 = 1
            goto L_0x0786
        L_0x0784:
            r0 = move-exception
            r5 = 0
        L_0x0786:
            r0.printStackTrace()
            java.io.PrintStream r14 = java.lang.System.out
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r23 = r12
            java.lang.String r12 = "EXCEPTION : "
            r5.<init>(r12)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r14.println(r0)
        L_0x079e:
            boolean[] r0 = q.j.f8204a
            if (r23 == 0) goto L_0x07e9
            r5 = 2
            r12 = 0
            r0[r5] = r12
            r5 = 64
            boolean r12 = r1.M(r5)
            r1.G(r4, r12)
            java.util.ArrayList<q.e> r14 = r1.f8205r0
            int r14 = r14.size()
            r5 = 0
            r20 = 0
        L_0x07b8:
            if (r5 >= r14) goto L_0x07e5
            r24 = r14
            java.util.ArrayList<q.e> r14 = r1.f8205r0
            java.lang.Object r14 = r14.get(r5)
            q.e r14 = (q.e) r14
            r14.G(r4, r12)
            r26 = r12
            int r12 = r14.f8166i
            r27 = r11
            r11 = -1
            if (r12 != r11) goto L_0x07d7
            int r12 = r14.f8168j
            if (r12 == r11) goto L_0x07d5
            goto L_0x07d7
        L_0x07d5:
            r12 = 0
            goto L_0x07d8
        L_0x07d7:
            r12 = 1
        L_0x07d8:
            if (r12 == 0) goto L_0x07dc
            r20 = 1
        L_0x07dc:
            int r5 = r5 + 1
            r14 = r24
            r12 = r26
            r11 = r27
            goto L_0x07b8
        L_0x07e5:
            r27 = r11
            r11 = -1
            goto L_0x0802
        L_0x07e9:
            r27 = r11
            r11 = -1
            r1.G(r4, r8)
            r5 = 0
        L_0x07f0:
            if (r5 >= r9) goto L_0x0800
            java.util.ArrayList<q.e> r12 = r1.f8205r0
            java.lang.Object r12 = r12.get(r5)
            q.e r12 = (q.e) r12
            r12.G(r4, r8)
            int r5 = r5 + 1
            goto L_0x07f0
        L_0x0800:
            r20 = 0
        L_0x0802:
            r5 = 8
            if (r13 == 0) goto L_0x0869
            if (r15 >= r5) goto L_0x0869
            r12 = 2
            boolean r0 = r0[r12]
            if (r0 == 0) goto L_0x0869
            r0 = 0
            r11 = 0
            r14 = 0
        L_0x0810:
            if (r0 >= r9) goto L_0x0837
            java.util.ArrayList<q.e> r12 = r1.f8205r0
            java.lang.Object r12 = r12.get(r0)
            q.e r12 = (q.e) r12
            int r5 = r12.f8152a0
            int r26 = r12.k()
            int r5 = r26 + r5
            int r14 = java.lang.Math.max(r14, r5)
            int r5 = r12.f8154b0
            int r12 = r12.i()
            int r12 = r12 + r5
            int r11 = java.lang.Math.max(r11, r12)
            int r0 = r0 + 1
            r5 = 8
            r12 = 2
            goto L_0x0810
        L_0x0837:
            int r0 = r1.f8157d0
            int r0 = java.lang.Math.max(r0, r14)
            int r5 = r1.f8159e0
            int r5 = java.lang.Math.max(r5, r11)
            q.e$b r11 = q.e.b.WRAP_CONTENT
            if (r2 != r11) goto L_0x0857
            int r12 = r29.k()
            if (r12 >= r0) goto L_0x0857
            r1.E(r0)
            r12 = 0
            r22[r12] = r11
            r20 = 1
            r27 = 1
        L_0x0857:
            if (r6 != r11) goto L_0x0869
            int r0 = r29.i()
            if (r0 >= r5) goto L_0x0869
            r1.B(r5)
            r5 = 1
            r22[r5] = r11
            r20 = 1
            r27 = 1
        L_0x0869:
            int r0 = r1.f8157d0
            int r5 = r29.k()
            int r0 = java.lang.Math.max(r0, r5)
            int r5 = r29.k()
            if (r0 <= r5) goto L_0x0885
            r1.E(r0)
            q.e$b r0 = q.e.b.FIXED
            r5 = 0
            r22[r5] = r0
            r20 = 1
            r27 = 1
        L_0x0885:
            int r0 = r1.f8159e0
            int r5 = r29.i()
            int r0 = java.lang.Math.max(r0, r5)
            int r5 = r29.i()
            if (r0 <= r5) goto L_0x08a2
            r1.B(r0)
            q.e$b r0 = q.e.b.FIXED
            r5 = 1
            r22[r5] = r0
            r20 = r5
            r27 = r20
            goto L_0x08a3
        L_0x08a2:
            r5 = 1
        L_0x08a3:
            if (r27 != 0) goto L_0x08dc
            r11 = 0
            r0 = r22[r11]
            q.e$b r12 = q.e.b.WRAP_CONTENT
            if (r0 != r12) goto L_0x08c1
            if (r3 <= 0) goto L_0x08c1
            int r0 = r29.k()
            if (r0 <= r3) goto L_0x08c1
            r1.F0 = r5
            q.e$b r0 = q.e.b.FIXED
            r22[r11] = r0
            r1.E(r3)
            r20 = r5
            r27 = r20
        L_0x08c1:
            r0 = r22[r5]
            if (r0 != r12) goto L_0x08dc
            if (r7 <= 0) goto L_0x08dc
            int r0 = r29.i()
            if (r0 <= r7) goto L_0x08dc
            r1.G0 = r5
            q.e$b r0 = q.e.b.FIXED
            r22[r5] = r0
            r1.B(r7)
            r0 = 8
            r11 = 1
            r20 = 1
            goto L_0x08e1
        L_0x08dc:
            r5 = r27
            r11 = r5
            r0 = 8
        L_0x08e1:
            if (r15 <= r0) goto L_0x08e5
            r12 = 0
            goto L_0x08e7
        L_0x08e5:
            r12 = r20
        L_0x08e7:
            r0 = r15
            r5 = 64
            goto L_0x06b7
        L_0x08ec:
            r27 = r11
            r1.f8205r0 = r10
            if (r27 == 0) goto L_0x08f8
            r3 = 0
            r22[r3] = r2
            r2 = 1
            r22[r2] = r6
        L_0x08f8:
            o.c r0 = r4.l
            r1.y(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.f.H():void");
    }

    public final void I(int i10, e eVar) {
        if (i10 == 0) {
            int i11 = this.A0 + 1;
            c[] cVarArr = this.D0;
            if (i11 >= cVarArr.length) {
                this.D0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
            }
            c[] cVarArr2 = this.D0;
            int i12 = this.A0;
            cVarArr2[i12] = new c(eVar, 0, this.f8194w0);
            this.A0 = i12 + 1;
        } else if (i10 == 1) {
            int i13 = this.B0 + 1;
            c[] cVarArr3 = this.C0;
            if (i13 >= cVarArr3.length) {
                this.C0 = (c[]) Arrays.copyOf(cVarArr3, cVarArr3.length * 2);
            }
            c[] cVarArr4 = this.C0;
            int i14 = this.B0;
            cVarArr4[i14] = new c(eVar, 1, this.f8194w0);
            this.B0 = i14 + 1;
        }
    }

    public final void J(d dVar) {
        boolean z;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean M = M(64);
        b(dVar, M);
        int size = this.f8205r0.size();
        boolean z13 = false;
        for (int i11 = 0; i11 < size; i11++) {
            e eVar = this.f8205r0.get(i11);
            boolean[] zArr = eVar.T;
            zArr[0] = false;
            zArr[1] = false;
            if (eVar instanceof a) {
                z13 = true;
            }
        }
        if (z13) {
            for (int i12 = 0; i12 < size; i12++) {
                e eVar2 = this.f8205r0.get(i12);
                if (eVar2 instanceof a) {
                    a aVar = (a) eVar2;
                    for (int i13 = 0; i13 < aVar.f8203s0; i13++) {
                        e eVar3 = aVar.f8202r0[i13];
                        if (aVar.f8124u0 || eVar3.c()) {
                            int i14 = aVar.t0;
                            if (i14 == 0 || i14 == 1) {
                                eVar3.T[0] = true;
                            } else if (i14 == 2 || i14 == 3) {
                                eVar3.T[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet<e> hashSet = this.L0;
        hashSet.clear();
        for (int i15 = 0; i15 < size; i15++) {
            e eVar4 = this.f8205r0.get(i15);
            eVar4.getClass();
            if ((eVar4 instanceof k) || (eVar4 instanceof g)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                if (eVar4 instanceof k) {
                    hashSet.add(eVar4);
                } else {
                    eVar4.b(dVar, M);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator<e> it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                k kVar = (k) it.next();
                int i16 = 0;
                while (true) {
                    if (i16 >= kVar.f8203s0) {
                        z11 = false;
                        continue;
                        break;
                    } else if (hashSet.contains(kVar.f8202r0[i16])) {
                        z11 = true;
                        continue;
                        break;
                    } else {
                        i16++;
                    }
                }
                if (z11) {
                    kVar.b(dVar, M);
                    hashSet.remove(kVar);
                    break;
                }
            }
            if (size2 == hashSet.size()) {
                Iterator<e> it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    it2.next().b(dVar, M);
                }
                hashSet.clear();
            }
        }
        if (d.f7538p) {
            HashSet hashSet2 = new HashSet();
            for (int i17 = 0; i17 < size; i17++) {
                e eVar5 = this.f8205r0.get(i17);
                eVar5.getClass();
                if ((eVar5 instanceof k) || (eVar5 instanceof g)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    hashSet2.add(eVar5);
                }
            }
            if (this.U[0] == e.b.WRAP_CONTENT) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            a(this, dVar, hashSet2, i10, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                e eVar6 = (e) it3.next();
                j.a(this, dVar, eVar6);
                eVar6.b(dVar, M);
            }
        } else {
            for (int i18 = 0; i18 < size; i18++) {
                e eVar7 = this.f8205r0.get(i18);
                if (eVar7 instanceof f) {
                    e.b[] bVarArr = eVar7.U;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar7.C(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar7.D(e.b.FIXED);
                    }
                    eVar7.b(dVar, M);
                    if (bVar == bVar3) {
                        eVar7.C(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar7.D(bVar2);
                    }
                } else {
                    j.a(this, dVar, eVar7);
                    if ((eVar7 instanceof k) || (eVar7 instanceof g)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        eVar7.b(dVar, M);
                    }
                }
            }
        }
        if (this.A0 > 0) {
            b.a(this, dVar, (ArrayList<e>) null, 0);
        }
        if (this.B0 > 0) {
            b.a(this, dVar, (ArrayList<e>) null, 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0115 A[EDGE_INSN: B:79:0x0115->B:64:0x0115 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean K(int r13, boolean r14) {
        /*
            r12 = this;
            r0 = 1
            r14 = r14 & r0
            r.e r1 = r12.t0
            q.f r2 = r1.f8290a
            r3 = 0
            q.e$b r4 = r2.h(r3)
            q.e$b r5 = r2.h(r0)
            int r6 = r2.l()
            int r7 = r2.m()
            java.util.ArrayList<r.p> r8 = r1.f8293e
            if (r14 == 0) goto L_0x0076
            q.e$b r9 = q.e.b.WRAP_CONTENT
            if (r4 == r9) goto L_0x0021
            if (r5 != r9) goto L_0x0076
        L_0x0021:
            java.util.Iterator r9 = r8.iterator()
        L_0x0025:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x003c
            java.lang.Object r10 = r9.next()
            r.p r10 = (r.p) r10
            int r11 = r10.f8324f
            if (r11 != r13) goto L_0x0025
            boolean r10 = r10.k()
            if (r10 != 0) goto L_0x0025
            r14 = r3
        L_0x003c:
            if (r13 != 0) goto L_0x0059
            if (r14 == 0) goto L_0x0076
            q.e$b r14 = q.e.b.WRAP_CONTENT
            if (r4 != r14) goto L_0x0076
            q.e$b r14 = q.e.b.FIXED
            r2.C(r14)
            int r14 = r1.d(r2, r3)
            r2.E(r14)
            r.l r14 = r2.d
            r.g r14 = r14.f8323e
            int r9 = r2.k()
            goto L_0x0073
        L_0x0059:
            if (r14 == 0) goto L_0x0076
            q.e$b r14 = q.e.b.WRAP_CONTENT
            if (r5 != r14) goto L_0x0076
            q.e$b r14 = q.e.b.FIXED
            r2.D(r14)
            int r14 = r1.d(r2, r0)
            r2.B(r14)
            r.n r14 = r2.f8158e
            r.g r14 = r14.f8323e
            int r9 = r2.i()
        L_0x0073:
            r14.d(r9)
        L_0x0076:
            q.e$b[] r14 = r2.U
            if (r13 != 0) goto L_0x0099
            r14 = r14[r3]
            q.e$b r7 = q.e.b.FIXED
            if (r14 == r7) goto L_0x0084
            q.e$b r7 = q.e.b.MATCH_PARENT
            if (r14 != r7) goto L_0x00a4
        L_0x0084:
            int r14 = r2.k()
            int r14 = r14 + r6
            r.l r7 = r2.d
            r.f r7 = r7.f8327i
            r7.d(r14)
            r.l r7 = r2.d
            r.g r7 = r7.f8323e
            int r14 = r14 - r6
            r7.d(r14)
            goto L_0x00ba
        L_0x0099:
            r14 = r14[r0]
            q.e$b r6 = q.e.b.FIXED
            if (r14 == r6) goto L_0x00a6
            q.e$b r6 = q.e.b.MATCH_PARENT
            if (r14 != r6) goto L_0x00a4
            goto L_0x00a6
        L_0x00a4:
            r14 = r3
            goto L_0x00bb
        L_0x00a6:
            int r14 = r2.i()
            int r14 = r14 + r7
            r.n r6 = r2.f8158e
            r.f r6 = r6.f8327i
            r6.d(r14)
            r.n r6 = r2.f8158e
            r.g r6 = r6.f8323e
            int r14 = r14 - r7
            r6.d(r14)
        L_0x00ba:
            r14 = r0
        L_0x00bb:
            r1.g()
            java.util.Iterator r1 = r8.iterator()
        L_0x00c2:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x00e0
            java.lang.Object r6 = r1.next()
            r.p r6 = (r.p) r6
            int r7 = r6.f8324f
            if (r7 == r13) goto L_0x00d3
            goto L_0x00c2
        L_0x00d3:
            q.e r7 = r6.f8321b
            if (r7 != r2) goto L_0x00dc
            boolean r7 = r6.f8325g
            if (r7 != 0) goto L_0x00dc
            goto L_0x00c2
        L_0x00dc:
            r6.e()
            goto L_0x00c2
        L_0x00e0:
            java.util.Iterator r1 = r8.iterator()
        L_0x00e4:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0115
            java.lang.Object r6 = r1.next()
            r.p r6 = (r.p) r6
            int r7 = r6.f8324f
            if (r7 == r13) goto L_0x00f5
            goto L_0x00e4
        L_0x00f5:
            if (r14 != 0) goto L_0x00fc
            q.e r7 = r6.f8321b
            if (r7 != r2) goto L_0x00fc
            goto L_0x00e4
        L_0x00fc:
            r.f r7 = r6.f8326h
            boolean r7 = r7.f8305j
            if (r7 != 0) goto L_0x0103
            goto L_0x0114
        L_0x0103:
            r.f r7 = r6.f8327i
            boolean r7 = r7.f8305j
            if (r7 != 0) goto L_0x010a
            goto L_0x0114
        L_0x010a:
            boolean r7 = r6 instanceof r.c
            if (r7 != 0) goto L_0x00e4
            r.g r6 = r6.f8323e
            boolean r6 = r6.f8305j
            if (r6 != 0) goto L_0x00e4
        L_0x0114:
            r0 = r3
        L_0x0115:
            r2.C(r4)
            r2.D(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q.f.K(int, boolean):boolean");
    }

    public final boolean M(int i10) {
        return (this.E0 & i10) == i10;
    }

    public final void w() {
        this.x0.u();
        this.y0 = 0;
        this.f8195z0 = 0;
        super.w();
    }
}

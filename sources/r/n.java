package r;

import java.util.ArrayList;
import q.e;
import r.f;

public final class n extends p {

    /* renamed from: k  reason: collision with root package name */
    public final f f8313k;
    public a l = null;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8314a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                r.p$b[] r0 = r.p.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8314a = r0
                r.p$b r1 = r.p.b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8314a     // Catch:{ NoSuchFieldError -> 0x001d }
                r.p$b r1 = r.p.b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8314a     // Catch:{ NoSuchFieldError -> 0x0028 }
                r.p$b r1 = r.p.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r.n.a.<clinit>():void");
        }
    }

    public n(e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f8313k = fVar;
        this.f8326h.f8300e = f.a.TOP;
        this.f8327i.f8300e = f.a.BOTTOM;
        fVar.f8300e = f.a.BASELINE;
        this.f8324f = 1;
    }

    public final void a(d dVar) {
        int i10;
        float f10;
        if (a.f8314a[this.f8328j.ordinal()] != 3) {
            g gVar = this.f8323e;
            if (gVar.f8299c && !gVar.f8305j && this.d == e.b.MATCH_CONSTRAINT) {
                e eVar = this.f8321b;
                int i11 = eVar.f8184s;
                if (i11 == 2) {
                    e eVar2 = eVar.V;
                    if (eVar2 != null) {
                        g gVar2 = eVar2.f8158e.f8323e;
                        if (gVar2.f8305j) {
                            f10 = ((float) gVar2.f8302g) * eVar.z;
                        }
                    }
                } else if (i11 == 3) {
                    g gVar3 = eVar.d.f8323e;
                    if (gVar3.f8305j) {
                        int i12 = eVar.Z;
                        if (i12 != -1) {
                            if (i12 == 0) {
                                f10 = ((float) gVar3.f8302g) * eVar.Y;
                            } else if (i12 != 1) {
                                i10 = 0;
                                gVar.d(i10);
                            }
                        }
                        f10 = ((float) gVar3.f8302g) / eVar.Y;
                    }
                }
                i10 = (int) (f10 + 0.5f);
                gVar.d(i10);
            }
            f fVar = this.f8326h;
            if (fVar.f8299c) {
                f fVar2 = this.f8327i;
                if (fVar2.f8299c) {
                    if (!fVar.f8305j || !fVar2.f8305j || !gVar.f8305j) {
                        boolean z = gVar.f8305j;
                        ArrayList arrayList = fVar.l;
                        ArrayList arrayList2 = fVar2.l;
                        if (!z && this.d == e.b.MATCH_CONSTRAINT) {
                            e eVar3 = this.f8321b;
                            if (eVar3.f8183r == 0 && !eVar3.s()) {
                                int i13 = ((f) arrayList.get(0)).f8302g + fVar.f8301f;
                                int i14 = ((f) arrayList2.get(0)).f8302g + fVar2.f8301f;
                                fVar.d(i13);
                                fVar2.d(i14);
                                gVar.d(i14 - i13);
                                return;
                            }
                        }
                        if (!gVar.f8305j && this.d == e.b.MATCH_CONSTRAINT && this.f8320a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                            int i15 = (((f) arrayList2.get(0)).f8302g + fVar2.f8301f) - (((f) arrayList.get(0)).f8302g + fVar.f8301f);
                            int i16 = gVar.f8307m;
                            if (i15 < i16) {
                                gVar.d(i15);
                            } else {
                                gVar.d(i16);
                            }
                        }
                        if (gVar.f8305j && arrayList.size() > 0 && arrayList2.size() > 0) {
                            f fVar3 = (f) arrayList.get(0);
                            f fVar4 = (f) arrayList2.get(0);
                            int i17 = fVar3.f8302g;
                            int i18 = fVar.f8301f + i17;
                            int i19 = fVar4.f8302g;
                            int i20 = fVar2.f8301f + i19;
                            float f11 = this.f8321b.f8163g0;
                            if (fVar3 == fVar4) {
                                f11 = 0.5f;
                            } else {
                                i17 = i18;
                                i19 = i20;
                            }
                            fVar.d((int) ((((float) ((i19 - i17) - gVar.f8302g)) * f11) + ((float) i17) + 0.5f));
                            fVar2.d(fVar.f8302g + gVar.f8302g);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        e eVar4 = this.f8321b;
        l(eVar4.K, eVar4.M, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x026b, code lost:
        if (r15.f8321b.E != false) goto L_0x02cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02a4, code lost:
        if (r0.d == r1) goto L_0x031f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02ca, code lost:
        if (r15.f8321b.E != false) goto L_0x02cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x031d, code lost:
        if (r0.d == r1) goto L_0x031f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0090, code lost:
        r0 = r15.f8321b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0337  */
    /* JADX WARNING: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r15 = this;
            q.e r0 = r15.f8321b
            boolean r1 = r0.f8151a
            r.g r2 = r15.f8323e
            if (r1 == 0) goto L_0x000f
            int r0 = r0.i()
            r2.d(r0)
        L_0x000f:
            boolean r0 = r2.f8305j
            r.f r1 = r15.f8327i
            r.f r3 = r15.f8326h
            r4 = 1
            if (r0 != 0) goto L_0x008a
            q.e r0 = r15.f8321b
            q.e$b[] r5 = r0.U
            r5 = r5[r4]
            r15.d = r5
            boolean r0 = r0.E
            if (r0 == 0) goto L_0x002b
            r.a r0 = new r.a
            r0.<init>(r15)
            r15.l = r0
        L_0x002b:
            q.e$b r0 = r15.d
            q.e$b r5 = q.e.b.MATCH_CONSTRAINT
            if (r0 == r5) goto L_0x00bc
            q.e$b r5 = q.e.b.MATCH_PARENT
            if (r0 != r5) goto L_0x007c
            q.e r5 = r15.f8321b
            q.e r5 = r5.V
            if (r5 == 0) goto L_0x007c
            q.e$b[] r6 = r5.U
            r6 = r6[r4]
            q.e$b r7 = q.e.b.FIXED
            if (r6 != r7) goto L_0x007c
            int r0 = r5.i()
            q.e r4 = r15.f8321b
            q.d r4 = r4.K
            int r4 = r4.d()
            int r0 = r0 - r4
            q.e r4 = r15.f8321b
            q.d r4 = r4.M
            int r4 = r4.d()
            int r0 = r0 - r4
            r.n r4 = r5.f8158e
            r.f r4 = r4.f8326h
            q.e r6 = r15.f8321b
            q.d r6 = r6.K
            int r6 = r6.d()
            r.p.b(r3, r4, r6)
            r.n r3 = r5.f8158e
            r.f r3 = r3.f8327i
            q.e r4 = r15.f8321b
            q.d r4 = r4.M
            int r4 = r4.d()
            int r4 = -r4
            r.p.b(r1, r3, r4)
            r2.d(r0)
            return
        L_0x007c:
            q.e$b r5 = q.e.b.FIXED
            if (r0 != r5) goto L_0x00bc
            q.e r0 = r15.f8321b
            int r0 = r0.i()
            r2.d(r0)
            goto L_0x00bc
        L_0x008a:
            q.e$b r0 = r15.d
            q.e$b r5 = q.e.b.MATCH_PARENT
            if (r0 != r5) goto L_0x00bc
            q.e r0 = r15.f8321b
            q.e r5 = r0.V
            if (r5 == 0) goto L_0x00bc
            q.e$b[] r6 = r5.U
            r6 = r6[r4]
            q.e$b r7 = q.e.b.FIXED
            if (r6 != r7) goto L_0x00bc
            r.n r2 = r5.f8158e
            r.f r2 = r2.f8326h
            q.d r0 = r0.K
            int r0 = r0.d()
            r.p.b(r3, r2, r0)
            r.n r0 = r5.f8158e
            r.f r0 = r0.f8327i
            q.e r2 = r15.f8321b
            q.d r2 = r2.M
            int r2 = r2.d()
            int r2 = -r2
            r.p.b(r1, r0, r2)
            return
        L_0x00bc:
            boolean r0 = r2.f8305j
            r.f r5 = r15.f8313k
            r6 = 0
            r7 = 4
            r8 = 2
            r9 = 3
            if (r0 == 0) goto L_0x01d3
            q.e r10 = r15.f8321b
            boolean r11 = r10.f8151a
            if (r11 == 0) goto L_0x01d3
            q.d[] r0 = r10.R
            r11 = r0[r8]
            q.d r12 = r11.f8146f
            if (r12 == 0) goto L_0x0139
            r13 = r0[r9]
            q.d r13 = r13.f8146f
            if (r13 == 0) goto L_0x0139
            boolean r0 = r10.s()
            if (r0 == 0) goto L_0x00fa
            q.e r0 = r15.f8321b
            q.d[] r0 = r0.R
            r0 = r0[r8]
            int r0 = r0.d()
            r3.f8301f = r0
            q.e r0 = r15.f8321b
            q.d[] r0 = r0.R
            r0 = r0[r9]
            int r0 = r0.d()
            int r0 = -r0
            r1.f8301f = r0
            goto L_0x0131
        L_0x00fa:
            q.e r0 = r15.f8321b
            q.d[] r0 = r0.R
            r0 = r0[r8]
            r.f r0 = r.p.h(r0)
            if (r0 == 0) goto L_0x0113
            q.e r2 = r15.f8321b
            q.d[] r2 = r2.R
            r2 = r2[r8]
            int r2 = r2.d()
            r.p.b(r3, r0, r2)
        L_0x0113:
            q.e r0 = r15.f8321b
            q.d[] r0 = r0.R
            r0 = r0[r9]
            r.f r0 = r.p.h(r0)
            if (r0 == 0) goto L_0x012d
            q.e r2 = r15.f8321b
            q.d[] r2 = r2.R
            r2 = r2[r9]
            int r2 = r2.d()
            int r2 = -r2
            r.p.b(r1, r0, r2)
        L_0x012d:
            r3.f8298b = r4
            r1.f8298b = r4
        L_0x0131:
            q.e r0 = r15.f8321b
            boolean r1 = r0.E
            if (r1 == 0) goto L_0x0339
            goto L_0x01cc
        L_0x0139:
            if (r12 == 0) goto L_0x015b
            r.f r0 = r.p.h(r11)
            if (r0 == 0) goto L_0x0339
            q.e r4 = r15.f8321b
            q.d[] r4 = r4.R
            r4 = r4[r8]
            int r4 = r4.d()
            r.p.b(r3, r0, r4)
            int r0 = r2.f8302g
            r.p.b(r1, r3, r0)
            q.e r0 = r15.f8321b
            boolean r1 = r0.E
            if (r1 == 0) goto L_0x0339
            goto L_0x01cc
        L_0x015b:
            r4 = r0[r9]
            q.d r8 = r4.f8146f
            if (r8 == 0) goto L_0x0182
            r.f r0 = r.p.h(r4)
            if (r0 == 0) goto L_0x017b
            q.e r4 = r15.f8321b
            q.d[] r4 = r4.R
            r4 = r4[r9]
            int r4 = r4.d()
            int r4 = -r4
            r.p.b(r1, r0, r4)
            int r0 = r2.f8302g
            int r0 = -r0
            r.p.b(r3, r1, r0)
        L_0x017b:
            q.e r0 = r15.f8321b
            boolean r1 = r0.E
            if (r1 == 0) goto L_0x0339
            goto L_0x01cc
        L_0x0182:
            r0 = r0[r7]
            q.d r4 = r0.f8146f
            if (r4 == 0) goto L_0x01a0
            r.f r0 = r.p.h(r0)
            if (r0 == 0) goto L_0x0339
            r.p.b(r5, r0, r6)
            q.e r0 = r15.f8321b
            int r0 = r0.f8156c0
            int r0 = -r0
            r.p.b(r3, r5, r0)
            int r0 = r2.f8302g
            r.p.b(r1, r3, r0)
            goto L_0x0339
        L_0x01a0:
            boolean r0 = r10 instanceof q.h
            if (r0 != 0) goto L_0x0339
            q.e r0 = r10.V
            if (r0 == 0) goto L_0x0339
            q.d$b r0 = q.d.b.CENTER
            q.d r0 = r10.g(r0)
            q.d r0 = r0.f8146f
            if (r0 != 0) goto L_0x0339
            q.e r0 = r15.f8321b
            q.e r4 = r0.V
            r.n r4 = r4.f8158e
            r.f r4 = r4.f8326h
            int r0 = r0.m()
            r.p.b(r3, r4, r0)
            int r0 = r2.f8302g
            r.p.b(r1, r3, r0)
            q.e r0 = r15.f8321b
            boolean r1 = r0.E
            if (r1 == 0) goto L_0x0339
        L_0x01cc:
            int r0 = r0.f8156c0
            r.p.b(r5, r3, r0)
            goto L_0x0339
        L_0x01d3:
            java.util.ArrayList r10 = r2.l
            if (r0 != 0) goto L_0x0212
            q.e$b r0 = r15.d
            q.e$b r11 = q.e.b.MATCH_CONSTRAINT
            if (r0 != r11) goto L_0x0212
            q.e r0 = r15.f8321b
            int r11 = r0.f8184s
            if (r11 == r8) goto L_0x01f6
            if (r11 == r9) goto L_0x01e6
            goto L_0x0215
        L_0x01e6:
            boolean r0 = r0.s()
            if (r0 != 0) goto L_0x0215
            q.e r0 = r15.f8321b
            int r11 = r0.f8183r
            if (r11 != r9) goto L_0x01f3
            goto L_0x0215
        L_0x01f3:
            r.l r0 = r0.d
            goto L_0x01fd
        L_0x01f6:
            q.e r0 = r0.V
            if (r0 != 0) goto L_0x01fb
            goto L_0x0215
        L_0x01fb:
            r.n r0 = r0.f8158e
        L_0x01fd:
            r.g r0 = r0.f8323e
            r10.add(r0)
            java.util.ArrayList r0 = r0.f8306k
            r0.add(r2)
            r2.f8298b = r4
            java.util.ArrayList r0 = r2.f8306k
            r0.add(r3)
            r0.add(r1)
            goto L_0x0215
        L_0x0212:
            r2.b(r15)
        L_0x0215:
            q.e r0 = r15.f8321b
            q.d[] r11 = r0.R
            r12 = r11[r8]
            q.d r13 = r12.f8146f
            if (r13 == 0) goto L_0x026e
            r14 = r11[r9]
            q.d r14 = r14.f8146f
            if (r14 == 0) goto L_0x026e
            boolean r0 = r0.s()
            if (r0 == 0) goto L_0x0245
            q.e r0 = r15.f8321b
            q.d[] r0 = r0.R
            r0 = r0[r8]
            int r0 = r0.d()
            r3.f8301f = r0
            q.e r0 = r15.f8321b
            q.d[] r0 = r0.R
            r0 = r0[r9]
            int r0 = r0.d()
            int r0 = -r0
            r1.f8301f = r0
            goto L_0x0267
        L_0x0245:
            q.e r0 = r15.f8321b
            q.d[] r0 = r0.R
            r0 = r0[r8]
            r.f r0 = r.p.h(r0)
            q.e r1 = r15.f8321b
            q.d[] r1 = r1.R
            r1 = r1[r9]
            r.f r1 = r.p.h(r1)
            if (r0 == 0) goto L_0x025e
            r0.b(r15)
        L_0x025e:
            if (r1 == 0) goto L_0x0263
            r1.b(r15)
        L_0x0263:
            r.p$b r0 = r.p.b.CENTER
            r15.f8328j = r0
        L_0x0267:
            q.e r0 = r15.f8321b
            boolean r0 = r0.E
            if (r0 == 0) goto L_0x0331
            goto L_0x02cc
        L_0x026e:
            r14 = 0
            if (r13 == 0) goto L_0x02a8
            r.f r0 = r.p.h(r12)
            if (r0 == 0) goto L_0x0331
            q.e r6 = r15.f8321b
            q.d[] r6 = r6.R
            r6 = r6[r8]
            int r6 = r6.d()
            r.p.b(r3, r0, r6)
            r15.c(r1, r3, r4, r2)
            q.e r0 = r15.f8321b
            boolean r0 = r0.E
            if (r0 == 0) goto L_0x0292
            r.a r0 = r15.l
            r15.c(r5, r3, r4, r0)
        L_0x0292:
            q.e$b r0 = r15.d
            q.e$b r1 = q.e.b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x0331
            q.e r0 = r15.f8321b
            float r3 = r0.Y
            int r3 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r3 <= 0) goto L_0x0331
            r.l r0 = r0.d
            q.e$b r3 = r0.d
            if (r3 != r1) goto L_0x0331
            goto L_0x031f
        L_0x02a8:
            r8 = r11[r9]
            q.d r12 = r8.f8146f
            r13 = -1
            if (r12 == 0) goto L_0x02d2
            r.f r0 = r.p.h(r8)
            if (r0 == 0) goto L_0x0331
            q.e r6 = r15.f8321b
            q.d[] r6 = r6.R
            r6 = r6[r9]
            int r6 = r6.d()
            int r6 = -r6
            r.p.b(r1, r0, r6)
            r15.c(r3, r1, r13, r2)
            q.e r0 = r15.f8321b
            boolean r0 = r0.E
            if (r0 == 0) goto L_0x0331
        L_0x02cc:
            r.a r0 = r15.l
            r15.c(r5, r3, r4, r0)
            goto L_0x0331
        L_0x02d2:
            r7 = r11[r7]
            q.d r8 = r7.f8146f
            if (r8 == 0) goto L_0x02ea
            r.f r0 = r.p.h(r7)
            if (r0 == 0) goto L_0x0331
            r.p.b(r5, r0, r6)
            r.a r0 = r15.l
            r15.c(r3, r5, r13, r0)
            r15.c(r1, r3, r4, r2)
            goto L_0x0331
        L_0x02ea:
            boolean r6 = r0 instanceof q.h
            if (r6 != 0) goto L_0x0331
            q.e r6 = r0.V
            if (r6 == 0) goto L_0x0331
            r.n r6 = r6.f8158e
            r.f r6 = r6.f8326h
            int r0 = r0.m()
            r.p.b(r3, r6, r0)
            r15.c(r1, r3, r4, r2)
            q.e r0 = r15.f8321b
            boolean r0 = r0.E
            if (r0 == 0) goto L_0x030b
            r.a r0 = r15.l
            r15.c(r5, r3, r4, r0)
        L_0x030b:
            q.e$b r0 = r15.d
            q.e$b r1 = q.e.b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x0331
            q.e r0 = r15.f8321b
            float r3 = r0.Y
            int r3 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r3 <= 0) goto L_0x0331
            r.l r0 = r0.d
            q.e$b r3 = r0.d
            if (r3 != r1) goto L_0x0331
        L_0x031f:
            r.g r0 = r0.f8323e
            java.util.ArrayList r0 = r0.f8306k
            r0.add(r2)
            q.e r0 = r15.f8321b
            r.l r0 = r0.d
            r.g r0 = r0.f8323e
            r10.add(r0)
            r2.f8297a = r15
        L_0x0331:
            int r0 = r10.size()
            if (r0 != 0) goto L_0x0339
            r2.f8299c = r4
        L_0x0339:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r.n.d():void");
    }

    public final void e() {
        f fVar = this.f8326h;
        if (fVar.f8305j) {
            this.f8321b.f8154b0 = fVar.f8302g;
        }
    }

    public final void f() {
        this.f8322c = null;
        this.f8326h.c();
        this.f8327i.c();
        this.f8313k.c();
        this.f8323e.c();
        this.f8325g = false;
    }

    public final boolean k() {
        return this.d != e.b.MATCH_CONSTRAINT || this.f8321b.f8184s == 0;
    }

    public final void m() {
        this.f8325g = false;
        f fVar = this.f8326h;
        fVar.c();
        fVar.f8305j = false;
        f fVar2 = this.f8327i;
        fVar2.c();
        fVar2.f8305j = false;
        f fVar3 = this.f8313k;
        fVar3.c();
        fVar3.f8305j = false;
        this.f8323e.f8305j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f8321b.f8169j0;
    }
}

package r;

import q.d;
import q.e;

public abstract class p implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f8320a;

    /* renamed from: b  reason: collision with root package name */
    public e f8321b;

    /* renamed from: c  reason: collision with root package name */
    public m f8322c;
    public e.b d;

    /* renamed from: e  reason: collision with root package name */
    public final g f8323e = new g(this);

    /* renamed from: f  reason: collision with root package name */
    public int f8324f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f8325g = false;

    /* renamed from: h  reason: collision with root package name */
    public final f f8326h = new f(this);

    /* renamed from: i  reason: collision with root package name */
    public final f f8327i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    public b f8328j = b.NONE;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8329a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                q.d$b[] r0 = q.d.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8329a = r0
                q.d$b r1 = q.d.b.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8329a     // Catch:{ NoSuchFieldError -> 0x001d }
                q.d$b r1 = q.d.b.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8329a     // Catch:{ NoSuchFieldError -> 0x0028 }
                q.d$b r1 = q.d.b.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8329a     // Catch:{ NoSuchFieldError -> 0x0033 }
                q.d$b r1 = q.d.b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f8329a     // Catch:{ NoSuchFieldError -> 0x003e }
                q.d$b r1 = q.d.b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r.p.a.<clinit>():void");
        }
    }

    public enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(e eVar) {
        this.f8321b = eVar;
    }

    public static void b(f fVar, f fVar2, int i10) {
        fVar.l.add(fVar2);
        fVar.f8301f = i10;
        fVar2.f8306k.add(fVar);
    }

    public static f h(d dVar) {
        p pVar;
        p pVar2;
        d dVar2 = dVar.f8146f;
        if (dVar2 == null) {
            return null;
        }
        int i10 = a.f8329a[dVar2.f8145e.ordinal()];
        e eVar = dVar2.d;
        if (i10 != 1) {
            if (i10 == 2) {
                pVar2 = eVar.d;
            } else if (i10 == 3) {
                pVar = eVar.f8158e;
            } else if (i10 == 4) {
                return eVar.f8158e.f8313k;
            } else {
                if (i10 != 5) {
                    return null;
                }
                pVar2 = eVar.f8158e;
            }
            return pVar2.f8327i;
        }
        pVar = eVar.d;
        return pVar.f8326h;
    }

    public static f i(d dVar, int i10) {
        d dVar2 = dVar.f8146f;
        if (dVar2 == null) {
            return null;
        }
        e eVar = dVar2.d;
        p pVar = i10 == 0 ? eVar.d : eVar.f8158e;
        int i11 = a.f8329a[dVar2.f8145e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f8327i;
        }
        return pVar.f8326h;
    }

    public void a(d dVar) {
    }

    public final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.l.add(fVar2);
        fVar.l.add(this.f8323e);
        fVar.f8303h = i10;
        fVar.f8304i = gVar;
        fVar2.f8306k.add(fVar);
        gVar.f8306k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        int i12;
        if (i11 == 0) {
            e eVar = this.f8321b;
            int i13 = eVar.f8186v;
            i12 = Math.max(eVar.u, i10);
            if (i13 > 0) {
                i12 = Math.min(i13, i10);
            }
            if (i12 == i10) {
                return i10;
            }
        } else {
            e eVar2 = this.f8321b;
            int i14 = eVar2.f8188y;
            int max = Math.max(eVar2.f8187x, i10);
            if (i14 > 0) {
                max = Math.min(i14, i10);
            }
            if (i12 == i10) {
                return i10;
            }
        }
        return i12;
    }

    public long j() {
        g gVar = this.f8323e;
        if (gVar.f8305j) {
            return (long) gVar.f8302g;
        }
        return 0;
    }

    public abstract boolean k();

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        if (r10.f8320a == 3) goto L_0x00a6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(q.d r13, q.d r14, int r15) {
        /*
            r12 = this;
            r.f r0 = h(r13)
            r.f r1 = h(r14)
            boolean r2 = r0.f8305j
            if (r2 == 0) goto L_0x00dd
            boolean r2 = r1.f8305j
            if (r2 != 0) goto L_0x0012
            goto L_0x00dd
        L_0x0012:
            int r2 = r0.f8302g
            int r13 = r13.d()
            int r13 = r13 + r2
            int r2 = r1.f8302g
            int r14 = r14.d()
            int r2 = r2 - r14
            int r14 = r2 - r13
            r.g r3 = r12.f8323e
            boolean r4 = r3.f8305j
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r4 != 0) goto L_0x00a6
            q.e$b r4 = r12.d
            q.e$b r6 = q.e.b.MATCH_CONSTRAINT
            if (r4 != r6) goto L_0x00a6
            int r4 = r12.f8320a
            if (r4 == 0) goto L_0x009e
            r7 = 1
            if (r4 == r7) goto L_0x0093
            r8 = 2
            if (r4 == r8) goto L_0x0072
            r8 = 3
            if (r4 == r8) goto L_0x003f
            goto L_0x00a6
        L_0x003f:
            q.e r4 = r12.f8321b
            r.l r9 = r4.d
            q.e$b r10 = r9.d
            if (r10 != r6) goto L_0x0056
            int r10 = r9.f8320a
            if (r10 != r8) goto L_0x0056
            r.n r10 = r4.f8158e
            q.e$b r11 = r10.d
            if (r11 != r6) goto L_0x0056
            int r6 = r10.f8320a
            if (r6 != r8) goto L_0x0056
            goto L_0x00a6
        L_0x0056:
            if (r15 != 0) goto L_0x005a
            r.n r9 = r4.f8158e
        L_0x005a:
            r.g r6 = r9.f8323e
            boolean r8 = r6.f8305j
            if (r8 == 0) goto L_0x00a6
            float r4 = r4.Y
            if (r15 != r7) goto L_0x006b
            int r6 = r6.f8302g
            float r6 = (float) r6
            float r6 = r6 / r4
            float r6 = r6 + r5
            int r4 = (int) r6
            goto L_0x00a3
        L_0x006b:
            int r6 = r6.f8302g
            float r6 = (float) r6
            float r4 = r4 * r6
            float r4 = r4 + r5
            int r4 = (int) r4
            goto L_0x00a3
        L_0x0072:
            q.e r4 = r12.f8321b
            q.e r6 = r4.V
            if (r6 == 0) goto L_0x00a6
            if (r15 != 0) goto L_0x007d
            r.l r6 = r6.d
            goto L_0x007f
        L_0x007d:
            r.n r6 = r6.f8158e
        L_0x007f:
            r.g r6 = r6.f8323e
            boolean r7 = r6.f8305j
            if (r7 == 0) goto L_0x00a6
            if (r15 != 0) goto L_0x008a
            float r4 = r4.w
            goto L_0x008c
        L_0x008a:
            float r4 = r4.z
        L_0x008c:
            int r6 = r6.f8302g
            float r6 = (float) r6
            float r6 = r6 * r4
            float r6 = r6 + r5
            int r4 = (int) r6
            goto L_0x009f
        L_0x0093:
            int r4 = r3.f8307m
            int r4 = r12.g(r4, r15)
            int r4 = java.lang.Math.min(r4, r14)
            goto L_0x00a3
        L_0x009e:
            r4 = r14
        L_0x009f:
            int r4 = r12.g(r4, r15)
        L_0x00a3:
            r3.d(r4)
        L_0x00a6:
            boolean r4 = r3.f8305j
            if (r4 != 0) goto L_0x00ab
            return
        L_0x00ab:
            int r4 = r3.f8302g
            r.f r6 = r12.f8327i
            r.f r7 = r12.f8326h
            if (r4 != r14) goto L_0x00ba
            r7.d(r13)
            r6.d(r2)
            return
        L_0x00ba:
            q.e r14 = r12.f8321b
            if (r15 != 0) goto L_0x00c1
            float r14 = r14.f8161f0
            goto L_0x00c3
        L_0x00c1:
            float r14 = r14.f8163g0
        L_0x00c3:
            if (r0 != r1) goto L_0x00ca
            int r13 = r0.f8302g
            int r2 = r1.f8302g
            r14 = r5
        L_0x00ca:
            int r2 = r2 - r13
            int r2 = r2 - r4
            float r13 = (float) r13
            float r13 = r13 + r5
            float r15 = (float) r2
            float r15 = r15 * r14
            float r15 = r15 + r13
            int r13 = (int) r15
            r7.d(r13)
            int r13 = r7.f8302g
            int r14 = r3.f8302g
            int r13 = r13 + r14
            r6.d(r13)
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r.p.l(q.d, q.d, int):void");
    }
}

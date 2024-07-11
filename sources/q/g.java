package q;

import java.util.ArrayList;
import o.b;
import o.d;
import q.d;
import q.e;

public final class g extends e {

    /* renamed from: r0  reason: collision with root package name */
    public float f8196r0 = -1.0f;

    /* renamed from: s0  reason: collision with root package name */
    public int f8197s0 = -1;
    public int t0 = -1;

    /* renamed from: u0  reason: collision with root package name */
    public d f8198u0 = this.K;

    /* renamed from: v0  reason: collision with root package name */
    public int f8199v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f8200w0;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8201a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                q.d$b[] r0 = q.d.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8201a = r0
                q.d$b r1 = q.d.b.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8201a     // Catch:{ NoSuchFieldError -> 0x001d }
                q.d$b r1 = q.d.b.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8201a     // Catch:{ NoSuchFieldError -> 0x0028 }
                q.d$b r1 = q.d.b.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8201a     // Catch:{ NoSuchFieldError -> 0x0033 }
                q.d$b r1 = q.d.b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f8201a     // Catch:{ NoSuchFieldError -> 0x003e }
                q.d$b r1 = q.d.b.BASELINE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f8201a     // Catch:{ NoSuchFieldError -> 0x0049 }
                q.d$b r1 = q.d.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f8201a     // Catch:{ NoSuchFieldError -> 0x0054 }
                q.d$b r1 = q.d.b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f8201a     // Catch:{ NoSuchFieldError -> 0x0060 }
                q.d$b r1 = q.d.b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f8201a     // Catch:{ NoSuchFieldError -> 0x006c }
                q.d$b r1 = q.d.b.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q.g.a.<clinit>():void");
        }
    }

    public g() {
        this.f8199v0 = 0;
        this.S.clear();
        this.S.add(this.f8198u0);
        int length = this.R.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.R[i10] = this.f8198u0;
        }
    }

    public final void G(d dVar, boolean z) {
        if (this.V != null) {
            d dVar2 = this.f8198u0;
            dVar.getClass();
            int o10 = d.o(dVar2);
            if (this.f8199v0 == 1) {
                this.f8152a0 = o10;
                this.f8154b0 = 0;
                B(this.V.i());
                E(0);
                return;
            }
            this.f8152a0 = 0;
            this.f8154b0 = o10;
            E(this.V.k());
            B(0);
        }
    }

    public final void H(int i10) {
        if (this.f8199v0 != i10) {
            this.f8199v0 = i10;
            ArrayList<d> arrayList = this.S;
            arrayList.clear();
            this.f8198u0 = this.f8199v0 == 1 ? this.J : this.K;
            arrayList.add(this.f8198u0);
            d[] dVarArr = this.R;
            int length = dVarArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                dVarArr[i11] = this.f8198u0;
            }
        }
    }

    public final void b(d dVar, boolean z) {
        boolean z10;
        f fVar = (f) this.V;
        if (fVar != null) {
            d g10 = fVar.g(d.b.LEFT);
            d g11 = fVar.g(d.b.RIGHT);
            e eVar = this.V;
            boolean z11 = true;
            if (eVar == null || eVar.U[0] != e.b.WRAP_CONTENT) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (this.f8199v0 == 0) {
                g10 = fVar.g(d.b.TOP);
                g11 = fVar.g(d.b.BOTTOM);
                e eVar2 = this.V;
                if (eVar2 == null || eVar2.U[1] != e.b.WRAP_CONTENT) {
                    z11 = false;
                }
                z10 = z11;
            }
            if (this.f8200w0) {
                d dVar2 = this.f8198u0;
                if (dVar2.f8144c) {
                    o.g l = dVar.l(dVar2);
                    dVar.d(l, this.f8198u0.c());
                    if (this.f8197s0 != -1) {
                        if (z10) {
                            dVar.f(dVar.l(g11), l, 0, 5);
                        }
                    } else if (this.t0 != -1 && z10) {
                        o.g l8 = dVar.l(g11);
                        dVar.f(l, dVar.l(g10), 0, 5);
                        dVar.f(l8, l, 0, 5);
                    }
                    this.f8200w0 = false;
                    return;
                }
            }
            if (this.f8197s0 != -1) {
                o.g l10 = dVar.l(this.f8198u0);
                dVar.e(l10, dVar.l(g10), this.f8197s0, 8);
                if (z10) {
                    dVar.f(dVar.l(g11), l10, 0, 5);
                }
            } else if (this.t0 != -1) {
                o.g l11 = dVar.l(this.f8198u0);
                o.g l12 = dVar.l(g11);
                dVar.e(l11, l12, -this.t0, 8);
                if (z10) {
                    dVar.f(l11, dVar.l(g10), 0, 5);
                    dVar.f(l12, l11, 0, 5);
                }
            } else if (this.f8196r0 != -1.0f) {
                o.g l13 = dVar.l(this.f8198u0);
                o.g l14 = dVar.l(g11);
                float f10 = this.f8196r0;
                b m10 = dVar.m();
                m10.d.c(l13, -1.0f);
                m10.d.c(l14, f10);
                dVar.c(m10);
            }
        }
    }

    public final boolean c() {
        return true;
    }

    public final d g(d.b bVar) {
        int i10 = a.f8201a[bVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            if (this.f8199v0 == 1) {
                return this.f8198u0;
            }
            return null;
        } else if ((i10 == 3 || i10 == 4) && this.f8199v0 == 0) {
            return this.f8198u0;
        } else {
            return null;
        }
    }

    public final boolean u() {
        return this.f8200w0;
    }

    public final boolean v() {
        return this.f8200w0;
    }
}

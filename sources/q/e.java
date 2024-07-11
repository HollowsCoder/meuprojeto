package q;

import androidx.appcompat.widget.x0;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import q.d;
import r.c;
import r.f;
import r.l;
import r.n;

public class e {
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final d J;
    public final d K;
    public final d L;
    public final d M;
    public final d N;
    public final d O;
    public final d P;
    public final d Q;
    public final d[] R;
    public final ArrayList<d> S;
    public final boolean[] T;
    public final b[] U;
    public e V;
    public int W;
    public int X;
    public float Y;
    public int Z;

    /* renamed from: a  reason: collision with root package name */
    public boolean f8151a = false;

    /* renamed from: a0  reason: collision with root package name */
    public int f8152a0;

    /* renamed from: b  reason: collision with root package name */
    public c f8153b;

    /* renamed from: b0  reason: collision with root package name */
    public int f8154b0;

    /* renamed from: c  reason: collision with root package name */
    public c f8155c;

    /* renamed from: c0  reason: collision with root package name */
    public int f8156c0;
    public l d = null;

    /* renamed from: d0  reason: collision with root package name */
    public int f8157d0;

    /* renamed from: e  reason: collision with root package name */
    public n f8158e = null;

    /* renamed from: e0  reason: collision with root package name */
    public int f8159e0;

    /* renamed from: f  reason: collision with root package name */
    public final boolean[] f8160f = {true, true};

    /* renamed from: f0  reason: collision with root package name */
    public float f8161f0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f8162g = true;

    /* renamed from: g0  reason: collision with root package name */
    public float f8163g0;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f8164h = true;

    /* renamed from: h0  reason: collision with root package name */
    public Object f8165h0;

    /* renamed from: i  reason: collision with root package name */
    public int f8166i = -1;

    /* renamed from: i0  reason: collision with root package name */
    public int f8167i0;

    /* renamed from: j  reason: collision with root package name */
    public int f8168j = -1;

    /* renamed from: j0  reason: collision with root package name */
    public String f8169j0;

    /* renamed from: k  reason: collision with root package name */
    public boolean f8170k;

    /* renamed from: k0  reason: collision with root package name */
    public int f8171k0;
    public boolean l;

    /* renamed from: l0  reason: collision with root package name */
    public int f8172l0;

    /* renamed from: m  reason: collision with root package name */
    public boolean f8173m;

    /* renamed from: m0  reason: collision with root package name */
    public final float[] f8174m0;

    /* renamed from: n  reason: collision with root package name */
    public boolean f8175n;

    /* renamed from: n0  reason: collision with root package name */
    public final e[] f8176n0;

    /* renamed from: o  reason: collision with root package name */
    public int f8177o;

    /* renamed from: o0  reason: collision with root package name */
    public final e[] f8178o0;

    /* renamed from: p  reason: collision with root package name */
    public int f8179p;

    /* renamed from: p0  reason: collision with root package name */
    public int f8180p0;

    /* renamed from: q  reason: collision with root package name */
    public int f8181q;

    /* renamed from: q0  reason: collision with root package name */
    public int f8182q0;

    /* renamed from: r  reason: collision with root package name */
    public int f8183r;

    /* renamed from: s  reason: collision with root package name */
    public int f8184s;

    /* renamed from: t  reason: collision with root package name */
    public final int[] f8185t;
    public int u;

    /* renamed from: v  reason: collision with root package name */
    public int f8186v;
    public float w;

    /* renamed from: x  reason: collision with root package name */
    public int f8187x;

    /* renamed from: y  reason: collision with root package name */
    public int f8188y;
    public float z;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8189a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f8190b;

        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008f */
        static {
            /*
                q.e$b[] r0 = q.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8190b = r0
                r1 = 1
                q.e$b r2 = q.e.b.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f8190b     // Catch:{ NoSuchFieldError -> 0x001d }
                q.e$b r3 = q.e.b.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f8190b     // Catch:{ NoSuchFieldError -> 0x0028 }
                q.e$b r4 = q.e.b.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f8190b     // Catch:{ NoSuchFieldError -> 0x0033 }
                q.e$b r5 = q.e.b.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                q.d$b[] r4 = q.d.b.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f8189a = r4
                q.d$b r5 = q.d.b.LEFT     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f8189a     // Catch:{ NoSuchFieldError -> 0x004e }
                q.d$b r4 = q.d.b.TOP     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f8189a     // Catch:{ NoSuchFieldError -> 0x0058 }
                q.d$b r1 = q.d.b.RIGHT     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f8189a     // Catch:{ NoSuchFieldError -> 0x0062 }
                q.d$b r1 = q.d.b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f8189a     // Catch:{ NoSuchFieldError -> 0x006d }
                q.d$b r1 = q.d.b.BASELINE     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f8189a     // Catch:{ NoSuchFieldError -> 0x0078 }
                q.d$b r1 = q.d.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f8189a     // Catch:{ NoSuchFieldError -> 0x0083 }
                q.d$b r1 = q.d.b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f8189a     // Catch:{ NoSuchFieldError -> 0x008f }
                q.d$b r1 = q.d.b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r0 = f8189a     // Catch:{ NoSuchFieldError -> 0x009b }
                q.d$b r1 = q.d.b.NONE     // Catch:{ NoSuchFieldError -> 0x009b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009b }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009b }
            L_0x009b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q.e.a.<clinit>():void");
        }
    }

    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        new HashMap();
        this.f8170k = false;
        this.l = false;
        this.f8173m = false;
        this.f8175n = false;
        this.f8177o = -1;
        this.f8179p = -1;
        this.f8181q = 0;
        this.f8183r = 0;
        this.f8184s = 0;
        this.f8185t = new int[2];
        this.u = 0;
        this.f8186v = 0;
        this.w = 1.0f;
        this.f8187x = 0;
        this.f8188y = 0;
        this.z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = 0.0f;
        this.E = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        d dVar = new d(this, d.b.LEFT);
        this.J = dVar;
        d dVar2 = new d(this, d.b.TOP);
        this.K = dVar2;
        d dVar3 = new d(this, d.b.RIGHT);
        this.L = dVar3;
        d dVar4 = new d(this, d.b.BOTTOM);
        this.M = dVar4;
        d dVar5 = new d(this, d.b.BASELINE);
        this.N = dVar5;
        d dVar6 = new d(this, d.b.CENTER_X);
        this.O = dVar6;
        d dVar7 = new d(this, d.b.CENTER_Y);
        this.P = dVar7;
        d dVar8 = new d(this, d.b.CENTER);
        this.Q = dVar8;
        this.R = new d[]{dVar, dVar3, dVar2, dVar4, dVar5, dVar8};
        ArrayList<d> arrayList = new ArrayList<>();
        this.S = arrayList;
        this.T = new boolean[2];
        b bVar = b.FIXED;
        this.U = new b[]{bVar, bVar};
        this.V = null;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.f8152a0 = 0;
        this.f8154b0 = 0;
        this.f8156c0 = 0;
        this.f8161f0 = 0.5f;
        this.f8163g0 = 0.5f;
        this.f8167i0 = 0;
        this.f8169j0 = null;
        this.f8171k0 = 0;
        this.f8172l0 = 0;
        this.f8174m0 = new float[]{-1.0f, -1.0f};
        this.f8176n0 = new e[]{null, null};
        this.f8178o0 = new e[]{null, null};
        this.f8180p0 = -1;
        this.f8182q0 = -1;
        arrayList.add(dVar);
        arrayList.add(dVar2);
        arrayList.add(dVar3);
        arrayList.add(dVar4);
        arrayList.add(dVar6);
        arrayList.add(dVar7);
        arrayList.add(dVar8);
        arrayList.add(dVar5);
    }

    public final void A(int i10, int i11) {
        if (!this.l) {
            this.K.i(i10);
            this.M.i(i11);
            this.f8154b0 = i10;
            this.X = i11 - i10;
            if (this.E) {
                this.N.i(i10 + this.f8156c0);
            }
            this.l = true;
        }
    }

    public final void B(int i10) {
        this.X = i10;
        int i11 = this.f8159e0;
        if (i10 < i11) {
            this.X = i11;
        }
    }

    public final void C(b bVar) {
        this.U[0] = bVar;
    }

    public final void D(b bVar) {
        this.U[1] = bVar;
    }

    public final void E(int i10) {
        this.W = i10;
        int i11 = this.f8157d0;
        if (i10 < i11) {
            this.W = i11;
        }
    }

    public void F(boolean z10, boolean z11) {
        int i10;
        int i11;
        l lVar = this.d;
        boolean z12 = z10 & lVar.f8325g;
        n nVar = this.f8158e;
        boolean z13 = z11 & nVar.f8325g;
        int i12 = lVar.f8326h.f8302g;
        int i13 = nVar.f8326h.f8302g;
        int i14 = lVar.f8327i.f8302g;
        int i15 = nVar.f8327i.f8302g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i15 = 0;
            i12 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (z12) {
            this.f8152a0 = i12;
        }
        if (z13) {
            this.f8154b0 = i13;
        }
        if (this.f8167i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        b[] bVarArr = this.U;
        if (z12) {
            if (bVarArr[0] == b.FIXED && i17 < (i11 = this.W)) {
                i17 = i11;
            }
            this.W = i17;
            int i19 = this.f8157d0;
            if (i17 < i19) {
                this.W = i19;
            }
        }
        if (z13) {
            if (bVarArr[1] == b.FIXED && i18 < (i10 = this.X)) {
                i18 = i10;
            }
            this.X = i18;
            int i20 = this.f8159e0;
            if (i18 < i20) {
                this.X = i20;
            }
        }
    }

    public void G(o.d dVar, boolean z10) {
        int i10;
        int i11;
        n nVar;
        l lVar;
        dVar.getClass();
        int o10 = o.d.o(this.J);
        int o11 = o.d.o(this.K);
        int o12 = o.d.o(this.L);
        int o13 = o.d.o(this.M);
        if (z10 && (lVar = this.d) != null) {
            f fVar = lVar.f8326h;
            if (fVar.f8305j) {
                f fVar2 = lVar.f8327i;
                if (fVar2.f8305j) {
                    o10 = fVar.f8302g;
                    o12 = fVar2.f8302g;
                }
            }
        }
        if (z10 && (nVar = this.f8158e) != null) {
            f fVar3 = nVar.f8326h;
            if (fVar3.f8305j) {
                f fVar4 = nVar.f8327i;
                if (fVar4.f8305j) {
                    o11 = fVar3.f8302g;
                    o13 = fVar4.f8302g;
                }
            }
        }
        int i12 = o13 - o11;
        if (o12 - o10 < 0 || i12 < 0 || o10 == Integer.MIN_VALUE || o10 == Integer.MAX_VALUE || o11 == Integer.MIN_VALUE || o11 == Integer.MAX_VALUE || o12 == Integer.MIN_VALUE || o12 == Integer.MAX_VALUE || o13 == Integer.MIN_VALUE || o13 == Integer.MAX_VALUE) {
            o10 = 0;
            o11 = 0;
            o12 = 0;
            o13 = 0;
        }
        int i13 = o12 - o10;
        int i14 = o13 - o11;
        this.f8152a0 = o10;
        this.f8154b0 = o11;
        if (this.f8167i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        b[] bVarArr = this.U;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i13 < (i11 = this.W)) {
            i13 = i11;
        }
        if (bVarArr[1] == bVar2 && i14 < (i10 = this.X)) {
            i14 = i10;
        }
        this.W = i13;
        this.X = i14;
        int i15 = this.f8159e0;
        if (i14 < i15) {
            this.X = i15;
        }
        int i16 = this.f8157d0;
        if (i13 < i16) {
            this.W = i16;
        }
        int i17 = this.f8186v;
        if (i17 > 0 && bVar == b.MATCH_CONSTRAINT) {
            this.W = Math.min(this.W, i17);
        }
        int i18 = this.f8188y;
        if (i18 > 0 && bVarArr[1] == b.MATCH_CONSTRAINT) {
            this.X = Math.min(this.X, i18);
        }
        int i19 = this.W;
        if (i13 != i19) {
            this.f8166i = i19;
        }
        int i20 = this.X;
        if (i14 != i20) {
            this.f8168j = i20;
        }
    }

    public final void a(f fVar, o.d dVar, HashSet<e> hashSet, int i10, boolean z10) {
        if (z10) {
            if (hashSet.contains(this)) {
                j.a(fVar, dVar, this);
                hashSet.remove(this);
                b(dVar, fVar.M(64));
            } else {
                return;
            }
        }
        if (i10 == 0) {
            HashSet<d> hashSet2 = this.J.f8142a;
            if (hashSet2 != null) {
                Iterator<d> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().d.a(fVar, dVar, hashSet, i10, true);
                }
            }
            HashSet<d> hashSet3 = this.L.f8142a;
            if (hashSet3 != null) {
                Iterator<d> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().d.a(fVar, dVar, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet<d> hashSet4 = this.K.f8142a;
        if (hashSet4 != null) {
            Iterator<d> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().d.a(fVar, dVar, hashSet, i10, true);
            }
        }
        HashSet<d> hashSet5 = this.M.f8142a;
        if (hashSet5 != null) {
            Iterator<d> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().d.a(fVar, dVar, hashSet, i10, true);
            }
        }
        HashSet<d> hashSet6 = this.N.f8142a;
        if (hashSet6 != null) {
            Iterator<d> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().d.a(fVar, dVar, hashSet, i10, true);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: int} */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d8, code lost:
        if (r0.c() > r3.I0.get().c()) goto L_0x00dd;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0388  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x03f8  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0411  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x0420  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0438  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x043a  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x043f  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x0470  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x04bf  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x0588  */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x05ea  */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x05fe  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x0600  */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x0607  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x0684  */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x0687  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x06c5  */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x06cd  */
    /* JADX WARNING: Removed duplicated region for block: B:410:0x06f0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(o.d r62, boolean r63) {
        /*
            r61 = this;
            r15 = r61
            r14 = r62
            q.d r0 = r15.J
            o.g r13 = r14.l(r0)
            q.d r1 = r15.L
            o.g r12 = r14.l(r1)
            q.d r2 = r15.K
            o.g r11 = r14.l(r2)
            q.d r10 = r15.M
            o.g r9 = r14.l(r10)
            q.d r8 = r15.N
            o.g r7 = r14.l(r8)
            q.e r3 = r15.V
            r5 = 1
            r4 = 0
            if (r3 == 0) goto L_0x004e
            q.e$b[] r3 = r3.U
            r6 = r3[r4]
            q.e$b r4 = q.e.b.WRAP_CONTENT
            if (r6 != r4) goto L_0x0032
            r6 = r5
            goto L_0x0033
        L_0x0032:
            r6 = 0
        L_0x0033:
            r3 = r3[r5]
            if (r3 != r4) goto L_0x0039
            r3 = r5
            goto L_0x003a
        L_0x0039:
            r3 = 0
        L_0x003a:
            int r4 = r15.f8181q
            if (r4 == r5) goto L_0x0049
            r5 = 2
            if (r4 == r5) goto L_0x004f
            r5 = 3
            if (r4 == r5) goto L_0x004e
            r28 = r3
            r29 = r6
            goto L_0x0053
        L_0x0049:
            r29 = r6
            r28 = 0
            goto L_0x0053
        L_0x004e:
            r3 = 0
        L_0x004f:
            r28 = r3
            r29 = 0
        L_0x0053:
            int r3 = r15.f8167i0
            r6 = 8
            boolean[] r4 = r15.T
            if (r3 != r6) goto L_0x0093
            java.util.ArrayList<q.d> r3 = r15.S
            int r5 = r3.size()
            r6 = 0
        L_0x0062:
            if (r6 >= r5) goto L_0x0085
            java.lang.Object r21 = r3.get(r6)
            r22 = r3
            r3 = r21
            q.d r3 = (q.d) r3
            java.util.HashSet<q.d> r3 = r3.f8142a
            if (r3 != 0) goto L_0x0073
            goto L_0x007b
        L_0x0073:
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x007b
            r3 = 1
            goto L_0x007c
        L_0x007b:
            r3 = 0
        L_0x007c:
            if (r3 == 0) goto L_0x0080
            r3 = 1
            goto L_0x0086
        L_0x0080:
            int r6 = r6 + 1
            r3 = r22
            goto L_0x0062
        L_0x0085:
            r3 = 0
        L_0x0086:
            if (r3 != 0) goto L_0x0093
            r3 = 0
            boolean r5 = r4[r3]
            if (r5 != 0) goto L_0x0093
            r3 = 1
            boolean r5 = r4[r3]
            if (r5 != 0) goto L_0x0093
            return
        L_0x0093:
            boolean r3 = r15.f8170k
            if (r3 != 0) goto L_0x00a1
            boolean r5 = r15.l
            if (r5 == 0) goto L_0x009c
            goto L_0x00a1
        L_0x009c:
            r22 = r4
            r6 = 5
            goto L_0x01ad
        L_0x00a1:
            boolean r5 = r15.f8164h
            if (r3 == 0) goto L_0x0116
            int r3 = r15.f8152a0
            r14.d(r13, r3)
            int r3 = r15.f8152a0
            int r6 = r15.W
            int r3 = r3 + r6
            r14.d(r12, r3)
            if (r29 == 0) goto L_0x0116
            q.e r3 = r15.V
            if (r3 == 0) goto L_0x0116
            if (r5 == 0) goto L_0x0108
            q.f r3 = (q.f) r3
            java.lang.ref.WeakReference<q.d> r6 = r3.I0
            if (r6 == 0) goto L_0x00db
            java.lang.Object r6 = r6.get()
            if (r6 == 0) goto L_0x00db
            int r6 = r0.c()
            r22 = r4
            java.lang.ref.WeakReference<q.d> r4 = r3.I0
            java.lang.Object r4 = r4.get()
            q.d r4 = (q.d) r4
            int r4 = r4.c()
            if (r6 <= r4) goto L_0x00e4
            goto L_0x00dd
        L_0x00db:
            r22 = r4
        L_0x00dd:
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r0)
            r3.I0 = r4
        L_0x00e4:
            java.lang.ref.WeakReference<q.d> r4 = r3.K0
            if (r4 == 0) goto L_0x0100
            java.lang.Object r4 = r4.get()
            if (r4 == 0) goto L_0x0100
            int r4 = r1.c()
            java.lang.ref.WeakReference<q.d> r6 = r3.K0
            java.lang.Object r6 = r6.get()
            q.d r6 = (q.d) r6
            int r6 = r6.c()
            if (r4 <= r6) goto L_0x0118
        L_0x0100:
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r1)
            r3.K0 = r4
            goto L_0x0118
        L_0x0108:
            r22 = r4
            q.d r3 = r3.L
            o.g r3 = r14.l(r3)
            r4 = 5
            r6 = 0
            r14.f(r3, r12, r6, r4)
            goto L_0x0118
        L_0x0116:
            r22 = r4
        L_0x0118:
            boolean r3 = r15.l
            if (r3 == 0) goto L_0x019e
            int r3 = r15.f8154b0
            r14.d(r11, r3)
            int r3 = r15.f8154b0
            int r4 = r15.X
            int r3 = r3 + r4
            r14.d(r9, r3)
            java.util.HashSet<q.d> r3 = r8.f8142a
            if (r3 != 0) goto L_0x012e
            goto L_0x0136
        L_0x012e:
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0136
            r3 = 1
            goto L_0x0137
        L_0x0136:
            r3 = 0
        L_0x0137:
            if (r3 == 0) goto L_0x0141
            int r3 = r15.f8154b0
            int r4 = r15.f8156c0
            int r3 = r3 + r4
            r14.d(r7, r3)
        L_0x0141:
            if (r28 == 0) goto L_0x019e
            q.e r3 = r15.V
            if (r3 == 0) goto L_0x019e
            if (r5 == 0) goto L_0x0192
            q.f r3 = (q.f) r3
            java.lang.ref.WeakReference<q.d> r4 = r3.H0
            if (r4 == 0) goto L_0x0167
            java.lang.Object r4 = r4.get()
            if (r4 == 0) goto L_0x0167
            int r4 = r2.c()
            java.lang.ref.WeakReference<q.d> r5 = r3.H0
            java.lang.Object r5 = r5.get()
            q.d r5 = (q.d) r5
            int r5 = r5.c()
            if (r4 <= r5) goto L_0x016e
        L_0x0167:
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r2)
            r3.H0 = r4
        L_0x016e:
            java.lang.ref.WeakReference<q.d> r4 = r3.J0
            if (r4 == 0) goto L_0x018a
            java.lang.Object r4 = r4.get()
            if (r4 == 0) goto L_0x018a
            int r4 = r10.c()
            java.lang.ref.WeakReference<q.d> r5 = r3.J0
            java.lang.Object r5 = r5.get()
            q.d r5 = (q.d) r5
            int r5 = r5.c()
            if (r4 <= r5) goto L_0x019e
        L_0x018a:
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r10)
            r3.J0 = r4
            goto L_0x019e
        L_0x0192:
            q.d r3 = r3.M
            o.g r3 = r14.l(r3)
            r4 = 0
            r6 = 5
            r14.f(r3, r9, r4, r6)
            goto L_0x01a0
        L_0x019e:
            r4 = 0
            r6 = 5
        L_0x01a0:
            boolean r3 = r15.f8170k
            if (r3 == 0) goto L_0x01ad
            boolean r3 = r15.l
            if (r3 == 0) goto L_0x01ad
            r15.f8170k = r4
            r15.l = r4
            return
        L_0x01ad:
            boolean[] r5 = r15.f8160f
            if (r63 == 0) goto L_0x023c
            r.l r3 = r15.d
            if (r3 == 0) goto L_0x023c
            r.n r4 = r15.f8158e
            if (r4 == 0) goto L_0x023c
            r.f r6 = r3.f8326h
            r23 = r8
            boolean r8 = r6.f8305j
            if (r8 == 0) goto L_0x023e
            r.f r3 = r3.f8327i
            boolean r3 = r3.f8305j
            if (r3 == 0) goto L_0x023e
            r.f r3 = r4.f8326h
            boolean r3 = r3.f8305j
            if (r3 == 0) goto L_0x023e
            r.f r3 = r4.f8327i
            boolean r3 = r3.f8305j
            if (r3 == 0) goto L_0x023e
            int r0 = r6.f8302g
            r14.d(r13, r0)
            r.l r0 = r15.d
            r.f r0 = r0.f8327i
            int r0 = r0.f8302g
            r14.d(r12, r0)
            r.n r0 = r15.f8158e
            r.f r0 = r0.f8326h
            int r0 = r0.f8302g
            r14.d(r11, r0)
            r.n r0 = r15.f8158e
            r.f r0 = r0.f8327i
            int r0 = r0.f8302g
            r14.d(r9, r0)
            r.n r0 = r15.f8158e
            r.f r0 = r0.f8313k
            int r0 = r0.f8302g
            r14.d(r7, r0)
            q.e r0 = r15.V
            if (r0 == 0) goto L_0x0236
            if (r29 == 0) goto L_0x021a
            r0 = 0
            boolean r1 = r5[r0]
            if (r1 == 0) goto L_0x021a
            boolean r1 = r61.r()
            if (r1 != 0) goto L_0x021a
            q.e r1 = r15.V
            q.d r1 = r1.L
            o.g r1 = r14.l(r1)
            r2 = 8
            r14.f(r1, r12, r0, r2)
        L_0x021a:
            if (r28 == 0) goto L_0x0236
            r0 = 1
            boolean r0 = r5[r0]
            if (r0 == 0) goto L_0x0236
            boolean r0 = r61.s()
            if (r0 != 0) goto L_0x0236
            q.e r0 = r15.V
            q.d r0 = r0.M
            o.g r0 = r14.l(r0)
            r1 = 8
            r2 = 0
            r14.f(r0, r9, r2, r1)
            goto L_0x0237
        L_0x0236:
            r2 = 0
        L_0x0237:
            r15.f8170k = r2
            r15.l = r2
            return
        L_0x023c:
            r23 = r8
        L_0x023e:
            q.e r3 = r15.V
            if (r3 == 0) goto L_0x02b4
            r3 = 0
            boolean r4 = r15.q(r3)
            if (r4 == 0) goto L_0x0252
            q.e r4 = r15.V
            q.f r4 = (q.f) r4
            r4.I(r3, r15)
            r3 = 1
            goto L_0x0256
        L_0x0252:
            boolean r3 = r61.r()
        L_0x0256:
            r4 = 1
            boolean r6 = r15.q(r4)
            if (r6 == 0) goto L_0x0266
            q.e r6 = r15.V
            q.f r6 = (q.f) r6
            r6.I(r4, r15)
            r4 = 1
            goto L_0x026a
        L_0x0266:
            boolean r4 = r61.s()
        L_0x026a:
            if (r3 != 0) goto L_0x028c
            if (r29 == 0) goto L_0x028c
            int r6 = r15.f8167i0
            r8 = 8
            if (r6 == r8) goto L_0x028c
            q.d r6 = r0.f8146f
            if (r6 != 0) goto L_0x028c
            q.d r6 = r1.f8146f
            if (r6 != 0) goto L_0x028c
            q.e r6 = r15.V
            q.d r6 = r6.L
            o.g r6 = r14.l(r6)
            r24 = r3
            r3 = 0
            r8 = 1
            r14.f(r6, r12, r3, r8)
            goto L_0x028e
        L_0x028c:
            r24 = r3
        L_0x028e:
            if (r4 != 0) goto L_0x02af
            if (r28 == 0) goto L_0x02af
            int r3 = r15.f8167i0
            r6 = 8
            if (r3 == r6) goto L_0x02af
            q.d r3 = r2.f8146f
            if (r3 != 0) goto L_0x02af
            q.d r3 = r10.f8146f
            if (r3 != 0) goto L_0x02af
            if (r23 != 0) goto L_0x02af
            q.e r3 = r15.V
            q.d r3 = r3.M
            o.g r3 = r14.l(r3)
            r6 = 1
            r8 = 0
            r14.f(r3, r9, r8, r6)
        L_0x02af:
            r30 = r4
            r31 = r24
            goto L_0x02b8
        L_0x02b4:
            r30 = 0
            r31 = 0
        L_0x02b8:
            int r3 = r15.W
            int r4 = r15.f8157d0
            if (r3 >= r4) goto L_0x02bf
            goto L_0x02c0
        L_0x02bf:
            r4 = r3
        L_0x02c0:
            int r6 = r15.X
            int r8 = r15.f8159e0
            if (r6 >= r8) goto L_0x02c7
            goto L_0x02c8
        L_0x02c7:
            r8 = r6
        L_0x02c8:
            r27 = r11
            q.e$b[] r11 = r15.U
            r24 = r4
            r18 = 0
            r4 = r11[r18]
            r32 = r9
            q.e$b r9 = q.e.b.MATCH_CONSTRAINT
            r33 = r7
            r19 = 1
            if (r4 == r9) goto L_0x02df
            r25 = 1
            goto L_0x02e1
        L_0x02df:
            r25 = 0
        L_0x02e1:
            r7 = r11[r19]
            r34 = r8
            if (r7 == r9) goto L_0x02ea
            r26 = 1
            goto L_0x02ec
        L_0x02ea:
            r26 = 0
        L_0x02ec:
            int r8 = r15.Z
            r15.A = r8
            r35 = r5
            float r5 = r15.Y
            r15.B = r5
            r36 = r12
            int r12 = r15.f8183r
            r37 = r13
            int r13 = r15.f8184s
            r38 = 0
            int r38 = (r5 > r38 ? 1 : (r5 == r38 ? 0 : -1))
            if (r38 <= 0) goto L_0x03f8
            int r14 = r15.f8167i0
            r39 = r11
            r11 = 8
            if (r14 == r11) goto L_0x03fa
            if (r4 != r9) goto L_0x0311
            if (r12 != 0) goto L_0x0311
            r12 = 3
        L_0x0311:
            if (r7 != r9) goto L_0x0316
            if (r13 != 0) goto L_0x0316
            r13 = 3
        L_0x0316:
            r11 = 1065353216(0x3f800000, float:1.0)
            if (r4 != r9) goto L_0x03c1
            if (r7 != r9) goto L_0x03c1
            r14 = 3
            if (r12 != r14) goto L_0x03c1
            if (r13 != r14) goto L_0x03c1
            r14 = -1
            if (r8 != r14) goto L_0x0339
            if (r25 == 0) goto L_0x032c
            if (r26 != 0) goto L_0x032c
            r3 = 0
            r15.A = r3
            goto L_0x0339
        L_0x032c:
            if (r25 != 0) goto L_0x0339
            if (r26 == 0) goto L_0x0339
            r3 = 1
            r15.A = r3
            if (r8 != r14) goto L_0x0339
            float r3 = r11 / r5
            r15.B = r3
        L_0x0339:
            int r3 = r15.A
            if (r3 != 0) goto L_0x034b
            boolean r3 = r2.f()
            if (r3 == 0) goto L_0x0349
            boolean r3 = r10.f()
            if (r3 != 0) goto L_0x034b
        L_0x0349:
            r3 = 1
            goto L_0x035d
        L_0x034b:
            int r3 = r15.A
            r4 = 1
            if (r3 != r4) goto L_0x035f
            boolean r3 = r0.f()
            if (r3 == 0) goto L_0x035c
            boolean r3 = r1.f()
            if (r3 != 0) goto L_0x035f
        L_0x035c:
            r3 = 0
        L_0x035d:
            r15.A = r3
        L_0x035f:
            int r3 = r15.A
            r4 = -1
            if (r3 != r4) goto L_0x03a1
            boolean r3 = r2.f()
            if (r3 == 0) goto L_0x037c
            boolean r3 = r10.f()
            if (r3 == 0) goto L_0x037c
            boolean r3 = r0.f()
            if (r3 == 0) goto L_0x037c
            boolean r3 = r1.f()
            if (r3 != 0) goto L_0x03a1
        L_0x037c:
            boolean r2 = r2.f()
            if (r2 == 0) goto L_0x038c
            boolean r2 = r10.f()
            if (r2 == 0) goto L_0x038c
            r2 = 0
            r15.A = r2
            goto L_0x03a1
        L_0x038c:
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x03a1
            boolean r0 = r1.f()
            if (r0 == 0) goto L_0x03a1
            float r0 = r15.B
            float r0 = r11 / r0
            r15.B = r0
            r0 = 1
            r15.A = r0
        L_0x03a1:
            int r0 = r15.A
            r1 = -1
            if (r0 != r1) goto L_0x03eb
            int r0 = r15.u
            if (r0 <= 0) goto L_0x03b2
            int r1 = r15.f8187x
            if (r1 != 0) goto L_0x03b2
            r1 = 0
            r15.A = r1
            goto L_0x03eb
        L_0x03b2:
            if (r0 != 0) goto L_0x03eb
            int r0 = r15.f8187x
            if (r0 <= 0) goto L_0x03eb
            float r0 = r15.B
            float r11 = r11 / r0
            r15.B = r11
            r0 = 1
            r15.A = r0
            goto L_0x03eb
        L_0x03c1:
            r0 = 4
            r1 = 3
            if (r4 != r9) goto L_0x03d1
            if (r12 != r1) goto L_0x03d1
            r2 = 0
            r15.A = r2
            float r1 = (float) r6
            float r5 = r5 * r1
            int r4 = (int) r5
            if (r7 == r9) goto L_0x03ed
            r12 = r0
            goto L_0x03fc
        L_0x03d1:
            if (r7 != r9) goto L_0x03eb
            if (r13 != r1) goto L_0x03eb
            r1 = 1
            r15.A = r1
            r1 = -1
            if (r8 != r1) goto L_0x03de
            float r11 = r11 / r5
            r15.B = r11
        L_0x03de:
            float r1 = r15.B
            float r2 = (float) r3
            float r1 = r1 * r2
            int r8 = (int) r1
            if (r4 == r9) goto L_0x03e8
            r4 = r24
            goto L_0x03ff
        L_0x03e8:
            r4 = r24
            goto L_0x03ef
        L_0x03eb:
            r4 = r24
        L_0x03ed:
            r8 = r34
        L_0x03ef:
            r40 = r8
            r42 = r12
            r41 = r13
            r34 = 1
            goto L_0x0407
        L_0x03f8:
            r39 = r11
        L_0x03fa:
            r4 = r24
        L_0x03fc:
            r0 = r13
            r8 = r34
        L_0x03ff:
            r41 = r0
            r40 = r8
            r42 = r12
            r34 = 0
        L_0x0407:
            int[] r0 = r15.f8185t
            r1 = 0
            r0[r1] = r42
            r1 = 1
            r0[r1] = r41
            if (r34 == 0) goto L_0x041b
            int r0 = r15.A
            r1 = -1
            if (r0 == 0) goto L_0x0418
            if (r0 != r1) goto L_0x041c
        L_0x0418:
            r38 = 1
            goto L_0x041e
        L_0x041b:
            r1 = -1
        L_0x041c:
            r38 = 0
        L_0x041e:
            if (r34 == 0) goto L_0x042b
            int r0 = r15.A
            r2 = 1
            if (r0 == r2) goto L_0x0427
            if (r0 != r1) goto L_0x042b
        L_0x0427:
            r0 = 0
            r43 = 1
            goto L_0x042e
        L_0x042b:
            r0 = 0
            r43 = 0
        L_0x042e:
            r1 = r39[r0]
            q.e$b r14 = q.e.b.WRAP_CONTENT
            if (r1 != r14) goto L_0x043a
            boolean r0 = r15 instanceof q.f
            if (r0 == 0) goto L_0x043a
            r11 = 1
            goto L_0x043b
        L_0x043a:
            r11 = 0
        L_0x043b:
            if (r11 == 0) goto L_0x043f
            r13 = 0
            goto L_0x0440
        L_0x043f:
            r13 = r4
        L_0x0440:
            q.d r12 = r15.Q
            boolean r0 = r12.f()
            r1 = 1
            r44 = r0 ^ 1
            r0 = 0
            boolean r45 = r22[r0]
            boolean r46 = r22[r1]
            int r0 = r15.f8177o
            int[] r8 = r15.C
            r47 = 0
            r6 = 2
            if (r0 == r6) goto L_0x056e
            boolean r0 = r15.f8170k
            if (r0 != 0) goto L_0x056e
            if (r63 == 0) goto L_0x04c3
            r.l r0 = r15.d
            if (r0 == 0) goto L_0x04c3
            r.f r1 = r0.f8326h
            boolean r2 = r1.f8305j
            if (r2 == 0) goto L_0x04c3
            r.f r0 = r0.f8327i
            boolean r0 = r0.f8305j
            if (r0 != 0) goto L_0x046e
            goto L_0x04c3
        L_0x046e:
            if (r63 == 0) goto L_0x04bf
            int r0 = r1.f8302g
            r7 = r62
            r5 = r37
            r7.d(r5, r0)
            r.l r0 = r15.d
            r.f r0 = r0.f8327i
            int r0 = r0.f8302g
            r4 = r36
            r7.d(r4, r0)
            q.e r0 = r15.V
            if (r0 == 0) goto L_0x04a3
            if (r29 == 0) goto L_0x04a3
            r0 = 0
            boolean r1 = r35[r0]
            if (r1 == 0) goto L_0x04a3
            boolean r1 = r61.r()
            if (r1 != 0) goto L_0x04a3
            q.e r1 = r15.V
            q.d r1 = r1.L
            o.g r1 = r7.l(r1)
            r3 = 8
            r7.f(r1, r4, r0, r3)
            goto L_0x04a5
        L_0x04a3:
            r3 = 8
        L_0x04a5:
            r36 = r5
            r57 = r9
            r59 = r10
            r49 = r12
            r60 = r14
            r55 = r23
            r58 = r27
            r56 = r32
            r54 = r33
            r32 = r39
            r39 = r4
            r33 = r8
            goto L_0x0586
        L_0x04bf:
            r7 = r62
            goto L_0x056e
        L_0x04c3:
            r7 = r62
            r4 = r36
            r5 = r37
            r3 = 8
            q.e r0 = r15.V
            if (r0 == 0) goto L_0x04d8
            q.d r0 = r0.L
            o.g r0 = r7.l(r0)
            r16 = r0
            goto L_0x04da
        L_0x04d8:
            r16 = r47
        L_0x04da:
            q.e r0 = r15.V
            if (r0 == 0) goto L_0x04e7
            q.d r0 = r0.J
            o.g r0 = r7.l(r0)
            r17 = r0
            goto L_0x04e9
        L_0x04e7:
            r17 = r47
        L_0x04e9:
            r18 = 0
            boolean r20 = r35[r18]
            r22 = r39[r18]
            q.d r1 = r15.J
            q.d r0 = r15.L
            int r2 = r15.f8152a0
            r36 = r2
            int r2 = r15.f8157d0
            r37 = r8[r18]
            r48 = r2
            float r2 = r15.f8161f0
            r19 = 1
            r3 = r39[r19]
            if (r3 != r9) goto L_0x0508
            r50 = r19
            goto L_0x050a
        L_0x0508:
            r50 = r18
        L_0x050a:
            int r3 = r15.u
            r24 = r3
            int r3 = r15.f8186v
            r25 = r3
            float r3 = r15.w
            r26 = r3
            r3 = 1
            r51 = r2
            r2 = r3
            r52 = r0
            r0 = r61
            r53 = r1
            r1 = r62
            r49 = 8
            r3 = r29
            r18 = r4
            r4 = r28
            r19 = r5
            r5 = r20
            r6 = r17
            r54 = r33
            r7 = r16
            r33 = r8
            r55 = r23
            r8 = r22
            r57 = r9
            r56 = r32
            r9 = r11
            r11 = r10
            r10 = r53
            r59 = r11
            r58 = r27
            r32 = r39
            r11 = r52
            r49 = r12
            r39 = r18
            r12 = r36
            r36 = r19
            r60 = r14
            r14 = r48
            r15 = r37
            r16 = r51
            r17 = r38
            r18 = r50
            r19 = r31
            r20 = r30
            r21 = r45
            r22 = r42
            r23 = r41
            r27 = r44
            r0.d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0586
        L_0x056e:
            r57 = r9
            r59 = r10
            r49 = r12
            r60 = r14
            r55 = r23
            r58 = r27
            r56 = r32
            r54 = r33
            r32 = r39
            r33 = r8
            r39 = r36
            r36 = r37
        L_0x0586:
            if (r63 == 0) goto L_0x05ea
            r15 = r61
            r.n r0 = r15.f8158e
            if (r0 == 0) goto L_0x05dd
            r.f r1 = r0.f8326h
            boolean r2 = r1.f8305j
            if (r2 == 0) goto L_0x05dd
            r.f r0 = r0.f8327i
            boolean r0 = r0.f8305j
            if (r0 == 0) goto L_0x05dd
            int r0 = r1.f8302g
            r14 = r62
            r13 = r58
            r14.d(r13, r0)
            r.n r0 = r15.f8158e
            r.f r0 = r0.f8327i
            int r0 = r0.f8302g
            r12 = r56
            r14.d(r12, r0)
            r.n r0 = r15.f8158e
            r.f r0 = r0.f8313k
            int r0 = r0.f8302g
            r1 = r54
            r14.d(r1, r0)
            q.e r0 = r15.V
            if (r0 == 0) goto L_0x05d7
            if (r30 != 0) goto L_0x05d7
            if (r28 == 0) goto L_0x05d7
            r11 = 1
            boolean r2 = r35[r11]
            if (r2 == 0) goto L_0x05d3
            q.d r0 = r0.M
            o.g r0 = r14.l(r0)
            r2 = 8
            r10 = 0
            r14.f(r0, r12, r10, r2)
            goto L_0x05db
        L_0x05d3:
            r2 = 8
            r10 = 0
            goto L_0x05db
        L_0x05d7:
            r2 = 8
            r10 = 0
            r11 = 1
        L_0x05db:
            r5 = r10
            goto L_0x05f9
        L_0x05dd:
            r14 = r62
            r1 = r54
            r12 = r56
            r13 = r58
            r2 = 8
            r10 = 0
            r11 = 1
            goto L_0x05f8
        L_0x05ea:
            r2 = 8
            r10 = 0
            r11 = 1
            r15 = r61
            r14 = r62
            r1 = r54
            r12 = r56
            r13 = r58
        L_0x05f8:
            r5 = r11
        L_0x05f9:
            int r0 = r15.f8179p
            r3 = 2
            if (r0 != r3) goto L_0x0600
            r4 = r10
            goto L_0x0601
        L_0x0600:
            r4 = r5
        L_0x0601:
            if (r4 == 0) goto L_0x06c5
            boolean r0 = r15.l
            if (r0 != 0) goto L_0x06c5
            r0 = r32[r11]
            r3 = r60
            if (r0 != r3) goto L_0x0613
            boolean r0 = r15 instanceof q.f
            if (r0 == 0) goto L_0x0613
            r9 = r11
            goto L_0x0614
        L_0x0613:
            r9 = r10
        L_0x0614:
            if (r9 == 0) goto L_0x0618
            r40 = r10
        L_0x0618:
            q.e r0 = r15.V
            if (r0 == 0) goto L_0x0624
            q.d r0 = r0.M
            o.g r0 = r14.l(r0)
            r7 = r0
            goto L_0x0626
        L_0x0624:
            r7 = r47
        L_0x0626:
            q.e r0 = r15.V
            if (r0 == 0) goto L_0x0632
            q.d r0 = r0.K
            o.g r0 = r14.l(r0)
            r6 = r0
            goto L_0x0634
        L_0x0632:
            r6 = r47
        L_0x0634:
            int r0 = r15.f8156c0
            if (r0 > 0) goto L_0x063c
            int r3 = r15.f8167i0
            if (r3 != r2) goto L_0x066c
        L_0x063c:
            r3 = r55
            q.d r4 = r3.f8146f
            if (r4 == 0) goto L_0x0661
            r14.e(r1, r13, r0, r2)
            q.d r0 = r3.f8146f
            o.g r0 = r14.l(r0)
            int r3 = r3.d()
            r14.e(r1, r0, r3, r2)
            if (r28 == 0) goto L_0x065e
            r0 = r59
            o.g r0 = r14.l(r0)
            r1 = 5
            r14.f(r7, r0, r10, r1)
        L_0x065e:
            r27 = r10
            goto L_0x066e
        L_0x0661:
            int r4 = r15.f8167i0
            if (r4 != r2) goto L_0x0669
            int r0 = r3.d()
        L_0x0669:
            r14.e(r1, r13, r0, r2)
        L_0x066c:
            r27 = r44
        L_0x066e:
            boolean r5 = r35[r11]
            r8 = r32[r11]
            q.d r4 = r15.K
            q.d r3 = r15.M
            int r1 = r15.f8154b0
            int r0 = r15.f8159e0
            r16 = r33[r11]
            float r2 = r15.f8163g0
            r11 = r32[r10]
            r10 = r57
            if (r11 != r10) goto L_0x0687
            r18 = 1
            goto L_0x0689
        L_0x0687:
            r18 = 0
        L_0x0689:
            int r10 = r15.f8187x
            r24 = r10
            int r10 = r15.f8188y
            r25 = r10
            float r10 = r15.z
            r26 = r10
            r10 = 0
            r17 = r2
            r2 = r10
            r19 = r0
            r0 = r61
            r20 = r1
            r1 = r62
            r11 = r3
            r3 = r28
            r10 = r4
            r4 = r29
            r28 = r12
            r12 = r20
            r29 = r13
            r13 = r40
            r14 = r19
            r15 = r16
            r16 = r17
            r17 = r43
            r19 = r30
            r20 = r31
            r21 = r46
            r22 = r41
            r23 = r42
            r0.d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x06c9
        L_0x06c5:
            r28 = r12
            r29 = r13
        L_0x06c9:
            r6 = r61
            if (r34 == 0) goto L_0x06ea
            int r0 = r6.A
            float r5 = r6.B
            r1 = 1
            if (r0 != r1) goto L_0x06dd
            r1 = r28
            r2 = r29
            r4 = r36
            r3 = r39
            goto L_0x06e5
        L_0x06dd:
            r3 = r28
            r4 = r29
            r2 = r36
            r1 = r39
        L_0x06e5:
            r0 = r62
            r0.h(r1, r2, r3, r4, r5)
        L_0x06ea:
            boolean r0 = r49.f()
            if (r0 == 0) goto L_0x07a8
            r0 = r49
            q.d r1 = r0.f8146f
            q.e r1 = r1.d
            float r2 = r6.D
            r3 = 1119092736(0x42b40000, float:90.0)
            float r2 = r2 + r3
            double r2 = (double) r2
            double r2 = java.lang.Math.toRadians(r2)
            float r2 = (float) r2
            int r0 = r0.d()
            q.d$b r3 = q.d.b.LEFT
            q.d r4 = r6.g(r3)
            r5 = r62
            o.g r4 = r5.l(r4)
            q.d$b r7 = q.d.b.TOP
            q.d r8 = r6.g(r7)
            o.g r8 = r5.l(r8)
            q.d$b r9 = q.d.b.RIGHT
            q.d r10 = r6.g(r9)
            o.g r10 = r5.l(r10)
            q.d$b r11 = q.d.b.BOTTOM
            q.d r12 = r6.g(r11)
            o.g r12 = r5.l(r12)
            q.d r3 = r1.g(r3)
            o.g r3 = r5.l(r3)
            q.d r7 = r1.g(r7)
            o.g r7 = r5.l(r7)
            q.d r9 = r1.g(r9)
            o.g r9 = r5.l(r9)
            q.d r1 = r1.g(r11)
            o.g r1 = r5.l(r1)
            o.b r11 = r62.m()
            double r13 = (double) r2
            double r15 = java.lang.Math.sin(r13)
            r2 = r9
            r63 = r10
            double r9 = (double) r0
            r17 = r2
            r0 = r3
            double r2 = r15 * r9
            float r2 = (float) r2
            o.b$a r3 = r11.d
            r15 = 1056964608(0x3f000000, float:0.5)
            r3.c(r7, r15)
            o.b$a r3 = r11.d
            r3.c(r1, r15)
            o.b$a r1 = r11.d
            r3 = -1090519040(0xffffffffbf000000, float:-0.5)
            r1.c(r8, r3)
            o.b$a r1 = r11.d
            r1.c(r12, r3)
            float r1 = -r2
            r11.f7532b = r1
            r5.c(r11)
            o.b r1 = r62.m()
            double r7 = java.lang.Math.cos(r13)
            double r7 = r7 * r9
            float r2 = (float) r7
            o.b$a r7 = r1.d
            r7.c(r0, r15)
            o.b$a r0 = r1.d
            r7 = r17
            r0.c(r7, r15)
            o.b$a r0 = r1.d
            r0.c(r4, r3)
            o.b$a r0 = r1.d
            r4 = r63
            r0.c(r4, r3)
            float r0 = -r2
            r1.f7532b = r0
            r5.c(r1)
        L_0x07a8:
            r0 = 0
            r6.f8170k = r0
            r6.l = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.e.b(o.d, boolean):void");
    }

    public boolean c() {
        return this.f8167i0 != 8;
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x01ab A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x036d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x03de  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x03f3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0415  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0419 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0435 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0484  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0497 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x04c1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x04e4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:353:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:357:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(o.d r29, boolean r30, boolean r31, boolean r32, boolean r33, o.g r34, o.g r35, q.e.b r36, boolean r37, q.d r38, q.d r39, int r40, int r41, int r42, int r43, float r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49, int r50, int r51, int r52, int r53, float r54, boolean r55) {
        /*
            r28 = this;
            r0 = r28
            r10 = r29
            r11 = r34
            r12 = r35
            r13 = r38
            r14 = r39
            r15 = r42
            r1 = r43
            r2 = r51
            r3 = r52
            r4 = r53
            r5 = r54
            o.g r9 = r10.l(r13)
            o.g r8 = r10.l(r14)
            q.d r6 = r13.f8146f
            o.g r7 = r10.l(r6)
            q.d r6 = r14.f8146f
            o.g r6 = r10.l(r6)
            boolean r16 = r38.f()
            boolean r17 = r39.f()
            q.d r12 = r0.Q
            boolean r12 = r12.f()
            if (r17 == 0) goto L_0x003f
            int r18 = r16 + 1
            goto L_0x0041
        L_0x003f:
            r18 = r16
        L_0x0041:
            if (r12 == 0) goto L_0x0045
            int r18 = r18 + 1
        L_0x0045:
            r2 = r18
            if (r45 == 0) goto L_0x004c
            r19 = 3
            goto L_0x004e
        L_0x004c:
            r19 = r50
        L_0x004e:
            int[] r18 = q.e.a.f8190b
            int r20 = r36.ordinal()
            r14 = r18[r20]
            r11 = 1
            if (r14 == r11) goto L_0x006a
            r11 = 2
            if (r14 == r11) goto L_0x006a
            r11 = 3
            if (r14 == r11) goto L_0x006a
            r11 = 4
            if (r14 == r11) goto L_0x0063
            goto L_0x006a
        L_0x0063:
            r14 = r19
            if (r14 == r11) goto L_0x006c
            r19 = 1
            goto L_0x006e
        L_0x006a:
            r14 = r19
        L_0x006c:
            r19 = 0
        L_0x006e:
            int r11 = r0.f8166i
            r22 = r6
            r6 = -1
            if (r11 == r6) goto L_0x007d
            if (r30 == 0) goto L_0x007d
            r0.f8166i = r6
            r41 = r11
            r19 = 0
        L_0x007d:
            int r11 = r0.f8168j
            if (r11 == r6) goto L_0x0088
            if (r30 != 0) goto L_0x0088
            r0.f8168j = r6
            r19 = 0
            goto L_0x008a
        L_0x0088:
            r11 = r41
        L_0x008a:
            int r6 = r0.f8167i0
            r41 = r11
            r11 = 8
            if (r6 != r11) goto L_0x0096
            r6 = 0
            r19 = 0
            goto L_0x0098
        L_0x0096:
            r6 = r41
        L_0x0098:
            if (r55 == 0) goto L_0x00bb
            if (r16 != 0) goto L_0x00a6
            if (r17 != 0) goto L_0x00a6
            if (r12 != 0) goto L_0x00a6
            r11 = r40
            r10.d(r9, r11)
            goto L_0x00b6
        L_0x00a6:
            if (r16 == 0) goto L_0x00b6
            if (r17 != 0) goto L_0x00b6
            int r11 = r38.d()
            r24 = r12
            r12 = 8
            r10.e(r9, r7, r11, r12)
            goto L_0x00be
        L_0x00b6:
            r24 = r12
            r12 = 8
            goto L_0x00be
        L_0x00bb:
            r24 = r12
            r12 = r11
        L_0x00be:
            if (r19 != 0) goto L_0x00df
            r5 = 3
            if (r37 == 0) goto L_0x00d5
            r11 = 0
            r10.e(r8, r9, r11, r5)
            if (r15 <= 0) goto L_0x00cc
            r10.f(r8, r9, r15, r12)
        L_0x00cc:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r6) goto L_0x00d8
            r10.g(r8, r9, r1, r12)
            goto L_0x00d8
        L_0x00d5:
            r10.e(r8, r9, r6, r12)
        L_0x00d8:
            r11 = r33
            r25 = r2
        L_0x00dc:
            r12 = r3
            goto L_0x01a9
        L_0x00df:
            r1 = 3
            r11 = 2
            if (r2 == r11) goto L_0x0102
            if (r45 != 0) goto L_0x0102
            r11 = 1
            if (r14 == r11) goto L_0x00ea
            if (r14 != 0) goto L_0x0102
        L_0x00ea:
            int r5 = java.lang.Math.max(r3, r6)
            if (r4 <= 0) goto L_0x00f4
            int r5 = java.lang.Math.min(r4, r5)
        L_0x00f4:
            r6 = 8
            r10.e(r8, r9, r5, r6)
            r11 = r33
            r25 = r2
            r12 = r3
            r19 = 0
            goto L_0x01a9
        L_0x0102:
            r11 = -2
            if (r3 != r11) goto L_0x0106
            r3 = r6
        L_0x0106:
            if (r4 != r11) goto L_0x0109
            r4 = r6
        L_0x0109:
            if (r6 <= 0) goto L_0x010f
            r11 = 1
            if (r14 == r11) goto L_0x010f
            r6 = 0
        L_0x010f:
            if (r3 <= 0) goto L_0x011a
            r11 = 8
            r10.f(r8, r9, r3, r11)
            int r6 = java.lang.Math.max(r6, r3)
        L_0x011a:
            if (r4 <= 0) goto L_0x0133
            if (r31 == 0) goto L_0x0123
            r11 = 1
            if (r14 != r11) goto L_0x0123
            r11 = 0
            goto L_0x0124
        L_0x0123:
            r11 = 1
        L_0x0124:
            if (r11 == 0) goto L_0x012c
            r11 = 8
            r10.g(r8, r9, r4, r11)
            goto L_0x012e
        L_0x012c:
            r11 = 8
        L_0x012e:
            int r6 = java.lang.Math.min(r6, r4)
            goto L_0x0135
        L_0x0133:
            r11 = 8
        L_0x0135:
            r12 = 1
            if (r14 != r12) goto L_0x0146
            if (r31 == 0) goto L_0x013e
            r10.e(r8, r9, r6, r11)
            goto L_0x00d8
        L_0x013e:
            r5 = 5
            r10.e(r8, r9, r6, r5)
            r10.g(r8, r9, r6, r11)
            goto L_0x00d8
        L_0x0146:
            r6 = 2
            if (r14 != r6) goto L_0x01a5
            q.d$b r11 = q.d.b.TOP
            q.d$b r12 = r13.f8145e
            if (r12 == r11) goto L_0x0165
            q.d$b r1 = q.d.b.BOTTOM
            if (r12 != r1) goto L_0x0154
            goto L_0x0165
        L_0x0154:
            q.e r1 = r0.V
            q.d$b r11 = q.d.b.LEFT
            q.d r1 = r1.g(r11)
            o.g r1 = r10.l(r1)
            q.e r11 = r0.V
            q.d$b r12 = q.d.b.RIGHT
            goto L_0x0173
        L_0x0165:
            q.e r1 = r0.V
            q.d r1 = r1.g(r11)
            o.g r1 = r10.l(r1)
            q.e r11 = r0.V
            q.d$b r12 = q.d.b.BOTTOM
        L_0x0173:
            q.d r11 = r11.g(r12)
            o.g r11 = r10.l(r11)
            o.b r12 = r29.m()
            o.b$a r6 = r12.d
            r25 = r2
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6.c(r8, r2)
            o.b$a r2 = r12.d
            r6 = 1065353216(0x3f800000, float:1.0)
            r2.c(r9, r6)
            o.b$a r2 = r12.d
            r2.c(r11, r5)
            o.b$a r2 = r12.d
            float r5 = -r5
            r2.c(r1, r5)
            r10.c(r12)
            if (r31 == 0) goto L_0x01a1
            r19 = 0
        L_0x01a1:
            r11 = r33
            goto L_0x00dc
        L_0x01a5:
            r25 = r2
            r12 = r3
            r11 = 1
        L_0x01a9:
            if (r55 == 0) goto L_0x04d7
            if (r47 == 0) goto L_0x01af
            goto L_0x04d7
        L_0x01af:
            if (r16 != 0) goto L_0x01bf
            if (r17 != 0) goto L_0x01bf
            if (r24 != 0) goto L_0x01bf
            r14 = r39
            r5 = r8
            r33 = r11
            r2 = r22
        L_0x01bc:
            r3 = 5
            goto L_0x04bc
        L_0x01bf:
            if (r16 == 0) goto L_0x01dd
            if (r17 != 0) goto L_0x01dd
            q.d r1 = r13.f8146f
            q.e r1 = r1.d
            if (r31 == 0) goto L_0x01d0
            boolean r1 = r1 instanceof q.a
            if (r1 == 0) goto L_0x01d0
            r1 = 8
            goto L_0x01d1
        L_0x01d0:
            r1 = 5
        L_0x01d1:
            r14 = r39
            r5 = r8
            r33 = r11
            r2 = r22
            r11 = r1
            r1 = r31
            goto L_0x04bf
        L_0x01dd:
            if (r16 != 0) goto L_0x01ff
            if (r17 == 0) goto L_0x01ff
            int r1 = r39.d()
            int r1 = -r1
            r6 = r22
            r2 = 8
            r10.e(r8, r6, r1, r2)
            if (r31 == 0) goto L_0x04b4
            r5 = r34
            r1 = 5
            r2 = 0
            r10.f(r9, r5, r2, r1)
            r14 = r39
            r3 = r1
            r2 = r6
            r5 = r8
            r33 = r11
            goto L_0x04bc
        L_0x01ff:
            r5 = r34
            r6 = r22
            r1 = 2
            if (r16 == 0) goto L_0x04b4
            if (r17 == 0) goto L_0x04b4
            q.d r2 = r13.f8146f
            q.e r3 = r2.d
            r2 = r39
            q.d r1 = r2.f8146f
            q.e r1 = r1.d
            q.e r13 = r0.V
            r16 = 6
            if (r19 == 0) goto L_0x031c
            if (r14 != 0) goto L_0x0270
            if (r4 != 0) goto L_0x0243
            if (r12 != 0) goto L_0x0243
            boolean r4 = r7.f7566t
            if (r4 == 0) goto L_0x0238
            boolean r4 = r6.f7566t
            if (r4 == 0) goto L_0x0238
            int r1 = r38.d()
            r3 = 8
            r10.e(r9, r7, r1, r3)
            int r1 = r39.d()
            int r1 = -r1
            r10.e(r8, r6, r1, r3)
            return
        L_0x0238:
            r30 = 8
            r17 = 8
            r21 = 0
            r22 = 1
            r23 = 0
            goto L_0x024d
        L_0x0243:
            r30 = 5
            r17 = 5
            r21 = 1
            r22 = 0
            r23 = 1
        L_0x024d:
            boolean r4 = r3 instanceof q.a
            if (r4 != 0) goto L_0x0263
            boolean r4 = r1 instanceof q.a
            if (r4 == 0) goto L_0x0256
            goto L_0x0263
        L_0x0256:
            r4 = r16
            r15 = r17
            r24 = r22
            r17 = r14
            r22 = r21
            r21 = r30
            goto L_0x029b
        L_0x0263:
            r4 = r16
            r15 = r17
            r24 = r22
            r17 = r14
            r22 = r21
            r21 = 4
            goto L_0x029b
        L_0x0270:
            r15 = 2
            if (r14 != r15) goto L_0x028a
            boolean r4 = r3 instanceof q.a
            if (r4 != 0) goto L_0x0284
            boolean r4 = r1 instanceof q.a
            if (r4 == 0) goto L_0x027c
            goto L_0x0284
        L_0x027c:
            r17 = r14
            r4 = r16
            r15 = 5
            r21 = 5
            goto L_0x0295
        L_0x0284:
            r17 = r14
            r4 = r16
            r15 = 5
            goto L_0x0293
        L_0x028a:
            r15 = 1
            if (r14 != r15) goto L_0x029f
            r17 = r14
            r4 = r16
            r15 = 8
        L_0x0293:
            r21 = 4
        L_0x0295:
            r22 = 1
            r23 = 1
            r24 = 0
        L_0x029b:
            r14 = r35
            goto L_0x036b
        L_0x029f:
            r15 = 3
            if (r14 != r15) goto L_0x030e
            int r15 = r0.A
            r17 = r14
            r14 = -1
            if (r15 != r14) goto L_0x02c1
            r14 = r35
            if (r48 == 0) goto L_0x02b3
            if (r31 == 0) goto L_0x02b1
            r4 = 5
            goto L_0x02b5
        L_0x02b1:
            r4 = 4
            goto L_0x02b5
        L_0x02b3:
            r4 = 8
        L_0x02b5:
            r15 = 8
        L_0x02b7:
            r21 = 5
        L_0x02b9:
            r22 = 1
            r23 = 1
            r24 = 1
            goto L_0x036b
        L_0x02c1:
            if (r45 == 0) goto L_0x02e3
            r14 = r51
            r15 = 2
            if (r14 == r15) goto L_0x02ce
            r4 = 1
            if (r14 != r4) goto L_0x02cc
            goto L_0x02ce
        L_0x02cc:
            r4 = 0
            goto L_0x02cf
        L_0x02ce:
            r4 = 1
        L_0x02cf:
            if (r4 != 0) goto L_0x02d5
            r4 = 8
            r14 = 5
            goto L_0x02d7
        L_0x02d5:
            r4 = 5
            r14 = 4
        L_0x02d7:
            r15 = r4
            r21 = r14
            r4 = r16
            r22 = 1
            r23 = 1
            r24 = 1
            goto L_0x029b
        L_0x02e3:
            if (r4 <= 0) goto L_0x02eb
            r14 = r35
            r4 = r16
            r15 = 5
            goto L_0x02b7
        L_0x02eb:
            if (r4 != 0) goto L_0x0306
            if (r12 != 0) goto L_0x0306
            if (r48 != 0) goto L_0x02f9
            r14 = r35
            r4 = r16
            r15 = 5
            r21 = 8
            goto L_0x02b9
        L_0x02f9:
            if (r3 == r13) goto L_0x02ff
            if (r1 == r13) goto L_0x02ff
            r4 = 4
            goto L_0x0300
        L_0x02ff:
            r4 = 5
        L_0x0300:
            r14 = r35
            r15 = r4
            r4 = r16
            goto L_0x030b
        L_0x0306:
            r14 = r35
            r4 = r16
            r15 = 5
        L_0x030b:
            r21 = 4
            goto L_0x02b9
        L_0x030e:
            r17 = r14
            r14 = r35
            r4 = r16
            r15 = 5
            r21 = 4
            r22 = 0
            r23 = 0
            goto L_0x0369
        L_0x031c:
            r17 = r14
            boolean r4 = r7.f7566t
            if (r4 == 0) goto L_0x035e
            boolean r4 = r6.f7566t
            if (r4 == 0) goto L_0x035e
            int r1 = r38.d()
            int r3 = r39.d()
            r4 = 8
            r45 = r29
            r46 = r9
            r47 = r7
            r48 = r1
            r49 = r44
            r50 = r6
            r51 = r8
            r52 = r3
            r53 = r4
            r45.b(r46, r47, r48, r49, r50, r51, r52, r53)
            if (r31 == 0) goto L_0x035d
            if (r11 == 0) goto L_0x035d
            q.d r1 = r2.f8146f
            if (r1 == 0) goto L_0x0354
            int r11 = r39.d()
            r14 = r35
            goto L_0x0357
        L_0x0354:
            r14 = r35
            r11 = 0
        L_0x0357:
            if (r6 == r14) goto L_0x035d
            r1 = 5
            r10.f(r14, r8, r11, r1)
        L_0x035d:
            return
        L_0x035e:
            r14 = r35
            r4 = r16
            r15 = 5
            r21 = 4
            r22 = 1
            r23 = 1
        L_0x0369:
            r24 = 0
        L_0x036b:
            if (r23 == 0) goto L_0x0376
            if (r7 != r6) goto L_0x0376
            if (r3 == r13) goto L_0x0376
            r23 = 0
            r25 = 0
            goto L_0x037a
        L_0x0376:
            r25 = r23
            r23 = 1
        L_0x037a:
            if (r22 == 0) goto L_0x03c6
            if (r19 != 0) goto L_0x038e
            if (r46 != 0) goto L_0x038e
            if (r48 != 0) goto L_0x038e
            if (r7 != r5) goto L_0x038e
            if (r6 != r14) goto L_0x038e
            r15 = 0
            r22 = 8
            r23 = 8
            r26 = 0
            goto L_0x0396
        L_0x038e:
            r22 = r15
            r26 = r23
            r15 = r31
            r23 = r4
        L_0x0396:
            int r4 = r38.d()
            int r27 = r39.d()
            r30 = r15
            r15 = r1
            r1 = r29
            r14 = r2
            r2 = r9
            r33 = r11
            r11 = r3
            r3 = r7
            r36 = r12
            r12 = r5
            r5 = r44
            r37 = r6
            r12 = r7
            r7 = r8
            r43 = r13
            r13 = r8
            r8 = r27
            r27 = r13
            r13 = r9
            r9 = r23
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = r30
            r4 = r22
            r23 = r26
            goto L_0x03d8
        L_0x03c6:
            r14 = r2
            r37 = r6
            r27 = r8
            r33 = r11
            r36 = r12
            r43 = r13
            r4 = r15
            r15 = r1
            r11 = r3
            r12 = r7
            r13 = r9
            r1 = r31
        L_0x03d8:
            int r2 = r0.f8167i0
            r3 = 8
            if (r2 != r3) goto L_0x03ef
            java.util.HashSet<q.d> r2 = r14.f8142a
            if (r2 != 0) goto L_0x03e3
            goto L_0x03eb
        L_0x03e3:
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x03eb
            r2 = 1
            goto L_0x03ec
        L_0x03eb:
            r2 = 0
        L_0x03ec:
            if (r2 != 0) goto L_0x03ef
            return
        L_0x03ef:
            r2 = r37
            if (r25 == 0) goto L_0x0415
            if (r1 == 0) goto L_0x0403
            if (r12 == r2) goto L_0x0403
            if (r19 != 0) goto L_0x0403
            boolean r3 = r11 instanceof q.a
            if (r3 != 0) goto L_0x0401
            boolean r3 = r15 instanceof q.a
            if (r3 == 0) goto L_0x0403
        L_0x0401:
            r4 = r16
        L_0x0403:
            int r3 = r38.d()
            r10.f(r13, r12, r3, r4)
            int r3 = r39.d()
            int r3 = -r3
            r5 = r27
            r10.g(r5, r2, r3, r4)
            goto L_0x0417
        L_0x0415:
            r5 = r27
        L_0x0417:
            if (r1 == 0) goto L_0x042d
            if (r49 == 0) goto L_0x042d
            boolean r3 = r11 instanceof q.a
            if (r3 != 0) goto L_0x042d
            boolean r3 = r15 instanceof q.a
            if (r3 != 0) goto L_0x042d
            r3 = r43
            if (r15 == r3) goto L_0x042f
            r4 = r16
            r6 = r4
            r20 = 1
            goto L_0x0433
        L_0x042d:
            r3 = r43
        L_0x042f:
            r6 = r21
            r20 = r23
        L_0x0433:
            if (r20 == 0) goto L_0x0482
            if (r24 == 0) goto L_0x0460
            if (r48 == 0) goto L_0x043b
            if (r32 == 0) goto L_0x0460
        L_0x043b:
            if (r11 == r3) goto L_0x0442
            if (r15 != r3) goto L_0x0440
            goto L_0x0442
        L_0x0440:
            r16 = r6
        L_0x0442:
            boolean r7 = r11 instanceof q.g
            if (r7 != 0) goto L_0x044a
            boolean r7 = r15 instanceof q.g
            if (r7 == 0) goto L_0x044c
        L_0x044a:
            r16 = 5
        L_0x044c:
            boolean r7 = r11 instanceof q.a
            if (r7 != 0) goto L_0x0454
            boolean r7 = r15 instanceof q.a
            if (r7 == 0) goto L_0x0456
        L_0x0454:
            r16 = 5
        L_0x0456:
            if (r48 == 0) goto L_0x045a
            r7 = 5
            goto L_0x045c
        L_0x045a:
            r7 = r16
        L_0x045c:
            int r6 = java.lang.Math.max(r7, r6)
        L_0x0460:
            if (r1 == 0) goto L_0x0472
            int r4 = java.lang.Math.min(r4, r6)
            if (r45 == 0) goto L_0x0470
            if (r48 != 0) goto L_0x0470
            if (r11 == r3) goto L_0x046e
            if (r15 != r3) goto L_0x0470
        L_0x046e:
            r11 = 4
            goto L_0x0473
        L_0x0470:
            r11 = r4
            goto L_0x0473
        L_0x0472:
            r11 = r6
        L_0x0473:
            int r3 = r38.d()
            r10.e(r13, r12, r3, r11)
            int r3 = r39.d()
            int r3 = -r3
            r10.e(r5, r2, r3, r11)
        L_0x0482:
            if (r1 == 0) goto L_0x0495
            r3 = r34
            r4 = r12
            if (r3 != r4) goto L_0x048e
            int r6 = r38.d()
            goto L_0x048f
        L_0x048e:
            r6 = 0
        L_0x048f:
            if (r4 == r3) goto L_0x0495
            r4 = 5
            r10.f(r13, r3, r6, r4)
        L_0x0495:
            if (r1 == 0) goto L_0x04b2
            if (r19 == 0) goto L_0x04b2
            if (r42 != 0) goto L_0x04b2
            if (r36 != 0) goto L_0x04b2
            if (r19 == 0) goto L_0x04ac
            r3 = r17
            r4 = 3
            if (r3 != r4) goto L_0x04ac
            r3 = 8
            r4 = 0
            r10.f(r5, r13, r4, r3)
            r11 = 5
            goto L_0x04bf
        L_0x04ac:
            r4 = 0
            r3 = 5
            r10.f(r5, r13, r4, r3)
            goto L_0x04be
        L_0x04b2:
            r3 = 5
            goto L_0x04be
        L_0x04b4:
            r14 = r39
            r2 = r6
            r5 = r8
            r33 = r11
            goto L_0x01bc
        L_0x04bc:
            r1 = r31
        L_0x04be:
            r11 = r3
        L_0x04bf:
            if (r1 == 0) goto L_0x04d6
            if (r33 == 0) goto L_0x04d6
            q.d r1 = r14.f8146f
            if (r1 == 0) goto L_0x04ce
            int r1 = r39.d()
            r4 = r35
            goto L_0x04d1
        L_0x04ce:
            r4 = r35
            r1 = 0
        L_0x04d1:
            if (r2 == r4) goto L_0x04d6
            r10.f(r4, r5, r1, r11)
        L_0x04d6:
            return
        L_0x04d7:
            r3 = r34
            r4 = r35
            r5 = r8
            r13 = r9
            r33 = r11
            r1 = r25
            r2 = 2
            if (r1 >= r2) goto L_0x0522
            if (r31 == 0) goto L_0x0522
            if (r33 == 0) goto L_0x0522
            r1 = 8
            r2 = 0
            r10.f(r13, r3, r2, r1)
            q.d r1 = r0.N
            if (r30 != 0) goto L_0x04f9
            q.d r2 = r1.f8146f
            if (r2 != 0) goto L_0x04f7
            goto L_0x04f9
        L_0x04f7:
            r11 = 0
            goto L_0x04fa
        L_0x04f9:
            r11 = 1
        L_0x04fa:
            if (r30 != 0) goto L_0x051a
            q.d r1 = r1.f8146f
            if (r1 == 0) goto L_0x051a
            q.e r1 = r1.d
            float r2 = r1.Y
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0519
            q.e$b[] r1 = r1.U
            r2 = 0
            r3 = r1[r2]
            q.e$b r2 = q.e.b.MATCH_CONSTRAINT
            if (r3 != r2) goto L_0x0519
            r3 = 1
            r1 = r1[r3]
            if (r1 != r2) goto L_0x0519
            r11 = r3
            goto L_0x051a
        L_0x0519:
            r11 = 0
        L_0x051a:
            if (r11 == 0) goto L_0x0522
            r1 = 8
            r2 = 0
            r10.f(r4, r5, r2, r1)
        L_0x0522:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.e.d(o.d, boolean, boolean, boolean, boolean, o.g, o.g, q.e$b, boolean, q.d, q.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void e(o.d dVar) {
        dVar.l(this.J);
        dVar.l(this.K);
        dVar.l(this.L);
        dVar.l(this.M);
        if (this.f8156c0 > 0) {
            dVar.l(this.N);
        }
    }

    public final void f() {
        if (this.d == null) {
            this.d = new l(this);
        }
        if (this.f8158e == null) {
            this.f8158e = new n(this);
        }
    }

    public d g(d.b bVar) {
        switch (a.f8189a[bVar.ordinal()]) {
            case 1:
                return this.J;
            case 2:
                return this.K;
            case 3:
                return this.L;
            case 4:
                return this.M;
            case 5:
                return this.N;
            case 6:
                return this.Q;
            case 7:
                return this.O;
            case 8:
                return this.P;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public final b h(int i10) {
        b[] bVarArr = this.U;
        if (i10 == 0) {
            return bVarArr[0];
        }
        if (i10 == 1) {
            return bVarArr[1];
        }
        return null;
    }

    public final int i() {
        if (this.f8167i0 == 8) {
            return 0;
        }
        return this.X;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.M;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final q.e j(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            q.d r3 = r2.L
            q.d r0 = r3.f8146f
            if (r0 == 0) goto L_0x001f
            q.d r1 = r0.f8146f
            if (r1 != r3) goto L_0x001f
            q.e r3 = r0.d
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            q.d r3 = r2.M
            q.d r0 = r3.f8146f
            if (r0 == 0) goto L_0x001f
            q.d r1 = r0.f8146f
            if (r1 != r3) goto L_0x001f
            q.e r3 = r0.d
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q.e.j(int):q.e");
    }

    public final int k() {
        if (this.f8167i0 == 8) {
            return 0;
        }
        return this.W;
    }

    public final int l() {
        e eVar = this.V;
        return (eVar == null || !(eVar instanceof f)) ? this.f8152a0 : ((f) eVar).y0 + this.f8152a0;
    }

    public final int m() {
        e eVar = this.V;
        return (eVar == null || !(eVar instanceof f)) ? this.f8154b0 : ((f) eVar).f8195z0 + this.f8154b0;
    }

    public final boolean n(int i10) {
        if (i10 == 0) {
            return (this.J.f8146f != null ? 1 : 0) + (this.L.f8146f != null ? 1 : 0) < 2;
        }
        return ((this.K.f8146f != null ? 1 : 0) + (this.M.f8146f != null ? 1 : 0)) + (this.N.f8146f != null ? 1 : 0) < 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        r2 = r5.M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r2 = r5.L;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean o(int r6, int r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            if (r6 != 0) goto L_0x0032
            q.d r6 = r5.J
            q.d r2 = r6.f8146f
            if (r2 == 0) goto L_0x0060
            boolean r2 = r2.f8144c
            if (r2 == 0) goto L_0x0060
            q.d r2 = r5.L
            q.d r3 = r2.f8146f
            if (r3 == 0) goto L_0x0060
            boolean r4 = r3.f8144c
            if (r4 == 0) goto L_0x0060
            int r3 = r3.c()
            int r2 = r2.d()
            int r3 = r3 - r2
            q.d r2 = r6.f8146f
            int r2 = r2.c()
            int r6 = r6.d()
            int r6 = r6 + r2
            int r3 = r3 - r6
            if (r3 < r7) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            return r0
        L_0x0032:
            q.d r6 = r5.K
            q.d r2 = r6.f8146f
            if (r2 == 0) goto L_0x0060
            boolean r2 = r2.f8144c
            if (r2 == 0) goto L_0x0060
            q.d r2 = r5.M
            q.d r3 = r2.f8146f
            if (r3 == 0) goto L_0x0060
            boolean r4 = r3.f8144c
            if (r4 == 0) goto L_0x0060
            int r3 = r3.c()
            int r2 = r2.d()
            int r3 = r3 - r2
            q.d r2 = r6.f8146f
            int r2 = r2.c()
            int r6 = r6.d()
            int r6 = r6 + r2
            int r3 = r3 - r6
            if (r3 < r7) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r0 = r1
        L_0x005f:
            return r0
        L_0x0060:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q.e.o(int, int):boolean");
    }

    public final void p(d.b bVar, e eVar, d.b bVar2, int i10, int i11) {
        g(bVar).a(eVar.g(bVar2), i10, i11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r4 = r0[r4 + 1];
        r0 = r4.f8146f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q(int r4) {
        /*
            r3 = this;
            int r4 = r4 * 2
            q.d[] r0 = r3.R
            r1 = r0[r4]
            q.d r2 = r1.f8146f
            if (r2 == 0) goto L_0x001b
            q.d r2 = r2.f8146f
            if (r2 == r1) goto L_0x001b
            r1 = 1
            int r4 = r4 + r1
            r4 = r0[r4]
            q.d r0 = r4.f8146f
            if (r0 == 0) goto L_0x001b
            q.d r0 = r0.f8146f
            if (r0 != r4) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q.e.q(int):boolean");
    }

    public final boolean r() {
        d dVar = this.J;
        d dVar2 = dVar.f8146f;
        if (dVar2 != null && dVar2.f8146f == dVar) {
            return true;
        }
        d dVar3 = this.L;
        d dVar4 = dVar3.f8146f;
        return dVar4 != null && dVar4.f8146f == dVar3;
    }

    public final boolean s() {
        d dVar = this.K;
        d dVar2 = dVar.f8146f;
        if (dVar2 != null && dVar2.f8146f == dVar) {
            return true;
        }
        d dVar3 = this.M;
        d dVar4 = dVar3.f8146f;
        return dVar4 != null && dVar4.f8146f == dVar3;
    }

    public final boolean t() {
        return this.f8162g && this.f8167i0 != 8;
    }

    public String toString() {
        String str = BuildConfig.FLAVOR;
        StringBuilder g10 = x0.g(str);
        if (this.f8169j0 != null) {
            str = b0.d.g(new StringBuilder("id: "), this.f8169j0, " ");
        }
        g10.append(str);
        g10.append("(");
        g10.append(this.f8152a0);
        g10.append(", ");
        g10.append(this.f8154b0);
        g10.append(") - (");
        g10.append(this.W);
        g10.append(" x ");
        g10.append(this.X);
        g10.append(")");
        return g10.toString();
    }

    public boolean u() {
        if (this.f8170k || (this.J.f8144c && this.L.f8144c)) {
            return true;
        }
        return false;
    }

    public boolean v() {
        if (this.l || (this.K.f8144c && this.M.f8144c)) {
            return true;
        }
        return false;
    }

    public void w() {
        this.J.g();
        this.K.g();
        this.L.g();
        this.M.g();
        this.N.g();
        this.O.g();
        this.P.g();
        this.Q.g();
        this.V = null;
        this.D = 0.0f;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.f8152a0 = 0;
        this.f8154b0 = 0;
        this.f8156c0 = 0;
        this.f8157d0 = 0;
        this.f8159e0 = 0;
        this.f8161f0 = 0.5f;
        this.f8163g0 = 0.5f;
        b bVar = b.FIXED;
        b[] bVarArr = this.U;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f8165h0 = null;
        this.f8167i0 = 0;
        this.f8171k0 = 0;
        this.f8172l0 = 0;
        float[] fArr = this.f8174m0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f8177o = -1;
        this.f8179p = -1;
        int[] iArr = this.C;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f8183r = 0;
        this.f8184s = 0;
        this.w = 1.0f;
        this.z = 1.0f;
        this.f8186v = Integer.MAX_VALUE;
        this.f8188y = Integer.MAX_VALUE;
        this.u = 0;
        this.f8187x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f8160f;
        zArr[0] = true;
        zArr[1] = true;
        this.G = false;
        boolean[] zArr2 = this.T;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f8162g = true;
        int[] iArr2 = this.f8185t;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f8166i = -1;
        this.f8168j = -1;
    }

    public final void x() {
        this.f8170k = false;
        this.l = false;
        this.f8173m = false;
        this.f8175n = false;
        ArrayList<d> arrayList = this.S;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = arrayList.get(i10);
            dVar.f8144c = false;
            dVar.f8143b = 0;
        }
    }

    public void y(o.c cVar) {
        this.J.h();
        this.K.h();
        this.L.h();
        this.M.h();
        this.N.h();
        this.Q.h();
        this.O.h();
        this.P.h();
    }

    public final void z(int i10, int i11) {
        if (!this.f8170k) {
            this.J.i(i10);
            this.L.i(i11);
            this.f8152a0 = i10;
            this.W = i11 - i10;
            this.f8170k = true;
        }
    }
}

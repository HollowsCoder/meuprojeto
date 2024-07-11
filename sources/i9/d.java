package i9;

import com.karumi.dexter.BuildConfig;
import java.util.concurrent.TimeUnit;
import z8.g;

public final class d {

    /* renamed from: n  reason: collision with root package name */
    public static final d f6210n;

    /* renamed from: o  reason: collision with root package name */
    public static final b f6211o = new b();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6212a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6213b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6214c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f6215e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f6216f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f6217g;

    /* renamed from: h  reason: collision with root package name */
    public final int f6218h;

    /* renamed from: i  reason: collision with root package name */
    public final int f6219i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f6220j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f6221k;
    public final boolean l;

    /* renamed from: m  reason: collision with root package name */
    public String f6222m;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f6223a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f6224b;

        /* renamed from: c  reason: collision with root package name */
        public final int f6225c = -1;
        public int d = -1;

        /* renamed from: e  reason: collision with root package name */
        public final int f6226e = -1;

        /* renamed from: f  reason: collision with root package name */
        public boolean f6227f;

        public final d a() {
            return new d(this.f6223a, this.f6224b, this.f6225c, -1, false, false, false, this.d, this.f6226e, this.f6227f, false, false, (String) null);
        }
    }

    public static final class b {
        /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static i9.d a(i9.q r27) {
            /*
                r0 = r27
                java.lang.String r1 = "headers"
                z8.g.f(r0, r1)
                java.lang.String[] r1 = r0.f6300o
                int r1 = r1.length
                r2 = 2
                int r1 = r1 / r2
                r4 = 0
                r7 = r4
                r11 = r7
                r12 = r11
                r15 = r12
                r16 = r15
                r17 = r16
                r20 = r17
                r21 = r20
                r22 = r21
                r8 = 1
                r9 = 0
                r13 = -1
                r14 = -1
                r18 = -1
                r19 = -1
            L_0x0023:
                if (r7 >= r1) goto L_0x01d5
                java.lang.String r10 = r0.h(r7)
                java.lang.String r5 = r0.k(r7)
                java.lang.String r6 = "Cache-Control"
                boolean r6 = f9.h.V(r10, r6)
                if (r6 == 0) goto L_0x003a
                if (r9 == 0) goto L_0x0038
                goto L_0x0042
            L_0x0038:
                r9 = r5
                goto L_0x0043
            L_0x003a:
                java.lang.String r6 = "Pragma"
                boolean r6 = f9.h.V(r10, r6)
                if (r6 == 0) goto L_0x01c6
            L_0x0042:
                r8 = r4
            L_0x0043:
                r6 = r4
            L_0x0044:
                int r10 = r5.length()
                if (r6 >= r10) goto L_0x01bd
                int r10 = r5.length()
                r3 = r6
            L_0x004f:
                if (r3 >= r10) goto L_0x006c
                char r0 = r5.charAt(r3)
                r24 = r1
                java.lang.String r1 = "=,;"
                int r0 = f9.l.g0(r1, r0, r4, r4, r2)
                if (r0 < 0) goto L_0x0061
                r0 = 1
                goto L_0x0062
            L_0x0061:
                r0 = r4
            L_0x0062:
                if (r0 == 0) goto L_0x0065
                goto L_0x0072
            L_0x0065:
                int r3 = r3 + 1
                r0 = r27
                r1 = r24
                goto L_0x004f
            L_0x006c:
                r24 = r1
                int r3 = r5.length()
            L_0x0072:
                java.lang.String r0 = r5.substring(r6, r3)
                java.lang.String r1 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                z8.g.e(r0, r1)
                java.lang.CharSequence r0 = f9.l.q0(r0)
                java.lang.String r0 = r0.toString()
                int r6 = r5.length()
                if (r3 == r6) goto L_0x011c
                char r6 = r5.charAt(r3)
                r10 = 44
                if (r6 == r10) goto L_0x011c
                char r6 = r5.charAt(r3)
                r10 = 59
                if (r6 != r10) goto L_0x009b
                goto L_0x011c
            L_0x009b:
                int r3 = r3 + 1
                byte[] r6 = j9.c.f6602a
                int r6 = r5.length()
            L_0x00a3:
                if (r3 >= r6) goto L_0x00b6
                char r10 = r5.charAt(r3)
                r2 = 32
                if (r10 == r2) goto L_0x00b2
                r2 = 9
                if (r10 == r2) goto L_0x00b2
                goto L_0x00ba
            L_0x00b2:
                int r3 = r3 + 1
                r2 = 2
                goto L_0x00a3
            L_0x00b6:
                int r3 = r5.length()
            L_0x00ba:
                int r2 = r5.length()
                if (r3 >= r2) goto L_0x00dd
                char r2 = r5.charAt(r3)
                r6 = 34
                if (r2 != r6) goto L_0x00dd
                int r3 = r3 + 1
                r2 = 4
                int r2 = f9.l.g0(r5, r6, r3, r4, r2)
                java.lang.String r3 = r5.substring(r3, r2)
                z8.g.e(r3, r1)
                r6 = 1
                int r2 = r2 + r6
                r6 = r2
                r26 = r9
                r9 = 2
                goto L_0x0123
            L_0x00dd:
                r6 = 1
                int r2 = r5.length()
                r10 = r3
            L_0x00e3:
                if (r10 >= r2) goto L_0x0104
                char r6 = r5.charAt(r10)
                r25 = r2
                java.lang.String r2 = ",;"
                r26 = r9
                r9 = 2
                int r2 = f9.l.g0(r2, r6, r4, r4, r9)
                if (r2 < 0) goto L_0x00f8
                r2 = 1
                goto L_0x00f9
            L_0x00f8:
                r2 = r4
            L_0x00f9:
                if (r2 == 0) goto L_0x00fc
                goto L_0x010b
            L_0x00fc:
                int r10 = r10 + 1
                r2 = r25
                r9 = r26
                r6 = 1
                goto L_0x00e3
            L_0x0104:
                r26 = r9
                r9 = 2
                int r10 = r5.length()
            L_0x010b:
                java.lang.String r2 = r5.substring(r3, r10)
                z8.g.e(r2, r1)
                java.lang.CharSequence r1 = f9.l.q0(r2)
                java.lang.String r3 = r1.toString()
                r6 = r10
                goto L_0x0123
            L_0x011c:
                r26 = r9
                r9 = r2
                int r3 = r3 + 1
                r6 = r3
                r3 = 0
            L_0x0123:
                java.lang.String r1 = "no-cache"
                boolean r1 = f9.h.V(r1, r0)
                if (r1 == 0) goto L_0x012d
                r11 = 1
                goto L_0x0183
            L_0x012d:
                java.lang.String r1 = "no-store"
                boolean r1 = f9.h.V(r1, r0)
                if (r1 == 0) goto L_0x0137
                r12 = 1
                goto L_0x0183
            L_0x0137:
                java.lang.String r1 = "max-age"
                boolean r1 = f9.h.V(r1, r0)
                if (r1 == 0) goto L_0x0146
                r1 = -1
                int r13 = j9.c.w(r3, r1)
                goto L_0x01b4
            L_0x0146:
                r1 = -1
                java.lang.String r2 = "s-maxage"
                boolean r2 = f9.h.V(r2, r0)
                if (r2 == 0) goto L_0x0154
                int r14 = j9.c.w(r3, r1)
                goto L_0x01b4
            L_0x0154:
                java.lang.String r1 = "private"
                boolean r1 = f9.h.V(r1, r0)
                if (r1 == 0) goto L_0x015e
                r15 = 1
                goto L_0x0183
            L_0x015e:
                java.lang.String r1 = "public"
                boolean r1 = f9.h.V(r1, r0)
                if (r1 == 0) goto L_0x0169
                r16 = 1
                goto L_0x0183
            L_0x0169:
                java.lang.String r1 = "must-revalidate"
                boolean r1 = f9.h.V(r1, r0)
                if (r1 == 0) goto L_0x0174
                r17 = 1
                goto L_0x0183
            L_0x0174:
                java.lang.String r1 = "max-stale"
                boolean r1 = f9.h.V(r1, r0)
                if (r1 == 0) goto L_0x0185
                r0 = 2147483647(0x7fffffff, float:NaN)
                int r18 = j9.c.w(r3, r0)
            L_0x0183:
                r1 = -1
                goto L_0x01b4
            L_0x0185:
                java.lang.String r1 = "min-fresh"
                boolean r1 = f9.h.V(r1, r0)
                if (r1 == 0) goto L_0x0193
                r1 = -1
                int r19 = j9.c.w(r3, r1)
                goto L_0x01b4
            L_0x0193:
                r1 = -1
                java.lang.String r2 = "only-if-cached"
                boolean r2 = f9.h.V(r2, r0)
                if (r2 == 0) goto L_0x019f
                r20 = 1
                goto L_0x01b4
            L_0x019f:
                java.lang.String r2 = "no-transform"
                boolean r2 = f9.h.V(r2, r0)
                if (r2 == 0) goto L_0x01aa
                r21 = 1
                goto L_0x01b4
            L_0x01aa:
                java.lang.String r2 = "immutable"
                boolean r0 = f9.h.V(r2, r0)
                if (r0 == 0) goto L_0x01b4
                r22 = 1
            L_0x01b4:
                r0 = r27
                r2 = r9
                r1 = r24
                r9 = r26
                goto L_0x0044
            L_0x01bd:
                r24 = r1
                r26 = r9
                r1 = -1
                r9 = r2
                r5 = r26
                goto L_0x01cb
            L_0x01c6:
                r24 = r1
                r5 = r9
                r1 = -1
                r9 = r2
            L_0x01cb:
                int r7 = r7 + 1
                r0 = r27
                r2 = r9
                r1 = r24
                r9 = r5
                goto L_0x0023
            L_0x01d5:
                r5 = r9
                if (r8 != 0) goto L_0x01db
                r23 = 0
                goto L_0x01dd
            L_0x01db:
                r23 = r5
            L_0x01dd:
                i9.d r0 = new i9.d
                r10 = r0
                r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: i9.d.b.a(i9.q):i9.d");
        }
    }

    static {
        a aVar = new a();
        aVar.f6223a = true;
        aVar.a();
        a aVar2 = new a();
        aVar2.f6227f = true;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        g.f(timeUnit, "timeUnit");
        int i10 = Integer.MAX_VALUE;
        long j8 = (long) Integer.MAX_VALUE;
        long seconds = timeUnit.toSeconds(j8);
        if (seconds <= j8) {
            i10 = (int) seconds;
        }
        aVar2.d = i10;
        f6210n = aVar2.a();
    }

    public d(boolean z, boolean z10, int i10, int i11, boolean z11, boolean z12, boolean z13, int i12, int i13, boolean z14, boolean z15, boolean z16, String str) {
        this.f6212a = z;
        this.f6213b = z10;
        this.f6214c = i10;
        this.d = i11;
        this.f6215e = z11;
        this.f6216f = z12;
        this.f6217g = z13;
        this.f6218h = i12;
        this.f6219i = i13;
        this.f6220j = z14;
        this.f6221k = z15;
        this.l = z16;
        this.f6222m = str;
    }

    public final String toString() {
        String str = this.f6222m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f6212a) {
            sb.append("no-cache, ");
        }
        if (this.f6213b) {
            sb.append("no-store, ");
        }
        int i10 = this.f6214c;
        if (i10 != -1) {
            sb.append("max-age=");
            sb.append(i10);
            sb.append(", ");
        }
        int i11 = this.d;
        if (i11 != -1) {
            sb.append("s-maxage=");
            sb.append(i11);
            sb.append(", ");
        }
        if (this.f6215e) {
            sb.append("private, ");
        }
        if (this.f6216f) {
            sb.append("public, ");
        }
        if (this.f6217g) {
            sb.append("must-revalidate, ");
        }
        int i12 = this.f6218h;
        if (i12 != -1) {
            sb.append("max-stale=");
            sb.append(i12);
            sb.append(", ");
        }
        int i13 = this.f6219i;
        if (i13 != -1) {
            sb.append("min-fresh=");
            sb.append(i13);
            sb.append(", ");
        }
        if (this.f6220j) {
            sb.append("only-if-cached, ");
        }
        if (this.f6221k) {
            sb.append("no-transform, ");
        }
        if (this.l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        g.e(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f6222m = sb2;
        return sb2;
    }
}

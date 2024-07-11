package i9;

import androidx.appcompat.widget.x0;
import i9.q;
import i9.t;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import w9.h;
import w9.j;
import z8.g;

public final class u extends b0 {

    /* renamed from: f  reason: collision with root package name */
    public static final t f6324f = t.a.a("multipart/mixed");

    /* renamed from: g  reason: collision with root package name */
    public static final t f6325g = t.a.a("multipart/form-data");

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f6326h = {(byte) 58, (byte) 32};

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f6327i = {(byte) 13, (byte) 10};

    /* renamed from: j  reason: collision with root package name */
    public static final byte[] f6328j;

    /* renamed from: b  reason: collision with root package name */
    public final t f6329b;

    /* renamed from: c  reason: collision with root package name */
    public long f6330c = -1;
    public final j d;

    /* renamed from: e  reason: collision with root package name */
    public final List<c> f6331e;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final j f6332a;

        /* renamed from: b  reason: collision with root package name */
        public t f6333b = u.f6324f;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList f6334c = new ArrayList();

        public a() {
            String uuid = UUID.randomUUID().toString();
            g.e(uuid, "UUID.randomUUID().toString()");
            j jVar = j.f9328r;
            this.f6332a = j.a.c(uuid);
        }
    }

    public static final class b {
        public static void a(StringBuilder sb, String str) {
            String str2;
            g.f(str, "key");
            sb.append('\"');
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if (charAt == 10) {
                    str2 = "%0A";
                } else if (charAt == 13) {
                    str2 = "%0D";
                } else if (charAt != '\"') {
                    sb.append(charAt);
                } else {
                    str2 = "%22";
                }
                sb.append(str2);
            }
            sb.append('\"');
        }
    }

    public static final class c {

        /* renamed from: c  reason: collision with root package name */
        public static final a f6335c = new a();

        /* renamed from: a  reason: collision with root package name */
        public final q f6336a;

        /* renamed from: b  reason: collision with root package name */
        public final b0 f6337b;

        public static final class a {
            public static c a(q qVar, b0 b0Var) {
                g.f(b0Var, "body");
                String str = null;
                boolean z = true;
                if ((qVar != null ? qVar.e("Content-Type") : null) == null) {
                    if (qVar != null) {
                        str = qVar.e("Content-Length");
                    }
                    if (str != null) {
                        z = false;
                    }
                    if (z) {
                        return new c(qVar, b0Var);
                    }
                    throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
                }
                throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
            }

            public static c b(String str, String str2, y yVar) {
                StringBuilder g10 = x0.g("form-data; name=");
                t tVar = u.f6324f;
                b.a(g10, str);
                if (str2 != null) {
                    g10.append("; filename=");
                    b.a(g10, str2);
                }
                String sb = g10.toString();
                g.e(sb, "StringBuilder().apply(builderAction).toString()");
                q.a aVar = new q.a();
                q.f6299p.getClass();
                q.b.a("Content-Disposition");
                aVar.c("Content-Disposition", sb);
                return a(aVar.d(), yVar);
            }
        }

        public c(q qVar, b0 b0Var) {
            this.f6336a = qVar;
            this.f6337b = b0Var;
        }
    }

    static {
        t.f6320f.getClass();
        t.a.a("multipart/alternative");
        t.a.a("multipart/digest");
        t.a.a("multipart/parallel");
        byte b10 = (byte) 45;
        f6328j = new byte[]{b10, b10};
    }

    public u(j jVar, t tVar, List<c> list) {
        g.f(jVar, "boundaryByteString");
        g.f(tVar, "type");
        this.d = jVar;
        this.f6331e = list;
        t.f6320f.getClass();
        this.f6329b = t.a.a(tVar + "; boundary=" + jVar.s());
    }

    public final long a() {
        long j8 = this.f6330c;
        if (j8 != -1) {
            return j8;
        }
        long d10 = d((h) null, true);
        this.f6330c = d10;
        return d10;
    }

    public final t b() {
        return this.f6329b;
    }

    public final void c(h hVar) {
        d(hVar, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: w9.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: w9.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: w9.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: w9.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: w9.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: w9.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long d(w9.h r17, boolean r18) {
        /*
            r16 = this;
            r0 = r16
            if (r18 == 0) goto L_0x000b
            w9.f r1 = new w9.f
            r1.<init>()
            r2 = r1
            goto L_0x000f
        L_0x000b:
            r1 = 0
            r2 = r1
            r1 = r17
        L_0x000f:
            java.util.List<i9.u$c> r3 = r0.f6331e
            int r4 = r3.size()
            r5 = 0
            r6 = 0
            r8 = r5
        L_0x0019:
            w9.j r9 = r0.d
            byte[] r10 = f6328j
            byte[] r11 = f6327i
            if (r8 >= r4) goto L_0x00a4
            java.lang.Object r12 = r3.get(r8)
            i9.u$c r12 = (i9.u.c) r12
            i9.q r13 = r12.f6336a
            z8.g.c(r1)
            r1.write(r10)
            r1.e0(r9)
            r1.write(r11)
            if (r13 == 0) goto L_0x005b
            java.lang.String[] r9 = r13.f6300o
            int r9 = r9.length
            int r9 = r9 / 2
            r10 = r5
        L_0x003d:
            if (r10 >= r9) goto L_0x005b
            java.lang.String r14 = r13.h(r10)
            w9.h r14 = r1.Y(r14)
            byte[] r15 = f6326h
            w9.h r14 = r14.write(r15)
            java.lang.String r15 = r13.k(r10)
            w9.h r14 = r14.Y(r15)
            r14.write(r11)
            int r10 = r10 + 1
            goto L_0x003d
        L_0x005b:
            i9.b0 r9 = r12.f6337b
            i9.t r10 = r9.b()
            if (r10 == 0) goto L_0x0072
            java.lang.String r12 = "Content-Type: "
            w9.h r12 = r1.Y(r12)
            java.lang.String r10 = r10.f6321a
            w9.h r10 = r12.Y(r10)
            r10.write(r11)
        L_0x0072:
            long r12 = r9.a()
            r14 = -1
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x008a
            java.lang.String r10 = "Content-Length: "
            w9.h r10 = r1.Y(r10)
            w9.h r10 = r10.Z(r12)
            r10.write(r11)
            goto L_0x0093
        L_0x008a:
            if (r18 == 0) goto L_0x0093
            z8.g.c(r2)
            r2.c()
            return r14
        L_0x0093:
            r1.write(r11)
            if (r18 == 0) goto L_0x009a
            long r6 = r6 + r12
            goto L_0x009d
        L_0x009a:
            r9.c(r1)
        L_0x009d:
            r1.write(r11)
            int r8 = r8 + 1
            goto L_0x0019
        L_0x00a4:
            z8.g.c(r1)
            r1.write(r10)
            r1.e0(r9)
            r1.write(r10)
            r1.write(r11)
            if (r18 == 0) goto L_0x00be
            z8.g.c(r2)
            long r3 = r2.f9325p
            long r6 = r6 + r3
            r2.c()
        L_0x00be:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.u.d(w9.h, boolean):long");
    }
}

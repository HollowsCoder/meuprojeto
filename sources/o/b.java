package o;

import java.util.ArrayList;
import o.d;
import o.g;

public class b implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public g f7531a = null;

    /* renamed from: b  reason: collision with root package name */
    public float f7532b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<g> f7533c = new ArrayList<>();
    public a d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7534e = false;

    public interface a {
        float a(int i10);

        void b(g gVar, float f10, boolean z);

        void c(g gVar, float f10);

        void clear();

        int d();

        boolean e(g gVar);

        float f(b bVar, boolean z);

        float g(g gVar);

        g h(int i10);

        void i(float f10);

        float j(g gVar, boolean z);

        void k();
    }

    public b() {
    }

    public b(c cVar) {
        this.d = new a(this, cVar);
    }

    public g a(boolean[] zArr) {
        return f(zArr, (g) null);
    }

    public final void b(d dVar, int i10) {
        this.d.c(dVar.k(i10), 1.0f);
        this.d.c(dVar.k(i10), -1.0f);
    }

    public final void c(g gVar, g gVar2, g gVar3, int i10) {
        boolean z = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z = true;
            }
            this.f7532b = (float) i10;
        }
        if (!z) {
            this.d.c(gVar, -1.0f);
            this.d.c(gVar2, 1.0f);
            this.d.c(gVar3, 1.0f);
            return;
        }
        this.d.c(gVar, 1.0f);
        this.d.c(gVar2, -1.0f);
        this.d.c(gVar3, -1.0f);
    }

    public final void d(g gVar, g gVar2, g gVar3, int i10) {
        boolean z = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z = true;
            }
            this.f7532b = (float) i10;
        }
        if (!z) {
            this.d.c(gVar, -1.0f);
            this.d.c(gVar2, 1.0f);
            this.d.c(gVar3, -1.0f);
            return;
        }
        this.d.c(gVar, 1.0f);
        this.d.c(gVar2, -1.0f);
        this.d.c(gVar3, 1.0f);
    }

    public boolean e() {
        return this.f7531a == null && this.f7532b == 0.0f && this.d.d() == 0;
    }

    public final g f(boolean[] zArr, g gVar) {
        g.a aVar;
        int d10 = this.d.d();
        g gVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < d10; i10++) {
            float a10 = this.d.a(i10);
            if (a10 < 0.0f) {
                g h10 = this.d.h(i10);
                if ((zArr == null || !zArr[h10.f7562p]) && h10 != gVar && (((aVar = h10.w) == g.a.SLACK || aVar == g.a.ERROR) && a10 < f10)) {
                    f10 = a10;
                    gVar2 = h10;
                }
            }
        }
        return gVar2;
    }

    public final void g(g gVar) {
        g gVar2 = this.f7531a;
        if (gVar2 != null) {
            this.d.c(gVar2, -1.0f);
            this.f7531a.f7563q = -1;
            this.f7531a = null;
        }
        float j8 = this.d.j(gVar, true) * -1.0f;
        this.f7531a = gVar;
        if (j8 != 1.0f) {
            this.f7532b /= j8;
            this.d.i(j8);
        }
    }

    public final void h(d dVar, g gVar, boolean z) {
        if (gVar != null && gVar.f7566t) {
            float g10 = this.d.g(gVar);
            this.f7532b = (gVar.f7565s * g10) + this.f7532b;
            this.d.j(gVar, z);
            if (z) {
                gVar.i(this);
            }
            if (this.d.d() == 0) {
                this.f7534e = true;
                dVar.f7540a = true;
            }
        }
    }

    public void i(d dVar, b bVar, boolean z) {
        float f10 = this.d.f(bVar, z);
        this.f7532b = (bVar.f7532b * f10) + this.f7532b;
        if (z) {
            bVar.f7531a.i(this);
        }
        if (this.f7531a != null && this.d.d() == 0) {
            this.f7534e = true;
            dVar.f7540a = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r9 = this;
            o.g r0 = r9.f7531a
            if (r0 != 0) goto L_0x0007
            java.lang.String r0 = "0"
            goto L_0x0017
        L_0x0007:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            o.g r1 = r9.f7531a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0017:
            java.lang.String r1 = " = "
            java.lang.String r0 = b0.d.e(r0, r1)
            float r1 = r9.f7532b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0035
            java.lang.StringBuilder r0 = androidx.appcompat.widget.x0.g(r0)
            float r1 = r9.f7532b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r3
            goto L_0x0036
        L_0x0035:
            r1 = r4
        L_0x0036:
            o.b$a r5 = r9.d
            int r5 = r5.d()
        L_0x003c:
            if (r4 >= r5) goto L_0x00a0
            o.b$a r6 = r9.d
            o.g r6 = r6.h(r4)
            if (r6 != 0) goto L_0x0047
            goto L_0x009d
        L_0x0047:
            o.b$a r7 = r9.d
            float r7 = r7.a(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x0052
            goto L_0x009d
        L_0x0052:
            java.lang.String r6 = r6.toString()
            if (r1 != 0) goto L_0x0063
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x007f
            java.lang.StringBuilder r0 = androidx.appcompat.widget.x0.g(r0)
            java.lang.String r1 = "- "
            goto L_0x0075
        L_0x0063:
            java.lang.StringBuilder r0 = androidx.appcompat.widget.x0.g(r0)
            if (r8 <= 0) goto L_0x0073
            java.lang.String r1 = " + "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x007f
        L_0x0073:
            java.lang.String r1 = " - "
        L_0x0075:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r7 = r7 * r1
        L_0x007f:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x008b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x0098
        L_0x008b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        L_0x0098:
            java.lang.String r0 = b0.d.g(r1, r0, r6)
            r1 = r3
        L_0x009d:
            int r4 = r4 + 1
            goto L_0x003c
        L_0x00a0:
            if (r1 != 0) goto L_0x00a8
            java.lang.String r1 = "0.0"
            java.lang.String r0 = b0.d.e(r0, r1)
        L_0x00a8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.b.toString():java.lang.String");
    }
}

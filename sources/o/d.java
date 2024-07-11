package o;

import java.util.Arrays;
import o.b;
import o.g;

public final class d {

    /* renamed from: p  reason: collision with root package name */
    public static boolean f7538p = false;

    /* renamed from: q  reason: collision with root package name */
    public static int f7539q = 1000;

    /* renamed from: a  reason: collision with root package name */
    public boolean f7540a;

    /* renamed from: b  reason: collision with root package name */
    public int f7541b;

    /* renamed from: c  reason: collision with root package name */
    public final f f7542c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f7543e;

    /* renamed from: f  reason: collision with root package name */
    public b[] f7544f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7545g;

    /* renamed from: h  reason: collision with root package name */
    public boolean[] f7546h;

    /* renamed from: i  reason: collision with root package name */
    public int f7547i;

    /* renamed from: j  reason: collision with root package name */
    public int f7548j;

    /* renamed from: k  reason: collision with root package name */
    public int f7549k;
    public final c l;

    /* renamed from: m  reason: collision with root package name */
    public g[] f7550m;

    /* renamed from: n  reason: collision with root package name */
    public int f7551n;

    /* renamed from: o  reason: collision with root package name */
    public b f7552o;

    public interface a {
        g a(boolean[] zArr);
    }

    public d() {
        this.f7540a = false;
        this.f7541b = 0;
        this.d = 32;
        this.f7543e = 32;
        this.f7544f = null;
        this.f7545g = false;
        this.f7546h = new boolean[32];
        this.f7547i = 1;
        this.f7548j = 0;
        this.f7549k = 32;
        this.f7550m = new g[f7539q];
        this.f7551n = 0;
        this.f7544f = new b[32];
        t();
        c cVar = new c(0);
        this.l = cVar;
        this.f7542c = new f(cVar);
        this.f7552o = new b(cVar);
    }

    public static int o(q.d dVar) {
        g gVar = dVar.f8149i;
        if (gVar != null) {
            return (int) (gVar.f7565s + 0.5f);
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: o.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.g a(o.g.a r6) {
        /*
            r5 = this;
            o.c r0 = r5.l
            java.lang.Object r0 = r0.f7537c
            o.e r0 = (o.e) r0
            int r1 = r0.f7553a
            r2 = 0
            if (r1 <= 0) goto L_0x0018
            int r1 = r1 + -1
            java.lang.Object r3 = r0.f7554b
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r4 = r3[r1]
            r3[r1] = r2
            r0.f7553a = r1
            r2 = r4
        L_0x0018:
            o.g r2 = (o.g) r2
            if (r2 != 0) goto L_0x0022
            o.g r2 = new o.g
            r2.<init>(r6)
            goto L_0x0025
        L_0x0022:
            r2.k()
        L_0x0025:
            r2.w = r6
            int r6 = r5.f7551n
            int r0 = f7539q
            if (r6 < r0) goto L_0x003b
            int r0 = r0 * 2
            f7539q = r0
            o.g[] r6 = r5.f7550m
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            o.g[] r6 = (o.g[]) r6
            r5.f7550m = r6
        L_0x003b:
            o.g[] r6 = r5.f7550m
            int r0 = r5.f7551n
            int r1 = r0 + 1
            r5.f7551n = r1
            r6[r0] = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.d.a(o.g$a):o.g");
    }

    public final void b(g gVar, g gVar2, int i10, float f10, g gVar3, g gVar4, int i11, int i12) {
        float f11;
        int i13;
        b m10 = m();
        if (gVar2 == gVar3) {
            m10.d.c(gVar, 1.0f);
            m10.d.c(gVar4, 1.0f);
            m10.d.c(gVar2, -2.0f);
        } else {
            if (f10 == 0.5f) {
                m10.d.c(gVar, 1.0f);
                m10.d.c(gVar2, -1.0f);
                m10.d.c(gVar3, -1.0f);
                m10.d.c(gVar4, 1.0f);
                if (i10 > 0 || i11 > 0) {
                    i13 = (-i10) + i11;
                }
            } else if (f10 <= 0.0f) {
                m10.d.c(gVar, -1.0f);
                m10.d.c(gVar2, 1.0f);
                f11 = (float) i10;
                m10.f7532b = f11;
            } else if (f10 >= 1.0f) {
                m10.d.c(gVar4, -1.0f);
                m10.d.c(gVar3, 1.0f);
                i13 = -i11;
            } else {
                float f12 = 1.0f - f10;
                m10.d.c(gVar, f12 * 1.0f);
                m10.d.c(gVar2, f12 * -1.0f);
                m10.d.c(gVar3, -1.0f * f10);
                m10.d.c(gVar4, 1.0f * f10);
                if (i10 > 0 || i11 > 0) {
                    m10.f7532b = (((float) i11) * f10) + (((float) (-i10)) * f12);
                }
            }
            f11 = (float) i13;
            m10.f7532b = f11;
        }
        if (i12 != 8) {
            m10.b(this, i12);
        }
        c(m10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ba, code lost:
        if (r4.z <= 1) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c3, code lost:
        if (r4.z <= 1) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e1, code lost:
        if (r4.z <= 1) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00ea, code lost:
        if (r4.z <= 1) goto L_0x00fa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01b7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(o.b r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r0.f7548j
            r3 = 1
            int r2 = r2 + r3
            int r4 = r0.f7549k
            if (r2 >= r4) goto L_0x0013
            int r2 = r0.f7547i
            int r2 = r2 + r3
            int r4 = r0.f7543e
            if (r2 < r4) goto L_0x0016
        L_0x0013:
            r16.p()
        L_0x0016:
            boolean r2 = r1.f7534e
            if (r2 != 0) goto L_0x01ba
            o.b[] r2 = r0.f7544f
            int r2 = r2.length
            r5 = -1
            if (r2 != 0) goto L_0x0021
            goto L_0x007d
        L_0x0021:
            r2 = 0
        L_0x0022:
            if (r2 != 0) goto L_0x006d
            o.b$a r6 = r1.d
            int r6 = r6.d()
            r7 = 0
        L_0x002b:
            java.util.ArrayList<o.g> r8 = r1.f7533c
            if (r7 >= r6) goto L_0x0044
            o.b$a r9 = r1.d
            o.g r9 = r9.h(r7)
            int r10 = r9.f7563q
            if (r10 != r5) goto L_0x003e
            boolean r10 = r9.f7566t
            if (r10 != 0) goto L_0x003e
            goto L_0x0041
        L_0x003e:
            r8.add(r9)
        L_0x0041:
            int r7 = r7 + 1
            goto L_0x002b
        L_0x0044:
            int r6 = r8.size()
            if (r6 <= 0) goto L_0x006b
            r7 = 0
        L_0x004b:
            if (r7 >= r6) goto L_0x0067
            java.lang.Object r9 = r8.get(r7)
            o.g r9 = (o.g) r9
            boolean r10 = r9.f7566t
            if (r10 == 0) goto L_0x005b
            r1.h(r0, r9, r3)
            goto L_0x0064
        L_0x005b:
            o.b[] r10 = r0.f7544f
            int r9 = r9.f7563q
            r9 = r10[r9]
            r1.i(r0, r9, r3)
        L_0x0064:
            int r7 = r7 + 1
            goto L_0x004b
        L_0x0067:
            r8.clear()
            goto L_0x0022
        L_0x006b:
            r2 = r3
            goto L_0x0022
        L_0x006d:
            o.g r2 = r1.f7531a
            if (r2 == 0) goto L_0x007d
            o.b$a r2 = r1.d
            int r2 = r2.d()
            if (r2 != 0) goto L_0x007d
            r1.f7534e = r3
            r0.f7540a = r3
        L_0x007d:
            boolean r2 = r17.e()
            if (r2 == 0) goto L_0x0084
            return
        L_0x0084:
            float r2 = r1.f7532b
            r6 = 0
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x0095
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2 * r7
            r1.f7532b = r2
            o.b$a r2 = r1.d
            r2.k()
        L_0x0095:
            o.b$a r2 = r1.d
            int r2 = r2.d()
            r11 = r6
            r13 = r11
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r14 = 0
        L_0x00a2:
            if (r8 >= r2) goto L_0x0101
            o.b$a r15 = r1.d
            float r15 = r15.a(r8)
            o.b$a r4 = r1.d
            o.g r4 = r4.h(r8)
            o.g$a r5 = r4.w
            o.g$a r7 = o.g.a.UNRESTRICTED
            if (r5 != r7) goto L_0x00d7
            if (r9 != 0) goto L_0x00bd
            int r5 = r4.z
            if (r5 > r3) goto L_0x00c6
            goto L_0x00d3
        L_0x00bd:
            int r5 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x00c8
            int r5 = r4.z
            if (r5 > r3) goto L_0x00c6
            goto L_0x00d3
        L_0x00c6:
            r12 = 0
            goto L_0x00d4
        L_0x00c8:
            if (r12 != 0) goto L_0x00fd
            int r5 = r4.z
            if (r5 > r3) goto L_0x00d0
            r5 = r3
            goto L_0x00d1
        L_0x00d0:
            r5 = 0
        L_0x00d1:
            if (r5 == 0) goto L_0x00fd
        L_0x00d3:
            r12 = r3
        L_0x00d4:
            r9 = r4
            r11 = r15
            goto L_0x00fd
        L_0x00d7:
            if (r9 != 0) goto L_0x00fd
            int r5 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x00fd
            if (r10 != 0) goto L_0x00e4
            int r5 = r4.z
            if (r5 > r3) goto L_0x00ed
            goto L_0x00fa
        L_0x00e4:
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x00ef
            int r5 = r4.z
            if (r5 > r3) goto L_0x00ed
            goto L_0x00fa
        L_0x00ed:
            r14 = 0
            goto L_0x00fb
        L_0x00ef:
            if (r14 != 0) goto L_0x00fd
            int r5 = r4.z
            if (r5 > r3) goto L_0x00f7
            r5 = r3
            goto L_0x00f8
        L_0x00f7:
            r5 = 0
        L_0x00f8:
            if (r5 == 0) goto L_0x00fd
        L_0x00fa:
            r14 = r3
        L_0x00fb:
            r10 = r4
            r13 = r15
        L_0x00fd:
            int r8 = r8 + 1
            r5 = -1
            goto L_0x00a2
        L_0x0101:
            if (r9 == 0) goto L_0x0104
            goto L_0x0105
        L_0x0104:
            r9 = r10
        L_0x0105:
            if (r9 != 0) goto L_0x0109
            r2 = r3
            goto L_0x010d
        L_0x0109:
            r1.g(r9)
            r2 = 0
        L_0x010d:
            o.b$a r4 = r1.d
            int r4 = r4.d()
            if (r4 != 0) goto L_0x0117
            r1.f7534e = r3
        L_0x0117:
            if (r2 == 0) goto L_0x01a2
            int r2 = r0.f7547i
            int r2 = r2 + r3
            int r4 = r0.f7543e
            if (r2 < r4) goto L_0x0123
            r16.p()
        L_0x0123:
            o.g$a r2 = o.g.a.SLACK
            o.g r2 = r0.a(r2)
            int r4 = r0.f7541b
            int r4 = r4 + r3
            r0.f7541b = r4
            int r5 = r0.f7547i
            int r5 = r5 + r3
            r0.f7547i = r5
            r2.f7562p = r4
            o.c r5 = r0.l
            java.lang.Object r7 = r5.d
            o.g[] r7 = (o.g[]) r7
            r7[r4] = r2
            r1.f7531a = r2
            int r4 = r0.f7548j
            r16.i(r17)
            int r7 = r0.f7548j
            int r4 = r4 + r3
            if (r7 != r4) goto L_0x01a2
            o.b r4 = r0.f7552o
            r4.getClass()
            r7 = 0
            r4.f7531a = r7
            o.b$a r7 = r4.d
            r7.clear()
            r7 = 0
        L_0x0157:
            o.b$a r8 = r1.d
            int r8 = r8.d()
            if (r7 >= r8) goto L_0x0173
            o.b$a r8 = r1.d
            o.g r8 = r8.h(r7)
            o.b$a r9 = r1.d
            float r9 = r9.a(r7)
            o.b$a r10 = r4.d
            r10.b(r8, r9, r3)
            int r7 = r7 + 1
            goto L_0x0157
        L_0x0173:
            o.b r4 = r0.f7552o
            r0.s(r4)
            int r4 = r2.f7563q
            r7 = -1
            if (r4 != r7) goto L_0x01a0
            o.g r4 = r1.f7531a
            if (r4 != r2) goto L_0x018b
            r4 = 0
            o.g r2 = r1.f(r4, r2)
            if (r2 == 0) goto L_0x018b
            r1.g(r2)
        L_0x018b:
            boolean r2 = r1.f7534e
            if (r2 != 0) goto L_0x0194
            o.g r2 = r1.f7531a
            r2.n(r0, r1)
        L_0x0194:
            java.lang.Object r2 = r5.f7536b
            o.e r2 = (o.e) r2
            r2.c(r1)
            int r2 = r0.f7548j
            int r2 = r2 - r3
            r0.f7548j = r2
        L_0x01a0:
            r2 = r3
            goto L_0x01a3
        L_0x01a2:
            r2 = 0
        L_0x01a3:
            o.g r4 = r1.f7531a
            if (r4 == 0) goto L_0x01b4
            o.g$a r4 = r4.w
            o.g$a r5 = o.g.a.UNRESTRICTED
            if (r4 == r5) goto L_0x01b5
            float r4 = r1.f7532b
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x01b4
            goto L_0x01b5
        L_0x01b4:
            r3 = 0
        L_0x01b5:
            if (r3 != 0) goto L_0x01b8
            return
        L_0x01b8:
            r4 = r2
            goto L_0x01bb
        L_0x01ba:
            r4 = 0
        L_0x01bb:
            if (r4 != 0) goto L_0x01c0
            r16.i(r17)
        L_0x01c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.d.c(o.b):void");
    }

    public final void d(g gVar, int i10) {
        b bVar;
        b.a aVar;
        float f10;
        int i11 = gVar.f7563q;
        if (i11 == -1) {
            gVar.l(this, (float) i10);
            for (int i12 = 0; i12 < this.f7541b + 1; i12++) {
                g gVar2 = ((g[]) this.l.d)[i12];
            }
            return;
        }
        if (i11 != -1) {
            b bVar2 = this.f7544f[i11];
            if (!bVar2.f7534e) {
                if (bVar2.d.d() == 0) {
                    bVar2.f7534e = true;
                } else {
                    bVar = m();
                    if (i10 < 0) {
                        bVar.f7532b = (float) (i10 * -1);
                        aVar = bVar.d;
                        f10 = 1.0f;
                    } else {
                        bVar.f7532b = (float) i10;
                        aVar = bVar.d;
                        f10 = -1.0f;
                    }
                    aVar.c(gVar, f10);
                }
            }
            bVar2.f7532b = (float) i10;
            return;
        }
        bVar = m();
        bVar.f7531a = gVar;
        float f11 = (float) i10;
        gVar.f7565s = f11;
        bVar.f7532b = f11;
        bVar.f7534e = true;
        c(bVar);
    }

    public final void e(g gVar, g gVar2, int i10, int i11) {
        if (i11 == 8 && gVar2.f7566t && gVar.f7563q == -1) {
            gVar.l(this, gVar2.f7565s + ((float) i10));
            return;
        }
        b m10 = m();
        boolean z = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z = true;
            }
            m10.f7532b = (float) i10;
        }
        if (!z) {
            m10.d.c(gVar, -1.0f);
            m10.d.c(gVar2, 1.0f);
        } else {
            m10.d.c(gVar, 1.0f);
            m10.d.c(gVar2, -1.0f);
        }
        if (i11 != 8) {
            m10.b(this, i11);
        }
        c(m10);
    }

    public final void f(g gVar, g gVar2, int i10, int i11) {
        b m10 = m();
        g n10 = n();
        n10.f7564r = 0;
        m10.c(gVar, gVar2, n10, i10);
        if (i11 != 8) {
            m10.d.c(k(i11), (float) ((int) (m10.d.g(n10) * -1.0f)));
        }
        c(m10);
    }

    public final void g(g gVar, g gVar2, int i10, int i11) {
        b m10 = m();
        g n10 = n();
        n10.f7564r = 0;
        m10.d(gVar, gVar2, n10, i10);
        if (i11 != 8) {
            m10.d.c(k(i11), (float) ((int) (m10.d.g(n10) * -1.0f)));
        }
        c(m10);
    }

    public final void h(g gVar, g gVar2, g gVar3, g gVar4, float f10) {
        b m10 = m();
        m10.d.c(gVar, -1.0f);
        m10.d.c(gVar2, 1.0f);
        m10.d.c(gVar3, f10);
        m10.d.c(gVar4, -f10);
        c(m10);
    }

    public final void i(b bVar) {
        int i10;
        if (bVar.f7534e) {
            bVar.f7531a.l(this, bVar.f7532b);
        } else {
            b[] bVarArr = this.f7544f;
            int i11 = this.f7548j;
            bVarArr[i11] = bVar;
            g gVar = bVar.f7531a;
            gVar.f7563q = i11;
            this.f7548j = i11 + 1;
            gVar.n(this, bVar);
        }
        if (this.f7540a) {
            int i12 = 0;
            while (i12 < this.f7548j) {
                if (this.f7544f[i12] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f7544f[i12];
                if (bVar2 != null && bVar2.f7534e) {
                    bVar2.f7531a.l(this, bVar2.f7532b);
                    ((e) this.l.f7536b).c(bVar2);
                    this.f7544f[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f7548j;
                        if (i13 >= i10) {
                            break;
                        }
                        b[] bVarArr2 = this.f7544f;
                        int i15 = i13 - 1;
                        b bVar3 = bVarArr2[i13];
                        bVarArr2[i15] = bVar3;
                        g gVar2 = bVar3.f7531a;
                        if (gVar2.f7563q == i13) {
                            gVar2.f7563q = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f7544f[i14] = null;
                    }
                    this.f7548j = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f7540a = false;
        }
    }

    public final void j() {
        for (int i10 = 0; i10 < this.f7548j; i10++) {
            b bVar = this.f7544f[i10];
            bVar.f7531a.f7565s = bVar.f7532b;
        }
    }

    public final g k(int i10) {
        if (this.f7547i + 1 >= this.f7543e) {
            p();
        }
        g a10 = a(g.a.ERROR);
        int i11 = this.f7541b + 1;
        this.f7541b = i11;
        this.f7547i++;
        a10.f7562p = i11;
        a10.f7564r = i10;
        ((g[]) this.l.d)[i11] = a10;
        f fVar = this.f7542c;
        fVar.f7558i.f7559a = a10;
        float[] fArr = a10.f7567v;
        Arrays.fill(fArr, 0.0f);
        fArr[a10.f7564r] = 1.0f;
        fVar.j(a10);
        return a10;
    }

    public final g l(Object obj) {
        g gVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f7547i + 1 >= this.f7543e) {
            p();
        }
        if (obj instanceof q.d) {
            q.d dVar = (q.d) obj;
            gVar = dVar.f8149i;
            if (gVar == null) {
                dVar.h();
                gVar = dVar.f8149i;
            }
            int i10 = gVar.f7562p;
            c cVar = this.l;
            if (i10 == -1 || i10 > this.f7541b || ((g[]) cVar.d)[i10] == null) {
                if (i10 != -1) {
                    gVar.k();
                }
                int i11 = this.f7541b + 1;
                this.f7541b = i11;
                this.f7547i++;
                gVar.f7562p = i11;
                gVar.w = g.a.UNRESTRICTED;
                ((g[]) cVar.d)[i11] = gVar;
            }
        }
        return gVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: o.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.b m() {
        /*
            r6 = this;
            o.c r0 = r6.l
            java.lang.Object r1 = r0.f7536b
            o.e r1 = (o.e) r1
            int r2 = r1.f7553a
            r3 = 0
            if (r2 <= 0) goto L_0x0018
            int r2 = r2 + -1
            java.lang.Object r4 = r1.f7554b
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r5 = r4[r2]
            r4[r2] = r3
            r1.f7553a = r2
            goto L_0x0019
        L_0x0018:
            r5 = r3
        L_0x0019:
            o.b r5 = (o.b) r5
            if (r5 != 0) goto L_0x0023
            o.b r5 = new o.b
            r5.<init>(r0)
            goto L_0x0030
        L_0x0023:
            r5.f7531a = r3
            o.b$a r0 = r5.d
            r0.clear()
            r0 = 0
            r5.f7532b = r0
            r0 = 0
            r5.f7534e = r0
        L_0x0030:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.d.m():o.b");
    }

    public final g n() {
        if (this.f7547i + 1 >= this.f7543e) {
            p();
        }
        g a10 = a(g.a.SLACK);
        int i10 = this.f7541b + 1;
        this.f7541b = i10;
        this.f7547i++;
        a10.f7562p = i10;
        ((g[]) this.l.d)[i10] = a10;
        return a10;
    }

    public final void p() {
        int i10 = this.d * 2;
        this.d = i10;
        this.f7544f = (b[]) Arrays.copyOf(this.f7544f, i10);
        c cVar = this.l;
        cVar.d = (g[]) Arrays.copyOf((g[]) cVar.d, this.d);
        int i11 = this.d;
        this.f7546h = new boolean[i11];
        this.f7543e = i11;
        this.f7549k = i11;
    }

    public final void q() {
        f fVar = this.f7542c;
        if (fVar.e()) {
            j();
            return;
        }
        if (this.f7545g) {
            boolean z = false;
            int i10 = 0;
            while (true) {
                if (i10 >= this.f7548j) {
                    z = true;
                    break;
                } else if (!this.f7544f[i10].f7534e) {
                    break;
                } else {
                    i10++;
                }
            }
            if (z) {
                j();
                return;
            }
        }
        r(fVar);
    }

    public final void r(f fVar) {
        float f10;
        int i10;
        boolean z;
        int i11 = 0;
        while (true) {
            f10 = 0.0f;
            i10 = 1;
            if (i11 >= this.f7548j) {
                z = false;
                break;
            }
            b bVar = this.f7544f[i11];
            if (bVar.f7531a.w != g.a.UNRESTRICTED && bVar.f7532b < 0.0f) {
                z = true;
                break;
            }
            i11++;
        }
        if (z) {
            boolean z10 = false;
            int i12 = 0;
            while (!z10) {
                i12 += i10;
                float f11 = Float.MAX_VALUE;
                int i13 = -1;
                int i14 = -1;
                int i15 = 0;
                int i16 = 0;
                while (i15 < this.f7548j) {
                    b bVar2 = this.f7544f[i15];
                    if (bVar2.f7531a.w != g.a.UNRESTRICTED && !bVar2.f7534e && bVar2.f7532b < f10) {
                        int d10 = bVar2.d.d();
                        int i17 = 0;
                        while (i17 < d10) {
                            g h10 = bVar2.d.h(i17);
                            float g10 = bVar2.d.g(h10);
                            if (g10 > f10) {
                                for (int i18 = 0; i18 < 9; i18++) {
                                    float f12 = h10.u[i18] / g10;
                                    if ((f12 < f11 && i18 == i16) || i18 > i16) {
                                        i14 = h10.f7562p;
                                        i16 = i18;
                                        f11 = f12;
                                        i13 = i15;
                                    }
                                }
                            }
                            i17++;
                            f10 = 0.0f;
                        }
                    }
                    i15++;
                    f10 = 0.0f;
                }
                if (i13 != -1) {
                    b bVar3 = this.f7544f[i13];
                    bVar3.f7531a.f7563q = -1;
                    bVar3.g(((g[]) this.l.d)[i14]);
                    g gVar = bVar3.f7531a;
                    gVar.f7563q = i13;
                    gVar.n(this, bVar3);
                } else {
                    z10 = true;
                }
                if (i12 > this.f7547i / 2) {
                    z10 = true;
                }
                f10 = 0.0f;
                i10 = 1;
            }
        }
        s(fVar);
        j();
    }

    public final void s(b bVar) {
        for (int i10 = 0; i10 < this.f7547i; i10++) {
            this.f7546h[i10] = false;
        }
        boolean z = false;
        int i11 = 0;
        while (!z) {
            i11++;
            if (i11 < this.f7547i * 2) {
                g gVar = bVar.f7531a;
                if (gVar != null) {
                    this.f7546h[gVar.f7562p] = true;
                }
                g a10 = bVar.a(this.f7546h);
                if (a10 != null) {
                    boolean[] zArr = this.f7546h;
                    int i12 = a10.f7562p;
                    if (!zArr[i12]) {
                        zArr[i12] = true;
                    } else {
                        return;
                    }
                }
                if (a10 != null) {
                    float f10 = Float.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < this.f7548j; i14++) {
                        b bVar2 = this.f7544f[i14];
                        if (bVar2.f7531a.w != g.a.UNRESTRICTED && !bVar2.f7534e && bVar2.d.e(a10)) {
                            float g10 = bVar2.d.g(a10);
                            if (g10 < 0.0f) {
                                float f11 = (-bVar2.f7532b) / g10;
                                if (f11 < f10) {
                                    i13 = i14;
                                    f10 = f11;
                                }
                            }
                        }
                    }
                    if (i13 > -1) {
                        b bVar3 = this.f7544f[i13];
                        bVar3.f7531a.f7563q = -1;
                        bVar3.g(a10);
                        g gVar2 = bVar3.f7531a;
                        gVar2.f7563q = i13;
                        gVar2.n(this, bVar3);
                    }
                } else {
                    z = true;
                }
            } else {
                return;
            }
        }
    }

    public final void t() {
        for (int i10 = 0; i10 < this.f7548j; i10++) {
            b bVar = this.f7544f[i10];
            if (bVar != null) {
                ((e) this.l.f7536b).c(bVar);
            }
            this.f7544f[i10] = null;
        }
    }

    public final void u() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.l;
            g[] gVarArr = (g[]) cVar.d;
            if (i10 >= gVarArr.length) {
                break;
            }
            g gVar = gVarArr[i10];
            if (gVar != null) {
                gVar.k();
            }
            i10++;
        }
        e eVar = (e) cVar.f7537c;
        g[] gVarArr2 = this.f7550m;
        int i11 = this.f7551n;
        eVar.getClass();
        if (i11 > gVarArr2.length) {
            i11 = gVarArr2.length;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            g gVar2 = gVarArr2[i12];
            int i13 = eVar.f7553a;
            Object[] objArr = (Object[]) eVar.f7554b;
            if (i13 < objArr.length) {
                objArr[i13] = gVar2;
                eVar.f7553a = i13 + 1;
            }
        }
        this.f7551n = 0;
        Arrays.fill((g[]) cVar.d, (Object) null);
        this.f7541b = 0;
        f fVar = this.f7542c;
        fVar.f7557h = 0;
        fVar.f7532b = 0.0f;
        this.f7547i = 1;
        for (int i14 = 0; i14 < this.f7548j; i14++) {
            b bVar = this.f7544f[i14];
        }
        t();
        this.f7548j = 0;
        this.f7552o = new b(cVar);
    }
}

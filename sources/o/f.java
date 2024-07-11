package o;

import androidx.appcompat.widget.x0;
import java.util.Arrays;
import java.util.Comparator;
import o.b;

public final class f extends b {

    /* renamed from: f  reason: collision with root package name */
    public g[] f7555f = new g[128];

    /* renamed from: g  reason: collision with root package name */
    public g[] f7556g = new g[128];

    /* renamed from: h  reason: collision with root package name */
    public int f7557h = 0;

    /* renamed from: i  reason: collision with root package name */
    public final b f7558i = new b();

    public class a implements Comparator<g> {
        public final int compare(Object obj, Object obj2) {
            return ((g) obj).f7562p - ((g) obj2).f7562p;
        }
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public g f7559a;

        public b() {
        }

        public final String toString() {
            String str = "[ ";
            if (this.f7559a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    StringBuilder g10 = x0.g(str);
                    g10.append(this.f7559a.f7567v[i10]);
                    g10.append(" ");
                    str = g10.toString();
                }
            }
            StringBuilder h10 = x0.h(str, "] ");
            h10.append(this.f7559a);
            return h10.toString();
        }
    }

    public f(c cVar) {
        super(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        if (r9 < r8) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.g a(boolean[] r12) {
        /*
            r11 = this;
            r0 = -1
            r1 = 0
            r3 = r0
            r2 = r1
        L_0x0004:
            int r4 = r11.f7557h
            if (r2 >= r4) goto L_0x0057
            o.g[] r4 = r11.f7555f
            r5 = r4[r2]
            int r6 = r5.f7562p
            boolean r6 = r12[r6]
            if (r6 == 0) goto L_0x0013
            goto L_0x0054
        L_0x0013:
            o.f$b r6 = r11.f7558i
            r6.f7559a = r5
            r5 = 1
            r7 = 8
            if (r3 != r0) goto L_0x0036
        L_0x001c:
            if (r7 < 0) goto L_0x0032
            o.g r4 = r6.f7559a
            float[] r4 = r4.f7567v
            r4 = r4[r7]
            r8 = 0
            int r9 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r9 <= 0) goto L_0x002a
            goto L_0x0032
        L_0x002a:
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x002f
            goto L_0x0033
        L_0x002f:
            int r7 = r7 + -1
            goto L_0x001c
        L_0x0032:
            r5 = r1
        L_0x0033:
            if (r5 == 0) goto L_0x0054
            goto L_0x0053
        L_0x0036:
            r4 = r4[r3]
        L_0x0038:
            if (r7 < 0) goto L_0x0050
            float[] r8 = r4.f7567v
            r8 = r8[r7]
            o.g r9 = r6.f7559a
            float[] r9 = r9.f7567v
            r9 = r9[r7]
            int r10 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x004b
            int r7 = r7 + -1
            goto L_0x0038
        L_0x004b:
            int r4 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r5 = r1
        L_0x0051:
            if (r5 == 0) goto L_0x0054
        L_0x0053:
            r3 = r2
        L_0x0054:
            int r2 = r2 + 1
            goto L_0x0004
        L_0x0057:
            if (r3 != r0) goto L_0x005b
            r12 = 0
            return r12
        L_0x005b:
            o.g[] r12 = r11.f7555f
            r12 = r12[r3]
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.f.a(boolean[]):o.g");
    }

    public final boolean e() {
        return this.f7557h == 0;
    }

    public final void i(d dVar, b bVar, boolean z) {
        boolean z10;
        b bVar2 = bVar;
        g gVar = bVar2.f7531a;
        if (gVar != null) {
            b.a aVar = bVar2.d;
            int d = aVar.d();
            for (int i10 = 0; i10 < d; i10++) {
                g h10 = aVar.h(i10);
                float a10 = aVar.a(i10);
                b bVar3 = this.f7558i;
                bVar3.f7559a = h10;
                boolean z11 = h10.f7561o;
                float[] fArr = gVar.f7567v;
                if (z11) {
                    boolean z12 = true;
                    for (int i11 = 0; i11 < 9; i11++) {
                        float[] fArr2 = bVar3.f7559a.f7567v;
                        float f10 = (fArr[i11] * a10) + fArr2[i11];
                        fArr2[i11] = f10;
                        if (Math.abs(f10) < 1.0E-4f) {
                            bVar3.f7559a.f7567v[i11] = 0.0f;
                        } else {
                            z12 = false;
                        }
                    }
                    if (z12) {
                        f.this.k(bVar3.f7559a);
                    }
                    z10 = false;
                } else {
                    for (int i12 = 0; i12 < 9; i12++) {
                        float f11 = fArr[i12];
                        if (f11 != 0.0f) {
                            float f12 = f11 * a10;
                            if (Math.abs(f12) < 1.0E-4f) {
                                f12 = 0.0f;
                            }
                            bVar3.f7559a.f7567v[i12] = f12;
                        } else {
                            bVar3.f7559a.f7567v[i12] = 0.0f;
                        }
                    }
                    z10 = true;
                }
                if (z10) {
                    j(h10);
                }
                this.f7532b = (bVar2.f7532b * a10) + this.f7532b;
            }
            k(gVar);
        }
    }

    public final void j(g gVar) {
        int i10;
        int i11 = this.f7557h + 1;
        g[] gVarArr = this.f7555f;
        if (i11 > gVarArr.length) {
            g[] gVarArr2 = (g[]) Arrays.copyOf(gVarArr, gVarArr.length * 2);
            this.f7555f = gVarArr2;
            this.f7556g = (g[]) Arrays.copyOf(gVarArr2, gVarArr2.length * 2);
        }
        g[] gVarArr3 = this.f7555f;
        int i12 = this.f7557h;
        gVarArr3[i12] = gVar;
        int i13 = i12 + 1;
        this.f7557h = i13;
        if (i13 > 1 && gVarArr3[i13 - 1].f7562p > gVar.f7562p) {
            int i14 = 0;
            while (true) {
                i10 = this.f7557h;
                if (i14 >= i10) {
                    break;
                }
                this.f7556g[i14] = this.f7555f[i14];
                i14++;
            }
            Arrays.sort(this.f7556g, 0, i10, new a());
            for (int i15 = 0; i15 < this.f7557h; i15++) {
                this.f7555f[i15] = this.f7556g[i15];
            }
        }
        gVar.f7561o = true;
        gVar.g(this);
    }

    public final void k(g gVar) {
        int i10 = 0;
        while (i10 < this.f7557h) {
            if (this.f7555f[i10] == gVar) {
                while (true) {
                    int i11 = this.f7557h;
                    if (i10 < i11 - 1) {
                        g[] gVarArr = this.f7555f;
                        int i12 = i10 + 1;
                        gVarArr[i10] = gVarArr[i12];
                        i10 = i12;
                    } else {
                        this.f7557h = i11 - 1;
                        gVar.f7561o = false;
                        return;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    public final String toString() {
        String str = " goal -> (" + this.f7532b + ") : ";
        for (int i10 = 0; i10 < this.f7557h; i10++) {
            g gVar = this.f7555f[i10];
            b bVar = this.f7558i;
            bVar.f7559a = gVar;
            str = str + bVar + " ";
        }
        return str;
    }
}

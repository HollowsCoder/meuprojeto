package n;

public final class j<E> implements Cloneable {

    /* renamed from: s  reason: collision with root package name */
    public static final Object f7334s = new Object();

    /* renamed from: o  reason: collision with root package name */
    public boolean f7335o = false;

    /* renamed from: p  reason: collision with root package name */
    public int[] f7336p;

    /* renamed from: q  reason: collision with root package name */
    public Object[] f7337q;

    /* renamed from: r  reason: collision with root package name */
    public int f7338r;

    public j() {
        int i10;
        int i11 = 4;
        while (true) {
            i10 = 40;
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (40 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 4;
        this.f7336p = new int[i13];
        this.f7337q = new Object[i13];
    }

    public final void c(int i10, E e10) {
        int i11 = this.f7338r;
        if (i11 == 0 || i10 > this.f7336p[i11 - 1]) {
            if (this.f7335o && i11 >= this.f7336p.length) {
                e();
            }
            int i12 = this.f7338r;
            if (i12 >= this.f7336p.length) {
                int i13 = (i12 + 1) * 4;
                int i14 = 4;
                while (true) {
                    if (i14 >= 32) {
                        break;
                    }
                    int i15 = (1 << i14) - 12;
                    if (i13 <= i15) {
                        i13 = i15;
                        break;
                    }
                    i14++;
                }
                int i16 = i13 / 4;
                int[] iArr = new int[i16];
                Object[] objArr = new Object[i16];
                int[] iArr2 = this.f7336p;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f7337q;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f7336p = iArr;
                this.f7337q = objArr;
            }
            this.f7336p[i12] = i10;
            this.f7337q[i12] = e10;
            this.f7338r = i12 + 1;
            return;
        }
        i(i10, e10);
    }

    /* renamed from: d */
    public final j<E> clone() {
        try {
            j<E> jVar = (j) super.clone();
            jVar.f7336p = (int[]) this.f7336p.clone();
            jVar.f7337q = (Object[]) this.f7337q.clone();
            return jVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final void e() {
        int i10 = this.f7338r;
        int[] iArr = this.f7336p;
        Object[] objArr = this.f7337q;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f7334s) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f7335o = false;
        this.f7338r = i11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r3 = r2.f7337q[r3];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(int r3, java.lang.Integer r4) {
        /*
            r2 = this;
            int[] r0 = r2.f7336p
            int r1 = r2.f7338r
            int r3 = n.e.l(r1, r3, r0)
            if (r3 < 0) goto L_0x0014
            java.lang.Object[] r0 = r2.f7337q
            r3 = r0[r3]
            java.lang.Object r0 = f7334s
            if (r3 != r0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            return r3
        L_0x0014:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n.j.h(int, java.lang.Integer):java.lang.Object");
    }

    public final void i(int i10, E e10) {
        int l = e.l(this.f7338r, i10, this.f7336p);
        if (l >= 0) {
            this.f7337q[l] = e10;
            return;
        }
        int i11 = ~l;
        int i12 = this.f7338r;
        if (i11 < i12) {
            Object[] objArr = this.f7337q;
            if (objArr[i11] == f7334s) {
                this.f7336p[i11] = i10;
                objArr[i11] = e10;
                return;
            }
        }
        if (this.f7335o && i12 >= this.f7336p.length) {
            e();
            i11 = ~e.l(this.f7338r, i10, this.f7336p);
        }
        int i13 = this.f7338r;
        if (i13 >= this.f7336p.length) {
            int i14 = (i13 + 1) * 4;
            int i15 = 4;
            while (true) {
                if (i15 >= 32) {
                    break;
                }
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
                i15++;
            }
            int i17 = i14 / 4;
            int[] iArr = new int[i17];
            Object[] objArr2 = new Object[i17];
            int[] iArr2 = this.f7336p;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f7337q;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f7336p = iArr;
            this.f7337q = objArr2;
        }
        int i18 = this.f7338r - i11;
        if (i18 != 0) {
            int[] iArr3 = this.f7336p;
            int i19 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i19, i18);
            Object[] objArr4 = this.f7337q;
            System.arraycopy(objArr4, i11, objArr4, i19, this.f7338r - i11);
        }
        this.f7336p[i11] = i10;
        this.f7337q[i11] = e10;
        this.f7338r++;
    }

    public final int j() {
        if (this.f7335o) {
            e();
        }
        return this.f7338r;
    }

    public final E k(int i10) {
        if (this.f7335o) {
            e();
        }
        return this.f7337q[i10];
    }

    public final String toString() {
        if (j() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f7338r * 28);
        sb.append('{');
        for (int i10 = 0; i10 < this.f7338r; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            if (this.f7335o) {
                e();
            }
            sb.append(this.f7336p[i10]);
            sb.append('=');
            Object k10 = k(i10);
            if (k10 != this) {
                sb.append(k10);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

package n;

public final class f<E> implements Cloneable {

    /* renamed from: s  reason: collision with root package name */
    public static final Object f7304s = new Object();

    /* renamed from: o  reason: collision with root package name */
    public boolean f7305o;

    /* renamed from: p  reason: collision with root package name */
    public long[] f7306p;

    /* renamed from: q  reason: collision with root package name */
    public Object[] f7307q;

    /* renamed from: r  reason: collision with root package name */
    public int f7308r;

    public f() {
        this(10);
    }

    public f(int i10) {
        this.f7305o = false;
        if (i10 == 0) {
            this.f7306p = e.f7296p;
            this.f7307q = e.f7297q;
            return;
        }
        int i11 = i10 * 8;
        int i12 = 4;
        while (true) {
            if (i12 >= 32) {
                break;
            }
            int i13 = (1 << i12) - 12;
            if (i11 <= i13) {
                i11 = i13;
                break;
            }
            i12++;
        }
        int i14 = i11 / 8;
        this.f7306p = new long[i14];
        this.f7307q = new Object[i14];
    }

    public final void c() {
        int i10 = this.f7308r;
        Object[] objArr = this.f7307q;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f7308r = 0;
        this.f7305o = false;
    }

    /* renamed from: d */
    public final f<E> clone() {
        try {
            f<E> fVar = (f) super.clone();
            fVar.f7306p = (long[]) this.f7306p.clone();
            fVar.f7307q = (Object[]) this.f7307q.clone();
            return fVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final void e() {
        int i10 = this.f7308r;
        long[] jArr = this.f7306p;
        Object[] objArr = this.f7307q;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f7304s) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f7305o = false;
        this.f7308r = i11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r3 = r2.f7307q[r3];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(long r3, java.lang.Long r5) {
        /*
            r2 = this;
            long[] r0 = r2.f7306p
            int r1 = r2.f7308r
            int r3 = n.e.m(r0, r1, r3)
            if (r3 < 0) goto L_0x0014
            java.lang.Object[] r4 = r2.f7307q
            r3 = r4[r3]
            java.lang.Object r4 = f7304s
            if (r3 != r4) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            return r3
        L_0x0014:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n.f.h(long, java.lang.Long):java.lang.Object");
    }

    public final void i(long j8, E e10) {
        int m10 = e.m(this.f7306p, this.f7308r, j8);
        if (m10 >= 0) {
            this.f7307q[m10] = e10;
            return;
        }
        int i10 = ~m10;
        int i11 = this.f7308r;
        if (i10 < i11) {
            Object[] objArr = this.f7307q;
            if (objArr[i10] == f7304s) {
                this.f7306p[i10] = j8;
                objArr[i10] = e10;
                return;
            }
        }
        if (this.f7305o && i11 >= this.f7306p.length) {
            e();
            i10 = ~e.m(this.f7306p, this.f7308r, j8);
        }
        int i12 = this.f7308r;
        if (i12 >= this.f7306p.length) {
            int i13 = (i12 + 1) * 8;
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
            int i16 = i13 / 8;
            long[] jArr = new long[i16];
            Object[] objArr2 = new Object[i16];
            long[] jArr2 = this.f7306p;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f7307q;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f7306p = jArr;
            this.f7307q = objArr2;
        }
        int i17 = this.f7308r - i10;
        if (i17 != 0) {
            long[] jArr3 = this.f7306p;
            int i18 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i18, i17);
            Object[] objArr4 = this.f7307q;
            System.arraycopy(objArr4, i10, objArr4, i18, this.f7308r - i10);
        }
        this.f7306p[i10] = j8;
        this.f7307q[i10] = e10;
        this.f7308r++;
    }

    public final int j() {
        if (this.f7305o) {
            e();
        }
        return this.f7308r;
    }

    public final E k(int i10) {
        if (this.f7305o) {
            e();
        }
        return this.f7307q[i10];
    }

    public final String toString() {
        if (j() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f7308r * 28);
        sb.append('{');
        for (int i10 = 0; i10 < this.f7308r; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            if (this.f7305o) {
                e();
            }
            sb.append(this.f7306p[i10]);
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

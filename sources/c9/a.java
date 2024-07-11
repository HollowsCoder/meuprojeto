package c9;

import java.util.Iterator;

public class a implements Iterable<Integer> {

    /* renamed from: o  reason: collision with root package name */
    public final int f2194o;

    /* renamed from: p  reason: collision with root package name */
    public final int f2195p;

    /* renamed from: q  reason: collision with root package name */
    public final int f2196q;

    public a(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i12 != Integer.MIN_VALUE) {
            this.f2194o = i10;
            if (i12 > 0) {
                if (i10 < i11) {
                    int i13 = i11 % i12;
                    int i14 = i10 % i12;
                    int i15 = ((i13 < 0 ? i13 + i12 : i13) - (i14 < 0 ? i14 + i12 : i14)) % i12;
                    i11 -= i15 < 0 ? i15 + i12 : i15;
                }
            } else if (i12 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            } else if (i10 > i11) {
                int i16 = -i12;
                int i17 = i10 % i16;
                int i18 = i11 % i16;
                int i19 = ((i17 < 0 ? i17 + i16 : i17) - (i18 < 0 ? i18 + i16 : i18)) % i16;
                i11 += i19 < 0 ? i19 + i16 : i19;
            }
            this.f2195p = i11;
            this.f2196q = i12;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r3 = (c9.a) r3;
        r0 = r3.f2194o;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof c9.a
            if (r0 == 0) goto L_0x0029
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            c9.a r0 = (c9.a) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0027
        L_0x0013:
            c9.a r3 = (c9.a) r3
            int r0 = r3.f2194o
            int r1 = r2.f2194o
            if (r1 != r0) goto L_0x0029
            int r0 = r2.f2195p
            int r1 = r3.f2195p
            if (r0 != r1) goto L_0x0029
            int r0 = r2.f2196q
            int r3 = r3.f2196q
            if (r0 != r3) goto L_0x0029
        L_0x0027:
            r3 = 1
            goto L_0x002a
        L_0x0029:
            r3 = 0
        L_0x002a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f2194o * 31) + this.f2195p) * 31) + this.f2196q;
    }

    public boolean isEmpty() {
        int i10 = this.f2196q;
        int i11 = this.f2195p;
        int i12 = this.f2194o;
        if (i10 > 0) {
            if (i12 > i11) {
                return true;
            }
        } else if (i12 < i11) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return new b(this.f2194o, this.f2195p, this.f2196q);
    }

    public String toString() {
        StringBuilder sb;
        int i10 = this.f2195p;
        int i11 = this.f2194o;
        int i12 = this.f2196q;
        if (i12 > 0) {
            sb.append(i11);
            sb.append("..");
            sb.append(i10);
            sb.append(" step ");
            sb.append(i12);
        } else {
            sb = new StringBuilder();
            sb.append(i11);
            sb.append(" downTo ");
            sb.append(i10);
            sb.append(" step ");
            sb.append(-i12);
        }
        return sb.toString();
    }
}

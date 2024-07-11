package com.google.android.gms.internal.clearcut;

import androidx.appcompat.widget.x0;
import b0.d;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class z extends p<Double> implements RandomAccess {

    /* renamed from: p  reason: collision with root package name */
    public double[] f2600p;

    /* renamed from: q  reason: collision with root package name */
    public int f2601q;

    static {
        new z().f2513o = false;
    }

    public z() {
        this(0, new double[10]);
    }

    public z(int i10, double[] dArr) {
        this.f2600p = dArr;
        this.f2601q = i10;
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        i(((Double) obj).doubleValue(), i10);
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        e();
        Charset charset = r0.f2537a;
        collection.getClass();
        if (!(collection instanceof z)) {
            return super.addAll(collection);
        }
        z zVar = (z) collection;
        int i10 = zVar.f2601q;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f2601q;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f2600p;
            if (i12 > dArr.length) {
                this.f2600p = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(zVar.f2600p, 0, this.f2600p, this.f2601q, zVar.f2601q);
            this.f2601q = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return super.equals(obj);
        }
        z zVar = (z) obj;
        if (this.f2601q != zVar.f2601q) {
            return false;
        }
        double[] dArr = zVar.f2600p;
        for (int i10 = 0; i10 < this.f2601q; i10++) {
            if (this.f2600p[i10] != dArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        k(i10);
        return Double.valueOf(this.f2600p[i10]);
    }

    public final void h(double d) {
        i(d, this.f2601q);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f2601q; i11++) {
            i10 = (i10 * 31) + r0.c(Double.doubleToLongBits(this.f2600p[i11]));
        }
        return i10;
    }

    public final void i(double d, int i10) {
        int i11;
        e();
        if (i10 < 0 || i10 > (i11 = this.f2601q)) {
            throw new IndexOutOfBoundsException(m(i10));
        }
        double[] dArr = this.f2600p;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[d.b(i11, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f2600p, i10, dArr2, i10 + 1, this.f2601q - i10);
            this.f2600p = dArr2;
        }
        this.f2600p[i10] = d;
        this.f2601q++;
        this.modCount++;
    }

    public final void k(int i10) {
        if (i10 < 0 || i10 >= this.f2601q) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    public final String m(int i10) {
        return x0.c(35, "Index:", i10, ", Size:", this.f2601q);
    }

    public final /* synthetic */ u0 r(int i10) {
        if (i10 >= this.f2601q) {
            return new z(this.f2601q, Arrays.copyOf(this.f2600p, i10));
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object remove(int i10) {
        e();
        k(i10);
        double[] dArr = this.f2600p;
        double d = dArr[i10];
        int i11 = this.f2601q;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, i11 - i10);
        }
        this.f2601q--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final boolean remove(Object obj) {
        e();
        for (int i10 = 0; i10 < this.f2601q; i10++) {
            if (obj.equals(Double.valueOf(this.f2600p[i10]))) {
                double[] dArr = this.f2600p;
                System.arraycopy(dArr, i10 + 1, dArr, i10, this.f2601q - i10);
                this.f2601q--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i10, int i11) {
        e();
        if (i11 >= i10) {
            double[] dArr = this.f2600p;
            System.arraycopy(dArr, i11, dArr, i10, this.f2601q - i11);
            this.f2601q -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        e();
        k(i10);
        double[] dArr = this.f2600p;
        double d = dArr[i10];
        dArr[i10] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f2601q;
    }
}

package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.x0;
import b0.d;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class p5 extends c5<Double> implements RandomAccess, p7 {

    /* renamed from: p  reason: collision with root package name */
    public double[] f2878p;

    /* renamed from: q  reason: collision with root package name */
    public int f2879q;

    static {
        new p5(0, new double[0]).f2654o = false;
    }

    public p5() {
        this(0, new double[10]);
    }

    public p5(int i10, double[] dArr) {
        this.f2878p = dArr;
        this.f2879q = i10;
    }

    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double doubleValue = ((Double) obj).doubleValue();
        e();
        if (i10 < 0 || i10 > (i11 = this.f2879q)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        double[] dArr = this.f2878p;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[d.b(i11, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f2878p, i10, dArr2, i10 + 1, this.f2879q - i10);
            this.f2878p = dArr2;
        }
        this.f2878p[i10] = doubleValue;
        this.f2879q++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Double) obj).doubleValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        e();
        Charset charset = n6.f2844a;
        collection.getClass();
        if (!(collection instanceof p5)) {
            return super.addAll(collection);
        }
        p5 p5Var = (p5) collection;
        int i10 = p5Var.f2879q;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f2879q;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f2878p;
            if (i12 > dArr.length) {
                this.f2878p = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(p5Var.f2878p, 0, this.f2878p, this.f2879q, p5Var.f2879q);
            this.f2879q = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5)) {
            return super.equals(obj);
        }
        p5 p5Var = (p5) obj;
        if (this.f2879q != p5Var.f2879q) {
            return false;
        }
        double[] dArr = p5Var.f2878p;
        for (int i10 = 0; i10 < this.f2879q; i10++) {
            if (Double.doubleToLongBits(this.f2878p[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i10) {
        i(i10);
        return Double.valueOf(this.f2878p[i10]);
    }

    public final void h(double d) {
        e();
        int i10 = this.f2879q;
        double[] dArr = this.f2878p;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[d.b(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f2878p = dArr2;
        }
        double[] dArr3 = this.f2878p;
        int i11 = this.f2879q;
        this.f2879q = i11 + 1;
        dArr3[i11] = d;
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f2879q; i11++) {
            i10 = (i10 * 31) + n6.a(Double.doubleToLongBits(this.f2878p[i11]));
        }
        return i10;
    }

    public final void i(int i10) {
        if (i10 < 0 || i10 >= this.f2879q) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i10 = this.f2879q;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f2878p[i11] == doubleValue) {
                return i11;
            }
        }
        return -1;
    }

    public final String k(int i10) {
        return x0.c(35, "Index:", i10, ", Size:", this.f2879q);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        e();
        i(i10);
        double[] dArr = this.f2878p;
        double d = dArr[i10];
        int i11 = this.f2879q;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f2879q--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final void removeRange(int i10, int i11) {
        e();
        if (i11 >= i10) {
            double[] dArr = this.f2878p;
            System.arraycopy(dArr, i11, dArr, i10, this.f2879q - i11);
            this.f2879q -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        e();
        i(i10);
        double[] dArr = this.f2878p;
        double d = dArr[i10];
        dArr[i10] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f2879q;
    }

    public final /* bridge */ /* synthetic */ m6 x(int i10) {
        if (i10 >= this.f2879q) {
            return new p5(this.f2879q, Arrays.copyOf(this.f2878p, i10));
        }
        throw new IllegalArgumentException();
    }
}

package com.google.android.gms.internal.vision;

import androidx.appcompat.widget.x0;
import b0.d;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class c1 extends r0<Double> implements h3, RandomAccess {

    /* renamed from: p  reason: collision with root package name */
    public double[] f3068p;

    /* renamed from: q  reason: collision with root package name */
    public int f3069q;

    static {
        new c1(0, new double[0]).f3154o = false;
    }

    public c1() {
        this(0, new double[10]);
    }

    public c1(int i10, double[] dArr) {
        this.f3068p = dArr;
        this.f3069q = i10;
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double doubleValue = ((Double) obj).doubleValue();
        e();
        if (i10 < 0 || i10 > (i11 = this.f3069q)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        double[] dArr = this.f3068p;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[d.b(i11, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f3068p, i10, dArr2, i10 + 1, this.f3069q - i10);
            this.f3068p = dArr2;
        }
        this.f3068p[i10] = doubleValue;
        this.f3069q++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        h(((Double) obj).doubleValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        e();
        Charset charset = u1.f3170a;
        collection.getClass();
        if (!(collection instanceof c1)) {
            return super.addAll(collection);
        }
        c1 c1Var = (c1) collection;
        int i10 = c1Var.f3069q;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f3069q;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f3068p;
            if (i12 > dArr.length) {
                this.f3068p = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(c1Var.f3068p, 0, this.f3068p, this.f3069q, c1Var.f3069q);
            this.f3069q = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final /* synthetic */ a2 d(int i10) {
        if (i10 >= this.f3069q) {
            return new c1(this.f3069q, Arrays.copyOf(this.f3068p, i10));
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return super.equals(obj);
        }
        c1 c1Var = (c1) obj;
        if (this.f3069q != c1Var.f3069q) {
            return false;
        }
        double[] dArr = c1Var.f3068p;
        for (int i10 = 0; i10 < this.f3069q; i10++) {
            if (Double.doubleToLongBits(this.f3068p[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        i(i10);
        return Double.valueOf(this.f3068p[i10]);
    }

    public final void h(double d) {
        e();
        int i10 = this.f3069q;
        double[] dArr = this.f3068p;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[d.b(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f3068p = dArr2;
        }
        double[] dArr3 = this.f3068p;
        int i11 = this.f3069q;
        this.f3069q = i11 + 1;
        dArr3[i11] = d;
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f3069q; i11++) {
            i10 = (i10 * 31) + u1.a(Double.doubleToLongBits(this.f3068p[i11]));
        }
        return i10;
    }

    public final void i(int i10) {
        if (i10 < 0 || i10 >= this.f3069q) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i10 = this.f3069q;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f3068p[i11] == doubleValue) {
                return i11;
            }
        }
        return -1;
    }

    public final String k(int i10) {
        return x0.c(35, "Index:", i10, ", Size:", this.f3069q);
    }

    public final /* synthetic */ Object remove(int i10) {
        e();
        i(i10);
        double[] dArr = this.f3068p;
        double d = dArr[i10];
        int i11 = this.f3069q;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f3069q--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final void removeRange(int i10, int i11) {
        e();
        if (i11 >= i10) {
            double[] dArr = this.f3068p;
            System.arraycopy(dArr, i11, dArr, i10, this.f3069q - i11);
            this.f3069q -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        e();
        i(i10);
        double[] dArr = this.f3068p;
        double d = dArr[i10];
        dArr[i10] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f3069q;
    }
}

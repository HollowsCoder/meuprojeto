package com.google.android.gms.internal.clearcut;

import androidx.appcompat.widget.x0;
import b0.d;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class q0 extends p<Integer> implements RandomAccess {

    /* renamed from: p  reason: collision with root package name */
    public int[] f2526p;

    /* renamed from: q  reason: collision with root package name */
    public int f2527q;

    static {
        new q0().f2513o = false;
    }

    public q0() {
        this(new int[10], 0);
    }

    public q0(int[] iArr, int i10) {
        this.f2526p = iArr;
        this.f2527q = i10;
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        m(i10, ((Integer) obj).intValue());
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        e();
        Charset charset = r0.f2537a;
        collection.getClass();
        if (!(collection instanceof q0)) {
            return super.addAll(collection);
        }
        q0 q0Var = (q0) collection;
        int i10 = q0Var.f2527q;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f2527q;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f2526p;
            if (i12 > iArr.length) {
                this.f2526p = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(q0Var.f2526p, 0, this.f2526p, this.f2527q, q0Var.f2527q);
            this.f2527q = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return super.equals(obj);
        }
        q0 q0Var = (q0) obj;
        if (this.f2527q != q0Var.f2527q) {
            return false;
        }
        int[] iArr = q0Var.f2526p;
        for (int i10 = 0; i10 < this.f2527q; i10++) {
            if (this.f2526p[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i10) {
        i(i10);
        return Integer.valueOf(this.f2526p[i10]);
    }

    public final void h(int i10) {
        m(this.f2527q, i10);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f2527q; i11++) {
            i10 = (i10 * 31) + this.f2526p[i11];
        }
        return i10;
    }

    public final void i(int i10) {
        if (i10 < 0 || i10 >= this.f2527q) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    public final String k(int i10) {
        return x0.c(35, "Index:", i10, ", Size:", this.f2527q);
    }

    public final void m(int i10, int i11) {
        int i12;
        e();
        if (i10 < 0 || i10 > (i12 = this.f2527q)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        int[] iArr = this.f2526p;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[d.b(i12, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f2526p, i10, iArr2, i10 + 1, this.f2527q - i10);
            this.f2526p = iArr2;
        }
        this.f2526p[i10] = i11;
        this.f2527q++;
        this.modCount++;
    }

    public final /* synthetic */ u0 r(int i10) {
        if (i10 >= this.f2527q) {
            return new q0(Arrays.copyOf(this.f2526p, i10), this.f2527q);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object remove(int i10) {
        e();
        i(i10);
        int[] iArr = this.f2526p;
        int i11 = iArr[i10];
        int i12 = this.f2527q;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, i12 - i10);
        }
        this.f2527q--;
        this.modCount++;
        return Integer.valueOf(i11);
    }

    public final boolean remove(Object obj) {
        e();
        for (int i10 = 0; i10 < this.f2527q; i10++) {
            if (obj.equals(Integer.valueOf(this.f2526p[i10]))) {
                int[] iArr = this.f2526p;
                System.arraycopy(iArr, i10 + 1, iArr, i10, this.f2527q - i10);
                this.f2527q--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i10, int i11) {
        e();
        if (i11 >= i10) {
            int[] iArr = this.f2526p;
            System.arraycopy(iArr, i11, iArr, i10, this.f2527q - i11);
            this.f2527q -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        e();
        i(i10);
        int[] iArr = this.f2526p;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    public final int size() {
        return this.f2527q;
    }
}

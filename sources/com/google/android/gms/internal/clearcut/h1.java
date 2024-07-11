package com.google.android.gms.internal.clearcut;

import androidx.appcompat.widget.x0;
import b0.d;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class h1 extends p<Long> implements RandomAccess {

    /* renamed from: p  reason: collision with root package name */
    public long[] f2448p;

    /* renamed from: q  reason: collision with root package name */
    public int f2449q;

    static {
        new h1().f2513o = false;
    }

    public h1() {
        this(new long[10], 0);
    }

    public h1(long[] jArr, int i10) {
        this.f2448p = jArr;
        this.f2449q = i10;
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        k(i10, ((Long) obj).longValue());
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        e();
        Charset charset = r0.f2537a;
        collection.getClass();
        if (!(collection instanceof h1)) {
            return super.addAll(collection);
        }
        h1 h1Var = (h1) collection;
        int i10 = h1Var.f2449q;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f2449q;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f2448p;
            if (i12 > jArr.length) {
                this.f2448p = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(h1Var.f2448p, 0, this.f2448p, this.f2449q, h1Var.f2449q);
            this.f2449q = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return super.equals(obj);
        }
        h1 h1Var = (h1) obj;
        if (this.f2449q != h1Var.f2449q) {
            return false;
        }
        long[] jArr = h1Var.f2448p;
        for (int i10 = 0; i10 < this.f2449q; i10++) {
            if (this.f2448p[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i10) {
        h(i10);
        return Long.valueOf(this.f2448p[i10]);
    }

    public final void h(int i10) {
        if (i10 < 0 || i10 >= this.f2449q) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f2449q; i11++) {
            i10 = (i10 * 31) + r0.c(this.f2448p[i11]);
        }
        return i10;
    }

    public final String i(int i10) {
        return x0.c(35, "Index:", i10, ", Size:", this.f2449q);
    }

    public final void k(int i10, long j8) {
        int i11;
        e();
        if (i10 < 0 || i10 > (i11 = this.f2449q)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        long[] jArr = this.f2448p;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[d.b(i11, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f2448p, i10, jArr2, i10 + 1, this.f2449q - i10);
            this.f2448p = jArr2;
        }
        this.f2448p[i10] = j8;
        this.f2449q++;
        this.modCount++;
    }

    public final void m(long j8) {
        k(this.f2449q, j8);
    }

    public final /* synthetic */ u0 r(int i10) {
        if (i10 >= this.f2449q) {
            return new h1(Arrays.copyOf(this.f2448p, i10), this.f2449q);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object remove(int i10) {
        e();
        h(i10);
        long[] jArr = this.f2448p;
        long j8 = jArr[i10];
        int i11 = this.f2449q;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, i11 - i10);
        }
        this.f2449q--;
        this.modCount++;
        return Long.valueOf(j8);
    }

    public final boolean remove(Object obj) {
        e();
        for (int i10 = 0; i10 < this.f2449q; i10++) {
            if (obj.equals(Long.valueOf(this.f2448p[i10]))) {
                long[] jArr = this.f2448p;
                System.arraycopy(jArr, i10 + 1, jArr, i10, this.f2449q - i10);
                this.f2449q--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i10, int i11) {
        e();
        if (i11 >= i10) {
            long[] jArr = this.f2448p;
            System.arraycopy(jArr, i11, jArr, i10, this.f2449q - i11);
            this.f2449q -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        e();
        h(i10);
        long[] jArr = this.f2448p;
        long j8 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j8);
    }

    public final int size() {
        return this.f2449q;
    }
}

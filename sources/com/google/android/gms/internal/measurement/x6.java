package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.x0;
import b0.d;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class x6 extends c5<Long> implements RandomAccess, l6, p7 {

    /* renamed from: r  reason: collision with root package name */
    public static final x6 f2988r;

    /* renamed from: p  reason: collision with root package name */
    public long[] f2989p;

    /* renamed from: q  reason: collision with root package name */
    public int f2990q;

    static {
        x6 x6Var = new x6(new long[0], 0);
        f2988r = x6Var;
        x6Var.f2654o = false;
    }

    public x6() {
        this(new long[10], 0);
    }

    public x6(long[] jArr, int i10) {
        this.f2989p = jArr;
        this.f2990q = i10;
    }

    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        e();
        if (i10 < 0 || i10 > (i11 = this.f2990q)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        long[] jArr = this.f2989p;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[d.b(i11, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f2989p, i10, jArr2, i10 + 1, this.f2990q - i10);
            this.f2989p = jArr2;
        }
        this.f2989p[i10] = longValue;
        this.f2990q++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Long) obj).longValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        e();
        Charset charset = n6.f2844a;
        collection.getClass();
        if (!(collection instanceof x6)) {
            return super.addAll(collection);
        }
        x6 x6Var = (x6) collection;
        int i10 = x6Var.f2990q;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f2990q;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f2989p;
            if (i12 > jArr.length) {
                this.f2989p = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(x6Var.f2989p, 0, this.f2989p, this.f2990q, x6Var.f2990q);
            this.f2990q = i12;
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
        if (!(obj instanceof x6)) {
            return super.equals(obj);
        }
        x6 x6Var = (x6) obj;
        if (this.f2990q != x6Var.f2990q) {
            return false;
        }
        long[] jArr = x6Var.f2989p;
        for (int i10 = 0; i10 < this.f2990q; i10++) {
            if (this.f2989p[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i10) {
        i(i10);
        return Long.valueOf(this.f2989p[i10]);
    }

    public final void h(long j8) {
        e();
        int i10 = this.f2990q;
        long[] jArr = this.f2989p;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[d.b(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f2989p = jArr2;
        }
        long[] jArr3 = this.f2989p;
        int i11 = this.f2990q;
        this.f2990q = i11 + 1;
        jArr3[i11] = j8;
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f2990q; i11++) {
            i10 = (i10 * 31) + n6.a(this.f2989p[i11]);
        }
        return i10;
    }

    public final void i(int i10) {
        if (i10 < 0 || i10 >= this.f2990q) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i10 = this.f2990q;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f2989p[i11] == longValue) {
                return i11;
            }
        }
        return -1;
    }

    public final String k(int i10) {
        return x0.c(35, "Index:", i10, ", Size:", this.f2990q);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        e();
        i(i10);
        long[] jArr = this.f2989p;
        long j8 = jArr[i10];
        int i11 = this.f2990q;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f2990q--;
        this.modCount++;
        return Long.valueOf(j8);
    }

    public final void removeRange(int i10, int i11) {
        e();
        if (i11 >= i10) {
            long[] jArr = this.f2989p;
            System.arraycopy(jArr, i11, jArr, i10, this.f2990q - i11);
            this.f2990q -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        e();
        i(i10);
        long[] jArr = this.f2989p;
        long j8 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j8);
    }

    public final int size() {
        return this.f2990q;
    }

    public final m6 x(int i10) {
        if (i10 >= this.f2990q) {
            return new x6(Arrays.copyOf(this.f2989p, i10), this.f2990q);
        }
        throw new IllegalArgumentException();
    }
}

package com.google.android.gms.internal.vision;

import androidx.appcompat.widget.x0;
import b0.d;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class l2 extends r0<Long> implements h3, RandomAccess {

    /* renamed from: p  reason: collision with root package name */
    public long[] f3113p;

    /* renamed from: q  reason: collision with root package name */
    public int f3114q;

    static {
        new l2(new long[0], 0).f3154o = false;
    }

    public l2() {
        this(new long[10], 0);
    }

    public l2(long[] jArr, int i10) {
        this.f3113p = jArr;
        this.f3114q = i10;
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        e();
        if (i10 < 0 || i10 > (i11 = this.f3114q)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        long[] jArr = this.f3113p;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[d.b(i11, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f3113p, i10, jArr2, i10 + 1, this.f3114q - i10);
            this.f3113p = jArr2;
        }
        this.f3113p[i10] = longValue;
        this.f3114q++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        h(((Long) obj).longValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        e();
        Charset charset = u1.f3170a;
        collection.getClass();
        if (!(collection instanceof l2)) {
            return super.addAll(collection);
        }
        l2 l2Var = (l2) collection;
        int i10 = l2Var.f3114q;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f3114q;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f3113p;
            if (i12 > jArr.length) {
                this.f3113p = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(l2Var.f3113p, 0, this.f3113p, this.f3114q, l2Var.f3114q);
            this.f3114q = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final /* synthetic */ a2 d(int i10) {
        if (i10 >= this.f3114q) {
            return new l2(Arrays.copyOf(this.f3113p, i10), this.f3114q);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return super.equals(obj);
        }
        l2 l2Var = (l2) obj;
        if (this.f3114q != l2Var.f3114q) {
            return false;
        }
        long[] jArr = l2Var.f3113p;
        for (int i10 = 0; i10 < this.f3114q; i10++) {
            if (this.f3113p[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i10) {
        i(i10);
        return Long.valueOf(this.f3113p[i10]);
    }

    public final void h(long j8) {
        e();
        int i10 = this.f3114q;
        long[] jArr = this.f3113p;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[d.b(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f3113p = jArr2;
        }
        long[] jArr3 = this.f3113p;
        int i11 = this.f3114q;
        this.f3114q = i11 + 1;
        jArr3[i11] = j8;
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f3114q; i11++) {
            i10 = (i10 * 31) + u1.a(this.f3113p[i11]);
        }
        return i10;
    }

    public final void i(int i10) {
        if (i10 < 0 || i10 >= this.f3114q) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i10 = this.f3114q;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f3113p[i11] == longValue) {
                return i11;
            }
        }
        return -1;
    }

    public final String k(int i10) {
        return x0.c(35, "Index:", i10, ", Size:", this.f3114q);
    }

    public final /* synthetic */ Object remove(int i10) {
        e();
        i(i10);
        long[] jArr = this.f3113p;
        long j8 = jArr[i10];
        int i11 = this.f3114q;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f3114q--;
        this.modCount++;
        return Long.valueOf(j8);
    }

    public final void removeRange(int i10, int i11) {
        e();
        if (i11 >= i10) {
            long[] jArr = this.f3113p;
            System.arraycopy(jArr, i11, jArr, i10, this.f3114q - i11);
            this.f3114q -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        e();
        i(i10);
        long[] jArr = this.f3113p;
        long j8 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j8);
    }

    public final int size() {
        return this.f3114q;
    }
}

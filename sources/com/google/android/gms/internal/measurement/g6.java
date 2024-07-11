package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.x0;
import b0.d;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class g6 extends c5<Integer> implements RandomAccess, k6, p7 {

    /* renamed from: r  reason: collision with root package name */
    public static final g6 f2718r;

    /* renamed from: p  reason: collision with root package name */
    public int[] f2719p;

    /* renamed from: q  reason: collision with root package name */
    public int f2720q;

    static {
        g6 g6Var = new g6(new int[0], 0);
        f2718r = g6Var;
        g6Var.f2654o = false;
    }

    public g6() {
        this(new int[10], 0);
    }

    public g6(int[] iArr, int i10) {
        this.f2719p = iArr;
        this.f2720q = i10;
    }

    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        e();
        if (i10 < 0 || i10 > (i11 = this.f2720q)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        int[] iArr = this.f2719p;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[d.b(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f2719p, i10, iArr2, i10 + 1, this.f2720q - i10);
            this.f2719p = iArr2;
        }
        this.f2719p[i10] = intValue;
        this.f2720q++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Integer) obj).intValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        e();
        Charset charset = n6.f2844a;
        collection.getClass();
        if (!(collection instanceof g6)) {
            return super.addAll(collection);
        }
        g6 g6Var = (g6) collection;
        int i10 = g6Var.f2720q;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f2720q;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f2719p;
            if (i12 > iArr.length) {
                this.f2719p = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(g6Var.f2719p, 0, this.f2719p, this.f2720q, g6Var.f2720q);
            this.f2720q = i12;
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
        if (!(obj instanceof g6)) {
            return super.equals(obj);
        }
        g6 g6Var = (g6) obj;
        if (this.f2720q != g6Var.f2720q) {
            return false;
        }
        int[] iArr = g6Var.f2719p;
        for (int i10 = 0; i10 < this.f2720q; i10++) {
            if (this.f2719p[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i10) {
        i(i10);
        return Integer.valueOf(this.f2719p[i10]);
    }

    public final void h(int i10) {
        e();
        int i11 = this.f2720q;
        int[] iArr = this.f2719p;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[d.b(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f2719p = iArr2;
        }
        int[] iArr3 = this.f2719p;
        int i12 = this.f2720q;
        this.f2720q = i12 + 1;
        iArr3[i12] = i10;
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f2720q; i11++) {
            i10 = (i10 * 31) + this.f2719p[i11];
        }
        return i10;
    }

    public final void i(int i10) {
        if (i10 < 0 || i10 >= this.f2720q) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i10 = this.f2720q;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f2719p[i11] == intValue) {
                return i11;
            }
        }
        return -1;
    }

    public final String k(int i10) {
        return x0.c(35, "Index:", i10, ", Size:", this.f2720q);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        e();
        i(i10);
        int[] iArr = this.f2719p;
        int i11 = iArr[i10];
        int i12 = this.f2720q;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f2720q--;
        this.modCount++;
        return Integer.valueOf(i11);
    }

    public final void removeRange(int i10, int i11) {
        e();
        if (i11 >= i10) {
            int[] iArr = this.f2719p;
            System.arraycopy(iArr, i11, iArr, i10, this.f2720q - i11);
            this.f2720q -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        e();
        i(i10);
        int[] iArr = this.f2719p;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    public final int size() {
        return this.f2720q;
    }

    public final m6 x(int i10) {
        if (i10 >= this.f2720q) {
            return new g6(Arrays.copyOf(this.f2719p, i10), this.f2720q);
        }
        throw new IllegalArgumentException();
    }
}

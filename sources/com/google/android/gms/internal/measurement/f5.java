package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.x0;
import b0.d;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class f5 extends c5<Boolean> implements RandomAccess, p7 {

    /* renamed from: p  reason: collision with root package name */
    public boolean[] f2696p;

    /* renamed from: q  reason: collision with root package name */
    public int f2697q;

    static {
        new f5(new boolean[0], 0).f2654o = false;
    }

    public f5() {
        this(new boolean[10], 0);
    }

    public f5(boolean[] zArr, int i10) {
        this.f2696p = zArr;
        this.f2697q = i10;
    }

    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        e();
        if (i10 < 0 || i10 > (i11 = this.f2697q)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        boolean[] zArr = this.f2696p;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[d.b(i11, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f2696p, i10, zArr2, i10 + 1, this.f2697q - i10);
            this.f2696p = zArr2;
        }
        this.f2696p[i10] = booleanValue;
        this.f2697q++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Boolean) obj).booleanValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        e();
        Charset charset = n6.f2844a;
        collection.getClass();
        if (!(collection instanceof f5)) {
            return super.addAll(collection);
        }
        f5 f5Var = (f5) collection;
        int i10 = f5Var.f2697q;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f2697q;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f2696p;
            if (i12 > zArr.length) {
                this.f2696p = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(f5Var.f2696p, 0, this.f2696p, this.f2697q, f5Var.f2697q);
            this.f2697q = i12;
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
        if (!(obj instanceof f5)) {
            return super.equals(obj);
        }
        f5 f5Var = (f5) obj;
        if (this.f2697q != f5Var.f2697q) {
            return false;
        }
        boolean[] zArr = f5Var.f2696p;
        for (int i10 = 0; i10 < this.f2697q; i10++) {
            if (this.f2696p[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i10) {
        i(i10);
        return Boolean.valueOf(this.f2696p[i10]);
    }

    public final void h(boolean z) {
        e();
        int i10 = this.f2697q;
        boolean[] zArr = this.f2696p;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[d.b(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f2696p = zArr2;
        }
        boolean[] zArr3 = this.f2696p;
        int i11 = this.f2697q;
        this.f2697q = i11 + 1;
        zArr3[i11] = z;
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f2697q; i11++) {
            i10 = (i10 * 31) + n6.b(this.f2696p[i11]);
        }
        return i10;
    }

    public final void i(int i10) {
        if (i10 < 0 || i10 >= this.f2697q) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.f2697q;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f2696p[i11] == booleanValue) {
                return i11;
            }
        }
        return -1;
    }

    public final String k(int i10) {
        return x0.c(35, "Index:", i10, ", Size:", this.f2697q);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        e();
        i(i10);
        boolean[] zArr = this.f2696p;
        boolean z = zArr[i10];
        int i11 = this.f2697q;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f2697q--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final void removeRange(int i10, int i11) {
        e();
        if (i11 >= i10) {
            boolean[] zArr = this.f2696p;
            System.arraycopy(zArr, i11, zArr, i10, this.f2697q - i11);
            this.f2697q -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        e();
        i(i10);
        boolean[] zArr = this.f2696p;
        boolean z = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f2697q;
    }

    public final /* bridge */ /* synthetic */ m6 x(int i10) {
        if (i10 >= this.f2697q) {
            return new f5(Arrays.copyOf(this.f2696p, i10), this.f2697q);
        }
        throw new IllegalArgumentException();
    }
}

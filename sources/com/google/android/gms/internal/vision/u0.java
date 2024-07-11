package com.google.android.gms.internal.vision;

import androidx.appcompat.widget.x0;
import b0.d;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class u0 extends r0<Boolean> implements h3, RandomAccess {

    /* renamed from: p  reason: collision with root package name */
    public boolean[] f3168p;

    /* renamed from: q  reason: collision with root package name */
    public int f3169q;

    static {
        new u0(new boolean[0], 0).f3154o = false;
    }

    public u0() {
        this(new boolean[10], 0);
    }

    public u0(boolean[] zArr, int i10) {
        this.f3168p = zArr;
        this.f3169q = i10;
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        e();
        if (i10 < 0 || i10 > (i11 = this.f3169q)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        boolean[] zArr = this.f3168p;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[d.b(i11, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f3168p, i10, zArr2, i10 + 1, this.f3169q - i10);
            this.f3168p = zArr2;
        }
        this.f3168p[i10] = booleanValue;
        this.f3169q++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        h(((Boolean) obj).booleanValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        e();
        Charset charset = u1.f3170a;
        collection.getClass();
        if (!(collection instanceof u0)) {
            return super.addAll(collection);
        }
        u0 u0Var = (u0) collection;
        int i10 = u0Var.f3169q;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f3169q;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f3168p;
            if (i12 > zArr.length) {
                this.f3168p = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(u0Var.f3168p, 0, this.f3168p, this.f3169q, u0Var.f3169q);
            this.f3169q = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final /* synthetic */ a2 d(int i10) {
        if (i10 >= this.f3169q) {
            return new u0(Arrays.copyOf(this.f3168p, i10), this.f3169q);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return super.equals(obj);
        }
        u0 u0Var = (u0) obj;
        if (this.f3169q != u0Var.f3169q) {
            return false;
        }
        boolean[] zArr = u0Var.f3168p;
        for (int i10 = 0; i10 < this.f3169q; i10++) {
            if (this.f3168p[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        i(i10);
        return Boolean.valueOf(this.f3168p[i10]);
    }

    public final void h(boolean z) {
        e();
        int i10 = this.f3169q;
        boolean[] zArr = this.f3168p;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[d.b(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f3168p = zArr2;
        }
        boolean[] zArr3 = this.f3168p;
        int i11 = this.f3169q;
        this.f3169q = i11 + 1;
        zArr3[i11] = z;
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f3169q; i11++) {
            i10 = (i10 * 31) + u1.b(this.f3168p[i11]);
        }
        return i10;
    }

    public final void i(int i10) {
        if (i10 < 0 || i10 >= this.f3169q) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.f3169q;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f3168p[i11] == booleanValue) {
                return i11;
            }
        }
        return -1;
    }

    public final String k(int i10) {
        return x0.c(35, "Index:", i10, ", Size:", this.f3169q);
    }

    public final /* synthetic */ Object remove(int i10) {
        e();
        i(i10);
        boolean[] zArr = this.f3168p;
        boolean z = zArr[i10];
        int i11 = this.f3169q;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f3169q--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final void removeRange(int i10, int i11) {
        e();
        if (i11 >= i10) {
            boolean[] zArr = this.f3168p;
            System.arraycopy(zArr, i11, zArr, i10, this.f3169q - i11);
            this.f3169q -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        e();
        i(i10);
        boolean[] zArr = this.f3168p;
        boolean z = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f3169q;
    }
}

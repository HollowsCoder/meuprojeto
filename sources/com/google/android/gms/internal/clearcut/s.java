package com.google.android.gms.internal.clearcut;

import androidx.appcompat.widget.x0;
import b0.d;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class s extends p<Boolean> implements RandomAccess {

    /* renamed from: p  reason: collision with root package name */
    public boolean[] f2541p;

    /* renamed from: q  reason: collision with root package name */
    public int f2542q;

    static {
        new s().f2513o = false;
    }

    public s() {
        this(new boolean[10], 0);
    }

    public s(boolean[] zArr, int i10) {
        this.f2541p = zArr;
        this.f2542q = i10;
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        i(i10, ((Boolean) obj).booleanValue());
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        e();
        Charset charset = r0.f2537a;
        collection.getClass();
        if (!(collection instanceof s)) {
            return super.addAll(collection);
        }
        s sVar = (s) collection;
        int i10 = sVar.f2542q;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f2542q;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f2541p;
            if (i12 > zArr.length) {
                this.f2541p = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(sVar.f2541p, 0, this.f2541p, this.f2542q, sVar.f2542q);
            this.f2542q = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return super.equals(obj);
        }
        s sVar = (s) obj;
        if (this.f2542q != sVar.f2542q) {
            return false;
        }
        boolean[] zArr = sVar.f2541p;
        for (int i10 = 0; i10 < this.f2542q; i10++) {
            if (this.f2541p[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        k(i10);
        return Boolean.valueOf(this.f2541p[i10]);
    }

    public final void h(boolean z) {
        i(this.f2542q, z);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f2542q; i11++) {
            i10 = (i10 * 31) + r0.b(this.f2541p[i11]);
        }
        return i10;
    }

    public final void i(int i10, boolean z) {
        int i11;
        e();
        if (i10 < 0 || i10 > (i11 = this.f2542q)) {
            throw new IndexOutOfBoundsException(m(i10));
        }
        boolean[] zArr = this.f2541p;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[d.b(i11, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f2541p, i10, zArr2, i10 + 1, this.f2542q - i10);
            this.f2541p = zArr2;
        }
        this.f2541p[i10] = z;
        this.f2542q++;
        this.modCount++;
    }

    public final void k(int i10) {
        if (i10 < 0 || i10 >= this.f2542q) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    public final String m(int i10) {
        return x0.c(35, "Index:", i10, ", Size:", this.f2542q);
    }

    public final /* synthetic */ u0 r(int i10) {
        if (i10 >= this.f2542q) {
            return new s(Arrays.copyOf(this.f2541p, i10), this.f2542q);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object remove(int i10) {
        e();
        k(i10);
        boolean[] zArr = this.f2541p;
        boolean z = zArr[i10];
        int i11 = this.f2542q;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, i11 - i10);
        }
        this.f2542q--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final boolean remove(Object obj) {
        e();
        for (int i10 = 0; i10 < this.f2542q; i10++) {
            if (obj.equals(Boolean.valueOf(this.f2541p[i10]))) {
                boolean[] zArr = this.f2541p;
                System.arraycopy(zArr, i10 + 1, zArr, i10, this.f2542q - i10);
                this.f2542q--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i10, int i11) {
        e();
        if (i11 >= i10) {
            boolean[] zArr = this.f2541p;
            System.arraycopy(zArr, i11, zArr, i10, this.f2542q - i11);
            this.f2542q -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        e();
        k(i10);
        boolean[] zArr = this.f2541p;
        boolean z = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f2542q;
    }
}

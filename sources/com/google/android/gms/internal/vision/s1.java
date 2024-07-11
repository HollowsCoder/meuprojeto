package com.google.android.gms.internal.vision;

import androidx.appcompat.widget.x0;
import b0.d;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class s1 extends r0<Integer> implements h3, RandomAccess {

    /* renamed from: r  reason: collision with root package name */
    public static final s1 f3161r;

    /* renamed from: p  reason: collision with root package name */
    public int[] f3162p;

    /* renamed from: q  reason: collision with root package name */
    public int f3163q;

    static {
        s1 s1Var = new s1(new int[0], 0);
        f3161r = s1Var;
        s1Var.f3154o = false;
    }

    public s1() {
        this(new int[10], 0);
    }

    public s1(int[] iArr, int i10) {
        this.f3162p = iArr;
        this.f3163q = i10;
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        e();
        if (i10 < 0 || i10 > (i11 = this.f3163q)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        int[] iArr = this.f3162p;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[d.b(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f3162p, i10, iArr2, i10 + 1, this.f3163q - i10);
            this.f3162p = iArr2;
        }
        this.f3162p[i10] = intValue;
        this.f3163q++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        h(((Integer) obj).intValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        e();
        Charset charset = u1.f3170a;
        collection.getClass();
        if (!(collection instanceof s1)) {
            return super.addAll(collection);
        }
        s1 s1Var = (s1) collection;
        int i10 = s1Var.f3163q;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f3163q;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f3162p;
            if (i12 > iArr.length) {
                this.f3162p = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(s1Var.f3162p, 0, this.f3162p, this.f3163q, s1Var.f3163q);
            this.f3163q = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final /* synthetic */ a2 d(int i10) {
        if (i10 >= this.f3163q) {
            return new s1(Arrays.copyOf(this.f3162p, i10), this.f3163q);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return super.equals(obj);
        }
        s1 s1Var = (s1) obj;
        if (this.f3163q != s1Var.f3163q) {
            return false;
        }
        int[] iArr = s1Var.f3162p;
        for (int i10 = 0; i10 < this.f3163q; i10++) {
            if (this.f3162p[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i10) {
        i(i10);
        return Integer.valueOf(this.f3162p[i10]);
    }

    public final void h(int i10) {
        e();
        int i11 = this.f3163q;
        int[] iArr = this.f3162p;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[d.b(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f3162p = iArr2;
        }
        int[] iArr3 = this.f3162p;
        int i12 = this.f3163q;
        this.f3163q = i12 + 1;
        iArr3[i12] = i10;
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f3163q; i11++) {
            i10 = (i10 * 31) + this.f3162p[i11];
        }
        return i10;
    }

    public final void i(int i10) {
        if (i10 < 0 || i10 >= this.f3163q) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i10 = this.f3163q;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f3162p[i11] == intValue) {
                return i11;
            }
        }
        return -1;
    }

    public final String k(int i10) {
        return x0.c(35, "Index:", i10, ", Size:", this.f3163q);
    }

    public final /* synthetic */ Object remove(int i10) {
        e();
        i(i10);
        int[] iArr = this.f3162p;
        int i11 = iArr[i10];
        int i12 = this.f3163q;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f3163q--;
        this.modCount++;
        return Integer.valueOf(i11);
    }

    public final void removeRange(int i10, int i11) {
        e();
        if (i11 >= i10) {
            int[] iArr = this.f3162p;
            System.arraycopy(iArr, i11, iArr, i10, this.f3163q - i11);
            this.f3163q -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        e();
        i(i10);
        int[] iArr = this.f3162p;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    public final int size() {
        return this.f3163q;
    }
}

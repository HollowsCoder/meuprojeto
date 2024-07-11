package com.google.android.gms.internal.clearcut;

import androidx.appcompat.widget.x0;
import b0.d;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class n0 extends p<Float> implements RandomAccess {

    /* renamed from: p  reason: collision with root package name */
    public float[] f2504p;

    /* renamed from: q  reason: collision with root package name */
    public int f2505q;

    static {
        new n0().f2513o = false;
    }

    public n0() {
        this(0, new float[10]);
    }

    public n0(int i10, float[] fArr) {
        this.f2504p = fArr;
        this.f2505q = i10;
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        i(i10, ((Float) obj).floatValue());
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        e();
        Charset charset = r0.f2537a;
        collection.getClass();
        if (!(collection instanceof n0)) {
            return super.addAll(collection);
        }
        n0 n0Var = (n0) collection;
        int i10 = n0Var.f2505q;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f2505q;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.f2504p;
            if (i12 > fArr.length) {
                this.f2504p = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(n0Var.f2504p, 0, this.f2504p, this.f2505q, n0Var.f2505q);
            this.f2505q = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return super.equals(obj);
        }
        n0 n0Var = (n0) obj;
        if (this.f2505q != n0Var.f2505q) {
            return false;
        }
        float[] fArr = n0Var.f2504p;
        for (int i10 = 0; i10 < this.f2505q; i10++) {
            if (this.f2504p[i10] != fArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        k(i10);
        return Float.valueOf(this.f2504p[i10]);
    }

    public final void h(float f10) {
        i(this.f2505q, f10);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f2505q; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f2504p[i11]);
        }
        return i10;
    }

    public final void i(int i10, float f10) {
        int i11;
        e();
        if (i10 < 0 || i10 > (i11 = this.f2505q)) {
            throw new IndexOutOfBoundsException(m(i10));
        }
        float[] fArr = this.f2504p;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[d.b(i11, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f2504p, i10, fArr2, i10 + 1, this.f2505q - i10);
            this.f2504p = fArr2;
        }
        this.f2504p[i10] = f10;
        this.f2505q++;
        this.modCount++;
    }

    public final void k(int i10) {
        if (i10 < 0 || i10 >= this.f2505q) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    public final String m(int i10) {
        return x0.c(35, "Index:", i10, ", Size:", this.f2505q);
    }

    public final /* synthetic */ u0 r(int i10) {
        if (i10 >= this.f2505q) {
            return new n0(this.f2505q, Arrays.copyOf(this.f2504p, i10));
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object remove(int i10) {
        e();
        k(i10);
        float[] fArr = this.f2504p;
        float f10 = fArr[i10];
        int i11 = this.f2505q;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, i11 - i10);
        }
        this.f2505q--;
        this.modCount++;
        return Float.valueOf(f10);
    }

    public final boolean remove(Object obj) {
        e();
        for (int i10 = 0; i10 < this.f2505q; i10++) {
            if (obj.equals(Float.valueOf(this.f2504p[i10]))) {
                float[] fArr = this.f2504p;
                System.arraycopy(fArr, i10 + 1, fArr, i10, this.f2505q - i10);
                this.f2505q--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i10, int i11) {
        e();
        if (i11 >= i10) {
            float[] fArr = this.f2504p;
            System.arraycopy(fArr, i11, fArr, i10, this.f2505q - i11);
            this.f2505q -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        e();
        k(i10);
        float[] fArr = this.f2504p;
        float f10 = fArr[i10];
        fArr[i10] = floatValue;
        return Float.valueOf(f10);
    }

    public final int size() {
        return this.f2505q;
    }
}

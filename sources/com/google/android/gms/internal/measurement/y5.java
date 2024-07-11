package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.x0;
import b0.d;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class y5 extends c5<Float> implements RandomAccess, p7 {

    /* renamed from: p  reason: collision with root package name */
    public float[] f3008p;

    /* renamed from: q  reason: collision with root package name */
    public int f3009q;

    static {
        new y5(0, new float[0]).f2654o = false;
    }

    public y5() {
        this(0, new float[10]);
    }

    public y5(int i10, float[] fArr) {
        this.f3008p = fArr;
        this.f3009q = i10;
    }

    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float floatValue = ((Float) obj).floatValue();
        e();
        if (i10 < 0 || i10 > (i11 = this.f3009q)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        float[] fArr = this.f3008p;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[d.b(i11, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f3008p, i10, fArr2, i10 + 1, this.f3009q - i10);
            this.f3008p = fArr2;
        }
        this.f3008p[i10] = floatValue;
        this.f3009q++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Float) obj).floatValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        e();
        Charset charset = n6.f2844a;
        collection.getClass();
        if (!(collection instanceof y5)) {
            return super.addAll(collection);
        }
        y5 y5Var = (y5) collection;
        int i10 = y5Var.f3009q;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f3009q;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.f3008p;
            if (i12 > fArr.length) {
                this.f3008p = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(y5Var.f3008p, 0, this.f3008p, this.f3009q, y5Var.f3009q);
            this.f3009q = i12;
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
        if (!(obj instanceof y5)) {
            return super.equals(obj);
        }
        y5 y5Var = (y5) obj;
        if (this.f3009q != y5Var.f3009q) {
            return false;
        }
        float[] fArr = y5Var.f3008p;
        for (int i10 = 0; i10 < this.f3009q; i10++) {
            if (Float.floatToIntBits(this.f3008p[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i10) {
        i(i10);
        return Float.valueOf(this.f3008p[i10]);
    }

    public final void h(float f10) {
        e();
        int i10 = this.f3009q;
        float[] fArr = this.f3008p;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[d.b(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f3008p = fArr2;
        }
        float[] fArr3 = this.f3008p;
        int i11 = this.f3009q;
        this.f3009q = i11 + 1;
        fArr3[i11] = f10;
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f3009q; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f3008p[i11]);
        }
        return i10;
    }

    public final void i(int i10) {
        if (i10 < 0 || i10 >= this.f3009q) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i10 = this.f3009q;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f3008p[i11] == floatValue) {
                return i11;
            }
        }
        return -1;
    }

    public final String k(int i10) {
        return x0.c(35, "Index:", i10, ", Size:", this.f3009q);
    }

    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        e();
        i(i10);
        float[] fArr = this.f3008p;
        float f10 = fArr[i10];
        int i11 = this.f3009q;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f3009q--;
        this.modCount++;
        return Float.valueOf(f10);
    }

    public final void removeRange(int i10, int i11) {
        e();
        if (i11 >= i10) {
            float[] fArr = this.f3008p;
            System.arraycopy(fArr, i11, fArr, i10, this.f3009q - i11);
            this.f3009q -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        e();
        i(i10);
        float[] fArr = this.f3008p;
        float f10 = fArr[i10];
        fArr[i10] = floatValue;
        return Float.valueOf(f10);
    }

    public final int size() {
        return this.f3009q;
    }

    public final /* bridge */ /* synthetic */ m6 x(int i10) {
        if (i10 >= this.f3009q) {
            return new y5(this.f3009q, Arrays.copyOf(this.f3008p, i10));
        }
        throw new IllegalArgumentException();
    }
}

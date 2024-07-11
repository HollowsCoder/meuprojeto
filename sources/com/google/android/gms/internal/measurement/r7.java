package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.x0;
import b0.d;
import java.util.Arrays;
import java.util.RandomAccess;

public final class r7<E> extends c5<E> implements RandomAccess {

    /* renamed from: r  reason: collision with root package name */
    public static final r7<Object> f2908r;

    /* renamed from: p  reason: collision with root package name */
    public E[] f2909p;

    /* renamed from: q  reason: collision with root package name */
    public int f2910q;

    static {
        r7<Object> r7Var = new r7<>(0, new Object[0]);
        f2908r = r7Var;
        r7Var.f2654o = false;
    }

    public r7(int i10, Object[] objArr) {
        this.f2909p = objArr;
        this.f2910q = i10;
    }

    public final void add(int i10, E e10) {
        int i11;
        e();
        if (i10 < 0 || i10 > (i11 = this.f2910q)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        E[] eArr = this.f2909p;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] eArr2 = new Object[d.b(i11, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i10);
            System.arraycopy(this.f2909p, i10, eArr2, i10 + 1, this.f2910q - i10);
            this.f2909p = eArr2;
        }
        this.f2909p[i10] = e10;
        this.f2910q++;
        this.modCount++;
    }

    public final boolean add(E e10) {
        e();
        int i10 = this.f2910q;
        E[] eArr = this.f2909p;
        if (i10 == eArr.length) {
            this.f2909p = Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f2909p;
        int i11 = this.f2910q;
        this.f2910q = i11 + 1;
        eArr2[i11] = e10;
        this.modCount++;
        return true;
    }

    public final E get(int i10) {
        h(i10);
        return this.f2909p[i10];
    }

    public final void h(int i10) {
        if (i10 < 0 || i10 >= this.f2910q) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    public final String i(int i10) {
        return x0.c(35, "Index:", i10, ", Size:", this.f2910q);
    }

    public final E remove(int i10) {
        e();
        h(i10);
        E[] eArr = this.f2909p;
        E e10 = eArr[i10];
        int i11 = this.f2910q;
        if (i10 < i11 - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f2910q--;
        this.modCount++;
        return e10;
    }

    public final E set(int i10, E e10) {
        e();
        h(i10);
        E[] eArr = this.f2909p;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        this.modCount++;
        return e11;
    }

    public final int size() {
        return this.f2910q;
    }

    public final /* bridge */ /* synthetic */ m6 x(int i10) {
        if (i10 >= this.f2910q) {
            return new r7(this.f2910q, Arrays.copyOf(this.f2909p, i10));
        }
        throw new IllegalArgumentException();
    }
}

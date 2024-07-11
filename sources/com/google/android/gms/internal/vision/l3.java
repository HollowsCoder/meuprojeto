package com.google.android.gms.internal.vision;

import androidx.appcompat.widget.x0;
import b0.d;
import java.util.Arrays;
import java.util.RandomAccess;

public final class l3<E> extends r0<E> implements RandomAccess {

    /* renamed from: r  reason: collision with root package name */
    public static final l3<Object> f3115r;

    /* renamed from: p  reason: collision with root package name */
    public E[] f3116p;

    /* renamed from: q  reason: collision with root package name */
    public int f3117q;

    static {
        l3<Object> l3Var = new l3<>(0, new Object[0]);
        f3115r = l3Var;
        l3Var.f3154o = false;
    }

    public l3(int i10, Object[] objArr) {
        this.f3116p = objArr;
        this.f3117q = i10;
    }

    public final void add(int i10, E e10) {
        int i11;
        e();
        if (i10 < 0 || i10 > (i11 = this.f3117q)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        E[] eArr = this.f3116p;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] eArr2 = new Object[d.b(i11, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i10);
            System.arraycopy(this.f3116p, i10, eArr2, i10 + 1, this.f3117q - i10);
            this.f3116p = eArr2;
        }
        this.f3116p[i10] = e10;
        this.f3117q++;
        this.modCount++;
    }

    public final boolean add(E e10) {
        e();
        int i10 = this.f3117q;
        E[] eArr = this.f3116p;
        if (i10 == eArr.length) {
            this.f3116p = Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f3116p;
        int i11 = this.f3117q;
        this.f3117q = i11 + 1;
        eArr2[i11] = e10;
        this.modCount++;
        return true;
    }

    public final /* synthetic */ a2 d(int i10) {
        if (i10 >= this.f3117q) {
            return new l3(this.f3117q, Arrays.copyOf(this.f3116p, i10));
        }
        throw new IllegalArgumentException();
    }

    public final E get(int i10) {
        h(i10);
        return this.f3116p[i10];
    }

    public final void h(int i10) {
        if (i10 < 0 || i10 >= this.f3117q) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    public final String i(int i10) {
        return x0.c(35, "Index:", i10, ", Size:", this.f3117q);
    }

    public final E remove(int i10) {
        e();
        h(i10);
        E[] eArr = this.f3116p;
        E e10 = eArr[i10];
        int i11 = this.f3117q;
        if (i10 < i11 - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f3117q--;
        this.modCount++;
        return e10;
    }

    public final E set(int i10, E e10) {
        e();
        h(i10);
        E[] eArr = this.f3116p;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        this.modCount++;
        return e11;
    }

    public final int size() {
        return this.f3117q;
    }
}

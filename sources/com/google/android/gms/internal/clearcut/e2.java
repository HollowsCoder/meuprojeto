package com.google.android.gms.internal.clearcut;

import java.util.ArrayList;
import java.util.List;

public final class e2<E> extends p<E> {

    /* renamed from: q  reason: collision with root package name */
    public static final e2<Object> f2413q;

    /* renamed from: p  reason: collision with root package name */
    public final List<E> f2414p;

    static {
        e2<Object> e2Var = new e2<>(new ArrayList(10));
        f2413q = e2Var;
        e2Var.f2513o = false;
    }

    public e2(ArrayList arrayList) {
        this.f2414p = arrayList;
    }

    public final void add(int i10, E e10) {
        e();
        this.f2414p.add(i10, e10);
        this.modCount++;
    }

    public final E get(int i10) {
        return this.f2414p.get(i10);
    }

    public final /* synthetic */ u0 r(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f2414p);
            return new e2(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final E remove(int i10) {
        e();
        E remove = this.f2414p.remove(i10);
        this.modCount++;
        return remove;
    }

    public final E set(int i10, E e10) {
        e();
        E e11 = this.f2414p.set(i10, e10);
        this.modCount++;
        return e11;
    }

    public final int size() {
        return this.f2414p.size();
    }
}

package com.google.android.gms.internal.measurement;

import com.karumi.dexter.BuildConfig;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import r2.a;

public final class s6 extends c5<String> implements RandomAccess, t6 {

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f2922p;

    static {
        new s6(10).f2654o = false;
    }

    public s6() {
        this(10);
    }

    public s6(int i10) {
        this.f2922p = new ArrayList(i10);
    }

    public s6(ArrayList<Object> arrayList) {
        this.f2922p = arrayList;
    }

    public final Object T(int i10) {
        return this.f2922p.get(i10);
    }

    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        e();
        this.f2922p.add(i10, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i10, Collection<? extends String> collection) {
        e();
        if (collection instanceof t6) {
            collection = ((t6) collection).f();
        }
        boolean addAll = this.f2922p.addAll(i10, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final void clear() {
        e();
        this.f2922p.clear();
        this.modCount++;
    }

    public final List<?> f() {
        return Collections.unmodifiableList(this.f2922p);
    }

    public final t6 g() {
        if (this.f2654o) {
            return new j8(this);
        }
        return this;
    }

    /* renamed from: h */
    public final String get(int i10) {
        String str;
        ArrayList arrayList = this.f2922p;
        Object obj = arrayList.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof k5) {
            k5 k5Var = (k5) obj;
            Charset charset = n6.f2844a;
            if (k5Var.i() == 0) {
                str = BuildConfig.FLAVOR;
            } else {
                str = k5Var.n(charset);
            }
            if (k5Var.p()) {
                arrayList.set(i10, str);
            }
            return str;
        }
        byte[] bArr = (byte[]) obj;
        String str2 = new String(bArr, n6.f2844a);
        a aVar = q8.f2897a;
        int length = bArr.length;
        q8.f2897a.getClass();
        if (a.c(bArr, 0, length)) {
            arrayList.set(i10, str2);
        }
        return str2;
    }

    public final Object remove(int i10) {
        e();
        Object remove = this.f2922p.remove(i10);
        this.modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof k5)) {
            return new String((byte[]) remove, n6.f2844a);
        }
        k5 k5Var = (k5) remove;
        Charset charset = n6.f2844a;
        if (k5Var.i() == 0) {
            return BuildConfig.FLAVOR;
        }
        return k5Var.n(charset);
    }

    public final void s(k5 k5Var) {
        e();
        this.f2922p.add(k5Var);
        this.modCount++;
    }

    public final Object set(int i10, Object obj) {
        e();
        Object obj2 = this.f2922p.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof k5)) {
            return new String((byte[]) obj2, n6.f2844a);
        }
        k5 k5Var = (k5) obj2;
        Charset charset = n6.f2844a;
        if (k5Var.i() == 0) {
            return BuildConfig.FLAVOR;
        }
        return k5Var.n(charset);
    }

    public final int size() {
        return this.f2922p.size();
    }

    public final /* bridge */ /* synthetic */ m6 x(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f2922p);
            return new s6((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }
}

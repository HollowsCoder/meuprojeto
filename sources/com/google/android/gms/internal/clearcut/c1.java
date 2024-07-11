package com.google.android.gms.internal.clearcut;

import androidx.activity.result.c;
import com.karumi.dexter.BuildConfig;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class c1 extends p<String> implements d1, RandomAccess {

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f2395p;

    static {
        new c1(10).f2513o = false;
    }

    public c1(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    public c1(ArrayList<Object> arrayList) {
        this.f2395p = arrayList;
    }

    public final List<?> E() {
        return Collections.unmodifiableList(this.f2395p);
    }

    public final d1 S() {
        if (this.f2513o) {
            return new x2(this);
        }
        return this;
    }

    public final Object V(int i10) {
        return this.f2395p.get(i10);
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        e();
        this.f2395p.add(i10, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i10, Collection<? extends String> collection) {
        e();
        if (collection instanceof d1) {
            collection = ((d1) collection).E();
        }
        boolean addAll = this.f2395p.addAll(i10, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final void clear() {
        e();
        this.f2395p.clear();
        this.modCount++;
    }

    public final Object get(int i10) {
        String str;
        ArrayList arrayList = this.f2395p;
        Object obj = arrayList.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            uVar.getClass();
            Charset charset = r0.f2537a;
            if (uVar.size() == 0) {
                str = BuildConfig.FLAVOR;
            } else {
                str = uVar.h(charset);
            }
            if (uVar.k()) {
                arrayList.set(i10, str);
            }
            return str;
        }
        byte[] bArr = (byte[]) obj;
        String str2 = new String(bArr, r0.f2537a);
        c cVar = c3.f2396a;
        boolean z = false;
        if (c3.f2396a.A(bArr, 0, bArr.length) == 0) {
            z = true;
        }
        if (z) {
            arrayList.set(i10, str2);
        }
        return str2;
    }

    public final /* synthetic */ u0 r(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f2395p);
            return new c1((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final Object remove(int i10) {
        e();
        Object remove = this.f2395p.remove(i10);
        this.modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof u)) {
            return new String((byte[]) remove, r0.f2537a);
        }
        u uVar = (u) remove;
        uVar.getClass();
        Charset charset = r0.f2537a;
        if (uVar.size() == 0) {
            return BuildConfig.FLAVOR;
        }
        return uVar.h(charset);
    }

    public final Object set(int i10, Object obj) {
        e();
        Object obj2 = this.f2395p.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof u)) {
            return new String((byte[]) obj2, r0.f2537a);
        }
        u uVar = (u) obj2;
        uVar.getClass();
        Charset charset = r0.f2537a;
        if (uVar.size() == 0) {
            return BuildConfig.FLAVOR;
        }
        return uVar.h(charset);
    }

    public final int size() {
        return this.f2395p.size();
    }
}

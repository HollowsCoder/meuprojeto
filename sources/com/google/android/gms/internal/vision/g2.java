package com.google.android.gms.internal.vision;

import androidx.activity.result.c;
import com.karumi.dexter.BuildConfig;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class g2 extends r0<String> implements j2, RandomAccess {

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f3093p;

    static {
        new g2(10).f3154o = false;
    }

    public g2(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    public g2(ArrayList<Object> arrayList) {
        this.f3093p = arrayList;
    }

    public final void G(w0 w0Var) {
        e();
        this.f3093p.add(w0Var);
        this.modCount++;
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        e();
        this.f3093p.add(i10, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i10, Collection<? extends String> collection) {
        e();
        if (collection instanceof j2) {
            collection = ((j2) collection).b();
        }
        boolean addAll = this.f3093p.addAll(i10, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final List<?> b() {
        return Collections.unmodifiableList(this.f3093p);
    }

    public final j2 c() {
        if (this.f3154o) {
            return new a4(this);
        }
        return this;
    }

    public final void clear() {
        e();
        this.f3093p.clear();
        this.modCount++;
    }

    public final /* synthetic */ a2 d(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f3093p);
            return new g2((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final Object get(int i10) {
        String str;
        ArrayList arrayList = this.f3093p;
        Object obj = arrayList.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            w0Var.getClass();
            Charset charset = u1.f3170a;
            if (w0Var.p() == 0) {
                str = BuildConfig.FLAVOR;
            } else {
                str = w0Var.m(charset);
            }
            if (w0Var.u()) {
                arrayList.set(i10, str);
            }
            return str;
        }
        byte[] bArr = (byte[]) obj;
        String str2 = new String(bArr, u1.f3170a);
        c cVar = e4.f3085a;
        boolean z = false;
        if (e4.f3085a.v(bArr, 0, bArr.length) == 0) {
            z = true;
        }
        if (z) {
            arrayList.set(i10, str2);
        }
        return str2;
    }

    public final Object j(int i10) {
        return this.f3093p.get(i10);
    }

    public final Object remove(int i10) {
        e();
        Object remove = this.f3093p.remove(i10);
        this.modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof w0)) {
            return new String((byte[]) remove, u1.f3170a);
        }
        w0 w0Var = (w0) remove;
        w0Var.getClass();
        Charset charset = u1.f3170a;
        if (w0Var.p() == 0) {
            return BuildConfig.FLAVOR;
        }
        return w0Var.m(charset);
    }

    public final Object set(int i10, Object obj) {
        e();
        Object obj2 = this.f3093p.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof w0)) {
            return new String((byte[]) obj2, u1.f3170a);
        }
        w0 w0Var = (w0) obj2;
        w0Var.getClass();
        Charset charset = u1.f3170a;
        if (w0Var.p() == 0) {
            return BuildConfig.FLAVOR;
        }
        return w0Var.m(charset);
    }

    public final int size() {
        return this.f3093p.size();
    }
}

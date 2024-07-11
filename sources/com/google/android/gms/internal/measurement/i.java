package com.google.android.gms.internal.measurement;

import androidx.databinding.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public abstract class i implements o, k {

    /* renamed from: o  reason: collision with root package name */
    public final String f2738o;

    /* renamed from: p  reason: collision with root package name */
    public final HashMap f2739p = new HashMap();

    public i(String str) {
        this.f2738o = str;
    }

    public abstract o a(i3 i3Var, List<o> list);

    public final Double b() {
        return Double.valueOf(Double.NaN);
    }

    public final Boolean c() {
        return Boolean.TRUE;
    }

    public final o e(String str) {
        HashMap hashMap = this.f2739p;
        return hashMap.containsKey(str) ? (o) hashMap.get(str) : o.f2850a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        String str = this.f2738o;
        if (str != null) {
            return str.equals(iVar.f2738o);
        }
        return false;
    }

    public final void h(String str, o oVar) {
        HashMap hashMap = this.f2739p;
        if (oVar == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, oVar);
        }
    }

    public final int hashCode() {
        String str = this.f2738o;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final Iterator<o> i() {
        return new j(this.f2739p.keySet().iterator());
    }

    public final boolean k(String str) {
        return this.f2739p.containsKey(str);
    }

    public o q() {
        return this;
    }

    public final o t(String str, i3 i3Var, ArrayList arrayList) {
        return "toString".equals(str) ? new r(this.f2738o) : a.w(this, new r(str), i3Var, arrayList);
    }

    public final String zzc() {
        return this.f2738o;
    }
}

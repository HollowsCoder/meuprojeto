package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

public final class p implements o {

    /* renamed from: o  reason: collision with root package name */
    public final String f2874o;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList<o> f2875p;

    public p(String str, ArrayList arrayList) {
        this.f2874o = str;
        ArrayList<o> arrayList2 = new ArrayList<>();
        this.f2875p = arrayList2;
        arrayList2.addAll(arrayList);
    }

    public final Double b() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final Boolean c() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        String str = this.f2874o;
        if (str == null ? pVar.f2874o == null : str.equals(pVar.f2874o)) {
            return this.f2875p.equals(pVar.f2875p);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f2874o;
        return this.f2875p.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    public final Iterator<o> i() {
        return null;
    }

    public final o q() {
        return this;
    }

    public final o t(String str, i3 i3Var, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final String zzc() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }
}

package com.google.android.gms.internal.clearcut;

import java.util.Map;

public final class p2 implements Comparable, Map.Entry {

    /* renamed from: o  reason: collision with root package name */
    public final Comparable f2518o;

    /* renamed from: p  reason: collision with root package name */
    public Object f2519p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ l2 f2520q;

    public p2(l2 l2Var, Comparable comparable, Object obj) {
        this.f2520q = l2Var;
        this.f2518o = comparable;
        this.f2519p = obj;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return this.f2518o.compareTo(((p2) obj).f2518o);
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.f2518o;
        if (comparable != null) {
            z = comparable.equals(key);
        } else if (key == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Object obj2 = this.f2519p;
            Object value = entry.getValue();
            if (obj2 != null) {
                z10 = obj2.equals(value);
            } else if (value == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ Object getKey() {
        return this.f2518o;
    }

    public final Object getValue() {
        return this.f2519p;
    }

    public final int hashCode() {
        int i10 = 0;
        Comparable comparable = this.f2518o;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f2519p;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return i10 ^ hashCode;
    }

    public final Object setValue(Object obj) {
        int i10 = l2.u;
        this.f2520q.g();
        Object obj2 = this.f2519p;
        this.f2519p = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f2518o);
        String valueOf2 = String.valueOf(this.f2519p);
        StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 1);
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}

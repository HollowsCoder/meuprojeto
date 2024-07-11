package com.google.android.gms.internal.vision;

import java.util.Map;

public final class r3 implements Comparable, Map.Entry {

    /* renamed from: o  reason: collision with root package name */
    public final Comparable f3158o;

    /* renamed from: p  reason: collision with root package name */
    public Object f3159p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ p3 f3160q;

    public r3(p3 p3Var, Comparable comparable, Object obj) {
        this.f3160q = p3Var;
        this.f3158o = comparable;
        this.f3159p = obj;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return this.f3158o.compareTo(((r3) obj).f3158o);
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
        Comparable comparable = this.f3158o;
        if (comparable != null) {
            z = comparable.equals(key);
        } else if (key == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Object obj2 = this.f3159p;
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
        return this.f3158o;
    }

    public final Object getValue() {
        return this.f3159p;
    }

    public final int hashCode() {
        int i10 = 0;
        Comparable comparable = this.f3158o;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f3159p;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return i10 ^ hashCode;
    }

    public final Object setValue(Object obj) {
        int i10 = p3.u;
        this.f3160q.h();
        Object obj2 = this.f3159p;
        this.f3159p = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f3158o);
        String valueOf2 = String.valueOf(this.f3159p);
        StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 1);
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}

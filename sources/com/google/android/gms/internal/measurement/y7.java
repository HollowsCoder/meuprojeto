package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.x0;
import java.util.Map;

public final class y7 implements Map.Entry, Comparable<y7> {

    /* renamed from: o  reason: collision with root package name */
    public final Comparable f3010o;

    /* renamed from: p  reason: collision with root package name */
    public Object f3011p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ b8 f3012q;

    public y7(b8 b8Var, Comparable comparable, Object obj) {
        this.f3012q = b8Var;
        this.f3010o = comparable;
        this.f3011p = obj;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f3010o.compareTo(((y7) obj).f3010o);
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
        Comparable comparable = this.f3010o;
        if (comparable != null) {
            z = comparable.equals(key);
        } else if (key != null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            Object obj2 = this.f3011p;
            Object value = entry.getValue();
            if (obj2 != null) {
                z10 = obj2.equals(value);
            } else if (value != null) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.f3010o;
    }

    public final Object getValue() {
        return this.f3011p;
    }

    public final int hashCode() {
        int i10 = 0;
        Comparable comparable = this.f3010o;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f3011p;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return i10 ^ hashCode;
    }

    public final Object setValue(Object obj) {
        int i10 = b8.u;
        this.f3012q.e();
        Object obj2 = this.f3011p;
        this.f3011p = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f3010o);
        String valueOf2 = String.valueOf(this.f3011p);
        return x0.f(new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf, "=", valueOf2);
    }
}

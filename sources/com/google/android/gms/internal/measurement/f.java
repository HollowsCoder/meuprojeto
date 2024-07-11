package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

public final class f implements o {

    /* renamed from: o  reason: collision with root package name */
    public final boolean f2691o;

    public f(Boolean bool) {
        this.f2691o = bool == null ? false : bool.booleanValue();
    }

    public final Double b() {
        return Double.valueOf(true != this.f2691o ? 0.0d : 1.0d);
    }

    public final Boolean c() {
        return Boolean.valueOf(this.f2691o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f2691o == ((f) obj).f2691o;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f2691o).hashCode();
    }

    public final Iterator<o> i() {
        return null;
    }

    public final o q() {
        return new f(Boolean.valueOf(this.f2691o));
    }

    public final o t(String str, i3 i3Var, ArrayList arrayList) {
        boolean equals = "toString".equals(str);
        boolean z = this.f2691o;
        if (equals) {
            return new r(Boolean.toString(z));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{Boolean.toString(z), str}));
    }

    public final String toString() {
        return String.valueOf(this.f2691o);
    }

    public final String zzc() {
        return Boolean.toString(this.f2691o);
    }
}

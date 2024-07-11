package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

public final class g implements o {

    /* renamed from: o  reason: collision with root package name */
    public final o f2709o;

    /* renamed from: p  reason: collision with root package name */
    public final String f2710p;

    public g() {
        throw null;
    }

    public g(String str) {
        this.f2709o = o.f2850a;
        this.f2710p = str;
    }

    public g(String str, o oVar) {
        this.f2709o = oVar;
        this.f2710p = str;
    }

    public final Double b() {
        throw new IllegalStateException("Control is not a double");
    }

    public final Boolean c() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f2710p.equals(gVar.f2710p) && this.f2709o.equals(gVar.f2709o);
    }

    public final int hashCode() {
        return this.f2709o.hashCode() + (this.f2710p.hashCode() * 31);
    }

    public final Iterator<o> i() {
        return null;
    }

    public final o q() {
        return new g(this.f2710p, this.f2709o.q());
    }

    public final o t(String str, i3 i3Var, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final String zzc() {
        throw new IllegalStateException("Control is not a String");
    }
}

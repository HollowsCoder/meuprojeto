package p9;

import w9.j;
import z8.g;

public final class c {
    public static final j d = j.a.c(":");

    /* renamed from: e  reason: collision with root package name */
    public static final j f7967e = j.a.c(":status");

    /* renamed from: f  reason: collision with root package name */
    public static final j f7968f = j.a.c(":method");

    /* renamed from: g  reason: collision with root package name */
    public static final j f7969g = j.a.c(":path");

    /* renamed from: h  reason: collision with root package name */
    public static final j f7970h = j.a.c(":scheme");

    /* renamed from: i  reason: collision with root package name */
    public static final j f7971i = j.a.c(":authority");

    /* renamed from: a  reason: collision with root package name */
    public final int f7972a;

    /* renamed from: b  reason: collision with root package name */
    public final j f7973b;

    /* renamed from: c  reason: collision with root package name */
    public final j f7974c;

    static {
        j jVar = j.f9328r;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(String str, String str2) {
        this(j.a.c(str), j.a.c(str2));
        g.f(str, "name");
        g.f(str2, "value");
        j jVar = j.f9328r;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(j jVar, String str) {
        this(jVar, j.a.c(str));
        g.f(jVar, "name");
        g.f(str, "value");
        j jVar2 = j.f9328r;
    }

    public c(j jVar, j jVar2) {
        g.f(jVar, "name");
        g.f(jVar2, "value");
        this.f7973b = jVar;
        this.f7974c = jVar2;
        this.f7972a = jVar2.k() + jVar.k() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return g.a(this.f7973b, cVar.f7973b) && g.a(this.f7974c, cVar.f7974c);
    }

    public final int hashCode() {
        int i10 = 0;
        j jVar = this.f7973b;
        int hashCode = (jVar != null ? jVar.hashCode() : 0) * 31;
        j jVar2 = this.f7974c;
        if (jVar2 != null) {
            i10 = jVar2.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        return this.f7973b.s() + ": " + this.f7974c.s();
    }
}

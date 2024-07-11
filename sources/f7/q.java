package f7;

import f7.a0;

public final class q extends a0.e.d.a.b.C0062d {

    /* renamed from: a  reason: collision with root package name */
    public final String f4848a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4849b;

    /* renamed from: c  reason: collision with root package name */
    public final b0<a0.e.d.a.b.C0062d.C0063a> f4850c;

    public q() {
        throw null;
    }

    public q(String str, int i10, b0 b0Var) {
        this.f4848a = str;
        this.f4849b = i10;
        this.f4850c = b0Var;
    }

    public final b0<a0.e.d.a.b.C0062d.C0063a> a() {
        return this.f4850c;
    }

    public final int b() {
        return this.f4849b;
    }

    public final String c() {
        return this.f4848a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.a.b.C0062d)) {
            return false;
        }
        a0.e.d.a.b.C0062d dVar = (a0.e.d.a.b.C0062d) obj;
        return this.f4848a.equals(dVar.c()) && this.f4849b == dVar.b() && this.f4850c.equals(dVar.a());
    }

    public final int hashCode() {
        return ((((this.f4848a.hashCode() ^ 1000003) * 1000003) ^ this.f4849b) * 1000003) ^ this.f4850c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f4848a + ", importance=" + this.f4849b + ", frames=" + this.f4850c + "}";
    }
}

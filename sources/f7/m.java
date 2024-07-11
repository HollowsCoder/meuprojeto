package f7;

import f7.a0;

public final class m extends a0.e.d.a.b {

    /* renamed from: a  reason: collision with root package name */
    public final b0<a0.e.d.a.b.C0062d> f4831a;

    /* renamed from: b  reason: collision with root package name */
    public final a0.e.d.a.b.C0061b f4832b;

    /* renamed from: c  reason: collision with root package name */
    public final a0.a f4833c;
    public final a0.e.d.a.b.c d;

    /* renamed from: e  reason: collision with root package name */
    public final b0<a0.e.d.a.b.C0059a> f4834e;

    public m() {
        throw null;
    }

    public m(b0 b0Var, a0.e.d.a.b.C0061b bVar, a0.a aVar, a0.e.d.a.b.c cVar, b0 b0Var2) {
        this.f4831a = b0Var;
        this.f4832b = bVar;
        this.f4833c = aVar;
        this.d = cVar;
        this.f4834e = b0Var2;
    }

    public final a0.a a() {
        return this.f4833c;
    }

    public final b0<a0.e.d.a.b.C0059a> b() {
        return this.f4834e;
    }

    public final a0.e.d.a.b.C0061b c() {
        return this.f4832b;
    }

    public final a0.e.d.a.b.c d() {
        return this.d;
    }

    public final b0<a0.e.d.a.b.C0062d> e() {
        return this.f4831a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.a.b)) {
            return false;
        }
        a0.e.d.a.b bVar = (a0.e.d.a.b) obj;
        b0<a0.e.d.a.b.C0062d> b0Var = this.f4831a;
        if (b0Var != null ? b0Var.equals(bVar.e()) : bVar.e() == null) {
            a0.e.d.a.b.C0061b bVar2 = this.f4832b;
            if (bVar2 != null ? bVar2.equals(bVar.c()) : bVar.c() == null) {
                a0.a aVar = this.f4833c;
                if (aVar != null ? aVar.equals(bVar.a()) : bVar.a() == null) {
                    if (this.d.equals(bVar.d()) && this.f4834e.equals(bVar.b())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 0;
        b0<a0.e.d.a.b.C0062d> b0Var = this.f4831a;
        int hashCode = ((b0Var == null ? 0 : b0Var.hashCode()) ^ 1000003) * 1000003;
        a0.e.d.a.b.C0061b bVar = this.f4832b;
        int hashCode2 = (hashCode ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        a0.a aVar = this.f4833c;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return ((((i10 ^ hashCode2) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f4834e.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f4831a + ", exception=" + this.f4832b + ", appExitInfo=" + this.f4833c + ", signal=" + this.d + ", binaries=" + this.f4834e + "}";
    }
}

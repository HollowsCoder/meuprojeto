package f7;

import f7.c0;

public final class w extends c0 {

    /* renamed from: a  reason: collision with root package name */
    public final c0.a f4877a;

    /* renamed from: b  reason: collision with root package name */
    public final c0.c f4878b;

    /* renamed from: c  reason: collision with root package name */
    public final c0.b f4879c;

    public w(x xVar, z zVar, y yVar) {
        this.f4877a = xVar;
        this.f4878b = zVar;
        this.f4879c = yVar;
    }

    public final c0.a a() {
        return this.f4877a;
    }

    public final c0.b b() {
        return this.f4879c;
    }

    public final c0.c c() {
        return this.f4878b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f4877a.equals(c0Var.a()) && this.f4878b.equals(c0Var.c()) && this.f4879c.equals(c0Var.b());
    }

    public final int hashCode() {
        return ((((this.f4877a.hashCode() ^ 1000003) * 1000003) ^ this.f4878b.hashCode()) * 1000003) ^ this.f4879c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f4877a + ", osData=" + this.f4878b + ", deviceData=" + this.f4879c + "}";
    }
}

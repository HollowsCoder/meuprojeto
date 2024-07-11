package t3;

import q3.b;
import q3.c;
import q3.e;

public final class i extends r {

    /* renamed from: a  reason: collision with root package name */
    public final s f8954a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8955b;

    /* renamed from: c  reason: collision with root package name */
    public final c<?> f8956c;
    public final e<?, byte[]> d;

    /* renamed from: e  reason: collision with root package name */
    public final b f8957e;

    public i(s sVar, String str, c cVar, e eVar, b bVar) {
        this.f8954a = sVar;
        this.f8955b = str;
        this.f8956c = cVar;
        this.d = eVar;
        this.f8957e = bVar;
    }

    public final b a() {
        return this.f8957e;
    }

    public final c<?> b() {
        return this.f8956c;
    }

    public final e<?, byte[]> c() {
        return this.d;
    }

    public final s d() {
        return this.f8954a;
    }

    public final String e() {
        return this.f8955b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f8954a.equals(rVar.d()) && this.f8955b.equals(rVar.e()) && this.f8956c.equals(rVar.b()) && this.d.equals(rVar.c()) && this.f8957e.equals(rVar.a());
    }

    public final int hashCode() {
        return ((((((((this.f8954a.hashCode() ^ 1000003) * 1000003) ^ this.f8955b.hashCode()) * 1000003) ^ this.f8956c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f8957e.hashCode();
    }

    public final String toString() {
        return "SendRequest{transportContext=" + this.f8954a + ", transportName=" + this.f8955b + ", event=" + this.f8956c + ", transformer=" + this.d + ", encoding=" + this.f8957e + "}";
    }
}

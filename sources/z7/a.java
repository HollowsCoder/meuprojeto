package z7;

import z7.d;

public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    public final String f9940a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9941b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9942c;
    public final f d;

    /* renamed from: e  reason: collision with root package name */
    public final d.a f9943e;

    public a(String str, String str2, String str3, f fVar, d.a aVar) {
        this.f9940a = str;
        this.f9941b = str2;
        this.f9942c = str3;
        this.d = fVar;
        this.f9943e = aVar;
    }

    public final f a() {
        return this.d;
    }

    public final String b() {
        return this.f9941b;
    }

    public final String c() {
        return this.f9942c;
    }

    public final d.a d() {
        return this.f9943e;
    }

    public final String e() {
        return this.f9940a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f9940a;
        if (str != null ? str.equals(dVar.e()) : dVar.e() == null) {
            String str2 = this.f9941b;
            if (str2 != null ? str2.equals(dVar.b()) : dVar.b() == null) {
                String str3 = this.f9942c;
                if (str3 != null ? str3.equals(dVar.c()) : dVar.c() == null) {
                    f fVar = this.d;
                    if (fVar != null ? fVar.equals(dVar.a()) : dVar.a() == null) {
                        d.a aVar = this.f9943e;
                        if (aVar == null) {
                            if (dVar.d() == null) {
                                return true;
                            }
                        } else if (aVar.equals(dVar.d())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 0;
        String str = this.f9940a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f9941b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f9942c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.d;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.a aVar = this.f9943e;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return i10 ^ hashCode4;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.f9940a + ", fid=" + this.f9941b + ", refreshToken=" + this.f9942c + ", authToken=" + this.d + ", responseCode=" + this.f9943e + "}";
    }
}

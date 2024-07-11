package f7;

import b0.d;
import f7.a0;

public final class h extends a0.e.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f4793a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4794b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4795c;
    public final a0.e.a.C0057a d = null;

    /* renamed from: e  reason: collision with root package name */
    public final String f4796e;

    /* renamed from: f  reason: collision with root package name */
    public final String f4797f;

    /* renamed from: g  reason: collision with root package name */
    public final String f4798g;

    public h(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f4793a = str;
        this.f4794b = str2;
        this.f4795c = str3;
        this.f4796e = str4;
        this.f4797f = str5;
        this.f4798g = str6;
    }

    public final String a() {
        return this.f4797f;
    }

    public final String b() {
        return this.f4798g;
    }

    public final String c() {
        return this.f4795c;
    }

    public final String d() {
        return this.f4793a;
    }

    public final String e() {
        return this.f4796e;
    }

    public final boolean equals(Object obj) {
        String str;
        a0.e.a.C0057a aVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.a)) {
            return false;
        }
        a0.e.a aVar2 = (a0.e.a) obj;
        if (this.f4793a.equals(aVar2.d()) && this.f4794b.equals(aVar2.g()) && ((str = this.f4795c) != null ? str.equals(aVar2.c()) : aVar2.c() == null) && ((aVar = this.d) != null ? aVar.equals(aVar2.f()) : aVar2.f() == null) && ((str2 = this.f4796e) != null ? str2.equals(aVar2.e()) : aVar2.e() == null) && ((str3 = this.f4797f) != null ? str3.equals(aVar2.a()) : aVar2.a() == null)) {
            String str4 = this.f4798g;
            String b10 = aVar2.b();
            if (str4 == null) {
                if (b10 == null) {
                    return true;
                }
            } else if (str4.equals(b10)) {
                return true;
            }
        }
        return false;
    }

    public final a0.e.a.C0057a f() {
        return this.d;
    }

    public final String g() {
        return this.f4794b;
    }

    public final int hashCode() {
        int hashCode = (((this.f4793a.hashCode() ^ 1000003) * 1000003) ^ this.f4794b.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f4795c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        a0.e.a.C0057a aVar = this.d;
        int hashCode3 = (hashCode2 ^ (aVar == null ? 0 : aVar.hashCode())) * 1000003;
        String str2 = this.f4796e;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f4797f;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f4798g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return hashCode5 ^ i10;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{identifier=");
        sb.append(this.f4793a);
        sb.append(", version=");
        sb.append(this.f4794b);
        sb.append(", displayVersion=");
        sb.append(this.f4795c);
        sb.append(", organization=");
        sb.append(this.d);
        sb.append(", installationUuid=");
        sb.append(this.f4796e);
        sb.append(", developmentPlatform=");
        sb.append(this.f4797f);
        sb.append(", developmentPlatformVersion=");
        return d.g(sb, this.f4798g, "}");
    }
}

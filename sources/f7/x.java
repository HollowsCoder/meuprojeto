package f7;

import b0.d;
import f7.c0;

public final class x extends c0.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f4880a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4881b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4882c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4883e;

    /* renamed from: f  reason: collision with root package name */
    public final String f4884f;

    /* renamed from: g  reason: collision with root package name */
    public final String f4885g;

    public x(String str, String str2, String str3, String str4, int i10, String str5, String str6) {
        if (str != null) {
            this.f4880a = str;
            if (str2 != null) {
                this.f4881b = str2;
                if (str3 != null) {
                    this.f4882c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.f4883e = i10;
                        this.f4884f = str5;
                        this.f4885g = str6;
                        return;
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }

    public final String a() {
        return this.f4880a;
    }

    public final int b() {
        return this.f4883e;
    }

    public final String c() {
        return this.f4884f;
    }

    public final String d() {
        return this.f4885g;
    }

    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0.a)) {
            return false;
        }
        c0.a aVar = (c0.a) obj;
        if (this.f4880a.equals(aVar.a()) && this.f4881b.equals(aVar.f()) && this.f4882c.equals(aVar.g()) && this.d.equals(aVar.e()) && this.f4883e == aVar.b() && ((str = this.f4884f) != null ? str.equals(aVar.c()) : aVar.c() == null)) {
            String str2 = this.f4885g;
            String d10 = aVar.d();
            if (str2 == null) {
                if (d10 == null) {
                    return true;
                }
            } else if (str2.equals(d10)) {
                return true;
            }
        }
        return false;
    }

    public final String f() {
        return this.f4881b;
    }

    public final String g() {
        return this.f4882c;
    }

    public final int hashCode() {
        int hashCode = (((((((((this.f4880a.hashCode() ^ 1000003) * 1000003) ^ this.f4881b.hashCode()) * 1000003) ^ this.f4882c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f4883e) * 1000003;
        int i10 = 0;
        String str = this.f4884f;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f4885g;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 ^ i10;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppData{appIdentifier=");
        sb.append(this.f4880a);
        sb.append(", versionCode=");
        sb.append(this.f4881b);
        sb.append(", versionName=");
        sb.append(this.f4882c);
        sb.append(", installUuid=");
        sb.append(this.d);
        sb.append(", deliveryMechanism=");
        sb.append(this.f4883e);
        sb.append(", developmentPlatform=");
        sb.append(this.f4884f);
        sb.append(", developmentPlatformVersion=");
        return d.g(sb, this.f4885g, "}");
    }
}

package s3;

import b0.d;

public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f8747a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8748b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8749c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f8750e;

    /* renamed from: f  reason: collision with root package name */
    public final String f8751f;

    /* renamed from: g  reason: collision with root package name */
    public final String f8752g;

    /* renamed from: h  reason: collision with root package name */
    public final String f8753h;

    /* renamed from: i  reason: collision with root package name */
    public final String f8754i;

    /* renamed from: j  reason: collision with root package name */
    public final String f8755j;

    /* renamed from: k  reason: collision with root package name */
    public final String f8756k;
    public final String l;

    public c(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f8747a = num;
        this.f8748b = str;
        this.f8749c = str2;
        this.d = str3;
        this.f8750e = str4;
        this.f8751f = str5;
        this.f8752g = str6;
        this.f8753h = str7;
        this.f8754i = str8;
        this.f8755j = str9;
        this.f8756k = str10;
        this.l = str11;
    }

    public final String a() {
        return this.l;
    }

    public final String b() {
        return this.f8755j;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f8753h;
    }

    public final String e() {
        return this.f8749c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        Integer num = this.f8747a;
        if (num != null ? num.equals(aVar.l()) : aVar.l() == null) {
            String str = this.f8748b;
            if (str != null ? str.equals(aVar.i()) : aVar.i() == null) {
                String str2 = this.f8749c;
                if (str2 != null ? str2.equals(aVar.e()) : aVar.e() == null) {
                    String str3 = this.d;
                    if (str3 != null ? str3.equals(aVar.c()) : aVar.c() == null) {
                        String str4 = this.f8750e;
                        if (str4 != null ? str4.equals(aVar.k()) : aVar.k() == null) {
                            String str5 = this.f8751f;
                            if (str5 != null ? str5.equals(aVar.j()) : aVar.j() == null) {
                                String str6 = this.f8752g;
                                if (str6 != null ? str6.equals(aVar.g()) : aVar.g() == null) {
                                    String str7 = this.f8753h;
                                    if (str7 != null ? str7.equals(aVar.d()) : aVar.d() == null) {
                                        String str8 = this.f8754i;
                                        if (str8 != null ? str8.equals(aVar.f()) : aVar.f() == null) {
                                            String str9 = this.f8755j;
                                            if (str9 != null ? str9.equals(aVar.b()) : aVar.b() == null) {
                                                String str10 = this.f8756k;
                                                if (str10 != null ? str10.equals(aVar.h()) : aVar.h() == null) {
                                                    String str11 = this.l;
                                                    String a10 = aVar.a();
                                                    if (str11 == null) {
                                                        if (a10 == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(a10)) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String f() {
        return this.f8754i;
    }

    public final String g() {
        return this.f8752g;
    }

    public final String h() {
        return this.f8756k;
    }

    public final int hashCode() {
        int i10 = 0;
        Integer num = this.f8747a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f8748b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f8749c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f8750e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f8751f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f8752g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f8753h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f8754i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f8755j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f8756k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.l;
        if (str11 != null) {
            i10 = str11.hashCode();
        }
        return i10 ^ hashCode11;
    }

    public final String i() {
        return this.f8748b;
    }

    public final String j() {
        return this.f8751f;
    }

    public final String k() {
        return this.f8750e;
    }

    public final Integer l() {
        return this.f8747a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f8747a);
        sb.append(", model=");
        sb.append(this.f8748b);
        sb.append(", hardware=");
        sb.append(this.f8749c);
        sb.append(", device=");
        sb.append(this.d);
        sb.append(", product=");
        sb.append(this.f8750e);
        sb.append(", osBuild=");
        sb.append(this.f8751f);
        sb.append(", manufacturer=");
        sb.append(this.f8752g);
        sb.append(", fingerprint=");
        sb.append(this.f8753h);
        sb.append(", locale=");
        sb.append(this.f8754i);
        sb.append(", country=");
        sb.append(this.f8755j);
        sb.append(", mccMnc=");
        sb.append(this.f8756k);
        sb.append(", applicationBuild=");
        return d.g(sb, this.l, "}");
    }
}

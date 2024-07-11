package f7;

import b0.d;
import f7.c0;

public final class y extends c0.b {

    /* renamed from: a  reason: collision with root package name */
    public final int f4886a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4887b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4888c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4889e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f4890f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4891g;

    /* renamed from: h  reason: collision with root package name */
    public final String f4892h;

    /* renamed from: i  reason: collision with root package name */
    public final String f4893i;

    public y(int i10, String str, int i11, long j8, long j10, boolean z, int i12, String str2, String str3) {
        this.f4886a = i10;
        if (str != null) {
            this.f4887b = str;
            this.f4888c = i11;
            this.d = j8;
            this.f4889e = j10;
            this.f4890f = z;
            this.f4891g = i12;
            if (str2 != null) {
                this.f4892h = str2;
                if (str3 != null) {
                    this.f4893i = str3;
                    return;
                }
                throw new NullPointerException("Null modelClass");
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }

    public final int a() {
        return this.f4886a;
    }

    public final int b() {
        return this.f4888c;
    }

    public final long c() {
        return this.f4889e;
    }

    public final boolean d() {
        return this.f4890f;
    }

    public final String e() {
        return this.f4892h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0.b)) {
            return false;
        }
        c0.b bVar = (c0.b) obj;
        return this.f4886a == bVar.a() && this.f4887b.equals(bVar.f()) && this.f4888c == bVar.b() && this.d == bVar.i() && this.f4889e == bVar.c() && this.f4890f == bVar.d() && this.f4891g == bVar.h() && this.f4892h.equals(bVar.e()) && this.f4893i.equals(bVar.g());
    }

    public final String f() {
        return this.f4887b;
    }

    public final String g() {
        return this.f4893i;
    }

    public final int h() {
        return this.f4891g;
    }

    public final int hashCode() {
        long j8 = this.d;
        long j10 = this.f4889e;
        return ((((((((((((((((this.f4886a ^ 1000003) * 1000003) ^ this.f4887b.hashCode()) * 1000003) ^ this.f4888c) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ (this.f4890f ? 1231 : 1237)) * 1000003) ^ this.f4891g) * 1000003) ^ this.f4892h.hashCode()) * 1000003) ^ this.f4893i.hashCode();
    }

    public final long i() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.f4886a);
        sb.append(", model=");
        sb.append(this.f4887b);
        sb.append(", availableProcessors=");
        sb.append(this.f4888c);
        sb.append(", totalRam=");
        sb.append(this.d);
        sb.append(", diskSpace=");
        sb.append(this.f4889e);
        sb.append(", isEmulator=");
        sb.append(this.f4890f);
        sb.append(", state=");
        sb.append(this.f4891g);
        sb.append(", manufacturer=");
        sb.append(this.f4892h);
        sb.append(", modelClass=");
        return d.g(sb, this.f4893i, "}");
    }
}

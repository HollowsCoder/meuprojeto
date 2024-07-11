package f7;

import f7.c0;

public final class z extends c0.c {

    /* renamed from: a  reason: collision with root package name */
    public final String f4894a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4895b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4896c;

    public z(String str, String str2, boolean z) {
        if (str != null) {
            this.f4894a = str;
            if (str2 != null) {
                this.f4895b = str2;
                this.f4896c = z;
                return;
            }
            throw new NullPointerException("Null osCodeName");
        }
        throw new NullPointerException("Null osRelease");
    }

    public final boolean a() {
        return this.f4896c;
    }

    public final String b() {
        return this.f4895b;
    }

    public final String c() {
        return this.f4894a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0.c)) {
            return false;
        }
        c0.c cVar = (c0.c) obj;
        return this.f4894a.equals(cVar.c()) && this.f4895b.equals(cVar.b()) && this.f4896c == cVar.a();
    }

    public final int hashCode() {
        return ((((this.f4894a.hashCode() ^ 1000003) * 1000003) ^ this.f4895b.hashCode()) * 1000003) ^ (this.f4896c ? 1231 : 1237);
    }

    public final String toString() {
        return "OsData{osRelease=" + this.f4894a + ", osCodeName=" + this.f4895b + ", isRooted=" + this.f4896c + "}";
    }
}

package f7;

import f7.a0;
import java.util.Arrays;

public final class f extends a0.d.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f4771a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f4772b;

    public f(String str, byte[] bArr) {
        this.f4771a = str;
        this.f4772b = bArr;
    }

    public final byte[] a() {
        return this.f4772b;
    }

    public final String b() {
        return this.f4771a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.d.a)) {
            return false;
        }
        a0.d.a aVar = (a0.d.a) obj;
        if (this.f4771a.equals(aVar.b())) {
            if (Arrays.equals(this.f4772b, aVar instanceof f ? ((f) aVar).f4772b : aVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f4771a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f4772b);
    }

    public final String toString() {
        return "File{filename=" + this.f4771a + ", contents=" + Arrays.toString(this.f4772b) + "}";
    }
}

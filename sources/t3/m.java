package t3;

import java.util.Arrays;
import q3.b;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final b f8969a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f8970b;

    public m(b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        } else if (bArr != null) {
            this.f8969a = bVar;
            this.f8970b = bArr;
        } else {
            throw new NullPointerException("bytes is null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!this.f8969a.equals(mVar.f8969a)) {
            return false;
        }
        return Arrays.equals(this.f8970b, mVar.f8970b);
    }

    public final int hashCode() {
        return ((this.f8969a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f8970b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f8969a + ", bytes=[...]}";
    }
}

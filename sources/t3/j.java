package t3;

import com.karumi.dexter.BuildConfig;
import java.util.Arrays;
import q3.d;
import t3.s;

public final class j extends s {

    /* renamed from: a  reason: collision with root package name */
    public final String f8958a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f8959b;

    /* renamed from: c  reason: collision with root package name */
    public final d f8960c;

    public static final class a extends s.a {

        /* renamed from: a  reason: collision with root package name */
        public String f8961a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f8962b;

        /* renamed from: c  reason: collision with root package name */
        public d f8963c;

        public final j a() {
            String str = this.f8961a == null ? " backendName" : BuildConfig.FLAVOR;
            if (this.f8963c == null) {
                str = str.concat(" priority");
            }
            if (str.isEmpty()) {
                return new j(this.f8961a, this.f8962b, this.f8963c);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        public final a b(String str) {
            if (str != null) {
                this.f8961a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        public final a c(d dVar) {
            if (dVar != null) {
                this.f8963c = dVar;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    public j(String str, byte[] bArr, d dVar) {
        this.f8958a = str;
        this.f8959b = bArr;
        this.f8960c = dVar;
    }

    public final String b() {
        return this.f8958a;
    }

    public final byte[] c() {
        return this.f8959b;
    }

    public final d d() {
        return this.f8960c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f8958a.equals(sVar.b())) {
            if (Arrays.equals(this.f8959b, sVar instanceof j ? ((j) sVar).f8959b : sVar.c()) && this.f8960c.equals(sVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8958a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f8959b)) * 1000003) ^ this.f8960c.hashCode();
    }
}

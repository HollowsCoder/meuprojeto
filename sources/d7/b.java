package d7;

import f7.a0;
import java.io.File;

public final class b extends a0 {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f4200a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4201b;

    /* renamed from: c  reason: collision with root package name */
    public final File f4202c;

    public b(f7.b bVar, String str, File file) {
        this.f4200a = bVar;
        if (str != null) {
            this.f4201b = str;
            this.f4202c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final a0 a() {
        return this.f4200a;
    }

    public final File b() {
        return this.f4202c;
    }

    public final String c() {
        return this.f4201b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f4200a.equals(a0Var.a()) && this.f4201b.equals(a0Var.c()) && this.f4202c.equals(a0Var.b());
    }

    public final int hashCode() {
        return ((((this.f4200a.hashCode() ^ 1000003) * 1000003) ^ this.f4201b.hashCode()) * 1000003) ^ this.f4202c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f4200a + ", sessionId=" + this.f4201b + ", reportFile=" + this.f4202c + "}";
    }
}

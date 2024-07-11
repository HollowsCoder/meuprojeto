package u3;

import android.content.Context;
import b0.d;
import c4.a;

public final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9090a;

    /* renamed from: b  reason: collision with root package name */
    public final a f9091b;

    /* renamed from: c  reason: collision with root package name */
    public final a f9092c;
    public final String d;

    public c(Context context, a aVar, a aVar2, String str) {
        if (context != null) {
            this.f9090a = context;
            if (aVar != null) {
                this.f9091b = aVar;
                if (aVar2 != null) {
                    this.f9092c = aVar2;
                    if (str != null) {
                        this.d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public final Context a() {
        return this.f9090a;
    }

    public final String b() {
        return this.d;
    }

    public final a c() {
        return this.f9092c;
    }

    public final a d() {
        return this.f9091b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f9090a.equals(hVar.a()) && this.f9091b.equals(hVar.d()) && this.f9092c.equals(hVar.c()) && this.d.equals(hVar.b());
    }

    public final int hashCode() {
        return ((((((this.f9090a.hashCode() ^ 1000003) * 1000003) ^ this.f9091b.hashCode()) * 1000003) ^ this.f9092c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f9090a);
        sb.append(", wallClock=");
        sb.append(this.f9091b);
        sb.append(", monotonicClock=");
        sb.append(this.f9092c);
        sb.append(", backendName=");
        return d.g(sb, this.d, "}");
    }
}

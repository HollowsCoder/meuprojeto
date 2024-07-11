package g9;

import n8.i;
import y8.l;
import z8.g;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final Object f5036a;

    /* renamed from: b  reason: collision with root package name */
    public final l<Throwable, i> f5037b;

    public p(Object obj, l<? super Throwable, i> lVar) {
        this.f5036a = obj;
        this.f5037b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return g.a(this.f5036a, pVar.f5036a) && g.a(this.f5037b, pVar.f5037b);
    }

    public final int hashCode() {
        Object obj = this.f5036a;
        return this.f5037b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f5036a + ", onCancellation=" + this.f5037b + ')';
    }
}

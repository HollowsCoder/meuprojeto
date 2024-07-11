package s2;

import java.security.MessageDigest;
import java.util.Map;
import m3.b;
import q2.f;
import q2.h;
import q2.l;
import s6.a;

public final class p implements f {

    /* renamed from: b  reason: collision with root package name */
    public final Object f8663b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8664c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final Class<?> f8665e;

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f8666f;

    /* renamed from: g  reason: collision with root package name */
    public final f f8667g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<Class<?>, l<?>> f8668h;

    /* renamed from: i  reason: collision with root package name */
    public final h f8669i;

    /* renamed from: j  reason: collision with root package name */
    public int f8670j;

    public p(Object obj, f fVar, int i10, int i11, b bVar, Class cls, Class cls2, h hVar) {
        a.n(obj);
        this.f8663b = obj;
        if (fVar != null) {
            this.f8667g = fVar;
            this.f8664c = i10;
            this.d = i11;
            a.n(bVar);
            this.f8668h = bVar;
            if (cls != null) {
                this.f8665e = cls;
                if (cls2 != null) {
                    this.f8666f = cls2;
                    a.n(hVar);
                    this.f8669i = hVar;
                    return;
                }
                throw new NullPointerException("Transcode class must not be null");
            }
            throw new NullPointerException("Resource class must not be null");
        }
        throw new NullPointerException("Signature must not be null");
    }

    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f8663b.equals(pVar.f8663b) && this.f8667g.equals(pVar.f8667g) && this.d == pVar.d && this.f8664c == pVar.f8664c && this.f8668h.equals(pVar.f8668h) && this.f8665e.equals(pVar.f8665e) && this.f8666f.equals(pVar.f8666f) && this.f8669i.equals(pVar.f8669i);
    }

    public final int hashCode() {
        if (this.f8670j == 0) {
            int hashCode = this.f8663b.hashCode();
            this.f8670j = hashCode;
            int hashCode2 = ((((this.f8667g.hashCode() + (hashCode * 31)) * 31) + this.f8664c) * 31) + this.d;
            this.f8670j = hashCode2;
            int hashCode3 = this.f8668h.hashCode() + (hashCode2 * 31);
            this.f8670j = hashCode3;
            int hashCode4 = this.f8665e.hashCode() + (hashCode3 * 31);
            this.f8670j = hashCode4;
            int hashCode5 = this.f8666f.hashCode() + (hashCode4 * 31);
            this.f8670j = hashCode5;
            this.f8670j = this.f8669i.hashCode() + (hashCode5 * 31);
        }
        return this.f8670j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f8663b + ", width=" + this.f8664c + ", height=" + this.d + ", resourceClass=" + this.f8665e + ", transcodeClass=" + this.f8666f + ", signature=" + this.f8667g + ", hashCode=" + this.f8670j + ", transformations=" + this.f8668h + ", options=" + this.f8669i + '}';
    }
}

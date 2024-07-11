package c5;

import o7.b;
import o7.c;
import o7.g;

public final class q implements g {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2176a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2177b = false;

    /* renamed from: c  reason: collision with root package name */
    public c f2178c;
    public final o d;

    public q(o oVar) {
        this.d = oVar;
    }

    public final g c(String str) {
        if (!this.f2176a) {
            this.f2176a = true;
            this.d.c(this.f2178c, str, this.f2177b);
            return this;
        }
        throw new b("Cannot encode a second value in the ValueEncoderContext");
    }

    public final g d(boolean z) {
        if (!this.f2176a) {
            this.f2176a = true;
            this.d.d(this.f2178c, z ? 1 : 0, this.f2177b);
            return this;
        }
        throw new b("Cannot encode a second value in the ValueEncoderContext");
    }
}

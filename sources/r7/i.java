package r7;

import o7.b;
import o7.c;
import o7.g;

public final class i implements g {

    /* renamed from: a  reason: collision with root package name */
    public boolean f8457a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8458b = false;

    /* renamed from: c  reason: collision with root package name */
    public c f8459c;
    public final f d;

    public i(f fVar) {
        this.d = fVar;
    }

    public final g c(String str) {
        if (!this.f8457a) {
            this.f8457a = true;
            this.d.c(this.f8459c, str, this.f8458b);
            return this;
        }
        throw new b("Cannot encode a second value in the ValueEncoderContext");
    }

    public final g d(boolean z) {
        if (!this.f8457a) {
            this.f8457a = true;
            this.d.d(this.f8459c, z ? 1 : 0, this.f8458b);
            return this;
        }
        throw new b("Cannot encode a second value in the ValueEncoderContext");
    }
}

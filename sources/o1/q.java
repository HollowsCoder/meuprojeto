package o1;

import b0.d;
import h1.l;
import j1.c;
import j1.s;
import n1.b;

public final class q implements b {

    /* renamed from: a  reason: collision with root package name */
    public final a f7676a;

    /* renamed from: b  reason: collision with root package name */
    public final b f7677b;

    /* renamed from: c  reason: collision with root package name */
    public final b f7678c;
    public final b d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f7679e;

    public enum a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static a forId(int i10) {
            if (i10 == 1) {
                return SIMULTANEOUSLY;
            }
            if (i10 == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException(d.c("Unknown trim path type ", i10));
        }
    }

    public q(String str, a aVar, b bVar, b bVar2, b bVar3, boolean z) {
        this.f7676a = aVar;
        this.f7677b = bVar;
        this.f7678c = bVar2;
        this.d = bVar3;
        this.f7679e = z;
    }

    public final c a(l lVar, p1.b bVar) {
        return new s(bVar, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f7677b + ", end: " + this.f7678c + ", offset: " + this.d + "}";
    }
}

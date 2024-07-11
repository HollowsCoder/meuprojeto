package i3;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.j;
import i3.a;
import m3.b;
import q2.f;
import q2.g;
import q2.h;
import s2.l;
import z2.e;
import z2.i;
import z2.k;

public abstract class a<T extends a<T>> implements Cloneable {
    public boolean A;
    public boolean B = true;
    public Drawable C;
    public int D;
    public h E = new h();
    public b F = new b();
    public Class<?> G = Object.class;
    public boolean H;
    public Resources.Theme I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M = true;
    public boolean N;

    /* renamed from: o  reason: collision with root package name */
    public int f6024o;

    /* renamed from: p  reason: collision with root package name */
    public float f6025p = 1.0f;

    /* renamed from: q  reason: collision with root package name */
    public l f6026q = l.f8623c;

    /* renamed from: r  reason: collision with root package name */
    public j f6027r = j.NORMAL;

    /* renamed from: s  reason: collision with root package name */
    public Drawable f6028s;

    /* renamed from: t  reason: collision with root package name */
    public int f6029t;
    public Drawable u;

    /* renamed from: v  reason: collision with root package name */
    public int f6030v;
    public boolean w = true;

    /* renamed from: x  reason: collision with root package name */
    public int f6031x = -1;

    /* renamed from: y  reason: collision with root package name */
    public int f6032y = -1;
    public f z = l3.a.f6870b;

    public static boolean i(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public T c(a<?> aVar) {
        if (this.J) {
            return clone().c(aVar);
        }
        if (i(aVar.f6024o, 2)) {
            this.f6025p = aVar.f6025p;
        }
        if (i(aVar.f6024o, 262144)) {
            this.K = aVar.K;
        }
        if (i(aVar.f6024o, 1048576)) {
            this.N = aVar.N;
        }
        if (i(aVar.f6024o, 4)) {
            this.f6026q = aVar.f6026q;
        }
        if (i(aVar.f6024o, 8)) {
            this.f6027r = aVar.f6027r;
        }
        if (i(aVar.f6024o, 16)) {
            this.f6028s = aVar.f6028s;
            this.f6029t = 0;
            this.f6024o &= -33;
        }
        if (i(aVar.f6024o, 32)) {
            this.f6029t = aVar.f6029t;
            this.f6028s = null;
            this.f6024o &= -17;
        }
        if (i(aVar.f6024o, 64)) {
            this.u = aVar.u;
            this.f6030v = 0;
            this.f6024o &= -129;
        }
        if (i(aVar.f6024o, 128)) {
            this.f6030v = aVar.f6030v;
            this.u = null;
            this.f6024o &= -65;
        }
        if (i(aVar.f6024o, 256)) {
            this.w = aVar.w;
        }
        if (i(aVar.f6024o, 512)) {
            this.f6032y = aVar.f6032y;
            this.f6031x = aVar.f6031x;
        }
        if (i(aVar.f6024o, 1024)) {
            this.z = aVar.z;
        }
        if (i(aVar.f6024o, 4096)) {
            this.G = aVar.G;
        }
        if (i(aVar.f6024o, 8192)) {
            this.C = aVar.C;
            this.D = 0;
            this.f6024o &= -16385;
        }
        if (i(aVar.f6024o, 16384)) {
            this.D = aVar.D;
            this.C = null;
            this.f6024o &= -8193;
        }
        if (i(aVar.f6024o, 32768)) {
            this.I = aVar.I;
        }
        if (i(aVar.f6024o, 65536)) {
            this.B = aVar.B;
        }
        if (i(aVar.f6024o, 131072)) {
            this.A = aVar.A;
        }
        if (i(aVar.f6024o, 2048)) {
            this.F.putAll(aVar.F);
            this.M = aVar.M;
        }
        if (i(aVar.f6024o, 524288)) {
            this.L = aVar.L;
        }
        if (!this.B) {
            this.F.clear();
            this.A = false;
            this.f6024o = this.f6024o & -2049 & -131073;
            this.M = true;
        }
        this.f6024o |= aVar.f6024o;
        this.E.f8221b.i(aVar.E.f8221b);
        n();
        return this;
    }

    /* renamed from: d */
    public T clone() {
        try {
            T t10 = (a) super.clone();
            h hVar = new h();
            t10.E = hVar;
            hVar.f8221b.i(this.E.f8221b);
            b bVar = new b();
            t10.F = bVar;
            bVar.putAll(this.F);
            t10.H = false;
            t10.J = false;
            return t10;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final T e(Class<?> cls) {
        if (this.J) {
            return clone().e(cls);
        }
        this.G = cls;
        this.f6024o |= 4096;
        n();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return Float.compare(aVar.f6025p, this.f6025p) == 0 && this.f6029t == aVar.f6029t && m3.j.a(this.f6028s, aVar.f6028s) && this.f6030v == aVar.f6030v && m3.j.a(this.u, aVar.u) && this.D == aVar.D && m3.j.a(this.C, aVar.C) && this.w == aVar.w && this.f6031x == aVar.f6031x && this.f6032y == aVar.f6032y && this.A == aVar.A && this.B == aVar.B && this.K == aVar.K && this.L == aVar.L && this.f6026q.equals(aVar.f6026q) && this.f6027r == aVar.f6027r && this.E.equals(aVar.E) && this.F.equals(aVar.F) && this.G.equals(aVar.G) && m3.j.a(this.z, aVar.z) && m3.j.a(this.I, aVar.I);
        }
    }

    public final T h(l lVar) {
        if (this.J) {
            return clone().h(lVar);
        }
        s6.a.n(lVar);
        this.f6026q = lVar;
        this.f6024o |= 4;
        n();
        return this;
    }

    public final int hashCode() {
        float f10 = this.f6025p;
        char[] cArr = m3.j.f7084a;
        return m3.j.f(m3.j.f(m3.j.f(m3.j.f(m3.j.f(m3.j.f(m3.j.f((((((((((((((m3.j.f((m3.j.f((m3.j.f(((Float.floatToIntBits(f10) + 527) * 31) + this.f6029t, this.f6028s) * 31) + this.f6030v, this.u) * 31) + this.D, this.C) * 31) + (this.w ? 1 : 0)) * 31) + this.f6031x) * 31) + this.f6032y) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 31) + (this.K ? 1 : 0)) * 31) + (this.L ? 1 : 0), this.f6026q), this.f6027r), this.E), this.F), this.G), this.z), this.I);
    }

    public final T j() {
        T k10 = k(k.f9821b, new i());
        k10.M = true;
        return k10;
    }

    public final a k(k kVar, e eVar) {
        if (this.J) {
            return clone().k(kVar, eVar);
        }
        g<k> gVar = k.f9824f;
        s6.a.n(kVar);
        p(gVar, kVar);
        return t(eVar, false);
    }

    public final T l(int i10, int i11) {
        if (this.J) {
            return clone().l(i10, i11);
        }
        this.f6032y = i10;
        this.f6031x = i11;
        this.f6024o |= 512;
        n();
        return this;
    }

    public final T m(j jVar) {
        if (this.J) {
            return clone().m(jVar);
        }
        s6.a.n(jVar);
        this.f6027r = jVar;
        this.f6024o |= 8;
        n();
        return this;
    }

    public final void n() {
        if (this.H) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [q2.g<Y>, java.lang.Object, q2.g] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <Y> T p(q2.g<Y> r2, Y r3) {
        /*
            r1 = this;
            boolean r0 = r1.J
            if (r0 == 0) goto L_0x000d
            i3.a r0 = r1.clone()
            i3.a r2 = r0.p(r2, r3)
            return r2
        L_0x000d:
            s6.a.n(r2)
            s6.a.n(r3)
            q2.h r0 = r1.E
            m3.b r0 = r0.f8221b
            r0.put(r2, r3)
            r1.n()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.a.p(q2.g, java.lang.Object):i3.a");
    }

    public final a q(l3.b bVar) {
        if (this.J) {
            return clone().q(bVar);
        }
        this.z = bVar;
        this.f6024o |= 1024;
        n();
        return this;
    }

    public final a r() {
        if (this.J) {
            return clone().r();
        }
        this.w = false;
        this.f6024o |= 256;
        n();
        return this;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Class<Y>, java.lang.Object, java.lang.Class] */
    /* JADX WARNING: type inference failed for: r3v0, types: [q2.l<Y>, java.lang.Object, q2.l] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <Y> T s(java.lang.Class<Y> r2, q2.l<Y> r3, boolean r4) {
        /*
            r1 = this;
            boolean r0 = r1.J
            if (r0 == 0) goto L_0x000d
            i3.a r0 = r1.clone()
            i3.a r2 = r0.s(r2, r3, r4)
            return r2
        L_0x000d:
            s6.a.n(r3)
            m3.b r0 = r1.F
            r0.put(r2, r3)
            int r2 = r1.f6024o
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r3 = 1
            r1.B = r3
            r0 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 | r0
            r1.f6024o = r2
            r0 = 0
            r1.M = r0
            if (r4 == 0) goto L_0x002d
            r4 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r4
            r1.f6024o = r2
            r1.A = r3
        L_0x002d:
            r1.n()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.a.s(java.lang.Class, q2.l, boolean):i3.a");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [q2.l<android.graphics.Bitmap>, q2.l] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T t(q2.l<android.graphics.Bitmap> r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r2.J
            if (r0 == 0) goto L_0x000d
            i3.a r0 = r2.clone()
            i3.a r3 = r0.t(r3, r4)
            return r3
        L_0x000d:
            z2.o r0 = new z2.o
            r0.<init>(r3, r4)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r2.s(r1, r3, r4)
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            r2.s(r1, r0, r4)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            r2.s(r1, r0, r4)
            d3.e r0 = new d3.e
            r0.<init>(r3)
            java.lang.Class<d3.c> r3 = d3.c.class
            r2.s(r3, r0, r4)
            r2.n()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.a.t(q2.l, boolean):i3.a");
    }

    public final a u() {
        if (this.J) {
            return clone().u();
        }
        this.N = true;
        this.f6024o |= 1048576;
        n();
        return this;
    }
}

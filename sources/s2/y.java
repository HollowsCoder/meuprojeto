package s2;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import m3.g;
import q2.f;
import q2.h;
import q2.l;
import t2.b;

public final class y implements f {

    /* renamed from: j  reason: collision with root package name */
    public static final g<Class<?>, byte[]> f8703j = new g<>(50);

    /* renamed from: b  reason: collision with root package name */
    public final b f8704b;

    /* renamed from: c  reason: collision with root package name */
    public final f f8705c;
    public final f d;

    /* renamed from: e  reason: collision with root package name */
    public final int f8706e;

    /* renamed from: f  reason: collision with root package name */
    public final int f8707f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f8708g;

    /* renamed from: h  reason: collision with root package name */
    public final h f8709h;

    /* renamed from: i  reason: collision with root package name */
    public final l<?> f8710i;

    public y(b bVar, f fVar, f fVar2, int i10, int i11, l<?> lVar, Class<?> cls, h hVar) {
        this.f8704b = bVar;
        this.f8705c = fVar;
        this.d = fVar2;
        this.f8706e = i10;
        this.f8707f = i11;
        this.f8710i = lVar;
        this.f8708g = cls;
        this.f8709h = hVar;
    }

    public final void a(MessageDigest messageDigest) {
        b bVar = this.f8704b;
        byte[] bArr = (byte[]) bVar.d();
        ByteBuffer.wrap(bArr).putInt(this.f8706e).putInt(this.f8707f).array();
        this.d.a(messageDigest);
        this.f8705c.a(messageDigest);
        messageDigest.update(bArr);
        l<?> lVar = this.f8710i;
        if (lVar != null) {
            lVar.a(messageDigest);
        }
        this.f8709h.a(messageDigest);
        g<Class<?>, byte[]> gVar = f8703j;
        Class<?> cls = this.f8708g;
        byte[] a10 = gVar.a(cls);
        if (a10 == null) {
            a10 = cls.getName().getBytes(f.f8216a);
            gVar.d(cls, a10);
        }
        messageDigest.update(a10);
        bVar.put(bArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r4 = (s2.y) r4;
        r0 = r4.f8707f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof s2.y
            r1 = 0
            if (r0 == 0) goto L_0x0046
            s2.y r4 = (s2.y) r4
            int r0 = r4.f8707f
            int r2 = r3.f8707f
            if (r2 != r0) goto L_0x0046
            int r0 = r3.f8706e
            int r2 = r4.f8706e
            if (r0 != r2) goto L_0x0046
            q2.l<?> r0 = r3.f8710i
            q2.l<?> r2 = r4.f8710i
            boolean r0 = m3.j.a(r0, r2)
            if (r0 == 0) goto L_0x0046
            java.lang.Class<?> r0 = r3.f8708g
            java.lang.Class<?> r2 = r4.f8708g
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0046
            q2.f r0 = r3.f8705c
            q2.f r2 = r4.f8705c
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0046
            q2.f r0 = r3.d
            q2.f r2 = r4.d
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0046
            q2.h r0 = r3.f8709h
            q2.h r4 = r4.f8709h
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0046
            r1 = 1
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.y.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = ((((this.d.hashCode() + (this.f8705c.hashCode() * 31)) * 31) + this.f8706e) * 31) + this.f8707f;
        l<?> lVar = this.f8710i;
        if (lVar != null) {
            hashCode = (hashCode * 31) + lVar.hashCode();
        }
        int hashCode2 = this.f8708g.hashCode();
        return this.f8709h.hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f8705c + ", signature=" + this.d + ", width=" + this.f8706e + ", height=" + this.f8707f + ", decodedResourceClass=" + this.f8708g + ", transformation='" + this.f8710i + "', options=" + this.f8709h + '}';
    }
}

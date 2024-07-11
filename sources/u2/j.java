package u2;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import m3.g;
import n3.a;
import n3.d;
import q2.f;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final g<f, String> f9082a = new g<>(1000);

    /* renamed from: b  reason: collision with root package name */
    public final a.c f9083b = n3.a.a(10, new a());

    public class a implements a.b<b> {
        public final Object a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public static final class b implements a.d {

        /* renamed from: o  reason: collision with root package name */
        public final MessageDigest f9084o;

        /* renamed from: p  reason: collision with root package name */
        public final d.a f9085p = new d.a();

        public b(MessageDigest messageDigest) {
            this.f9084o = messageDigest;
        }

        public final d.a k() {
            return this.f9085p;
        }
    }

    public final String a(f fVar) {
        String a10;
        synchronized (this.f9082a) {
            a10 = this.f9082a.a(fVar);
        }
        if (a10 == null) {
            Object b10 = this.f9083b.b();
            s6.a.n(b10);
            b bVar = (b) b10;
            try {
                fVar.a(bVar.f9084o);
                byte[] digest = bVar.f9084o.digest();
                char[] cArr = m3.j.f7085b;
                synchronized (cArr) {
                    for (int i10 = 0; i10 < digest.length; i10++) {
                        byte b11 = digest[i10] & 255;
                        int i11 = i10 * 2;
                        char[] cArr2 = m3.j.f7084a;
                        cArr[i11] = cArr2[b11 >>> 4];
                        cArr[i11 + 1] = cArr2[b11 & 15];
                    }
                    a10 = new String(cArr);
                }
                this.f9083b.a(bVar);
            } catch (Throwable th) {
                this.f9083b.a(bVar);
                throw th;
            }
        }
        synchronized (this.f9082a) {
            this.f9082a.d(fVar, a10);
        }
        return a10;
    }
}

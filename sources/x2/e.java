package x2;

import java.io.InputStream;
import java.net.URL;
import q2.h;
import w2.f;
import w2.n;
import w2.o;
import w2.r;

public final class e implements n<URL, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final n<f, InputStream> f9465a;

    public static class a implements o<URL, InputStream> {
        public final n<URL, InputStream> b(r rVar) {
            return new e(rVar.b(f.class, InputStream.class));
        }
    }

    public e(n<f, InputStream> nVar) {
        this.f9465a = nVar;
    }

    public final n.a a(Object obj, int i10, int i11, h hVar) {
        return this.f9465a.a(new f((URL) obj), i10, i11, hVar);
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        URL url = (URL) obj;
        return true;
    }
}

package w2;

import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import q2.h;
import w2.n;

public final class b<Data> implements n<byte[], Data> {

    /* renamed from: a  reason: collision with root package name */
    public final C0148b<Data> f9157a;

    public static class a implements o<byte[], ByteBuffer> {

        /* renamed from: w2.b$a$a  reason: collision with other inner class name */
        public class C0147a implements C0148b<ByteBuffer> {
            public final Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            public final Object b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        public final n<byte[], ByteBuffer> b(r rVar) {
            return new b(new C0147a());
        }
    }

    /* renamed from: w2.b$b  reason: collision with other inner class name */
    public interface C0148b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    public static class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: o  reason: collision with root package name */
        public final byte[] f9158o;

        /* renamed from: p  reason: collision with root package name */
        public final C0148b<Data> f9159p;

        public c(byte[] bArr, C0148b<Data> bVar) {
            this.f9158o = bArr;
            this.f9159p = bVar;
        }

        public final Class<Data> a() {
            return this.f9159p.a();
        }

        public final void b() {
        }

        public final void cancel() {
        }

        public final q2.a e() {
            return q2.a.LOCAL;
        }

        public final void f(j jVar, d.a<? super Data> aVar) {
            aVar.d(this.f9159p.b(this.f9158o));
        }
    }

    public static class d implements o<byte[], InputStream> {

        public class a implements C0148b<InputStream> {
            public final Class<InputStream> a() {
                return InputStream.class;
            }

            public final Object b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        public final n<byte[], InputStream> b(r rVar) {
            return new b(new a());
        }
    }

    public b(C0148b<Data> bVar) {
        this.f9157a = bVar;
    }

    public final n.a a(Object obj, int i10, int i11, h hVar) {
        byte[] bArr = (byte[]) obj;
        return new n.a(new l3.b(bArr), new c(bArr, this.f9157a));
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        byte[] bArr = (byte[]) obj;
        return true;
    }
}

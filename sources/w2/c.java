package w2;

import android.util.Log;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import q2.h;
import w2.n;

public final class c implements n<File, ByteBuffer> {

    public static final class a implements d<ByteBuffer> {

        /* renamed from: o  reason: collision with root package name */
        public final File f9160o;

        public a(File file) {
            this.f9160o = file;
        }

        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        public final void b() {
        }

        public final void cancel() {
        }

        public final q2.a e() {
            return q2.a.LOCAL;
        }

        public final void f(j jVar, d.a<? super ByteBuffer> aVar) {
            try {
                aVar.d(m3.a.a(this.f9160o));
            } catch (IOException e10) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e10);
                }
                aVar.c(e10);
            }
        }
    }

    public static class b implements o<File, ByteBuffer> {
        public final n<File, ByteBuffer> b(r rVar) {
            return new c();
        }
    }

    public final n.a a(Object obj, int i10, int i11, h hVar) {
        File file = (File) obj;
        return new n.a(new l3.b(file), new a(file));
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        File file = (File) obj;
        return true;
    }
}

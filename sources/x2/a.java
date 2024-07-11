package x2;

import com.bumptech.glide.load.data.i;
import java.io.InputStream;
import java.util.ArrayDeque;
import q2.g;
import q2.h;
import w2.f;
import w2.l;
import w2.m;
import w2.n;
import w2.o;
import w2.r;

public final class a implements n<f, InputStream> {

    /* renamed from: b  reason: collision with root package name */
    public static final g<Integer> f9444b = g.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* renamed from: a  reason: collision with root package name */
    public final m<f, f> f9445a;

    /* renamed from: x2.a$a  reason: collision with other inner class name */
    public static class C0159a implements o<f, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final m<f, f> f9446a = new m<>();

        public final n<f, InputStream> b(r rVar) {
            return new a(this.f9446a);
        }
    }

    public a(m<f, f> mVar) {
        this.f9445a = mVar;
    }

    public final n.a a(Object obj, int i10, int i11, h hVar) {
        f fVar = (f) obj;
        m<f, f> mVar = this.f9445a;
        if (mVar != null) {
            m.a a10 = m.a.a(fVar);
            l lVar = mVar.f9188a;
            Object a11 = lVar.a(a10);
            ArrayDeque arrayDeque = m.a.d;
            synchronized (arrayDeque) {
                arrayDeque.offer(a10);
            }
            f fVar2 = (f) a11;
            if (fVar2 == null) {
                lVar.d(m.a.a(fVar), fVar);
            } else {
                fVar = fVar2;
            }
        }
        return new n.a(fVar, new i(fVar, ((Integer) hVar.c(f9444b)).intValue()));
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        f fVar = (f) obj;
        return true;
    }
}

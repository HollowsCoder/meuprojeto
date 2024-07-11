package z2;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import m3.d;
import q2.h;
import q2.j;
import s2.w;
import t2.b;
import t2.c;
import z2.m;
import z2.s;

public final class y implements j<InputStream, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final m f9868a;

    /* renamed from: b  reason: collision with root package name */
    public final b f9869b;

    public static class a implements m.b {

        /* renamed from: a  reason: collision with root package name */
        public final w f9870a;

        /* renamed from: b  reason: collision with root package name */
        public final d f9871b;

        public a(w wVar, d dVar) {
            this.f9870a = wVar;
            this.f9871b = dVar;
        }

        public final void a(Bitmap bitmap, c cVar) {
            IOException iOException = this.f9871b.f7070p;
            if (iOException != null) {
                if (bitmap != null) {
                    cVar.e(bitmap);
                }
                throw iOException;
            }
        }

        public final void b() {
            w wVar = this.f9870a;
            synchronized (wVar) {
                wVar.f9862q = wVar.f9860o.length;
            }
        }
    }

    public y(m mVar, b bVar) {
        this.f9868a = mVar;
        this.f9869b = bVar;
    }

    public final w a(Object obj, int i10, int i11, h hVar) {
        boolean z;
        w wVar;
        d dVar;
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof w) {
            z = false;
            wVar = (w) inputStream;
        } else {
            wVar = new w(inputStream, this.f9869b);
            z = true;
        }
        ArrayDeque arrayDeque = d.f7068q;
        synchronized (arrayDeque) {
            dVar = (d) arrayDeque.poll();
        }
        if (dVar == null) {
            dVar = new d();
        }
        d dVar2 = dVar;
        dVar2.f7069o = wVar;
        m3.h hVar2 = new m3.h(dVar2);
        a aVar = new a(wVar, dVar2);
        try {
            m mVar = this.f9868a;
            d a10 = mVar.a(new s.a(mVar.f9834c, hVar2, mVar.d), i10, i11, hVar, aVar);
            dVar2.f7070p = null;
            dVar2.f7069o = null;
            synchronized (arrayDeque) {
                arrayDeque.offer(dVar2);
            }
            if (z) {
                wVar.b();
            }
            return a10;
        } catch (Throwable th) {
            dVar2.f7070p = null;
            dVar2.f7069o = null;
            ArrayDeque arrayDeque2 = d.f7068q;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(dVar2);
                if (z) {
                    wVar.b();
                }
                throw th;
            }
        }
    }

    public final boolean b(Object obj, h hVar) {
        InputStream inputStream = (InputStream) obj;
        this.f9868a.getClass();
        return true;
    }
}

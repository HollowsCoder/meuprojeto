package s2;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import m3.f;
import q2.a;
import q2.d;
import s2.h;
import s2.m;
import w2.n;

public final class b0 implements h, h.a {

    /* renamed from: o  reason: collision with root package name */
    public final i<?> f8557o;

    /* renamed from: p  reason: collision with root package name */
    public final h.a f8558p;

    /* renamed from: q  reason: collision with root package name */
    public int f8559q;

    /* renamed from: r  reason: collision with root package name */
    public e f8560r;

    /* renamed from: s  reason: collision with root package name */
    public Object f8561s;

    /* renamed from: t  reason: collision with root package name */
    public volatile n.a<?> f8562t;
    public f u;

    public b0(i<?> iVar, h.a aVar) {
        this.f8557o = iVar;
        this.f8558p = aVar;
    }

    /* JADX INFO: finally extract failed */
    public final boolean a() {
        boolean z;
        boolean z10;
        Object obj = this.f8561s;
        if (obj != null) {
            this.f8561s = null;
            int i10 = f.f7074b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            try {
                d<X> d = this.f8557o.d(obj);
                g gVar = new g(d, obj, this.f8557o.f8588i);
                q2.f fVar = this.f8562t.f9192a;
                i<?> iVar = this.f8557o;
                this.u = new f(fVar, iVar.f8592n);
                ((m.c) iVar.f8587h).a().a(this.u, gVar);
                if (Log.isLoggable("SourceGenerator", 2)) {
                    Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.u + ", data: " + obj + ", encoder: " + d + ", duration: " + f.a(elapsedRealtimeNanos));
                }
                this.f8562t.f9194c.b();
                this.f8560r = new e(Collections.singletonList(this.f8562t.f9192a), this.f8557o, this);
            } catch (Throwable th) {
                this.f8562t.f9194c.b();
                throw th;
            }
        }
        e eVar = this.f8560r;
        if (eVar != null && eVar.a()) {
            return true;
        }
        this.f8560r = null;
        this.f8562t = null;
        boolean z11 = false;
        while (!z11) {
            if (this.f8559q < this.f8557o.b().size()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                break;
            }
            ArrayList b10 = this.f8557o.b();
            int i11 = this.f8559q;
            this.f8559q = i11 + 1;
            this.f8562t = (n.a) b10.get(i11);
            if (this.f8562t != null) {
                if (!this.f8557o.f8594p.c(this.f8562t.f9194c.e())) {
                    if (this.f8557o.c(this.f8562t.f9194c.a()) != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                    }
                }
                this.f8562t.f9194c.f(this.f8557o.f8593o, new a0(this, this.f8562t));
                z11 = true;
            }
        }
        return z11;
    }

    public final void cancel() {
        n.a<?> aVar = this.f8562t;
        if (aVar != null) {
            aVar.f9194c.cancel();
        }
    }

    public final void g() {
        throw new UnsupportedOperationException();
    }

    public final void i(q2.f fVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, a aVar) {
        this.f8558p.i(fVar, exc, dVar, this.f8562t.f9194c.e());
    }

    public final void l(q2.f fVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, a aVar, q2.f fVar2) {
        this.f8558p.l(fVar, obj, dVar, this.f8562t.f9194c.e(), fVar);
    }
}

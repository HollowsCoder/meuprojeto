package s2;

import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.List;
import q2.a;
import q2.f;
import s2.h;
import s2.m;
import w2.n;

public final class e implements h, d.a<Object> {

    /* renamed from: o  reason: collision with root package name */
    public final List<f> f8569o;

    /* renamed from: p  reason: collision with root package name */
    public final i<?> f8570p;

    /* renamed from: q  reason: collision with root package name */
    public final h.a f8571q;

    /* renamed from: r  reason: collision with root package name */
    public int f8572r = -1;

    /* renamed from: s  reason: collision with root package name */
    public f f8573s;

    /* renamed from: t  reason: collision with root package name */
    public List<n<File, ?>> f8574t;
    public int u;

    /* renamed from: v  reason: collision with root package name */
    public volatile n.a<?> f8575v;
    public File w;

    public e(List<f> list, i<?> iVar, h.a aVar) {
        this.f8569o = list;
        this.f8570p = iVar;
        this.f8571q = aVar;
    }

    public final boolean a() {
        boolean z;
        boolean z10;
        boolean z11;
        while (true) {
            List<n<File, ?>> list = this.f8574t;
            if (list != null) {
                if (this.u < list.size()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f8575v = null;
                    boolean z12 = false;
                    while (!z12) {
                        if (this.u < this.f8574t.size()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            break;
                        }
                        List<n<File, ?>> list2 = this.f8574t;
                        int i10 = this.u;
                        this.u = i10 + 1;
                        File file = this.w;
                        i<?> iVar = this.f8570p;
                        this.f8575v = list2.get(i10).a(file, iVar.f8584e, iVar.f8585f, iVar.f8588i);
                        if (this.f8575v != null) {
                            if (this.f8570p.c(this.f8575v.f9194c.a()) != null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                this.f8575v.f9194c.f(this.f8570p.f8593o, this);
                                z12 = true;
                            }
                        }
                    }
                    return z12;
                }
            }
            int i11 = this.f8572r + 1;
            this.f8572r = i11;
            if (i11 >= this.f8569o.size()) {
                return false;
            }
            f fVar = this.f8569o.get(this.f8572r);
            i<?> iVar2 = this.f8570p;
            File e10 = ((m.c) iVar2.f8587h).a().e(new f(fVar, iVar2.f8592n));
            this.w = e10;
            if (e10 != null) {
                this.f8573s = fVar;
                this.f8574t = this.f8570p.f8583c.f2241b.e(e10);
                this.u = 0;
            }
        }
    }

    public final void c(Exception exc) {
        this.f8571q.i(this.f8573s, exc, this.f8575v.f9194c, a.DATA_DISK_CACHE);
    }

    public final void cancel() {
        n.a<?> aVar = this.f8575v;
        if (aVar != null) {
            aVar.f9194c.cancel();
        }
    }

    public final void d(Object obj) {
        this.f8571q.l(this.f8573s, obj, this.f8575v.f9194c, a.DATA_DISK_CACHE, this.f8573s);
    }
}

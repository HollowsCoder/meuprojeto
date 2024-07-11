package w2;

import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import h0.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import q2.f;
import q2.h;
import s2.r;
import w2.n;

public final class q<Model, Data> implements n<Model, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final List<n<Model, Data>> f9199a;

    /* renamed from: b  reason: collision with root package name */
    public final c<List<Throwable>> f9200b;

    public static class a<Data> implements d<Data>, d.a<Data> {

        /* renamed from: o  reason: collision with root package name */
        public final List<d<Data>> f9201o;

        /* renamed from: p  reason: collision with root package name */
        public final c<List<Throwable>> f9202p;

        /* renamed from: q  reason: collision with root package name */
        public int f9203q;

        /* renamed from: r  reason: collision with root package name */
        public j f9204r;

        /* renamed from: s  reason: collision with root package name */
        public d.a<? super Data> f9205s;

        /* renamed from: t  reason: collision with root package name */
        public List<Throwable> f9206t;
        public boolean u;

        public a(ArrayList arrayList, c cVar) {
            this.f9202p = cVar;
            if (!arrayList.isEmpty()) {
                this.f9201o = arrayList;
                this.f9203q = 0;
                return;
            }
            throw new IllegalArgumentException("Must not be empty.");
        }

        public final Class<Data> a() {
            return this.f9201o.get(0).a();
        }

        public final void b() {
            List<Throwable> list = this.f9206t;
            if (list != null) {
                this.f9202p.a(list);
            }
            this.f9206t = null;
            for (d<Data> b10 : this.f9201o) {
                b10.b();
            }
        }

        public final void c(Exception exc) {
            List<Throwable> list = this.f9206t;
            s6.a.n(list);
            list.add(exc);
            g();
        }

        public final void cancel() {
            this.u = true;
            for (d<Data> cancel : this.f9201o) {
                cancel.cancel();
            }
        }

        public final void d(Data data) {
            if (data != null) {
                this.f9205s.d(data);
            } else {
                g();
            }
        }

        public final q2.a e() {
            return this.f9201o.get(0).e();
        }

        public final void f(j jVar, d.a<? super Data> aVar) {
            this.f9204r = jVar;
            this.f9205s = aVar;
            this.f9206t = this.f9202p.b();
            this.f9201o.get(this.f9203q).f(jVar, this);
            if (this.u) {
                cancel();
            }
        }

        public final void g() {
            if (!this.u) {
                if (this.f9203q < this.f9201o.size() - 1) {
                    this.f9203q++;
                    f(this.f9204r, this.f9205s);
                    return;
                }
                s6.a.n(this.f9206t);
                this.f9205s.c(new r("Fetch failed", new ArrayList(this.f9206t)));
            }
        }
    }

    public q(ArrayList arrayList, c cVar) {
        this.f9199a = arrayList;
        this.f9200b = cVar;
    }

    public final n.a<Data> a(Model model, int i10, int i11, h hVar) {
        n.a a10;
        List<n<Model, Data>> list = this.f9199a;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        f fVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            n nVar = list.get(i12);
            if (nVar.b(model) && (a10 = nVar.a(model, i10, i11, hVar)) != null) {
                arrayList.add(a10.f9194c);
                fVar = a10.f9192a;
            }
        }
        if (arrayList.isEmpty() || fVar == null) {
            return null;
        }
        return new n.a<>(fVar, new a(arrayList, this.f9200b));
    }

    public final boolean b(Model model) {
        for (n<Model, Data> b10 : this.f9199a) {
            if (b10.b(model)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f9199a.toArray()) + '}';
    }
}

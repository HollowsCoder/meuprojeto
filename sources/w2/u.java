package w2;

import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import q2.h;
import w2.n;

public final class u<Model> implements n<Model, Model> {

    /* renamed from: a  reason: collision with root package name */
    public static final u<?> f9222a = new u<>();

    public static class a<Model> implements o<Model, Model> {

        /* renamed from: a  reason: collision with root package name */
        public static final a<?> f9223a = new a<>();

        public final n<Model, Model> b(r rVar) {
            return u.f9222a;
        }
    }

    public static class b<Model> implements d<Model> {

        /* renamed from: o  reason: collision with root package name */
        public final Model f9224o;

        public b(Model model) {
            this.f9224o = model;
        }

        public final Class<Model> a() {
            return this.f9224o.getClass();
        }

        public final void b() {
        }

        public final void cancel() {
        }

        public final q2.a e() {
            return q2.a.LOCAL;
        }

        public final void f(j jVar, d.a<? super Model> aVar) {
            aVar.d(this.f9224o);
        }
    }

    public final n.a<Model> a(Model model, int i10, int i11, h hVar) {
        return new n.a<>(new l3.b(model), new b(model));
    }

    public final boolean b(Model model) {
        return true;
    }
}

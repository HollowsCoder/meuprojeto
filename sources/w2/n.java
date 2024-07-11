package w2;

import com.bumptech.glide.load.data.d;
import java.util.Collections;
import java.util.List;
import q2.f;
import q2.h;

public interface n<Model, Data> {

    public static class a<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final f f9192a;

        /* renamed from: b  reason: collision with root package name */
        public final List<f> f9193b;

        /* renamed from: c  reason: collision with root package name */
        public final d<Data> f9194c;

        public a() {
            throw null;
        }

        public a(f fVar, d<Data> dVar) {
            List<f> emptyList = Collections.emptyList();
            s6.a.n(fVar);
            this.f9192a = fVar;
            s6.a.n(emptyList);
            this.f9193b = emptyList;
            s6.a.n(dVar);
            this.f9194c = dVar;
        }
    }

    a<Data> a(Model model, int i10, int i11, h hVar);

    boolean b(Model model);
}

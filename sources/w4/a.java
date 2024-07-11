package w4;

import java.util.Collection;

@Deprecated
public abstract class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f9236a;

    @Deprecated
    /* renamed from: w4.a$a  reason: collision with other inner class name */
    public static class C0151a extends a<Boolean> {
        public C0151a(Boolean bool) {
            super(bool);
        }
    }

    public a(Object obj) {
        b bVar;
        this.f9236a = obj;
        b bVar2 = b.f9237b;
        synchronized (b.class) {
            bVar = b.f9237b;
        }
        ((Collection) bVar.f9238a.f4966o).add(this);
    }
}

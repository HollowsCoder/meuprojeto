package h0;

public final class e<T> extends d {

    /* renamed from: c  reason: collision with root package name */
    public final Object f5111c = new Object();

    public e(int i10) {
        super(i10);
    }

    public final boolean a(T t10) {
        boolean a10;
        synchronized (this.f5111c) {
            a10 = super.a(t10);
        }
        return a10;
    }

    public final T b() {
        T b10;
        synchronized (this.f5111c) {
            b10 = super.b();
        }
        return b10;
    }
}

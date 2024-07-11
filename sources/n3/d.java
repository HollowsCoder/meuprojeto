package n3;

public abstract class d {

    public static class a extends d {

        /* renamed from: a  reason: collision with root package name */
        public volatile boolean f7363a;

        public final void a() {
            if (this.f7363a) {
                throw new IllegalStateException("Already released");
            }
        }
    }
}

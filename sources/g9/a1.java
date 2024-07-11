package g9;

public final class a1 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<c0> f4996a = new ThreadLocal<>();

    public static c0 a() {
        ThreadLocal<c0> threadLocal = f4996a;
        c0 c0Var = threadLocal.get();
        if (c0Var != null) {
            return c0Var;
        }
        c cVar = new c(Thread.currentThread());
        threadLocal.set(cVar);
        return cVar;
    }
}

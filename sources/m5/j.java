package m5;

public final class j<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final r<TResult> f7089a = new r<>();

    public final void a(TResult tresult) {
        this.f7089a.s(tresult);
    }

    public final boolean b(Exception exc) {
        r<TResult> rVar = this.f7089a;
        rVar.getClass();
        if (exc != null) {
            synchronized (rVar.f7112a) {
                if (rVar.f7114c) {
                    return false;
                }
                rVar.f7114c = true;
                rVar.f7116f = exc;
                rVar.f7113b.d(rVar);
                return true;
            }
        }
        throw new NullPointerException("Exception must not be null");
    }

    public final void c(Object obj) {
        r<TResult> rVar = this.f7089a;
        synchronized (rVar.f7112a) {
            if (!rVar.f7114c) {
                rVar.f7114c = true;
                rVar.f7115e = obj;
                rVar.f7113b.d(rVar);
            }
        }
    }
}

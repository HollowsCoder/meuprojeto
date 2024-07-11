package m5;

import android.app.Activity;
import d2.b;
import java.util.concurrent.Executor;

public abstract class i<TResult> {
    public void a(Executor executor, c cVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public void b(Activity activity, b bVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract r c(Executor executor, e eVar);

    public abstract r d(Executor executor, f fVar);

    public <TContinuationResult> i<TContinuationResult> e(Executor executor, a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public void f(a aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> i<TContinuationResult> g(Executor executor, a<TResult, i<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception h();

    public abstract TResult i();

    public abstract Object j();

    public abstract boolean k();

    public abstract boolean l();

    public abstract boolean m();

    public <TContinuationResult> i<TContinuationResult> n(Executor executor, h<TResult, TContinuationResult> hVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public <TContinuationResult> i<TContinuationResult> o(h<TResult, TContinuationResult> hVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}

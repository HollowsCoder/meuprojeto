package kotlinx.coroutines;

import q8.f;

public interface CoroutineExceptionHandler extends f.b {

    public static final class a implements f.c<CoroutineExceptionHandler> {

        /* renamed from: o  reason: collision with root package name */
        public static final /* synthetic */ a f6770o = new a();
    }

    void handleException(f fVar, Throwable th);
}

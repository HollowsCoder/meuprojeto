package g9;

import java.lang.Thread;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p9.u;
import q8.f;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final List<CoroutineExceptionHandler> f5049a;

    /* JADX WARNING: type inference failed for: r0v5, types: [e9.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<kotlinx.coroutines.CoroutineExceptionHandler> r0 = kotlinx.coroutines.CoroutineExceptionHandler.class
            java.lang.ClassLoader r1 = r0.getClassLoader()
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r0, r1)
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = "<this>"
            z8.g.f(r0, r1)
            e9.f r1 = new e9.f
            r1.<init>(r0)
            boolean r0 = r1 instanceof e9.a
            if (r0 == 0) goto L_0x001d
            goto L_0x0023
        L_0x001d:
            e9.a r0 = new e9.a
            r0.<init>(r1)
            r1 = r0
        L_0x0023:
            java.util.List r0 = e9.e.w(r1)
            f5049a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.t.<clinit>():void");
    }

    public static final void a(f fVar, Throwable th) {
        Throwable th2;
        for (CoroutineExceptionHandler handleException : f5049a) {
            try {
                handleException.handleException(fVar, th);
            } catch (Throwable th3) {
                Thread currentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                if (th == th3) {
                    th2 = th;
                } else {
                    th2 = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    u.b(th2, th);
                }
                uncaughtExceptionHandler.uncaughtException(currentThread, th2);
            }
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}

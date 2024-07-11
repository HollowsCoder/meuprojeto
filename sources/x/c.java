package x;

import android.util.Log;
import java.lang.reflect.Method;

public final class c implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Object f9393o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f9394p;

    public c(Object obj, Object obj2) {
        this.f9393o = obj;
        this.f9394p = obj2;
    }

    public final void run() {
        try {
            Method method = b.d;
            Object obj = this.f9394p;
            Object obj2 = this.f9393o;
            if (method != null) {
                method.invoke(obj2, new Object[]{obj, Boolean.FALSE, "AppCompat recreation"});
                return;
            }
            b.f9380e.invoke(obj2, new Object[]{obj, Boolean.FALSE});
        } catch (RuntimeException e10) {
            if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                throw e10;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}

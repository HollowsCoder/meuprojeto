package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.h;
import androidx.lifecycle.l;
import androidx.lifecycle.n;

final class ImmLeaksCleaner implements l {

    /* renamed from: o  reason: collision with root package name */
    public static int f167o;

    public ImmLeaksCleaner() {
        throw null;
    }

    public final void f(n nVar, h.b bVar) {
        if (bVar == h.b.ON_DESTROY) {
            if (f167o == 0) {
                Class<InputMethodManager> cls = InputMethodManager.class;
                try {
                    f167o = 2;
                    cls.getDeclaredField("mServedView").setAccessible(true);
                    cls.getDeclaredField("mNextServedView").setAccessible(true);
                    cls.getDeclaredField("mH").setAccessible(true);
                    f167o = 1;
                } catch (NoSuchFieldException unused) {
                }
            }
            if (f167o == 1) {
                throw null;
            }
        }
    }
}

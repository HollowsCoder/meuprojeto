package e;

import android.content.Context;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import n.d;

public abstract class f {

    /* renamed from: o  reason: collision with root package name */
    public static final d<WeakReference<f>> f4329o = new d<>();

    /* renamed from: p  reason: collision with root package name */
    public static final Object f4330p = new Object();

    public static void p(f fVar) {
        synchronized (f4330p) {
            Iterator<WeakReference<f>> it = f4329o.iterator();
            while (it.hasNext()) {
                f fVar2 = (f) it.next().get();
                if (fVar2 == fVar || fVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public Context d(Context context) {
        return context;
    }

    public abstract <T extends View> T e(int i10);

    public int f() {
        return -100;
    }

    public abstract MenuInflater g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n();

    public abstract void o();

    public abstract boolean q(int i10);

    public abstract void r(int i10);

    public abstract void s(View view);

    public abstract void t(View view, ViewGroup.LayoutParams layoutParams);

    public void u(int i10) {
    }

    public abstract void v(CharSequence charSequence);
}

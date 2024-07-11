package i8;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.lang.ref.WeakReference;

public final class g implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ f f6151o;

    public g(f fVar) {
        this.f6151o = fVar;
    }

    public final void run() {
        ViewGroup viewGroup;
        Activity activity;
        f fVar = this.f6151o;
        fVar.getClass();
        WeakReference<Activity> weakReference = f.f6148b;
        if (weakReference == null || (activity = weakReference.get()) == null) {
            viewGroup = null;
        } else {
            Window window = activity.getWindow();
            z8.g.b(window, "it.window");
            View decorView = window.getDecorView();
            if (decorView != null) {
                viewGroup = (ViewGroup) decorView;
            } else {
                throw new n8.g("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
        if (viewGroup != null) {
            viewGroup.addView(fVar.f6150a);
        }
    }
}

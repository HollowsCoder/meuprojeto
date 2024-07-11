package i8;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import i0.b0;
import i0.w;
import java.lang.ref.WeakReference;
import n8.g;

public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static WeakReference<Activity> f6148b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f6149c = new a();

    /* renamed from: a  reason: collision with root package name */
    public a f6150a;

    public static final class a {
        public static f a(Activity activity) {
            View view;
            int childCount;
            a aVar;
            if (activity != null) {
                f fVar = new f();
                Window window = activity.getWindow();
                if (window != null) {
                    view = window.getDecorView();
                } else {
                    view = null;
                }
                if (!(view instanceof ViewGroup)) {
                    view = null;
                }
                ViewGroup viewGroup = (ViewGroup) view;
                if (viewGroup != null && (childCount = viewGroup.getChildCount()) >= 0) {
                    int i10 = 0;
                    while (true) {
                        if (viewGroup.getChildAt(i10) instanceof a) {
                            View childAt = viewGroup.getChildAt(i10);
                            if (childAt != null) {
                                aVar = (a) childAt;
                            } else {
                                throw new g("null cannot be cast to non-null type com.tapadoo.alerter.Alert");
                            }
                        } else {
                            aVar = null;
                        }
                        if (!(aVar == null || aVar.getWindowToken() == null)) {
                            b0 a10 = w.a(aVar);
                            a10.a(0.0f);
                            f.f6149c.getClass();
                            e eVar = new e(aVar);
                            View view2 = a10.f5956a.get();
                            if (view2 != null) {
                                view2.animate().withEndAction(eVar);
                            }
                        }
                        if (i10 == childCount) {
                            break;
                        }
                        i10++;
                    }
                }
                f.f6148b = new WeakReference<>(activity);
                fVar.f6150a = new a(activity);
                return fVar;
            }
            throw new IllegalArgumentException("Activity cannot be null!".toString());
        }
    }
}

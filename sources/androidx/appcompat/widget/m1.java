package androidx.appcompat.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import i0.b0;
import i0.w;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public final class m1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f654a;

    static {
        Class<Rect> cls = Rect.class;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{cls, cls});
            f654a = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                declaredMethod.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    public static boolean a(View view) {
        WeakHashMap<View, b0> weakHashMap = w.f6004a;
        if (w.e.d(view) == 1) {
            return true;
        }
        return false;
    }
}

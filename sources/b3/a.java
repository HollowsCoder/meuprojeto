package b3;

import a0.d;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import h.c;
import y.a;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f1952a = true;

    public static Drawable a(Context context, Context context2, int i10, Resources.Theme theme) {
        Context context3;
        try {
            if (f1952a) {
                if (theme != null) {
                    context3 = new c(context2, theme);
                } else {
                    context3 = context2;
                }
                return f.a.b(context3, i10);
            }
        } catch (NoClassDefFoundError unused) {
            f1952a = false;
        } catch (IllegalStateException e10) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                Object obj = y.a.f9523a;
                return a.c.b(context2, i10);
            }
            throw e10;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal<TypedValue> threadLocal = d.f22a;
        return resources.getDrawable(i10, theme);
    }
}

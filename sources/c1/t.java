package c1;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import i0.b0;
import i0.w;
import java.util.WeakHashMap;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final x f2131a = (Build.VERSION.SDK_INT >= 29 ? new y() : new x());

    /* renamed from: b  reason: collision with root package name */
    public static final a f2132b = new a();

    public static class a extends Property<View, Float> {
        public a() {
            super(Float.class, "translationAlpha");
        }

        public final Object get(Object obj) {
            return Float.valueOf(t.f2131a.T((View) obj));
        }

        public final void set(Object obj, Object obj2) {
            float floatValue = ((Float) obj2).floatValue();
            t.f2131a.U((View) obj, floatValue);
        }
    }

    public static class b extends Property<View, Rect> {
        public b() {
            super(Rect.class, "clipBounds");
        }

        public final Object get(Object obj) {
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            return w.f.a((View) obj);
        }

        public final void set(Object obj, Object obj2) {
            WeakHashMap<View, b0> weakHashMap = w.f6004a;
            w.f.c((View) obj, (Rect) obj2);
        }
    }

    static {
        new b();
    }

    public static void a(View view, int i10, int i11, int i12, int i13) {
        f2131a.X(view, i10, i11, i12, i13);
    }
}

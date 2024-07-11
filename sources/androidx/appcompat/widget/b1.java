package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;

public final class b1 extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f510a = new Object();

    public static void a(Context context) {
        if (!(context instanceof b1) && !(context.getResources() instanceof d1)) {
            context.getResources();
            int i10 = l1.f650a;
        }
    }
}

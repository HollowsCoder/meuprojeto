package androidx.fragment.app;

import android.view.View;
import c1.f;
import java.util.ArrayList;

public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final j0 f1182a = new j0();

    /* renamed from: b  reason: collision with root package name */
    public static final m0 f1183b;

    static {
        m0 m0Var;
        try {
            m0Var = f.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            m0Var = null;
        }
        f1183b = m0Var;
    }

    public static void a(n nVar, n nVar2, boolean z) {
        if (z) {
            nVar2.getClass();
        } else {
            nVar.getClass();
        }
    }

    public static void b(ArrayList<View> arrayList, int i10) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i10);
            }
        }
    }
}

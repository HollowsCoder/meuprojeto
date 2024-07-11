package dagger.hilt.android.internal.managers;

import android.content.ContextWrapper;
import androidx.lifecycle.h;
import androidx.lifecycle.l;
import androidx.lifecycle.n;

public final class ViewComponentManager$FragmentContextWrapper extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f4315a = 0;

    /* renamed from: dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1  reason: invalid class name */
    public class AnonymousClass1 implements l {
        public final void f(n nVar, h.b bVar) {
            if (bVar == h.b.ON_DESTROY) {
                int i10 = ViewComponentManager$FragmentContextWrapper.f4315a;
                throw null;
            }
        }
    }
}

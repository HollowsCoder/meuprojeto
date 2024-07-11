package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.appcompat.widget.x0;
import androidx.lifecycle.h;
import androidx.lifecycle.l;
import androidx.lifecycle.n;
import androidx.savedstate.a;
import b0.d;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

@SuppressLint({"RestrictedApi"})
final class Recreator implements l {

    /* renamed from: o  reason: collision with root package name */
    public final c f1876o;

    public static final class a implements a.b {

        /* renamed from: a  reason: collision with root package name */
        public final HashSet f1877a = new HashSet();

        public a(a aVar) {
            aVar.b("androidx.savedstate.Restarter", this);
        }

        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.f1877a));
            return bundle;
        }
    }

    public Recreator(c cVar) {
        this.f1876o = cVar;
    }

    public final void f(n nVar, h.b bVar) {
        if (bVar == h.b.ON_CREATE) {
            nVar.r().b(this);
            c cVar = this.f1876o;
            Bundle a10 = cVar.c().a("androidx.savedstate.Restarter");
            if (a10 != null) {
                ArrayList<String> stringArrayList = a10.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        try {
                            Class<? extends U> asSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(a.C0022a.class);
                            try {
                                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                                declaredConstructor.setAccessible(true);
                                try {
                                    ((a.C0022a) declaredConstructor.newInstance(new Object[0])).a(cVar);
                                } catch (Exception e10) {
                                    throw new RuntimeException(x0.e("Failed to instantiate ", next), e10);
                                }
                            } catch (NoSuchMethodException e11) {
                                throw new IllegalStateException("Class" + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
                            }
                        } catch (ClassNotFoundException e12) {
                            throw new RuntimeException(d.f("Class ", next, " wasn't found"), e12);
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}

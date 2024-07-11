package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import z8.g;

public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final c0 f1381a;

    /* renamed from: b  reason: collision with root package name */
    public final b f1382b;

    public static class a extends d {

        /* renamed from: c  reason: collision with root package name */
        public static a f1383c;

        /* renamed from: b  reason: collision with root package name */
        public final Application f1384b;

        public a(Application application) {
            g.f(application, "application");
            this.f1384b = application;
        }

        public final <T extends a0> T a(Class<T> cls) {
            if (!a.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                T t10 = (a0) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{this.f1384b});
                g.e(t10, "{\n                try {\n…          }\n            }");
                return t10;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException(g.k(cls, "Cannot create an instance of "), e10);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException(g.k(cls, "Cannot create an instance of "), e11);
            } catch (InstantiationException e12) {
                throw new RuntimeException(g.k(cls, "Cannot create an instance of "), e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException(g.k(cls, "Cannot create an instance of "), e13);
            }
        }
    }

    public interface b {
        <T extends a0> T a(Class<T> cls);
    }

    public static abstract class c extends e implements b {
        public <T extends a0> T a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementations of KeyedFactory");
        }

        public abstract <T extends a0> T c(String str, Class<T> cls);
    }

    public static class d implements b {

        /* renamed from: a  reason: collision with root package name */
        public static d f1385a;

        public <T extends a0> T a(Class<T> cls) {
            try {
                T newInstance = cls.newInstance();
                g.e(newInstance, "{\n                modelC…wInstance()\n            }");
                return (a0) newInstance;
            } catch (InstantiationException e10) {
                throw new RuntimeException(g.k(cls, "Cannot create an instance of "), e10);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException(g.k(cls, "Cannot create an instance of "), e11);
            }
        }
    }

    public static class e {
        public void b(a0 a0Var) {
        }
    }

    public b0(c0 c0Var, b bVar) {
        g.f(c0Var, "store");
        this.f1381a = c0Var;
        this.f1382b = bVar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b0(androidx.lifecycle.d0 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "owner"
            z8.g.f(r3, r0)
            androidx.lifecycle.c0 r0 = r3.n()
            java.lang.String r1 = "owner.viewModelStore"
            z8.g.e(r0, r1)
            boolean r1 = r3 instanceof androidx.lifecycle.g
            if (r1 == 0) goto L_0x001e
            androidx.lifecycle.g r3 = (androidx.lifecycle.g) r3
            androidx.lifecycle.b0$b r3 = r3.i()
            java.lang.String r1 = "owner.defaultViewModelProviderFactory"
            z8.g.e(r3, r1)
            goto L_0x002e
        L_0x001e:
            androidx.lifecycle.b0$d r3 = androidx.lifecycle.b0.d.f1385a
            if (r3 != 0) goto L_0x0029
            androidx.lifecycle.b0$d r3 = new androidx.lifecycle.b0$d
            r3.<init>()
            androidx.lifecycle.b0.d.f1385a = r3
        L_0x0029:
            androidx.lifecycle.b0$d r3 = androidx.lifecycle.b0.d.f1385a
            z8.g.c(r3)
        L_0x002e:
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.b0.<init>(androidx.lifecycle.d0):void");
    }

    public final <T extends a0> T a(Class<T> cls) {
        T t10;
        e eVar;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            String k10 = g.k(canonicalName, "androidx.lifecycle.ViewModelProvider.DefaultKey:");
            g.f(k10, "key");
            c0 c0Var = this.f1381a;
            T t11 = (a0) c0Var.f1386a.get(k10);
            boolean isInstance = cls.isInstance(t11);
            b bVar = this.f1382b;
            if (isInstance) {
                if (bVar instanceof e) {
                    eVar = (e) bVar;
                } else {
                    eVar = null;
                }
                if (eVar != null) {
                    g.e(t11, "viewModel");
                    eVar.b(t11);
                }
                if (t11 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
                }
            } else {
                if (bVar instanceof c) {
                    t10 = ((c) bVar).c(k10, cls);
                } else {
                    t10 = bVar.a(cls);
                }
                t11 = t10;
                a0 put = c0Var.f1386a.put(k10, t11);
                if (put != null) {
                    put.a();
                }
                g.e(t11, "viewModel");
            }
            return t11;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}

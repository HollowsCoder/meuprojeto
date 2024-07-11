package e1;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import n.b;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final b<String, Method> f4447a;

    /* renamed from: b  reason: collision with root package name */
    public final b<String, Method> f4448b;

    /* renamed from: c  reason: collision with root package name */
    public final b<String, Class> f4449c;

    public a(b<String, Method> bVar, b<String, Method> bVar2, b<String, Class> bVar3) {
        this.f4447a = bVar;
        this.f4448b = bVar2;
        this.f4449c = bVar3;
    }

    public abstract b a();

    public final Class b(Class<? extends c> cls) {
        String name = cls.getName();
        b<String, Class> bVar = this.f4449c;
        Class orDefault = bVar.getOrDefault(name, null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        bVar.put(cls.getName(), cls2);
        return cls2;
    }

    public final Method c(String str) {
        b<String, Method> bVar = this.f4447a;
        Method orDefault = bVar.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        System.currentTimeMillis();
        Class<a> cls = a.class;
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        bVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        b<String, Method> bVar = this.f4448b;
        Method orDefault = bVar.getOrDefault(name, null);
        if (orDefault != null) {
            return orDefault;
        }
        Class b10 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b10.getDeclaredMethod("write", new Class[]{cls, a.class});
        bVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e();

    public abstract byte[] f();

    public abstract CharSequence g();

    public abstract boolean h(int i10);

    public abstract int i();

    public final int j(int i10, int i11) {
        return !h(i11) ? i10 : i();
    }

    public abstract <T extends Parcelable> T k();

    public abstract String l();

    public final <T extends c> T m() {
        String l = l();
        if (l == null) {
            return null;
        }
        b a10 = a();
        try {
            return (c) c(l).invoke((Object) null, new Object[]{a10});
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
        } catch (InvocationTargetException e11) {
            if (e11.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e11.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (ClassNotFoundException e13) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e13);
        }
    }

    public abstract void n(int i10);

    public abstract void o(boolean z);

    public abstract void p(byte[] bArr);

    public abstract void q(CharSequence charSequence);

    public abstract void r(int i10);

    public final void s(int i10, int i11) {
        n(i11);
        r(i10);
    }

    public abstract void t(Parcelable parcelable);

    public abstract void u(String str);

    public final void v(c cVar) {
        if (cVar == null) {
            u((String) null);
            return;
        }
        try {
            u(b(cVar.getClass()).getName());
            b a10 = a();
            try {
                d(cVar.getClass()).invoke((Object) null, new Object[]{cVar, a10});
                a10.w();
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
            } catch (InvocationTargetException e11) {
                if (e11.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e11.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
            } catch (ClassNotFoundException e13) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e13);
            }
        } catch (ClassNotFoundException e14) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e14);
        }
    }
}

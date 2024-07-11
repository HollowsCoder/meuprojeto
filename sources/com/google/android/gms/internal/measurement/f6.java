package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b6;
import com.google.android.gms.internal.measurement.f6;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class f6<MessageType extends f6<MessageType, BuilderType>, BuilderType extends b6<MessageType, BuilderType>> extends b5<MessageType, BuilderType> {
    private static final Map<Object, f6<?, ?>> zza = new ConcurrentHashMap();
    protected f8 zzc = f8.f2700f;
    protected int zzd = -1;

    public static Object j(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public static x6 k(l6 l6Var) {
        int i10;
        int size = l6Var.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size + size;
        }
        x6 x6Var = (x6) l6Var;
        if (i10 >= x6Var.f2990q) {
            return new x6(Arrays.copyOf(x6Var.f2989p, i10), x6Var.f2990q);
        }
        throw new IllegalArgumentException();
    }

    public static <E> m6<E> l(m6<E> m6Var) {
        int size = m6Var.size();
        return m6Var.x(size == 0 ? 10 : size + size);
    }

    public static <T extends f6> T o(Class<T> cls) {
        Map<Object, f6<?, ?>> map = zza;
        T t10 = (f6) map.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (f6) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t10 == null) {
            t10 = (f6) ((f6) o8.e(cls)).q(6);
            if (t10 != null) {
                map.put(cls, t10);
            } else {
                throw new IllegalStateException();
            }
        }
        return t10;
    }

    public static <T extends f6> void p(Class<T> cls, T t10) {
        zza.put(cls, t10);
    }

    public final int b() {
        return this.zzd;
    }

    public final int d() {
        int i10 = this.zzd;
        if (i10 != -1) {
            return i10;
        }
        int g10 = q7.f2894c.a(getClass()).g(this);
        this.zzd = g10;
        return g10;
    }

    public final /* bridge */ /* synthetic */ b6 e() {
        return (b6) q(5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return q7.f2894c.a(getClass()).c(this, (f6) obj);
        }
        return false;
    }

    public final void f(int i10) {
        this.zzd = i10;
    }

    public final /* bridge */ /* synthetic */ f6 h() {
        return (f6) q(6);
    }

    public final int hashCode() {
        int i10 = this.zzb;
        if (i10 != 0) {
            return i10;
        }
        int a10 = q7.f2894c.a(getClass()).a(this);
        this.zzb = a10;
        return a10;
    }

    public final /* bridge */ /* synthetic */ b6 i() {
        b6 b6Var = (b6) q(5);
        b6Var.k(this);
        return b6Var;
    }

    public final <MessageType extends f6<MessageType, BuilderType>, BuilderType extends b6<MessageType, BuilderType>> BuilderType m() {
        return (b6) q(5);
    }

    public final BuilderType n() {
        BuilderType buildertype = (b6) q(5);
        buildertype.k(this);
        return buildertype;
    }

    public abstract Object q(int i10);

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        k7.b(this, sb, 0);
        return sb.toString();
    }
}

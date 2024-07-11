package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.p0;
import com.google.android.gms.internal.clearcut.p0.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class p0<MessageType extends p0<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends m<MessageType, BuilderType> {
    private static Map<Object, p0<?, ?>> zzjr = new ConcurrentHashMap();
    protected v2 zzjp = v2.f2566f;
    private int zzjq = -1;

    public static abstract class a<MessageType extends p0<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends n<MessageType, BuilderType> {

        /* renamed from: o  reason: collision with root package name */
        public final MessageType f2514o;

        /* renamed from: p  reason: collision with root package name */
        public MessageType f2515p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f2516q = false;

        public a(MessageType messagetype) {
            this.f2514o = messagetype;
            this.f2515p = (p0) messagetype.e(4);
        }

        public final /* synthetic */ Object clone() {
            a aVar = (a) this.f2514o.e(5);
            aVar.e(n());
            return aVar;
        }

        public final /* synthetic */ p0 d() {
            return this.f2514o;
        }

        public final BuilderType e(MessageType messagetype) {
            m();
            MessageType messagetype2 = this.f2515p;
            d2 d2Var = d2.f2398c;
            d2Var.getClass();
            d2Var.a(messagetype2.getClass()).b(messagetype2, messagetype);
            return this;
        }

        public final void m() {
            if (this.f2516q) {
                MessageType messagetype = (p0) this.f2515p.e(4);
                MessageType messagetype2 = this.f2515p;
                d2 d2Var = d2.f2398c;
                d2Var.getClass();
                d2Var.a(messagetype.getClass()).b(messagetype, messagetype2);
                this.f2515p = messagetype;
                this.f2516q = false;
            }
        }

        public final p0 n() {
            if (!this.f2516q) {
                MessageType messagetype = this.f2515p;
                d2 d2Var = d2.f2398c;
                d2Var.getClass();
                d2Var.a(messagetype.getClass()).a(messagetype);
                this.f2516q = true;
            }
            return this.f2515p;
        }
    }

    public static class b<T extends p0<T, ?>> extends o<T> {
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends p0<MessageType, BuilderType> implements t1 {
        protected g0<d> zzjv = g0.d;
    }

    public static final class d implements j0<d> {
        public final /* synthetic */ int compareTo(Object obj) {
            ((d) obj).getClass();
            return 0;
        }

        public final void d() {
        }

        public final void e() {
        }

        public final m3 f() {
            throw null;
        }

        public final a h(s1 s1Var, r1 r1Var) {
            a aVar = (a) s1Var;
            aVar.e((p0) r1Var);
            return aVar;
        }

        public final void m() {
        }

        public final x1 zza() {
            throw new UnsupportedOperationException();
        }

        public final void zzc() {
        }
    }

    /* 'enum' modifier removed */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2517a = {1, 2, 3, 4, 5, 6, 7};
    }

    static Object g(Object obj, Method method, Object... objArr) {
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

    public static <T extends p0<?, ?>> void m(Class<T> cls, T t10) {
        zzjr.put(cls, t10);
    }

    public static <T extends p0<?, ?>> T n(Class<T> cls) {
        T t10 = (p0) zzjr.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (p0) zzjr.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t10 != null) {
            return t10;
        }
        String name = cls.getName();
        throw new IllegalStateException(name.length() != 0 ? "Unable to get default instance for: ".concat(name) : new String("Unable to get default instance for: "));
    }

    public final void a(int i10) {
        this.zzjq = i10;
    }

    public final int b() {
        return this.zzjq;
    }

    public final boolean c() {
        byte byteValue = ((Byte) e(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        d2 d2Var = d2.f2398c;
        d2Var.getClass();
        boolean h10 = d2Var.a(getClass()).h(this);
        e(2);
        return h10;
    }

    public final /* synthetic */ p0 d() {
        return (p0) e(6);
    }

    public abstract Object e(int i10);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((p0) e(6)).getClass().isInstance(obj)) {
            return false;
        }
        d2 d2Var = d2.f2398c;
        d2Var.getClass();
        return d2Var.a(getClass()).f(this, (p0) obj);
    }

    public final int hashCode() {
        int i10 = this.zzex;
        if (i10 != 0) {
            return i10;
        }
        d2 d2Var = d2.f2398c;
        d2Var.getClass();
        int i11 = d2Var.a(getClass()).i(this);
        this.zzex = i11;
        return i11;
    }

    public final void i(x xVar) {
        i2<?> a10 = d2.f2398c.a(getClass());
        y yVar = xVar.f2578o;
        if (yVar == null) {
            yVar = new y(xVar);
        }
        a10.e(this, yVar);
    }

    public final /* synthetic */ a j() {
        a aVar = (a) e(5);
        aVar.e(this);
        return aVar;
    }

    public final /* synthetic */ a k() {
        return (a) e(5);
    }

    public final int l() {
        if (this.zzjq == -1) {
            d2 d2Var = d2.f2398c;
            d2Var.getClass();
            this.zzjq = d2Var.a(getClass()).d(this);
        }
        return this.zzjq;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        u1.a(this, sb, 0);
        return sb.toString();
    }
}

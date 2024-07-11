package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.clearcut.t2;
import com.google.android.gms.internal.vision.q1;
import com.google.android.gms.internal.vision.q1.b;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class q1<MessageType extends q1<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends n0<MessageType, BuilderType> {
    private static Map<Object, q1<?, ?>> zzd = new ConcurrentHashMap();
    protected y3 zzb = y3.f3189f;
    private int zzc = -1;

    public static class a<T extends q1<T, ?>> extends o0<T> {
    }

    public static abstract class b<MessageType extends q1<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends m0<MessageType, BuilderType> {

        /* renamed from: o  reason: collision with root package name */
        public final MessageType f3142o;

        /* renamed from: p  reason: collision with root package name */
        public MessageType f3143p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f3144q = false;

        public b(MessageType messagetype) {
            this.f3142o = messagetype;
            this.f3143p = (q1) messagetype.i(4);
        }

        public static void l(MessageType messagetype, MessageType messagetype2) {
            j3 j3Var = j3.f3104c;
            j3Var.getClass();
            j3Var.a(messagetype.getClass()).c(messagetype, messagetype2);
        }

        public final /* synthetic */ Object clone() {
            b bVar = (b) this.f3142o.i(5);
            bVar.k(q());
            return bVar;
        }

        public final /* synthetic */ q1 h() {
            return this.f3142o;
        }

        public final b i(byte[] bArr, int i10, d1 d1Var) {
            if (this.f3144q) {
                p();
                this.f3144q = false;
            }
            try {
                j3 j3Var = j3.f3104c;
                MessageType messagetype = this.f3143p;
                j3Var.getClass();
                j3Var.a(messagetype.getClass()).g(this.f3143p, bArr, 0, i10, new t0(d1Var));
                return this;
            } catch (z1 e10) {
                throw e10;
            } catch (IndexOutOfBoundsException unused) {
                throw z1.a();
            } catch (IOException e11) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
            }
        }

        public final void k(q1 q1Var) {
            if (this.f3144q) {
                p();
                this.f3144q = false;
            }
            l(this.f3143p, q1Var);
        }

        public final void p() {
            MessageType messagetype = (q1) this.f3143p.i(4);
            l(messagetype, this.f3143p);
            this.f3143p = messagetype;
        }

        public final q1 q() {
            if (!this.f3144q) {
                MessageType messagetype = this.f3143p;
                j3 j3Var = j3.f3104c;
                j3Var.getClass();
                j3Var.a(messagetype.getClass()).a(messagetype);
                this.f3144q = true;
            }
            return this.f3143p;
        }

        public final q1 r() {
            q1 q10 = q();
            if (q10.d()) {
                return q10;
            }
            throw new t2();
        }
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends q1<MessageType, BuilderType> implements y2 {
        protected j1<e> zzc = j1.d;

        public final j1<e> o() {
            j1<e> j1Var = this.zzc;
            if (j1Var.f3102b) {
                this.zzc = (j1) j1Var.clone();
            }
            return this.zzc;
        }
    }

    public static class d<ContainingType extends w2, Type> extends q0.d {
    }

    public static final class e implements l1<e> {
        public final void a() {
        }

        public final void b() {
        }

        public final void c() {
        }

        public final /* synthetic */ int compareTo(Object obj) {
            ((e) obj).getClass();
            return 0;
        }

        public final b j(z2 z2Var, w2 w2Var) {
            b bVar = (b) z2Var;
            bVar.k((q1) w2Var);
            return bVar;
        }

        public final e3 zza() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: zza  reason: collision with other method in class */
        public final void m11zza() {
        }

        public final n4 zzc() {
            throw null;
        }
    }

    /* 'enum' modifier removed */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3145a = {1, 2, 3, 4, 5, 6, 7};
    }

    public static <T extends q1<?, ?>> T g(Class<T> cls) {
        T t10 = (q1) zzd.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (q1) zzd.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t10 == null) {
            t10 = (q1) ((q1) b4.c(cls)).i(6);
            if (t10 != null) {
                zzd.put(cls, t10);
            } else {
                throw new IllegalStateException();
            }
        }
        return t10;
    }

    static Object k(Object obj, Method method, Object... objArr) {
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

    public static <T extends q1<?, ?>> void l(Class<T> cls, T t10) {
        zzd.put(cls, t10);
    }

    public final void b(int i10) {
        this.zzc = i10;
    }

    public final void c(a1 a1Var) {
        j3 j3Var = j3.f3104c;
        j3Var.getClass();
        m3<?> a10 = j3Var.a(getClass());
        b1 b1Var = a1Var.f3036o;
        if (b1Var == null) {
            b1Var = new b1(a1Var);
        }
        a10.i(this, b1Var);
    }

    public final boolean d() {
        byte byteValue = ((Byte) i(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        j3 j3Var = j3.f3104c;
        j3Var.getClass();
        boolean f10 = j3Var.a(getClass()).f(this);
        i(2);
        return f10;
    }

    public final /* synthetic */ b e() {
        b bVar = (b) i(5);
        bVar.k(this);
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j3 j3Var = j3.f3104c;
        j3Var.getClass();
        return j3Var.a(getClass()).b(this, (q1) obj);
    }

    /* access modifiers changed from: package-private */
    public final int f() {
        return this.zzc;
    }

    public final /* synthetic */ q1 h() {
        return (q1) i(6);
    }

    public final int hashCode() {
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        j3 j3Var = j3.f3104c;
        j3Var.getClass();
        int d10 = j3Var.a(getClass()).d(this);
        this.zza = d10;
        return d10;
    }

    public abstract Object i(int i10);

    public final /* synthetic */ b m() {
        return (b) i(5);
    }

    public final int n() {
        if (this.zzc == -1) {
            j3 j3Var = j3.f3104c;
            j3Var.getClass();
            this.zzc = j3Var.a(getClass()).e(this);
        }
        return this.zzc;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        b3.b(this, sb, 0);
        return sb.toString();
    }
}

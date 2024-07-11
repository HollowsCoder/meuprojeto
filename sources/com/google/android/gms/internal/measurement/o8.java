package com.google.android.gms.internal.measurement;

import b0.d;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public final class o8 {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f2861a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?> f2862b = d5.a();

    /* renamed from: c  reason: collision with root package name */
    public static final n8 f2863c;
    public static final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f2864e;

    /* renamed from: f  reason: collision with root package name */
    public static final long f2865f = ((long) u(byte[].class));

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f2866g;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0131  */
    static {
        /*
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            sun.misc.Unsafe r1 = r()
            f2861a = r1
            java.lang.Class r2 = com.google.android.gms.internal.measurement.d5.a()
            f2862b = r2
            java.lang.Class r2 = java.lang.Long.TYPE
            boolean r3 = s(r2)
            java.lang.Class r4 = java.lang.Integer.TYPE
            boolean r4 = s(r4)
            if (r1 != 0) goto L_0x001d
            goto L_0x002d
        L_0x001d:
            if (r3 == 0) goto L_0x0025
            com.google.android.gms.internal.measurement.m8 r3 = new com.google.android.gms.internal.measurement.m8
            r3.<init>(r1)
            goto L_0x002e
        L_0x0025:
            if (r4 == 0) goto L_0x002d
            com.google.android.gms.internal.measurement.l8 r3 = new com.google.android.gms.internal.measurement.l8
            r3.<init>(r1)
            goto L_0x002e
        L_0x002d:
            r3 = 0
        L_0x002e:
            f2863c = r3
            java.lang.String r1 = "getLong"
            java.lang.String r4 = "objectFieldOffset"
            java.lang.Class<java.lang.reflect.Field> r5 = java.lang.reflect.Field.class
            r6 = 2
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r8 = 1
            r9 = 0
            if (r3 != 0) goto L_0x003e
            goto L_0x0064
        L_0x003e:
            sun.misc.Unsafe r3 = r3.f2846a
            if (r3 != 0) goto L_0x0043
            goto L_0x0064
        L_0x0043:
            java.lang.Class r3 = r3.getClass()     // Catch:{ all -> 0x0060 }
            java.lang.Class[] r10 = new java.lang.Class[r8]     // Catch:{ all -> 0x0060 }
            r10[r9] = r5     // Catch:{ all -> 0x0060 }
            r3.getMethod(r4, r10)     // Catch:{ all -> 0x0060 }
            java.lang.Class[] r10 = new java.lang.Class[r6]     // Catch:{ all -> 0x0060 }
            r10[r9] = r7     // Catch:{ all -> 0x0060 }
            r10[r8] = r2     // Catch:{ all -> 0x0060 }
            r3.getMethod(r1, r10)     // Catch:{ all -> 0x0060 }
            java.lang.reflect.Field r2 = b()     // Catch:{ all -> 0x0060 }
            if (r2 != 0) goto L_0x005e
            goto L_0x0064
        L_0x005e:
            r2 = r8
            goto L_0x0065
        L_0x0060:
            r2 = move-exception
            t(r2)
        L_0x0064:
            r2 = r9
        L_0x0065:
            d = r2
            com.google.android.gms.internal.measurement.n8 r2 = f2863c
            if (r2 != 0) goto L_0x006c
            goto L_0x00df
        L_0x006c:
            sun.misc.Unsafe r2 = r2.f2846a
            if (r2 != 0) goto L_0x0071
            goto L_0x00df
        L_0x0071:
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x00db }
            java.lang.Class[] r3 = new java.lang.Class[r8]     // Catch:{ all -> 0x00db }
            r3[r9] = r5     // Catch:{ all -> 0x00db }
            r2.getMethod(r4, r3)     // Catch:{ all -> 0x00db }
            java.lang.Class[] r3 = new java.lang.Class[r8]     // Catch:{ all -> 0x00db }
            r3[r9] = r0     // Catch:{ all -> 0x00db }
            java.lang.String r4 = "arrayBaseOffset"
            r2.getMethod(r4, r3)     // Catch:{ all -> 0x00db }
            java.lang.Class[] r3 = new java.lang.Class[r8]     // Catch:{ all -> 0x00db }
            r3[r9] = r0     // Catch:{ all -> 0x00db }
            java.lang.String r0 = "arrayIndexScale"
            r2.getMethod(r0, r3)     // Catch:{ all -> 0x00db }
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch:{ all -> 0x00db }
            r0[r9] = r7     // Catch:{ all -> 0x00db }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x00db }
            r0[r8] = r3     // Catch:{ all -> 0x00db }
            java.lang.String r4 = "getInt"
            r2.getMethod(r4, r0)     // Catch:{ all -> 0x00db }
            r0 = 3
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch:{ all -> 0x00db }
            r4[r9] = r7     // Catch:{ all -> 0x00db }
            r4[r8] = r3     // Catch:{ all -> 0x00db }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00db }
            r4[r6] = r5     // Catch:{ all -> 0x00db }
            java.lang.String r5 = "putInt"
            r2.getMethod(r5, r4)     // Catch:{ all -> 0x00db }
            java.lang.Class[] r4 = new java.lang.Class[r6]     // Catch:{ all -> 0x00db }
            r4[r9] = r7     // Catch:{ all -> 0x00db }
            r4[r8] = r3     // Catch:{ all -> 0x00db }
            r2.getMethod(r1, r4)     // Catch:{ all -> 0x00db }
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch:{ all -> 0x00db }
            r1[r9] = r7     // Catch:{ all -> 0x00db }
            r1[r8] = r3     // Catch:{ all -> 0x00db }
            r1[r6] = r3     // Catch:{ all -> 0x00db }
            java.lang.String r4 = "putLong"
            r2.getMethod(r4, r1)     // Catch:{ all -> 0x00db }
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ all -> 0x00db }
            r1[r9] = r7     // Catch:{ all -> 0x00db }
            r1[r8] = r3     // Catch:{ all -> 0x00db }
            java.lang.String r4 = "getObject"
            r2.getMethod(r4, r1)     // Catch:{ all -> 0x00db }
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch:{ all -> 0x00db }
            r0[r9] = r7     // Catch:{ all -> 0x00db }
            r0[r8] = r3     // Catch:{ all -> 0x00db }
            r0[r6] = r7     // Catch:{ all -> 0x00db }
            java.lang.String r1 = "putObject"
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x00db }
            r0 = r8
            goto L_0x00e0
        L_0x00db:
            r0 = move-exception
            t(r0)
        L_0x00df:
            r0 = r9
        L_0x00e0:
            f2864e = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = u(r0)
            long r0 = (long) r0
            f2865f = r0
            java.lang.Class<boolean[]> r0 = boolean[].class
            u(r0)
            a(r0)
            java.lang.Class<int[]> r0 = int[].class
            u(r0)
            a(r0)
            java.lang.Class<long[]> r0 = long[].class
            u(r0)
            a(r0)
            java.lang.Class<float[]> r0 = float[].class
            u(r0)
            a(r0)
            java.lang.Class<double[]> r0 = double[].class
            u(r0)
            a(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            u(r0)
            a(r0)
            java.lang.reflect.Field r0 = b()
            if (r0 == 0) goto L_0x0128
            com.google.android.gms.internal.measurement.n8 r1 = f2863c
            if (r1 == 0) goto L_0x0128
            r1.h(r0)
        L_0x0128:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0131
            goto L_0x0132
        L_0x0131:
            r8 = r9
        L_0x0132:
            f2866g = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.o8.<clinit>():void");
    }

    public static void a(Class cls) {
        if (f2864e) {
            f2863c.j(cls);
        }
    }

    public static Field b() {
        Field field;
        Field field2;
        Class<Buffer> cls = Buffer.class;
        int i10 = d5.f2671a;
        try {
            field = cls.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            field = null;
        }
        if (field != null) {
            return field;
        }
        try {
            field2 = cls.getDeclaredField("address");
        } catch (Throwable unused2) {
            field2 = null;
        }
        if (field2 == null || field2.getType() != Long.TYPE) {
            return null;
        }
        return field2;
    }

    public static void c(Object obj, long j8, byte b10) {
        long j10 = -4 & j8;
        n8 n8Var = f2863c;
        int k10 = n8Var.k(j10, obj);
        int i10 = ((~((int) j8)) & 3) << 3;
        n8Var.l(((255 & b10) << i10) | (k10 & (~(255 << i10))), j10, obj);
    }

    public static void d(Object obj, long j8, byte b10) {
        long j10 = -4 & j8;
        n8 n8Var = f2863c;
        int i10 = (((int) j8) & 3) << 3;
        n8Var.l(((255 & b10) << i10) | (n8Var.k(j10, obj) & (~(255 << i10))), j10, obj);
    }

    public static <T> T e(Class<T> cls) {
        try {
            return f2861a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int f(long j8, Object obj) {
        return f2863c.k(j8, obj);
    }

    public static void g(int i10, long j8, Object obj) {
        f2863c.l(i10, j8, obj);
    }

    public static long h(long j8, Object obj) {
        return f2863c.m(j8, obj);
    }

    public static void i(Object obj, long j8, long j10) {
        f2863c.n(obj, j8, j10);
    }

    public static boolean j(long j8, Object obj) {
        return f2863c.b(j8, obj);
    }

    public static void k(Object obj, long j8, boolean z) {
        f2863c.c(obj, j8, z);
    }

    public static float l(long j8, Object obj) {
        return f2863c.d(j8, obj);
    }

    public static void m(Object obj, long j8, float f10) {
        f2863c.e(obj, j8, f10);
    }

    public static double n(long j8, Object obj) {
        return f2863c.f(j8, obj);
    }

    public static void o(Object obj, long j8, double d10) {
        f2863c.g(obj, j8, d10);
    }

    public static Object p(long j8, Object obj) {
        return f2863c.o(j8, obj);
    }

    public static void q(long j8, Object obj, Object obj2) {
        f2863c.p(j8, obj, obj2);
    }

    public static Unsafe r() {
        try {
            return (Unsafe) AccessController.doPrivileged(new k8());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean s(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        int i10 = d5.f2671a;
        try {
            Class<?> cls3 = f2862b;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static /* synthetic */ void t(Throwable th) {
        Logger logger = Logger.getLogger(o8.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", d.g(new StringBuilder(valueOf.length() + 71), "platform method missing - proto runtime falling back to safer methods: ", valueOf));
    }

    public static int u(Class<?> cls) {
        if (f2864e) {
            return f2863c.i(cls);
        }
        return -1;
    }
}

package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

public final class a3 {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f2364a = Logger.getLogger(a3.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final Unsafe f2365b;

    /* renamed from: c  reason: collision with root package name */
    public static final Class<?> f2366c = q.f2524a;
    public static final d d;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f2367e;

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f2368f;

    /* renamed from: g  reason: collision with root package name */
    public static final long f2369g = ((long) o(byte[].class));

    /* renamed from: h  reason: collision with root package name */
    public static final long f2370h;

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f2371i;

    public static final class a extends d {
        public a(Unsafe unsafe) {
            super(unsafe);
        }

        public final void b(long j8, byte b10) {
            Memory.pokeByte((int) (j8 & -1), b10);
        }

        public final void c(Object obj, long j8, double d) {
            e(obj, j8, Double.doubleToLongBits(d));
        }

        public final void d(Object obj, long j8, float f10) {
            h(Float.floatToIntBits(f10), j8, obj);
        }

        public final void f(Object obj, long j8, boolean z) {
            if (a3.f2371i) {
                a3.c(obj, j8, z ? (byte) 1 : 0);
            } else {
                a3.k(obj, j8, z ? (byte) 1 : 0);
            }
        }

        public final void g(byte[] bArr, long j8, long j10, long j11) {
            Memory.pokeByteArray((int) (j10 & -1), bArr, (int) j8, (int) j11);
        }

        public final void i(Object obj, long j8, byte b10) {
            if (a3.f2371i) {
                a3.c(obj, j8, b10);
            } else {
                a3.k(obj, j8, b10);
            }
        }

        public final boolean l(long j8, Object obj) {
            if (a3.f2371i) {
                if (a3.x(j8, obj) != 0) {
                    return true;
                }
                return false;
            } else if (a3.y(j8, obj) != 0) {
                return true;
            } else {
                return false;
            }
        }

        public final float m(long j8, Object obj) {
            return Float.intBitsToFloat(j(j8, obj));
        }

        public final double n(long j8, Object obj) {
            return Double.longBitsToDouble(k(j8, obj));
        }

        public final byte o(long j8, Object obj) {
            if (a3.f2371i) {
                return a3.x(j8, obj);
            }
            return a3.y(j8, obj);
        }
    }

    public static final class b extends d {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        public final void b(long j8, byte b10) {
            Memory.pokeByte(j8, b10);
        }

        public final void c(Object obj, long j8, double d) {
            e(obj, j8, Double.doubleToLongBits(d));
        }

        public final void d(Object obj, long j8, float f10) {
            h(Float.floatToIntBits(f10), j8, obj);
        }

        public final void f(Object obj, long j8, boolean z) {
            if (a3.f2371i) {
                a3.c(obj, j8, z ? (byte) 1 : 0);
            } else {
                a3.k(obj, j8, z ? (byte) 1 : 0);
            }
        }

        public final void g(byte[] bArr, long j8, long j10, long j11) {
            Memory.pokeByteArray(j10, bArr, (int) j8, (int) j11);
        }

        public final void i(Object obj, long j8, byte b10) {
            if (a3.f2371i) {
                a3.c(obj, j8, b10);
            } else {
                a3.k(obj, j8, b10);
            }
        }

        public final boolean l(long j8, Object obj) {
            if (a3.f2371i) {
                if (a3.x(j8, obj) != 0) {
                    return true;
                }
                return false;
            } else if (a3.y(j8, obj) != 0) {
                return true;
            } else {
                return false;
            }
        }

        public final float m(long j8, Object obj) {
            return Float.intBitsToFloat(j(j8, obj));
        }

        public final double n(long j8, Object obj) {
            return Double.longBitsToDouble(k(j8, obj));
        }

        public final byte o(long j8, Object obj) {
            if (a3.f2371i) {
                return a3.x(j8, obj);
            }
            return a3.y(j8, obj);
        }
    }

    public static final class c extends d {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        public final void b(long j8, byte b10) {
            this.f2372a.putByte(j8, b10);
        }

        public final void c(Object obj, long j8, double d) {
            this.f2372a.putDouble(obj, j8, d);
        }

        public final void d(Object obj, long j8, float f10) {
            this.f2372a.putFloat(obj, j8, f10);
        }

        public final void f(Object obj, long j8, boolean z) {
            this.f2372a.putBoolean(obj, j8, z);
        }

        public final void g(byte[] bArr, long j8, long j10, long j11) {
            this.f2372a.copyMemory(bArr, a3.f2369g + j8, (Object) null, j10, j11);
        }

        public final void i(Object obj, long j8, byte b10) {
            this.f2372a.putByte(obj, j8, b10);
        }

        public final boolean l(long j8, Object obj) {
            return this.f2372a.getBoolean(obj, j8);
        }

        public final float m(long j8, Object obj) {
            return this.f2372a.getFloat(obj, j8);
        }

        public final double n(long j8, Object obj) {
            return this.f2372a.getDouble(obj, j8);
        }

        public final byte o(long j8, Object obj) {
            return this.f2372a.getByte(obj, j8);
        }
    }

    public static abstract class d {

        /* renamed from: a  reason: collision with root package name */
        public final Unsafe f2372a;

        public d(Unsafe unsafe) {
            this.f2372a = unsafe;
        }

        public final long a(Field field) {
            return this.f2372a.objectFieldOffset(field);
        }

        public abstract void b(long j8, byte b10);

        public abstract void c(Object obj, long j8, double d);

        public abstract void d(Object obj, long j8, float f10);

        public final void e(Object obj, long j8, long j10) {
            this.f2372a.putLong(obj, j8, j10);
        }

        public abstract void f(Object obj, long j8, boolean z);

        public abstract void g(byte[] bArr, long j8, long j10, long j11);

        public final void h(int i10, long j8, Object obj) {
            this.f2372a.putInt(obj, j8, i10);
        }

        public abstract void i(Object obj, long j8, byte b10);

        public final int j(long j8, Object obj) {
            return this.f2372a.getInt(obj, j8);
        }

        public final long k(long j8, Object obj) {
            return this.f2372a.getLong(obj, j8);
        }

        public abstract boolean l(long j8, Object obj);

        public abstract float m(long j8, Object obj);

        public abstract double n(long j8, Object obj);

        public abstract byte o(long j8, Object obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0062 A[SYNTHETIC, Splitter:B:12:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x011c A[SYNTHETIC, Splitter:B:32:0x011c] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x02a8  */
    static {
        /*
            java.lang.Class<com.google.android.gms.internal.clearcut.a3> r0 = com.google.android.gms.internal.clearcut.a3.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f2364a = r0
            sun.misc.Unsafe r0 = l()
            f2365b = r0
            java.lang.Class<?> r1 = com.google.android.gms.internal.clearcut.q.f2524a
            f2366c = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r2 = q(r1)
            java.lang.Class r3 = java.lang.Integer.TYPE
            boolean r4 = q(r3)
            if (r0 != 0) goto L_0x0025
            goto L_0x003b
        L_0x0025:
            boolean r6 = com.google.android.gms.internal.clearcut.q.a()
            if (r6 == 0) goto L_0x003d
            if (r2 == 0) goto L_0x0033
            com.google.android.gms.internal.clearcut.a3$b r2 = new com.google.android.gms.internal.clearcut.a3$b
            r2.<init>(r0)
            goto L_0x0042
        L_0x0033:
            if (r4 == 0) goto L_0x003b
            com.google.android.gms.internal.clearcut.a3$a r2 = new com.google.android.gms.internal.clearcut.a3$a
            r2.<init>(r0)
            goto L_0x0042
        L_0x003b:
            r2 = 0
            goto L_0x0042
        L_0x003d:
            com.google.android.gms.internal.clearcut.a3$c r2 = new com.google.android.gms.internal.clearcut.a3$c
            r2.<init>(r0)
        L_0x0042:
            d = r2
            java.lang.String r2 = "copyMemory"
            r7 = 1
            java.lang.String r8 = "putLong"
            java.lang.String r9 = "putInt"
            java.lang.String r10 = "getInt"
            java.lang.String r11 = "putByte"
            java.lang.String r12 = "getByte"
            java.lang.Class<java.lang.reflect.Field> r13 = java.lang.reflect.Field.class
            java.lang.String r14 = "com.google.protobuf.UnsafeUtil"
            java.lang.String r15 = "platform method missing - proto runtime falling back to safer methods: "
            java.lang.String r5 = "objectFieldOffset"
            java.lang.Class<java.lang.Object> r16 = java.lang.Object.class
            java.lang.String r4 = "getLong"
            r17 = 0
            if (r0 != 0) goto L_0x0062
            goto L_0x007e
        L_0x0062:
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x00e9 }
            java.lang.Class[] r6 = new java.lang.Class[r7]     // Catch:{ all -> 0x00e9 }
            r6[r17] = r13     // Catch:{ all -> 0x00e9 }
            r0.getMethod(r5, r6)     // Catch:{ all -> 0x00e9 }
            r6 = 2
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ all -> 0x00e9 }
            r7[r17] = r16     // Catch:{ all -> 0x00e9 }
            r6 = 1
            r7[r6] = r1     // Catch:{ all -> 0x00e9 }
            r0.getMethod(r4, r7)     // Catch:{ all -> 0x00e9 }
            java.lang.reflect.Field r6 = m()     // Catch:{ all -> 0x00e9 }
            if (r6 != 0) goto L_0x0082
        L_0x007e:
            r18 = r12
            goto L_0x010e
        L_0x0082:
            boolean r6 = com.google.android.gms.internal.clearcut.q.a()     // Catch:{ all -> 0x00e9 }
            if (r6 == 0) goto L_0x008b
            r18 = r12
            goto L_0x00e5
        L_0x008b:
            r6 = 1
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ all -> 0x00e9 }
            r7[r17] = r1     // Catch:{ all -> 0x00e9 }
            r0.getMethod(r12, r7)     // Catch:{ all -> 0x00e9 }
            r6 = 2
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ all -> 0x00e9 }
            r7[r17] = r1     // Catch:{ all -> 0x00e9 }
            java.lang.Class r6 = java.lang.Byte.TYPE     // Catch:{ all -> 0x00e9 }
            r18 = r12
            r12 = 1
            r7[r12] = r6     // Catch:{ all -> 0x00e7 }
            r0.getMethod(r11, r7)     // Catch:{ all -> 0x00e7 }
            java.lang.Class[] r6 = new java.lang.Class[r12]     // Catch:{ all -> 0x00e7 }
            r6[r17] = r1     // Catch:{ all -> 0x00e7 }
            r0.getMethod(r10, r6)     // Catch:{ all -> 0x00e7 }
            r6 = 2
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ all -> 0x00e7 }
            r7[r17] = r1     // Catch:{ all -> 0x00e7 }
            r7[r12] = r3     // Catch:{ all -> 0x00e7 }
            r0.getMethod(r9, r7)     // Catch:{ all -> 0x00e7 }
            java.lang.Class[] r3 = new java.lang.Class[r12]     // Catch:{ all -> 0x00e7 }
            r3[r17] = r1     // Catch:{ all -> 0x00e7 }
            r0.getMethod(r4, r3)     // Catch:{ all -> 0x00e7 }
            r3 = 2
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ all -> 0x00e7 }
            r6[r17] = r1     // Catch:{ all -> 0x00e7 }
            r6[r12] = r1     // Catch:{ all -> 0x00e7 }
            r0.getMethod(r8, r6)     // Catch:{ all -> 0x00e7 }
            r3 = 3
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ all -> 0x00e7 }
            r6[r17] = r1     // Catch:{ all -> 0x00e7 }
            r6[r12] = r1     // Catch:{ all -> 0x00e7 }
            r3 = 2
            r6[r3] = r1     // Catch:{ all -> 0x00e7 }
            r0.getMethod(r2, r6)     // Catch:{ all -> 0x00e7 }
            r3 = 5
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ all -> 0x00e7 }
            r3[r17] = r16     // Catch:{ all -> 0x00e7 }
            r6 = 1
            r3[r6] = r1     // Catch:{ all -> 0x00e7 }
            r6 = 2
            r3[r6] = r16     // Catch:{ all -> 0x00e7 }
            r6 = 3
            r3[r6] = r1     // Catch:{ all -> 0x00e7 }
            r6 = 4
            r3[r6] = r1     // Catch:{ all -> 0x00e7 }
            r0.getMethod(r2, r3)     // Catch:{ all -> 0x00e7 }
        L_0x00e5:
            r0 = 1
            goto L_0x0110
        L_0x00e7:
            r0 = move-exception
            goto L_0x00ec
        L_0x00e9:
            r0 = move-exception
            r18 = r12
        L_0x00ec:
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            int r2 = r2 + 71
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r15)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.util.logging.Logger r2 = f2364a
            java.lang.String r3 = "supportsUnsafeByteBufferOperations"
            r2.logp(r1, r14, r3, r0)
        L_0x010e:
            r0 = r17
        L_0x0110:
            f2367e = r0
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            sun.misc.Unsafe r1 = f2365b
            if (r1 != 0) goto L_0x011c
        L_0x0118:
            r6 = r17
            goto L_0x0229
        L_0x011c:
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x0204 }
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ all -> 0x0204 }
            r3[r17] = r13     // Catch:{ all -> 0x0204 }
            r1.getMethod(r5, r3)     // Catch:{ all -> 0x0204 }
            java.lang.String r3 = "arrayBaseOffset"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ all -> 0x0204 }
            r5[r17] = r0     // Catch:{ all -> 0x0204 }
            r1.getMethod(r3, r5)     // Catch:{ all -> 0x0204 }
            java.lang.String r3 = "arrayIndexScale"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ all -> 0x0204 }
            r5[r17] = r0     // Catch:{ all -> 0x0204 }
            r1.getMethod(r3, r5)     // Catch:{ all -> 0x0204 }
            r2 = 2
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ all -> 0x0204 }
            r0[r17] = r16     // Catch:{ all -> 0x0204 }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x0204 }
            r3 = 1
            r0[r3] = r2     // Catch:{ all -> 0x0204 }
            r1.getMethod(r10, r0)     // Catch:{ all -> 0x0204 }
            r5 = 3
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ all -> 0x0204 }
            r0[r17] = r16     // Catch:{ all -> 0x0204 }
            r0[r3] = r2     // Catch:{ all -> 0x0204 }
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0204 }
            r5 = 2
            r0[r5] = r3     // Catch:{ all -> 0x0204 }
            r1.getMethod(r9, r0)     // Catch:{ all -> 0x0204 }
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ all -> 0x0204 }
            r0[r17] = r16     // Catch:{ all -> 0x0204 }
            r3 = 1
            r0[r3] = r2     // Catch:{ all -> 0x0204 }
            r1.getMethod(r4, r0)     // Catch:{ all -> 0x0204 }
            r4 = 3
            java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch:{ all -> 0x0204 }
            r0[r17] = r16     // Catch:{ all -> 0x0204 }
            r0[r3] = r2     // Catch:{ all -> 0x0204 }
            r3 = 2
            r0[r3] = r2     // Catch:{ all -> 0x0204 }
            r1.getMethod(r8, r0)     // Catch:{ all -> 0x0204 }
            java.lang.String r0 = "getObject"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x0204 }
            r4[r17] = r16     // Catch:{ all -> 0x0204 }
            r3 = 1
            r4[r3] = r2     // Catch:{ all -> 0x0204 }
            r1.getMethod(r0, r4)     // Catch:{ all -> 0x0204 }
            java.lang.String r0 = "putObject"
            r4 = 3
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x0204 }
            r5[r17] = r16     // Catch:{ all -> 0x0204 }
            r5[r3] = r2     // Catch:{ all -> 0x0204 }
            r3 = 2
            r5[r3] = r16     // Catch:{ all -> 0x0204 }
            r1.getMethod(r0, r5)     // Catch:{ all -> 0x0204 }
            boolean r0 = com.google.android.gms.internal.clearcut.q.a()     // Catch:{ all -> 0x0204 }
            if (r0 == 0) goto L_0x0191
        L_0x018e:
            r6 = 1
            goto L_0x0229
        L_0x0191:
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ all -> 0x0204 }
            r0[r17] = r16     // Catch:{ all -> 0x0204 }
            r3 = 1
            r0[r3] = r2     // Catch:{ all -> 0x0204 }
            r4 = r18
            r1.getMethod(r4, r0)     // Catch:{ all -> 0x0204 }
            r4 = 3
            java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch:{ all -> 0x0204 }
            r0[r17] = r16     // Catch:{ all -> 0x0204 }
            r0[r3] = r2     // Catch:{ all -> 0x0204 }
            java.lang.Class r3 = java.lang.Byte.TYPE     // Catch:{ all -> 0x0204 }
            r4 = 2
            r0[r4] = r3     // Catch:{ all -> 0x0204 }
            r1.getMethod(r11, r0)     // Catch:{ all -> 0x0204 }
            java.lang.String r0 = "getBoolean"
            java.lang.Class[] r3 = new java.lang.Class[r4]     // Catch:{ all -> 0x0204 }
            r3[r17] = r16     // Catch:{ all -> 0x0204 }
            r4 = 1
            r3[r4] = r2     // Catch:{ all -> 0x0204 }
            r1.getMethod(r0, r3)     // Catch:{ all -> 0x0204 }
            java.lang.String r0 = "putBoolean"
            r3 = 3
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ all -> 0x0204 }
            r5[r17] = r16     // Catch:{ all -> 0x0204 }
            r5[r4] = r2     // Catch:{ all -> 0x0204 }
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0204 }
            r4 = 2
            r5[r4] = r3     // Catch:{ all -> 0x0204 }
            r1.getMethod(r0, r5)     // Catch:{ all -> 0x0204 }
            java.lang.String r0 = "getFloat"
            java.lang.Class[] r3 = new java.lang.Class[r4]     // Catch:{ all -> 0x0204 }
            r3[r17] = r16     // Catch:{ all -> 0x0204 }
            r4 = 1
            r3[r4] = r2     // Catch:{ all -> 0x0204 }
            r1.getMethod(r0, r3)     // Catch:{ all -> 0x0204 }
            java.lang.String r0 = "putFloat"
            r3 = 3
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ all -> 0x0204 }
            r5[r17] = r16     // Catch:{ all -> 0x0204 }
            r5[r4] = r2     // Catch:{ all -> 0x0204 }
            java.lang.Class r3 = java.lang.Float.TYPE     // Catch:{ all -> 0x0204 }
            r4 = 2
            r5[r4] = r3     // Catch:{ all -> 0x0204 }
            r1.getMethod(r0, r5)     // Catch:{ all -> 0x0204 }
            java.lang.String r0 = "getDouble"
            java.lang.Class[] r3 = new java.lang.Class[r4]     // Catch:{ all -> 0x0204 }
            r3[r17] = r16     // Catch:{ all -> 0x0204 }
            r4 = 1
            r3[r4] = r2     // Catch:{ all -> 0x0204 }
            r1.getMethod(r0, r3)     // Catch:{ all -> 0x0204 }
            java.lang.String r0 = "putDouble"
            r3 = 3
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ all -> 0x0204 }
            r3[r17] = r16     // Catch:{ all -> 0x0204 }
            r3[r4] = r2     // Catch:{ all -> 0x0204 }
            java.lang.Class r2 = java.lang.Double.TYPE     // Catch:{ all -> 0x0204 }
            r4 = 2
            r3[r4] = r2     // Catch:{ all -> 0x0204 }
            r1.getMethod(r0, r3)     // Catch:{ all -> 0x0204 }
            goto L_0x018e
        L_0x0204:
            r0 = move-exception
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            int r2 = r2 + 71
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r15)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.util.logging.Logger r2 = f2364a
            java.lang.String r3 = "supportsUnsafeArrayOperations"
            r2.logp(r1, r14, r3, r0)
            goto L_0x0118
        L_0x0229:
            f2368f = r6
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = o(r0)
            long r0 = (long) r0
            f2369g = r0
            java.lang.Class<boolean[]> r0 = boolean[].class
            o(r0)
            p(r0)
            java.lang.Class<int[]> r0 = int[].class
            o(r0)
            p(r0)
            java.lang.Class<long[]> r0 = long[].class
            o(r0)
            p(r0)
            java.lang.Class<float[]> r0 = float[].class
            o(r0)
            p(r0)
            java.lang.Class<double[]> r0 = double[].class
            o(r0)
            p(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            o(r0)
            p(r0)
            java.lang.reflect.Field r0 = m()
            if (r0 == 0) goto L_0x0274
            com.google.android.gms.internal.clearcut.a3$d r1 = d
            if (r1 != 0) goto L_0x026f
            goto L_0x0274
        L_0x026f:
            long r0 = r1.a(r0)
            goto L_0x0276
        L_0x0274:
            r0 = -1
        L_0x0276:
            f2370h = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "value"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch:{ all -> 0x0285 }
            r1 = 1
            r0.setAccessible(r1)     // Catch:{ all -> 0x0286 }
            goto L_0x0287
        L_0x0285:
            r1 = 1
        L_0x0286:
            r0 = 0
        L_0x0287:
            if (r0 == 0) goto L_0x0293
            java.lang.Class r2 = r0.getType()
            java.lang.Class<char[]> r3 = char[].class
            if (r2 != r3) goto L_0x0293
            r5 = r0
            goto L_0x0294
        L_0x0293:
            r5 = 0
        L_0x0294:
            if (r5 == 0) goto L_0x029e
            com.google.android.gms.internal.clearcut.a3$d r0 = d
            if (r0 != 0) goto L_0x029b
            goto L_0x029e
        L_0x029b:
            r0.a(r5)
        L_0x029e:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r2) goto L_0x02a8
            r7 = r1
            goto L_0x02aa
        L_0x02a8:
            r7 = r17
        L_0x02aa:
            f2371i = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.a3.<clinit>():void");
    }

    public static byte a(byte[] bArr, long j8) {
        return d.o(f2369g + j8, bArr);
    }

    public static void b(long j8, byte b10) {
        d.b(j8, b10);
    }

    public static void c(Object obj, long j8, byte b10) {
        long j10 = -4 & j8;
        int r5 = r(j10, obj);
        int i10 = ((~((int) j8)) & 3) << 3;
        i(((255 & b10) << i10) | (r5 & (~(255 << i10))), j10, obj);
    }

    public static void d(Object obj, long j8, double d10) {
        d.c(obj, j8, d10);
    }

    public static void e(Object obj, long j8, float f10) {
        d.d(obj, j8, f10);
    }

    public static void f(Object obj, long j8, long j10) {
        d.e(obj, j8, j10);
    }

    public static void g(Object obj, long j8, boolean z) {
        d.f(obj, j8, z);
    }

    public static void h(byte[] bArr, long j8, byte b10) {
        d.i(bArr, f2369g + j8, b10);
    }

    public static void i(int i10, long j8, Object obj) {
        d.h(i10, j8, obj);
    }

    public static void j(long j8, Object obj, Object obj2) {
        d.f2372a.putObject(obj, j8, obj2);
    }

    public static void k(Object obj, long j8, byte b10) {
        long j10 = -4 & j8;
        int i10 = (((int) j8) & 3) << 3;
        i(((255 & b10) << i10) | (r(j10, obj) & (~(255 << i10))), j10, obj);
    }

    public static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new b3());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field m() {
        Field field;
        Field field2;
        Class<Buffer> cls = Buffer.class;
        if (q.a()) {
            try {
                field2 = cls.getDeclaredField("effectiveDirectAddress");
                field2.setAccessible(true);
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = cls.getDeclaredField("address");
            field.setAccessible(true);
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static int o(Class<?> cls) {
        if (f2368f) {
            return d.f2372a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void p(Class cls) {
        if (f2368f) {
            d.f2372a.arrayIndexScale(cls);
        }
    }

    public static boolean q(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!q.a()) {
            return false;
        }
        try {
            Class<?> cls3 = f2366c;
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

    public static int r(long j8, Object obj) {
        return d.j(j8, obj);
    }

    public static long s(long j8, Object obj) {
        return d.k(j8, obj);
    }

    public static boolean t(long j8, Object obj) {
        return d.l(j8, obj);
    }

    public static float u(long j8, Object obj) {
        return d.m(j8, obj);
    }

    public static double v(long j8, Object obj) {
        return d.n(j8, obj);
    }

    public static Object w(long j8, Object obj) {
        return d.f2372a.getObject(obj, j8);
    }

    public static byte x(long j8, Object obj) {
        return (byte) (r(-4 & j8, obj) >>> ((int) (((~j8) & 3) << 3)));
    }

    public static byte y(long j8, Object obj) {
        return (byte) (r(-4 & j8, obj) >>> ((int) ((j8 & 3) << 3)));
    }
}

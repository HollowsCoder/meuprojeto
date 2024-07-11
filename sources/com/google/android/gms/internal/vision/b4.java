package com.google.android.gms.internal.vision;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import sun.misc.Unsafe;

public final class b4 {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f3059a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?> f3060b = q0.b();

    /* renamed from: c  reason: collision with root package name */
    public static final d f3061c;
    public static final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f3062e;

    /* renamed from: f  reason: collision with root package name */
    public static final long f3063f = ((long) k(byte[].class));

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f3064g;

    public static final class a extends d {
        public a(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte a(long j8, Object obj) {
            if (b4.f3064g) {
                return b4.w(j8, obj);
            }
            return b4.x(j8, obj);
        }

        public final void b(Object obj, long j8, byte b10) {
            if (b4.f3064g) {
                b4.o(obj, j8, b10);
            } else {
                b4.r(obj, j8, b10);
            }
        }

        public final void c(Object obj, long j8, double d) {
            e(obj, j8, Double.doubleToLongBits(d));
        }

        public final void d(Object obj, long j8, float f10) {
            g(Float.floatToIntBits(f10), j8, obj);
        }

        public final void f(Object obj, long j8, boolean z) {
            if (b4.f3064g) {
                b4.o(obj, j8, z ? (byte) 1 : 0);
            } else {
                b4.r(obj, j8, z ? (byte) 1 : 0);
            }
        }

        public final boolean h(long j8, Object obj) {
            if (b4.f3064g) {
                if (b4.w(j8, obj) != 0) {
                    return true;
                }
                return false;
            } else if (b4.x(j8, obj) != 0) {
                return true;
            } else {
                return false;
            }
        }

        public final float i(long j8, Object obj) {
            return Float.intBitsToFloat(k(j8, obj));
        }

        public final double j(long j8, Object obj) {
            return Double.longBitsToDouble(l(j8, obj));
        }
    }

    public static final class b extends d {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte a(long j8, Object obj) {
            return this.f3065a.getByte(obj, j8);
        }

        public final void b(Object obj, long j8, byte b10) {
            this.f3065a.putByte(obj, j8, b10);
        }

        public final void c(Object obj, long j8, double d) {
            this.f3065a.putDouble(obj, j8, d);
        }

        public final void d(Object obj, long j8, float f10) {
            this.f3065a.putFloat(obj, j8, f10);
        }

        public final void f(Object obj, long j8, boolean z) {
            this.f3065a.putBoolean(obj, j8, z);
        }

        public final boolean h(long j8, Object obj) {
            return this.f3065a.getBoolean(obj, j8);
        }

        public final float i(long j8, Object obj) {
            return this.f3065a.getFloat(obj, j8);
        }

        public final double j(long j8, Object obj) {
            return this.f3065a.getDouble(obj, j8);
        }
    }

    public static final class c extends d {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte a(long j8, Object obj) {
            if (b4.f3064g) {
                return b4.w(j8, obj);
            }
            return b4.x(j8, obj);
        }

        public final void b(Object obj, long j8, byte b10) {
            if (b4.f3064g) {
                b4.o(obj, j8, b10);
            } else {
                b4.r(obj, j8, b10);
            }
        }

        public final void c(Object obj, long j8, double d) {
            e(obj, j8, Double.doubleToLongBits(d));
        }

        public final void d(Object obj, long j8, float f10) {
            g(Float.floatToIntBits(f10), j8, obj);
        }

        public final void f(Object obj, long j8, boolean z) {
            if (b4.f3064g) {
                b4.o(obj, j8, z ? (byte) 1 : 0);
            } else {
                b4.r(obj, j8, z ? (byte) 1 : 0);
            }
        }

        public final boolean h(long j8, Object obj) {
            if (b4.f3064g) {
                if (b4.w(j8, obj) != 0) {
                    return true;
                }
                return false;
            } else if (b4.x(j8, obj) != 0) {
                return true;
            } else {
                return false;
            }
        }

        public final float i(long j8, Object obj) {
            return Float.intBitsToFloat(k(j8, obj));
        }

        public final double j(long j8, Object obj) {
            return Double.longBitsToDouble(l(j8, obj));
        }
    }

    public static abstract class d {

        /* renamed from: a  reason: collision with root package name */
        public final Unsafe f3065a;

        public d(Unsafe unsafe) {
            this.f3065a = unsafe;
        }

        public abstract byte a(long j8, Object obj);

        public abstract void b(Object obj, long j8, byte b10);

        public abstract void c(Object obj, long j8, double d);

        public abstract void d(Object obj, long j8, float f10);

        public final void e(Object obj, long j8, long j10) {
            this.f3065a.putLong(obj, j8, j10);
        }

        public abstract void f(Object obj, long j8, boolean z);

        public final void g(int i10, long j8, Object obj) {
            this.f3065a.putInt(obj, j8, i10);
        }

        public abstract boolean h(long j8, Object obj);

        public abstract float i(long j8, Object obj);

        public abstract double j(long j8, Object obj);

        public final int k(long j8, Object obj) {
            return this.f3065a.getInt(obj, j8);
        }

        public final long l(long j8, Object obj) {
            return this.f3065a.getLong(obj, j8);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005e A[SYNTHETIC, Splitter:B:13:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x012d A[SYNTHETIC, Splitter:B:38:0x012d] */
    static {
        /*
            sun.misc.Unsafe r0 = m()
            f3059a = r0
            java.lang.Class r1 = com.google.android.gms.internal.vision.q0.b()
            f3060b = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r2 = s(r1)
            java.lang.Class r3 = java.lang.Integer.TYPE
            boolean r4 = s(r3)
            if (r0 != 0) goto L_0x001b
            goto L_0x0031
        L_0x001b:
            boolean r5 = com.google.android.gms.internal.vision.q0.a()
            if (r5 == 0) goto L_0x0033
            if (r2 == 0) goto L_0x0029
            com.google.android.gms.internal.vision.b4$c r2 = new com.google.android.gms.internal.vision.b4$c
            r2.<init>(r0)
            goto L_0x0038
        L_0x0029:
            if (r4 == 0) goto L_0x0031
            com.google.android.gms.internal.vision.b4$a r2 = new com.google.android.gms.internal.vision.b4$a
            r2.<init>(r0)
            goto L_0x0038
        L_0x0031:
            r2 = 0
            goto L_0x0038
        L_0x0033:
            com.google.android.gms.internal.vision.b4$b r2 = new com.google.android.gms.internal.vision.b4$b
            r2.<init>(r0)
        L_0x0038:
            f3061c = r2
            java.lang.String r2 = "copyMemory"
            r6 = 1
            java.lang.String r7 = "putLong"
            java.lang.String r8 = "putInt"
            java.lang.String r9 = "getInt"
            java.lang.String r10 = "putByte"
            java.lang.String r11 = "getByte"
            java.lang.Class<java.lang.reflect.Field> r12 = java.lang.reflect.Field.class
            java.lang.String r13 = "com.google.protobuf.UnsafeUtil"
            java.lang.String r14 = "platform method missing - proto runtime falling back to safer methods: "
            java.lang.Class<com.google.android.gms.internal.vision.b4> r15 = com.google.android.gms.internal.vision.b4.class
            java.lang.String r4 = "objectFieldOffset"
            java.lang.Class<java.lang.Object> r16 = java.lang.Object.class
            java.lang.String r5 = "getLong"
            r17 = 0
            if (r0 != 0) goto L_0x005e
            r20 = r11
            r6 = r13
            goto L_0x011e
        L_0x005e:
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x00ef }
            r18 = r13
            java.lang.Class[] r13 = new java.lang.Class[r6]     // Catch:{ all -> 0x00eb }
            r13[r17] = r12     // Catch:{ all -> 0x00eb }
            r0.getMethod(r4, r13)     // Catch:{ all -> 0x00eb }
            r13 = 2
            java.lang.Class[] r6 = new java.lang.Class[r13]     // Catch:{ all -> 0x00eb }
            r6[r17] = r16     // Catch:{ all -> 0x00eb }
            r13 = 1
            r6[r13] = r1     // Catch:{ all -> 0x00eb }
            r0.getMethod(r5, r6)     // Catch:{ all -> 0x00eb }
            java.lang.reflect.Field r6 = v()     // Catch:{ all -> 0x00eb }
            if (r6 != 0) goto L_0x0082
            r20 = r11
            r6 = r18
            goto L_0x011e
        L_0x0082:
            boolean r6 = com.google.android.gms.internal.vision.q0.a()     // Catch:{ all -> 0x00eb }
            if (r6 == 0) goto L_0x008b
            r20 = r11
            goto L_0x00e5
        L_0x008b:
            r6 = 1
            java.lang.Class[] r13 = new java.lang.Class[r6]     // Catch:{ all -> 0x00eb }
            r13[r17] = r1     // Catch:{ all -> 0x00eb }
            r0.getMethod(r11, r13)     // Catch:{ all -> 0x00eb }
            r6 = 2
            java.lang.Class[] r13 = new java.lang.Class[r6]     // Catch:{ all -> 0x00eb }
            r13[r17] = r1     // Catch:{ all -> 0x00eb }
            java.lang.Class r6 = java.lang.Byte.TYPE     // Catch:{ all -> 0x00eb }
            r20 = r11
            r11 = 1
            r13[r11] = r6     // Catch:{ all -> 0x00e9 }
            r0.getMethod(r10, r13)     // Catch:{ all -> 0x00e9 }
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ all -> 0x00e9 }
            r6[r17] = r1     // Catch:{ all -> 0x00e9 }
            r0.getMethod(r9, r6)     // Catch:{ all -> 0x00e9 }
            r6 = 2
            java.lang.Class[] r13 = new java.lang.Class[r6]     // Catch:{ all -> 0x00e9 }
            r13[r17] = r1     // Catch:{ all -> 0x00e9 }
            r13[r11] = r3     // Catch:{ all -> 0x00e9 }
            r0.getMethod(r8, r13)     // Catch:{ all -> 0x00e9 }
            java.lang.Class[] r3 = new java.lang.Class[r11]     // Catch:{ all -> 0x00e9 }
            r3[r17] = r1     // Catch:{ all -> 0x00e9 }
            r0.getMethod(r5, r3)     // Catch:{ all -> 0x00e9 }
            r3 = 2
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ all -> 0x00e9 }
            r6[r17] = r1     // Catch:{ all -> 0x00e9 }
            r6[r11] = r1     // Catch:{ all -> 0x00e9 }
            r0.getMethod(r7, r6)     // Catch:{ all -> 0x00e9 }
            r3 = 3
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ all -> 0x00e9 }
            r6[r17] = r1     // Catch:{ all -> 0x00e9 }
            r6[r11] = r1     // Catch:{ all -> 0x00e9 }
            r3 = 2
            r6[r3] = r1     // Catch:{ all -> 0x00e9 }
            r0.getMethod(r2, r6)     // Catch:{ all -> 0x00e9 }
            r3 = 5
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ all -> 0x00e9 }
            r3[r17] = r16     // Catch:{ all -> 0x00e9 }
            r6 = 1
            r3[r6] = r1     // Catch:{ all -> 0x00e9 }
            r6 = 2
            r3[r6] = r16     // Catch:{ all -> 0x00e9 }
            r6 = 3
            r3[r6] = r1     // Catch:{ all -> 0x00e9 }
            r6 = 4
            r3[r6] = r1     // Catch:{ all -> 0x00e9 }
            r0.getMethod(r2, r3)     // Catch:{ all -> 0x00e9 }
        L_0x00e5:
            r6 = r18
            r0 = 1
            goto L_0x0120
        L_0x00e9:
            r0 = move-exception
            goto L_0x00f4
        L_0x00eb:
            r0 = move-exception
            r20 = r11
            goto L_0x00f4
        L_0x00ef:
            r0 = move-exception
            r20 = r11
            r18 = r13
        L_0x00f4:
            java.lang.String r1 = r15.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r3 = r0.length()
            int r3 = r3 + 71
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r3)
            r6.append(r14)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.String r3 = "supportsUnsafeByteBufferOperations"
            r6 = r18
            r1.logp(r2, r6, r3, r0)
        L_0x011e:
            r0 = r17
        L_0x0120:
            d = r0
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            sun.misc.Unsafe r1 = f3059a
            if (r1 != 0) goto L_0x012d
            r19 = r17
            r13 = 1
            goto L_0x0250
        L_0x012d:
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x0224 }
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ all -> 0x0221 }
            r3[r17] = r12     // Catch:{ all -> 0x0221 }
            r1.getMethod(r4, r3)     // Catch:{ all -> 0x0221 }
            java.lang.String r3 = "arrayBaseOffset"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ all -> 0x0221 }
            r4[r17] = r0     // Catch:{ all -> 0x0221 }
            r1.getMethod(r3, r4)     // Catch:{ all -> 0x0221 }
            java.lang.String r3 = "arrayIndexScale"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ all -> 0x0221 }
            r4[r17] = r0     // Catch:{ all -> 0x0224 }
            r1.getMethod(r3, r4)     // Catch:{ all -> 0x0224 }
            r2 = 2
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ all -> 0x0224 }
            r0[r17] = r16     // Catch:{ all -> 0x0224 }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x0224 }
            r3 = 1
            r0[r3] = r2     // Catch:{ all -> 0x021e }
            r1.getMethod(r9, r0)     // Catch:{ all -> 0x021e }
            r4 = 3
            java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch:{ all -> 0x021e }
            r0[r17] = r16     // Catch:{ all -> 0x021e }
            r0[r3] = r2     // Catch:{ all -> 0x021e }
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0224 }
            r4 = 2
            r0[r4] = r3     // Catch:{ all -> 0x0224 }
            r1.getMethod(r8, r0)     // Catch:{ all -> 0x0224 }
            java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch:{ all -> 0x0224 }
            r0[r17] = r16     // Catch:{ all -> 0x0224 }
            r3 = 1
            r0[r3] = r2     // Catch:{ all -> 0x021e }
            r1.getMethod(r5, r0)     // Catch:{ all -> 0x021e }
            r4 = 3
            java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch:{ all -> 0x021e }
            r0[r17] = r16     // Catch:{ all -> 0x021e }
            r0[r3] = r2     // Catch:{ all -> 0x021e }
            r3 = 2
            r0[r3] = r2     // Catch:{ all -> 0x0224 }
            r1.getMethod(r7, r0)     // Catch:{ all -> 0x0224 }
            java.lang.String r0 = "getObject"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x0224 }
            r4[r17] = r16     // Catch:{ all -> 0x0224 }
            r3 = 1
            r4[r3] = r2     // Catch:{ all -> 0x021e }
            r1.getMethod(r0, r4)     // Catch:{ all -> 0x021e }
            java.lang.String r0 = "putObject"
            r4 = 3
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x021e }
            r5[r17] = r16     // Catch:{ all -> 0x021e }
            r5[r3] = r2     // Catch:{ all -> 0x021e }
            r3 = 2
            r5[r3] = r16     // Catch:{ all -> 0x0224 }
            r1.getMethod(r0, r5)     // Catch:{ all -> 0x0224 }
            boolean r0 = com.google.android.gms.internal.vision.q0.a()     // Catch:{ all -> 0x0224 }
            if (r0 == 0) goto L_0x01a4
            r13 = 1
            r19 = 1
            goto L_0x0250
        L_0x01a4:
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ all -> 0x0224 }
            r0[r17] = r16     // Catch:{ all -> 0x0224 }
            r3 = 1
            r0[r3] = r2     // Catch:{ all -> 0x021e }
            r4 = r20
            r1.getMethod(r4, r0)     // Catch:{ all -> 0x021e }
            r4 = 3
            java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch:{ all -> 0x021e }
            r0[r17] = r16     // Catch:{ all -> 0x021e }
            r0[r3] = r2     // Catch:{ all -> 0x021e }
            java.lang.Class r3 = java.lang.Byte.TYPE     // Catch:{ all -> 0x0224 }
            r4 = 2
            r0[r4] = r3     // Catch:{ all -> 0x0224 }
            r1.getMethod(r10, r0)     // Catch:{ all -> 0x0224 }
            java.lang.String r0 = "getBoolean"
            java.lang.Class[] r3 = new java.lang.Class[r4]     // Catch:{ all -> 0x0224 }
            r3[r17] = r16     // Catch:{ all -> 0x0224 }
            r4 = 1
            r3[r4] = r2     // Catch:{ all -> 0x021b }
            r1.getMethod(r0, r3)     // Catch:{ all -> 0x021b }
            java.lang.String r0 = "putBoolean"
            r3 = 3
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ all -> 0x021b }
            r5[r17] = r16     // Catch:{ all -> 0x021b }
            r5[r4] = r2     // Catch:{ all -> 0x021b }
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0224 }
            r4 = 2
            r5[r4] = r3     // Catch:{ all -> 0x0224 }
            r1.getMethod(r0, r5)     // Catch:{ all -> 0x0224 }
            java.lang.String r0 = "getFloat"
            java.lang.Class[] r3 = new java.lang.Class[r4]     // Catch:{ all -> 0x0224 }
            r3[r17] = r16     // Catch:{ all -> 0x0224 }
            r4 = 1
            r3[r4] = r2     // Catch:{ all -> 0x021b }
            r1.getMethod(r0, r3)     // Catch:{ all -> 0x021b }
            java.lang.String r0 = "putFloat"
            r3 = 3
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ all -> 0x021b }
            r5[r17] = r16     // Catch:{ all -> 0x021b }
            r5[r4] = r2     // Catch:{ all -> 0x021b }
            java.lang.Class r3 = java.lang.Float.TYPE     // Catch:{ all -> 0x0224 }
            r4 = 2
            r5[r4] = r3     // Catch:{ all -> 0x0224 }
            r1.getMethod(r0, r5)     // Catch:{ all -> 0x0224 }
            java.lang.String r0 = "getDouble"
            java.lang.Class[] r3 = new java.lang.Class[r4]     // Catch:{ all -> 0x0224 }
            r3[r17] = r16     // Catch:{ all -> 0x0224 }
            r13 = 1
            r3[r13] = r2     // Catch:{ all -> 0x0219 }
            r1.getMethod(r0, r3)     // Catch:{ all -> 0x0219 }
            java.lang.String r0 = "putDouble"
            r3 = 3
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ all -> 0x0219 }
            r3[r17] = r16     // Catch:{ all -> 0x0219 }
            r3[r13] = r2     // Catch:{ all -> 0x0219 }
            java.lang.Class r2 = java.lang.Double.TYPE     // Catch:{ all -> 0x0219 }
            r4 = 2
            r3[r4] = r2     // Catch:{ all -> 0x0219 }
            r1.getMethod(r0, r3)     // Catch:{ all -> 0x0219 }
            r19 = r13
            goto L_0x0250
        L_0x0219:
            r0 = move-exception
            goto L_0x0226
        L_0x021b:
            r0 = move-exception
            r13 = r4
            goto L_0x0226
        L_0x021e:
            r0 = move-exception
            r13 = r3
            goto L_0x0226
        L_0x0221:
            r0 = move-exception
            r13 = r2
            goto L_0x0226
        L_0x0224:
            r0 = move-exception
            r13 = 1
        L_0x0226:
            java.lang.String r1 = r15.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r3 = r0.length()
            int r3 = r3 + 71
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r14)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r3 = "supportsUnsafeArrayOperations"
            r1.logp(r2, r6, r3, r0)
            r19 = r17
        L_0x0250:
            f3062e = r19
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = k(r0)
            long r0 = (long) r0
            f3063f = r0
            java.lang.Class<boolean[]> r0 = boolean[].class
            k(r0)
            n(r0)
            java.lang.Class<int[]> r0 = int[].class
            k(r0)
            n(r0)
            java.lang.Class<long[]> r0 = long[].class
            k(r0)
            n(r0)
            java.lang.Class<float[]> r0 = float[].class
            k(r0)
            n(r0)
            java.lang.Class<double[]> r0 = double[].class
            k(r0)
            n(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            k(r0)
            n(r0)
            java.lang.reflect.Field r0 = v()
            if (r0 == 0) goto L_0x029b
            com.google.android.gms.internal.vision.b4$d r1 = f3061c
            if (r1 != 0) goto L_0x0296
            goto L_0x029b
        L_0x0296:
            sun.misc.Unsafe r1 = r1.f3065a
            r1.objectFieldOffset(r0)
        L_0x029b:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x02a5
            r6 = r13
            goto L_0x02a7
        L_0x02a5:
            r6 = r17
        L_0x02a7:
            f3064g = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.b4.<clinit>():void");
    }

    public static byte a(byte[] bArr, long j8) {
        return f3061c.a(f3063f + j8, bArr);
    }

    public static int b(long j8, Object obj) {
        return f3061c.k(j8, obj);
    }

    public static <T> T c(Class<T> cls) {
        try {
            return f3059a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static void d(Object obj, long j8, double d10) {
        f3061c.c(obj, j8, d10);
    }

    public static void e(Object obj, long j8, float f10) {
        f3061c.d(obj, j8, f10);
    }

    public static void f(Object obj, long j8, long j10) {
        f3061c.e(obj, j8, j10);
    }

    public static void g(Object obj, long j8, boolean z) {
        f3061c.f(obj, j8, z);
    }

    public static void h(byte[] bArr, long j8, byte b10) {
        f3061c.b(bArr, f3063f + j8, b10);
    }

    public static void i(int i10, long j8, Object obj) {
        f3061c.g(i10, j8, obj);
    }

    public static void j(long j8, Object obj, Object obj2) {
        f3061c.f3065a.putObject(obj, j8, obj2);
    }

    public static int k(Class<?> cls) {
        if (f3062e) {
            return f3061c.f3065a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static long l(long j8, Object obj) {
        return f3061c.l(j8, obj);
    }

    public static Unsafe m() {
        try {
            return (Unsafe) AccessController.doPrivileged(new d4());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void n(Class cls) {
        if (f3062e) {
            f3061c.f3065a.arrayIndexScale(cls);
        }
    }

    public static void o(Object obj, long j8, byte b10) {
        long j10 = -4 & j8;
        int b11 = b(j10, obj);
        int i10 = ((~((int) j8)) & 3) << 3;
        i(((255 & b10) << i10) | (b11 & (~(255 << i10))), j10, obj);
    }

    public static boolean p(long j8, Object obj) {
        return f3061c.h(j8, obj);
    }

    public static float q(long j8, Object obj) {
        return f3061c.i(j8, obj);
    }

    public static void r(Object obj, long j8, byte b10) {
        long j10 = -4 & j8;
        int i10 = (((int) j8) & 3) << 3;
        i(((255 & b10) << i10) | (b(j10, obj) & (~(255 << i10))), j10, obj);
    }

    public static boolean s(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!q0.a()) {
            return false;
        }
        try {
            Class<?> cls3 = f3060b;
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

    public static double t(long j8, Object obj) {
        return f3061c.j(j8, obj);
    }

    public static Object u(long j8, Object obj) {
        return f3061c.f3065a.getObject(obj, j8);
    }

    public static Field v() {
        Field field;
        Field field2;
        Class<Buffer> cls = Buffer.class;
        if (q0.a()) {
            try {
                field2 = cls.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = cls.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static byte w(long j8, Object obj) {
        return (byte) (b(-4 & j8, obj) >>> ((int) (((~j8) & 3) << 3)));
    }

    public static byte x(long j8, Object obj) {
        return (byte) (b(-4 & j8, obj) >>> ((int) ((j8 & 3) << 3)));
    }
}

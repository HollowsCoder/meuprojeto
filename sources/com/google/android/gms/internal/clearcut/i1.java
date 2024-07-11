package com.google.android.gms.internal.clearcut;

import java.nio.charset.Charset;

public final class i1 implements j2 {

    /* renamed from: b  reason: collision with root package name */
    public static final j1 f2464b = new j1();

    /* renamed from: a  reason: collision with root package name */
    public final q1 f2465a;

    public i1() {
        q1 q1Var;
        q1[] q1VarArr = new q1[2];
        q1VarArr[0] = o0.f2509a;
        try {
            q1Var = (q1) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            q1Var = f2464b;
        }
        q1VarArr[1] = q1Var;
        k1 k1Var = new k1(q1VarArr);
        Charset charset = r0.f2537a;
        this.f2465a = k1Var;
    }

    public final <T> i2<T> a(Class<T> cls) {
        y1 y1Var;
        n1 n1Var;
        d0 d0Var;
        w2 w2Var;
        g1 g1Var;
        c0<?> c0Var;
        u2<?, ?> u2Var;
        y1 y1Var2;
        f1 f1Var;
        d0 d0Var2;
        w2 w2Var2;
        Class<?> cls2;
        Class<?> cls3 = k2.f2474a;
        Class<p0> cls4 = p0.class;
        if (cls4.isAssignableFrom(cls) || (cls2 = k2.f2474a) == null || cls2.isAssignableFrom(cls)) {
            p1 a10 = this.f2465a.a(cls);
            boolean b10 = a10.b();
            boolean isAssignableFrom = cls4.isAssignableFrom(cls);
            if (!b10) {
                boolean z = false;
                if (isAssignableFrom) {
                    if (a10.a() == 1) {
                        z = true;
                    }
                    if (z) {
                        y1Var = a2.f2363b;
                        g1Var = e1.f2412b;
                        w2Var2 = k2.d;
                        d0Var2 = f0.f2416a;
                    } else {
                        y1Var = a2.f2363b;
                        d0Var2 = null;
                        g1Var = e1.f2412b;
                        w2Var2 = k2.d;
                    }
                    w2Var = w2Var2;
                    d0Var = d0Var2;
                    n1Var = o1.f2511b;
                } else {
                    if (a10.a() == 1) {
                        z = true;
                    }
                    if (z) {
                        y1Var2 = a2.f2362a;
                        f1Var = e1.f2411a;
                        u2Var = k2.f2475b;
                        c0Var = f0.f2417b;
                        if (c0Var == null) {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    } else {
                        y1Var2 = a2.f2362a;
                        c0Var = null;
                        f1Var = e1.f2411a;
                        u2Var = k2.f2476c;
                    }
                    w2Var = u2Var;
                    n1Var = o1.f2510a;
                    d0Var = c0Var;
                }
                return v1.p(a10, y1Var, g1Var, w2Var, d0Var, n1Var);
            } else if (isAssignableFrom) {
                return new w1(k2.d, f0.f2416a, a10.c());
            } else {
                u2<?, ?> u2Var2 = k2.f2475b;
                c0<?> c0Var2 = f0.f2417b;
                if (c0Var2 != null) {
                    return new w1(u2Var2, c0Var2, a10.c());
                }
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
        } else {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }
}

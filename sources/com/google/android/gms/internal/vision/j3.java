package com.google.android.gms.internal.vision;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

public final class j3 {

    /* renamed from: c  reason: collision with root package name */
    public static final j3 f3104c = new j3();

    /* renamed from: a  reason: collision with root package name */
    public final o2 f3105a = new o2();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f3106b = new ConcurrentHashMap();

    public final <T> m3<T> a(Class<T> cls) {
        m3<T> m3Var;
        t2 t2Var;
        x3 x3Var;
        m2 m2Var;
        d3 d3Var;
        d3 d3Var2;
        k2 k2Var;
        w3<?, ?> w3Var;
        c3 c3Var;
        Class<?> cls2;
        Charset charset = u1.f3170a;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.f3106b;
            m3<T> m3Var2 = (m3) concurrentHashMap.get(cls);
            if (m3Var2 != null) {
                return m3Var2;
            }
            o2 o2Var = this.f3105a;
            o2Var.getClass();
            Class<?> cls3 = n3.f3120a;
            Class<q1> cls4 = q1.class;
            if (cls4.isAssignableFrom(cls) || (cls2 = n3.f3120a) == null || cls2.isAssignableFrom(cls)) {
                u2 a10 = o2Var.f3126a.a(cls);
                if (a10.a()) {
                    if (cls4.isAssignableFrom(cls)) {
                        c3Var = new c3(n3.d, g1.f3091a, a10.zzc());
                    } else {
                        w3<?, ?> w3Var2 = n3.f3121b;
                        f1<?> f1Var = g1.f3092b;
                        if (f1Var != null) {
                            c3Var = new c3(w3Var2, f1Var, a10.zzc());
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    m3Var = c3Var;
                } else {
                    boolean isAssignableFrom = cls4.isAssignableFrom(cls);
                    e1 e1Var = null;
                    boolean z = false;
                    if (isAssignableFrom) {
                        if (a10.zza() == 1) {
                            z = true;
                        }
                        if (z) {
                            d3Var = f3.f3089b;
                            m2 m2Var2 = i2.f3100b;
                            x3 x3Var2 = n3.d;
                            m2Var = m2Var2;
                            e1Var = g1.f3091a;
                            x3Var = x3Var2;
                        } else {
                            d3Var = f3.f3089b;
                            m2Var = i2.f3100b;
                            x3Var = n3.d;
                        }
                        t2Var = v2.f3181b;
                    } else {
                        if (a10.zza() == 1) {
                            z = true;
                        }
                        if (z) {
                            d3Var2 = f3.f3088a;
                            k2 k2Var2 = i2.f3099a;
                            w3Var = n3.f3121b;
                            f1<?> f1Var2 = g1.f3092b;
                            if (f1Var2 != null) {
                                k2Var = k2Var2;
                                e1Var = f1Var2;
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            d3Var2 = f3.f3088a;
                            k2Var = i2.f3099a;
                            w3Var = n3.f3122c;
                        }
                        t2Var = v2.f3180a;
                    }
                    t2 t2Var2 = t2Var;
                    w3<?, ?> w3Var3 = x3Var;
                    m3Var = a3.m(a10, d3Var, m2Var, w3Var3, e1Var, t2Var2);
                }
                m3<T> m3Var3 = (m3) concurrentHashMap.putIfAbsent(cls, m3Var);
                if (m3Var3 != null) {
                    return m3Var3;
                }
                return m3Var;
            }
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        throw new NullPointerException("messageType");
    }
}

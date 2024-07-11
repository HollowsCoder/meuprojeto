package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

public final class q7 {

    /* renamed from: c  reason: collision with root package name */
    public static final q7 f2894c = new q7();

    /* renamed from: a  reason: collision with root package name */
    public final b7 f2895a = new b7();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f2896b = new ConcurrentHashMap();

    public final <T> t7<T> a(Class<T> cls) {
        e7 e7Var;
        s5<?> s5Var;
        e8<?, ?> e8Var;
        w6 w6Var;
        w6 w6Var2;
        e8<?, ?> e8Var2;
        s5<?> s5Var2;
        m7 m7Var;
        Class<?> cls2;
        Charset charset = n6.f2844a;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.f2896b;
            t7<T> t7Var = (t7) concurrentHashMap.get(cls);
            if (t7Var == null) {
                b7 b7Var = this.f2895a;
                b7Var.getClass();
                Class<?> cls3 = u7.f2955a;
                Class<f6> cls4 = f6.class;
                if (cls4.isAssignableFrom(cls) || (cls2 = u7.f2955a) == null || cls2.isAssignableFrom(cls)) {
                    g7 b10 = b7Var.f2638a.b(cls);
                    boolean zza = b10.zza();
                    boolean isAssignableFrom = cls4.isAssignableFrom(cls);
                    if (zza) {
                        if (isAssignableFrom) {
                            m7Var = new m7(u7.d, u5.f2952a, b10.a());
                        } else {
                            e8<?, ?> e8Var3 = u7.f2956b;
                            s5<?> s5Var3 = u5.f2953b;
                            if (s5Var3 != null) {
                                m7Var = new m7(e8Var3, s5Var3, b10.a());
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        }
                        t7Var = m7Var;
                    } else {
                        boolean z = false;
                        if (isAssignableFrom) {
                            if (b10.zzc() == 1) {
                                z = true;
                            }
                            if (z) {
                                int i10 = o7.f2860a;
                                w6Var = w6.f2981b;
                                e8Var = u7.d;
                                s5Var = u5.f2952a;
                            } else {
                                int i11 = o7.f2860a;
                                w6Var = w6.f2981b;
                                e8Var = u7.d;
                                s5Var = null;
                            }
                            e7Var = f7.f2699b;
                        } else {
                            if (b10.zzc() == 1) {
                                z = true;
                            }
                            if (z) {
                                int i12 = o7.f2860a;
                                w6Var2 = w6.f2980a;
                                e8<?, ?> e8Var4 = u7.f2956b;
                                s5<?> s5Var4 = u5.f2953b;
                                if (s5Var4 != null) {
                                    e8Var2 = e8Var4;
                                    s5Var2 = s5Var4;
                                } else {
                                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                                }
                            } else {
                                int i13 = o7.f2860a;
                                w6Var2 = w6.f2980a;
                                e8Var2 = u7.f2957c;
                                s5Var2 = null;
                            }
                            e7Var = f7.f2698a;
                        }
                        int[] iArr = l7.f2781n;
                        if (b10 instanceof s7) {
                            t7Var = l7.v((s7) b10, w6Var, e8Var, s5Var, e7Var);
                        } else {
                            c8 c8Var = (c8) b10;
                            throw null;
                        }
                    }
                    t7<T> t7Var2 = (t7) concurrentHashMap.putIfAbsent(cls, t7Var);
                    if (t7Var2 == null) {
                        return t7Var;
                    }
                    return t7Var2;
                }
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            return t7Var;
        }
        throw new NullPointerException("messageType");
    }
}

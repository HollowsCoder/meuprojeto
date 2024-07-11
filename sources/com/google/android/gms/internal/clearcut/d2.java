package com.google.android.gms.internal.clearcut;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

public final class d2 {

    /* renamed from: c  reason: collision with root package name */
    public static final d2 f2398c = new d2();

    /* renamed from: a  reason: collision with root package name */
    public final j2 f2399a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f2400b = new ConcurrentHashMap();

    public d2() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        j2 j2Var = null;
        for (int i10 = 0; i10 <= 0; i10++) {
            try {
                j2Var = (j2) Class.forName(strArr[0]).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused) {
                j2Var = null;
            }
            if (j2Var != null) {
                break;
            }
        }
        this.f2399a = j2Var == null ? new i1() : j2Var;
    }

    public final <T> i2<T> a(Class<T> cls) {
        Charset charset = r0.f2537a;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.f2400b;
            i2<T> i2Var = (i2) concurrentHashMap.get(cls);
            if (i2Var != null) {
                return i2Var;
            }
            i2<T> a10 = this.f2399a.a(cls);
            if (a10 != null) {
                i2<T> i2Var2 = (i2) concurrentHashMap.putIfAbsent(cls, a10);
                if (i2Var2 != null) {
                    return i2Var2;
                }
                return a10;
            }
            throw new NullPointerException("schema");
        }
        throw new NullPointerException("messageType");
    }
}

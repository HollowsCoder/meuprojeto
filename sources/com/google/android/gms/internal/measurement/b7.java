package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

public final class b7 {

    /* renamed from: b  reason: collision with root package name */
    public static final y6 f2637b = new y6();

    /* renamed from: a  reason: collision with root package name */
    public final z6 f2638a;

    public b7() {
        h7 h7Var;
        h7[] h7VarArr = new h7[2];
        h7VarArr[0] = a6.f2613a;
        try {
            h7Var = (h7) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            h7Var = f2637b;
        }
        h7VarArr[1] = h7Var;
        z6 z6Var = new z6(h7VarArr);
        Charset charset = n6.f2844a;
        this.f2638a = z6Var;
    }
}

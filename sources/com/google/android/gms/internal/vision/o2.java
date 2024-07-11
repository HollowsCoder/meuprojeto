package com.google.android.gms.internal.vision;

import java.nio.charset.Charset;

public final class o2 {

    /* renamed from: b  reason: collision with root package name */
    public static final n2 f3125b = new n2();

    /* renamed from: a  reason: collision with root package name */
    public final x2 f3126a;

    public o2() {
        x2 x2Var;
        x2[] x2VarArr = new x2[2];
        x2VarArr[0] = r1.f3155a;
        try {
            x2Var = (x2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            x2Var = f3125b;
        }
        x2VarArr[1] = x2Var;
        q2 q2Var = new q2(x2VarArr);
        Charset charset = u1.f3170a;
        this.f3126a = q2Var;
    }
}

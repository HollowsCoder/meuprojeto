package com.google.android.gms.internal.clearcut;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.a;
import h4.f;
import k4.a;
import l4.r;

public final class z3 extends a<Status, d4> {

    /* renamed from: h  reason: collision with root package name */
    public final f f2604h;

    public z3(f fVar, r rVar) {
        super(h4.a.f5234k, rVar);
        this.f2604h = fVar;
    }

    public final /* synthetic */ Status a(Status status) {
        return status;
    }

    public final void f(a.e eVar) {
        f fVar = this.f2604h;
        d4 d4Var = (d4) eVar;
        c4 c4Var = new c4(this);
        try {
            fVar.getClass();
            a4 a4Var = fVar.w;
            int d = a4Var.d();
            byte[] bArr = new byte[d];
            s3.c(a4Var, bArr, d);
            fVar.f5254p = bArr;
            ((f4) d4Var.u()).D(c4Var, fVar);
        } catch (RuntimeException e10) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e10);
            g(new Status(10, "MessageProducer"));
        }
    }
}

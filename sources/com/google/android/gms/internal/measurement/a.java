package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

public final /* synthetic */ class a implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2605a;

    /* renamed from: b  reason: collision with root package name */
    public final k0 f2606b;

    public /* synthetic */ a(k0 k0Var, int i10) {
        this.f2605a = i10;
        this.f2606b = k0Var;
    }

    public final Object call() {
        int i10 = this.f2605a;
        k0 k0Var = this.f2606b;
        switch (i10) {
            case 0:
                return new sc(k0Var.d);
            default:
                return new c6(k0Var.f2765c);
        }
    }
}

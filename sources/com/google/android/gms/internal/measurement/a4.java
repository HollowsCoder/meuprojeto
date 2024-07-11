package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Iterator;

public final class a4 extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b4 f2612a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a4(b4 b4Var) {
        super((Handler) null);
        this.f2612a = b4Var;
    }

    public final void onChange(boolean z) {
        b4 b4Var = this.f2612a;
        synchronized (b4Var.d) {
            b4Var.f2632e = null;
            m4.f2823h.incrementAndGet();
        }
        synchronized (b4Var) {
            Iterator it = b4Var.f2633f.iterator();
            while (it.hasNext()) {
                ((c4) it.next()).zza();
            }
        }
    }
}

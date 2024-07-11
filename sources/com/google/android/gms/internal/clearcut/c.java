package com.google.android.gms.internal.clearcut;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Iterator;

public final class c extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f2394a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(b bVar) {
        super((Handler) null);
        this.f2394a = bVar;
    }

    public final void onChange(boolean z) {
        b bVar = this.f2394a;
        synchronized (bVar.d) {
            bVar.f2385e = null;
        }
        b bVar2 = this.f2394a;
        synchronized (bVar2.f2386f) {
            Iterator it = bVar2.f2387g.iterator();
            while (it.hasNext()) {
                ((d) it.next()).d();
            }
        }
    }
}

package com.google.android.gms.common.api.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import k4.a;
import k4.g;
import l4.r;
import n4.m;

public abstract class a<R extends g, A> extends BasePendingResult<R> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(@RecentlyNonNull k4.a aVar, @RecentlyNonNull r rVar) {
        super(rVar);
        if (rVar != null) {
            if (aVar == null) {
                throw new NullPointerException("Api must not be null");
            }
            return;
        }
        throw new NullPointerException("GoogleApiClient must not be null");
    }

    public abstract void f(@RecentlyNonNull a.e eVar);

    public final void g(@RecentlyNonNull Status status) {
        boolean z;
        if (status.f2323p <= 0) {
            z = true;
        } else {
            z = false;
        }
        m.a("Failed result must not be success", !z);
        c(a(status));
    }
}

package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map;

public final class q2 implements Iterator {

    /* renamed from: o  reason: collision with root package name */
    public int f2528o = -1;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2529p;

    /* renamed from: q  reason: collision with root package name */
    public Iterator f2530q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ l2 f2531r;

    public q2(l2 l2Var) {
        this.f2531r = l2Var;
    }

    public final Iterator a() {
        if (this.f2530q == null) {
            this.f2530q = this.f2531r.f2499q.entrySet().iterator();
        }
        return this.f2530q;
    }

    public final boolean hasNext() {
        int i10 = this.f2528o + 1;
        l2 l2Var = this.f2531r;
        if (i10 < l2Var.f2498p.size() || (!l2Var.f2499q.isEmpty() && a().hasNext())) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        Object next;
        this.f2529p = true;
        int i10 = this.f2528o + 1;
        this.f2528o = i10;
        l2 l2Var = this.f2531r;
        if (i10 < l2Var.f2498p.size()) {
            next = l2Var.f2498p.get(this.f2528o);
        } else {
            next = a().next();
        }
        return (Map.Entry) next;
    }

    public final void remove() {
        if (this.f2529p) {
            this.f2529p = false;
            int i10 = l2.u;
            l2 l2Var = this.f2531r;
            l2Var.g();
            if (this.f2528o < l2Var.f2498p.size()) {
                int i11 = this.f2528o;
                this.f2528o = i11 - 1;
                l2Var.d(i11);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}

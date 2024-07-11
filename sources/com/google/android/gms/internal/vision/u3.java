package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

public final class u3 implements Iterator {

    /* renamed from: o  reason: collision with root package name */
    public int f3172o = -1;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3173p;

    /* renamed from: q  reason: collision with root package name */
    public Iterator f3174q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ p3 f3175r;

    public u3(p3 p3Var) {
        this.f3175r = p3Var;
    }

    public final Iterator a() {
        if (this.f3174q == null) {
            this.f3174q = this.f3175r.f3131q.entrySet().iterator();
        }
        return this.f3174q;
    }

    public final boolean hasNext() {
        int i10 = this.f3172o + 1;
        p3 p3Var = this.f3175r;
        if (i10 < p3Var.f3130p.size() || (!p3Var.f3131q.isEmpty() && a().hasNext())) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        Object next;
        this.f3173p = true;
        int i10 = this.f3172o + 1;
        this.f3172o = i10;
        p3 p3Var = this.f3175r;
        if (i10 < p3Var.f3130p.size()) {
            next = p3Var.f3130p.get(this.f3172o);
        } else {
            next = a().next();
        }
        return (Map.Entry) next;
    }

    public final void remove() {
        if (this.f3173p) {
            this.f3173p = false;
            int i10 = p3.u;
            p3 p3Var = this.f3175r;
            p3Var.h();
            if (this.f3172o < p3Var.f3130p.size()) {
                int i11 = this.f3172o;
                this.f3172o = i11 - 1;
                p3Var.f(i11);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}

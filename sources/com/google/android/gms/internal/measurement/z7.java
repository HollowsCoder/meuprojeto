package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

public final class z7 implements Iterator<Map.Entry> {

    /* renamed from: o  reason: collision with root package name */
    public int f3025o = -1;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3026p;

    /* renamed from: q  reason: collision with root package name */
    public Iterator<Map.Entry> f3027q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ b8 f3028r;

    public /* synthetic */ z7(b8 b8Var) {
        this.f3028r = b8Var;
    }

    public final Iterator<Map.Entry> a() {
        if (this.f3027q == null) {
            this.f3027q = this.f3028r.f2641q.entrySet().iterator();
        }
        return this.f3027q;
    }

    public final boolean hasNext() {
        int i10 = this.f3025o + 1;
        b8 b8Var = this.f3028r;
        if (i10 < b8Var.f2640p.size()) {
            return true;
        }
        if (b8Var.f2641q.isEmpty()) {
            return false;
        }
        if (a().hasNext()) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        Object obj;
        this.f3026p = true;
        int i10 = this.f3025o + 1;
        this.f3025o = i10;
        b8 b8Var = this.f3028r;
        if (i10 < b8Var.f2640p.size()) {
            obj = b8Var.f2640p.get(this.f3025o);
        } else {
            obj = a().next();
        }
        return (Map.Entry) obj;
    }

    public final void remove() {
        if (this.f3026p) {
            this.f3026p = false;
            int i10 = b8.u;
            b8 b8Var = this.f3028r;
            b8Var.e();
            if (this.f3025o < b8Var.f2640p.size()) {
                int i11 = this.f3025o;
                this.f3025o = i11 - 1;
                b8Var.c(i11);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}

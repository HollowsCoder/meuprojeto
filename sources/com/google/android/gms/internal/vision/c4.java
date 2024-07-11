package com.google.android.gms.internal.vision;

import h5.n;
import java.util.Iterator;

public final class c4 implements Iterator {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f3073o = 0;

    /* renamed from: p  reason: collision with root package name */
    public final Iterator f3074p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Iterable f3075q;

    public c4(a4 a4Var) {
        this.f3075q = a4Var;
        this.f3074p = a4Var.f3055o.iterator();
    }

    public final boolean hasNext() {
        int i10 = this.f3073o;
        Iterator it = this.f3074p;
        switch (i10) {
            case 0:
                return it.hasNext();
            default:
                return it.hasNext();
        }
    }

    public final Object next() {
        int i10 = this.f3073o;
        Iterator it = this.f3074p;
        switch (i10) {
            case 0:
                return (String) it.next();
            default:
                return (String) it.next();
        }
    }

    public final void remove() {
        switch (this.f3073o) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Remove not supported");
        }
    }

    public c4(n nVar) {
        this.f3075q = nVar;
        this.f3074p = nVar.f5587o.keySet().iterator();
    }
}

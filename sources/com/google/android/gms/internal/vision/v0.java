package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class v0 implements Iterator {

    /* renamed from: o  reason: collision with root package name */
    public int f3177o = 0;

    /* renamed from: p  reason: collision with root package name */
    public final int f3178p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ w0 f3179q;

    public v0(w0 w0Var) {
        this.f3179q = w0Var;
        this.f3178p = w0Var.p();
    }

    /* renamed from: a */
    public final Object next() {
        int i10 = this.f3177o;
        if (i10 < this.f3178p) {
            this.f3177o = i10 + 1;
            return Byte.valueOf(this.f3179q.q(i10));
        }
        throw new NoSuchElementException();
    }

    public final void b() {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f3177o < this.f3178p;
    }

    public final /* bridge */ /* synthetic */ void remove() {
        b();
        throw null;
    }
}

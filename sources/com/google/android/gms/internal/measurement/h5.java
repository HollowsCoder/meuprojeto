package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class h5 implements Iterator {
    public final Object next() {
        g5 g5Var = (g5) this;
        int i10 = g5Var.f2715o;
        if (i10 < g5Var.f2716p) {
            g5Var.f2715o = i10 + 1;
            return Byte.valueOf(g5Var.f2717q.h(i10));
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class v implements Iterator {

    /* renamed from: o  reason: collision with root package name */
    public int f2547o = 0;

    /* renamed from: p  reason: collision with root package name */
    public final int f2548p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ u f2549q;

    public v(u uVar) {
        this.f2549q = uVar;
        this.f2548p = uVar.size();
    }

    public final boolean hasNext() {
        return this.f2547o < this.f2548p;
    }

    public final Object next() {
        try {
            u uVar = this.f2549q;
            int i10 = this.f2547o;
            this.f2547o = i10 + 1;
            return Byte.valueOf(uVar.n(i10));
        } catch (IndexOutOfBoundsException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

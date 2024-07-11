package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class c implements Iterator<o> {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Iterator f2648o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Iterator f2649p;

    public c(Iterator it, Iterator it2) {
        this.f2648o = it;
        this.f2649p = it2;
    }

    public final boolean hasNext() {
        if (this.f2648o.hasNext()) {
            return true;
        }
        return this.f2649p.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f2648o;
        if (it.hasNext()) {
            return new r(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f2649p;
        if (it2.hasNext()) {
            return new r((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}

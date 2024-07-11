package com.google.android.gms.internal.measurement;

import java.util.Iterator;

public final class j implements Iterator<o> {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Iterator f2752o;

    public j(Iterator it) {
        this.f2752o = it;
    }

    public final boolean hasNext() {
        return this.f2752o.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return new r((String) this.f2752o.next());
    }
}

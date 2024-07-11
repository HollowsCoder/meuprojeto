package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class q implements Iterator<o> {

    /* renamed from: o  reason: collision with root package name */
    public int f2886o = 0;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ r f2887p;

    public q(r rVar) {
        this.f2887p = rVar;
    }

    public final boolean hasNext() {
        if (this.f2886o < this.f2887p.f2901o.length()) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        int i10 = this.f2886o;
        r rVar = this.f2887p;
        if (i10 < rVar.f2901o.length()) {
            String str = rVar.f2901o;
            int i11 = this.f2886o;
            this.f2886o = i11 + 1;
            return new r(String.valueOf(str.charAt(i11)));
        }
        throw new NoSuchElementException();
    }
}

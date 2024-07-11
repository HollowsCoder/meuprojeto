package com.google.android.gms.internal.vision;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public final class d extends WeakReference<Throwable> {

    /* renamed from: a  reason: collision with root package name */
    public final int f3076a;

    public d(Exception exc, ReferenceQueue referenceQueue) {
        super(exc, referenceQueue);
        this.f3076a = System.identityHashCode(exc);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == d.class) {
            if (this == obj) {
                return true;
            }
            d dVar = (d) obj;
            return this.f3076a == dVar.f3076a && get() == dVar.get();
        }
    }

    public final int hashCode() {
        return this.f3076a;
    }
}

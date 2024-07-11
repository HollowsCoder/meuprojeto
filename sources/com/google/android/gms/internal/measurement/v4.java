package com.google.android.gms.internal.measurement;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public final class v4 extends WeakReference<Throwable> {

    /* renamed from: a  reason: collision with root package name */
    public final int f2961a;

    public v4(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.f2961a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == v4.class) {
            if (this == obj) {
                return true;
            }
            v4 v4Var = (v4) obj;
            return this.f2961a == v4Var.f2961a && get() == v4Var.get();
        }
    }

    public final int hashCode() {
        return this.f2961a;
    }
}

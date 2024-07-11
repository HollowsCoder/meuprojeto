package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.x0;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class t4<T> implements r4<T> {

    /* renamed from: o  reason: collision with root package name */
    public volatile r4<T> f2934o;

    /* renamed from: p  reason: collision with root package name */
    public volatile boolean f2935p;
    @NullableDecl

    /* renamed from: q  reason: collision with root package name */
    public T f2936q;

    public t4(r4<T> r4Var) {
        this.f2934o = r4Var;
    }

    public final String toString() {
        Object obj = this.f2934o;
        if (obj == null) {
            String valueOf = String.valueOf(this.f2936q);
            obj = x0.f(new StringBuilder(valueOf.length() + 25), "<supplier that returned ", valueOf, ">");
        }
        String valueOf2 = String.valueOf(obj);
        return x0.f(new StringBuilder(valueOf2.length() + 19), "Suppliers.memoize(", valueOf2, ")");
    }

    public final T zza() {
        if (!this.f2935p) {
            synchronized (this) {
                if (!this.f2935p) {
                    T zza = this.f2934o.zza();
                    this.f2936q = zza;
                    this.f2935p = true;
                    this.f2934o = null;
                    return zza;
                }
            }
        }
        return this.f2936q;
    }
}

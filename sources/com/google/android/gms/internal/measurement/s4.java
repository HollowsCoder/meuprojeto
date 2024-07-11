package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.x0;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class s4<T> implements Serializable, r4 {

    /* renamed from: o  reason: collision with root package name */
    public final r4<T> f2919o;

    /* renamed from: p  reason: collision with root package name */
    public volatile transient boolean f2920p;
    @NullableDecl

    /* renamed from: q  reason: collision with root package name */
    public transient T f2921q;

    public s4(r4<T> r4Var) {
        this.f2919o = r4Var;
    }

    public final String toString() {
        Object obj;
        if (this.f2920p) {
            String valueOf = String.valueOf(this.f2921q);
            obj = x0.f(new StringBuilder(valueOf.length() + 25), "<supplier that returned ", valueOf, ">");
        } else {
            obj = this.f2919o;
        }
        String valueOf2 = String.valueOf(obj);
        return x0.f(new StringBuilder(valueOf2.length() + 19), "Suppliers.memoize(", valueOf2, ")");
    }

    public final T zza() {
        if (!this.f2920p) {
            synchronized (this) {
                if (!this.f2920p) {
                    T zza = this.f2919o.zza();
                    this.f2921q = zza;
                    this.f2920p = true;
                    return zza;
                }
            }
        }
        return this.f2921q;
    }
}

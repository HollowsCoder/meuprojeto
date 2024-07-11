package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.x0;
import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class u4<T> implements Serializable, r4 {
    @NullableDecl

    /* renamed from: o  reason: collision with root package name */
    public final T f2951o;

    public u4(@NullableDecl T t10) {
        this.f2951o = t10;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof u4)) {
            return false;
        }
        T t10 = ((u4) obj).f2951o;
        T t11 = this.f2951o;
        return t11 == t10 || t11.equals(t10);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2951o});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f2951o);
        return x0.f(new StringBuilder(valueOf.length() + 22), "Suppliers.ofInstance(", valueOf, ")");
    }

    public final T zza() {
        return this.f2951o;
    }
}

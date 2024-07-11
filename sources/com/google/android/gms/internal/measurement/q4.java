package com.google.android.gms.internal.measurement;

import androidx.appcompat.widget.x0;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class q4<T> extends p4<T> {

    /* renamed from: o  reason: collision with root package name */
    public final T f2891o;

    public q4(T t10) {
        this.f2891o = t10;
    }

    public final boolean a() {
        return true;
    }

    public final T b() {
        return this.f2891o;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof q4) {
            return this.f2891o.equals(((q4) obj).f2891o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2891o.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f2891o);
        return x0.f(new StringBuilder(valueOf.length() + 13), "Optional.of(", valueOf, ")");
    }
}

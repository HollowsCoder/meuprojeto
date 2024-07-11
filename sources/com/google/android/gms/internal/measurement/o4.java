package com.google.android.gms.internal.measurement;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class o4<T> extends p4<T> {

    /* renamed from: o  reason: collision with root package name */
    public static final o4<Object> f2858o = new o4<>();

    public final boolean a() {
        return false;
    }

    public final T b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final boolean equals(@NullableDecl Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}

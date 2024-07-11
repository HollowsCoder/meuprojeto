package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import k4.j;
import n4.m;
import o4.a;
import o4.c;

public final class Scope extends a implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<Scope> CREATOR = new j();

    /* renamed from: o  reason: collision with root package name */
    public final int f2318o;

    /* renamed from: p  reason: collision with root package name */
    public final String f2319p;

    public Scope() {
        throw null;
    }

    public Scope(String str, int i10) {
        m.f("scopeUri must not be null or empty", str);
        this.f2318o = i10;
        this.f2319p = str;
    }

    @RecentlyNonNull
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f2319p.equals(((Scope) obj).f2319p);
    }

    @RecentlyNonNull
    public final int hashCode() {
        return this.f2319p.hashCode();
    }

    @RecentlyNonNull
    public final String toString() {
        return this.f2319p;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int i10) {
        int h10 = c.h(parcel, 20293);
        c.i(parcel, 1, 4);
        parcel.writeInt(this.f2318o);
        c.f(parcel, 2, this.f2319p);
        c.k(parcel, h10);
    }
}

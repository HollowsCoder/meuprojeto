package com.google.android.gms.internal.measurement;

import android.net.Uri;

public final class k4 {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f2769a;

    public k4(Uri uri) {
        this.f2769a = uri;
    }

    public final h4 a(String str, long j8) {
        return new h4(this, str, Long.valueOf(j8), 0);
    }

    public final i4 b(String str, boolean z) {
        return new i4(this, str, Boolean.valueOf(z));
    }

    public final h4 c(String str, String str2) {
        return new h4(this, str, str2, 1);
    }
}

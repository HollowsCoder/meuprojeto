package com.google.android.gms.internal.measurement;

import java.util.HashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f2621a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2622b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f2623c;

    public b(String str, long j8, HashMap hashMap) {
        this.f2621a = str;
        this.f2622b = j8;
        HashMap hashMap2 = new HashMap();
        this.f2623c = hashMap2;
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
    }

    /* renamed from: a */
    public final b clone() {
        return new b(this.f2621a, this.f2622b, new HashMap(this.f2623c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f2622b == bVar.f2622b && this.f2621a.equals(bVar.f2621a)) {
            return this.f2623c.equals(bVar.f2623c);
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f2622b;
        return this.f2623c.hashCode() + (((this.f2621a.hashCode() * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f2621a;
        String valueOf = String.valueOf(this.f2623c);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 55 + valueOf.length());
        sb.append("Event{name='");
        sb.append(str);
        sb.append("', timestamp=");
        sb.append(this.f2622b);
        sb.append(", params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}

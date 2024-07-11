package h5;

import android.os.Bundle;
import b0.d;

public final class h3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f5426a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5427b;

    /* renamed from: c  reason: collision with root package name */
    public final long f5428c;
    public final Bundle d;

    public h3(long j8, Bundle bundle, String str, String str2) {
        this.f5426a = str;
        this.f5427b = str2;
        this.d = bundle;
        this.f5428c = j8;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.d);
        String str = this.f5427b;
        int length = String.valueOf(str).length();
        String str2 = this.f5426a;
        StringBuilder sb = new StringBuilder(length + 21 + String.valueOf(str2).length() + valueOf.length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        return d.g(sb, ",params=", valueOf);
    }
}

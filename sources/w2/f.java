package w2;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import s6.a;

public final class f implements q2.f {

    /* renamed from: b  reason: collision with root package name */
    public final g f9171b;

    /* renamed from: c  reason: collision with root package name */
    public final URL f9172c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public String f9173e;

    /* renamed from: f  reason: collision with root package name */
    public URL f9174f;

    /* renamed from: g  reason: collision with root package name */
    public volatile byte[] f9175g;

    /* renamed from: h  reason: collision with root package name */
    public int f9176h;

    public f(String str) {
        i iVar = g.f9177a;
        this.f9172c = null;
        if (!TextUtils.isEmpty(str)) {
            this.d = str;
            a.n(iVar);
            this.f9171b = iVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public final void a(MessageDigest messageDigest) {
        if (this.f9175g == null) {
            this.f9175g = c().getBytes(q2.f.f8216a);
        }
        messageDigest.update(this.f9175g);
    }

    public final String c() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        URL url = this.f9172c;
        a.n(url);
        return url.toString();
    }

    public final URL d() {
        if (this.f9174f == null) {
            if (TextUtils.isEmpty(this.f9173e)) {
                String str = this.d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.f9172c;
                    a.n(url);
                    str = url.toString();
                }
                this.f9173e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f9174f = new URL(this.f9173e);
        }
        return this.f9174f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return c().equals(fVar.c()) && this.f9171b.equals(fVar.f9171b);
    }

    public final int hashCode() {
        if (this.f9176h == 0) {
            int hashCode = c().hashCode();
            this.f9176h = hashCode;
            this.f9176h = this.f9171b.hashCode() + (hashCode * 31);
        }
        return this.f9176h;
    }

    public final String toString() {
        return c();
    }

    public f(URL url) {
        i iVar = g.f9177a;
        a.n(url);
        this.f9172c = url;
        this.d = null;
        a.n(iVar);
        this.f9171b = iVar;
    }
}

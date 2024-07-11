package q2;

import android.text.TextUtils;
import b0.d;
import java.security.MessageDigest;

public final class g<T> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f8217e = new a();

    /* renamed from: a  reason: collision with root package name */
    public final T f8218a;

    /* renamed from: b  reason: collision with root package name */
    public final b<T> f8219b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8220c;
    public volatile byte[] d;

    public class a implements b<Object> {
        public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    public interface b<T> {
        void a(byte[] bArr, T t10, MessageDigest messageDigest);
    }

    public g(String str, T t10, b<T> bVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f8220c = str;
            this.f8218a = t10;
            this.f8219b = bVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static g a(Object obj, String str) {
        return new g(str, obj, f8217e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f8220c.equals(((g) obj).f8220c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8220c.hashCode();
    }

    public final String toString() {
        return d.g(new StringBuilder("Option{key='"), this.f8220c, "'}");
    }
}

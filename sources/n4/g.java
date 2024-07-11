package n4;

import android.net.Uri;
import java.util.Arrays;
import n4.b;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f7437a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static d0 f7438b;

    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final Uri f7439e = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

        /* renamed from: a  reason: collision with root package name */
        public final String f7440a;

        /* renamed from: b  reason: collision with root package name */
        public final String f7441b;

        /* renamed from: c  reason: collision with root package name */
        public final int f7442c;
        public final boolean d;

        public a(int i10, String str, String str2, boolean z) {
            m.e(str);
            this.f7440a = str;
            m.e(str2);
            this.f7441b = str2;
            this.f7442c = i10;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f7440a, aVar.f7440a) && l.a(this.f7441b, aVar.f7441b) && l.a((Object) null, (Object) null) && this.f7442c == aVar.f7442c && this.d == aVar.d;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f7440a, this.f7441b, null, Integer.valueOf(this.f7442c), Boolean.valueOf(this.d)});
        }

        public final String toString() {
            String str = this.f7440a;
            if (str != null) {
                return str;
            }
            m.h((Object) null);
            throw null;
        }
    }

    public abstract boolean a(a aVar, b.h hVar, String str);

    public abstract void b(a aVar, b.h hVar);
}

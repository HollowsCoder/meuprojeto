package w2;

import android.text.TextUtils;
import b0.d;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class i implements g {

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, List<h>> f9178b;

    /* renamed from: c  reason: collision with root package name */
    public volatile Map<String, String> f9179c;

    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final Map<String, List<h>> f9180b;

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, List<h>> f9181a = f9180b;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb = new StringBuilder(property.length());
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = property.charAt(i10);
                    if ((charAt <= 31 && charAt != 9) || charAt >= 127) {
                        charAt = '?';
                    }
                    sb.append(charAt);
                }
                property = sb.toString();
            }
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(property)));
            }
            f9180b = Collections.unmodifiableMap(hashMap);
        }
    }

    public static final class b implements h {

        /* renamed from: a  reason: collision with root package name */
        public final String f9182a;

        public b(String str) {
            this.f9182a = str;
        }

        public final String a() {
            return this.f9182a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f9182a.equals(((b) obj).f9182a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f9182a.hashCode();
        }

        public final String toString() {
            return d.g(new StringBuilder("StringHeaderFactory{value='"), this.f9182a, "'}");
        }
    }

    public i(Map<String, List<h>> map) {
        this.f9178b = Collections.unmodifiableMap(map);
    }

    public final Map<String, String> a() {
        if (this.f9179c == null) {
            synchronized (this) {
                if (this.f9179c == null) {
                    this.f9179c = Collections.unmodifiableMap(b());
                }
            }
        }
        return this.f9179c;
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f9178b.entrySet()) {
            List list = (List) next.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                String a10 = ((h) list.get(i10)).a();
                if (!TextUtils.isEmpty(a10)) {
                    sb.append(a10);
                    if (i10 != list.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                hashMap.put(next.getKey(), sb2);
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f9178b.equals(((i) obj).f9178b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9178b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f9178b + '}';
    }
}

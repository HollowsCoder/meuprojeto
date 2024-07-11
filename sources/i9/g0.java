package i9;

import z8.g;

public enum g0 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    
    public static final a Companion = null;
    private final String javaName;

    public static final class a {
        public static g0 a(String str) {
            g.f(str, "javaName");
            int hashCode = str.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                return g0.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                return g0.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                return g0.TLS_1_3;
                            }
                            break;
                    }
                } else if (str.equals("TLSv1")) {
                    return g0.TLS_1_0;
                }
            } else if (str.equals("SSLv3")) {
                return g0.SSL_3_0;
            }
            throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new a();
    }

    private g0(String str) {
        this.javaName = str;
    }

    public static final g0 forJavaName(String str) {
        Companion.getClass();
        return a.a(str);
    }

    /* renamed from: -deprecated_javaName  reason: not valid java name */
    public final String m18deprecated_javaName() {
        return this.javaName;
    }

    public final String javaName() {
        return this.javaName;
    }
}

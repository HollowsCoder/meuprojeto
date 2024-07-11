package i9;

import java.io.IOException;
import z8.g;

public enum w {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    
    public static final a Companion = null;
    /* access modifiers changed from: private */
    public final String protocol;

    public static final class a {
        public static w a(String str) {
            g.f(str, "protocol");
            w wVar = w.HTTP_1_0;
            if (!g.a(str, wVar.protocol)) {
                wVar = w.HTTP_1_1;
                if (!g.a(str, wVar.protocol)) {
                    wVar = w.H2_PRIOR_KNOWLEDGE;
                    if (!g.a(str, wVar.protocol)) {
                        wVar = w.HTTP_2;
                        if (!g.a(str, wVar.protocol)) {
                            wVar = w.SPDY_3;
                            if (!g.a(str, wVar.protocol)) {
                                wVar = w.QUIC;
                                if (!g.a(str, wVar.protocol)) {
                                    throw new IOException("Unexpected protocol: ".concat(str));
                                }
                            }
                        }
                    }
                }
            }
            return wVar;
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new a();
    }

    private w(String str) {
        this.protocol = str;
    }

    public static final w get(String str) {
        Companion.getClass();
        return a.a(str);
    }

    public String toString() {
        return this.protocol;
    }
}

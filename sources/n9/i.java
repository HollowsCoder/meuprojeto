package n9;

import com.karumi.dexter.BuildConfig;
import f9.h;
import i9.w;
import java.net.ProtocolException;
import z8.g;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final w f7519a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7520b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7521c;

    public static final class a {
        public static i a(String str) {
            int i10;
            w wVar;
            String str2;
            g.f(str, "statusLine");
            if (h.a0(str, "HTTP/1.", false)) {
                i10 = 9;
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    wVar = w.HTTP_1_0;
                } else if (charAt == 1) {
                    wVar = w.HTTP_1_1;
                } else {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
            } else if (h.a0(str, "ICY ", false)) {
                wVar = w.HTTP_1_0;
                i10 = 4;
            } else {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int i11 = i10 + 3;
            if (str.length() >= i11) {
                try {
                    String substring = str.substring(i10, i11);
                    g.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (str.length() <= i11) {
                        str2 = BuildConfig.FLAVOR;
                    } else if (str.charAt(i11) == ' ') {
                        str2 = str.substring(i10 + 4);
                        g.e(str2, "(this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                    return new i(wVar, parseInt, str2);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
            } else {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        }
    }

    public i(w wVar, int i10, String str) {
        g.f(wVar, "protocol");
        this.f7519a = wVar;
        this.f7520b = i10;
        this.f7521c = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7519a == w.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f7520b);
        sb.append(' ');
        sb.append(this.f7521c);
        String sb2 = sb.toString();
        g.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}

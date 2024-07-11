package f9;

import java.nio.charset.Charset;
import z8.g;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f4926a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f4927b;

    /* renamed from: c  reason: collision with root package name */
    public static Charset f4928c;
    public static Charset d;

    static {
        Charset forName = Charset.forName("UTF-8");
        g.e(forName, "forName(\"UTF-8\")");
        f4927b = forName;
        g.e(Charset.forName("UTF-16"), "forName(\"UTF-16\")");
        g.e(Charset.forName("UTF-16BE"), "forName(\"UTF-16BE\")");
        g.e(Charset.forName("UTF-16LE"), "forName(\"UTF-16LE\")");
        g.e(Charset.forName("US-ASCII"), "forName(\"US-ASCII\")");
        g.e(Charset.forName("ISO-8859-1"), "forName(\"ISO-8859-1\")");
    }
}

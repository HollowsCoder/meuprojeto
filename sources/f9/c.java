package f9;

import java.io.Serializable;
import java.util.regex.Pattern;
import z8.g;

public final class c implements Serializable {

    /* renamed from: o  reason: collision with root package name */
    public final Pattern f4938o;

    public c(String str) {
        Pattern compile = Pattern.compile(str);
        g.e(compile, "compile(pattern)");
        this.f4938o = compile;
    }

    public final String toString() {
        String pattern = this.f4938o.toString();
        g.e(pattern, "nativePattern.toString()");
        return pattern;
    }
}

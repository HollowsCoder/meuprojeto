package o8;

import java.util.Collection;
import p9.u;
import z8.g;

public class e extends u {
    public static final int u(Iterable iterable) {
        g.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}

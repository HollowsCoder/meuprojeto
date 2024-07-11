package s6;

import androidx.annotation.RecentlyNonNull;
import n4.m;

public class d extends Exception {
    @Deprecated
    public d() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(@RecentlyNonNull String str) {
        super(str);
        m.f("Detail message must not be empty", str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(@RecentlyNonNull String str, @RecentlyNonNull Exception exc) {
        super(str, exc);
        m.f("Detail message must not be empty", str);
    }
}

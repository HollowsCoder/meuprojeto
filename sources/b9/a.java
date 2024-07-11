package b9;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import z8.g;

public final class a extends a9.a {
    public final Random c() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        g.e(current, "current()");
        return current;
    }
}

package o8;

import java.util.ArrayList;
import java.util.Collection;

public class g extends f {
    public static final void v(Iterable iterable, ArrayList arrayList) {
        z8.g.f(iterable, "elements");
        if (iterable instanceof Collection) {
            arrayList.addAll((Collection) iterable);
            return;
        }
        for (Object add : iterable) {
            arrayList.add(add);
        }
    }
}

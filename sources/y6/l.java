package y6;

import a1.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class l extends c {

    /* renamed from: o  reason: collision with root package name */
    public final List<b<?>> f9585o;

    public l(ArrayList arrayList) {
        super("Dependency cycle detected: " + Arrays.toString(arrayList.toArray()));
        this.f9585o = arrayList;
    }
}

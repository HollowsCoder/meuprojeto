package d4;

import android.util.SparseArray;
import java.util.HashMap;
import q3.d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseArray<d> f4185a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap<d, Integer> f4186b;

    static {
        HashMap<d, Integer> hashMap = new HashMap<>();
        f4186b = hashMap;
        hashMap.put(d.DEFAULT, 0);
        hashMap.put(d.VERY_LOW, 1);
        hashMap.put(d.HIGHEST, 2);
        for (d next : hashMap.keySet()) {
            f4185a.append(f4186b.get(next).intValue(), next);
        }
    }

    public static int a(d dVar) {
        Integer num = f4186b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = f4185a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(b0.d.c("Unknown Priority for value ", i10));
    }
}

package g1;

import java.util.Comparator;

public final class a implements Comparator<int[]> {
    public final int compare(Object obj, Object obj2) {
        return ((int[]) obj)[0] - ((int[]) obj2)[0];
    }
}

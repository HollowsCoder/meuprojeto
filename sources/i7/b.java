package i7;

import java.io.File;
import java.util.Comparator;

public final /* synthetic */ class b implements Comparator {
    public final int compare(Object obj, Object obj2) {
        String name = ((File) obj).getName();
        int i10 = d.f6123e;
        return name.substring(0, i10).compareTo(((File) obj2).getName().substring(0, i10));
    }
}

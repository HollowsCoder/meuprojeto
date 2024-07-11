package d7;

import java.io.File;
import java.io.FilenameFilter;

public final /* synthetic */ class j implements FilenameFilter {
    public final boolean accept(File file, String str) {
        return str.startsWith(".ae");
    }
}

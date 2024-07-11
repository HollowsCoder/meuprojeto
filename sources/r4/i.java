package r4;

import androidx.annotation.RecentlyNonNull;
import java.util.regex.Pattern;

public final class i {
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    @RecentlyNonNull
    public static boolean a(String str) {
        return str == null || str.trim().isEmpty();
    }
}

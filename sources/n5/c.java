package n5;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.appcompat.widget.x0;

public final class c {
    @SuppressLint({"LogTagMismatch"})
    public static void a(@RecentlyNonNull Exception exc, @RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (Log.isLoggable("Vision", 6)) {
            boolean isLoggable = Log.isLoggable("Vision", 3);
            String format = String.format(str, objArr);
            if (isLoggable) {
                Log.e("Vision", format, exc);
                return;
            }
            String valueOf = String.valueOf(exc);
            StringBuilder sb = new StringBuilder(valueOf.length() + x0.a(format, 2));
            sb.append(format);
            sb.append(": ");
            sb.append(valueOf);
            Log.e("Vision", sb.toString());
        }
    }
}

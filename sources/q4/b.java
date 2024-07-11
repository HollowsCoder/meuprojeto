package q4;

import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import com.karumi.dexter.BuildConfig;

@Deprecated
public final class b {
    @RecentlyNonNull
    public static void a(@RecentlyNonNull PowerManager.WakeLock wakeLock, @RecentlyNonNull String str) {
        String valueOf = String.valueOf(String.valueOf((((long) Process.myPid()) << 32) | ((long) System.identityHashCode(wakeLock))));
        if (TextUtils.isEmpty(str)) {
            str = BuildConfig.FLAVOR;
        }
        String valueOf2 = String.valueOf(str);
        if (valueOf2.length() != 0) {
            valueOf.concat(valueOf2);
        }
    }
}

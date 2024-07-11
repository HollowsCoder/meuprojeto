package b8;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;

public final class z {

    /* renamed from: b  reason: collision with root package name */
    public static WeakReference<z> f2062b;

    /* renamed from: a  reason: collision with root package name */
    public w f2063a;

    public z(SharedPreferences sharedPreferences, ScheduledExecutorService scheduledExecutorService) {
    }

    public final synchronized y a() {
        String peek;
        y yVar;
        w wVar = this.f2063a;
        synchronized (wVar.d) {
            peek = wVar.d.peek();
        }
        Pattern pattern = y.d;
        if (!TextUtils.isEmpty(peek)) {
            String[] split = peek.split("!", -1);
            if (split.length == 2) {
                yVar = new y(split[0], split[1]);
            }
        }
        yVar = null;
        return yVar;
    }
}

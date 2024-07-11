package b8;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f2051a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2052b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2053c;
    public final ArrayDeque<String> d = new ArrayDeque<>();

    /* renamed from: e  reason: collision with root package name */
    public final Executor f2054e;

    public w(SharedPreferences sharedPreferences, Executor executor) {
        this.f2051a = sharedPreferences;
        this.f2052b = "topic_operation_queue";
        this.f2053c = ",";
        this.f2054e = executor;
    }

    public static w a(SharedPreferences sharedPreferences, Executor executor) {
        w wVar = new w(sharedPreferences, executor);
        synchronized (wVar.d) {
            wVar.d.clear();
            String string = wVar.f2051a.getString(wVar.f2052b, BuildConfig.FLAVOR);
            if (!TextUtils.isEmpty(string)) {
                if (string.contains(wVar.f2053c)) {
                    if (r1 == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : string.split(wVar.f2053c, -1)) {
                        if (!TextUtils.isEmpty(str)) {
                            wVar.d.add(str);
                        }
                    }
                }
            }
        }
        return wVar;
    }
}

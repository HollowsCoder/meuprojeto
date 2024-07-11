package t7;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static e f9029b;

    /* renamed from: c  reason: collision with root package name */
    public static final SimpleDateFormat f9030c = new SimpleDateFormat("dd/MM/yyyy z");

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f9031a;

    public e(Context context) {
        this.f9031a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
        context.getSharedPreferences("FirebaseAppHeartBeatStorage", 0);
    }

    public final synchronized boolean a(String str, long j8) {
        if (this.f9031a.contains(str)) {
            Date date = new Date(this.f9031a.getLong(str, -1));
            Date date2 = new Date(j8);
            SimpleDateFormat simpleDateFormat = f9030c;
            if (!(!simpleDateFormat.format(date).equals(simpleDateFormat.format(date2)))) {
                return false;
            }
            this.f9031a.edit().putLong(str, j8).apply();
            return true;
        }
        this.f9031a.edit().putLong(str, j8).apply();
        return true;
    }
}

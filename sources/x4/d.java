package x4;

import android.content.Context;
import android.content.SharedPreferences;
import d5.c;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static SharedPreferences f9492a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            if (f9492a == null) {
                f9492a = (SharedPreferences) c.a(new e(0, context));
            }
            sharedPreferences = f9492a;
        }
        return sharedPreferences;
    }
}

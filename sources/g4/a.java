package g4;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.locks.ReentrantLock;
import n4.m;

public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final ReentrantLock f4971c = new ReentrantLock();
    public static a d;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantLock f4972a = new ReentrantLock();

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f4973b;

    public a(Context context) {
        this.f4973b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @RecentlyNonNull
    public static a a(@RecentlyNonNull Context context) {
        m.h(context);
        ReentrantLock reentrantLock = f4971c;
        reentrantLock.lock();
        try {
            if (d == null) {
                d = new a(context.getApplicationContext());
            }
            return d;
        } finally {
            reentrantLock.unlock();
        }
    }
}

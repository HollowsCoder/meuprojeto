package x4;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

public final class b implements Callable<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f9486a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f9487b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Integer f9488c;

    public b(SharedPreferences sharedPreferences, String str, Integer num) {
        this.f9486a = sharedPreferences;
        this.f9487b = str;
        this.f9488c = num;
    }

    public final /* synthetic */ Object call() {
        return Integer.valueOf(this.f9486a.getInt(this.f9487b, this.f9488c.intValue()));
    }
}

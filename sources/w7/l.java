package w7;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import n.e;
import y7.a;

public final class l {

    /* renamed from: b  reason: collision with root package name */
    public static final long f9291b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f9292c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static l d;

    /* renamed from: a  reason: collision with root package name */
    public final e f9293a;

    public l(e eVar) {
        this.f9293a = eVar;
    }

    public static l a() {
        if (e.A == null) {
            e.A = new e(12);
        }
        e eVar = e.A;
        if (d == null) {
            d = new l(eVar);
        }
        return d;
    }

    public final boolean b(a aVar) {
        if (TextUtils.isEmpty(aVar.d)) {
            return true;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f9293a.getClass();
        if (aVar.f9607f + aVar.f9608g < timeUnit.toSeconds(System.currentTimeMillis()) + f9291b) {
            return true;
        }
        return false;
    }
}

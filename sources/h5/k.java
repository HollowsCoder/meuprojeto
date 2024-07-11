package h5;

import android.accounts.AccountManager;
import androidx.appcompat.widget.x0;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class k extends r4 {

    /* renamed from: q  reason: collision with root package name */
    public long f5494q;

    /* renamed from: r  reason: collision with root package name */
    public String f5495r;

    /* renamed from: s  reason: collision with root package name */
    public AccountManager f5496s;

    /* renamed from: t  reason: collision with root package name */
    public Boolean f5497t;
    public long u;

    public k(i4 i4Var) {
        super(i4Var);
    }

    public final boolean h() {
        Calendar instance = Calendar.getInstance();
        this.f5494q = TimeUnit.MINUTES.convert((long) (instance.get(16) + instance.get(15)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f5495r = x0.f(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }

    public final long k() {
        i();
        return this.f5494q;
    }

    public final String l() {
        i();
        return this.f5495r;
    }

    public final long m() {
        g();
        return this.u;
    }
}

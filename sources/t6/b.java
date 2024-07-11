package t6;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class b {

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f9017g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h  reason: collision with root package name */
    public static final SimpleDateFormat f9018h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a  reason: collision with root package name */
    public final String f9019a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9020b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9021c;
    public final Date d;

    /* renamed from: e  reason: collision with root package name */
    public final long f9022e;

    /* renamed from: f  reason: collision with root package name */
    public final long f9023f;

    public b(String str, String str2, String str3, Date date, long j8, long j10) {
        this.f9019a = str;
        this.f9020b = str2;
        this.f9021c = str3;
        this.d = date;
        this.f9022e = j8;
        this.f9023f = j10;
    }
}

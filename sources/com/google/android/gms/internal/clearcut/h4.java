package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import h4.a;
import i5.b;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import t4.c;

public final class h4 implements a.b {

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f2452b = Charset.forName("UTF-8");

    /* renamed from: c  reason: collision with root package name */
    public static final l f2453c;
    public static final l d = new l((String) null, b.a(), "gms:playlog:service:sampling_", "LogSampling__", false, false);

    /* renamed from: e  reason: collision with root package name */
    public static final ConcurrentHashMap<String, e<v3>> f2454e = new ConcurrentHashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public static final HashMap<String, e<String>> f2455f = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    public static Boolean f2456g = null;

    /* renamed from: h  reason: collision with root package name */
    public static Long f2457h = null;

    /* renamed from: i  reason: collision with root package name */
    public static final g f2458i;

    /* renamed from: a  reason: collision with root package name */
    public final Context f2459a;

    static {
        l lVar = new l((String) null, b.a(), "gms:playlog:service:samplingrules_", "LogSamplingRules__", false, false);
        f2453c = lVar;
        Object obj = e.f2401g;
        f2458i = new g(lVar, Boolean.FALSE);
    }

    public h4(Context context) {
        this.f2459a = context;
        if (context != null && e.f2402h == null) {
            synchronized (e.f2401g) {
                if (!context.isDeviceProtectedStorage()) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                }
                if (e.f2402h != context) {
                    e.f2403i = null;
                }
                e.f2402h = context;
            }
        }
    }

    public static long a(String str, long j8) {
        if (str == null || str.isEmpty()) {
            return androidx.databinding.a.v(ByteBuffer.allocate(8).putLong(j8).array());
        }
        byte[] bytes = str.getBytes(f2452b);
        ByteBuffer allocate = ByteBuffer.allocate(bytes.length + 8);
        allocate.put(bytes);
        allocate.putLong(j8);
        return androidx.databinding.a.v(allocate.array());
    }

    public static boolean b(long j8, long j10, long j11) {
        if (j10 < 0 || j11 <= 0) {
            return true;
        }
        if (j8 < 0) {
            j8 = ((j8 & Long.MAX_VALUE) % j11) + (Long.MAX_VALUE % j11) + 1;
        }
        return j8 % j11 < j10;
    }

    public static boolean c(Context context) {
        boolean z;
        if (f2456g == null) {
            if (c.a(context).f8994a.checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                z = true;
            } else {
                z = false;
            }
            f2456g = Boolean.valueOf(z);
        }
        return f2456g.booleanValue();
    }

    public static long d(Context context) {
        Object obj;
        if (f2457h == null) {
            long j8 = 0;
            if (context == null) {
                return 0;
            }
            if (c(context)) {
                ContentResolver contentResolver = context.getContentResolver();
                Uri uri = k4.f2477a;
                synchronized (k4.class) {
                    k4.b(contentResolver);
                    obj = k4.f2486k;
                }
                HashMap<String, Long> hashMap = k4.f2484i;
                long j10 = 0L;
                synchronized (k4.class) {
                    if (hashMap.containsKey("android_id")) {
                        Long l = hashMap.get("android_id");
                        if (l != null) {
                            j10 = l;
                        }
                    } else {
                        j10 = null;
                    }
                }
                Long l8 = j10;
                if (l8 != null) {
                    j8 = l8.longValue();
                } else {
                    String a10 = k4.a(contentResolver, "android_id");
                    if (a10 != null) {
                        try {
                            long parseLong = Long.parseLong(a10);
                            l8 = Long.valueOf(parseLong);
                            j8 = parseLong;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    synchronized (k4.class) {
                        if (obj == k4.f2486k) {
                            hashMap.put("android_id", l8);
                            k4.f2481f.remove("android_id");
                        }
                    }
                }
            }
            f2457h = Long.valueOf(j8);
        }
        return f2457h.longValue();
    }
}

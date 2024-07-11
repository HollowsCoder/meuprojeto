package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public final class y3 {

    /* renamed from: a  reason: collision with root package name */
    public static final Uri f2998a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f2999b = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f3000c = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    public static final AtomicBoolean d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    public static HashMap<String, String> f3001e;

    /* renamed from: f  reason: collision with root package name */
    public static final HashMap<String, Boolean> f3002f = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    public static final HashMap<String, Integer> f3003g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    public static final HashMap<String, Long> f3004h = new HashMap<>();

    /* renamed from: i  reason: collision with root package name */
    public static final HashMap<String, Float> f3005i = new HashMap<>();

    /* renamed from: j  reason: collision with root package name */
    public static Object f3006j;

    /* renamed from: k  reason: collision with root package name */
    public static final String[] f3007k = new String[0];

    static {
        Uri.parse("content://com.google.android.gsf.gservices/prefix");
    }
}

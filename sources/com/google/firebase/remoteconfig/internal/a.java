package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.internal.b;
import e8.f;
import e8.g;
import f8.d;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import v7.b;
import w7.e;

public final class a {

    /* renamed from: i  reason: collision with root package name */
    public static final long f3730i = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f3731j = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a  reason: collision with root package name */
    public final e f3732a;

    /* renamed from: b  reason: collision with root package name */
    public final b<w6.a> f3733b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f3734c;
    public final Random d;

    /* renamed from: e  reason: collision with root package name */
    public final d f3735e;

    /* renamed from: f  reason: collision with root package name */
    public final ConfigFetchHttpClient f3736f;

    /* renamed from: g  reason: collision with root package name */
    public final b f3737g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<String, String> f3738h;

    /* renamed from: com.google.firebase.remoteconfig.internal.a$a  reason: collision with other inner class name */
    public static class C0043a {

        /* renamed from: a  reason: collision with root package name */
        public final int f3739a;

        /* renamed from: b  reason: collision with root package name */
        public final f8.e f3740b;

        /* renamed from: c  reason: collision with root package name */
        public final String f3741c;

        public C0043a(int i10, f8.e eVar, String str) {
            this.f3739a = i10;
            this.f3740b = eVar;
            this.f3741c = str;
        }
    }

    public a(e eVar, b bVar, ExecutorService executorService, Random random, d dVar, ConfigFetchHttpClient configFetchHttpClient, b bVar2, HashMap hashMap) {
        this.f3732a = eVar;
        this.f3733b = bVar;
        this.f3734c = executorService;
        this.d = random;
        this.f3735e = dVar;
        this.f3736f = configFetchHttpClient;
        this.f3737g = bVar2;
        this.f3738h = hashMap;
    }

    public final C0043a a(String str, String str2, Date date) {
        boolean z;
        String str3;
        boolean z10 = false;
        try {
            C0043a fetch = this.f3736f.fetch(this.f3736f.b(), str, str2, b(), this.f3737g.f3743a.getString("last_fetch_etag", (String) null), this.f3738h, date);
            String str4 = fetch.f3741c;
            if (str4 != null) {
                b bVar = this.f3737g;
                synchronized (bVar.f3744b) {
                    bVar.f3743a.edit().putString("last_fetch_etag", str4).apply();
                }
            }
            this.f3737g.b(0, b.f3742e);
            return fetch;
        } catch (g e10) {
            int i10 = e10.f4526o;
            if (i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504) {
                z = true;
            } else {
                z = false;
            }
            b bVar2 = this.f3737g;
            if (z) {
                int i11 = bVar2.a().f3746a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = f3731j;
                long millis = timeUnit.toMillis((long) iArr[Math.min(i11, iArr.length) - 1]);
                bVar2.b(i11, new Date(date.getTime() + (millis / 2) + ((long) this.d.nextInt((int) millis))));
            }
            b.a a10 = bVar2.a();
            int i12 = e10.f4526o;
            if (a10.f3746a > 1 || i12 == 429) {
                z10 = true;
            }
            if (!z10) {
                if (i12 == 401) {
                    str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
                } else if (i12 == 403) {
                    str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
                } else if (i12 == 429) {
                    throw new e8.d("The throttled response from the server was not handled correctly by the FRC SDK.");
                } else if (i12 != 500) {
                    switch (i12) {
                        case 502:
                        case 503:
                        case 504:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
                throw new g(e10.f4526o, "Fetch failed: ".concat(str3), e10);
            }
            a10.f3747b.getTime();
            throw new f();
        }
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        w6.a aVar = this.f3733b.get();
        if (aVar == null) {
            return hashMap;
        }
        for (Map.Entry entry : aVar.c().entrySet()) {
            hashMap.put((String) entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }
}

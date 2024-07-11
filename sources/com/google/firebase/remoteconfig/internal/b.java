package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import java.util.Date;

public final class b {
    public static final Date d = new Date(-1);

    /* renamed from: e  reason: collision with root package name */
    public static final Date f3742e = new Date(-1);

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f3743a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3744b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final Object f3745c = new Object();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f3746a;

        /* renamed from: b  reason: collision with root package name */
        public final Date f3747b;

        public a(int i10, Date date) {
            this.f3746a = i10;
            this.f3747b = date;
        }
    }

    public b(SharedPreferences sharedPreferences) {
        this.f3743a = sharedPreferences;
    }

    public final a a() {
        a aVar;
        synchronized (this.f3745c) {
            aVar = new a(this.f3743a.getInt("num_failed_fetches", 0), new Date(this.f3743a.getLong("backoff_end_time_in_millis", -1)));
        }
        return aVar;
    }

    public final void b(int i10, Date date) {
        synchronized (this.f3745c) {
            this.f3743a.edit().putInt("num_failed_fetches", i10).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}

package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference<a0> f3403a = new AtomicReference<>();

    public static long a(long j8) {
        Calendar d = d((Calendar) null);
        d.setTimeInMillis(j8);
        return b(d).getTimeInMillis();
    }

    public static Calendar b(Calendar calendar) {
        Calendar d = d(calendar);
        Calendar d10 = d((Calendar) null);
        d10.set(d.get(1), d.get(2), d.get(5));
        return d10;
    }

    public static Calendar c() {
        Calendar calendar;
        a0 a0Var = f3403a.get();
        if (a0Var == null) {
            a0Var = a0.f3395c;
        }
        TimeZone timeZone = a0Var.f3397b;
        if (timeZone == null) {
            calendar = Calendar.getInstance();
        } else {
            calendar = Calendar.getInstance(timeZone);
        }
        Long l = a0Var.f3396a;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    public static Calendar d(Calendar calendar) {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }
}

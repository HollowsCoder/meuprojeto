package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;

public final class s implements Comparable<s>, Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new a();

    /* renamed from: o  reason: collision with root package name */
    public final Calendar f3452o;

    /* renamed from: p  reason: collision with root package name */
    public final int f3453p;

    /* renamed from: q  reason: collision with root package name */
    public final int f3454q;

    /* renamed from: r  reason: collision with root package name */
    public final int f3455r;

    /* renamed from: s  reason: collision with root package name */
    public final int f3456s;

    /* renamed from: t  reason: collision with root package name */
    public final long f3457t;
    public String u;

    public static class a implements Parcelable.Creator<s> {
        public final Object createFromParcel(Parcel parcel) {
            return s.g(parcel.readInt(), parcel.readInt());
        }

        public final Object[] newArray(int i10) {
            return new s[i10];
        }
    }

    public s(Calendar calendar) {
        calendar.set(5, 1);
        Calendar b10 = b0.b(calendar);
        this.f3452o = b10;
        this.f3453p = b10.get(2);
        this.f3454q = b10.get(1);
        this.f3455r = b10.getMaximum(7);
        this.f3456s = b10.getActualMaximum(5);
        this.f3457t = b10.getTimeInMillis();
    }

    public static s g(int i10, int i11) {
        Calendar d = b0.d((Calendar) null);
        d.set(1, i10);
        d.set(2, i11);
        return new s(d);
    }

    public static s i(long j8) {
        Calendar d = b0.d((Calendar) null);
        d.setTimeInMillis(j8);
        return new s(d);
    }

    public final int compareTo(Object obj) {
        return this.f3452o.compareTo(((s) obj).f3452o);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f3453p == sVar.f3453p && this.f3454q == sVar.f3454q;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3453p), Integer.valueOf(this.f3454q)});
    }

    public final int k() {
        Calendar calendar = this.f3452o;
        int firstDayOfWeek = calendar.get(7) - calendar.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f3455r : firstDayOfWeek;
    }

    public final String l(Context context) {
        if (this.u == null) {
            long timeInMillis = this.f3452o.getTimeInMillis();
            this.u = DateUtils.formatDateTime(context, timeInMillis - ((long) TimeZone.getDefault().getOffset(timeInMillis)), 36);
        }
        return this.u;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f3454q);
        parcel.writeInt(this.f3453p);
    }
}

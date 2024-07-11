package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Objects;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0034a();

    /* renamed from: o  reason: collision with root package name */
    public final s f3384o;

    /* renamed from: p  reason: collision with root package name */
    public final s f3385p;

    /* renamed from: q  reason: collision with root package name */
    public final c f3386q;

    /* renamed from: r  reason: collision with root package name */
    public final s f3387r;

    /* renamed from: s  reason: collision with root package name */
    public final int f3388s;

    /* renamed from: t  reason: collision with root package name */
    public final int f3389t;

    /* renamed from: com.google.android.material.datepicker.a$a  reason: collision with other inner class name */
    public static class C0034a implements Parcelable.Creator<a> {
        public final Object createFromParcel(Parcel parcel) {
            Class<s> cls = s.class;
            return new a((s) parcel.readParcelable(cls.getClassLoader()), (s) parcel.readParcelable(cls.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (s) parcel.readParcelable(cls.getClassLoader()));
        }

        public final Object[] newArray(int i10) {
            return new a[i10];
        }
    }

    public static final class b {

        /* renamed from: e  reason: collision with root package name */
        public static final long f3390e = b0.a(s.g(1900, 0).f3457t);

        /* renamed from: f  reason: collision with root package name */
        public static final long f3391f = b0.a(s.g(2100, 11).f3457t);

        /* renamed from: a  reason: collision with root package name */
        public final long f3392a = f3390e;

        /* renamed from: b  reason: collision with root package name */
        public final long f3393b = f3391f;

        /* renamed from: c  reason: collision with root package name */
        public Long f3394c;
        public final c d = new e(Long.MIN_VALUE);

        public b(a aVar) {
            this.f3392a = aVar.f3384o.f3457t;
            this.f3393b = aVar.f3385p.f3457t;
            this.f3394c = Long.valueOf(aVar.f3387r.f3457t);
            this.d = aVar.f3386q;
        }
    }

    public interface c extends Parcelable {
        boolean z(long j8);
    }

    public a(s sVar, s sVar2, c cVar, s sVar3) {
        this.f3384o = sVar;
        this.f3385p = sVar2;
        this.f3387r = sVar3;
        this.f3386q = cVar;
        if (sVar3 != null && sVar.f3452o.compareTo(sVar3.f3452o) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (sVar3 != null && sVar3.f3452o.compareTo(sVar2.f3452o) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        } else if (sVar.f3452o instanceof GregorianCalendar) {
            int i10 = sVar2.f3454q;
            int i11 = sVar.f3454q;
            this.f3389t = (sVar2.f3453p - sVar.f3453p) + ((i10 - i11) * 12) + 1;
            this.f3388s = (i10 - i11) + 1;
        } else {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f3384o.equals(aVar.f3384o) || !this.f3385p.equals(aVar.f3385p) || !Objects.equals(this.f3387r, aVar.f3387r) || !this.f3386q.equals(aVar.f3386q)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3384o, this.f3385p, this.f3387r, this.f3386q});
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f3384o, 0);
        parcel.writeParcelable(this.f3385p, 0);
        parcel.writeParcelable(this.f3387r, 0);
        parcel.writeParcelable(this.f3386q, 0);
    }
}

package h5;

import android.os.Parcel;
import android.os.Parcelable;
import n4.m;
import o4.a;

public final class c7 extends a {
    public static final Parcelable.Creator<c7> CREATOR = new d7();

    /* renamed from: o  reason: collision with root package name */
    public final int f5317o;

    /* renamed from: p  reason: collision with root package name */
    public final String f5318p;

    /* renamed from: q  reason: collision with root package name */
    public final long f5319q;

    /* renamed from: r  reason: collision with root package name */
    public final Long f5320r;

    /* renamed from: s  reason: collision with root package name */
    public final String f5321s;

    /* renamed from: t  reason: collision with root package name */
    public final String f5322t;
    public final Double u;

    public c7(int i10, String str, long j8, Long l, Float f10, String str2, String str3, Double d) {
        this.f5317o = i10;
        this.f5318p = str;
        this.f5319q = j8;
        this.f5320r = l;
        if (i10 == 1) {
            this.u = f10 != null ? Double.valueOf(f10.doubleValue()) : null;
        } else {
            this.u = d;
        }
        this.f5321s = str2;
        this.f5322t = str3;
    }

    public c7(long j8, Object obj, String str, String str2) {
        m.e(str);
        this.f5317o = 2;
        this.f5318p = str;
        this.f5319q = j8;
        this.f5322t = str2;
        if (obj == null) {
            this.f5320r = null;
            this.u = null;
            this.f5321s = null;
        } else if (obj instanceof Long) {
            this.f5320r = (Long) obj;
            this.u = null;
            this.f5321s = null;
        } else if (obj instanceof String) {
            this.f5320r = null;
            this.u = null;
            this.f5321s = (String) obj;
        } else if (obj instanceof Double) {
            this.f5320r = null;
            this.u = (Double) obj;
            this.f5321s = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    public c7(e7 e7Var) {
        this(e7Var.d, e7Var.f5365e, e7Var.f5364c, e7Var.f5363b);
    }

    public final Object g0() {
        Long l = this.f5320r;
        if (l != null) {
            return l;
        }
        Double d = this.u;
        if (d != null) {
            return d;
        }
        String str = this.f5321s;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        d7.a(this, parcel);
    }
}

package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j4.b;
import java.util.Arrays;
import k4.g;
import k4.k;
import n4.l;
import o4.a;
import o4.c;

public final class Status extends a implements g, ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<Status> CREATOR = new k();
    @RecentlyNonNull

    /* renamed from: t  reason: collision with root package name */
    public static final Status f2320t = new Status((String) null, 0);
    @RecentlyNonNull
    public static final Status u = new Status((String) null, 15);
    @RecentlyNonNull

    /* renamed from: v  reason: collision with root package name */
    public static final Status f2321v = new Status((String) null, 16);

    /* renamed from: o  reason: collision with root package name */
    public final int f2322o;

    /* renamed from: p  reason: collision with root package name */
    public final int f2323p;

    /* renamed from: q  reason: collision with root package name */
    public final String f2324q;

    /* renamed from: r  reason: collision with root package name */
    public final PendingIntent f2325r;

    /* renamed from: s  reason: collision with root package name */
    public final b f2326s;

    static {
        new Status((String) null, 14);
        new Status((String) null, 8);
        new Status((String) null, 17);
        new Status((String) null, 18);
    }

    public Status() {
        throw null;
    }

    public Status(int i10, int i11, String str, PendingIntent pendingIntent, b bVar) {
        this.f2322o = i10;
        this.f2323p = i11;
        this.f2324q = str;
        this.f2325r = pendingIntent;
        this.f2326s = bVar;
    }

    public Status(int i10, String str) {
        this(1, i10, str, (PendingIntent) null, (b) null);
    }

    public Status(String str, @RecentlyNonNull int i10) {
        this(i10, str);
    }

    @RecentlyNonNull
    public final Status J() {
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = (com.google.android.gms.common.api.Status) r4;
        r0 = r4.f2322o;
     */
    @androidx.annotation.RecentlyNonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.common.api.Status
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            com.google.android.gms.common.api.Status r4 = (com.google.android.gms.common.api.Status) r4
            int r0 = r4.f2322o
            int r2 = r3.f2322o
            if (r2 != r0) goto L_0x0034
            int r0 = r3.f2323p
            int r2 = r4.f2323p
            if (r0 != r2) goto L_0x0034
            java.lang.String r0 = r3.f2324q
            java.lang.String r2 = r4.f2324q
            boolean r0 = n4.l.a(r0, r2)
            if (r0 == 0) goto L_0x0034
            android.app.PendingIntent r0 = r3.f2325r
            android.app.PendingIntent r2 = r4.f2325r
            boolean r0 = n4.l.a(r0, r2)
            if (r0 == 0) goto L_0x0034
            j4.b r0 = r3.f2326s
            j4.b r4 = r4.f2326s
            boolean r4 = n4.l.a(r0, r4)
            if (r4 == 0) goto L_0x0034
            r4 = 1
            return r4
        L_0x0034:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.Status.equals(java.lang.Object):boolean");
    }

    @RecentlyNonNull
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2322o), Integer.valueOf(this.f2323p), this.f2324q, this.f2325r, this.f2326s});
    }

    @RecentlyNonNull
    public final String toString() {
        l.a aVar = new l.a(this);
        String str = this.f2324q;
        if (str == null) {
            int i10 = this.f2323p;
            switch (i10) {
                case -1:
                    str = "SUCCESS_CACHE";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str = "ERROR";
                    break;
                case 14:
                    str = "INTERRUPTED";
                    break;
                case 15:
                    str = "TIMEOUT";
                    break;
                case 16:
                    str = "CANCELED";
                    break;
                case 17:
                    str = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str = "DEAD_CLIENT";
                    break;
                case 19:
                    str = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
                default:
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("unknown status code: ");
                    sb.append(i10);
                    str = sb.toString();
                    break;
            }
        }
        aVar.a(str, "statusCode");
        aVar.a(this.f2325r, "resolution");
        return aVar.toString();
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int i10) {
        int h10 = c.h(parcel, 20293);
        c.i(parcel, 1, 4);
        parcel.writeInt(this.f2323p);
        c.f(parcel, 2, this.f2324q);
        c.e(parcel, 3, this.f2325r, i10);
        c.e(parcel, 4, this.f2326s, i10);
        c.i(parcel, 1000, 4);
        parcel.writeInt(this.f2322o);
        c.k(parcel, h10);
    }
}

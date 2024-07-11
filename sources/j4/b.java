package j4;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.Arrays;
import n4.l;
import o4.a;
import o4.c;

public final class b extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<b> CREATOR = new k();
    @RecentlyNonNull

    /* renamed from: s  reason: collision with root package name */
    public static final b f6533s = new b(0);

    /* renamed from: o  reason: collision with root package name */
    public final int f6534o;

    /* renamed from: p  reason: collision with root package name */
    public final int f6535p;

    /* renamed from: q  reason: collision with root package name */
    public final PendingIntent f6536q;

    /* renamed from: r  reason: collision with root package name */
    public final String f6537r;

    public b() {
        throw null;
    }

    public b(@RecentlyNonNull int i10) {
        this(1, i10, (PendingIntent) null, (String) null);
    }

    public b(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f6534o = i10;
        this.f6535p = i11;
        this.f6536q = pendingIntent;
        this.f6537r = str;
    }

    public static String g0(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i10);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (j4.b) r5;
        r1 = r5.f6535p;
     */
    @androidx.annotation.RecentlyNonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof j4.b
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            j4.b r5 = (j4.b) r5
            int r1 = r5.f6535p
            int r3 = r4.f6535p
            if (r3 != r1) goto L_0x0027
            android.app.PendingIntent r1 = r4.f6536q
            android.app.PendingIntent r3 = r5.f6536q
            boolean r1 = n4.l.a(r1, r3)
            if (r1 == 0) goto L_0x0027
            java.lang.String r1 = r4.f6537r
            java.lang.String r5 = r5.f6537r
            boolean r5 = n4.l.a(r1, r5)
            if (r5 == 0) goto L_0x0027
            return r0
        L_0x0027:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.b.equals(java.lang.Object):boolean");
    }

    @RecentlyNonNull
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6535p), this.f6536q, this.f6537r});
    }

    @RecentlyNonNull
    public final String toString() {
        l.a aVar = new l.a(this);
        aVar.a(g0(this.f6535p), "statusCode");
        aVar.a(this.f6536q, "resolution");
        aVar.a(this.f6537r, "message");
        return aVar.toString();
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int i10) {
        int h10 = c.h(parcel, 20293);
        c.i(parcel, 1, 4);
        parcel.writeInt(this.f6534o);
        c.i(parcel, 2, 4);
        parcel.writeInt(this.f6535p);
        c.e(parcel, 3, this.f6536q, i10);
        c.f(parcel, 4, this.f6537r);
        c.k(parcel, h10);
    }

    public b(@RecentlyNonNull int i10, PendingIntent pendingIntent) {
        this(1, i10, pendingIntent, (String) null);
    }
}

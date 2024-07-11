package h4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o4.a;
import o4.c;

public final class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new e();

    /* renamed from: o  reason: collision with root package name */
    public final boolean f5250o;

    /* renamed from: p  reason: collision with root package name */
    public final long f5251p;

    /* renamed from: q  reason: collision with root package name */
    public final long f5252q;

    public d(boolean z, long j8, long j10) {
        this.f5250o = z;
        this.f5251p = j8;
        this.f5252q = j10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        r8 = (h4.d) r8;
        r1 = r8.f5250o;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof h4.d
            r2 = 0
            if (r1 == 0) goto L_0x0022
            h4.d r8 = (h4.d) r8
            boolean r1 = r8.f5250o
            boolean r3 = r7.f5250o
            if (r3 != r1) goto L_0x0022
            long r3 = r7.f5251p
            long r5 = r8.f5251p
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0022
            long r3 = r7.f5252q
            long r5 = r8.f5252q
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x0022
            return r0
        L_0x0022:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f5250o), Long.valueOf(this.f5251p), Long.valueOf(this.f5252q)});
    }

    public final String toString() {
        return "CollectForDebugParcelable[skipPersistentStorage: " + this.f5250o + ",collectForDebugStartTimeMillis: " + this.f5251p + ",collectForDebugExpiryTimeMillis: " + this.f5252q + "]";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int h10 = c.h(parcel, 20293);
        c.i(parcel, 1, 4);
        parcel.writeInt(this.f5250o ? 1 : 0);
        c.i(parcel, 2, 8);
        parcel.writeLong(this.f5252q);
        c.i(parcel, 3, 8);
        parcel.writeLong(this.f5251p);
        c.k(parcel, h10);
    }
}

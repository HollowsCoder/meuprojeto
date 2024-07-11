package q5;

import android.os.IBinder;
import com.google.android.gms.internal.measurement.a0;

public final class l extends a0 implements j {
    public l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator", 1);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final q5.i z(u4.b r3, q5.h r4) {
        /*
            r2 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            java.lang.String r1 = r2.f2608b
            r0.writeInterfaceToken(r1)
            int r1 = com.google.android.gms.internal.vision.b.f3056a
            r0.writeStrongBinder(r3)
            r3 = 1
            r0.writeInt(r3)
            r1 = 0
            r4.writeToParcel(r0, r1)
            android.os.Parcel r3 = r2.K(r0, r3)
            android.os.IBinder r4 = r3.readStrongBinder()
            if (r4 != 0) goto L_0x0022
            r4 = 0
            goto L_0x0036
        L_0x0022:
            java.lang.String r0 = "com.google.android.gms.vision.face.internal.client.INativeFaceDetector"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof q5.i
            if (r1 == 0) goto L_0x0030
            r4 = r0
            q5.i r4 = (q5.i) r4
            goto L_0x0036
        L_0x0030:
            q5.k r0 = new q5.k
            r0.<init>(r4)
            r4 = r0
        L_0x0036:
            r3.recycle()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.l.z(u4.b, q5.h):q5.i");
    }
}

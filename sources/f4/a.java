package f4;

import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public final class a implements Parcelable.Creator<GoogleSignInAccount> {
    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r21) {
        /*
            r20 = this;
            r0 = r21
            int r1 = o4.b.o(r21)
            r2 = 0
            r3 = 0
            r4 = 0
            r7 = r2
            r8 = r3
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r16 = r13
            r17 = r16
            r18 = r17
            r19 = r18
            r14 = r4
        L_0x001a:
            int r2 = r21.dataPosition()
            if (r2 >= r1) goto L_0x0083
            int r2 = r21.readInt()
            r4 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r2
            switch(r4) {
                case 1: goto L_0x007e;
                case 2: goto L_0x0079;
                case 3: goto L_0x0074;
                case 4: goto L_0x006f;
                case 5: goto L_0x006a;
                case 6: goto L_0x0060;
                case 7: goto L_0x005b;
                case 8: goto L_0x0056;
                case 9: goto L_0x0051;
                case 10: goto L_0x0039;
                case 11: goto L_0x0034;
                case 12: goto L_0x002f;
                default: goto L_0x002b;
            }
        L_0x002b:
            o4.b.n(r0, r2)
            goto L_0x001a
        L_0x002f:
            java.lang.String r19 = o4.b.e(r0, r2)
            goto L_0x001a
        L_0x0034:
            java.lang.String r18 = o4.b.e(r0, r2)
            goto L_0x001a
        L_0x0039:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r4 = com.google.android.gms.common.api.Scope.CREATOR
            int r2 = o4.b.m(r0, r2)
            int r5 = r21.dataPosition()
            if (r2 != 0) goto L_0x0048
            r17 = r3
            goto L_0x001a
        L_0x0048:
            java.util.ArrayList r17 = r0.createTypedArrayList(r4)
            int r5 = r5 + r2
            r0.setDataPosition(r5)
            goto L_0x001a
        L_0x0051:
            java.lang.String r16 = o4.b.e(r0, r2)
            goto L_0x001a
        L_0x0056:
            long r14 = o4.b.l(r0, r2)
            goto L_0x001a
        L_0x005b:
            java.lang.String r13 = o4.b.e(r0, r2)
            goto L_0x001a
        L_0x0060:
            android.os.Parcelable$Creator r4 = android.net.Uri.CREATOR
            android.os.Parcelable r2 = o4.b.d(r0, r2, r4)
            r12 = r2
            android.net.Uri r12 = (android.net.Uri) r12
            goto L_0x001a
        L_0x006a:
            java.lang.String r11 = o4.b.e(r0, r2)
            goto L_0x001a
        L_0x006f:
            java.lang.String r10 = o4.b.e(r0, r2)
            goto L_0x001a
        L_0x0074:
            java.lang.String r9 = o4.b.e(r0, r2)
            goto L_0x001a
        L_0x0079:
            java.lang.String r8 = o4.b.e(r0, r2)
            goto L_0x001a
        L_0x007e:
            int r7 = o4.b.k(r0, r2)
            goto L_0x001a
        L_0x0083:
            o4.b.g(r0, r1)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r0 = new com.google.android.gms.auth.api.signin.GoogleSignInAccount
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.a.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}

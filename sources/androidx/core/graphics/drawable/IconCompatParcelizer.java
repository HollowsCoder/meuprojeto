package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import e1.a;
import java.nio.charset.Charset;

public class IconCompatParcelizer {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.core.graphics.drawable.IconCompat read(e1.a r5) {
        /*
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r0.<init>()
            int r1 = r0.f971a
            r2 = 1
            int r1 = r5.j(r1, r2)
            r0.f971a = r1
            byte[] r1 = r0.f973c
            r2 = 2
            boolean r3 = r5.h(r2)
            if (r3 != 0) goto L_0x0018
            goto L_0x001c
        L_0x0018:
            byte[] r1 = r5.f()
        L_0x001c:
            r0.f973c = r1
            android.os.Parcelable r1 = r0.d
            r3 = 3
            boolean r4 = r5.h(r3)
            if (r4 != 0) goto L_0x0028
            goto L_0x002c
        L_0x0028:
            android.os.Parcelable r1 = r5.k()
        L_0x002c:
            r0.d = r1
            int r1 = r0.f974e
            r4 = 4
            int r1 = r5.j(r1, r4)
            r0.f974e = r1
            int r1 = r0.f975f
            r4 = 5
            int r1 = r5.j(r1, r4)
            r0.f975f = r1
            android.content.res.ColorStateList r1 = r0.f976g
            r4 = 6
            boolean r4 = r5.h(r4)
            if (r4 != 0) goto L_0x004a
            goto L_0x004e
        L_0x004a:
            android.os.Parcelable r1 = r5.k()
        L_0x004e:
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            r0.f976g = r1
            java.lang.String r1 = r0.f978i
            r4 = 7
            boolean r4 = r5.h(r4)
            if (r4 != 0) goto L_0x005c
            goto L_0x0060
        L_0x005c:
            java.lang.String r1 = r5.l()
        L_0x0060:
            r0.f978i = r1
            java.lang.String r1 = r0.f979j
            r4 = 8
            boolean r4 = r5.h(r4)
            if (r4 != 0) goto L_0x006d
            goto L_0x0071
        L_0x006d:
            java.lang.String r1 = r5.l()
        L_0x0071:
            r0.f979j = r1
            java.lang.String r5 = r0.f978i
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.valueOf(r5)
            r0.f977h = r5
            int r5 = r0.f971a
            r1 = 0
            switch(r5) {
                case -1: goto L_0x00bb;
                case 0: goto L_0x0081;
                case 1: goto L_0x00aa;
                case 2: goto L_0x0087;
                case 3: goto L_0x0082;
                case 4: goto L_0x0087;
                case 5: goto L_0x00aa;
                case 6: goto L_0x0087;
                default: goto L_0x0081;
            }
        L_0x0081:
            goto L_0x00ca
        L_0x0082:
            byte[] r5 = r0.f973c
            r0.f972b = r5
            goto L_0x00ca
        L_0x0087:
            java.lang.String r5 = new java.lang.String
            byte[] r3 = r0.f973c
            java.lang.String r4 = "UTF-16"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)
            r5.<init>(r3, r4)
            r0.f972b = r5
            int r3 = r0.f971a
            if (r3 != r2) goto L_0x00ca
            java.lang.String r2 = r0.f979j
            if (r2 != 0) goto L_0x00ca
            java.lang.String r2 = ":"
            r3 = -1
            java.lang.String[] r5 = r5.split(r2, r3)
            r5 = r5[r1]
            r0.f979j = r5
            goto L_0x00ca
        L_0x00aa:
            android.os.Parcelable r5 = r0.d
            if (r5 == 0) goto L_0x00af
            goto L_0x00bf
        L_0x00af:
            byte[] r5 = r0.f973c
            r0.f972b = r5
            r0.f971a = r3
            r0.f974e = r1
            int r5 = r5.length
            r0.f975f = r5
            goto L_0x00ca
        L_0x00bb:
            android.os.Parcelable r5 = r0.d
            if (r5 == 0) goto L_0x00c2
        L_0x00bf:
            r0.f972b = r5
            goto L_0x00ca
        L_0x00c2:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid icon"
            r5.<init>(r0)
            throw r5
        L_0x00ca:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompatParcelizer.read(e1.a):androidx.core.graphics.drawable.IconCompat");
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f978i = iconCompat.f977h.name();
        switch (iconCompat.f971a) {
            case -1:
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.f972b;
                break;
            case 2:
                iconCompat.f973c = ((String) iconCompat.f972b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f973c = (byte[]) iconCompat.f972b;
                break;
            case 4:
            case 6:
                iconCompat.f973c = iconCompat.f972b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i10 = iconCompat.f971a;
        if (-1 != i10) {
            aVar.s(i10, 1);
        }
        byte[] bArr = iconCompat.f973c;
        if (bArr != null) {
            aVar.n(2);
            aVar.p(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            aVar.n(3);
            aVar.t(parcelable);
        }
        int i11 = iconCompat.f974e;
        if (i11 != 0) {
            aVar.s(i11, 4);
        }
        int i12 = iconCompat.f975f;
        if (i12 != 0) {
            aVar.s(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f976g;
        if (colorStateList != null) {
            aVar.n(6);
            aVar.t(colorStateList);
        }
        String str = iconCompat.f978i;
        if (str != null) {
            aVar.n(7);
            aVar.u(str);
        }
        String str2 = iconCompat.f979j;
        if (str2 != null) {
            aVar.n(8);
            aVar.u(str2);
        }
    }
}

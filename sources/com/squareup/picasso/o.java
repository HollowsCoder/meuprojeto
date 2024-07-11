package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;

public final class o extends f {

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f3966b = {"orientation"};

    public enum a {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);
        
        final int androidKind;
        final int height;
        final int width;

        private a(int i10, int i11, int i12) {
            this.androidKind = i10;
            this.width = i11;
            this.height = i12;
        }
    }

    public o(Context context) {
        super(context);
    }

    public final boolean b(w wVar) {
        Uri uri = wVar.f3999c;
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r2 != null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        if (r2 != null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.squareup.picasso.y.a e(com.squareup.picasso.w r17, int r18) {
        /*
            r16 = this;
            r0 = r17
            r7 = r16
            android.content.Context r1 = r7.f3942a
            android.content.ContentResolver r14 = r1.getContentResolver()
            android.net.Uri r9 = r0.f3999c
            r1 = 0
            r15 = 0
            java.lang.String[] r10 = f3966b     // Catch:{ RuntimeException -> 0x0037, all -> 0x0030 }
            r11 = 0
            r12 = 0
            r13 = 0
            r8 = r14
            android.database.Cursor r2 = r8.query(r9, r10, r11, r12, r13)     // Catch:{ RuntimeException -> 0x0037, all -> 0x0030 }
            if (r2 == 0) goto L_0x002d
            boolean r3 = r2.moveToFirst()     // Catch:{ RuntimeException -> 0x0038, all -> 0x002a }
            if (r3 != 0) goto L_0x0021
            goto L_0x002d
        L_0x0021:
            int r3 = r2.getInt(r1)     // Catch:{ RuntimeException -> 0x0038, all -> 0x002a }
            r2.close()
            r8 = r3
            goto L_0x003e
        L_0x002a:
            r0 = move-exception
            r15 = r2
            goto L_0x0031
        L_0x002d:
            if (r2 == 0) goto L_0x003d
            goto L_0x003a
        L_0x0030:
            r0 = move-exception
        L_0x0031:
            if (r15 == 0) goto L_0x0036
            r15.close()
        L_0x0036:
            throw r0
        L_0x0037:
            r2 = r15
        L_0x0038:
            if (r2 == 0) goto L_0x003d
        L_0x003a:
            r2.close()
        L_0x003d:
            r8 = r1
        L_0x003e:
            android.net.Uri r2 = r0.f3999c
            java.lang.String r3 = r14.getType(r2)
            r9 = 1
            if (r3 == 0) goto L_0x0051
            java.lang.String r4 = "video/"
            boolean r3 = r3.startsWith(r4)
            if (r3 == 0) goto L_0x0051
            r10 = r9
            goto L_0x0052
        L_0x0051:
            r10 = r1
        L_0x0052:
            boolean r1 = r17.a()
            if (r1 == 0) goto L_0x00c3
            com.squareup.picasso.o$a r1 = com.squareup.picasso.o.a.MICRO
            int r3 = r1.width
            int r4 = r0.f4001f
            int r5 = r0.f4002g
            if (r4 > r3) goto L_0x0067
            int r3 = r1.height
            if (r5 > r3) goto L_0x0067
            goto L_0x0071
        L_0x0067:
            com.squareup.picasso.o$a r1 = com.squareup.picasso.o.a.MINI
            int r3 = r1.width
            if (r4 > r3) goto L_0x0072
            int r3 = r1.height
            if (r5 > r3) goto L_0x0072
        L_0x0071:
            goto L_0x0074
        L_0x0072:
            com.squareup.picasso.o$a r1 = com.squareup.picasso.o.a.FULL
        L_0x0074:
            r11 = r1
            if (r10 != 0) goto L_0x008b
            com.squareup.picasso.o$a r1 = com.squareup.picasso.o.a.FULL
            if (r11 != r1) goto L_0x008b
            java.io.InputStream r0 = r16.g(r17)
            w9.p r0 = n.e.H(r0)
            com.squareup.picasso.y$a r1 = new com.squareup.picasso.y$a
            com.squareup.picasso.t$c r2 = com.squareup.picasso.t.c.DISK
            r1.<init>(r15, r0, r2, r8)
            return r1
        L_0x008b:
            long r12 = android.content.ContentUris.parseId(r2)
            android.graphics.BitmapFactory$Options r6 = com.squareup.picasso.y.c(r17)
            r6.inJustDecodeBounds = r9
            int r1 = r0.f4001f
            int r2 = r0.f4002g
            int r3 = r11.width
            int r4 = r11.height
            r5 = r6
            r9 = r6
            r6 = r17
            com.squareup.picasso.y.a(r1, r2, r3, r4, r5, r6)
            if (r10 == 0) goto L_0x00b3
            com.squareup.picasso.o$a r1 = com.squareup.picasso.o.a.FULL
            if (r11 != r1) goto L_0x00ac
            r1 = 1
            goto L_0x00ae
        L_0x00ac:
            int r1 = r11.androidKind
        L_0x00ae:
            android.graphics.Bitmap r1 = android.provider.MediaStore.Video.Thumbnails.getThumbnail(r14, r12, r1, r9)
            goto L_0x00b9
        L_0x00b3:
            int r1 = r11.androidKind
            android.graphics.Bitmap r1 = android.provider.MediaStore.Images.Thumbnails.getThumbnail(r14, r12, r1, r9)
        L_0x00b9:
            if (r1 == 0) goto L_0x00c3
            com.squareup.picasso.y$a r0 = new com.squareup.picasso.y$a
            com.squareup.picasso.t$c r2 = com.squareup.picasso.t.c.DISK
            r0.<init>(r1, r15, r2, r8)
            return r0
        L_0x00c3:
            java.io.InputStream r0 = r16.g(r17)
            w9.p r0 = n.e.H(r0)
            com.squareup.picasso.y$a r1 = new com.squareup.picasso.y$a
            com.squareup.picasso.t$c r2 = com.squareup.picasso.t.c.DISK
            r1.<init>(r15, r0, r2, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.o.e(com.squareup.picasso.w, int):com.squareup.picasso.y$a");
    }
}

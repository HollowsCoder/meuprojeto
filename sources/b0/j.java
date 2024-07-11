package b0;

import a0.c;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import f0.l;
import java.io.IOException;
import java.io.InputStream;

public final class j extends l {
    public final Typeface a(Context context, c.b bVar, Resources resources, int i10) {
        int i11;
        try {
            c.C0003c[] cVarArr = bVar.f13a;
            int length = cVarArr.length;
            int i12 = 0;
            FontFamily.Builder builder = null;
            int i13 = 0;
            while (true) {
                int i14 = 1;
                if (i13 >= length) {
                    break;
                }
                c.C0003c cVar = cVarArr[i13];
                try {
                    Font.Builder weight = new Font.Builder(resources, cVar.f18f).setWeight(cVar.f15b);
                    if (!cVar.f16c) {
                        i14 = 0;
                    }
                    Font build = weight.setSlant(i14).setTtcIndex(cVar.f17e).setFontVariationSettings(cVar.d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
                i13++;
            }
            if (builder == null) {
                return null;
            }
            if ((i10 & 1) != 0) {
                i11 = 700;
            } else {
                i11 = 400;
            }
            if ((i10 & 2) != 0) {
                i12 = 1;
            }
            return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i11, i12)).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0057, code lost:
        if (r4 != null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0059, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005e, code lost:
        if ((r13 & 1) == 0) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0060, code lost:
        r12 = 700;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0063, code lost:
        r12 = 400;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0067, code lost:
        if ((r13 & 2) == 0) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0069, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007e, code lost:
        return new android.graphics.Typeface.CustomFallbackBuilder(r4.build()).setStyle(new android.graphics.fonts.FontStyle(r12, r2)).build();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Typeface b(android.content.Context r11, f0.l[] r12, int r13) {
        /*
            r10 = this;
            android.content.ContentResolver r11 = r11.getContentResolver()
            r0 = 0
            int r1 = r12.length     // Catch:{ Exception -> 0x007f }
            r2 = 0
            r4 = r0
            r3 = r2
        L_0x0009:
            r5 = 1
            if (r3 >= r1) goto L_0x0057
            r6 = r12[r3]     // Catch:{ Exception -> 0x007f }
            android.net.Uri r7 = r6.f4578a     // Catch:{ IOException -> 0x0054 }
            java.lang.String r8 = "r"
            android.os.ParcelFileDescriptor r7 = r11.openFileDescriptor(r7, r8, r0)     // Catch:{ IOException -> 0x0054 }
            if (r7 != 0) goto L_0x001b
            if (r7 == 0) goto L_0x0054
            goto L_0x0046
        L_0x001b:
            android.graphics.fonts.Font$Builder r8 = new android.graphics.fonts.Font$Builder     // Catch:{ all -> 0x004a }
            r8.<init>(r7)     // Catch:{ all -> 0x004a }
            int r9 = r6.f4580c     // Catch:{ all -> 0x004a }
            android.graphics.fonts.Font$Builder r8 = r8.setWeight(r9)     // Catch:{ all -> 0x004a }
            boolean r9 = r6.d     // Catch:{ all -> 0x004a }
            if (r9 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r5 = r2
        L_0x002c:
            android.graphics.fonts.Font$Builder r5 = r8.setSlant(r5)     // Catch:{ all -> 0x004a }
            int r6 = r6.f4579b     // Catch:{ all -> 0x004a }
            android.graphics.fonts.Font$Builder r5 = r5.setTtcIndex(r6)     // Catch:{ all -> 0x004a }
            android.graphics.fonts.Font r5 = r5.build()     // Catch:{ all -> 0x004a }
            if (r4 != 0) goto L_0x0043
            android.graphics.fonts.FontFamily$Builder r6 = new android.graphics.fonts.FontFamily$Builder     // Catch:{ all -> 0x004a }
            r6.<init>(r5)     // Catch:{ all -> 0x004a }
            r4 = r6
            goto L_0x0046
        L_0x0043:
            r4.addFont(r5)     // Catch:{ all -> 0x004a }
        L_0x0046:
            r7.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0054
        L_0x004a:
            r5 = move-exception
            r7.close()     // Catch:{ all -> 0x004f }
            goto L_0x0053
        L_0x004f:
            r6 = move-exception
            r5.addSuppressed(r6)     // Catch:{ IOException -> 0x0054 }
        L_0x0053:
            throw r5     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            int r3 = r3 + 1
            goto L_0x0009
        L_0x0057:
            if (r4 != 0) goto L_0x005a
            return r0
        L_0x005a:
            android.graphics.fonts.FontStyle r11 = new android.graphics.fonts.FontStyle     // Catch:{ Exception -> 0x007f }
            r12 = r13 & 1
            if (r12 == 0) goto L_0x0063
            r12 = 700(0x2bc, float:9.81E-43)
            goto L_0x0065
        L_0x0063:
            r12 = 400(0x190, float:5.6E-43)
        L_0x0065:
            r13 = r13 & 2
            if (r13 == 0) goto L_0x006a
            r2 = r5
        L_0x006a:
            r11.<init>(r12, r2)     // Catch:{ Exception -> 0x007f }
            android.graphics.Typeface$CustomFallbackBuilder r12 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch:{ Exception -> 0x007f }
            android.graphics.fonts.FontFamily r13 = r4.build()     // Catch:{ Exception -> 0x007f }
            r12.<init>(r13)     // Catch:{ Exception -> 0x007f }
            android.graphics.Typeface$CustomFallbackBuilder r11 = r12.setStyle(r11)     // Catch:{ Exception -> 0x007f }
            android.graphics.Typeface r11 = r11.build()     // Catch:{ Exception -> 0x007f }
            return r11
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.j.b(android.content.Context, f0.l[], int):android.graphics.Typeface");
    }

    public final Typeface c(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public final Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        try {
            Font build = new Font.Builder(resources, i10).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    public final l f(int i10, l[] lVarArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}

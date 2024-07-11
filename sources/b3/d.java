package b3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import q2.h;
import q2.j;
import s2.w;

public final class d implements j<Uri, Drawable> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1954a;

    public d(Context context) {
        this.f1954a = context.getApplicationContext();
    }

    public final /* bridge */ /* synthetic */ w a(Object obj, int i10, int i11, h hVar) {
        return c((Uri) obj);
    }

    public final boolean b(Object obj, h hVar) {
        return ((Uri) obj).getScheme().equals("android.resource");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final s2.w c(android.net.Uri r8) {
        /*
            r7 = this;
            java.lang.String r0 = r8.getAuthority()
            android.content.Context r1 = r7.f1954a
            java.lang.String r2 = r1.getPackageName()
            boolean r2 = r0.equals(r2)
            r3 = 0
            if (r2 == 0) goto L_0x0012
            goto L_0x0022
        L_0x0012:
            android.content.Context r0 = r1.createPackageContext(r0, r3)     // Catch:{ NameNotFoundException -> 0x0017 }
            goto L_0x0023
        L_0x0017:
            r2 = move-exception
            java.lang.String r4 = r1.getPackageName()
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x009e
        L_0x0022:
            r0 = r1
        L_0x0023:
            java.util.List r2 = r8.getPathSegments()
            int r4 = r2.size()
            r5 = 2
            r6 = 1
            if (r4 != r5) goto L_0x0066
            java.util.List r2 = r8.getPathSegments()
            java.lang.String r4 = r8.getAuthority()
            java.lang.Object r3 = r2.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.get(r6)
            java.lang.String r2 = (java.lang.String) r2
            android.content.res.Resources r5 = r0.getResources()
            int r4 = r5.getIdentifier(r2, r3, r4)
            if (r4 != 0) goto L_0x0057
            android.content.res.Resources r4 = android.content.res.Resources.getSystem()
            java.lang.String r5 = "android"
            int r4 = r4.getIdentifier(r2, r3, r5)
        L_0x0057:
            if (r4 == 0) goto L_0x005a
            goto L_0x007c
        L_0x005a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed to find resource id for: "
            java.lang.String r8 = androidx.appcompat.widget.x0.d(r1, r8)
            r0.<init>(r8)
            throw r0
        L_0x0066:
            int r2 = r2.size()
            java.lang.String r4 = "Unrecognized Uri format: "
            if (r2 != r6) goto L_0x0094
            java.util.List r2 = r8.getPathSegments()
            java.lang.Object r2 = r2.get(r3)     // Catch:{ NumberFormatException -> 0x0089 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ NumberFormatException -> 0x0089 }
            int r4 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0089 }
        L_0x007c:
            r8 = 0
            android.graphics.drawable.Drawable r0 = b3.a.a(r1, r0, r4, r8)
            if (r0 == 0) goto L_0x0088
            b3.c r8 = new b3.c
            r8.<init>(r0)
        L_0x0088:
            return r8
        L_0x0089:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r8 = androidx.appcompat.widget.x0.d(r4, r8)
            r1.<init>(r8, r0)
            throw r1
        L_0x0094:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r8 = androidx.appcompat.widget.x0.d(r4, r8)
            r0.<init>(r8)
            throw r0
        L_0x009e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed to obtain context or unrecognized Uri format for: "
            java.lang.String r8 = androidx.appcompat.widget.x0.d(r1, r8)
            r0.<init>(r8, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.d.c(android.net.Uri):s2.w");
    }
}

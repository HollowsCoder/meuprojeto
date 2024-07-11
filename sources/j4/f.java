package j4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import n4.g0;
import r4.e;
import t4.c;

public class f {
    @RecentlyNonNull

    /* renamed from: a  reason: collision with root package name */
    public static final int f6546a = 12451000;

    /* renamed from: b  reason: collision with root package name */
    public static final f f6547b = new f();

    static {
        boolean z = h.f6549a;
    }

    @RecentlyNullable
    public Intent a(@RecentlyNonNull int i10, Context context, String str) {
        if (i10 == 1 || i10 == 2) {
            if (context == null || !e.a(context)) {
                StringBuilder sb = new StringBuilder("gcore_");
                sb.append(f6546a);
                sb.append("-");
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                }
                sb.append("-");
                if (context != null) {
                    sb.append(context.getPackageName());
                }
                sb.append("-");
                if (context != null) {
                    try {
                        sb.append(c.a(context).b(context.getPackageName(), 0).versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                String sb2 = sb.toString();
                int i11 = g0.f7443a;
                Intent intent = new Intent("android.intent.action.VIEW");
                Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
                if (!TextUtils.isEmpty(sb2)) {
                    appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
                }
                intent.setData(appendQueryParameter.build());
                intent.setPackage("com.android.vending");
                intent.addFlags(524288);
                return intent;
            }
            int i12 = g0.f7443a;
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else if (i10 != 3) {
            return null;
        } else {
            int i13 = g0.f7443a;
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", (String) null);
            Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent3.setData(fromParts);
            return intent3;
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0105  */
    @androidx.annotation.RecentlyNonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int b(@androidx.annotation.RecentlyNonNull android.content.Context r11, @androidx.annotation.RecentlyNonNull int r12) {
        /*
            r10 = this;
            boolean r0 = j4.h.f6549a
            android.content.res.Resources r0 = r11.getResources()     // Catch:{ all -> 0x000d }
            r1 = 2131886131(0x7f120033, float:1.9406832E38)
            r0.getString(r1)     // Catch:{ all -> 0x000d }
            goto L_0x0014
        L_0x000d:
            java.lang.String r0 = "GooglePlayServicesUtil"
            java.lang.String r1 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
            android.util.Log.e(r0, r1)
        L_0x0014:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r1 = r11.getPackageName()
            boolean r0 = r0.equals(r1)
            r1 = 1
            if (r0 != 0) goto L_0x0090
            java.util.concurrent.atomic.AtomicBoolean r0 = j4.h.d
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0090
            java.lang.Object r0 = n4.p0.f7458a
            monitor-enter(r0)
            boolean r2 = n4.p0.f7459b     // Catch:{ all -> 0x008d }
            if (r2 == 0) goto L_0x0031
            goto L_0x005c
        L_0x0031:
            n4.p0.f7459b = r1     // Catch:{ all -> 0x008d }
            java.lang.String r2 = r11.getPackageName()     // Catch:{ all -> 0x008d }
            t4.b r3 = t4.c.a(r11)     // Catch:{ all -> 0x008d }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r3.a(r2, r4)     // Catch:{ NameNotFoundException -> 0x0054 }
            android.os.Bundle r2 = r2.metaData     // Catch:{ NameNotFoundException -> 0x0054 }
            if (r2 != 0) goto L_0x0046
            goto L_0x005c
        L_0x0046:
            java.lang.String r3 = "com.google.app.id"
            r2.getString(r3)     // Catch:{ NameNotFoundException -> 0x0054 }
            java.lang.String r3 = "com.google.android.gms.version"
            int r2 = r2.getInt(r3)     // Catch:{ NameNotFoundException -> 0x0054 }
            n4.p0.f7460c = r2     // Catch:{ NameNotFoundException -> 0x0054 }
            goto L_0x005c
        L_0x0054:
            r2 = move-exception
            java.lang.String r3 = "MetadataValueReader"
            java.lang.String r4 = "This should never happen."
            android.util.Log.wtf(r3, r4, r2)     // Catch:{ all -> 0x008d }
        L_0x005c:
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            int r0 = n4.p0.f7460c
            if (r0 == 0) goto L_0x0085
            r2 = 12451000(0xbdfcb8, float:1.7447567E-38)
            if (r0 != r2) goto L_0x0067
            goto L_0x0090
        L_0x0067:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r1 = 320(0x140, float:4.48E-43)
            r12.<init>(r1)
            java.lang.String r1 = "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected 12451000 but found "
            r12.append(r1)
            r12.append(r0)
            java.lang.String r0 = ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x0085:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"
            r11.<init>(r12)
            throw r11
        L_0x008d:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            throw r11
        L_0x0090:
            boolean r0 = r4.e.a(r11)
            r2 = 0
            if (r0 != 0) goto L_0x00c7
            java.lang.Boolean r0 = r4.e.f8431c
            if (r0 != 0) goto L_0x00bd
            android.content.pm.PackageManager r0 = r11.getPackageManager()
            java.lang.String r3 = "android.hardware.type.iot"
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 != 0) goto L_0x00b6
            android.content.pm.PackageManager r0 = r11.getPackageManager()
            java.lang.String r3 = "android.hardware.type.embedded"
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 == 0) goto L_0x00b4
            goto L_0x00b6
        L_0x00b4:
            r0 = r2
            goto L_0x00b7
        L_0x00b6:
            r0 = r1
        L_0x00b7:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.e.f8431c = r0
        L_0x00bd:
            java.lang.Boolean r0 = r4.e.f8431c
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00c7
            r0 = r1
            goto L_0x00c8
        L_0x00c7:
            r0 = r2
        L_0x00c8:
            java.lang.String r3 = "com.google.android.gms"
            if (r12 < 0) goto L_0x00ce
            r4 = r1
            goto L_0x00cf
        L_0x00ce:
            r4 = r2
        L_0x00cf:
            n4.m.b(r4)
            java.lang.String r4 = r11.getPackageName()
            android.content.pm.PackageManager r5 = r11.getPackageManager()
            java.lang.String r6 = "GooglePlayServicesUtil"
            if (r0 == 0) goto L_0x00ee
            java.lang.String r7 = "com.android.vending"
            r8 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r7 = r5.getPackageInfo(r7, r8)     // Catch:{ NameNotFoundException -> 0x00e7 }
            goto L_0x00ef
        L_0x00e7:
            java.lang.String r12 = java.lang.String.valueOf(r4)
            java.lang.String r0 = " requires the Google Play Store, but it is missing."
            goto L_0x0124
        L_0x00ee:
            r7 = 0
        L_0x00ef:
            r8 = 64
            android.content.pm.PackageInfo r8 = r5.getPackageInfo(r3, r8)     // Catch:{ NameNotFoundException -> 0x018b }
            j4.i.a(r11)
            boolean r9 = j4.i.d(r8, r1)
            if (r9 != 0) goto L_0x0105
            java.lang.String r12 = java.lang.String.valueOf(r4)
            java.lang.String r0 = " requires Google Play services, but their signature is invalid."
            goto L_0x0124
        L_0x0105:
            if (r0 == 0) goto L_0x012f
            n4.m.h(r7)
            boolean r0 = j4.i.d(r7, r1)
            if (r0 == 0) goto L_0x011e
            android.content.pm.Signature[] r0 = r7.signatures
            r0 = r0[r2]
            android.content.pm.Signature[] r7 = r8.signatures
            r7 = r7[r2]
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x012f
        L_0x011e:
            java.lang.String r12 = java.lang.String.valueOf(r4)
            java.lang.String r0 = " requires Google Play Store, but its signature is invalid."
        L_0x0124:
            java.lang.String r12 = r12.concat(r0)
            android.util.Log.w(r6, r12)
            r12 = 9
            goto L_0x0199
        L_0x012f:
            int r0 = r8.versionCode
            r7 = -1
            if (r0 != r7) goto L_0x0136
            r9 = r7
            goto L_0x0138
        L_0x0136:
            int r9 = r0 / 1000
        L_0x0138:
            if (r12 != r7) goto L_0x013b
            goto L_0x013d
        L_0x013b:
            int r7 = r12 / 1000
        L_0x013d:
            if (r9 >= r7) goto L_0x016b
            r3 = 82
            int r3 = androidx.appcompat.widget.x0.a(r4, r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            java.lang.String r3 = "Google Play services out of date for "
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = ".  Requires "
            r5.append(r3)
            r5.append(r12)
            java.lang.String r12 = " but found "
            r5.append(r12)
            r5.append(r0)
            java.lang.String r12 = r5.toString()
            android.util.Log.w(r6, r12)
            r12 = 2
            goto L_0x0199
        L_0x016b:
            android.content.pm.ApplicationInfo r12 = r8.applicationInfo
            if (r12 != 0) goto L_0x0183
            android.content.pm.ApplicationInfo r12 = r5.getApplicationInfo(r3, r2)     // Catch:{ NameNotFoundException -> 0x0174 }
            goto L_0x0183
        L_0x0174:
            r12 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r3 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r0 = r0.concat(r3)
            android.util.Log.wtf(r6, r0, r12)
            goto L_0x0198
        L_0x0183:
            boolean r12 = r12.enabled
            if (r12 != 0) goto L_0x0189
            r12 = 3
            goto L_0x0199
        L_0x0189:
            r12 = r2
            goto L_0x0199
        L_0x018b:
            java.lang.String r12 = java.lang.String.valueOf(r4)
            java.lang.String r0 = " requires Google Play services, but they are missing."
            java.lang.String r12 = r12.concat(r0)
            android.util.Log.w(r6, r12)
        L_0x0198:
            r12 = r1
        L_0x0199:
            r0 = 18
            if (r12 != r0) goto L_0x019e
            goto L_0x01d7
        L_0x019e:
            if (r12 != r1) goto L_0x01d6
            android.content.pm.PackageManager r3 = r11.getPackageManager()     // Catch:{ Exception -> 0x01d6 }
            android.content.pm.PackageInstaller r3 = r3.getPackageInstaller()     // Catch:{ Exception -> 0x01d6 }
            java.util.List r3 = r3.getAllSessions()     // Catch:{ Exception -> 0x01d6 }
            java.util.Iterator r3 = r3.iterator()
        L_0x01b0:
            boolean r4 = r3.hasNext()
            java.lang.String r5 = "com.google.android.gms"
            if (r4 == 0) goto L_0x01c9
            java.lang.Object r4 = r3.next()
            android.content.pm.PackageInstaller$SessionInfo r4 = (android.content.pm.PackageInstaller.SessionInfo) r4
            java.lang.String r4 = r4.getAppPackageName()
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x01b0
            goto L_0x01d7
        L_0x01c9:
            android.content.pm.PackageManager r11 = r11.getPackageManager()
            r1 = 8192(0x2000, float:1.14794E-41)
            android.content.pm.ApplicationInfo r11 = r11.getApplicationInfo(r5, r1)     // Catch:{  }
            boolean r1 = r11.enabled     // Catch:{  }
            goto L_0x01d7
        L_0x01d6:
            r1 = r2
        L_0x01d7:
            if (r1 == 0) goto L_0x01da
            r12 = r0
        L_0x01da:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.f.b(android.content.Context, int):int");
    }
}

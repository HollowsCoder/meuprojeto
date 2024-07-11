package b8;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import x.j;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicInteger f1970a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: b8.a$a  reason: collision with other inner class name */
    public static class C0024a {

        /* renamed from: a  reason: collision with root package name */
        public final j f1971a;

        /* renamed from: b  reason: collision with root package name */
        public final String f1972b;

        public C0024a(j jVar, String str) {
            this.f1971a = jVar;
            this.f1972b = str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r2 != null) goto L_0x0027;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x030f A[SYNTHETIC, Splitter:B:123:0x030f] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0343 A[SYNTHETIC, Splitter:B:129:0x0343] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0365  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x036a  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0380  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03c3  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x03d4  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0407  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0416  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0442  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0454 A[SYNTHETIC, Splitter:B:173:0x0454] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0498  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x04a9 A[SYNTHETIC, Splitter:B:182:0x04a9] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x04ef  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x04ff  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0580  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x05a6  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x05b0  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x05b8  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x05cc  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0264  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static b8.a.C0024a a(android.content.Context r14, c1.r r15) {
        /*
            java.lang.String r0 = "Couldn't get own application info: "
            java.lang.String r1 = "FirebaseMessaging"
            android.content.pm.PackageManager r2 = r14.getPackageManager()
            java.lang.String r3 = r14.getPackageName()
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r3, r4)     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r2 == 0) goto L_0x0025
            android.os.Bundle r2 = r2.metaData     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r2 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0019:
            r2 = move-exception
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r0.concat(r2)
            android.util.Log.w(r1, r2)
        L_0x0025:
            android.os.Bundle r2 = android.os.Bundle.EMPTY
        L_0x0027:
            java.lang.String r3 = r14.getPackageName()
            java.lang.String r4 = "gcm.n.android_channel_id"
            java.lang.String r4 = r15.l(r4)
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 3
            r7 = 0
            r8 = 26
            if (r5 >= r8) goto L_0x003b
            goto L_0x00cd
        L_0x003b:
            android.content.pm.PackageManager r5 = r14.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00cd }
            java.lang.String r9 = r14.getPackageName()     // Catch:{ NameNotFoundException -> 0x00cd }
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo(r9, r7)     // Catch:{ NameNotFoundException -> 0x00cd }
            int r5 = r5.targetSdkVersion     // Catch:{ NameNotFoundException -> 0x00cd }
            if (r5 < r8) goto L_0x00cd
            java.lang.Class<android.app.NotificationManager> r5 = android.app.NotificationManager.class
            java.lang.Object r5 = r14.getSystemService(r5)
            android.app.NotificationManager r5 = (android.app.NotificationManager) r5
            boolean r8 = android.text.TextUtils.isEmpty(r4)
            if (r8 != 0) goto L_0x0083
            android.app.NotificationChannel r8 = r5.getNotificationChannel(r4)
            if (r8 == 0) goto L_0x0060
            goto L_0x00ce
        L_0x0060:
            java.lang.String r8 = java.lang.String.valueOf(r4)
            int r8 = r8.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r8 = r8 + 122
            r9.<init>(r8)
            java.lang.String r8 = "Notification Channel requested ("
            r9.append(r8)
            r9.append(r4)
            java.lang.String r4 = ") has not been created by the app. Manifest configuration, or default, value will be used."
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            android.util.Log.w(r1, r4)
        L_0x0083:
            java.lang.String r4 = "com.google.firebase.messaging.default_notification_channel_id"
            java.lang.String r4 = r2.getString(r4)
            boolean r8 = android.text.TextUtils.isEmpty(r4)
            if (r8 != 0) goto L_0x0099
            android.app.NotificationChannel r8 = r5.getNotificationChannel(r4)
            if (r8 == 0) goto L_0x0096
            goto L_0x00ce
        L_0x0096:
            java.lang.String r4 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used."
            goto L_0x009b
        L_0x0099:
            java.lang.String r4 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used."
        L_0x009b:
            android.util.Log.w(r1, r4)
            java.lang.String r4 = "fcm_fallback_notification_channel"
            android.app.NotificationChannel r8 = r5.getNotificationChannel(r4)
            if (r8 != 0) goto L_0x00ce
            android.content.res.Resources r8 = r14.getResources()
            java.lang.String r9 = r14.getPackageName()
            java.lang.String r10 = "fcm_fallback_notification_channel_label"
            java.lang.String r11 = "string"
            int r8 = r8.getIdentifier(r10, r11, r9)
            if (r8 != 0) goto L_0x00c0
            java.lang.String r8 = "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name."
            android.util.Log.e(r1, r8)
            java.lang.String r8 = "Misc"
            goto L_0x00c4
        L_0x00c0:
            java.lang.String r8 = r14.getString(r8)
        L_0x00c4:
            android.app.NotificationChannel r9 = new android.app.NotificationChannel
            r9.<init>(r4, r8, r6)
            r5.createNotificationChannel(r9)
            goto L_0x00ce
        L_0x00cd:
            r4 = 0
        L_0x00ce:
            android.content.res.Resources r5 = r14.getResources()
            android.content.pm.PackageManager r6 = r14.getPackageManager()
            x.j r8 = new x.j
            r8.<init>(r14, r4)
            java.lang.String r4 = "gcm.n.title"
            java.lang.String r4 = r15.k(r5, r3, r4)
            boolean r9 = android.text.TextUtils.isEmpty(r4)
            if (r9 != 0) goto L_0x00ed
            java.lang.CharSequence r4 = x.j.b(r4)
            r8.f9411e = r4
        L_0x00ed:
            java.lang.String r4 = "gcm.n.body"
            java.lang.String r4 = r15.k(r5, r3, r4)
            boolean r9 = android.text.TextUtils.isEmpty(r4)
            if (r9 != 0) goto L_0x010d
            java.lang.CharSequence r9 = x.j.b(r4)
            r8.f9412f = r9
            x.i r9 = new x.i
            r9.<init>()
            java.lang.CharSequence r4 = x.j.b(r4)
            r9.f9407b = r4
            r8.d(r9)
        L_0x010d:
            java.lang.String r4 = "gcm.n.icon"
            java.lang.String r4 = r15.l(r4)
            boolean r9 = android.text.TextUtils.isEmpty(r4)
            if (r9 != 0) goto L_0x0158
            java.lang.String r9 = "drawable"
            int r9 = r5.getIdentifier(r4, r9, r3)
            if (r9 == 0) goto L_0x0127
            boolean r10 = b(r5, r9)
            if (r10 != 0) goto L_0x0186
        L_0x0127:
            java.lang.String r9 = "mipmap"
            int r9 = r5.getIdentifier(r4, r9, r3)
            if (r9 == 0) goto L_0x0135
            boolean r10 = b(r5, r9)
            if (r10 != 0) goto L_0x0186
        L_0x0135:
            java.lang.String r9 = java.lang.String.valueOf(r4)
            int r9 = r9.length()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            int r9 = r9 + 61
            r10.<init>(r9)
            java.lang.String r9 = "Icon resource "
            r10.append(r9)
            r10.append(r4)
            java.lang.String r4 = " not found. Notification will use default icon."
            r10.append(r4)
            java.lang.String r4 = r10.toString()
            android.util.Log.w(r1, r4)
        L_0x0158:
            java.lang.String r4 = "com.google.firebase.messaging.default_notification_icon"
            int r4 = r2.getInt(r4, r7)
            if (r4 == 0) goto L_0x0166
            boolean r9 = b(r5, r4)
            if (r9 != 0) goto L_0x017a
        L_0x0166:
            android.content.pm.ApplicationInfo r9 = r6.getApplicationInfo(r3, r7)     // Catch:{ NameNotFoundException -> 0x016e }
            int r0 = r9.icon     // Catch:{ NameNotFoundException -> 0x016e }
            r9 = r0
            goto L_0x017b
        L_0x016e:
            r9 = move-exception
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = r0.concat(r9)
            android.util.Log.w(r1, r0)
        L_0x017a:
            r9 = r4
        L_0x017b:
            if (r9 == 0) goto L_0x0183
            boolean r0 = b(r5, r9)
            if (r0 != 0) goto L_0x0186
        L_0x0183:
            r9 = 17301651(0x1080093, float:2.4979667E-38)
        L_0x0186:
            android.app.Notification r0 = r8.f9424s
            r0.icon = r9
            java.lang.String r4 = "gcm.n.sound2"
            java.lang.String r4 = r15.l(r4)
            boolean r9 = android.text.TextUtils.isEmpty(r4)
            if (r9 == 0) goto L_0x019c
            java.lang.String r4 = "gcm.n.sound"
            java.lang.String r4 = r15.l(r4)
        L_0x019c:
            boolean r9 = android.text.TextUtils.isEmpty(r4)
            r10 = 2
            if (r9 == 0) goto L_0x01a5
            r4 = 0
            goto L_0x01ea
        L_0x01a5:
            java.lang.String r9 = "default"
            boolean r9 = r9.equals(r4)
            if (r9 != 0) goto L_0x01e6
            java.lang.String r9 = "raw"
            int r5 = r5.getIdentifier(r4, r9, r3)
            if (r5 == 0) goto L_0x01e6
            java.lang.String r5 = java.lang.String.valueOf(r3)
            int r5 = r5.length()
            java.lang.String r9 = java.lang.String.valueOf(r4)
            int r9 = r9.length()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            int r5 = r5 + 24
            int r5 = r5 + r9
            r10.<init>(r5)
            java.lang.String r5 = "android.resource://"
            r10.append(r5)
            r10.append(r3)
            java.lang.String r5 = "/raw/"
            r10.append(r5)
            r10.append(r4)
            java.lang.String r4 = r10.toString()
            android.net.Uri r4 = android.net.Uri.parse(r4)
            goto L_0x01ea
        L_0x01e6:
            android.net.Uri r4 = android.media.RingtoneManager.getDefaultUri(r10)
        L_0x01ea:
            r5 = -1
            r9 = 4
            if (r4 == 0) goto L_0x0206
            r0.sound = r4
            r0.audioStreamType = r5
            android.media.AudioAttributes$Builder r4 = new android.media.AudioAttributes$Builder
            r4.<init>()
            android.media.AudioAttributes$Builder r4 = r4.setContentType(r9)
            r5 = 5
            android.media.AudioAttributes$Builder r4 = r4.setUsage(r5)
            android.media.AudioAttributes r4 = r4.build()
            r0.audioAttributes = r4
        L_0x0206:
            java.lang.String r4 = "gcm.n.click_action"
            java.lang.String r4 = r15.l(r4)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x0220
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r4)
            r5.setPackage(r3)
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r5.setFlags(r3)
            goto L_0x0259
        L_0x0220:
            java.lang.String r4 = "gcm.n.link_android"
            java.lang.String r4 = r15.l(r4)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L_0x0232
            java.lang.String r4 = "gcm.n.link"
            java.lang.String r4 = r15.l(r4)
        L_0x0232:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x023d
            android.net.Uri r4 = android.net.Uri.parse(r4)
            goto L_0x023e
        L_0x023d:
            r4 = 0
        L_0x023e:
            if (r4 == 0) goto L_0x024e
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r6 = "android.intent.action.VIEW"
            r5.<init>(r6)
            r5.setPackage(r3)
            r5.setData(r4)
            goto L_0x0259
        L_0x024e:
            android.content.Intent r5 = r6.getLaunchIntentForPackage(r3)
            if (r5 != 0) goto L_0x0259
            java.lang.String r3 = "No activity found to launch app"
            android.util.Log.w(r1, r3)
        L_0x0259:
            java.util.concurrent.atomic.AtomicInteger r3 = f1970a
            r4 = 1
            r6 = 1140850688(0x44000000, float:512.0)
            java.lang.String r9 = "google.c.a.e"
            if (r5 != 0) goto L_0x0264
            r5 = 0
            goto L_0x02c6
        L_0x0264:
            r10 = 67108864(0x4000000, float:1.5046328E-36)
            r5.addFlags(r10)
            android.os.Bundle r10 = new android.os.Bundle
            java.lang.Object r11 = r15.f2129o
            android.os.Bundle r11 = (android.os.Bundle) r11
            r10.<init>(r11)
            java.lang.Object r11 = r15.f2129o
            android.os.Bundle r11 = (android.os.Bundle) r11
            java.util.Set r11 = r11.keySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x027e:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x02ac
            java.lang.Object r12 = r11.next()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r13 = "google.c."
            boolean r13 = r12.startsWith(r13)
            if (r13 != 0) goto L_0x02a5
            java.lang.String r13 = "gcm.n."
            boolean r13 = r12.startsWith(r13)
            if (r13 != 0) goto L_0x02a5
            java.lang.String r13 = "gcm.notification."
            boolean r13 = r12.startsWith(r13)
            if (r13 == 0) goto L_0x02a3
            goto L_0x02a5
        L_0x02a3:
            r13 = r7
            goto L_0x02a6
        L_0x02a5:
            r13 = r4
        L_0x02a6:
            if (r13 == 0) goto L_0x027e
            r10.remove(r12)
            goto L_0x027e
        L_0x02ac:
            r5.putExtras(r10)
            boolean r10 = r15.g(r9)
            if (r10 == 0) goto L_0x02be
            android.os.Bundle r10 = r15.n()
            java.lang.String r11 = "gcm.n.analytics_data"
            r5.putExtra(r11, r10)
        L_0x02be:
            int r10 = r3.incrementAndGet()
            android.app.PendingIntent r5 = android.app.PendingIntent.getActivity(r14, r10, r5, r6)
        L_0x02c6:
            r8.f9413g = r5
            boolean r5 = r15.g(r9)
            if (r5 != 0) goto L_0x02d0
            r3 = 0
            goto L_0x02ff
        L_0x02d0:
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r9 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            r5.<init>(r9)
            android.os.Bundle r9 = r15.n()
            android.content.Intent r5 = r5.putExtras(r9)
            int r3 = r3.incrementAndGet()
            android.content.Intent r9 = new android.content.Intent
            java.lang.String r10 = "com.google.firebase.MESSAGING_EVENT"
            r9.<init>(r10)
            android.content.ComponentName r10 = new android.content.ComponentName
            java.lang.String r11 = "com.google.firebase.iid.FirebaseInstanceIdReceiver"
            r10.<init>(r14, r11)
            android.content.Intent r9 = r9.setComponent(r10)
            java.lang.String r10 = "wrapped_intent"
            android.content.Intent r5 = r9.putExtra(r10, r5)
            android.app.PendingIntent r3 = android.app.PendingIntent.getBroadcast(r14, r3, r5, r6)
        L_0x02ff:
            if (r3 == 0) goto L_0x0303
            r0.deleteIntent = r3
        L_0x0303:
            java.lang.String r3 = "gcm.n.color"
            java.lang.String r3 = r15.l(r3)
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L_0x033b
            int r5 = android.graphics.Color.parseColor(r3)     // Catch:{ IllegalArgumentException -> 0x0318 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)     // Catch:{ IllegalArgumentException -> 0x0318 }
            goto L_0x0354
        L_0x0318:
            java.lang.String r5 = java.lang.String.valueOf(r3)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r5 = r5 + 56
            r6.<init>(r5)
            java.lang.String r5 = "Color is invalid: "
            r6.append(r5)
            r6.append(r3)
            java.lang.String r3 = ". Notification will use default color."
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            android.util.Log.w(r1, r3)
        L_0x033b:
            java.lang.String r3 = "com.google.firebase.messaging.default_notification_color"
            int r2 = r2.getInt(r3, r7)
            if (r2 == 0) goto L_0x0353
            java.lang.Object r3 = y.a.f9523a     // Catch:{ NotFoundException -> 0x034e }
            int r14 = y.a.d.a(r14, r2)     // Catch:{ NotFoundException -> 0x034e }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ NotFoundException -> 0x034e }
            goto L_0x0354
        L_0x034e:
            java.lang.String r14 = "Cannot find the color resource referenced in AndroidManifest."
            android.util.Log.w(r1, r14)
        L_0x0353:
            r14 = 0
        L_0x0354:
            if (r14 == 0) goto L_0x035c
            int r14 = r14.intValue()
            r8.f9420o = r14
        L_0x035c:
            java.lang.String r14 = "gcm.n.sticky"
            boolean r14 = r15.g(r14)
            r14 = r14 ^ r4
            if (r14 == 0) goto L_0x036a
            int r14 = r0.flags
            r14 = r14 | 16
            goto L_0x036e
        L_0x036a:
            int r14 = r0.flags
            r14 = r14 & -17
        L_0x036e:
            r0.flags = r14
            java.lang.String r14 = "gcm.n.local_only"
            boolean r14 = r15.g(r14)
            r8.f9418m = r14
            java.lang.String r14 = "gcm.n.ticker"
            java.lang.String r14 = r15.l(r14)
            if (r14 == 0) goto L_0x0386
            java.lang.CharSequence r14 = x.j.b(r14)
            r0.tickerText = r14
        L_0x0386:
            java.lang.String r14 = "gcm.n.notification_priority"
            java.lang.Integer r14 = r15.i(r14)
            r2 = -2
            if (r14 != 0) goto L_0x0390
            goto L_0x03c0
        L_0x0390:
            int r3 = r14.intValue()
            if (r3 < r2) goto L_0x039d
            int r3 = r14.intValue()
            r5 = 2
            if (r3 <= r5) goto L_0x03c1
        L_0x039d:
            java.lang.String r14 = r14.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r5 = r14.length()
            int r5 = r5 + 72
            r3.<init>(r5)
            java.lang.String r5 = "notificationPriority is invalid "
            r3.append(r5)
            r3.append(r14)
            java.lang.String r14 = ". Skipping setting notificationPriority."
            r3.append(r14)
            java.lang.String r14 = r3.toString()
            android.util.Log.w(r1, r14)
        L_0x03c0:
            r14 = 0
        L_0x03c1:
            if (r14 == 0) goto L_0x03c9
            int r14 = r14.intValue()
            r8.f9416j = r14
        L_0x03c9:
            java.lang.String r14 = "gcm.n.visibility"
            java.lang.Integer r14 = r15.i(r14)
            java.lang.String r3 = "NotificationParams"
            if (r14 != 0) goto L_0x03d4
            goto L_0x0404
        L_0x03d4:
            int r5 = r14.intValue()
            r6 = -1
            if (r5 < r6) goto L_0x03e1
            int r5 = r14.intValue()
            if (r5 <= r4) goto L_0x0405
        L_0x03e1:
            java.lang.String r14 = r14.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r6 = r14.length()
            int r6 = r6 + 53
            r5.<init>(r6)
            java.lang.String r6 = "visibility is invalid: "
            r5.append(r6)
            r5.append(r14)
            java.lang.String r14 = ". Skipping setting visibility."
            r5.append(r14)
            java.lang.String r14 = r5.toString()
            android.util.Log.w(r3, r14)
        L_0x0404:
            r14 = 0
        L_0x0405:
            if (r14 == 0) goto L_0x040d
            int r14 = r14.intValue()
            r8.f9421p = r14
        L_0x040d:
            java.lang.String r14 = "gcm.n.notification_count"
            java.lang.Integer r14 = r15.i(r14)
            if (r14 != 0) goto L_0x0416
            goto L_0x043f
        L_0x0416:
            int r5 = r14.intValue()
            if (r5 >= 0) goto L_0x0440
            java.lang.String r14 = r14.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r6 = r14.length()
            int r6 = r6 + 67
            r5.<init>(r6)
            java.lang.String r6 = "notificationCount is invalid: "
            r5.append(r6)
            r5.append(r14)
            java.lang.String r14 = ". Skipping setting notificationCount."
            r5.append(r14)
            java.lang.String r14 = r5.toString()
            android.util.Log.w(r1, r14)
        L_0x043f:
            r14 = 0
        L_0x0440:
            if (r14 == 0) goto L_0x0448
            int r14 = r14.intValue()
            r8.f9415i = r14
        L_0x0448:
            java.lang.String r14 = "gcm.n.event_time"
            java.lang.String r1 = r15.l(r14)
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L_0x0495
            long r5 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x045d }
            java.lang.Long r14 = java.lang.Long.valueOf(r5)     // Catch:{ NumberFormatException -> 0x045d }
            goto L_0x0496
        L_0x045d:
            java.lang.String r14 = c1.r.p(r14)
            java.lang.String r5 = java.lang.String.valueOf(r14)
            int r5 = r5.length()
            java.lang.String r6 = java.lang.String.valueOf(r1)
            int r6 = r6.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r5 = r5 + 38
            int r5 = r5 + r6
            r9.<init>(r5)
            java.lang.String r5 = "Couldn't parse value of "
            r9.append(r5)
            r9.append(r14)
            java.lang.String r14 = "("
            r9.append(r14)
            r9.append(r1)
            java.lang.String r14 = ") into a long"
            r9.append(r14)
            java.lang.String r14 = r9.toString()
            android.util.Log.w(r3, r14)
        L_0x0495:
            r14 = 0
        L_0x0496:
            if (r14 == 0) goto L_0x04a0
            r8.f9417k = r4
            long r5 = r14.longValue()
            r0.when = r5
        L_0x04a0:
            java.lang.String r14 = "gcm.n.vibrate_timings"
            org.json.JSONArray r14 = r15.j(r14)
            if (r14 != 0) goto L_0x04a9
            goto L_0x04ec
        L_0x04a9:
            int r1 = r14.length()     // Catch:{ NumberFormatException | JSONException -> 0x04c9 }
            if (r1 <= r4) goto L_0x04c1
            int r1 = r14.length()     // Catch:{ NumberFormatException | JSONException -> 0x04c9 }
            long[] r5 = new long[r1]     // Catch:{ NumberFormatException | JSONException -> 0x04c9 }
            r6 = r7
        L_0x04b6:
            if (r6 >= r1) goto L_0x04ed
            long r9 = r14.optLong(r6)     // Catch:{ NumberFormatException | JSONException -> 0x04c9 }
            r5[r6] = r9     // Catch:{ NumberFormatException | JSONException -> 0x04c9 }
            int r6 = r6 + 1
            goto L_0x04b6
        L_0x04c1:
            org.json.JSONException r1 = new org.json.JSONException     // Catch:{ NumberFormatException | JSONException -> 0x04c9 }
            java.lang.String r5 = "vibrateTimings have invalid length"
            r1.<init>(r5)     // Catch:{ NumberFormatException | JSONException -> 0x04c9 }
            throw r1     // Catch:{ NumberFormatException | JSONException -> 0x04c9 }
        L_0x04c9:
            java.lang.String r14 = r14.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r5 = r14.length()
            int r5 = r5 + 74
            r1.<init>(r5)
            java.lang.String r5 = "User defined vibrateTimings is invalid: "
            r1.append(r5)
            r1.append(r14)
            java.lang.String r14 = ". Skipping setting vibrateTimings."
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            android.util.Log.w(r3, r14)
        L_0x04ec:
            r5 = 0
        L_0x04ed:
            if (r5 == 0) goto L_0x04f1
            r0.vibrate = r5
        L_0x04f1:
            java.lang.String r14 = ". Skipping setting LightSettings"
            java.lang.String r1 = "LightSettings is invalid: "
            java.lang.String r5 = "gcm.n.light_settings"
            org.json.JSONArray r5 = r15.j(r5)
            if (r5 != 0) goto L_0x04ff
            goto L_0x057d
        L_0x04ff:
            r6 = 3
            int[] r9 = new int[r6]
            int r10 = r5.length()     // Catch:{ JSONException -> 0x0567, IllegalArgumentException -> 0x0534 }
            if (r10 != r6) goto L_0x052c
            java.lang.String r6 = r5.optString(r7)     // Catch:{ JSONException -> 0x0567, IllegalArgumentException -> 0x0534 }
            int r6 = android.graphics.Color.parseColor(r6)     // Catch:{ JSONException -> 0x0567, IllegalArgumentException -> 0x0534 }
            r10 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r6 == r10) goto L_0x0524
            r9[r7] = r6     // Catch:{ JSONException -> 0x0567, IllegalArgumentException -> 0x0534 }
            int r6 = r5.optInt(r4)     // Catch:{ JSONException -> 0x0567, IllegalArgumentException -> 0x0534 }
            r9[r4] = r6     // Catch:{ JSONException -> 0x0567, IllegalArgumentException -> 0x0534 }
            r6 = 2
            int r10 = r5.optInt(r6)     // Catch:{ JSONException -> 0x0567, IllegalArgumentException -> 0x0534 }
            r9[r6] = r10     // Catch:{ JSONException -> 0x0567, IllegalArgumentException -> 0x0534 }
            goto L_0x057e
        L_0x0524:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x0567, IllegalArgumentException -> 0x0534 }
            java.lang.String r9 = "Transparent color is invalid"
            r6.<init>(r9)     // Catch:{ JSONException -> 0x0567, IllegalArgumentException -> 0x0534 }
            throw r6     // Catch:{ JSONException -> 0x0567, IllegalArgumentException -> 0x0534 }
        L_0x052c:
            org.json.JSONException r6 = new org.json.JSONException     // Catch:{ JSONException -> 0x0567, IllegalArgumentException -> 0x0534 }
            java.lang.String r9 = "lightSettings don't have all three fields"
            r6.<init>(r9)     // Catch:{ JSONException -> 0x0567, IllegalArgumentException -> 0x0534 }
            throw r6     // Catch:{ JSONException -> 0x0567, IllegalArgumentException -> 0x0534 }
        L_0x0534:
            r6 = move-exception
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = r6.getMessage()
            java.lang.String r9 = java.lang.String.valueOf(r6)
            int r9 = r9.length()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            int r11 = r5.length()
            int r11 = r11 + 60
            int r11 = r11 + r9
            r10.<init>(r11)
            r10.append(r1)
            r10.append(r5)
            java.lang.String r1 = ". "
            r10.append(r1)
            r10.append(r6)
            r10.append(r14)
            java.lang.String r14 = r10.toString()
            goto L_0x057a
        L_0x0567:
            java.lang.String r5 = r5.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r9 = r5.length()
            int r9 = r9 + 58
            r6.<init>(r9)
            java.lang.String r14 = androidx.appcompat.widget.x0.f(r6, r1, r5, r14)
        L_0x057a:
            android.util.Log.w(r3, r14)
        L_0x057d:
            r9 = 0
        L_0x057e:
            if (r9 == 0) goto L_0x0598
            r14 = r9[r7]
            r1 = r9[r4]
            r3 = 2
            r3 = r9[r3]
            r0.ledARGB = r14
            r0.ledOnMS = r1
            r0.ledOffMS = r3
            if (r1 == 0) goto L_0x0592
            if (r3 == 0) goto L_0x0592
            r7 = r4
        L_0x0592:
            int r14 = r0.flags
            r14 = r14 & r2
            r14 = r14 | r7
            r0.flags = r14
        L_0x0598:
            java.lang.String r14 = "gcm.n.default_sound"
            boolean r14 = r15.g(r14)
            java.lang.String r1 = "gcm.n.default_vibrate_timings"
            boolean r1 = r15.g(r1)
            if (r1 == 0) goto L_0x05a8
            r14 = r14 | 2
        L_0x05a8:
            java.lang.String r1 = "gcm.n.default_light_settings"
            boolean r1 = r15.g(r1)
            if (r1 == 0) goto L_0x05b2
            r14 = r14 | 4
        L_0x05b2:
            r0.defaults = r14
            r14 = r14 & 4
            if (r14 == 0) goto L_0x05bd
            int r14 = r0.flags
            r14 = r14 | r4
            r0.flags = r14
        L_0x05bd:
            b8.a$a r14 = new b8.a$a
            java.lang.String r0 = "gcm.n.tag"
            java.lang.String r15 = r15.l(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 != 0) goto L_0x05cc
            goto L_0x05e3
        L_0x05cc:
            long r0 = android.os.SystemClock.uptimeMillis()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r2 = 37
            r15.<init>(r2)
            java.lang.String r2 = "FCM-Notification:"
            r15.append(r2)
            r15.append(r0)
            java.lang.String r15 = r15.toString()
        L_0x05e3:
            r14.<init>(r8, r15)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.a.a(android.content.Context, c1.r):b8.a$a");
    }

    @TargetApi(26)
    public static boolean b(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i10, (Resources.Theme) null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            StringBuilder sb = new StringBuilder(77);
            sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb.append(i10);
            Log.e("FirebaseMessaging", sb.toString());
            return false;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Couldn't find resource ");
            sb2.append(i10);
            sb2.append(", treating it as an invalid icon");
            Log.e("FirebaseMessaging", sb2.toString());
            return false;
        }
    }
}

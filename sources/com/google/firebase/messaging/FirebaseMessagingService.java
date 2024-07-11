package com.google.firebase.messaging;

import android.content.Intent;
import b8.e;
import b8.v;
import java.util.ArrayDeque;

public class FirebaseMessagingService extends e {

    /* renamed from: t  reason: collision with root package name */
    public static final ArrayDeque f3718t = new ArrayDeque(10);

    public final Intent b(Intent intent) {
        return (Intent) v.a().d.poll();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x029e, code lost:
        if (r3.isEmpty() != false) goto L_0x02ad;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01c3 A[SYNTHETIC, Splitter:B:112:0x01c3] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0258 A[SYNTHETIC, Splitter:B:147:0x0258] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0274 A[SYNTHETIC, Splitter:B:153:0x0274] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x016c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(android.content.Intent r26) {
        /*
            r25 = this;
            r1 = r26
            java.lang.String r0 = r26.getAction()
            java.lang.String r2 = "com.google.android.c2dm.intent.RECEIVE"
            boolean r2 = r2.equals(r0)
            java.lang.String r3 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            java.lang.String r4 = "FirebaseMessaging"
            if (r2 != 0) goto L_0x0045
            boolean r2 = r3.equals(r0)
            if (r2 == 0) goto L_0x0019
            goto L_0x0045
        L_0x0019:
            java.lang.String r2 = "com.google.firebase.messaging.NEW_TOKEN"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = "token"
            r1.getStringExtra(r0)
            return
        L_0x0027:
            java.lang.String r0 = r26.getAction()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.String r2 = "Unknown intent action: "
            if (r1 == 0) goto L_0x003c
            java.lang.String r0 = r2.concat(r0)
            goto L_0x0041
        L_0x003c:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L_0x0041:
            android.util.Log.d(r4, r0)
            return
        L_0x0045:
            java.lang.String r0 = "google.message_id"
            java.lang.String r2 = r1.getStringExtra(r0)
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            r6 = 1
            r7 = 3
            r8 = 0
            if (r5 == 0) goto L_0x0055
            goto L_0x008c
        L_0x0055:
            java.util.ArrayDeque r5 = f3718t
            boolean r9 = r5.contains(r2)
            if (r9 == 0) goto L_0x007e
            boolean r5 = android.util.Log.isLoggable(r4, r7)
            if (r5 == 0) goto L_0x007c
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r5 = r2.length()
            java.lang.String r9 = "Received duplicate message: "
            if (r5 == 0) goto L_0x0074
            java.lang.String r2 = r9.concat(r2)
            goto L_0x0079
        L_0x0074:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r9)
        L_0x0079:
            android.util.Log.d(r4, r2)
        L_0x007c:
            r2 = r6
            goto L_0x008d
        L_0x007e:
            int r9 = r5.size()
            r10 = 10
            if (r9 < r10) goto L_0x0089
            r5.remove()
        L_0x0089:
            r5.add(r2)
        L_0x008c:
            r2 = r8
        L_0x008d:
            if (r2 != 0) goto L_0x0347
            java.lang.String r2 = "message_type"
            java.lang.String r2 = r1.getStringExtra(r2)
            java.lang.String r5 = "gcm"
            if (r2 != 0) goto L_0x009a
            r2 = r5
        L_0x009a:
            int r9 = r2.hashCode()
            r10 = 2
            switch(r9) {
                case -2062414158: goto L_0x00bf;
                case 102161: goto L_0x00b7;
                case 814694033: goto L_0x00ad;
                case 814800675: goto L_0x00a3;
                default: goto L_0x00a2;
            }
        L_0x00a2:
            goto L_0x00c9
        L_0x00a3:
            java.lang.String r5 = "send_event"
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x00c9
            r5 = r10
            goto L_0x00ca
        L_0x00ad:
            java.lang.String r5 = "send_error"
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x00c9
            r5 = r7
            goto L_0x00ca
        L_0x00b7:
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x00c9
            r5 = r8
            goto L_0x00ca
        L_0x00bf:
            java.lang.String r5 = "deleted_messages"
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x00c9
            r5 = r6
            goto L_0x00ca
        L_0x00c9:
            r5 = -1
        L_0x00ca:
            java.lang.String r9 = "message_id"
            if (r5 == 0) goto L_0x0106
            if (r5 == r6) goto L_0x0347
            if (r5 == r10) goto L_0x0101
            if (r5 == r7) goto L_0x00eb
            int r0 = r2.length()
            java.lang.String r1 = "Received message with unknown type: "
            if (r0 == 0) goto L_0x00e1
            java.lang.String r0 = r1.concat(r2)
            goto L_0x00e6
        L_0x00e1:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x00e6:
            android.util.Log.w(r4, r0)
            goto L_0x0347
        L_0x00eb:
            java.lang.String r0 = r1.getStringExtra(r0)
            if (r0 != 0) goto L_0x00f4
            r1.getStringExtra(r9)
        L_0x00f4:
            b8.u r0 = new b8.u
            java.lang.String r2 = "error"
            java.lang.String r1 = r1.getStringExtra(r2)
            r0.<init>(r1)
            goto L_0x0347
        L_0x0101:
            r1.getStringExtra(r0)
            goto L_0x0347
        L_0x0106:
            boolean r2 = b8.o.b(r26)
            if (r2 == 0) goto L_0x0115
            java.lang.String r2 = "_nr"
            android.os.Bundle r5 = r26.getExtras()
            b8.o.a(r2, r5)
        L_0x0115:
            java.lang.String r2 = r26.getAction()
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0120
            goto L_0x0169
        L_0x0120:
            java.lang.String r2 = "delivery_metrics_exported_to_big_query_enabled"
            s6.c.b()     // Catch:{ IllegalStateException -> 0x0164 }
            s6.c r3 = s6.c.b()
            r3.a()
            java.lang.String r5 = "com.google.firebase.messaging"
            android.content.Context r3 = r3.f8815a
            android.content.SharedPreferences r5 = r3.getSharedPreferences(r5, r8)
            java.lang.String r7 = "export_to_big_query"
            boolean r11 = r5.contains(r7)
            if (r11 == 0) goto L_0x0141
            boolean r2 = r5.getBoolean(r7, r8)
            goto L_0x016a
        L_0x0141:
            android.content.pm.PackageManager r5 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0169 }
            if (r5 == 0) goto L_0x0169
            java.lang.String r3 = r3.getPackageName()     // Catch:{ NameNotFoundException -> 0x0169 }
            r7 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r3 = r5.getApplicationInfo(r3, r7)     // Catch:{ NameNotFoundException -> 0x0169 }
            if (r3 == 0) goto L_0x0169
            android.os.Bundle r5 = r3.metaData     // Catch:{ NameNotFoundException -> 0x0169 }
            if (r5 == 0) goto L_0x0169
            boolean r5 = r5.containsKey(r2)     // Catch:{ NameNotFoundException -> 0x0169 }
            if (r5 == 0) goto L_0x0169
            android.os.Bundle r3 = r3.metaData     // Catch:{ NameNotFoundException -> 0x0169 }
            boolean r2 = r3.getBoolean(r2, r8)     // Catch:{ NameNotFoundException -> 0x0169 }
            goto L_0x016a
        L_0x0164:
            java.lang.String r2 = "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query"
            android.util.Log.i(r4, r2)
        L_0x0169:
            r2 = r8
        L_0x016a:
            if (r2 == 0) goto L_0x02f2
            c8.a$a r22 = c8.a.C0029a.MESSAGE_DELIVERED
            q3.g r2 = com.google.firebase.messaging.FirebaseMessaging.l
            if (r2 != 0) goto L_0x0179
            java.lang.String r0 = "TransportFactory is null. Skip exporting message delivery metrics to Big Query"
            android.util.Log.e(r4, r0)
            goto L_0x02f2
        L_0x0179:
            android.os.Bundle r3 = r26.getExtras()
            if (r3 != 0) goto L_0x0181
            android.os.Bundle r3 = android.os.Bundle.EMPTY
        L_0x0181:
            int r5 = c8.a.f2179p
            c8.a$b r5 = c8.a.b.UNKNOWN
            c8.a$c r5 = c8.a.c.UNKNOWN_OS
            java.lang.String r5 = "google.ttl"
            java.lang.Object r5 = r3.get(r5)
            boolean r7 = r5 instanceof java.lang.Integer
            if (r7 == 0) goto L_0x0198
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            goto L_0x01a3
        L_0x0198:
            boolean r7 = r5 instanceof java.lang.String
            if (r7 == 0) goto L_0x01b3
            r7 = r5
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ NumberFormatException -> 0x01a6 }
            int r5 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x01a6 }
        L_0x01a3:
            r20 = r5
            goto L_0x01b5
        L_0x01a6:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r7 = "Invalid TTL: "
            java.lang.String r5 = r7.concat(r5)
            android.util.Log.w(r4, r5)
        L_0x01b3:
            r20 = r8
        L_0x01b5:
            java.lang.String r5 = "google.to"
            java.lang.String r5 = r3.getString(r5)
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            if (r7 != 0) goto L_0x01c3
        L_0x01c1:
            r15 = r5
            goto L_0x01e1
        L_0x01c3:
            s6.c r5 = s6.c.b()     // Catch:{ ExecutionException -> 0x02eb, InterruptedException -> 0x02e9 }
            java.lang.Object r7 = w7.d.f9271m     // Catch:{ ExecutionException -> 0x02eb, InterruptedException -> 0x02e9 }
            r5.a()     // Catch:{ ExecutionException -> 0x02eb, InterruptedException -> 0x02e9 }
            y6.i r5 = r5.d     // Catch:{ ExecutionException -> 0x02eb, InterruptedException -> 0x02e9 }
            java.lang.Class<w7.e> r7 = w7.e.class
            java.lang.Object r5 = r5.a(r7)     // Catch:{ ExecutionException -> 0x02eb, InterruptedException -> 0x02e9 }
            w7.d r5 = (w7.d) r5     // Catch:{ ExecutionException -> 0x02eb, InterruptedException -> 0x02e9 }
            m5.r r5 = r5.getId()     // Catch:{ ExecutionException -> 0x02eb, InterruptedException -> 0x02e9 }
            java.lang.Object r5 = m5.l.a(r5)     // Catch:{ ExecutionException -> 0x02eb, InterruptedException -> 0x02e9 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ ExecutionException -> 0x02eb, InterruptedException -> 0x02e9 }
            goto L_0x01c1
        L_0x01e1:
            s6.c r5 = s6.c.b()
            r5.a()
            android.content.Context r5 = r5.f8815a
            java.lang.String r18 = r5.getPackageName()
            c8.a$c r17 = c8.a.c.ANDROID
            boolean r5 = c1.r.m(r3)
            if (r5 == 0) goto L_0x01f9
            c8.a$b r5 = c8.a.b.DISPLAY_NOTIFICATION
            goto L_0x01fb
        L_0x01f9:
            c8.a$b r5 = c8.a.b.DATA_MESSAGE
        L_0x01fb:
            r16 = r5
            java.lang.String r0 = r3.getString(r0)
            if (r0 != 0) goto L_0x0207
            java.lang.String r0 = r3.getString(r9)
        L_0x0207:
            java.lang.String r5 = ""
            if (r0 == 0) goto L_0x020d
            r14 = r0
            goto L_0x020e
        L_0x020d:
            r14 = r5
        L_0x020e:
            java.lang.String r0 = "from"
            java.lang.String r0 = r3.getString(r0)
            if (r0 == 0) goto L_0x021f
            java.lang.String r7 = "/topics/"
            boolean r7 = r0.startsWith(r7)
            if (r7 == 0) goto L_0x021f
            goto L_0x0220
        L_0x021f:
            r0 = 0
        L_0x0220:
            if (r0 == 0) goto L_0x0225
            r21 = r0
            goto L_0x0227
        L_0x0225:
            r21 = r5
        L_0x0227:
            java.lang.String r0 = "collapse_key"
            java.lang.String r0 = r3.getString(r0)
            if (r0 == 0) goto L_0x0232
            r19 = r0
            goto L_0x0234
        L_0x0232:
            r19 = r5
        L_0x0234:
            java.lang.String r0 = "google.c.a.m_l"
            java.lang.String r0 = r3.getString(r0)
            if (r0 == 0) goto L_0x023f
            r23 = r0
            goto L_0x0241
        L_0x023f:
            r23 = r5
        L_0x0241:
            java.lang.String r0 = "google.c.a.c_l"
            java.lang.String r0 = r3.getString(r0)
            if (r0 == 0) goto L_0x024c
            r24 = r0
            goto L_0x024e
        L_0x024c:
            r24 = r5
        L_0x024e:
            java.lang.String r0 = "google.c.sender.id"
            boolean r5 = r3.containsKey(r0)
            r11 = 0
            if (r5 == 0) goto L_0x0267
            java.lang.String r0 = r3.getString(r0)     // Catch:{ NumberFormatException -> 0x0261 }
            long r5 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0261 }
            goto L_0x02ae
        L_0x0261:
            r0 = move-exception
            java.lang.String r3 = "error parsing project number"
            android.util.Log.w(r4, r3, r0)
        L_0x0267:
            s6.c r3 = s6.c.b()
            r3.a()
            s6.e r5 = r3.f8817c
            java.lang.String r0 = r5.f8829e
            if (r0 == 0) goto L_0x0280
            long r5 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0279 }
            goto L_0x02ae
        L_0x0279:
            r0 = move-exception
            r7 = r0
            java.lang.String r0 = "error parsing sender ID"
            android.util.Log.w(r4, r0, r7)
        L_0x0280:
            r3.a()
            java.lang.String r0 = "1:"
            java.lang.String r3 = r5.f8827b
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L_0x028e
            goto L_0x02a1
        L_0x028e:
            java.lang.String r0 = ":"
            java.lang.String[] r0 = r3.split(r0)
            int r3 = r0.length
            if (r3 >= r10) goto L_0x0298
            goto L_0x02ad
        L_0x0298:
            r3 = r0[r6]
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x02a1
            goto L_0x02ad
        L_0x02a1:
            long r5 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x02a6 }
            goto L_0x02ae
        L_0x02a6:
            r0 = move-exception
            r3 = r0
            java.lang.String r0 = "error parsing app ID"
            android.util.Log.w(r4, r0, r3)
        L_0x02ad:
            r5 = r11
        L_0x02ae:
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x02b4
            r12 = r5
            goto L_0x02b5
        L_0x02b4:
            r12 = r11
        L_0x02b5:
            c8.a r0 = new c8.a
            r11 = r0
            r11.<init>(r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.String r3 = "FCM_CLIENT_EVENT_LOGGING"
            java.lang.String r5 = "proto"
            q3.b r6 = new q3.b     // Catch:{ RuntimeException -> 0x02e2 }
            r6.<init>(r5)     // Catch:{ RuntimeException -> 0x02e2 }
            androidx.databinding.a r5 = androidx.databinding.a.f1022t     // Catch:{ RuntimeException -> 0x02e2 }
            t3.v r2 = r2.a(r3, r6, r5)     // Catch:{ RuntimeException -> 0x02e2 }
            c8.b r3 = new c8.b     // Catch:{ RuntimeException -> 0x02e2 }
            r3.<init>(r0)     // Catch:{ RuntimeException -> 0x02e2 }
            q3.a r0 = new q3.a     // Catch:{ RuntimeException -> 0x02e2 }
            q3.d r5 = q3.d.VERY_LOW     // Catch:{ RuntimeException -> 0x02e2 }
            r0.<init>(r3, r5)     // Catch:{ RuntimeException -> 0x02e2 }
            r2.getClass()     // Catch:{ RuntimeException -> 0x02e2 }
            t3.u r3 = new t3.u     // Catch:{ RuntimeException -> 0x02e2 }
            r3.<init>(r8)     // Catch:{ RuntimeException -> 0x02e2 }
            r2.a(r0, r3)     // Catch:{ RuntimeException -> 0x02e2 }
            goto L_0x02f2
        L_0x02e2:
            r0 = move-exception
            java.lang.String r2 = "Failed to send big query analytics payload."
            android.util.Log.w(r4, r2, r0)
            goto L_0x02f2
        L_0x02e9:
            r0 = move-exception
            goto L_0x02ec
        L_0x02eb:
            r0 = move-exception
        L_0x02ec:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x02f2:
            android.os.Bundle r0 = r26.getExtras()
            if (r0 != 0) goto L_0x02fd
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L_0x02fd:
            java.lang.String r2 = "androidx.content.wakelockid"
            r0.remove(r2)
            boolean r2 = c1.r.m(r0)
            if (r2 == 0) goto L_0x033f
            c1.r r2 = new c1.r
            r2.<init>((android.os.Bundle) r0)
            s4.a r3 = new s4.a
            java.lang.String r4 = "Firebase-Messaging-Network-Io"
            r3.<init>(r4)
            java.util.concurrent.ExecutorService r3 = java.util.concurrent.Executors.newSingleThreadExecutor(r3)
            b8.c r4 = new b8.c
            r5 = r25
            r4.<init>(r5, r2, r3)
            boolean r2 = r4.a()     // Catch:{ all -> 0x0339 }
            r3.shutdown()
            if (r2 == 0) goto L_0x0329
            goto L_0x0349
        L_0x0329:
            boolean r2 = b8.o.b(r26)
            if (r2 == 0) goto L_0x0341
            java.lang.String r2 = "_nf"
            android.os.Bundle r1 = r26.getExtras()
            b8.o.a(r2, r1)
            goto L_0x0341
        L_0x0339:
            r0 = move-exception
            r1 = r0
            r3.shutdown()
            throw r1
        L_0x033f:
            r5 = r25
        L_0x0341:
            b8.r r1 = new b8.r
            r1.<init>(r0)
            goto L_0x0349
        L_0x0347:
            r5 = r25
        L_0x0349:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.c(android.content.Intent):void");
    }
}

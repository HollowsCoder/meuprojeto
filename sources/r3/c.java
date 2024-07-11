package r3;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.appcompat.widget.x0;
import java.net.MalformedURLException;
import java.net.URL;
import q7.d;
import q7.e;
import s3.j;
import u3.m;

public final class c implements m {

    /* renamed from: a  reason: collision with root package name */
    public final d f8416a;

    /* renamed from: b  reason: collision with root package name */
    public final ConnectivityManager f8417b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f8418c;
    public final URL d;

    /* renamed from: e  reason: collision with root package name */
    public final c4.a f8419e;

    /* renamed from: f  reason: collision with root package name */
    public final c4.a f8420f;

    /* renamed from: g  reason: collision with root package name */
    public final int f8421g;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final URL f8422a;

        /* renamed from: b  reason: collision with root package name */
        public final j f8423b;

        /* renamed from: c  reason: collision with root package name */
        public final String f8424c;

        public a(URL url, j jVar, String str) {
            this.f8422a = url;
            this.f8423b = jVar;
            this.f8424c = str;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f8425a;

        /* renamed from: b  reason: collision with root package name */
        public final URL f8426b;

        /* renamed from: c  reason: collision with root package name */
        public final long f8427c;

        public b(int i10, URL url, long j8) {
            this.f8425a = i10;
            this.f8426b = url;
            this.f8427c = j8;
        }
    }

    public c(Context context, c4.a aVar, c4.a aVar2) {
        e eVar = new e();
        s3.b.f8713a.a(eVar);
        eVar.d = true;
        this.f8416a = new d(eVar);
        this.f8418c = context;
        this.f8417b = (ConnectivityManager) context.getSystemService("connectivity");
        String str = a.f8411c;
        try {
            this.d = new URL(str);
            this.f8419e = aVar2;
            this.f8420f = aVar;
            this.f8421g = 40000;
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(x0.e("Invalid url: ", str), e10);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final t3.h a(t3.n r7) {
        /*
            r6 = this;
            android.net.ConnectivityManager r0 = r6.f8417b
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            t3.h$a r7 = r7.i()
            int r1 = android.os.Build.VERSION.SDK_INT
            java.util.Map<java.lang.String, java.lang.String> r2 = r7.f8953f
            java.lang.String r3 = "Property \"autoMetadata\" has not been set"
            if (r2 == 0) goto L_0x011a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r4 = "sdk-version"
            r2.put(r4, r1)
            java.lang.String r1 = "model"
            java.lang.String r2 = android.os.Build.MODEL
            r7.a(r1, r2)
            java.lang.String r1 = "hardware"
            java.lang.String r2 = android.os.Build.HARDWARE
            r7.a(r1, r2)
            java.lang.String r1 = "device"
            java.lang.String r2 = android.os.Build.DEVICE
            r7.a(r1, r2)
            java.lang.String r1 = "product"
            java.lang.String r2 = android.os.Build.PRODUCT
            r7.a(r1, r2)
            java.lang.String r1 = "os-uild"
            java.lang.String r2 = android.os.Build.ID
            r7.a(r1, r2)
            java.lang.String r1 = "manufacturer"
            java.lang.String r2 = android.os.Build.MANUFACTURER
            r7.a(r1, r2)
            java.lang.String r1 = "fingerprint"
            java.lang.String r2 = android.os.Build.FINGERPRINT
            r7.a(r1, r2)
            java.util.Calendar.getInstance()
            java.util.TimeZone r1 = java.util.TimeZone.getDefault()
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            long r4 = r2.getTimeInMillis()
            int r1 = r1.getOffset(r4)
            int r1 = r1 / 1000
            long r1 = (long) r1
            java.util.Map<java.lang.String, java.lang.String> r4 = r7.f8953f
            if (r4 == 0) goto L_0x0114
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "tz-offset"
            r4.put(r2, r1)
            if (r0 != 0) goto L_0x0078
            s3.o$b r1 = s3.o.b.NONE
            int r1 = r1.getValue()
            goto L_0x007c
        L_0x0078:
            int r1 = r0.getType()
        L_0x007c:
            java.util.Map<java.lang.String, java.lang.String> r2 = r7.f8953f
            if (r2 == 0) goto L_0x010e
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r4 = "net-type"
            r2.put(r4, r1)
            r1 = 0
            r2 = -1
            if (r0 != 0) goto L_0x0090
            s3.o$a r0 = s3.o.a.UNKNOWN_MOBILE_SUBTYPE
            goto L_0x0098
        L_0x0090:
            int r0 = r0.getSubtype()
            if (r0 != r2) goto L_0x009d
            s3.o$a r0 = s3.o.a.COMBINED
        L_0x0098:
            int r0 = r0.getValue()
            goto L_0x00a5
        L_0x009d:
            s3.o$a r4 = s3.o.a.forNumber(r0)
            if (r4 == 0) goto L_0x00a4
            goto L_0x00a5
        L_0x00a4:
            r0 = r1
        L_0x00a5:
            java.util.Map<java.lang.String, java.lang.String> r4 = r7.f8953f
            if (r4 == 0) goto L_0x0108
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "mobile-subtype"
            r4.put(r3, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getCountry()
            java.lang.String r3 = "country"
            r7.a(r3, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            java.lang.String r3 = "locale"
            r7.a(r3, r0)
            android.content.Context r0 = r6.f8418c
            java.lang.String r3 = "phone"
            java.lang.Object r3 = r0.getSystemService(r3)
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3
            java.lang.String r3 = r3.getSimOperator()
            java.lang.String r4 = "mcc_mnc"
            r7.a(r4, r3)
            android.content.pm.PackageManager r3 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00ee }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ NameNotFoundException -> 0x00ee }
            android.content.pm.PackageInfo r0 = r3.getPackageInfo(r0, r1)     // Catch:{ NameNotFoundException -> 0x00ee }
            int r2 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x00ee }
            goto L_0x00fa
        L_0x00ee:
            r0 = move-exception
            java.lang.String r1 = "CctTransportBackend"
            java.lang.String r1 = androidx.databinding.a.o(r1)
            java.lang.String r3 = "Unable to find version code for package"
            android.util.Log.e(r1, r3, r0)
        L_0x00fa:
            java.lang.String r0 = java.lang.Integer.toString(r2)
            java.lang.String r1 = "application_build"
            r7.a(r1, r0)
            t3.h r7 = r7.b()
            return r7
        L_0x0108:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r3)
            throw r7
        L_0x010e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r3)
            throw r7
        L_0x0114:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r3)
            throw r7
        L_0x011a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.c.a(t3.n):t3.h");
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0377 A[Catch:{ all -> 0x03d2, IOException -> 0x0486 }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0378 A[Catch:{ all -> 0x03d2, IOException -> 0x0486 }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0439 A[Catch:{ all -> 0x03d2, IOException -> 0x0486 }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0451 A[Catch:{ all -> 0x03d2, IOException -> 0x0486 }] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x045b A[Catch:{ all -> 0x03d2, IOException -> 0x0486 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x02f9 A[Catch:{ all -> 0x03d2, IOException -> 0x0486 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x031d A[SYNTHETIC, Splitter:B:97:0x031d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final u3.b b(u3.a r31) {
        /*
            r30 = this;
            r1 = r30
            r0 = r31
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.Iterable<t3.n> r3 = r0.f9086a
            java.util.Iterator r3 = r3.iterator()
        L_0x000f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x003b
            java.lang.Object r4 = r3.next()
            t3.n r4 = (t3.n) r4
            java.lang.String r5 = r4.g()
            boolean r6 = r2.containsKey(r5)
            if (r6 != 0) goto L_0x0031
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r6.add(r4)
            r2.put(r5, r6)
            goto L_0x000f
        L_0x0031:
            java.lang.Object r5 = r2.get(r5)
            java.util.List r5 = (java.util.List) r5
            r5.add(r4)
            goto L_0x000f
        L_0x003b:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0048:
            boolean r4 = r2.hasNext()
            java.lang.String r5 = "CctTransportBackend"
            r6 = 0
            if (r4 == 0) goto L_0x0256
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r7 = r4.getValue()
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r6 = r7.get(r6)
            t3.n r6 = (t3.n) r6
            s3.p r16 = s3.p.DEFAULT
            c4.a r7 = r1.f8420f
            long r7 = r7.a()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            c4.a r8 = r1.f8419e
            long r8 = r8.a()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            s3.k$a r9 = s3.k.a.ANDROID_FIREBASE
            java.lang.String r10 = "sdk-version"
            int r10 = r6.f(r10)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r10)
            java.lang.String r10 = "model"
            java.lang.String r19 = r6.a(r10)
            java.lang.String r10 = "hardware"
            java.lang.String r20 = r6.a(r10)
            java.lang.String r10 = "device"
            java.lang.String r21 = r6.a(r10)
            java.lang.String r10 = "product"
            java.lang.String r22 = r6.a(r10)
            java.lang.String r10 = "os-uild"
            java.lang.String r23 = r6.a(r10)
            java.lang.String r10 = "manufacturer"
            java.lang.String r24 = r6.a(r10)
            java.lang.String r10 = "fingerprint"
            java.lang.String r25 = r6.a(r10)
            java.lang.String r10 = "country"
            java.lang.String r27 = r6.a(r10)
            java.lang.String r10 = "locale"
            java.lang.String r26 = r6.a(r10)
            java.lang.String r10 = "mcc_mnc"
            java.lang.String r28 = r6.a(r10)
            java.lang.String r10 = "application_build"
            java.lang.String r29 = r6.a(r10)
            s3.c r6 = new s3.c
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            s3.e r12 = new s3.e
            r12.<init>(r9, r6)
            java.lang.Object r6 = r4.getKey()     // Catch:{ NumberFormatException -> 0x00e5 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ NumberFormatException -> 0x00e5 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x00e5 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ NumberFormatException -> 0x00e5 }
            r9 = 0
            r13 = r6
            r14 = r9
            goto L_0x00ee
        L_0x00e5:
            java.lang.Object r6 = r4.getKey()
            java.lang.String r6 = (java.lang.String) r6
            r9 = 0
            r14 = r6
            r13 = r9
        L_0x00ee:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x00fd:
            boolean r6 = r4.hasNext()
            java.lang.String r9 = "Missing required properties:"
            java.lang.String r10 = ""
            if (r6 == 0) goto L_0x021d
            java.lang.Object r6 = r4.next()
            t3.n r6 = (t3.n) r6
            t3.m r11 = r6.d()
            r17 = r2
            q3.b r2 = r11.f8969a
            r18 = r4
            q3.b r4 = new q3.b
            r19 = r10
            java.lang.String r10 = "proto"
            r4.<init>(r10)
            boolean r4 = r2.equals(r4)
            byte[] r10 = r11.f8970b
            if (r4 == 0) goto L_0x0130
            s3.f$a r2 = new s3.f$a
            r2.<init>()
            r2.d = r10
            goto L_0x0150
        L_0x0130:
            q3.b r4 = new q3.b
            java.lang.String r11 = "json"
            r4.<init>(r11)
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x0204
            java.lang.String r2 = new java.lang.String
            java.lang.String r4 = "UTF-8"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)
            r2.<init>(r10, r4)
            s3.f$a r4 = new s3.f$a
            r4.<init>()
            r4.f8769e = r2
            r2 = r4
        L_0x0150:
            long r10 = r6.e()
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            r2.f8766a = r4
            long r10 = r6.h()
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            r2.f8768c = r4
            java.util.Map r4 = r6.b()
            java.lang.String r10 = "tz-offset"
            java.lang.Object r4 = r4.get(r10)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x0175
            r10 = 0
            goto L_0x017d
        L_0x0175:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            long r10 = r4.longValue()
        L_0x017d:
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            r2.f8770f = r4
            java.lang.String r4 = "net-type"
            int r4 = r6.f(r4)
            s3.o$b r4 = s3.o.b.forNumber(r4)
            java.lang.String r10 = "mobile-subtype"
            int r10 = r6.f(r10)
            s3.o$a r10 = s3.o.a.forNumber(r10)
            s3.i r11 = new s3.i
            r11.<init>(r4, r10)
            r2.f8771g = r11
            java.lang.Integer r4 = r6.c()
            if (r4 == 0) goto L_0x01aa
            java.lang.Integer r4 = r6.c()
            r2.f8767b = r4
        L_0x01aa:
            java.lang.Long r4 = r2.f8766a
            if (r4 != 0) goto L_0x01b1
            java.lang.String r10 = " eventTimeMs"
            goto L_0x01b3
        L_0x01b1:
            r10 = r19
        L_0x01b3:
            java.lang.Long r4 = r2.f8768c
            if (r4 != 0) goto L_0x01bd
            java.lang.String r4 = " eventUptimeMs"
            java.lang.String r10 = r10.concat(r4)
        L_0x01bd:
            java.lang.Long r4 = r2.f8770f
            if (r4 != 0) goto L_0x01c7
            java.lang.String r4 = " timezoneOffsetSeconds"
            java.lang.String r10 = b0.d.e(r10, r4)
        L_0x01c7:
            boolean r4 = r10.isEmpty()
            if (r4 == 0) goto L_0x01fa
            s3.f r4 = new s3.f
            java.lang.Long r6 = r2.f8766a
            long r20 = r6.longValue()
            java.lang.Integer r6 = r2.f8767b
            java.lang.Long r9 = r2.f8768c
            long r23 = r9.longValue()
            byte[] r9 = r2.d
            java.lang.String r10 = r2.f8769e
            java.lang.Long r11 = r2.f8770f
            long r27 = r11.longValue()
            s3.o r2 = r2.f8771g
            r19 = r4
            r22 = r6
            r25 = r9
            r26 = r10
            r29 = r2
            r19.<init>(r20, r22, r23, r25, r26, r27, r29)
            r15.add(r4)
            goto L_0x0217
        L_0x01fa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = r9.concat(r10)
            r0.<init>(r2)
            throw r0
        L_0x0204:
            java.lang.String r4 = androidx.databinding.a.o(r5)
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r9 = 0
            r6[r9] = r2
            java.lang.String r2 = "Received event of unsupported encoding %s. Skipping..."
            java.lang.String r2 = java.lang.String.format(r2, r6)
            android.util.Log.w(r4, r2)
        L_0x0217:
            r2 = r17
            r4 = r18
            goto L_0x00fd
        L_0x021d:
            r17 = r2
            r19 = r10
            if (r7 != 0) goto L_0x0226
            java.lang.String r10 = " requestTimeMs"
            goto L_0x0228
        L_0x0226:
            r10 = r19
        L_0x0228:
            if (r8 != 0) goto L_0x0230
            java.lang.String r2 = " requestUptimeMs"
            java.lang.String r10 = r10.concat(r2)
        L_0x0230:
            boolean r2 = r10.isEmpty()
            if (r2 == 0) goto L_0x024c
            s3.g r2 = new s3.g
            long r4 = r7.longValue()
            long r10 = r8.longValue()
            r7 = r2
            r8 = r4
            r7.<init>(r8, r10, r12, r13, r14, r15, r16)
            r3.add(r2)
            r2 = r17
            goto L_0x0048
        L_0x024c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = r9.concat(r10)
            r0.<init>(r2)
            throw r0
        L_0x0256:
            s3.d r2 = new s3.d
            r2.<init>(r3)
            r3 = -1
            byte[] r0 = r0.f9087b
            java.net.URL r6 = r1.d
            if (r0 == 0) goto L_0x0294
            r3.a r0 = r3.a.a(r0)     // Catch:{ IllegalArgumentException -> 0x028c }
            java.lang.String r7 = r0.f8414b     // Catch:{ IllegalArgumentException -> 0x028c }
            if (r7 == 0) goto L_0x026c
            goto L_0x026d
        L_0x026c:
            r7 = 0
        L_0x026d:
            java.lang.String r8 = r0.f8413a     // Catch:{ IllegalArgumentException -> 0x028c }
            if (r8 == 0) goto L_0x0295
            java.net.URL r6 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0277 }
            r6.<init>(r8)     // Catch:{ MalformedURLException -> 0x0277 }
            goto L_0x0295
        L_0x0277:
            r0 = move-exception
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x028c }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x028c }
            java.lang.String r6 = "Invalid url: "
            r5.<init>(r6)     // Catch:{ IllegalArgumentException -> 0x028c }
            r5.append(r8)     // Catch:{ IllegalArgumentException -> 0x028c }
            java.lang.String r5 = r5.toString()     // Catch:{ IllegalArgumentException -> 0x028c }
            r2.<init>(r5, r0)     // Catch:{ IllegalArgumentException -> 0x028c }
            throw r2     // Catch:{ IllegalArgumentException -> 0x028c }
        L_0x028c:
            u3.b r0 = new u3.b
            u3.g$a r2 = u3.g.a.FATAL_ERROR
            r0.<init>(r2, r3)
            return r0
        L_0x0294:
            r7 = 0
        L_0x0295:
            r3.c$a r0 = new r3.c$a     // Catch:{ IOException -> 0x0486 }
            r0.<init>(r6, r2, r7)     // Catch:{ IOException -> 0x0486 }
            e2.a r2 = new e2.a     // Catch:{ IOException -> 0x0486 }
            r3 = 1
            r2.<init>(r3, r1)     // Catch:{ IOException -> 0x0486 }
            r3 = 5
            r4 = r3
            r3 = r0
        L_0x02a3:
            s3.j r6 = r3.f8423b
            java.net.URL r0 = r3.f8422a
            java.lang.Object r7 = r2.f4458p     // Catch:{ IOException -> 0x0486 }
            r3.c r7 = (r3.c) r7     // Catch:{ IOException -> 0x0486 }
            r7.getClass()     // Catch:{ IOException -> 0x0486 }
            java.lang.String r8 = "Making request to: %s"
            androidx.databinding.a.m(r0, r5, r8)     // Catch:{ IOException -> 0x0486 }
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ IOException -> 0x0486 }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ IOException -> 0x0486 }
            r8 = 30000(0x7530, float:4.2039E-41)
            r0.setConnectTimeout(r8)     // Catch:{ IOException -> 0x0486 }
            int r8 = r7.f8421g     // Catch:{ IOException -> 0x0486 }
            r0.setReadTimeout(r8)     // Catch:{ IOException -> 0x0486 }
            r8 = 1
            r0.setDoOutput(r8)     // Catch:{ IOException -> 0x0486 }
            r9 = 0
            r0.setInstanceFollowRedirects(r9)     // Catch:{ IOException -> 0x0486 }
            java.lang.String r9 = "POST"
            r0.setRequestMethod(r9)     // Catch:{ IOException -> 0x0486 }
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ IOException -> 0x0486 }
            java.lang.String r9 = "3.1.1"
            r10 = 0
            r8[r10] = r9     // Catch:{ IOException -> 0x0486 }
            java.lang.String r9 = "datatransport/%s android/"
            java.lang.String r8 = java.lang.String.format(r9, r8)     // Catch:{ IOException -> 0x0486 }
            java.lang.String r9 = "User-Agent"
            r0.setRequestProperty(r9, r8)     // Catch:{ IOException -> 0x0486 }
            java.lang.String r8 = "Content-Encoding"
            java.lang.String r9 = "gzip"
            r0.setRequestProperty(r8, r9)     // Catch:{ IOException -> 0x0486 }
            java.lang.String r10 = "Content-Type"
            java.lang.String r11 = "application/json"
            r0.setRequestProperty(r10, r11)     // Catch:{ IOException -> 0x0486 }
            java.lang.String r11 = "Accept-Encoding"
            r0.setRequestProperty(r11, r9)     // Catch:{ IOException -> 0x0486 }
            java.lang.String r11 = r3.f8424c     // Catch:{ IOException -> 0x0486 }
            if (r11 == 0) goto L_0x02fe
            java.lang.String r12 = "X-Goog-Api-Key"
            r0.setRequestProperty(r12, r11)     // Catch:{ IOException -> 0x0486 }
        L_0x02fe:
            r11 = 200(0xc8, float:2.8E-43)
            java.io.OutputStream r12 = r0.getOutputStream()     // Catch:{ ConnectException -> 0x0420, UnknownHostException -> 0x041e, b -> 0x0408, IOException -> 0x0406 }
            java.util.zip.GZIPOutputStream r13 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x03f8 }
            r13.<init>(r12)     // Catch:{ all -> 0x03f8 }
            q7.d r7 = r7.f8416a     // Catch:{ all -> 0x03ec }
            java.io.BufferedWriter r14 = new java.io.BufferedWriter     // Catch:{ all -> 0x03ec }
            java.io.OutputStreamWriter r15 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x03ec }
            r15.<init>(r13)     // Catch:{ all -> 0x03ec }
            r14.<init>(r15)     // Catch:{ all -> 0x03ec }
            r7.a(r14, r6)     // Catch:{ all -> 0x03ec }
            r13.close()     // Catch:{ all -> 0x03f8 }
            if (r12 == 0) goto L_0x0320
            r12.close()     // Catch:{ ConnectException -> 0x0420, UnknownHostException -> 0x041e, b -> 0x0408, IOException -> 0x0406 }
        L_0x0320:
            int r7 = r0.getResponseCode()     // Catch:{ IOException -> 0x0486 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0486 }
            java.lang.String r13 = "Status Code: "
            r12.<init>(r13)     // Catch:{ IOException -> 0x0486 }
            r12.append(r7)     // Catch:{ IOException -> 0x0486 }
            java.lang.String r12 = r12.toString()     // Catch:{ IOException -> 0x0486 }
            java.lang.String r13 = androidx.databinding.a.o(r5)     // Catch:{ IOException -> 0x0486 }
            android.util.Log.i(r13, r12)     // Catch:{ IOException -> 0x0486 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0486 }
            java.lang.String r13 = "Content-Type: "
            r12.<init>(r13)     // Catch:{ IOException -> 0x0486 }
            java.lang.String r10 = r0.getHeaderField(r10)     // Catch:{ IOException -> 0x0486 }
            r12.append(r10)     // Catch:{ IOException -> 0x0486 }
            java.lang.String r10 = r12.toString()     // Catch:{ IOException -> 0x0486 }
            java.lang.String r12 = androidx.databinding.a.o(r5)     // Catch:{ IOException -> 0x0486 }
            android.util.Log.i(r12, r10)     // Catch:{ IOException -> 0x0486 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0486 }
            java.lang.String r12 = "Content-Encoding: "
            r10.<init>(r12)     // Catch:{ IOException -> 0x0486 }
            java.lang.String r12 = r0.getHeaderField(r8)     // Catch:{ IOException -> 0x0486 }
            r10.append(r12)     // Catch:{ IOException -> 0x0486 }
            java.lang.String r10 = r10.toString()     // Catch:{ IOException -> 0x0486 }
            java.lang.String r12 = androidx.databinding.a.o(r5)     // Catch:{ IOException -> 0x0486 }
            android.util.Log.i(r12, r10)     // Catch:{ IOException -> 0x0486 }
            r10 = 302(0x12e, float:4.23E-43)
            if (r7 == r10) goto L_0x03d8
            r10 = 301(0x12d, float:4.22E-43)
            if (r7 == r10) goto L_0x03d8
            r10 = 307(0x133, float:4.3E-43)
            if (r7 != r10) goto L_0x0378
            goto L_0x03d8
        L_0x0378:
            if (r7 == r11) goto L_0x0384
            r3.c$b r0 = new r3.c$b     // Catch:{ IOException -> 0x0486 }
            r8 = 0
            r9 = 0
            r0.<init>(r7, r8, r9)     // Catch:{ IOException -> 0x0486 }
            goto L_0x041c
        L_0x0384:
            java.io.InputStream r10 = r0.getInputStream()     // Catch:{ IOException -> 0x0486 }
            java.lang.String r0 = r0.getHeaderField(r8)     // Catch:{ all -> 0x03ca }
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x03ca }
            if (r0 == 0) goto L_0x0399
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x03ca }
            r0.<init>(r10)     // Catch:{ all -> 0x03ca }
            r8 = r0
            goto L_0x039a
        L_0x0399:
            r8 = r10
        L_0x039a:
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x03bc }
            java.io.InputStreamReader r9 = new java.io.InputStreamReader     // Catch:{ all -> 0x03bc }
            r9.<init>(r8)     // Catch:{ all -> 0x03bc }
            r0.<init>(r9)     // Catch:{ all -> 0x03bc }
            s3.h r0 = s3.n.a(r0)     // Catch:{ all -> 0x03bc }
            long r12 = r0.f8778a     // Catch:{ all -> 0x03bc }
            r3.c$b r0 = new r3.c$b     // Catch:{ all -> 0x03bc }
            r9 = 0
            r0.<init>(r7, r9, r12)     // Catch:{ all -> 0x03bc }
            if (r8 == 0) goto L_0x03b5
            r8.close()     // Catch:{ all -> 0x03ca }
        L_0x03b5:
            if (r10 == 0) goto L_0x041c
            r10.close()     // Catch:{ IOException -> 0x0486 }
            goto L_0x041c
        L_0x03bc:
            r0 = move-exception
            r2 = r0
            if (r8 == 0) goto L_0x03c9
            r8.close()     // Catch:{ all -> 0x03c4 }
            goto L_0x03c9
        L_0x03c4:
            r0 = move-exception
            r3 = r0
            r2.addSuppressed(r3)     // Catch:{ all -> 0x03ca }
        L_0x03c9:
            throw r2     // Catch:{ all -> 0x03ca }
        L_0x03ca:
            r0 = move-exception
            r2 = r0
            if (r10 == 0) goto L_0x03d7
            r10.close()     // Catch:{ all -> 0x03d2 }
            goto L_0x03d7
        L_0x03d2:
            r0 = move-exception
            r3 = r0
            r2.addSuppressed(r3)     // Catch:{ IOException -> 0x0486 }
        L_0x03d7:
            throw r2     // Catch:{ IOException -> 0x0486 }
        L_0x03d8:
            java.lang.String r8 = "Location"
            java.lang.String r0 = r0.getHeaderField(r8)     // Catch:{ IOException -> 0x0486 }
            r3.c$b r8 = new r3.c$b     // Catch:{ IOException -> 0x0486 }
            java.net.URL r9 = new java.net.URL     // Catch:{ IOException -> 0x0486 }
            r9.<init>(r0)     // Catch:{ IOException -> 0x0486 }
            r12 = 0
            r8.<init>(r7, r9, r12)     // Catch:{ IOException -> 0x0486 }
            r0 = r8
            goto L_0x041c
        L_0x03ec:
            r0 = move-exception
            r7 = r0
            r13.close()     // Catch:{ all -> 0x03f2 }
            goto L_0x03f7
        L_0x03f2:
            r0 = move-exception
            r8 = r0
            r7.addSuppressed(r8)     // Catch:{ all -> 0x03f8 }
        L_0x03f7:
            throw r7     // Catch:{ all -> 0x03f8 }
        L_0x03f8:
            r0 = move-exception
            r7 = r0
            if (r12 == 0) goto L_0x0405
            r12.close()     // Catch:{ all -> 0x0400 }
            goto L_0x0405
        L_0x0400:
            r0 = move-exception
            r8 = r0
            r7.addSuppressed(r8)     // Catch:{ ConnectException -> 0x0420, UnknownHostException -> 0x041e, b -> 0x0408, IOException -> 0x0406 }
        L_0x0405:
            throw r7     // Catch:{ ConnectException -> 0x0420, UnknownHostException -> 0x041e, b -> 0x0408, IOException -> 0x0406 }
        L_0x0406:
            r0 = move-exception
            goto L_0x0409
        L_0x0408:
            r0 = move-exception
        L_0x0409:
            java.lang.String r7 = androidx.databinding.a.o(r5)     // Catch:{ IOException -> 0x0486 }
            java.lang.String r8 = "Couldn't encode request, returning with 400"
            android.util.Log.e(r7, r8, r0)     // Catch:{ IOException -> 0x0486 }
            r3.c$b r0 = new r3.c$b     // Catch:{ IOException -> 0x0486 }
            r7 = 400(0x190, float:5.6E-43)
            r8 = 0
            r9 = 0
            r0.<init>(r7, r8, r9)     // Catch:{ IOException -> 0x0486 }
        L_0x041c:
            r7 = 0
            goto L_0x0435
        L_0x041e:
            r0 = move-exception
            goto L_0x0421
        L_0x0420:
            r0 = move-exception
        L_0x0421:
            java.lang.String r7 = androidx.databinding.a.o(r5)     // Catch:{ IOException -> 0x0486 }
            java.lang.String r8 = "Couldn't open connection, returning with 500"
            android.util.Log.e(r7, r8, r0)     // Catch:{ IOException -> 0x0486 }
            r3.c$b r0 = new r3.c$b     // Catch:{ IOException -> 0x0486 }
            r7 = 500(0x1f4, float:7.0E-43)
            r8 = 0
            r9 = 0
            r0.<init>(r7, r8, r9)     // Catch:{ IOException -> 0x0486 }
            r7 = r8
        L_0x0435:
            java.net.URL r8 = r0.f8426b     // Catch:{ IOException -> 0x0486 }
            if (r8 == 0) goto L_0x0445
            java.lang.String r7 = "Following redirect to: %s"
            androidx.databinding.a.m(r8, r5, r7)     // Catch:{ IOException -> 0x0486 }
            r3.c$a r7 = new r3.c$a     // Catch:{ IOException -> 0x0486 }
            java.lang.String r3 = r3.f8424c     // Catch:{ IOException -> 0x0486 }
            r7.<init>(r8, r6, r3)     // Catch:{ IOException -> 0x0486 }
        L_0x0445:
            r3 = r7
            if (r3 == 0) goto L_0x044d
            int r4 = r4 + -1
            r6 = 1
            if (r4 >= r6) goto L_0x02a3
        L_0x044d:
            int r2 = r0.f8425a     // Catch:{ IOException -> 0x0486 }
            if (r2 != r11) goto L_0x045b
            long r2 = r0.f8427c     // Catch:{ IOException -> 0x0486 }
            u3.b r0 = new u3.b     // Catch:{ IOException -> 0x0486 }
            u3.g$a r4 = u3.g.a.OK     // Catch:{ IOException -> 0x0486 }
            r0.<init>(r4, r2)     // Catch:{ IOException -> 0x0486 }
            return r0
        L_0x045b:
            r0 = 500(0x1f4, float:7.0E-43)
            if (r2 >= r0) goto L_0x047c
            r0 = 404(0x194, float:5.66E-43)
            if (r2 != r0) goto L_0x0464
            goto L_0x047c
        L_0x0464:
            r0 = 400(0x190, float:5.6E-43)
            if (r2 != r0) goto L_0x0472
            u3.b r0 = new u3.b     // Catch:{ IOException -> 0x0486 }
            u3.g$a r2 = u3.g.a.INVALID_PAYLOAD     // Catch:{ IOException -> 0x0486 }
            r3 = -1
            r0.<init>(r2, r3)     // Catch:{ IOException -> 0x0486 }
            return r0
        L_0x0472:
            u3.b r0 = new u3.b     // Catch:{ IOException -> 0x0486 }
            u3.g$a r2 = u3.g.a.FATAL_ERROR     // Catch:{ IOException -> 0x0486 }
            r3 = -1
            r0.<init>(r2, r3)     // Catch:{ IOException -> 0x0486 }
            return r0
        L_0x047c:
            u3.b r0 = new u3.b     // Catch:{ IOException -> 0x0486 }
            u3.g$a r2 = u3.g.a.TRANSIENT_ERROR     // Catch:{ IOException -> 0x0486 }
            r3 = -1
            r0.<init>(r2, r3)     // Catch:{ IOException -> 0x0486 }
            return r0
        L_0x0486:
            r0 = move-exception
            java.lang.String r2 = androidx.databinding.a.o(r5)
            java.lang.String r3 = "Could not make request to the backend"
            android.util.Log.e(r2, r3, r0)
            u3.b r0 = new u3.b
            u3.g$a r2 = u3.g.a.TRANSIENT_ERROR
            r3 = -1
            r0.<init>(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.c.b(u3.a):u3.b");
    }
}

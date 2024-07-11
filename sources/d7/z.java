package d7;

import android.content.Context;
import b0.d;
import com.karumi.dexter.BuildConfig;
import f7.a0;
import f7.b0;
import f7.n;
import f7.o;
import f7.q;
import f7.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import m7.a;
import m7.c;

public final class z {

    /* renamed from: e  reason: collision with root package name */
    public static final HashMap f4302e;

    /* renamed from: f  reason: collision with root package name */
    public static final String f4303f = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{"18.2.5"});

    /* renamed from: a  reason: collision with root package name */
    public final Context f4304a;

    /* renamed from: b  reason: collision with root package name */
    public final h0 f4305b;

    /* renamed from: c  reason: collision with root package name */
    public final a f4306c;
    public final c d;

    static {
        HashMap hashMap = new HashMap();
        f4302e = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
    }

    public z(Context context, h0 h0Var, a aVar, a aVar2) {
        this.f4304a = context;
        this.f4305b = h0Var;
        this.f4306c = aVar;
        this.d = aVar2;
    }

    public static o c(o.c cVar, int i10) {
        String str = (String) cVar.f7536b;
        String str2 = (String) cVar.f7535a;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) cVar.f7537c;
        int i11 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        o.c cVar2 = (o.c) cVar.d;
        if (i10 >= 8) {
            o.c cVar3 = cVar2;
            while (cVar3 != null) {
                cVar3 = (o.c) cVar3.d;
                i11++;
            }
        }
        if (str != null) {
            b0 b0Var = new b0(d(stackTraceElementArr, 4));
            Integer valueOf = Integer.valueOf(i11);
            o oVar = null;
            if (cVar2 != null && i11 == 0) {
                oVar = c(cVar2, i10 + 1);
            }
            String str3 = BuildConfig.FLAVOR;
            if (valueOf == null) {
                str3 = d.e(str3, " overflowCount");
            }
            if (str3.isEmpty()) {
                return new o(str, str2, b0Var, oVar, valueOf.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str3));
        }
        throw new NullPointerException("Null type");
    }

    public static b0 d(StackTraceElement[] stackTraceElementArr, int i10) {
        long j8;
        ArrayList arrayList = new ArrayList();
        int length = stackTraceElementArr.length;
        int i11 = 0;
        while (i11 < length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i11];
            r.a aVar = new r.a();
            aVar.f4858e = Integer.valueOf(i10);
            long j10 = 0;
            if (stackTraceElement.isNativeMethod()) {
                j8 = Math.max((long) stackTraceElement.getLineNumber(), 0);
            } else {
                j8 = 0;
            }
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j10 = (long) stackTraceElement.getLineNumber();
            }
            aVar.f4855a = Long.valueOf(j8);
            if (str != null) {
                aVar.f4856b = str;
                aVar.f4857c = fileName;
                aVar.d = Long.valueOf(j10);
                arrayList.add(aVar.a());
                i11++;
            } else {
                throw new NullPointerException("Null symbol");
            }
        }
        return new b0(arrayList);
    }

    public static q e(Thread thread, StackTraceElement[] stackTraceElementArr, int i10) {
        String name = thread.getName();
        if (name != null) {
            Integer valueOf = Integer.valueOf(i10);
            b0 b0Var = new b0(d(stackTraceElementArr, i10));
            String str = BuildConfig.FLAVOR;
            if (valueOf == null) {
                str = str.concat(" importance");
            }
            if (str.isEmpty()) {
                return new q(name, valueOf.intValue(), b0Var);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
        throw new NullPointerException("Null name");
    }

    public final b0<a0.e.d.a.b.C0059a> a() {
        a0.e.d.a.b.C0059a[] aVarArr = new a0.e.d.a.b.C0059a[1];
        n.a aVar = new n.a();
        aVar.f4838a = 0L;
        aVar.f4839b = 0L;
        a aVar2 = this.f4306c;
        String str = aVar2.d;
        if (str != null) {
            aVar.f4840c = str;
            aVar.d = aVar2.f4194b;
            aVarArr[0] = aVar.a();
            return new b0<>(Arrays.asList(aVarArr));
        }
        throw new NullPointerException("Null name");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final f7.s b(int r14) {
        /*
            r13 = this;
            android.content.Context r0 = r13.f4304a
            r1 = 2
            r2 = 0
            r3 = 0
            r4 = 1
            android.content.IntentFilter r5 = new android.content.IntentFilter     // Catch:{ IllegalStateException -> 0x0044 }
            java.lang.String r6 = "android.intent.action.BATTERY_CHANGED"
            r5.<init>(r6)     // Catch:{ IllegalStateException -> 0x0044 }
            android.content.Intent r5 = r0.registerReceiver(r2, r5)     // Catch:{ IllegalStateException -> 0x0044 }
            if (r5 == 0) goto L_0x0041
            java.lang.String r6 = "status"
            r7 = -1
            int r6 = r5.getIntExtra(r6, r7)     // Catch:{ IllegalStateException -> 0x0044 }
            if (r6 != r7) goto L_0x001d
            goto L_0x0023
        L_0x001d:
            if (r6 == r1) goto L_0x0025
            r8 = 5
            if (r6 != r8) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r6 = r3
            goto L_0x0026
        L_0x0025:
            r6 = r4
        L_0x0026:
            java.lang.String r8 = "level"
            int r8 = r5.getIntExtra(r8, r7)     // Catch:{ IllegalStateException -> 0x003f }
            java.lang.String r9 = "scale"
            int r5 = r5.getIntExtra(r9, r7)     // Catch:{ IllegalStateException -> 0x003f }
            if (r8 == r7) goto L_0x004d
            if (r5 != r7) goto L_0x0037
            goto L_0x004d
        L_0x0037:
            float r7 = (float) r8     // Catch:{ IllegalStateException -> 0x003f }
            float r5 = (float) r5     // Catch:{ IllegalStateException -> 0x003f }
            float r7 = r7 / r5
            java.lang.Float r5 = java.lang.Float.valueOf(r7)     // Catch:{ IllegalStateException -> 0x003f }
            goto L_0x004e
        L_0x003f:
            r5 = move-exception
            goto L_0x0046
        L_0x0041:
            r5 = r2
            r6 = r3
            goto L_0x004e
        L_0x0044:
            r5 = move-exception
            r6 = r3
        L_0x0046:
            java.lang.String r7 = "FirebaseCrashlytics"
            java.lang.String r8 = "An error occurred getting battery state."
            android.util.Log.e(r7, r8, r5)
        L_0x004d:
            r5 = r2
        L_0x004e:
            if (r5 == 0) goto L_0x0058
            double r7 = r5.doubleValue()
            java.lang.Double r2 = java.lang.Double.valueOf(r7)
        L_0x0058:
            if (r6 == 0) goto L_0x006e
            if (r5 != 0) goto L_0x005d
            goto L_0x006e
        L_0x005d:
            float r5 = r5.floatValue()
            double r5 = (double) r5
            r7 = 4607092346807469998(0x3fefae147ae147ae, double:0.99)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x006c
            goto L_0x006f
        L_0x006c:
            r1 = 3
            goto L_0x006f
        L_0x006e:
            r1 = r4
        L_0x006f:
            boolean r5 = d7.e.i(r0)
            if (r5 == 0) goto L_0x0076
            goto L_0x0087
        L_0x0076:
            java.lang.String r5 = "sensor"
            java.lang.Object r5 = r0.getSystemService(r5)
            android.hardware.SensorManager r5 = (android.hardware.SensorManager) r5
            r6 = 8
            android.hardware.Sensor r5 = r5.getDefaultSensor(r6)
            if (r5 == 0) goto L_0x0087
            r3 = r4
        L_0x0087:
            long r4 = d7.e.g()
            android.app.ActivityManager$MemoryInfo r6 = new android.app.ActivityManager$MemoryInfo
            r6.<init>()
            java.lang.String r7 = "activity"
            java.lang.Object r0 = r0.getSystemService(r7)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            r0.getMemoryInfo(r6)
            long r6 = r6.availMem
            long r4 = r4 - r6
            java.io.File r0 = android.os.Environment.getDataDirectory()
            java.lang.String r0 = r0.getPath()
            android.os.StatFs r6 = new android.os.StatFs
            r6.<init>(r0)
            int r0 = r6.getBlockSize()
            long r7 = (long) r0
            int r0 = r6.getBlockCount()
            long r9 = (long) r0
            long r9 = r9 * r7
            int r0 = r6.getAvailableBlocks()
            long r11 = (long) r0
            long r7 = r7 * r11
            long r9 = r9 - r7
            f7.s$a r0 = new f7.s$a
            r0.<init>()
            r0.f4864a = r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.f4865b = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r0.f4866c = r1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r0.d = r14
            java.lang.Long r14 = java.lang.Long.valueOf(r4)
            r0.f4867e = r14
            java.lang.Long r14 = java.lang.Long.valueOf(r9)
            r0.f4868f = r14
            f7.s r14 = r0.a()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.z.b(int):f7.s");
    }
}

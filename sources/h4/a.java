package h4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.internal.clearcut.a4;
import com.google.android.gms.internal.clearcut.c2;
import com.google.android.gms.internal.clearcut.h4;
import com.google.android.gms.internal.clearcut.t3;
import java.util.TimeZone;
import k4.a;
import r4.c;
import r4.d;

public final class a {
    @Deprecated

    /* renamed from: k  reason: collision with root package name */
    public static final k4.a<Object> f5234k = new k4.a<>(new b(), new a.f());

    /* renamed from: a  reason: collision with root package name */
    public final Context f5235a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5236b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5237c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5238e = -1;

    /* renamed from: f  reason: collision with root package name */
    public final String f5239f;

    /* renamed from: g  reason: collision with root package name */
    public final t3 f5240g = t3.DEFAULT;

    /* renamed from: h  reason: collision with root package name */
    public final c f5241h;

    /* renamed from: i  reason: collision with root package name */
    public final c f5242i;

    /* renamed from: j  reason: collision with root package name */
    public final b f5243j;

    /* renamed from: h4.a$a  reason: collision with other inner class name */
    public class C0076a {

        /* renamed from: a  reason: collision with root package name */
        public final int f5244a;

        /* renamed from: b  reason: collision with root package name */
        public final String f5245b;

        /* renamed from: c  reason: collision with root package name */
        public final String f5246c;
        public final t3 d;

        /* renamed from: e  reason: collision with root package name */
        public final a4 f5247e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f5248f = false;

        public C0076a(byte[] bArr) {
            this.f5244a = a.this.f5238e;
            this.f5245b = a.this.d;
            this.f5246c = a.this.f5239f;
            this.d = a.this.f5240g;
            a4 a4Var = new a4();
            this.f5247e = a4Var;
            this.f5246c = a.this.f5239f;
            Context context = a.this.f5235a;
            boolean z = com.google.android.gms.internal.clearcut.a.f2359b;
            if (!z) {
                UserManager userManager = com.google.android.gms.internal.clearcut.a.f2358a;
                if (userManager == null) {
                    synchronized (com.google.android.gms.internal.clearcut.a.class) {
                        userManager = com.google.android.gms.internal.clearcut.a.f2358a;
                        if (userManager == null) {
                            UserManager userManager2 = (UserManager) context.getSystemService(UserManager.class);
                            com.google.android.gms.internal.clearcut.a.f2358a = userManager2;
                            if (userManager2 == null) {
                                com.google.android.gms.internal.clearcut.a.f2359b = true;
                                z = true;
                            } else {
                                userManager = userManager2;
                            }
                        }
                    }
                }
                z = userManager.isUserUnlocked();
                com.google.android.gms.internal.clearcut.a.f2359b = z;
                if (z) {
                    com.google.android.gms.internal.clearcut.a.f2358a = null;
                }
            }
            a4Var.H = !z;
            ((d) a.this.f5242i).getClass();
            a4Var.f2373q = System.currentTimeMillis();
            ((d) a.this.f5242i).getClass();
            a4Var.f2374r = SystemClock.elapsedRealtime();
            a4Var.C = (long) (TimeZone.getDefault().getOffset(a4Var.f2373q) / 1000);
            a4Var.f2378x = bArr;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: com.google.android.gms.internal.clearcut.p0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: com.google.android.gms.internal.clearcut.v3$b} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x0210  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x0254  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r18 = this;
                r1 = r18
                boolean r0 = r1.f5248f
                if (r0 != 0) goto L_0x0264
                r2 = 1
                r1.f5248f = r2
                h4.f r3 = new h4.f
                com.google.android.gms.internal.clearcut.i4 r0 = new com.google.android.gms.internal.clearcut.i4
                h4.a r11 = h4.a.this
                java.lang.String r5 = r11.f5236b
                int r6 = r11.f5237c
                int r7 = r1.f5244a
                java.lang.String r8 = r1.f5245b
                java.lang.String r9 = r1.f5246c
                com.google.android.gms.internal.clearcut.t3 r10 = r1.d
                r4 = r0
                r4.<init>(r5, r6, r7, r8, r9, r10)
                k4.a<java.lang.Object> r4 = h4.a.f5234k
                com.google.android.gms.internal.clearcut.a4 r4 = r1.f5247e
                r3.<init>(r0, r4)
                h4.a$b r0 = r11.f5243j
                com.google.android.gms.internal.clearcut.h4 r0 = (com.google.android.gms.internal.clearcut.h4) r0
                r0.getClass()
                com.google.android.gms.internal.clearcut.i4 r4 = r3.f5253o
                java.lang.String r5 = r4.u
                r6 = 0
                com.google.android.gms.internal.clearcut.a4 r7 = r3.w
                if (r7 == 0) goto L_0x0039
                int r7 = r7.f2376t
                goto L_0x003a
            L_0x0039:
                r7 = r6
            L_0x003a:
                com.google.android.gms.internal.clearcut.g r8 = com.google.android.gms.internal.clearcut.h4.f2458i
                java.lang.Object r8 = r8.a()
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                r9 = 0
                int r4 = r4.f2468q
                android.content.Context r10 = r0.f2459a
                if (r8 != 0) goto L_0x0186
                if (r5 == 0) goto L_0x0056
                boolean r0 = r5.isEmpty()
                if (r0 != 0) goto L_0x0056
                goto L_0x005e
            L_0x0056:
                if (r4 < 0) goto L_0x005d
                java.lang.String r5 = java.lang.String.valueOf(r4)
                goto L_0x005e
            L_0x005d:
                r5 = r9
            L_0x005e:
                if (r5 == 0) goto L_0x020d
                if (r10 == 0) goto L_0x008b
                boolean r0 = com.google.android.gms.internal.clearcut.h4.c(r10)
                if (r0 != 0) goto L_0x0069
                goto L_0x008b
            L_0x0069:
                java.util.HashMap<java.lang.String, com.google.android.gms.internal.clearcut.e<java.lang.String>> r0 = com.google.android.gms.internal.clearcut.h4.f2455f
                java.lang.Object r4 = r0.get(r5)
                com.google.android.gms.internal.clearcut.e r4 = (com.google.android.gms.internal.clearcut.e) r4
                if (r4 != 0) goto L_0x0083
                com.google.android.gms.internal.clearcut.l r4 = com.google.android.gms.internal.clearcut.h4.d
                r4.getClass()
                java.lang.Object r7 = com.google.android.gms.internal.clearcut.e.f2401g
                com.google.android.gms.internal.clearcut.h r7 = new com.google.android.gms.internal.clearcut.h
                r7.<init>(r4, r5)
                r0.put(r5, r7)
                r4 = r7
            L_0x0083:
                java.lang.Object r0 = r4.a()
                java.lang.String r0 = (java.lang.String) r0
                r4 = r0
                goto L_0x008c
            L_0x008b:
                r4 = r9
            L_0x008c:
                if (r4 != 0) goto L_0x0090
                goto L_0x016a
            L_0x0090:
                r0 = 44
                int r0 = r4.indexOf(r0)
                if (r0 < 0) goto L_0x009e
                java.lang.String r5 = r4.substring(r6, r0)
                int r0 = r0 + r2
                goto L_0x00a1
            L_0x009e:
                java.lang.String r5 = ""
                r0 = r6
            L_0x00a1:
                r7 = 47
                int r7 = r4.indexOf(r7, r0)
                java.lang.String r8 = "LogSamplerImpl"
                if (r7 > 0) goto L_0x00c0
                int r0 = r4.length()
                java.lang.String r5 = "Failed to parse the rule: "
                if (r0 == 0) goto L_0x00b9
                java.lang.String r0 = r5.concat(r4)
                goto L_0x0150
            L_0x00b9:
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5)
                goto L_0x0150
            L_0x00c0:
                java.lang.String r0 = r4.substring(r0, r7)     // Catch:{ NumberFormatException -> 0x0154 }
                long r12 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0154 }
                int r7 = r7 + r2
                java.lang.String r0 = r4.substring(r7)     // Catch:{ NumberFormatException -> 0x0154 }
                long r14 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0154 }
                r16 = 0
                int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
                if (r0 < 0) goto L_0x0135
                int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r0 >= 0) goto L_0x00dc
                goto L_0x0135
            L_0x00dc:
                com.google.android.gms.internal.clearcut.v3$b$a r0 = com.google.android.gms.internal.clearcut.v3.b.w()
                r0.m()
                MessageType r4 = r0.f2515p
                com.google.android.gms.internal.clearcut.v3$b r4 = (com.google.android.gms.internal.clearcut.v3.b) r4
                com.google.android.gms.internal.clearcut.v3.b.q(r4, r5)
                r0.m()
                MessageType r4 = r0.f2515p
                com.google.android.gms.internal.clearcut.v3$b r4 = (com.google.android.gms.internal.clearcut.v3.b) r4
                com.google.android.gms.internal.clearcut.v3.b.p(r4, r12)
                r0.m()
                MessageType r4 = r0.f2515p
                com.google.android.gms.internal.clearcut.v3$b r4 = (com.google.android.gms.internal.clearcut.v3.b) r4
                com.google.android.gms.internal.clearcut.v3.b.r(r4, r14)
                com.google.android.gms.internal.clearcut.p0 r0 = r0.n()
                java.lang.Object r4 = r0.e(r2)
                java.lang.Byte r4 = (java.lang.Byte) r4
                byte r4 = r4.byteValue()
                if (r4 != r2) goto L_0x0110
                r4 = r2
                goto L_0x0129
            L_0x0110:
                if (r4 != 0) goto L_0x0114
                r4 = r6
                goto L_0x0129
            L_0x0114:
                com.google.android.gms.internal.clearcut.d2 r4 = com.google.android.gms.internal.clearcut.d2.f2398c
                r4.getClass()
                java.lang.Class r5 = r0.getClass()
                com.google.android.gms.internal.clearcut.i2 r4 = r4.a(r5)
                boolean r4 = r4.h(r0)
                r5 = 2
                r0.e(r5)
            L_0x0129:
                if (r4 == 0) goto L_0x012f
                r9 = r0
                com.google.android.gms.internal.clearcut.v3$b r9 = (com.google.android.gms.internal.clearcut.v3.b) r9
                goto L_0x016a
            L_0x012f:
                com.google.android.gms.internal.clearcut.t2 r0 = new com.google.android.gms.internal.clearcut.t2
                r0.<init>()
                throw r0
            L_0x0135:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r4 = 72
                r0.<init>(r4)
                java.lang.String r4 = "negative values not supported: "
                r0.append(r4)
                r0.append(r12)
                java.lang.String r4 = "/"
                r0.append(r4)
                r0.append(r14)
                java.lang.String r0 = r0.toString()
            L_0x0150:
                android.util.Log.e(r8, r0)
                goto L_0x016a
            L_0x0154:
                r0 = move-exception
                int r5 = r4.length()
                java.lang.String r7 = "parseLong() failed while parsing: "
                if (r5 == 0) goto L_0x0162
                java.lang.String r4 = r7.concat(r4)
                goto L_0x0167
            L_0x0162:
                java.lang.String r4 = new java.lang.String
                r4.<init>(r7)
            L_0x0167:
                android.util.Log.e(r8, r4, r0)
            L_0x016a:
                if (r9 == 0) goto L_0x020d
                java.lang.String r0 = r9.t()
                long r4 = com.google.android.gms.internal.clearcut.h4.d(r10)
                long r12 = com.google.android.gms.internal.clearcut.h4.a(r0, r4)
                long r14 = r9.u()
                long r16 = r9.v()
                boolean r0 = com.google.android.gms.internal.clearcut.h4.b(r12, r14, r16)
                goto L_0x020e
            L_0x0186:
                if (r5 == 0) goto L_0x018f
                boolean r0 = r5.isEmpty()
                if (r0 != 0) goto L_0x018f
                goto L_0x0197
            L_0x018f:
                if (r4 < 0) goto L_0x0196
                java.lang.String r5 = java.lang.String.valueOf(r4)
                goto L_0x0197
            L_0x0196:
                r5 = r9
            L_0x0197:
                if (r5 == 0) goto L_0x020d
                if (r10 != 0) goto L_0x01a0
                java.util.List r0 = java.util.Collections.emptyList()
                goto L_0x01cf
            L_0x01a0:
                java.util.concurrent.ConcurrentHashMap<java.lang.String, com.google.android.gms.internal.clearcut.e<com.google.android.gms.internal.clearcut.v3>> r0 = com.google.android.gms.internal.clearcut.h4.f2454e
                java.lang.Object r4 = r0.get(r5)
                com.google.android.gms.internal.clearcut.e r4 = (com.google.android.gms.internal.clearcut.e) r4
                if (r4 != 0) goto L_0x01c5
                com.google.android.gms.internal.clearcut.v3 r4 = com.google.android.gms.internal.clearcut.v3.p()
                com.google.android.gms.internal.clearcut.l r8 = com.google.android.gms.internal.clearcut.h4.f2453c
                r8.getClass()
                java.lang.Object r9 = com.google.android.gms.internal.clearcut.e.f2401g
                com.google.android.gms.internal.clearcut.i r9 = new com.google.android.gms.internal.clearcut.i
                r9.<init>(r8, r5, r4)
                java.lang.Object r0 = r0.putIfAbsent(r5, r9)
                r4 = r0
                com.google.android.gms.internal.clearcut.e r4 = (com.google.android.gms.internal.clearcut.e) r4
                if (r4 == 0) goto L_0x01c4
                goto L_0x01c5
            L_0x01c4:
                r4 = r9
            L_0x01c5:
                java.lang.Object r0 = r4.a()
                com.google.android.gms.internal.clearcut.v3 r0 = (com.google.android.gms.internal.clearcut.v3) r0
                com.google.android.gms.internal.clearcut.u0 r0 = r0.o()
            L_0x01cf:
                java.util.Iterator r0 = r0.iterator()
            L_0x01d3:
                boolean r4 = r0.hasNext()
                if (r4 == 0) goto L_0x020d
                java.lang.Object r4 = r0.next()
                com.google.android.gms.internal.clearcut.v3$b r4 = (com.google.android.gms.internal.clearcut.v3.b) r4
                boolean r5 = r4.s()
                if (r5 == 0) goto L_0x01f1
                int r5 = r4.o()
                if (r5 == 0) goto L_0x01f1
                int r5 = r4.o()
                if (r5 != r7) goto L_0x01d3
            L_0x01f1:
                java.lang.String r5 = r4.t()
                long r8 = com.google.android.gms.internal.clearcut.h4.d(r10)
                long r12 = com.google.android.gms.internal.clearcut.h4.a(r5, r8)
                long r14 = r4.u()
                long r16 = r4.v()
                boolean r4 = com.google.android.gms.internal.clearcut.h4.b(r12, r14, r16)
                if (r4 != 0) goto L_0x01d3
                r0 = r6
                goto L_0x020e
            L_0x020d:
                r0 = r2
            L_0x020e:
                if (r0 == 0) goto L_0x0254
                h4.c r0 = r11.f5241h
                com.google.android.gms.internal.clearcut.c2 r0 = (com.google.android.gms.internal.clearcut.c2) r0
                r0.getClass()
                com.google.android.gms.internal.clearcut.z3 r4 = new com.google.android.gms.internal.clearcut.z3
                l4.r r5 = r0.f6693g
                r4.<init>(r3, r5)
                boolean r3 = r4.f2332f
                if (r3 != 0) goto L_0x0232
                l4.c0 r3 = com.google.android.gms.common.api.internal.BasePendingResult.f2327g
                java.lang.Object r3 = r3.get()
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                if (r3 == 0) goto L_0x0231
                goto L_0x0232
            L_0x0231:
                r2 = r6
            L_0x0232:
                r4.f2332f = r2
                l4.d r2 = r0.f6694h
                r2.getClass()
                l4.y r3 = new l4.y
                r3.<init>(r4)
                z4.c r4 = r2.f6891i
                l4.s r5 = new l4.s
                java.util.concurrent.atomic.AtomicInteger r2 = r2.f6888f
                int r2 = r2.get()
                r5.<init>(r3, r2, r0)
                r0 = 4
                android.os.Message r0 = r4.obtainMessage(r0, r5)
                r4.sendMessage(r0)
                return
            L_0x0254:
                com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.f2320t
                java.lang.String r2 = "Result must not be null"
                n4.m.i(r0, r2)
                l4.i r2 = new l4.i
                r2.<init>()
                r2.c(r0)
                return
            L_0x0264:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "do not reuse LogEventBuilder"
                r0.<init>(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: h4.a.C0076a.a():void");
        }
    }

    public interface b {
    }

    public a(Context context) {
        c2 c2Var = new c2(context);
        d dVar = d.f8428a;
        h4 h4Var = new h4(context);
        this.f5235a = context;
        this.f5236b = context.getPackageName();
        int i10 = 0;
        try {
            i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.wtf("ClearcutLogger", "This can't happen.", e10);
        }
        this.f5237c = i10;
        this.f5238e = -1;
        this.d = "VISION";
        this.f5239f = null;
        this.f5241h = c2Var;
        this.f5242i = dVar;
        this.f5240g = t3.DEFAULT;
        this.f5243j = h4Var;
    }
}

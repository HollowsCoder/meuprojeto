package k4;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import k4.a;
import k4.a.c;
import l4.d;
import l4.r;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

public class c<O extends a.c> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f6688a;

    /* renamed from: b  reason: collision with root package name */
    public final a<O> f6689b;

    /* renamed from: c  reason: collision with root package name */
    public final O f6690c;
    public final l4.a<O> d;

    /* renamed from: e  reason: collision with root package name */
    public final Looper f6691e;

    /* renamed from: f  reason: collision with root package name */
    public final int f6692f;
    @NotOnlyInitialized

    /* renamed from: g  reason: collision with root package name */
    public final r f6693g;

    /* renamed from: h  reason: collision with root package name */
    public final d f6694h;

    public static class a {
        @RecentlyNonNull

        /* renamed from: a  reason: collision with root package name */
        public final Looper f6695a;

        static {
            Looper.getMainLooper();
        }

        public a(q0.d dVar, Looper looper) {
            this.f6695a = looper;
        }
    }

    public c() {
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a5  */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(@androidx.annotation.RecentlyNonNull android.content.Context r6, @androidx.annotation.RecentlyNonNull k4.a r7, @androidx.annotation.RecentlyNonNull q0.d r8) {
        /*
            r5 = this;
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            k4.c$a r1 = new k4.c$a
            r1.<init>(r8, r0)
            r5.<init>()
            if (r6 == 0) goto L_0x00f1
            if (r7 == 0) goto L_0x00e9
            android.content.Context r8 = r6.getApplicationContext()
            r5.f6688a = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            r2 = 1
            r3 = 0
            if (r8 < r0) goto L_0x0020
            r0 = r2
            goto L_0x0021
        L_0x0020:
            r0 = r3
        L_0x0021:
            if (r0 != 0) goto L_0x0024
            goto L_0x0051
        L_0x0024:
            r0 = 30
            if (r8 < r0) goto L_0x0034
            java.lang.String r8 = android.os.Build.VERSION.CODENAME
            java.lang.String r0 = "REL"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0034
            goto L_0x00a3
        L_0x0034:
            java.lang.String r8 = android.os.Build.VERSION.CODENAME
            int r0 = r8.length()
            if (r0 != r2) goto L_0x004e
            char r0 = r8.charAt(r3)
            r4 = 82
            if (r0 < r4) goto L_0x004e
            char r8 = r8.charAt(r3)
            r0 = 90
            if (r8 > r0) goto L_0x004e
            r8 = r2
            goto L_0x004f
        L_0x004e:
            r8 = r3
        L_0x004f:
            if (r8 != 0) goto L_0x0053
        L_0x0051:
            r2 = r3
            goto L_0x00a3
        L_0x0053:
            java.lang.Boolean r8 = r4.g.f8434a
            if (r8 == 0) goto L_0x0058
            goto L_0x009f
        L_0x0058:
            java.lang.String r8 = "google"
            java.lang.String r0 = android.os.Build.BRAND     // Catch:{ NumberFormatException -> 0x008a }
            boolean r8 = r8.equals(r0)     // Catch:{ NumberFormatException -> 0x008a }
            if (r8 == 0) goto L_0x0082
            java.lang.String r8 = android.os.Build.ID     // Catch:{ NumberFormatException -> 0x008a }
            java.lang.String r0 = "RPP1"
            boolean r8 = r8.startsWith(r0)     // Catch:{ NumberFormatException -> 0x008a }
            if (r8 != 0) goto L_0x0082
            java.lang.String r8 = android.os.Build.ID     // Catch:{ NumberFormatException -> 0x008a }
            java.lang.String r0 = "RPP2"
            boolean r8 = r8.startsWith(r0)     // Catch:{ NumberFormatException -> 0x008a }
            if (r8 != 0) goto L_0x0082
            java.lang.String r8 = android.os.Build.VERSION.INCREMENTAL     // Catch:{ NumberFormatException -> 0x008a }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x008a }
            r0 = 6301457(0x602711, float:8.830222E-39)
            if (r8 < r0) goto L_0x0082
            goto L_0x0083
        L_0x0082:
            r2 = r3
        L_0x0083:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)     // Catch:{ NumberFormatException -> 0x008a }
            r4.g.f8434a = r8     // Catch:{ NumberFormatException -> 0x008a }
            goto L_0x008e
        L_0x008a:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r4.g.f8434a = r8
        L_0x008e:
            java.lang.Boolean r8 = r4.g.f8434a
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x009d
            java.lang.String r8 = "PlatformVersion"
            java.lang.String r0 = "Build version must be at least 6301457 to support R in gmscore"
            android.util.Log.w(r8, r0)
        L_0x009d:
            java.lang.Boolean r8 = r4.g.f8434a
        L_0x009f:
            boolean r2 = r8.booleanValue()
        L_0x00a3:
            if (r2 == 0) goto L_0x00b7
            java.lang.Class<android.content.Context> r8 = android.content.Context.class
            java.lang.String r0 = "getAttributionTag"
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00b7 }
            java.lang.reflect.Method r8 = r8.getMethod(r0, r2)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00b7 }
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00b7 }
            java.lang.Object r6 = r8.invoke(r6, r0)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00b7 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00b7 }
        L_0x00b7:
            r5.f6689b = r7
            r6 = 0
            r5.f6690c = r6
            android.os.Looper r6 = r1.f6695a
            r5.f6691e = r6
            l4.a r6 = new l4.a
            r6.<init>(r7)
            r5.d = r6
            l4.r r6 = new l4.r
            r6.<init>(r5)
            r5.f6693g = r6
            android.content.Context r6 = r5.f6688a
            l4.d r6 = l4.d.a(r6)
            r5.f6694h = r6
            java.util.concurrent.atomic.AtomicInteger r7 = r6.f6887e
            int r7 = r7.getAndIncrement()
            r5.f6692f = r7
            z4.c r6 = r6.f6891i
            r7 = 7
            android.os.Message r7 = r6.obtainMessage(r7, r5)
            r6.sendMessage(r7)
            return
        L_0x00e9:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "Api must not be null."
            r6.<init>(r7)
            throw r6
        L_0x00f1:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "Null context is not permitted."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.c.<init>(android.content.Context, k4.a, q0.d):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
    @androidx.annotation.RecentlyNonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final n4.c.a a() {
        /*
            r6 = this;
            n4.c$a r0 = new n4.c$a
            r0.<init>()
            O r1 = r6.f6690c
            boolean r2 = r1 instanceof k4.a.c.b
            if (r2 == 0) goto L_0x0021
            r3 = r1
            k4.a$c$b r3 = (k4.a.c.b) r3
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r3 = r3.b()
            if (r3 == 0) goto L_0x0021
            java.lang.String r3 = r3.f2310r
            if (r3 != 0) goto L_0x0019
            goto L_0x002d
        L_0x0019:
            android.accounts.Account r4 = new android.accounts.Account
            java.lang.String r5 = "com.google"
            r4.<init>(r3, r5)
            goto L_0x002e
        L_0x0021:
            boolean r3 = r1 instanceof k4.a.c.C0094a
            if (r3 == 0) goto L_0x002d
            r3 = r1
            k4.a$c$a r3 = (k4.a.c.C0094a) r3
            android.accounts.Account r4 = r3.a()
            goto L_0x002e
        L_0x002d:
            r4 = 0
        L_0x002e:
            r0.f7407a = r4
            if (r2 == 0) goto L_0x003f
            k4.a$c$b r1 = (k4.a.c.b) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.b()
            if (r1 == 0) goto L_0x003f
            java.util.HashSet r1 = r1.g0()
            goto L_0x0043
        L_0x003f:
            java.util.Set r1 = java.util.Collections.emptySet()
        L_0x0043:
            n.d<com.google.android.gms.common.api.Scope> r2 = r0.f7408b
            if (r2 != 0) goto L_0x004e
            n.d r2 = new n.d
            r2.<init>()
            r0.f7408b = r2
        L_0x004e:
            n.d<com.google.android.gms.common.api.Scope> r2 = r0.f7408b
            r2.addAll(r1)
            android.content.Context r1 = r6.f6688a
            java.lang.Class r2 = r1.getClass()
            java.lang.String r2 = r2.getName()
            r0.d = r2
            java.lang.String r1 = r1.getPackageName()
            r0.f7409c = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.c.a():n4.c$a");
    }
}

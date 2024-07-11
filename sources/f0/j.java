package f0;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n.g;
import n.i;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final g<String, Typeface> f4571a = new g<>(16);

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadPoolExecutor f4572b;

    /* renamed from: c  reason: collision with root package name */
    public static final Object f4573c = new Object();
    public static final i<String, ArrayList<h0.a<a>>> d = new i<>();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Typeface f4574a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4575b;

        public a(int i10) {
            this.f4574a = null;
            this.f4575b = i10;
        }

        @SuppressLint({"WrongConstant"})
        public a(Typeface typeface) {
            this.f4574a = typeface;
            this.f4575b = 0;
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new m());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f4572b = threadPoolExecutor;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static f0.j.a a(java.lang.String r6, android.content.Context r7, f0.e r8, int r9) {
        /*
            n.g<java.lang.String, android.graphics.Typeface> r0 = f4571a
            java.lang.Object r1 = r0.b(r6)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0010
            f0.j$a r6 = new f0.j$a
            r6.<init>((android.graphics.Typeface) r1)
            return r6
        L_0x0010:
            f0.k r8 = f0.d.a(r7, r8)     // Catch:{ NameNotFoundException -> 0x005b }
            r1 = 1
            r2 = -3
            f0.l[] r3 = r8.f4577b
            int r8 = r8.f4576a
            if (r8 == 0) goto L_0x0021
            if (r8 == r1) goto L_0x001f
            goto L_0x0034
        L_0x001f:
            r8 = -2
            goto L_0x003c
        L_0x0021:
            if (r3 == 0) goto L_0x003b
            int r8 = r3.length
            if (r8 != 0) goto L_0x0027
            goto L_0x003b
        L_0x0027:
            int r8 = r3.length
            r1 = 0
            r4 = r1
        L_0x002a:
            if (r4 >= r8) goto L_0x003b
            r5 = r3[r4]
            int r5 = r5.f4581e
            if (r5 == 0) goto L_0x0038
            if (r5 >= 0) goto L_0x0036
        L_0x0034:
            r8 = r2
            goto L_0x003c
        L_0x0036:
            r8 = r5
            goto L_0x003c
        L_0x0038:
            int r4 = r4 + 1
            goto L_0x002a
        L_0x003b:
            r8 = r1
        L_0x003c:
            if (r8 == 0) goto L_0x0044
            f0.j$a r6 = new f0.j$a
            r6.<init>((int) r8)
            return r6
        L_0x0044:
            b0.l r8 = b0.e.f1935a
            android.graphics.Typeface r7 = r8.b(r7, r3, r9)
            if (r7 == 0) goto L_0x0055
            r0.c(r6, r7)
            f0.j$a r6 = new f0.j$a
            r6.<init>((android.graphics.Typeface) r7)
            return r6
        L_0x0055:
            f0.j$a r6 = new f0.j$a
            r6.<init>((int) r2)
            return r6
        L_0x005b:
            f0.j$a r6 = new f0.j$a
            r7 = -1
            r6.<init>((int) r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.j.a(java.lang.String, android.content.Context, f0.e, int):f0.j$a");
    }
}

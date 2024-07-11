package z3;

import t3.j;
import t3.s;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ m f9885o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ s f9886p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f9887q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Runnable f9888r;

    public /* synthetic */ f(m mVar, j jVar, int i10, Runnable runnable) {
        this.f9885o = mVar;
        this.f9886p = jVar;
        this.f9887q = i10;
        this.f9888r = runnable;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r3.d.a(r0, r1 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        r2.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0043 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            t3.s r0 = r9.f9886p
            int r1 = r9.f9887q
            java.lang.Runnable r2 = r9.f9888r
            z3.m r3 = r9.f9885o
            b4.b r4 = r3.f9910f
            r5 = 1
            a4.d r6 = r3.f9908c     // Catch:{ a -> 0x0043 }
            java.util.Objects.requireNonNull(r6)     // Catch:{ a -> 0x0043 }
            d2.b r7 = new d2.b     // Catch:{ a -> 0x0043 }
            r8 = 3
            r7.<init>(r8, r6)     // Catch:{ a -> 0x0043 }
            r4.c(r7)     // Catch:{ a -> 0x0043 }
            android.content.Context r6 = r3.f9906a     // Catch:{ a -> 0x0043 }
            java.lang.String r7 = "connectivity"
            java.lang.Object r6 = r6.getSystemService(r7)     // Catch:{ a -> 0x0043 }
            android.net.ConnectivityManager r6 = (android.net.ConnectivityManager) r6     // Catch:{ a -> 0x0043 }
            android.net.NetworkInfo r6 = r6.getActiveNetworkInfo()     // Catch:{ a -> 0x0043 }
            if (r6 == 0) goto L_0x0031
            boolean r6 = r6.isConnected()     // Catch:{ a -> 0x0043 }
            if (r6 == 0) goto L_0x0031
            r6 = r5
            goto L_0x0032
        L_0x0031:
            r6 = 0
        L_0x0032:
            if (r6 != 0) goto L_0x003d
            z3.g r6 = new z3.g     // Catch:{ a -> 0x0043 }
            r6.<init>(r3, r0, r1)     // Catch:{ a -> 0x0043 }
            r4.c(r6)     // Catch:{ a -> 0x0043 }
            goto L_0x0049
        L_0x003d:
            r3.a(r0, r1)     // Catch:{ a -> 0x0043 }
            goto L_0x0049
        L_0x0041:
            r0 = move-exception
            goto L_0x004d
        L_0x0043:
            z3.q r3 = r3.d     // Catch:{ all -> 0x0041 }
            int r1 = r1 + r5
            r3.a(r0, r1)     // Catch:{ all -> 0x0041 }
        L_0x0049:
            r2.run()
            return
        L_0x004d:
            r2.run()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.f.run():void");
    }
}

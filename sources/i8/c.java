package i8;

public final class c implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ a f6145o;

    public c(a aVar) {
        this.f6145o = aVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:12|13|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        android.util.Log.e(r0.getSimpleName(), "Cannot remove from parent layout");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0032 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
            java.lang.Class<i8.c> r0 = i8.c.class
            i8.a r1 = r3.f6145o
            android.view.ViewParent r2 = r1.getParent()     // Catch:{ Exception -> 0x003c }
            if (r2 == 0) goto L_0x0048
            android.view.ViewParent r2 = r1.getParent()     // Catch:{ Exception -> 0x0032 }
            if (r2 == 0) goto L_0x002a
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch:{ Exception -> 0x0032 }
            r2.removeView(r1)     // Catch:{ Exception -> 0x0032 }
            i8.h r1 = r1.getOnHideListener$alerter_release()     // Catch:{ Exception -> 0x0032 }
            if (r1 == 0) goto L_0x0048
            v1.a r1 = (v1.a) r1     // Catch:{ Exception -> 0x0032 }
            java.lang.Object r1 = r1.f9118o     // Catch:{ Exception -> 0x0032 }
            v1.b r1 = (v1.b) r1     // Catch:{ Exception -> 0x0032 }
            java.lang.String r2 = "this$0"
            z8.g.f(r1, r2)     // Catch:{ Exception -> 0x0032 }
            r2 = 0
            r1.G = r2     // Catch:{ Exception -> 0x0032 }
            goto L_0x0048
        L_0x002a:
            n8.g r1 = new n8.g     // Catch:{ Exception -> 0x0032 }
            java.lang.String r2 = "null cannot be cast to non-null type android.view.ViewGroup"
            r1.<init>(r2)     // Catch:{ Exception -> 0x0032 }
            throw r1     // Catch:{ Exception -> 0x0032 }
        L_0x0032:
            java.lang.String r1 = r0.getSimpleName()     // Catch:{ Exception -> 0x003c }
            java.lang.String r2 = "Cannot remove from parent layout"
            android.util.Log.e(r1, r2)     // Catch:{ Exception -> 0x003c }
            goto L_0x0048
        L_0x003c:
            r1 = move-exception
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = android.util.Log.getStackTraceString(r1)
            android.util.Log.e(r0, r1)
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.c.run():void");
    }
}

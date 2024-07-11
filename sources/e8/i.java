package e8;

import java.util.concurrent.Callable;

public final /* synthetic */ class i implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4529a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4530b;

    public /* synthetic */ i(int i10, Object obj) {
        this.f4529a = i10;
        this.f4530b = obj;
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [f8.e] */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (r2 != null) goto L_0x0047;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r7 = this;
            int r0 = r7.f4529a
            switch(r0) {
                case 0: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x000f
        L_0x0006:
            java.lang.Object r0 = r7.f4530b
            e8.k r0 = (e8.k) r0
            e8.c r0 = r0.c()
            return r0
        L_0x000f:
            java.lang.Object r0 = r7.f4530b
            f8.i r0 = (f8.i) r0
            monitor-enter(r0)
            r1 = 0
            android.content.Context r2 = r0.f4924a     // Catch:{ FileNotFoundException | JSONException -> 0x0044, all -> 0x003d }
            java.lang.String r3 = r0.f4925b     // Catch:{ FileNotFoundException | JSONException -> 0x0044, all -> 0x003d }
            java.io.FileInputStream r2 = r2.openFileInput(r3)     // Catch:{ FileNotFoundException | JSONException -> 0x0044, all -> 0x003d }
            int r3 = r2.available()     // Catch:{ FileNotFoundException | JSONException -> 0x0045, all -> 0x0038 }
            byte[] r4 = new byte[r3]     // Catch:{ FileNotFoundException | JSONException -> 0x0045, all -> 0x0038 }
            r5 = 0
            r2.read(r4, r5, r3)     // Catch:{ FileNotFoundException | JSONException -> 0x0045, all -> 0x0038 }
            java.lang.String r3 = new java.lang.String     // Catch:{ FileNotFoundException | JSONException -> 0x0045, all -> 0x0038 }
            java.lang.String r5 = "UTF-8"
            r3.<init>(r4, r5)     // Catch:{ FileNotFoundException | JSONException -> 0x0045, all -> 0x0038 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ FileNotFoundException | JSONException -> 0x0045, all -> 0x0038 }
            r4.<init>(r3)     // Catch:{ FileNotFoundException | JSONException -> 0x0045, all -> 0x0038 }
            f8.e r1 = f8.e.a(r4)     // Catch:{ FileNotFoundException | JSONException -> 0x0045, all -> 0x0038 }
            goto L_0x0047
        L_0x0038:
            r1 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L_0x003e
        L_0x003d:
            r2 = move-exception
        L_0x003e:
            if (r1 == 0) goto L_0x0043
            r1.close()     // Catch:{ all -> 0x004b }
        L_0x0043:
            throw r2     // Catch:{ all -> 0x004b }
        L_0x0044:
            r2 = r1
        L_0x0045:
            if (r2 == 0) goto L_0x004e
        L_0x0047:
            r2.close()     // Catch:{ all -> 0x004b }
            goto L_0x004e
        L_0x004b:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x004e:
            monitor-exit(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.i.call():java.lang.Object");
    }
}

package e7;

import android.util.Log;
import d7.e;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public final class d implements a {
    public static final Charset d = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final File f4509a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4510b = 65536;

    /* renamed from: c  reason: collision with root package name */
    public c f4511c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f4512a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4513b;

        public a(int i10, byte[] bArr) {
            this.f4512a = bArr;
            this.f4513b = i10;
        }
    }

    public d(File file) {
        this.f4509a = file;
    }

    public final void a() {
        e.a(this.f4511c, "There was a problem closing the Crashlytics log file.");
        this.f4511c = null;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005c, code lost:
        android.util.Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", r4);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String b() {
        /*
            r10 = this;
            java.io.File r0 = r10.f4509a
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L_0x000b
            goto L_0x0012
        L_0x000b:
            r10.d()
            e7.c r0 = r10.f4511c
            if (r0 != 0) goto L_0x0014
        L_0x0012:
            r4 = r1
            goto L_0x006a
        L_0x0014:
            r3 = 1
            int[] r3 = new int[r3]
            r3[r2] = r2
            int r0 = r0.l()
            byte[] r0 = new byte[r0]
            e7.c r4 = r10.f4511c     // Catch:{ IOException -> 0x005b }
            monitor-enter(r4)     // Catch:{ IOException -> 0x005b }
            e7.c$a r5 = r4.f4500r     // Catch:{ all -> 0x0058 }
            int r5 = r5.f4504a     // Catch:{ all -> 0x0058 }
            r6 = r2
        L_0x0027:
            int r7 = r4.f4499q     // Catch:{ all -> 0x0058 }
            if (r6 >= r7) goto L_0x0056
            e7.c$a r5 = r4.c(r5)     // Catch:{ all -> 0x0058 }
            e7.c$b r7 = new e7.c$b     // Catch:{ all -> 0x0058 }
            r7.<init>(r5)     // Catch:{ all -> 0x0058 }
            int r8 = r5.f4505b     // Catch:{ all -> 0x0058 }
            r9 = r3[r2]     // Catch:{ all -> 0x0051 }
            r7.read(r0, r9, r8)     // Catch:{ all -> 0x0051 }
            r9 = r3[r2]     // Catch:{ all -> 0x0051 }
            int r9 = r9 + r8
            r3[r2] = r9     // Catch:{ all -> 0x0051 }
            r7.close()     // Catch:{ all -> 0x0058 }
            int r7 = r5.f4504a     // Catch:{ all -> 0x0058 }
            int r7 = r7 + 4
            int r5 = r5.f4505b     // Catch:{ all -> 0x0058 }
            int r7 = r7 + r5
            int r5 = r4.n(r7)     // Catch:{ all -> 0x0058 }
            int r6 = r6 + 1
            goto L_0x0027
        L_0x0051:
            r5 = move-exception
            r7.close()     // Catch:{ all -> 0x0058 }
            throw r5     // Catch:{ all -> 0x0058 }
        L_0x0056:
            monitor-exit(r4)     // Catch:{ IOException -> 0x005b }
            goto L_0x0063
        L_0x0058:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ IOException -> 0x005b }
            throw r5     // Catch:{ IOException -> 0x005b }
        L_0x005b:
            r4 = move-exception
            java.lang.String r5 = "FirebaseCrashlytics"
            java.lang.String r6 = "A problem occurred while reading the Crashlytics log file."
            android.util.Log.e(r5, r6, r4)
        L_0x0063:
            e7.d$a r4 = new e7.d$a
            r3 = r3[r2]
            r4.<init>(r3, r0)
        L_0x006a:
            if (r4 != 0) goto L_0x006e
            r3 = r1
            goto L_0x0077
        L_0x006e:
            int r0 = r4.f4513b
            byte[] r3 = new byte[r0]
            byte[] r4 = r4.f4512a
            java.lang.System.arraycopy(r4, r2, r3, r2, r0)
        L_0x0077:
            if (r3 == 0) goto L_0x0080
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r0 = d
            r1.<init>(r3, r0)
        L_0x0080:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.d.b():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007a, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007b, code lost:
        android.util.Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(java.lang.String r6, long r7) {
        /*
            r5 = this;
            r5.d()
            java.lang.String r0 = " "
            int r1 = r5.f4510b
            java.lang.String r2 = "..."
            e7.c r3 = r5.f4511c
            if (r3 != 0) goto L_0x000f
            goto L_0x0082
        L_0x000f:
            if (r6 != 0) goto L_0x0013
            java.lang.String r6 = "null"
        L_0x0013:
            int r3 = r1 / 4
            int r4 = r6.length()     // Catch:{ IOException -> 0x007a }
            if (r4 <= r3) goto L_0x0030
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x007a }
            r4.<init>(r2)     // Catch:{ IOException -> 0x007a }
            int r2 = r6.length()     // Catch:{ IOException -> 0x007a }
            int r2 = r2 - r3
            java.lang.String r6 = r6.substring(r2)     // Catch:{ IOException -> 0x007a }
            r4.append(r6)     // Catch:{ IOException -> 0x007a }
            java.lang.String r6 = r4.toString()     // Catch:{ IOException -> 0x007a }
        L_0x0030:
            java.lang.String r2 = "\r"
            java.lang.String r6 = r6.replaceAll(r2, r0)     // Catch:{ IOException -> 0x007a }
            java.lang.String r2 = "\n"
            java.lang.String r6 = r6.replaceAll(r2, r0)     // Catch:{ IOException -> 0x007a }
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ IOException -> 0x007a }
            java.lang.String r2 = "%d %s%n"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x007a }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ IOException -> 0x007a }
            r8 = 0
            r3[r8] = r7     // Catch:{ IOException -> 0x007a }
            r7 = 1
            r3[r7] = r6     // Catch:{ IOException -> 0x007a }
            java.lang.String r6 = java.lang.String.format(r0, r2, r3)     // Catch:{ IOException -> 0x007a }
            java.nio.charset.Charset r0 = d     // Catch:{ IOException -> 0x007a }
            byte[] r6 = r6.getBytes(r0)     // Catch:{ IOException -> 0x007a }
            e7.c r0 = r5.f4511c     // Catch:{ IOException -> 0x007a }
            r0.a(r6)     // Catch:{ IOException -> 0x007a }
        L_0x005c:
            e7.c r6 = r5.f4511c     // Catch:{ IOException -> 0x007a }
            monitor-enter(r6)     // Catch:{ IOException -> 0x007a }
            int r0 = r6.f4499q     // Catch:{ all -> 0x0077 }
            if (r0 != 0) goto L_0x0065
            r0 = r7
            goto L_0x0066
        L_0x0065:
            r0 = r8
        L_0x0066:
            monitor-exit(r6)     // Catch:{ IOException -> 0x007a }
            if (r0 != 0) goto L_0x0082
            e7.c r6 = r5.f4511c     // Catch:{ IOException -> 0x007a }
            int r6 = r6.l()     // Catch:{ IOException -> 0x007a }
            if (r6 <= r1) goto L_0x0082
            e7.c r6 = r5.f4511c     // Catch:{ IOException -> 0x007a }
            r6.f()     // Catch:{ IOException -> 0x007a }
            goto L_0x005c
        L_0x0077:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ IOException -> 0x007a }
            throw r7     // Catch:{ IOException -> 0x007a }
        L_0x007a:
            r6 = move-exception
            java.lang.String r7 = "FirebaseCrashlytics"
            java.lang.String r8 = "There was a problem writing to the Crashlytics log."
            android.util.Log.e(r7, r8, r6)
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.d.c(java.lang.String, long):void");
    }

    public final void d() {
        File file = this.f4509a;
        if (this.f4511c == null) {
            try {
                this.f4511c = new c(file);
            } catch (IOException e10) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e10);
            }
        }
    }
}

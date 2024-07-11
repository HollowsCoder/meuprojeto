package i9;

import java.io.File;

public final class y extends b0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ File f6374b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ t f6375c;

    public y(File file, t tVar) {
        this.f6374b = file;
        this.f6375c = tVar;
    }

    public final long a() {
        return this.f6374b.length();
    }

    public final t b() {
        return this.f6375c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        s6.a.r(r0, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(w9.h r3) {
        /*
            r2 = this;
            java.util.logging.Logger r0 = w9.q.f9346a
            java.lang.String r0 = "$this$source"
            java.io.File r1 = r2.f6374b
            z8.g.f(r1, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
            w9.p r0 = n.e.H(r0)
            r3.N(r0)     // Catch:{ all -> 0x001a }
            r3 = 0
            s6.a.r(r0, r3)
            return
        L_0x001a:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x001c }
        L_0x001c:
            r1 = move-exception
            s6.a.r(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.y.c(w9.h):void");
    }
}

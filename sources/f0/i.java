package f0;

import f0.j;
import h0.a;

public final class i implements a<j.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f4570a;

    public i(String str) {
        this.f4570a = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r0 >= r2.size()) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        ((h0.a) r2.get(r0)).accept(r5);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r0 = 0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(f0.j.a r5) {
        /*
            r4 = this;
            java.lang.Object r0 = f0.j.f4573c
            monitor-enter(r0)
            n.i<java.lang.String, java.util.ArrayList<h0.a<f0.j$a>>> r1 = f0.j.d     // Catch:{ all -> 0x002c }
            java.lang.String r2 = r4.f4570a     // Catch:{ all -> 0x002c }
            r3 = 0
            java.lang.Object r2 = r1.getOrDefault(r2, r3)     // Catch:{ all -> 0x002c }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x002c }
            if (r2 != 0) goto L_0x0012
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return
        L_0x0012:
            java.lang.String r3 = r4.f4570a     // Catch:{ all -> 0x002c }
            r1.remove(r3)     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            r0 = 0
        L_0x0019:
            int r1 = r2.size()
            if (r0 >= r1) goto L_0x002b
            java.lang.Object r1 = r2.get(r0)
            h0.a r1 = (h0.a) r1
            r1.accept(r5)
            int r0 = r0 + 1
            goto L_0x0019
        L_0x002b:
            return
        L_0x002c:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.i.accept(f0.j$a):void");
    }
}

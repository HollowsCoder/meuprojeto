package p9;

import java.util.List;
import l9.a;

public final class m extends a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f f8042e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f8043f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ List f8044g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(String str, f fVar, int i10, List list) {
        super(str, true);
        this.f8042e = fVar;
        this.f8043f = i10;
        this.f8044g = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a() {
        /*
            r3 = this;
            p9.f r0 = r3.f8042e
            p9.u r0 = r0.z
            java.util.List r1 = r3.f8044g
            r0.getClass()
            java.lang.String r0 = "requestHeaders"
            z8.g.f(r1, r0)
            p9.f r0 = r3.f8042e     // Catch:{ IOException -> 0x002e }
            p9.s r0 = r0.M     // Catch:{ IOException -> 0x002e }
            int r1 = r3.f8043f     // Catch:{ IOException -> 0x002e }
            p9.b r2 = p9.b.CANCEL     // Catch:{ IOException -> 0x002e }
            r0.g(r1, r2)     // Catch:{ IOException -> 0x002e }
            p9.f r0 = r3.f8042e     // Catch:{ IOException -> 0x002e }
            monitor-enter(r0)     // Catch:{ IOException -> 0x002e }
            p9.f r1 = r3.f8042e     // Catch:{ all -> 0x002b }
            java.util.LinkedHashSet r1 = r1.O     // Catch:{ all -> 0x002b }
            int r2 = r3.f8043f     // Catch:{ all -> 0x002b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x002b }
            r1.remove(r2)     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ IOException -> 0x002e }
            goto L_0x002e
        L_0x002b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ IOException -> 0x002e }
            throw r1     // Catch:{ IOException -> 0x002e }
        L_0x002e:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.m.a():long");
    }
}

package g9;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.scheduling.g;
import n.e;
import p9.u;
import q8.d;
import x8.a;

public abstract class y<T> extends g {

    /* renamed from: q  reason: collision with root package name */
    public int f5054q;

    public y(int i10) {
        this.f5054q = i10;
    }

    public void a(Object obj, CancellationException cancellationException) {
    }

    public abstract d<T> c();

    public Throwable d(Object obj) {
        o oVar = obj instanceof o ? (o) obj : null;
        if (oVar == null) {
            return null;
        }
        return oVar.f5034a;
    }

    public <T> T f(Object obj) {
        return obj;
    }

    public final void g(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                u.b(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            z8.g.c(th);
            e.z(c().b(), new a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    public abstract Object i();

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006f, code lost:
        if (r4.S() != false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008d, code lost:
        if (r4.S() != false) goto L_0x008f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b A[Catch:{ all -> 0x0057, all -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059 A[Catch:{ all -> 0x0057, all -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006b A[SYNTHETIC, Splitter:B:29:0x006b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            kotlinx.coroutines.scheduling.h r0 = r12.f6830p
            q8.d r1 = r12.c()     // Catch:{ all -> 0x0093 }
            kotlinx.coroutines.internal.c r1 = (kotlinx.coroutines.internal.c) r1     // Catch:{ all -> 0x0093 }
            q8.d<T> r2 = r1.f6777s     // Catch:{ all -> 0x0093 }
            java.lang.Object r1 = r1.u     // Catch:{ all -> 0x0093 }
            q8.f r3 = r2.b()     // Catch:{ all -> 0x0093 }
            java.lang.Object r1 = kotlinx.coroutines.internal.m.c(r3, r1)     // Catch:{ all -> 0x0093 }
            d7.j0 r4 = kotlinx.coroutines.internal.m.f6795a     // Catch:{ all -> 0x0093 }
            r5 = 0
            if (r1 == r4) goto L_0x001e
            g9.c1 r4 = g9.r.a(r2, r3, r1)     // Catch:{ all -> 0x0093 }
            goto L_0x001f
        L_0x001e:
            r4 = r5
        L_0x001f:
            q8.f r6 = r2.b()     // Catch:{ all -> 0x0057 }
            java.lang.Object r7 = r12.i()     // Catch:{ all -> 0x0057 }
            java.lang.Throwable r8 = r12.d(r7)     // Catch:{ all -> 0x0057 }
            if (r8 != 0) goto L_0x0042
            int r9 = r12.f5054q     // Catch:{ all -> 0x0057 }
            r10 = 1
            if (r9 == r10) goto L_0x0037
            r11 = 2
            if (r9 != r11) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r10 = 0
        L_0x0037:
            if (r10 == 0) goto L_0x0042
            g9.l0$b r9 = g9.l0.b.f5025o     // Catch:{ all -> 0x0057 }
            q8.f$b r6 = r6.get(r9)     // Catch:{ all -> 0x0057 }
            g9.l0 r6 = (g9.l0) r6     // Catch:{ all -> 0x0057 }
            goto L_0x0043
        L_0x0042:
            r6 = r5
        L_0x0043:
            if (r6 == 0) goto L_0x0059
            boolean r9 = r6.a()     // Catch:{ all -> 0x0057 }
            if (r9 != 0) goto L_0x0059
            java.util.concurrent.CancellationException r6 = r6.o()     // Catch:{ all -> 0x0057 }
            r12.a(r7, r6)     // Catch:{ all -> 0x0057 }
            n8.e$a r6 = n.e.s(r6)     // Catch:{ all -> 0x0057 }
            goto L_0x0064
        L_0x0057:
            r2 = move-exception
            goto L_0x0087
        L_0x0059:
            if (r8 == 0) goto L_0x0060
            n8.e$a r6 = n.e.s(r8)     // Catch:{ all -> 0x0057 }
            goto L_0x0064
        L_0x0060:
            java.lang.Object r6 = r12.f(r7)     // Catch:{ all -> 0x0057 }
        L_0x0064:
            r2.h(r6)     // Catch:{ all -> 0x0057 }
            n8.i r2 = n8.i.f7501a     // Catch:{ all -> 0x0057 }
            if (r4 == 0) goto L_0x0071
            boolean r2 = r4.S()     // Catch:{ all -> 0x0093 }
            if (r2 == 0) goto L_0x0074
        L_0x0071:
            kotlinx.coroutines.internal.m.a(r3, r1)     // Catch:{ all -> 0x0093 }
        L_0x0074:
            r0.g()     // Catch:{ all -> 0x007a }
            n8.i r0 = n8.i.f7501a     // Catch:{ all -> 0x007a }
            goto L_0x007f
        L_0x007a:
            r0 = move-exception
            n8.e$a r0 = n.e.s(r0)
        L_0x007f:
            java.lang.Throwable r0 = n8.e.a(r0)
            r12.g(r5, r0)
            goto L_0x00a6
        L_0x0087:
            if (r4 == 0) goto L_0x008f
            boolean r4 = r4.S()     // Catch:{ all -> 0x0093 }
            if (r4 == 0) goto L_0x0092
        L_0x008f:
            kotlinx.coroutines.internal.m.a(r3, r1)     // Catch:{ all -> 0x0093 }
        L_0x0092:
            throw r2     // Catch:{ all -> 0x0093 }
        L_0x0093:
            r1 = move-exception
            r0.g()     // Catch:{ all -> 0x009a }
            n8.i r0 = n8.i.f7501a     // Catch:{ all -> 0x009a }
            goto L_0x009f
        L_0x009a:
            r0 = move-exception
            n8.e$a r0 = n.e.s(r0)
        L_0x009f:
            java.lang.Throwable r0 = n8.e.a(r0)
            r12.g(r1, r0)
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.y.run():void");
    }
}

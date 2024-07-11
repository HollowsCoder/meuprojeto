package d7;

import java.util.concurrent.Callable;

public final class y implements Callable<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f4301a;

    public y(x xVar) {
        this.f4301a = xVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r5 = this;
            d7.x r0 = r5.f4301a
            d7.t r0 = r0.f4293f
            androidx.appcompat.widget.m r1 = r0.f4273c
            java.lang.Object r2 = r1.f653q
            i7.e r2 = (i7.e) r2
            java.lang.Object r3 = r1.f652p
            java.lang.String r3 = (java.lang.String) r3
            r2.getClass()
            java.io.File r4 = new java.io.File
            java.io.File r2 = r2.f6130a
            r4.<init>(r2, r3)
            boolean r2 = r4.exists()
            r3 = 0
            if (r2 != 0) goto L_0x0055
            d7.n0 r1 = r0.f4280k
            i7.d r1 = r1.f4253b
            r1.getClass()
            java.util.TreeSet r2 = new java.util.TreeSet
            i7.e r1 = r1.f6128b
            java.io.File r1 = r1.f6131b
            java.lang.String[] r1 = r1.list()
            java.util.List r1 = i7.e.d(r1)
            r2.<init>(r1)
            java.util.NavigableSet r1 = r2.descendingSet()
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x0048
            java.lang.Object r1 = r1.first()
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
        L_0x0048:
            if (r3 == 0) goto L_0x0053
            a7.a r0 = r0.f4278i
            boolean r0 = r0.d(r3)
            if (r0 == 0) goto L_0x0053
            goto L_0x0078
        L_0x0053:
            r0 = 0
            goto L_0x0079
        L_0x0055:
            r0 = 2
            java.lang.String r2 = "FirebaseCrashlytics"
            boolean r0 = android.util.Log.isLoggable(r2, r0)
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = "Found previous crash marker."
            android.util.Log.v(r2, r0, r3)
        L_0x0063:
            java.lang.Object r0 = r1.f653q
            i7.e r0 = (i7.e) r0
            java.lang.Object r1 = r1.f652p
            java.lang.String r1 = (java.lang.String) r1
            r0.getClass()
            java.io.File r2 = new java.io.File
            java.io.File r0 = r0.f6130a
            r2.<init>(r0, r1)
            r2.delete()
        L_0x0078:
            r0 = 1
        L_0x0079:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.y.call():java.lang.Object");
    }
}

package g9;

import q8.d;
import q8.f;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f5045a;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        if (r0.equals("on") != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        if (r0.equals(com.karumi.dexter.BuildConfig.FLAVOR) != false) goto L_0x0054;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.scheduler"
            int r1 = kotlinx.coroutines.internal.l.f6794a
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ SecurityException -> 0x0009 }
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            if (r0 == 0) goto L_0x0054
            int r1 = r0.hashCode()
            if (r1 == 0) goto L_0x002e
            r2 = 3551(0xddf, float:4.976E-42)
            if (r1 == r2) goto L_0x0025
            r2 = 109935(0x1ad6f, float:1.54052E-40)
            if (r1 != r2) goto L_0x0037
            java.lang.String r1 = "off"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0037
            r0 = 0
            goto L_0x0055
        L_0x0025:
            java.lang.String r1 = "on"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0037
            goto L_0x0054
        L_0x002e:
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0037
            goto L_0x0054
        L_0x0037:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "System property 'kotlinx.coroutines.scheduler' has unrecognized value '"
            r1.<init>(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0054:
            r0 = 1
        L_0x0055:
            f5045a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.r.<clinit>():void");
    }

    public static final c1<?> a(d<?> dVar, f fVar, Object obj) {
        boolean z;
        c1<?> c1Var = null;
        if (!(dVar instanceof s8.d)) {
            return null;
        }
        if (fVar.get(d1.f5011o) != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        s8.d dVar2 = (s8.d) dVar;
        while (true) {
            if (!(dVar2 instanceof x) && (dVar2 = dVar2.e()) != null) {
                if (dVar2 instanceof c1) {
                    c1Var = (c1) dVar2;
                    break;
                }
            } else {
                break;
            }
        }
        if (c1Var != null) {
            c1Var.f5003q = fVar;
            c1Var.f5004r = obj;
        }
        return c1Var;
    }
}

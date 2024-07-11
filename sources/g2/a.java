package g2;

import com.appfab.facematchlive.ui.splash.SplashActivity;
import g1.c;
import n8.i;
import y8.l;
import z8.h;

public final class a extends h implements l<Object, i> {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ c f4969p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ SplashActivity f4970q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(c cVar, SplashActivity splashActivity) {
        super(1);
        this.f4969p = cVar;
        this.f4970q = splashActivity;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r7v14, types: [androidx.lifecycle.s] */
    /* JADX WARNING: type inference failed for: r7v18 */
    /* JADX WARNING: type inference failed for: r7v19 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(java.lang.Object r7) {
        /*
            r6 = this;
            g1.c r7 = r6.f4969p
            r7.getClass()
            r7 = 0
            s6.c r0 = s6.c.b()     // Catch:{ Exception -> 0x001c }
            r0.a()     // Catch:{ Exception -> 0x001c }
            y6.i r0 = r0.d     // Catch:{ Exception -> 0x001c }
            java.lang.Class<e8.k> r1 = e8.k.class
            java.lang.Object r0 = r0.a(r1)     // Catch:{ Exception -> 0x001c }
            e8.k r0 = (e8.k) r0     // Catch:{ Exception -> 0x001c }
            e8.c r0 = r0.c()     // Catch:{ Exception -> 0x001c }
            goto L_0x0021
        L_0x001c:
            r0 = move-exception
            r0.printStackTrace()
            r0 = r7
        L_0x0021:
            if (r0 == 0) goto L_0x002e
            java.lang.String r1 = "maxPremiumSearchLimit"
            long r1 = r0.b(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            goto L_0x002f
        L_0x002e:
            r1 = r7
        L_0x002f:
            if (r0 == 0) goto L_0x003c
            java.lang.String r2 = "maxFreeSearchLimit"
            long r2 = r0.b(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x003d
        L_0x003c:
            r2 = r7
        L_0x003d:
            if (r0 == 0) goto L_0x004a
            java.lang.String r3 = "isPremiumLock"
            boolean r3 = r0.a(r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L_0x004b
        L_0x004a:
            r3 = r7
        L_0x004b:
            if (r0 == 0) goto L_0x0058
            java.lang.String r4 = "isFreeLock"
            boolean r0 = r0.a(r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x0059
        L_0x0058:
            r0 = r7
        L_0x0059:
            com.appfab.facematchlive.data.model.RemoteConfigModel r4 = new com.appfab.facematchlive.data.model.RemoteConfigModel
            r4.<init>(r1, r2, r3, r0)
            com.appfab.facematchlive.FaceMatchApp$a r0 = com.appfab.facematchlive.FaceMatchApp.u
            com.appfab.facematchlive.FaceMatchApp r1 = r0.a()
            if (r1 != 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            r1.f2219o = r4
        L_0x0069:
            m2.a r1 = m2.a.C0100a.a()
            if (r1 == 0) goto L_0x0081
            java.lang.String r2 = h2.b.b(r4)
            android.content.SharedPreferences r1 = r1.f7059a
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r3 = "remoteConfig"
            r1.putString(r3, r2)
            r1.apply()
        L_0x0081:
            m2.a r1 = m2.a.C0100a.a()
            if (r1 == 0) goto L_0x008c
            com.appfab.facematchlive.data.model.CurrentConfigModel r1 = r1.a()
            goto L_0x008d
        L_0x008c:
            r1 = r7
        L_0x008d:
            java.util.GregorianCalendar r2 = new java.util.GregorianCalendar
            r2.<init>()
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.lang.String r4 = "yyyyMMdd"
            java.util.Locale r5 = java.util.Locale.getDefault()
            r3.<init>(r4, r5)
            java.util.Date r2 = r2.getTime()
            java.lang.String r2 = r3.format(r2)
            java.lang.String r3 = "getDateTimeString()"
            z8.g.e(r2, r3)
            int r2 = java.lang.Integer.parseInt(r2)
            com.appfab.facematchlive.ui.splash.SplashActivity r3 = r6.f4970q
            if (r1 == 0) goto L_0x00c0
            com.appfab.facematchlive.FaceMatchApp r4 = r0.a()
            if (r4 == 0) goto L_0x00cf
            androidx.lifecycle.s<com.appfab.facematchlive.data.model.CurrentConfigModel> r4 = r4.f2220p
            if (r4 == 0) goto L_0x00cf
            r4.j(r1)
            goto L_0x00cf
        L_0x00c0:
            com.appfab.facematchlive.FaceMatchApp r1 = r0.a()
            if (r1 == 0) goto L_0x00cf
            androidx.lifecycle.s<com.appfab.facematchlive.data.model.CurrentConfigModel> r1 = r1.f2220p
            if (r1 == 0) goto L_0x00cf
            com.appfab.facematchlive.data.model.CurrentConfigModel r4 = r3.H
            r1.j(r4)
        L_0x00cf:
            m2.a r1 = m2.a.C0100a.a()
            r4 = 0
            if (r1 == 0) goto L_0x00df
            int r1 = r1.b(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x00e0
        L_0x00df:
            r1 = r7
        L_0x00e0:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r5 = "INITDATE"
            android.util.Log.e(r5, r1)
            java.lang.String r1 = java.lang.String.valueOf(r2)
            android.util.Log.e(r5, r1)
            m2.a r1 = m2.a.C0100a.a()
            if (r1 == 0) goto L_0x00fd
            int r1 = r1.b(r4)
            if (r1 != 0) goto L_0x00fd
            r4 = 1
        L_0x00fd:
            m2.a r1 = m2.a.C0100a.a()
            if (r4 == 0) goto L_0x012e
            if (r1 == 0) goto L_0x010c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.d(r2)
        L_0x010c:
            com.appfab.facematchlive.FaceMatchApp r0 = r0.a()
            if (r0 == 0) goto L_0x0114
            androidx.lifecycle.s<com.appfab.facematchlive.data.model.CurrentConfigModel> r7 = r0.f2220p
        L_0x0114:
            if (r7 != 0) goto L_0x0117
            goto L_0x011c
        L_0x0117:
            com.appfab.facematchlive.data.model.CurrentConfigModel r0 = r3.H
            r7.i(r0)
        L_0x011c:
            m2.a r7 = m2.a.C0100a.a()
            if (r7 == 0) goto L_0x012b
            com.appfab.facematchlive.data.model.CurrentConfigModel r0 = r3.H
            java.lang.String r0 = h2.b.b(r0)
            r7.c(r0)
        L_0x012b:
            java.lang.String r7 = "UPDATE DATE"
            goto L_0x016e
        L_0x012e:
            if (r1 == 0) goto L_0x0138
            int r7 = r1.b(r2)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
        L_0x0138:
            z8.g.c(r7)
            int r7 = r7.intValue()
            if (r7 >= r2) goto L_0x0171
            m2.a r7 = m2.a.C0100a.a()
            if (r7 == 0) goto L_0x014e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r7.d(r1)
        L_0x014e:
            com.appfab.facematchlive.FaceMatchApp r7 = r0.a()
            if (r7 == 0) goto L_0x015d
            androidx.lifecycle.s<com.appfab.facematchlive.data.model.CurrentConfigModel> r7 = r7.f2220p
            if (r7 == 0) goto L_0x015d
            com.appfab.facematchlive.data.model.CurrentConfigModel r0 = r3.H
            r7.j(r0)
        L_0x015d:
            m2.a r7 = m2.a.C0100a.a()
            if (r7 == 0) goto L_0x016c
            com.appfab.facematchlive.data.model.CurrentConfigModel r0 = r3.H
            java.lang.String r0 = h2.b.b(r0)
            r7.c(r0)
        L_0x016c:
            java.lang.String r7 = "CLEAR DATE"
        L_0x016e:
            android.util.Log.e(r5, r7)
        L_0x0171:
            r3.G()
            n8.i r7 = n8.i.f7501a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.a.k(java.lang.Object):java.lang.Object");
    }
}

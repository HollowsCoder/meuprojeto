package g1;

import android.app.Activity;
import com.appfab.facematchlive.ui.splash.SplashActivity;
import com.google.firebase.remoteconfig.internal.b;
import e8.k;
import f8.f;
import g2.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import m5.d;
import m5.i;
import t3.u;
import z8.g;

public final class c implements d {

    /* renamed from: o  reason: collision with root package name */
    public final Object f4966o;

    /* renamed from: p  reason: collision with root package name */
    public final Object f4967p;

    /* renamed from: q  reason: collision with root package name */
    public final Object f4968q;

    public /* synthetic */ c() {
        this.f4966o = new ArrayList();
        this.f4967p = new ArrayList();
        this.f4968q = new ArrayList();
    }

    public c(SplashActivity splashActivity) {
        this.f4966o = splashActivity;
        s6.c b10 = s6.c.b();
        b10.a();
        e8.c c10 = ((k) b10.d.a(k.class)).c();
        g.e(c10, "getInstance()");
        this.f4967p = c10;
        this.f4968q = "RemoteConfigHelperTAG";
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a2 A[Catch:{ IOException | XmlPullParserException -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00af A[Catch:{ IOException | XmlPullParserException -> 0x00b8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(g1.c r10) {
        /*
            java.lang.Object r0 = r10.f4966o
            android.app.Activity r0 = (android.app.Activity) r0
            s6.c.e(r0)
            e8.h$a r0 = new e8.h$a
            r0.<init>()
            r1 = 0
            r0.f4528a = r1
            e8.h r1 = new e8.h
            r1.<init>(r0)
            java.lang.Object r10 = r10.f4967p
            e8.c r10 = (e8.c) r10
            r10.getClass()
            e8.a r0 = new e8.a
            r0.<init>(r10, r1)
            java.util.concurrent.Executor r1 = r10.f4519c
            m5.l.c(r1, r0)
            java.lang.String r0 = "FirebaseRemoteConfig"
            android.content.Context r1 = r10.f4517a
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = 0
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ XmlPullParserException -> 0x00ba, IOException -> 0x00b8 }
            if (r1 != 0) goto L_0x003d
            java.lang.String r1 = "Could not find the resources of the current context while trying to set defaults from an XML."
            android.util.Log.e(r0, r1)     // Catch:{ XmlPullParserException -> 0x00ba, IOException -> 0x00b8 }
            goto L_0x00c0
        L_0x003d:
            r4 = 2132082689(0x7f150001, float:1.98055E38)
            android.content.res.XmlResourceParser r1 = r1.getXml(r4)     // Catch:{ XmlPullParserException -> 0x00ba, IOException -> 0x00b8 }
            int r4 = r1.getEventType()     // Catch:{ XmlPullParserException -> 0x00ba, IOException -> 0x00b8 }
            r5 = r3
            r6 = r5
            r7 = r6
        L_0x004b:
            r8 = 1
            if (r4 == r8) goto L_0x00c0
            r9 = 2
            if (r4 != r9) goto L_0x0057
            java.lang.String r5 = r1.getName()     // Catch:{ XmlPullParserException -> 0x00ba, IOException -> 0x00b8 }
            goto L_0x00b3
        L_0x0057:
            r9 = 3
            if (r4 != r9) goto L_0x0077
            java.lang.String r4 = r1.getName()     // Catch:{ XmlPullParserException -> 0x00ba, IOException -> 0x00b8 }
            java.lang.String r5 = "entry"
            boolean r4 = r4.equals(r5)     // Catch:{ XmlPullParserException -> 0x00ba, IOException -> 0x00b8 }
            if (r4 == 0) goto L_0x0075
            if (r6 == 0) goto L_0x006e
            if (r7 == 0) goto L_0x006e
            r2.put(r6, r7)     // Catch:{ XmlPullParserException -> 0x00ba, IOException -> 0x00b8 }
            goto L_0x0073
        L_0x006e:
            java.lang.String r4 = "An entry in the defaults XML has an invalid key and/or value tag."
            android.util.Log.w(r0, r4)     // Catch:{ XmlPullParserException -> 0x00ba, IOException -> 0x00b8 }
        L_0x0073:
            r6 = r3
            r7 = r6
        L_0x0075:
            r5 = r3
            goto L_0x00b3
        L_0x0077:
            r9 = 4
            if (r4 != r9) goto L_0x00b3
            if (r5 == 0) goto L_0x00b3
            int r4 = r5.hashCode()     // Catch:{ XmlPullParserException -> 0x00ba, IOException -> 0x00b8 }
            r9 = 106079(0x19e5f, float:1.48648E-40)
            if (r4 == r9) goto L_0x0095
            r9 = 111972721(0x6ac9171, float:6.4912916E-35)
            if (r4 == r9) goto L_0x008b
            goto L_0x009f
        L_0x008b:
            java.lang.String r4 = "value"
            boolean r4 = r5.equals(r4)     // Catch:{ XmlPullParserException -> 0x00ba, IOException -> 0x00b8 }
            if (r4 == 0) goto L_0x009f
            r4 = r8
            goto L_0x00a0
        L_0x0095:
            java.lang.String r4 = "key"
            boolean r4 = r5.equals(r4)     // Catch:{ XmlPullParserException -> 0x00ba, IOException -> 0x00b8 }
            if (r4 == 0) goto L_0x009f
            r4 = 0
            goto L_0x00a0
        L_0x009f:
            r4 = -1
        L_0x00a0:
            if (r4 == 0) goto L_0x00af
            if (r4 == r8) goto L_0x00aa
            java.lang.String r4 = "Encountered an unexpected tag while parsing the defaults XML."
            android.util.Log.w(r0, r4)     // Catch:{ XmlPullParserException -> 0x00ba, IOException -> 0x00b8 }
            goto L_0x00b3
        L_0x00aa:
            java.lang.String r7 = r1.getText()     // Catch:{ XmlPullParserException -> 0x00ba, IOException -> 0x00b8 }
            goto L_0x00b3
        L_0x00af:
            java.lang.String r6 = r1.getText()     // Catch:{ XmlPullParserException -> 0x00ba, IOException -> 0x00b8 }
        L_0x00b3:
            int r4 = r1.next()     // Catch:{ XmlPullParserException -> 0x00ba, IOException -> 0x00b8 }
            goto L_0x004b
        L_0x00b8:
            r1 = move-exception
            goto L_0x00bb
        L_0x00ba:
            r1 = move-exception
        L_0x00bb:
            java.lang.String r4 = "Encountered an error while parsing the defaults XML file."
            android.util.Log.e(r0, r4, r1)
        L_0x00c0:
            java.util.Date r1 = f8.e.f4907f     // Catch:{ JSONException -> 0x00ee }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00ee }
            r1.<init>()     // Catch:{ JSONException -> 0x00ee }
            java.util.Date r1 = f8.e.f4907f     // Catch:{ JSONException -> 0x00ee }
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00ee }
            r4.<init>()     // Catch:{ JSONException -> 0x00ee }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00ee }
            r5.<init>()     // Catch:{ JSONException -> 0x00ee }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00ee }
            r6.<init>(r2)     // Catch:{ JSONException -> 0x00ee }
            f8.e r2 = new f8.e     // Catch:{ JSONException -> 0x00ee }
            r2.<init>(r6, r1, r4, r5)     // Catch:{ JSONException -> 0x00ee }
            f8.d r10 = r10.f4521f
            m5.i r10 = r10.c(r2)
            t3.u r0 = new t3.u
            r1 = 8
            r0.<init>(r1)
            r10.o(r0)
            goto L_0x00f7
        L_0x00ee:
            r10 = move-exception
            java.lang.String r1 = "The provided defaults map could not be processed."
            android.util.Log.e(r0, r1, r10)
            m5.l.e(r3)
        L_0x00f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.c.b(g1.c):void");
    }

    public final void a(a aVar) {
        e8.c cVar = (e8.c) this.f4967p;
        com.google.firebase.remoteconfig.internal.a aVar2 = cVar.f4522g;
        b bVar = aVar2.f3737g;
        bVar.getClass();
        long j8 = bVar.f3743a.getLong("minimum_fetch_interval_in_seconds", com.google.firebase.remoteconfig.internal.a.f3730i);
        aVar2.f3735e.b().g(aVar2.f3734c, new f(aVar2, j8)).o(new u(9)).n(cVar.f4519c, new e8.b(cVar)).b((Activity) this.f4966o, new d2.b(2, aVar));
    }

    public final void f(i iVar) {
        i4.c cVar = (i4.c) this.f4966o;
        String str = (String) this.f4967p;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f4968q;
        synchronized (cVar.f6070a) {
            cVar.f6070a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3) {
        this.f4966o = obj;
        this.f4967p = obj2;
        this.f4968q = obj3;
    }

    public c(List list) {
        this.f4968q = list;
        this.f4966o = new ArrayList(list.size());
        this.f4967p = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((List) this.f4966o).add(((o1.g) list.get(i10)).f7630b.a());
            ((List) this.f4967p).add(((o1.g) list.get(i10)).f7631c.a());
        }
    }
}

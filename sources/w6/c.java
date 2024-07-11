package w6;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.l1;
import com.google.android.gms.internal.measurement.m1;
import com.google.android.gms.internal.measurement.u1;
import com.google.android.gms.internal.measurement.z0;
import com.karumi.dexter.BuildConfig;
import g5.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import n4.m;
import w6.a;
import x6.e;
import z6.b;

public final class c implements a {

    /* renamed from: c  reason: collision with root package name */
    public static volatile c f9259c;

    /* renamed from: a  reason: collision with root package name */
    public final a f9260a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f9261b = new ConcurrentHashMap();

    public c(a aVar) {
        m.h(aVar);
        this.f9260a = aVar;
    }

    public final void a(String str) {
        u1 u1Var = this.f9260a.f4974a;
        u1Var.getClass();
        u1Var.c(new z0(u1Var, str, (String) null, (Bundle) null));
    }

    public final b b(String str, b bVar) {
        boolean z;
        Object obj;
        if (!x6.a.a(str)) {
            return null;
        }
        boolean isEmpty = str.isEmpty();
        ConcurrentHashMap concurrentHashMap = this.f9261b;
        if (isEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        boolean equals = "fiam".equals(str);
        a aVar = this.f9260a;
        if (equals) {
            obj = new x6.c(aVar, bVar);
        } else if ("crash".equals(str) || "clx".equals(str)) {
            obj = new e(aVar, bVar);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        concurrentHashMap.put(str, obj);
        return new b();
    }

    public final Map c() {
        return this.f9260a.f4974a.a((String) null, (String) null, false);
    }

    public final ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        for (Bundle next : this.f9260a.f4974a.f(str, BuildConfig.FLAVOR)) {
            HashSet hashSet = x6.a.f9512a;
            m.h(next);
            a.b bVar = new a.b();
            Class<String> cls = String.class;
            String str2 = (String) androidx.databinding.a.F(next, "origin", cls, (Object) null);
            m.h(str2);
            bVar.f9246a = str2;
            String str3 = (String) androidx.databinding.a.F(next, "name", cls, (Object) null);
            m.h(str3);
            bVar.f9247b = str3;
            bVar.f9248c = androidx.databinding.a.F(next, "value", Object.class, (Object) null);
            bVar.d = (String) androidx.databinding.a.F(next, "trigger_event_name", cls, (Object) null);
            Class<Long> cls2 = Long.class;
            bVar.f9249e = ((Long) androidx.databinding.a.F(next, "trigger_timeout", cls2, 0L)).longValue();
            bVar.f9250f = (String) androidx.databinding.a.F(next, "timed_out_event_name", cls, (Object) null);
            Class<Bundle> cls3 = Bundle.class;
            bVar.f9251g = (Bundle) androidx.databinding.a.F(next, "timed_out_event_params", cls3, (Object) null);
            bVar.f9252h = (String) androidx.databinding.a.F(next, "triggered_event_name", cls, (Object) null);
            bVar.f9253i = (Bundle) androidx.databinding.a.F(next, "triggered_event_params", cls3, (Object) null);
            bVar.f9254j = ((Long) androidx.databinding.a.F(next, "time_to_live", cls2, 0L)).longValue();
            bVar.f9255k = (String) androidx.databinding.a.F(next, "expired_event_name", cls, (Object) null);
            bVar.l = (Bundle) androidx.databinding.a.F(next, "expired_event_params", cls3, (Object) null);
            bVar.f9257n = ((Boolean) androidx.databinding.a.F(next, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            bVar.f9256m = ((Long) androidx.databinding.a.F(next, "creation_timestamp", cls2, 0L)).longValue();
            bVar.f9258o = ((Long) androidx.databinding.a.F(next, "triggered_timestamp", cls2, 0L)).longValue();
            arrayList.add(bVar);
        }
        return arrayList;
    }

    public final void e(String str) {
        if (x6.a.a("fcm") && x6.a.c("fcm", "_ln")) {
            u1 u1Var = this.f9260a.f4974a;
            u1Var.getClass();
            u1Var.c(new m1(u1Var, str));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0053, code lost:
        if (r3 == null) goto L_0x00ad;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004a A[Catch:{ IOException | ClassNotFoundException -> 0x0053 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f A[Catch:{ IOException | ClassNotFoundException -> 0x0053 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(w6.a.b r8) {
        /*
            r7 = this;
            java.util.HashSet r0 = x6.a.f9512a
            java.lang.String r0 = r8.f9246a
            r1 = 0
            if (r0 == 0) goto L_0x00ad
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x000f
            goto L_0x00ad
        L_0x000f:
            java.lang.Object r2 = r8.f9248c
            if (r2 == 0) goto L_0x0055
            r3 = 0
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0044 }
            r4.<init>()     // Catch:{ all -> 0x0044 }
            java.io.ObjectOutputStream r5 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0044 }
            r5.<init>(r4)     // Catch:{ all -> 0x0044 }
            r5.writeObject(r2)     // Catch:{ all -> 0x0040 }
            r5.flush()     // Catch:{ all -> 0x0040 }
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ all -> 0x0040 }
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0040 }
            byte[] r4 = r4.toByteArray()     // Catch:{ all -> 0x0040 }
            r6.<init>(r4)     // Catch:{ all -> 0x0040 }
            r2.<init>(r6)     // Catch:{ all -> 0x0040 }
            java.lang.Object r4 = r2.readObject()     // Catch:{ all -> 0x003e }
            r5.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0053 }
            r2.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0053 }
            r3 = r4
            goto L_0x0053
        L_0x003e:
            r4 = move-exception
            goto L_0x0048
        L_0x0040:
            r2 = move-exception
            r4 = r2
            r2 = r3
            goto L_0x0048
        L_0x0044:
            r2 = move-exception
            r4 = r2
            r2 = r3
            r5 = r2
        L_0x0048:
            if (r5 == 0) goto L_0x004d
            r5.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0053 }
        L_0x004d:
            if (r2 == 0) goto L_0x0052
            r2.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0053 }
        L_0x0052:
            throw r4     // Catch:{ IOException | ClassNotFoundException -> 0x0053 }
        L_0x0053:
            if (r3 == 0) goto L_0x00ad
        L_0x0055:
            boolean r2 = x6.a.a(r0)
            if (r2 != 0) goto L_0x005c
            goto L_0x00ad
        L_0x005c:
            java.lang.String r2 = r8.f9247b
            boolean r2 = x6.a.c(r0, r2)
            if (r2 != 0) goto L_0x0065
            goto L_0x00ad
        L_0x0065:
            java.lang.String r2 = r8.f9255k
            if (r2 == 0) goto L_0x007c
            android.os.Bundle r3 = r8.l
            boolean r2 = x6.a.b(r2, r3)
            if (r2 != 0) goto L_0x0072
            goto L_0x00ad
        L_0x0072:
            java.lang.String r2 = r8.f9255k
            android.os.Bundle r3 = r8.l
            boolean r2 = x6.a.d(r0, r2, r3)
            if (r2 == 0) goto L_0x00ad
        L_0x007c:
            java.lang.String r2 = r8.f9252h
            if (r2 == 0) goto L_0x0093
            android.os.Bundle r3 = r8.f9253i
            boolean r2 = x6.a.b(r2, r3)
            if (r2 != 0) goto L_0x0089
            goto L_0x00ad
        L_0x0089:
            java.lang.String r2 = r8.f9252h
            android.os.Bundle r3 = r8.f9253i
            boolean r2 = x6.a.d(r0, r2, r3)
            if (r2 == 0) goto L_0x00ad
        L_0x0093:
            java.lang.String r2 = r8.f9250f
            if (r2 == 0) goto L_0x00ab
            android.os.Bundle r3 = r8.f9251g
            boolean r2 = x6.a.b(r2, r3)
            if (r2 != 0) goto L_0x00a0
            goto L_0x00ad
        L_0x00a0:
            java.lang.String r2 = r8.f9250f
            android.os.Bundle r3 = r8.f9251g
            boolean r0 = x6.a.d(r0, r2, r3)
            if (r0 != 0) goto L_0x00ab
            goto L_0x00ad
        L_0x00ab:
            r0 = 1
            goto L_0x00ae
        L_0x00ad:
            r0 = r1
        L_0x00ae:
            if (r0 != 0) goto L_0x00b1
            return
        L_0x00b1:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r2 = r8.f9246a
            if (r2 == 0) goto L_0x00bf
            java.lang.String r3 = "origin"
            r0.putString(r3, r2)
        L_0x00bf:
            java.lang.String r2 = r8.f9247b
            if (r2 == 0) goto L_0x00c8
            java.lang.String r3 = "name"
            r0.putString(r3, r2)
        L_0x00c8:
            java.lang.Object r2 = r8.f9248c
            if (r2 == 0) goto L_0x00cf
            androidx.databinding.a.z(r0, r2)
        L_0x00cf:
            java.lang.String r2 = r8.d
            if (r2 == 0) goto L_0x00d8
            java.lang.String r3 = "trigger_event_name"
            r0.putString(r3, r2)
        L_0x00d8:
            java.lang.String r2 = "trigger_timeout"
            long r3 = r8.f9249e
            r0.putLong(r2, r3)
            java.lang.String r2 = r8.f9250f
            if (r2 == 0) goto L_0x00e8
            java.lang.String r3 = "timed_out_event_name"
            r0.putString(r3, r2)
        L_0x00e8:
            android.os.Bundle r2 = r8.f9251g
            if (r2 == 0) goto L_0x00f1
            java.lang.String r3 = "timed_out_event_params"
            r0.putBundle(r3, r2)
        L_0x00f1:
            java.lang.String r2 = r8.f9252h
            if (r2 == 0) goto L_0x00fa
            java.lang.String r3 = "triggered_event_name"
            r0.putString(r3, r2)
        L_0x00fa:
            android.os.Bundle r2 = r8.f9253i
            if (r2 == 0) goto L_0x0103
            java.lang.String r3 = "triggered_event_params"
            r0.putBundle(r3, r2)
        L_0x0103:
            java.lang.String r2 = "time_to_live"
            long r3 = r8.f9254j
            r0.putLong(r2, r3)
            java.lang.String r2 = r8.f9255k
            if (r2 == 0) goto L_0x0113
            java.lang.String r3 = "expired_event_name"
            r0.putString(r3, r2)
        L_0x0113:
            android.os.Bundle r2 = r8.l
            if (r2 == 0) goto L_0x011c
            java.lang.String r3 = "expired_event_params"
            r0.putBundle(r3, r2)
        L_0x011c:
            java.lang.String r2 = "creation_timestamp"
            long r3 = r8.f9256m
            r0.putLong(r2, r3)
            java.lang.String r2 = "active"
            boolean r3 = r8.f9257n
            r0.putBoolean(r2, r3)
            java.lang.String r2 = "triggered_timestamp"
            long r3 = r8.f9258o
            r0.putLong(r2, r3)
            g5.a r8 = r7.f9260a
            com.google.android.gms.internal.measurement.u1 r8 = r8.f4974a
            r8.getClass()
            com.google.android.gms.internal.measurement.y0 r2 = new com.google.android.gms.internal.measurement.y0
            r2.<init>(r8, r0, r1)
            r8.c(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.c.f(w6.a$b):void");
    }

    public final void g(String str, String str2, Bundle bundle) {
        if (x6.a.a(str) && x6.a.b(str2, bundle) && x6.a.d(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1);
            }
            u1 u1Var = this.f9260a.f4974a;
            u1Var.getClass();
            u1Var.c(new l1(u1Var, str, str2, bundle));
        }
    }

    public final int h(String str) {
        return this.f9260a.f4974a.b(str);
    }
}

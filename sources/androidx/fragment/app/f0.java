package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import b8.p;
import c5.o;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.a;
import com.karumi.dexter.BuildConfig;
import d7.h0;
import d7.k0;
import e3.b;
import h7.a;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l7.f;
import m5.h;
import m5.i;
import m5.l;
import n.e;
import org.json.JSONObject;
import s2.w;
import t2.c;
import z2.d;

public final class f0 implements b, h {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f1150o;

    /* renamed from: p  reason: collision with root package name */
    public Object f1151p;

    /* renamed from: q  reason: collision with root package name */
    public Object f1152q;

    /* renamed from: r  reason: collision with root package name */
    public Object f1153r;

    public f0(int i10) {
        this.f1150o = i10;
        if (i10 == 4) {
            this.f1151p = new com.google.android.gms.internal.measurement.b(BuildConfig.FLAVOR, 0, (HashMap) null);
            this.f1152q = new com.google.android.gms.internal.measurement.b(BuildConfig.FLAVOR, 0, (HashMap) null);
            this.f1153r = new ArrayList();
        } else if (i10 != 5) {
            this.f1151p = new ArrayList();
            this.f1152q = new HashMap();
        } else {
            this.f1151p = null;
            this.f1152q = new k0(1024);
            this.f1153r = new k0(8192);
        }
    }

    public static void c(a aVar, f fVar) {
        d(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", fVar.f6978a);
        d(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        d(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", "18.2.5");
        d(aVar, "Accept", "application/json");
        d(aVar, "X-CRASHLYTICS-DEVICE-MODEL", fVar.f6979b);
        d(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", fVar.f6980c);
        d(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", fVar.d);
        d(aVar, "X-CRASHLYTICS-INSTALLATION-ID", ((h0) fVar.f6981e).c());
    }

    public static void d(a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.f5915c.put(str, str2);
        }
    }

    public static HashMap l(f fVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", fVar.f6984h);
        hashMap.put("display_version", fVar.f6983g);
        hashMap.put("source", Integer.toString(fVar.f6985i));
        String str = fVar.f6982f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public final void a(n nVar) {
        if (!((ArrayList) this.f1151p).contains(nVar)) {
            synchronized (((ArrayList) this.f1151p)) {
                ((ArrayList) this.f1151p).add(nVar);
            }
            nVar.f1244y = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + nVar);
    }

    public final w b(w wVar, q2.h hVar) {
        Drawable drawable = (Drawable) wVar.get();
        if (drawable instanceof BitmapDrawable) {
            return ((b) this.f1152q).b(d.e(((BitmapDrawable) drawable).getBitmap(), (c) this.f1151p), hVar);
        }
        if (drawable instanceof d3.c) {
            return ((b) this.f1153r).b(wVar, hVar);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        switch (this.f1150o) {
            case 4:
                f0 f0Var = new f0(((com.google.android.gms.internal.measurement.b) this.f1151p).clone());
                for (com.google.android.gms.internal.measurement.b a10 : (List) this.f1153r) {
                    ((List) f0Var.f1153r).add(a10.clone());
                }
                return f0Var;
            default:
                return super.clone();
        }
    }

    public final void e() {
        ((HashMap) this.f1152q).values().removeAll(Collections.singleton((Object) null));
    }

    public final n f(String str) {
        e0 e0Var = (e0) ((HashMap) this.f1152q).get(str);
        if (e0Var != null) {
            return e0Var.f1145c;
        }
        return null;
    }

    public final n g(String str) {
        for (e0 e0Var : ((HashMap) this.f1152q).values()) {
            if (e0Var != null) {
                n nVar = e0Var.f1145c;
                if (!str.equals(nVar.f1240s)) {
                    nVar = nVar.H.f1310c.g(str);
                }
                if (nVar != null) {
                    return nVar;
                }
            }
        }
        return null;
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList();
        for (e0 e0Var : ((HashMap) this.f1152q).values()) {
            if (e0Var != null) {
                arrayList.add(e0Var);
            }
        }
        return arrayList;
    }

    public final i i(Object obj) {
        com.google.firebase.messaging.a aVar;
        String str;
        String str2;
        String str3;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f1151p;
        String str4 = (String) this.f1152q;
        a.C0042a aVar2 = (a.C0042a) this.f1153r;
        String str5 = (String) obj;
        Context context = firebaseMessaging.d;
        synchronized (FirebaseMessaging.class) {
            if (FirebaseMessaging.f3704k == null) {
                FirebaseMessaging.f3704k = new com.google.firebase.messaging.a(context);
            }
            aVar = FirebaseMessaging.f3704k;
        }
        s6.c cVar = firebaseMessaging.f3706a;
        cVar.a();
        if ("[DEFAULT]".equals(cVar.f8816b)) {
            str = BuildConfig.FLAVOR;
        } else {
            str = cVar.c();
        }
        p pVar = firebaseMessaging.f3712h;
        synchronized (pVar) {
            if (pVar.f2038b == null) {
                pVar.d();
            }
            str2 = pVar.f2038b;
        }
        synchronized (aVar) {
            String a10 = a.C0042a.a(System.currentTimeMillis(), str5, str2);
            if (a10 != null) {
                SharedPreferences.Editor edit = aVar.f3719a.edit();
                edit.putString(com.google.firebase.messaging.a.a(str, str4), a10);
                edit.commit();
            }
        }
        if (aVar2 == null || !str5.equals(aVar2.f3720a)) {
            s6.c cVar2 = firebaseMessaging.f3706a;
            cVar2.a();
            if ("[DEFAULT]".equals(cVar2.f8816b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    cVar2.a();
                    String valueOf = String.valueOf(cVar2.f8816b);
                    if (valueOf.length() != 0) {
                        str3 = "Invoking onNewToken for app: ".concat(valueOf);
                    } else {
                        str3 = new String("Invoking onNewToken for app: ");
                    }
                    Log.d("FirebaseMessaging", str3);
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str5);
                new b8.h(firebaseMessaging.d).b(intent);
            }
        }
        return l.e(str5);
    }

    public final ArrayList j() {
        ArrayList arrayList = new ArrayList();
        for (e0 e0Var : ((HashMap) this.f1152q).values()) {
            arrayList.add(e0Var != null ? e0Var.f1145c : null);
        }
        return arrayList;
    }

    public final List k() {
        ArrayList arrayList;
        if (((ArrayList) this.f1151p).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f1151p)) {
            arrayList = new ArrayList((ArrayList) this.f1151p);
        }
        return arrayList;
    }

    public final JSONObject m(h0.d dVar) {
        boolean z;
        int i10 = dVar.f5109a;
        ((s6.a) this.f1153r).L("Settings response code was: " + i10);
        if (i10 == 200 || i10 == 201 || i10 == 202 || i10 == 203) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String str = (String) dVar.f5110b;
            try {
                return new JSONObject(str);
            } catch (Exception e10) {
                ((s6.a) this.f1153r).M("Failed to parse settings JSON from " + ((String) this.f1151p), e10);
                ((s6.a) this.f1153r).M("Settings response " + str, (Exception) null);
                return null;
            }
        } else {
            String str2 = "Settings request failed; (status: " + i10 + ") from " + ((String) this.f1151p);
            if (!((s6.a) this.f1153r).j(6)) {
                return null;
            }
            Log.e("FirebaseCrashlytics", str2, (Throwable) null);
            return null;
        }
    }

    public final void n(e0 e0Var) {
        boolean z;
        n nVar = e0Var.f1145c;
        if (((HashMap) this.f1152q).get(nVar.f1240s) != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ((HashMap) this.f1152q).put(nVar.f1240s, e0Var);
            if (y.I(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + nVar);
            }
        }
    }

    public final void o(e0 e0Var) {
        n nVar = e0Var.f1145c;
        if (nVar.O) {
            ((b0) this.f1153r).c(nVar);
        }
        if (((e0) ((HashMap) this.f1152q).put(nVar.f1240s, (Object) null)) != null && y.I(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + nVar);
        }
    }

    public final void p(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        Map map = (Map) this.f1151p;
        o oVar = new o(byteArrayOutputStream, map, (Map) this.f1152q, (o7.d) this.f1153r);
        if (obj != null) {
            o7.d dVar = (o7.d) map.get(obj.getClass());
            if (dVar != null) {
                dVar.a(obj, oVar);
                return;
            }
            throw new o7.b("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
    }

    public final String toString() {
        switch (this.f1150o) {
            case 1:
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                if (((Uri) this.f1151p) != null) {
                    sb.append(" uri=");
                    sb.append(((Uri) this.f1151p).toString());
                }
                if (((String) this.f1152q) != null) {
                    sb.append(" action=");
                    sb.append((String) this.f1152q);
                }
                if (((String) this.f1153r) != null) {
                    sb.append(" mimetype=");
                    sb.append((String) this.f1153r);
                }
                sb.append(" }");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public f0(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType(), 1);
        this.f1150o = 1;
    }

    public f0(com.google.android.gms.internal.measurement.b bVar) {
        this.f1150o = 4;
        this.f1151p = bVar;
        this.f1152q = bVar.clone();
        this.f1153r = new ArrayList();
    }

    public /* synthetic */ f0(Object obj, Object obj2, Object obj3, int i10) {
        this.f1150o = i10;
        this.f1151p = obj;
        this.f1152q = obj2;
        this.f1153r = obj3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public f0(String str, e eVar) {
        this(str, eVar, 0);
        this.f1150o = 6;
    }

    public f0(String str, e eVar, int i10) {
        s6.a aVar = s6.a.f8805s;
        this.f1150o = 6;
        if (str != null) {
            this.f1153r = aVar;
            this.f1152q = eVar;
            this.f1151p = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}

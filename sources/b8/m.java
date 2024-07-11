package b8;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import d8.g;
import h5.r;
import i4.t;
import i4.u;
import i4.v;
import i4.w;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import m5.i;
import m5.l;
import s6.c;
import t7.d;
import v7.b;
import w7.e;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final c f2029a;

    /* renamed from: b  reason: collision with root package name */
    public final p f2030b;

    /* renamed from: c  reason: collision with root package name */
    public final i4.c f2031c;
    public final b<g> d;

    /* renamed from: e  reason: collision with root package name */
    public final b<d> f2032e;

    /* renamed from: f  reason: collision with root package name */
    public final e f2033f;

    public m(c cVar, p pVar, b<g> bVar, b<d> bVar2, e eVar) {
        cVar.a();
        i4.c cVar2 = new i4.c(cVar.f8815a);
        this.f2029a = cVar;
        this.f2030b = pVar;
        this.f2031c = cVar2;
        this.d = bVar;
        this.f2032e = bVar2;
        this.f2033f = eVar;
    }

    public final i<String> a(i<Bundle> iVar) {
        return iVar.e(l.f2028o, new q1.d(7, this));
    }

    public final void b(String str, String str2, Bundle bundle) {
        int i10;
        String str3;
        String str4;
        String str5;
        d.a a10;
        PackageInfo b10;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        c cVar = this.f2029a;
        cVar.a();
        bundle.putString("gmp_app_id", cVar.f8817c.f8827b);
        p pVar = this.f2030b;
        synchronized (pVar) {
            if (pVar.d == 0 && (b10 = pVar.b("com.google.android.gms")) != null) {
                pVar.d = b10.versionCode;
            }
            i10 = pVar.d;
        }
        bundle.putString("gmsv", Integer.toString(i10));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        p pVar2 = this.f2030b;
        synchronized (pVar2) {
            if (pVar2.f2038b == null) {
                pVar2.d();
            }
            str3 = pVar2.f2038b;
        }
        bundle.putString("app_ver", str3);
        p pVar3 = this.f2030b;
        synchronized (pVar3) {
            if (pVar3.f2039c == null) {
                pVar3.d();
            }
            str4 = pVar3.f2039c;
        }
        bundle.putString("app_ver_name", str4);
        c cVar2 = this.f2029a;
        cVar2.a();
        try {
            str5 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(cVar2.f8816b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str5 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str5);
        try {
            String a11 = ((w7.i) l.a(this.f2033f.a())).a();
            if (!TextUtils.isEmpty(a11)) {
                bundle.putString("Goog-Firebase-Installations-Auth", a11);
            } else {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e10);
        }
        bundle.putString("appid", (String) l.a(this.f2033f.getId()));
        bundle.putString("cliv", "fcm-23.0.0");
        d dVar = this.f2032e.get();
        g gVar = this.d.get();
        if (dVar != null && gVar != null && (a10 = dVar.a("fire-iid")) != d.a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(a10.getCode()));
            bundle.putString("Firebase-Client", gVar.a());
        }
    }

    public final i<Bundle> c(String str, String str2, Bundle bundle) {
        int i10;
        int i11;
        PackageInfo packageInfo;
        try {
            b(str, str2, bundle);
            i4.c cVar = this.f2031c;
            v vVar = cVar.f6072c;
            synchronized (vVar) {
                if (vVar.f6110b == 0) {
                    try {
                        packageInfo = t4.c.a(vVar.f6109a).b("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException e10) {
                        String valueOf = String.valueOf(e10);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                        sb.append("Failed to find package ");
                        sb.append(valueOf);
                        Log.w("Metadata", sb.toString());
                        packageInfo = null;
                    }
                    if (packageInfo != null) {
                        vVar.f6110b = packageInfo.versionCode;
                    }
                }
                i10 = vVar.f6110b;
            }
            if (i10 >= 12000000) {
                u a10 = u.a(cVar.f6071b);
                synchronized (a10) {
                    i11 = a10.d;
                    a10.d = i11 + 1;
                }
                return a10.b(new t(i11, bundle)).e(w.f6112o, r.f5664p);
            } else if (cVar.f6072c.a() != 0) {
                return cVar.a(bundle).g(w.f6112o, new androidx.appcompat.widget.m(4, cVar, bundle));
            } else {
                return l.d(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
        } catch (InterruptedException | ExecutionException e11) {
            return l.d(e11);
        }
    }
}

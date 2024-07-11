package com.appfab.facematchlive;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.lifecycle.s;
import b8.k;
import com.appfab.facematchlive.data.model.CurrentConfigModel;
import com.appfab.facematchlive.data.model.RemoteConfigModel;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import s6.c;
import z8.g;

public final class FaceMatchApp extends Application {
    public static final a u = new a();

    /* renamed from: v  reason: collision with root package name */
    public static FaceMatchApp f2218v;

    /* renamed from: o  reason: collision with root package name */
    public RemoteConfigModel f2219o;

    /* renamed from: p  reason: collision with root package name */
    public final s<CurrentConfigModel> f2220p = new s<>();

    /* renamed from: q  reason: collision with root package name */
    public File f2221q;

    /* renamed from: r  reason: collision with root package name */
    public File f2222r;

    /* renamed from: s  reason: collision with root package name */
    public File f2223s;

    /* renamed from: t  reason: collision with root package name */
    public final AtomicBoolean f2224t = new AtomicBoolean(false);

    public static final class a {
        public final synchronized FaceMatchApp a() {
            return FaceMatchApp.f2218v;
        }
    }

    public final void a() {
        File file;
        try {
            this.f2222r = new File(getFilesDir(), "img");
            this.f2223s = new File(getCacheDir(), "detectedFaces");
            this.f2221q = new File(getCacheDir(), "capturedFaces");
            File file2 = this.f2222r;
            g.c(file2);
            if (!file2.exists()) {
                File file3 = this.f2222r;
                g.c(file3);
                if (file3.mkdirs()) {
                    File file4 = this.f2222r;
                    g.c(file4);
                    file4.mkdirs();
                }
            }
            File file5 = this.f2223s;
            boolean z = true;
            if (file5 != null && !file5.exists()) {
                File file6 = this.f2223s;
                if (file6 == null || !file6.mkdir()) {
                    z = false;
                }
                if (z && (file = this.f2223s) != null) {
                    file.mkdirs();
                }
            }
            File file7 = this.f2221q;
            g.c(file7);
            if (!file7.exists()) {
                File file8 = this.f2221q;
                g.c(file8);
                if (file8.mkdir()) {
                    File file9 = this.f2221q;
                    g.c(file9);
                    file9.mkdirs();
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void onCreate() {
        FirebaseMessaging instance;
        super.onCreate();
        f2218v = this;
        if (m2.a.f7058b == null) {
            m2.a.f7058b = new m2.a();
        }
        j2.a.f6519a = "FaceMatch/9 " + System.getProperty("http.agent");
        a();
        c.e(getApplicationContext());
        com.google.firebase.messaging.a aVar = FirebaseMessaging.f3704k;
        synchronized (FirebaseMessaging.class) {
            instance = FirebaseMessaging.getInstance(c.b());
        }
        FirebaseMessaging.a aVar2 = instance.f3711g;
        synchronized (aVar2) {
            aVar2.a();
            k kVar = aVar2.f3716c;
            if (kVar != null) {
                aVar2.f3714a.b(kVar);
                aVar2.f3716c = null;
            }
            c cVar = FirebaseMessaging.this.f3706a;
            cVar.a();
            SharedPreferences.Editor edit = cVar.f8815a.getSharedPreferences("com.google.firebase.messaging", 0).edit();
            edit.putBoolean("auto_init", true);
            edit.apply();
            FirebaseMessaging.this.d();
            aVar2.d = Boolean.TRUE;
        }
    }
}

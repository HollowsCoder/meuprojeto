package v1;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import androidx.activity.result.b;
import c1.r;
import com.appfab.facematchlive.ui.flow.selector.ActivitySelector;
import com.google.firebase.remoteconfig.internal.a;
import d7.p0;
import e2.c;
import i8.h;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import m5.i;
import m5.j;
import m5.l;
import q1.d;
import v7.a;
import y6.e;
import y6.s;
import z8.g;

public final /* synthetic */ class a implements h, b, a.C0141a, m5.a, m5.h, e {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Object f9118o;

    public /* synthetic */ a(Object obj) {
        this.f9118o = obj;
    }

    public void a(Object obj) {
        Uri uri;
        String str;
        ActivitySelector activitySelector = (ActivitySelector) this.f9118o;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        int i10 = ActivitySelector.L;
        g.f(activitySelector, "this$0");
        g.f(aVar, "result");
        if (aVar.f192o == -1) {
            String str2 = null;
            Intent intent = aVar.f193p;
            if (intent != null) {
                uri = intent.getData();
            } else {
                uri = null;
            }
            activitySelector.H = uri;
            if (uri != null) {
                try {
                    Cursor query = activitySelector.getContentResolver().query(uri, new String[]{"_data"}, (String) null, (String[]) null, (String) null);
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    } else {
                        str = null;
                    }
                    query.close();
                    str2 = str;
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                if (str2 != null) {
                    Uri fromFile = Uri.fromFile(new File(str2));
                    activitySelector.H = fromFile;
                    try {
                        activitySelector.runOnUiThread(new c(0, i2.a.b(activitySelector, fromFile, str2), activitySelector));
                        return;
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                }
            }
        }
        activitySelector.finish();
    }

    public Object c(i iVar) {
        j jVar = (j) this.f9118o;
        ExecutorService executorService = p0.f4263a;
        if (iVar.m()) {
            jVar.c(iVar.i());
            return null;
        }
        Exception h10 = iVar.h();
        Objects.requireNonNull(h10);
        jVar.b(h10);
        return null;
    }

    public void d(v7.b bVar) {
        z6.a aVar = (z6.a) this.f9118o;
        aVar.getClass();
        s6.a aVar2 = s6.a.f8805s;
        aVar2.t("AnalyticsConnector now available.");
        w6.a aVar3 = (w6.a) bVar.get();
        d dVar = new d(5, aVar3);
        z6.b bVar2 = new z6.b();
        w6.b b10 = aVar3.b("clx", bVar2);
        if (b10 == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", (Throwable) null);
            }
            w6.b b11 = aVar3.b("crash", bVar2);
            if (b11 != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", (Throwable) null);
            }
            b10 = b11;
        }
        if (b10 != null) {
            aVar2.t("Registered Firebase Analytics listener.");
            r rVar = new r(6);
            b7.c cVar = new b7.c(dVar, TimeUnit.MILLISECONDS);
            synchronized (aVar) {
                Iterator it = aVar.f9933c.iterator();
                while (it.hasNext()) {
                    rVar.e((c7.a) it.next());
                }
                bVar2.f9935b = rVar;
                bVar2.f9934a = cVar;
                aVar.f9932b = rVar;
                aVar.f9931a = cVar;
            }
            return;
        }
        aVar2.M("Could not register Firebase Analytics listener; a listener is already registered.", (Exception) null);
    }

    public i i(Object obj) {
        f8.e eVar = (f8.e) obj;
        int[] iArr = com.google.firebase.remoteconfig.internal.a.f3731j;
        return l.e((a.C0043a) this.f9118o);
    }

    public Object j(s sVar) {
        return this.f9118o;
    }
}

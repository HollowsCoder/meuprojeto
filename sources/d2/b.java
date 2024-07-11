package d2;

import a4.q;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import b4.b;
import b7.a;
import com.appfab.facematchlive.ui.flow.selector.ActivitySelector;
import d7.a0;
import d7.n0;
import d7.p0;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import m5.d;
import m5.i;
import p3.c;
import t3.s;
import v7.a;
import y8.l;
import z3.m;
import z3.o;
import z8.g;

public final /* synthetic */ class b implements c.d, androidx.activity.result.b, d, b.a, q.a, a, a.C0141a, m5.a {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f4125o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f4126p;

    public /* synthetic */ b(int i10, Object obj) {
        this.f4125o = i10;
        this.f4126p = obj;
    }

    public final void a(Object obj) {
        ActivitySelector activitySelector = (ActivitySelector) this.f4126p;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        int i10 = ActivitySelector.L;
        g.f(activitySelector, "this$0");
        g.f(aVar, "result");
        if (aVar.f192o == -1) {
            try {
                activitySelector.runOnUiThread(new e2.b(0, i2.a.b(activitySelector, activitySelector.H, activitySelector.I), activitySelector));
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        } else {
            activitySelector.finish();
        }
    }

    public final Object apply(Object obj) {
        Map map = (Map) this.f4126p;
        Cursor cursor = (Cursor) obj;
        q3.b bVar = q.f88t;
        while (cursor.moveToNext()) {
            long j8 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j8));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j8), set);
            }
            set.add(new q.b(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    public final Object b() {
        int i10 = this.f4125o;
        Object obj = this.f4126p;
        switch (i10) {
            case 3:
                return Integer.valueOf(((a4.d) obj).k());
            case 4:
                ((m) obj).f9913i.d();
                return null;
            case 5:
                return ((a4.c) obj).b();
            default:
                o oVar = (o) obj;
                for (s a10 : oVar.f9923b.K()) {
                    oVar.f9924c.a(a10, 1);
                }
                return null;
        }
    }

    public final Object c(i iVar) {
        boolean z;
        int i10 = this.f4125o;
        Object obj = this.f4126p;
        switch (i10) {
            case 10:
                ((n0) obj).getClass();
                if (iVar.m()) {
                    a0 a0Var = (a0) iVar.i();
                    s6.a aVar = s6.a.f8805s;
                    aVar.t("Crashlytics report successfully enqueued to DataTransport: " + a0Var.c());
                    File b10 = a0Var.b();
                    if (b10.delete()) {
                        aVar.t("Deleted report file: " + b10.getPath());
                    } else {
                        aVar.M("Crashlytics could not delete report file: " + b10.getPath(), (Exception) null);
                    }
                    z = true;
                } else {
                    Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", iVar.h());
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                ExecutorService executorService = p0.f4263a;
                ((CountDownLatch) obj).countDown();
                return null;
        }
    }

    public final void d(v7.b bVar) {
        a7.b bVar2 = (a7.b) this.f4126p;
        bVar2.getClass();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", (Throwable) null);
        }
        bVar2.f114b.set((a7.a) bVar.get());
    }

    public final void f(i iVar) {
        l lVar = (l) this.f4126p;
        g.f(lVar, "$completed");
        g.f(iVar, "task");
        iVar.m();
        lVar.k(iVar);
    }

    public final void i(Bundle bundle) {
        ((z6.a) this.f4126p).f9931a.i(bundle);
    }
}

package d7;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import com.karumi.dexter.BuildConfig;
import f7.a0;
import f7.b0;
import f7.k;
import f7.m;
import f7.o;
import f7.p;
import i7.e;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import k7.d;
import m5.i;
import m5.l;
import m7.c;

public final class n implements Callable<i<Void>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f4248a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Throwable f4249b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Thread f4250c;
    public final /* synthetic */ d d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ t f4251e;

    public n(t tVar, long j8, Throwable th, Thread thread, d dVar) {
        this.f4251e = tVar;
        this.f4248a = j8;
        this.f4249b = th;
        this.f4250c = thread;
        this.d = dVar;
    }

    public final Object call() {
        String str;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        Boolean bool;
        String str2;
        Thread thread;
        boolean z;
        long j8 = this.f4248a;
        long j10 = j8 / 1000;
        t tVar = this.f4251e;
        i7.d dVar = tVar.f4280k.f4253b;
        dVar.getClass();
        NavigableSet descendingSet = new TreeSet(e.d(dVar.f6128b.f6131b.list())).descendingSet();
        if (!descendingSet.isEmpty()) {
            str = (String) descendingSet.first();
        } else {
            str = null;
        }
        if (str == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", (Throwable) null);
            return l.e((Object) null);
        }
        tVar.f4273c.b();
        n0 n0Var = tVar.f4280k;
        n0Var.getClass();
        String concat = "Persisting fatal event for session ".concat(str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, (Throwable) null);
        }
        z zVar = n0Var.f4252a;
        Context context = zVar.f4304a;
        int i10 = context.getResources().getConfiguration().orientation;
        Throwable th = this.f4249b;
        c cVar = zVar.d;
        o.c cVar2 = new o.c(th, cVar);
        k.a aVar = new k.a();
        aVar.f4820b = "crash";
        aVar.f4819a = Long.valueOf(j10);
        String str3 = zVar.f4306c.d;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                runningAppProcessInfo = it.next();
                if (runningAppProcessInfo.processName.equals(str3)) {
                    break;
                }
            }
        }
        runningAppProcessInfo = null;
        if (runningAppProcessInfo != null) {
            if (runningAppProcessInfo.importance != 100) {
                z = true;
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = null;
        }
        Integer valueOf = Integer.valueOf(i10);
        ArrayList arrayList = new ArrayList();
        String str4 = "FirebaseCrashlytics";
        Thread thread2 = this.f4250c;
        arrayList.add(z.e(thread2, (StackTraceElement[]) cVar2.f7537c, 4));
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry next = it2.next();
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it3 = it2;
            Thread thread3 = (Thread) next.getKey();
            if (!thread3.equals(thread2)) {
                thread = thread2;
                arrayList.add(z.e(thread3, cVar.h((StackTraceElement[]) next.getValue()), 0));
            } else {
                thread = thread2;
            }
            thread2 = thread;
            it2 = it3;
        }
        b0 b0Var = new b0(arrayList);
        o c10 = z.c(cVar2, 0);
        Long l = 0L;
        String str5 = BuildConfig.FLAVOR;
        if (l == null) {
            str2 = " address";
        } else {
            str2 = str5;
        }
        if (str2.isEmpty()) {
            long j11 = j8;
            m mVar = new m(b0Var, c10, (a0.a) null, new p("0", "0", l.longValue()), zVar.a());
            if (valueOf == null) {
                str5 = str5.concat(" uiOrientation");
            }
            if (str5.isEmpty()) {
                aVar.f4821c = new f7.l(mVar, (b0) null, (b0) null, bool, valueOf.intValue());
                aVar.d = zVar.b(i10);
                n0Var.f4253b.c(n0.a(aVar.a(), n0Var.d, n0Var.f4255e), str, true);
                try {
                    e eVar = tVar.f4275f;
                    String str6 = ".ae" + j11;
                    eVar.getClass();
                    if (new File(eVar.f6130a, str6).createNewFile()) {
                        d dVar2 = this.d;
                        tVar.c(false, dVar2);
                        t.a(tVar);
                        if (!tVar.f4272b.a()) {
                            return l.e((Object) null);
                        }
                        Executor executor = tVar.d.f4219a;
                        return ((k7.c) dVar2).f6719i.get().f7089a.n(executor, new m(this, executor));
                    }
                    throw new IOException("Create new file failed.");
                } catch (IOException e10) {
                    Log.w(str4, "Could not create app exception marker file.", e10);
                }
            } else {
                throw new IllegalStateException("Missing required properties:".concat(str5));
            }
        } else {
            throw new IllegalStateException("Missing required properties:".concat(str2));
        }
    }
}

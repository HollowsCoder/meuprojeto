package d7;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.f0;
import e7.b;
import f7.a0;
import f7.b0;
import f7.k;
import f7.l;
import f7.t;
import i7.d;
import i7.e;
import j7.a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import k7.c;
import m5.j;
import m5.r;
import t3.v;
import t3.x;
import z3.h;

public final class n0 {

    /* renamed from: a  reason: collision with root package name */
    public final z f4252a;

    /* renamed from: b  reason: collision with root package name */
    public final d f4253b;

    /* renamed from: c  reason: collision with root package name */
    public final a f4254c;
    public final b d;

    /* renamed from: e  reason: collision with root package name */
    public final f0 f4255e;

    public n0(z zVar, d dVar, a aVar, b bVar, f0 f0Var) {
        this.f4252a = zVar;
        this.f4253b = dVar;
        this.f4254c = aVar;
        this.d = bVar;
        this.f4255e = f0Var;
    }

    public static k a(k kVar, b bVar, f0 f0Var) {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        k.a aVar = new k.a(kVar);
        String b10 = bVar.f4496b.b();
        if (b10 != null) {
            aVar.f4822e = new t(b10);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", (Throwable) null);
        }
        k0 k0Var = (k0) f0Var.f1152q;
        synchronized (k0Var) {
            unmodifiableMap = Collections.unmodifiableMap(new HashMap(k0Var.f4242a));
        }
        ArrayList c10 = c(unmodifiableMap);
        k0 k0Var2 = (k0) f0Var.f1153r;
        synchronized (k0Var2) {
            unmodifiableMap2 = Collections.unmodifiableMap(new HashMap(k0Var2.f4242a));
        }
        ArrayList c11 = c(unmodifiableMap2);
        if (!c10.isEmpty()) {
            l.a f10 = kVar.f4817c.f();
            f10.f4828b = new b0<>(c10);
            f10.f4829c = new b0<>(c11);
            aVar.f4821c = f10.a();
        }
        return aVar.a();
    }

    public static n0 b(Context context, h0 h0Var, e eVar, a aVar, b bVar, f0 f0Var, m7.a aVar2, c cVar) {
        z zVar = new z(context, h0Var, aVar, aVar2);
        d dVar = new d(eVar, cVar);
        g7.a aVar3 = a.f6595b;
        x.b(context);
        return new n0(zVar, dVar, new a(x.a().c(new r3.a(a.f6596c, a.d)).a("FIREBASE_CRASHLYTICS_REPORT", new q3.b("json"), a.f6597e)), bVar, f0Var);
    }

    public static ArrayList c(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    arrayList.add(new f7.d(str, str2));
                } else {
                    throw new NullPointerException("Null value");
                }
            } else {
                throw new NullPointerException("Null key");
            }
        }
        Collections.sort(arrayList, new m0());
        return arrayList;
    }

    public final r d(Executor executor) {
        ArrayList b10 = this.f4253b.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = b10.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                g7.a aVar = d.f6124f;
                String d10 = d.d(file);
                aVar.getClass();
                arrayList.add(new b(g7.a.g(d10), file.getName(), file));
            } catch (IOException e10) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            a0 a0Var = (a0) it2.next();
            a aVar2 = this.f4254c;
            aVar2.getClass();
            a0 a10 = a0Var.a();
            j jVar = new j();
            ((v) aVar2.f6598a).a(new q3.a(a10, q3.d.HIGHEST), new h(3, jVar, a0Var));
            arrayList2.add(jVar.f7089a.e(executor, new d2.b(10, this)));
        }
        return m5.l.f(arrayList2);
    }
}

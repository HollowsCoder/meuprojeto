package e8;

import android.content.Context;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import f8.d;
import f8.h;
import f8.i;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import m5.l;
import s6.c;
import v7.b;
import w6.a;
import w7.e;

public final class k {

    /* renamed from: j  reason: collision with root package name */
    public static final Random f4532j = new Random();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f4533a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f4534b;

    /* renamed from: c  reason: collision with root package name */
    public final ExecutorService f4535c;
    public final c d;

    /* renamed from: e  reason: collision with root package name */
    public final e f4536e;

    /* renamed from: f  reason: collision with root package name */
    public final t6.c f4537f;

    /* renamed from: g  reason: collision with root package name */
    public final b<a> f4538g;

    /* renamed from: h  reason: collision with root package name */
    public final String f4539h;

    /* renamed from: i  reason: collision with root package name */
    public final HashMap f4540i;

    public k() {
        throw null;
    }

    public k(Context context, c cVar, e eVar, t6.c cVar2, b<a> bVar) {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.f4533a = new HashMap();
        this.f4540i = new HashMap();
        this.f4534b = context;
        this.f4535c = newCachedThreadPool;
        this.d = cVar;
        this.f4536e = eVar;
        this.f4537f = cVar2;
        this.f4538g = bVar;
        cVar.a();
        this.f4539h = cVar.f8817c.f8827b;
        l.c(newCachedThreadPool, new i(0, this));
    }

    public final synchronized c a(c cVar, e eVar, t6.c cVar2, ExecutorService executorService, d dVar, d dVar2, d dVar3, com.google.firebase.remoteconfig.internal.a aVar, h hVar, com.google.firebase.remoteconfig.internal.b bVar) {
        c cVar3;
        synchronized (this) {
            if (!this.f4533a.containsKey("firebase")) {
                Context context = this.f4534b;
                cVar.a();
                c cVar4 = new c(context, eVar, cVar.f8816b.equals("[DEFAULT]") ? cVar2 : null, executorService, dVar, dVar2, dVar3, aVar, hVar, bVar);
                dVar2.b();
                dVar3.b();
                dVar.b();
                this.f4533a.put("firebase", cVar4);
            }
            cVar3 = (c) this.f4533a.get("firebase");
        }
        return cVar3;
    }

    public final d b(String str) {
        i iVar;
        d dVar;
        String format = String.format("%s_%s_%s_%s.json", new Object[]{"frc", this.f4539h, "firebase", str});
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        Context context = this.f4534b;
        HashMap hashMap = i.f4923c;
        synchronized (i.class) {
            HashMap hashMap2 = i.f4923c;
            if (!hashMap2.containsKey(format)) {
                hashMap2.put(format, new i(context, format));
            }
            iVar = (i) hashMap2.get(format);
        }
        HashMap hashMap3 = d.d;
        synchronized (d.class) {
            String str2 = iVar.f4925b;
            HashMap hashMap4 = d.d;
            if (!hashMap4.containsKey(str2)) {
                hashMap4.put(str2, new d(newCachedThreadPool, iVar));
            }
            dVar = (d) hashMap4.get(str2);
        }
        return dVar;
    }

    public final c c() {
        m1.i iVar;
        c a10;
        synchronized (this) {
            d b10 = b("fetch");
            d b11 = b("activate");
            d b12 = b("defaults");
            com.google.firebase.remoteconfig.internal.b bVar = new com.google.firebase.remoteconfig.internal.b(this.f4534b.getSharedPreferences(String.format("%s_%s_%s_%s", new Object[]{"frc", this.f4539h, "firebase", "settings"}), 0));
            h hVar = new h(this.f4535c, b11, b12);
            c cVar = this.d;
            b<a> bVar2 = this.f4538g;
            cVar.a();
            if (cVar.f8816b.equals("[DEFAULT]")) {
                iVar = new m1.i((b) bVar2);
            } else {
                iVar = null;
            }
            if (iVar != null) {
                j jVar = new j(iVar);
                synchronized (hVar.f4920a) {
                    hVar.f4920a.add(jVar);
                }
            }
            a10 = a(this.d, this.f4536e, this.f4537f, this.f4535c, b10, b11, b12, d(b10, bVar), hVar, bVar);
        }
        return a10;
    }

    public final synchronized com.google.firebase.remoteconfig.internal.a d(d dVar, com.google.firebase.remoteconfig.internal.b bVar) {
        b<a> bVar2;
        com.google.firebase.remoteconfig.internal.a aVar;
        com.google.firebase.remoteconfig.internal.b bVar3 = bVar;
        synchronized (this) {
            e eVar = this.f4536e;
            c cVar = this.d;
            cVar.a();
            if (cVar.f8816b.equals("[DEFAULT]")) {
                bVar2 = this.f4538g;
            } else {
                bVar2 = null;
            }
            b<a> bVar4 = bVar2;
            ExecutorService executorService = this.f4535c;
            Random random = f4532j;
            c cVar2 = this.d;
            cVar2.a();
            String str = cVar2.f8817c.f8826a;
            c cVar3 = this.d;
            cVar3.a();
            d dVar2 = dVar;
            com.google.firebase.remoteconfig.internal.b bVar5 = bVar;
            aVar = new com.google.firebase.remoteconfig.internal.a(eVar, bVar4, executorService, random, dVar2, new ConfigFetchHttpClient(this.f4534b, cVar3.f8817c.f8827b, str, bVar3.f3743a.getLong("fetch_timeout_in_seconds", 60), bVar3.f3743a.getLong("fetch_timeout_in_seconds", 60)), bVar5, this.f4540i);
        }
        return aVar;
    }
}

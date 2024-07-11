package z3;

import a4.c;
import a4.d;
import a4.j;
import android.content.Context;
import b4.b;
import c4.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executor;
import t3.h;
import t3.p;
import t3.s;
import u3.e;
import u3.g;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9906a;

    /* renamed from: b  reason: collision with root package name */
    public final e f9907b;

    /* renamed from: c  reason: collision with root package name */
    public final d f9908c;
    public final q d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f9909e;

    /* renamed from: f  reason: collision with root package name */
    public final b f9910f;

    /* renamed from: g  reason: collision with root package name */
    public final a f9911g;

    /* renamed from: h  reason: collision with root package name */
    public final a f9912h;

    /* renamed from: i  reason: collision with root package name */
    public final c f9913i;

    public m(Context context, e eVar, d dVar, q qVar, Executor executor, b bVar, a aVar, a aVar2, c cVar) {
        this.f9906a = context;
        this.f9907b = eVar;
        this.f9908c = dVar;
        this.d = qVar;
        this.f9909e = executor;
        this.f9910f = bVar;
        this.f9911g = aVar;
        this.f9912h = aVar2;
        this.f9913i = cVar;
    }

    public final void a(s sVar, int i10) {
        u3.b bVar;
        int i11;
        boolean z;
        s sVar2 = sVar;
        u3.m a10 = this.f9907b.a(sVar.b());
        long j8 = 0;
        while (true) {
            boolean z10 = false;
            h hVar = new h(0, this, sVar2);
            b bVar2 = this.f9910f;
            if (((Boolean) bVar2.c(hVar)).booleanValue()) {
                Iterable<j> iterable = (Iterable) bVar2.c(new i(this, sVar2));
                if (iterable.iterator().hasNext()) {
                    if (a10 == null) {
                        androidx.databinding.a.m(sVar2, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                        bVar = new u3.b(g.a.FATAL_ERROR, -1);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (j a11 : iterable) {
                            arrayList.add(a11.a());
                        }
                        if (sVar.c() != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            c cVar = this.f9913i;
                            Objects.requireNonNull(cVar);
                            x3.a aVar = (x3.a) bVar2.c(new d2.b(5, cVar));
                            h.a aVar2 = new h.a();
                            aVar2.f8953f = new HashMap();
                            aVar2.d = Long.valueOf(this.f9911g.a());
                            aVar2.f8952e = Long.valueOf(this.f9912h.a());
                            aVar2.d("GDT_CLIENT_METRICS");
                            q3.b bVar3 = new q3.b("proto");
                            aVar.getClass();
                            r7.h hVar2 = p.f8972a;
                            hVar2.getClass();
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                hVar2.a(aVar, byteArrayOutputStream);
                            } catch (IOException unused) {
                            }
                            aVar2.c(new t3.m(bVar3, byteArrayOutputStream.toByteArray()));
                            arrayList.add(a10.a(aVar2.b()));
                        }
                        bVar = a10.b(new u3.a(arrayList, sVar.c()));
                    }
                    if (bVar.f9088a == g.a.TRANSIENT_ERROR) {
                        bVar2.c(new j(this, (Iterable) iterable, sVar, j8));
                        this.d.b(sVar2, i10 + 1, true);
                        return;
                    }
                    bVar2.c(new h(1, this, iterable));
                    g.a aVar3 = g.a.OK;
                    g.a aVar4 = bVar.f9088a;
                    if (aVar4 == aVar3) {
                        j8 = Math.max(j8, bVar.f9089b);
                        if (sVar.c() != null) {
                            z10 = true;
                        }
                        if (z10) {
                            bVar2.c(new d2.b(4, this));
                        }
                    } else if (aVar4 == g.a.INVALID_PAYLOAD) {
                        HashMap hashMap = new HashMap();
                        for (j a12 : iterable) {
                            String g10 = a12.a().g();
                            if (!hashMap.containsKey(g10)) {
                                i11 = 1;
                            } else {
                                i11 = Integer.valueOf(((Integer) hashMap.get(g10)).intValue() + 1);
                            }
                            hashMap.put(g10, i11);
                        }
                        bVar2.c(new k(this, hashMap));
                    }
                } else {
                    return;
                }
            } else {
                bVar2.c(new l(j8, this, sVar2));
                return;
            }
        }
    }
}

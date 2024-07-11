package s2;

import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import b8.e;
import com.google.android.gms.internal.clearcut.j;
import com.google.android.gms.internal.measurement.o;
import com.google.android.gms.internal.measurement.y;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import f9.a;
import h5.g3;
import h5.i3;
import h5.i4;
import h5.l3;
import h5.m6;
import h5.q3;
import h5.q6;
import h5.u2;
import h5.u3;
import h5.z6;
import i9.d0;
import java.lang.ref.ReferenceQueue;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import m5.d;
import n4.m;
import w9.i;
import y9.f;

public final class t implements j, y, i3, d, f {

    /* renamed from: o  reason: collision with root package name */
    public Object f8685o;

    /* renamed from: p  reason: collision with root package name */
    public final Object f8686p;

    public t(int i10, int i11) {
        if (i10 != 3) {
            this.f8685o = new HashMap();
            this.f8686p = new HashMap();
            return;
        }
        this.f8685o = new ConcurrentHashMap(16, 0.75f, 10);
        this.f8686p = new ReferenceQueue();
    }

    public /* synthetic */ t(q6 q6Var) {
        this.f8686p = q6Var;
    }

    public /* synthetic */ t(z6 z6Var, String str) {
        this.f8686p = z6Var;
        this.f8685o = str;
    }

    public final Object a(Object obj) {
        Charset charset;
        d0 d0Var = (d0) obj;
        Gson gson = (Gson) this.f8685o;
        d0.a aVar = d0Var.f6229o;
        if (aVar == null) {
            i c10 = d0Var.c();
            i9.t b10 = d0Var.b();
            if (b10 == null || (charset = b10.a(a.f4927b)) == null) {
                charset = a.f4927b;
            }
            aVar = new d0.a(c10, charset);
            d0Var.f6229o = aVar;
        }
        JsonReader newJsonReader = gson.newJsonReader(aVar);
        try {
            Object read = ((TypeAdapter) this.f8686p).read(newJsonReader);
            if (newJsonReader.peek() == JsonToken.END_DOCUMENT) {
                return read;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            d0Var.close();
        }
    }

    /* JADX INFO: finally extract failed */
    public final void b(String str, int i10, Throwable th, byte[] bArr, Map map) {
        h5.i iVar;
        z6 z6Var = (z6) this.f8686p;
        z6Var.f().g();
        z6Var.K();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (SQLiteException e10) {
                z6Var.e().f5397t.b(e10, "Database error while trying to delete uploaded bundles");
                ((r4.d) z6Var.c()).getClass();
                z6Var.B = SystemClock.elapsedRealtime();
                z6Var.e().B.b(Long.valueOf(z6Var.B), "Disable upload, time");
            } catch (Throwable th2) {
                z6Var.G = false;
                z6Var.A();
                throw th2;
            }
        }
        ArrayList arrayList = z6Var.K;
        m.h(arrayList);
        z6Var.K = null;
        if (i10 != 200) {
            if (i10 == 204) {
                i10 = 204;
            }
            z6Var.e().B.c(Integer.valueOf(i10), th, "Network upload failed. Will retry later. code, error");
            q3 q3Var = z6Var.w.f5415x;
            ((r4.d) z6Var.c()).getClass();
            q3Var.b(System.currentTimeMillis());
            if (i10 == 503 || i10 == 429) {
                q3 q3Var2 = z6Var.w.f5414v;
                ((r4.d) z6Var.c()).getClass();
                q3Var2.b(System.currentTimeMillis());
            }
            h5.i iVar2 = z6Var.f5850q;
            z6.E(iVar2);
            iVar2.l(arrayList);
            z6Var.z();
            z6Var.G = false;
            z6Var.A();
        }
        if (th == null) {
            q3 q3Var3 = z6Var.w.w;
            ((r4.d) z6Var.c()).getClass();
            q3Var3.b(System.currentTimeMillis());
            z6Var.w.f5415x.b(0);
            z6Var.z();
            z6Var.e().B.c(Integer.valueOf(i10), Integer.valueOf(bArr.length), "Successful upload. Got network response. code, size");
            h5.i iVar3 = z6Var.f5850q;
            z6.E(iVar3);
            iVar3.v();
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Long l = (Long) it.next();
                    try {
                        iVar = z6Var.f5850q;
                        z6.E(iVar);
                        long longValue = l.longValue();
                        iVar.g();
                        iVar.h();
                        if (iVar.y().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                            throw new SQLiteException("Deleted fewer rows from queue than expected");
                        }
                    } catch (SQLiteException e11) {
                        g3 g3Var = iVar.f5649o.w;
                        i4.n(g3Var);
                        g3Var.f5397t.b(e11, "Failed to delete a bundle in a queue table");
                        throw e11;
                    } catch (SQLiteException e12) {
                        ArrayList arrayList2 = z6Var.L;
                        if (arrayList2 == null || !arrayList2.contains(l)) {
                            throw e12;
                        }
                    }
                }
                h5.i iVar4 = z6Var.f5850q;
                z6.E(iVar4);
                iVar4.w();
                h5.i iVar5 = z6Var.f5850q;
                z6.E(iVar5);
                iVar5.x();
                z6Var.L = null;
                l3 l3Var = z6Var.f5849p;
                z6.E(l3Var);
                if (!l3Var.k() || !z6Var.y()) {
                    z6Var.M = -1;
                    z6Var.z();
                } else {
                    z6Var.g();
                }
                z6Var.B = 0;
                z6Var.G = false;
                z6Var.A();
            } catch (Throwable th3) {
                h5.i iVar6 = z6Var.f5850q;
                z6.E(iVar6);
                iVar6.x();
                throw th3;
            }
        }
        z6Var.e().B.c(Integer.valueOf(i10), th, "Network upload failed. Will retry later. code, error");
        q3 q3Var4 = z6Var.w.f5415x;
        ((r4.d) z6Var.c()).getClass();
        q3Var4.b(System.currentTimeMillis());
        q3 q3Var22 = z6Var.w.f5414v;
        ((r4.d) z6Var.c()).getClass();
        q3Var22.b(System.currentTimeMillis());
        h5.i iVar22 = z6Var.f5850q;
        z6.E(iVar22);
        iVar22.l(arrayList);
        z6Var.z();
        z6Var.G = false;
        z6Var.A();
    }

    public final void c() {
        q6 q6Var = (q6) this.f8686p;
        q6Var.g();
        m6 m6Var = (m6) this.f8685o;
        if (m6Var != null) {
            q6Var.f5655q.removeCallbacks(m6Var);
        }
        if (q6Var.f5649o.u.m((String) null, u2.f5738q0)) {
            u3 u3Var = q6Var.f5649o.f5458v;
            i4.l(u3Var);
            u3Var.E.b(false);
        }
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f8685o
            com.google.android.gms.internal.clearcut.e r0 = (com.google.android.gms.internal.clearcut.e) r0
            java.lang.Object r1 = r4.f8686p
            com.google.android.gms.internal.clearcut.b r1 = (com.google.android.gms.internal.clearcut.b) r1
            r1.getClass()
            java.lang.String r2 = "gms:phenotype:phenotype_flag:debug_disable_caching"
            boolean r3 = com.google.android.gms.internal.clearcut.e.g()
            if (r3 == 0) goto L_0x0023
            com.google.android.gms.internal.clearcut.f r3 = new com.google.android.gms.internal.clearcut.f
            r3.<init>(r2)
            java.lang.Object r2 = com.google.android.gms.internal.clearcut.e.c(r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            goto L_0x0024
        L_0x0023:
            r2 = 0
        L_0x0024:
            if (r2 == 0) goto L_0x002b
            java.util.HashMap r2 = r1.a()
            goto L_0x002d
        L_0x002b:
            java.util.HashMap r2 = r1.f2385e
        L_0x002d:
            if (r2 != 0) goto L_0x0041
            java.lang.Object r3 = r1.d
            monitor-enter(r3)
            java.util.HashMap r2 = r1.f2385e     // Catch:{ all -> 0x003e }
            if (r2 != 0) goto L_0x003c
            java.util.HashMap r2 = r1.a()     // Catch:{ all -> 0x003e }
            r1.f2385e = r2     // Catch:{ all -> 0x003e }
        L_0x003c:
            monitor-exit(r3)     // Catch:{ all -> 0x003e }
            goto L_0x0041
        L_0x003e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003e }
            throw r0
        L_0x0041:
            if (r2 == 0) goto L_0x0044
            goto L_0x0048
        L_0x0044:
            java.util.Map r2 = java.util.Collections.emptyMap()
        L_0x0048:
            java.lang.String r0 = r0.f2406b
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.t.e():java.lang.Object");
    }

    public final void f(m5.i iVar) {
        ((e) this.f8685o).a((Intent) this.f8686p);
    }

    public final com.google.android.gms.internal.measurement.i3 g(o oVar) {
        com.google.android.gms.internal.measurement.i3 c10 = ((com.google.android.gms.internal.measurement.i3) this.f8685o).c();
        String str = (String) this.f8686p;
        c10.f(str, oVar);
        c10.d.put(str, Boolean.TRUE);
        return c10;
    }

    public /* synthetic */ t(Object obj, Object obj2) {
        this.f8685o = obj;
        this.f8686p = obj2;
    }
}

package z3;

import a4.q;
import android.database.sqlite.SQLiteDatabase;
import b4.b;
import d7.a0;
import g7.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Set;
import m5.j;
import t3.h;
import t3.s;

public final /* synthetic */ class h implements b.a, q.a, q3.h {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f9892o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f9893p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Object f9894q;

    public /* synthetic */ h(int i10, Object obj, Object obj2) {
        this.f9892o = i10;
        this.f9893p = obj;
        this.f9894q = obj2;
    }

    public final void a(Exception exc) {
        j jVar = (j) this.f9893p;
        a0 a0Var = (a0) this.f9894q;
        a aVar = j7.a.f6595b;
        if (exc != null) {
            jVar.b(exc);
        } else {
            jVar.c(a0Var);
        }
    }

    public final Object apply(Object obj) {
        q qVar = (q) this.f9893p;
        s sVar = (s) this.f9894q;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        q3.b bVar = q.f88t;
        qVar.getClass();
        ArrayList arrayList = new ArrayList();
        Long g10 = q.g(sQLiteDatabase, sVar);
        if (g10 != null) {
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            q.o(sQLiteDatabase2.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{g10.toString()}, (String) null, (String) null, (String) null, String.valueOf(qVar.f92r.c())), new y3.b(qVar, arrayList, sVar));
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            sb.append(((a4.j) arrayList.get(i10)).b());
            if (i10 < arrayList.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        q.o(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), (String[]) null, (String) null, (String) null, (String) null), new d2.b(7, hashMap));
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            a4.j jVar = (a4.j) listIterator.next();
            if (hashMap.containsKey(Long.valueOf(jVar.b()))) {
                h.a i11 = jVar.a().i();
                for (q.b bVar2 : (Set) hashMap.get(Long.valueOf(jVar.b()))) {
                    i11.a(bVar2.f94a, bVar2.f95b);
                }
                listIterator.set(new a4.b(jVar.b(), jVar.c(), i11.b()));
            }
        }
        return arrayList;
    }

    public final Object b() {
        int i10 = this.f9892o;
        Object obj = this.f9894q;
        Object obj2 = this.f9893p;
        switch (i10) {
            case 0:
                return Boolean.valueOf(((m) obj2).f9908c.Q((s) obj));
            default:
                ((m) obj2).f9908c.m((Iterable) obj);
                return null;
        }
    }
}

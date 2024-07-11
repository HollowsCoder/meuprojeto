package a4;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import b4.b;
import d2.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import t3.n;
import t3.s;
import t3.u;
import x3.a;
import x3.c;
import z3.h;
import z3.k;
import z3.l;

public final class q implements d, b4.b, c {

    /* renamed from: t  reason: collision with root package name */
    public static final q3.b f88t = new q3.b("proto");

    /* renamed from: o  reason: collision with root package name */
    public final v f89o;

    /* renamed from: p  reason: collision with root package name */
    public final c4.a f90p;

    /* renamed from: q  reason: collision with root package name */
    public final c4.a f91q;

    /* renamed from: r  reason: collision with root package name */
    public final e f92r;

    /* renamed from: s  reason: collision with root package name */
    public final v3.a<String> f93s;

    public interface a<T, U> {
        U apply(T t10);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f94a;

        /* renamed from: b  reason: collision with root package name */
        public final String f95b;

        public b(String str, String str2) {
            this.f94a = str;
            this.f95b = str2;
        }
    }

    public q(c4.a aVar, c4.a aVar2, e eVar, v vVar, v3.a<String> aVar3) {
        this.f89o = vVar;
        this.f90p = aVar;
        this.f91q = aVar2;
        this.f92r = eVar;
        this.f93s = aVar3;
    }

    public static Long g(SQLiteDatabase sQLiteDatabase, s sVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{sVar.b(), String.valueOf(d4.a.a(sVar.d()))}));
        if (sVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(sVar.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) o(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null), new u(1));
    }

    public static String n(Iterable<j> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<j> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().b());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static <T> T o(Cursor cursor, a<Cursor, T> aVar) {
        try {
            return aVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final Iterable<s> K() {
        return (Iterable) j(new c(2));
    }

    public final Iterable<j> L(s sVar) {
        return (Iterable) j(new h(2, this, sVar));
    }

    public final boolean Q(s sVar) {
        return ((Boolean) j(new k(this, sVar))).booleanValue();
    }

    public final void W(Iterable<j> iterable) {
        if (iterable.iterator().hasNext()) {
            j(new o(this, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + n(iterable), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
        }
    }

    public final void a(long j8, c.a aVar, String str) {
        j(new l(j8, str, aVar));
    }

    public final void a0(long j8, s sVar) {
        j(new m(j8, sVar));
    }

    public final x3.a b() {
        int i10 = x3.a.f9466e;
        a.C0161a aVar = new a.C0161a();
        HashMap hashMap = new HashMap();
        SQLiteDatabase f10 = f();
        f10.beginTransaction();
        try {
            x3.a aVar2 = (x3.a) o(f10.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new k(this, hashMap, aVar, 1));
            f10.setTransactionSuccessful();
            return aVar2;
        } finally {
            f10.endTransaction();
        }
    }

    public final long b0(s sVar) {
        return ((Long) o(f().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{sVar.b(), String.valueOf(d4.a.a(sVar.d()))}), new d2.c(3))).longValue();
    }

    public final <T> T c(b.a<T> aVar) {
        SQLiteDatabase f10 = f();
        l(new e2.a(3, f10), new r3.b(2));
        try {
            T b10 = aVar.b();
            f10.setTransactionSuccessful();
            return b10;
        } finally {
            f10.endTransaction();
        }
    }

    public final void close() {
        this.f89o.close();
    }

    public final void d() {
        j(new n(this, 0));
    }

    public final SQLiteDatabase f() {
        v vVar = this.f89o;
        Objects.requireNonNull(vVar);
        return (SQLiteDatabase) l(new e2.a(2, vVar), new r3.b(1));
    }

    public final b i(s sVar, n nVar) {
        Log.d(androidx.databinding.a.o("SQLiteEventStore"), String.format("Storing event with priority=%s, name=%s for destination %s", new Object[]{sVar.d(), nVar.g(), sVar.b()}));
        long longValue = ((Long) j(new k(this, nVar, sVar, 0))).longValue();
        if (longValue < 1) {
            return null;
        }
        return new b(longValue, sVar, nVar);
    }

    public final <T> T j(a<SQLiteDatabase, T> aVar) {
        SQLiteDatabase f10 = f();
        f10.beginTransaction();
        try {
            T apply = aVar.apply(f10);
            f10.setTransactionSuccessful();
            return apply;
        } finally {
            f10.endTransaction();
        }
    }

    public final int k() {
        return ((Integer) j(new l(this, this.f90p.a() - this.f92r.b()))).intValue();
    }

    public final Object l(e2.a aVar, r3.b bVar) {
        c4.a aVar2 = this.f91q;
        long a10 = aVar2.a();
        while (true) {
            try {
                int i10 = aVar.f4457o;
                Object obj = aVar.f4458p;
                switch (i10) {
                    case 2:
                        return ((v) obj).getWritableDatabase();
                    default:
                        ((SQLiteDatabase) obj).beginTransaction();
                        return null;
                }
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar2.a() >= ((long) this.f92r.a()) + a10) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50);
            }
        }
    }

    public final void m(Iterable<j> iterable) {
        if (iterable.iterator().hasNext()) {
            f().compileStatement("DELETE FROM events WHERE _id in " + n(iterable)).execute();
        }
    }
}

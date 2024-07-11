package z3;

import a4.q;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import b4.b;
import java.util.Map;
import t3.s;
import x3.c;

public final /* synthetic */ class k implements b.a, q.a {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Object f9901o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f9902p;

    public /* synthetic */ k(Object obj, Object obj2) {
        this.f9901o = obj;
        this.f9902p = obj2;
    }

    /* JADX INFO: finally extract failed */
    public final Object apply(Object obj) {
        q qVar = (q) this.f9901o;
        q3.b bVar = q.f88t;
        qVar.getClass();
        Long g10 = q.g((SQLiteDatabase) obj, (s) this.f9902p);
        if (g10 == null) {
            return Boolean.FALSE;
        }
        Cursor rawQuery = qVar.f().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{g10.toString()});
        try {
            Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
            rawQuery.close();
            return valueOf;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    public final Object b() {
        m mVar = (m) this.f9901o;
        mVar.getClass();
        for (Map.Entry entry : ((Map) this.f9902p).entrySet()) {
            mVar.f9913i.a((long) ((Integer) entry.getValue()).intValue(), c.a.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }
}
